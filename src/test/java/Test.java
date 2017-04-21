import com.llhao.baobao.dao.IUserDao;
import com.llhao.baobao.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by llhao on 2017/4/13.
 */
public class Test {
    @org.junit.Test
    public void test() throws IOException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(Test.class.getResourceAsStream("mybatis.xml"));
        SqlSession session = factory.openSession();
        User user = session.selectOne("com.llhao.baobao.dao.IUserDao.findUserById",1);
        System.out.println(user);

        IUserDao dao = session.getMapper(IUserDao.class);
        user = dao.findUserById(1);
        System.out.println(user);
    }
}
