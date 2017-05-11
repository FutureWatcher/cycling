package bike.cycling.controller;

import bike.cycling.dto.ResBoolean;
import bike.cycling.dto.ResString;
import bike.cycling.dto.UserLogin;
import bike.cycling.dto.UserRegisterInfo;
import bike.cycling.imp.AccountService;
import bike.cycling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.UUID;

/**
 * Created by MrH on 2017/5/6.
 */
@Controller
@RequestMapping(value = "/account")
public class AccountController {

    private UserService accountService;


    @Autowired
    public void setAccountService(UserService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public
    @ResponseBody
    ResBoolean login(@RequestBody UserLogin userLogin) {
        if (accountService.login(userLogin.getLoginName(), userLogin.getPassword()))
            return new ResBoolean(true);
        return new ResBoolean(false);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public
    @ResponseBody
    ResBoolean register(@RequestBody UserRegisterInfo userRegisterInfo) {
        accountService.register(userRegisterInfo);
        return new ResBoolean(true);
    }

    @RequestMapping(value = "/upportrait")
    public @ResponseBody ResString upPortrait(@RequestParam(value = "file" , required = false) MultipartFile file, HttpServletRequest request) {

        String relativePath = "upload/user/portrait";
        String defaultPath ="";
        String path = request.getSession().getServletContext().getRealPath(relativePath);
        String fileName = UUID.randomUUID().toString() + ".jpeg";
        System.out.println(path);
        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResString(defaultPath);
        }
        return new ResString(relativePath+"/"+fileName);
    }


}
