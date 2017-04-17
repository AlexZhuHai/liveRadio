package liveDemo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import liveDemo.dao.UserRedisDao;
import liveDemo.model.UserRedis;
@Service
public class UserService {

	@Autowired
	UserRedisDao userRedisDao;
	
	public List<UserRedis> getAll() {  
		List<UserRedis> users = userRedisDao.getAll();
        return users;
    }  
	
	public void save(UserRedis user) {  
		userRedisDao.put(user.getName(), user, -1);
    }  
	
	public boolean isUser(UserRedis user) {  
		boolean isUser = true;
		UserRedis realUser = userRedisDao.get(user.getName());
		if(realUser == null){
			isUser = false;
		}else{
			if(!realUser.getPassword().equals(user.getPassword())){
				isUser = false;
			}
		}
		return isUser;
    }  
}
