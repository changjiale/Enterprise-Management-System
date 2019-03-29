package ssm.dao;

import org.apache.ibatis.annotations.Select;
import ssm.domain.Member;

public interface IMemberDao {

    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
