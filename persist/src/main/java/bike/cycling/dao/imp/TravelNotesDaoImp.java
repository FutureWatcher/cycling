package bike.cycling.dao.imp;

import bike.cycling.dao.service.TravelNotesDao;
import bike.cycling.model.TravelNotes;
import org.springframework.stereotype.Repository;

/**
 * Created by MrH on 2017/4/25.
 */
@Repository
public class TravelNotesDaoImp extends GenericDaoImp<TravelNotes,Long> implements TravelNotesDao{
    public TravelNotesDaoImp() {
        super(TravelNotes.class);
    }
}
