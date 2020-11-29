package hotel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author Aiyuan
 * @Create 2020-10-26-10:44
 */
public class SearchTest {
    MainRun mr=new MainRun();
    Search search=new Search();
    InHotel ih=new InHotel();
    @Test
    public void search_home_is_Empty(){
        mr.iniRooms();
        assertEquals("该房间为空",search.status(808));
    }
    @Test
    public void search_home_is_Tom(){
        mr.iniRooms();
        ih.in(101,"Tom");
        assertEquals("该房间已经有人入住：Tom",search.status(101));
    }
}
