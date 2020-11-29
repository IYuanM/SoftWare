package hotel;

import JMOCK_test.IDATA.IData;
import org.easymock.EasyMock;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * @Author Aiyuan
 * @Create 2020-10-18-20:21
 */
public class ListHomeTest {
    public String[][] a=new String[1][2];
    ByteArrayOutputStream content = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(content);
//    private Mockery context=new Mockery();
//    private IData iData=null;
    private ListHome list=null;
    IData iData= EasyMock.createMock(IData.class);
//
//    @Before
//    public void setUp() throws Exception {
//        iData =context.mock(IData.class);
//        list=new ListHome(iData);
//        context.checking(new Expectations(){
//            {
//                oneOf(iData).getRooms();
//                will(re);
//            }
//        });
//    }
    @Before
    public void setUp() throws Exception{
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = "EMPTY";
            }
        }
        EasyMock.expect(iData.getRooms()).andReturn(a).anyTimes();
        //将mock对象切换到replay状态。
        EasyMock.replay(iData);
        EasyMock.verify(iData);
        list=new ListHome(iData);
        System.setOut(new PrintStream(content));
        list.search();
    }
    @Test
    public void testSearch() {
        assertEquals("101\t102\t\nEMPTY\tEMPTY\t\n", content.toString());
    }

}