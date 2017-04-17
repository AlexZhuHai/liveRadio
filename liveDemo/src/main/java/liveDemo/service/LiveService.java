package liveDemo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import liveDemo.dao.LiveRedisDao;
import liveDemo.model.LiveRedis;

@Service
public class LiveService {

	@Autowired
	LiveRedisDao liveRedisDao;
	
	public List<LiveRedis> getAll() {  
		List<LiveRedis> users = liveRedisDao.getAll();
        return users;
    }  
	
	public void save(LiveRedis live) {  
		liveRedisDao.put(live.getKeyname(), live, -1);
    }  
}
