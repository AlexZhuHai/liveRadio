package liveDemo.dao;

import org.springframework.stereotype.Repository;
import liveDemo.model.LiveRedis;

@Repository
public class LiveRedisDao extends IRedisDao<LiveRedis>{
	private static final String REDIS_KEY = "liveDemo.model.LiveRedis";
	
	@SuppressWarnings("static-access")
	@Override
	protected String getRedisKey() {
		return this.REDIS_KEY;
	}

}
