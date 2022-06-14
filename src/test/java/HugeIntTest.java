
    import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


    public class HugeIntTest {

        private HugeInt hugeInt;

        @BeforeEach
        public void setUp() {
            hugeInt = new HugeInt(40);
        }

        @Test
        public void hugeIntegerExistTest() {
            assertNotNull(hugeInt);
        }

        @Test
        public void hugeIntegerCanParseTest() {
            hugeInt.parse("8674839209849376834945678987654321234567");
            int[] result = hugeInt.getArrayElements();
            assertEquals(8, result[0]);
            assertEquals(6, result[1]);
            assertEquals(7, result[2]);
            assertEquals(4, result[3]);
            assertEquals(5, result[37]);
            assertEquals(6, result[38]);
            assertEquals(7, result[39]);
            assertEquals(40, hugeInt.getSize());
        }

        @Test
        public void hugeIntegerCanBeConvertedToStringTest() {
            hugeInt.parse("8674839209849376834945678987654321234567");
            int[] result = hugeInt.getArrayElements();
            assertEquals(6, result[1]);
            assertEquals(0, result[8]);
            assertEquals(8, result[10]);
            assertEquals(3, result[13]);
            assertEquals(7, result[14]);
            assertEquals(6, result[15]);
            assertEquals(7, result[39]);
            assertEquals("8674839209849376834945678987654321234567", hugeInt.toString());
        }

        @Test
        public void twoObjectsOfHugeIntegerCanBeAddedTest() {
            HugeInt hugeInt1 = new HugeInt(40);
            hugeInt1.parse("3674340000000000000000000000000000000000");
            HugeInt hugeInt2 = new HugeInt(40);
            hugeInt2.parse("1234500000000000000000000000000000000000");
            String result = HugeInt.add(hugeInt1, hugeInt2);
            assertEquals("4908840000000000000000000000000000000000", result);
        }

        @Test
        public void twoObjectsOfHugeIntegerCanBeSubtractedTest() {
            HugeInt hugeInt1 = new HugeInt(40);
            hugeInt1.parse("31111");
            HugeInt hugeInt2 = new HugeInt(40);
            hugeInt2.parse("1234");
            String result = HugeInt.subtract(hugeInt1, hugeInt2);
            assertEquals("1877100000000000000000000000000000000000", result);
        }

        @Test
        public void twoObjectsOfHugeIntegersAreEqualTest() {
            HugeInt hugeInt1 = new HugeInt(40);
            hugeInt1.parse("3111112345609876543210000000000000000021");
            HugeInt hugeInt2 = new HugeInt(40);
            hugeInt2.parse("3111112345609876543210000000000000000021");
            assertTrue(hugeInt1.isEqualTo(hugeInt2));
        }

        @Test
        public void twoObjectsOfHugeIntegersAreNotEqualTest() {
            HugeInt hugeInt1 = new HugeInt(40);
            hugeInt1.parse("3111112345609876534567000000000000000044");
            HugeInt hugeInt2 = new HugeInt(40);
            hugeInt2.parse("3111112345609876543709810000000000000071");
            assertTrue(hugeInt1.isNotEqualTo(hugeInt2));
        }

        @Test
        public void oneObjectOfHugeIntegerIsGreaterThanTheOtherTest() {
            HugeInt hugeInt1 = new HugeInt(25);
            hugeInt.parse("1829364738294338290364782");
            HugeInt hugeInt2 = new HugeInt(36);
            hugeInt2.parse("311111234560987654370981000000000000");
            assertTrue(hugeInt2.isGreaterThan(hugeInt1));
        }

        @Test
        public void oneObjectOfHugeIntegerIsLessThanTheOtherTest() {
            HugeInt hugeInt1 = new HugeInt(21);
            hugeInt1.parse("143792759087543985746");
            HugeInt hugeInt2 = new HugeInt(38);
            hugeInt2.parse("21345675463891827364532819847362512192");
            assertTrue(hugeInt1.isLessThan(hugeInt2));
        }

        @Test
        public void oneObjectOfHugeIntegerIsGreaterThanOrEqualToTheOtherTest() {
            HugeInt hugeInt1 = new HugeInt(25);
            hugeInt1.parse("4560983897537898654609765");
            HugeInt hugeInt2 = new HugeInt(36);
            hugeInt2.parse("311111234560987654370981000000000001");
            assertTrue(hugeInt2.isGreaterThanOrEqualTo(hugeInt1));
        }

        @Test
        public void oneObjectOfHugeIntegerIsLessThanOrEqualToTheOtherTest() {
            HugeInt hugeInt1 = new HugeInt(25);
            hugeInt1.parse("4560983897537898654609765");
            HugeInt hugeInt2 = new HugeInt(36);
            hugeInt2.parse("311111234560987654370981000000000001");
            assertTrue(hugeInt1.isLessThanOrEqualTo(hugeInt2));
        }
    }

