package bike.cycling.dao.imp;

import bike.cycling.dao.service.TravelNotesDao;

/**
 * Created by MrH on 2017/4/25.
 */
public class TravelNotesDaoImp extends GenericDaoImp implements TravelNotesDao{
    public TravelNotesDaoImp(Class entityClass) {
        super(entityClass);
    }
}
