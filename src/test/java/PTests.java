import com.sdabyd2.programowanie.PTestimpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class PTests {

    @Test
    public void shouldFindLastElementFromList()throws Exception{

        assertThat(PTestimpl.last(asList("a","b","c","d")),is(equalTo("d")));
    }

    @Test
    public void shouldFindLastOfNonEmptyList()throws Exception{
        assertThat(PTestimpl.length(asList(1,2,3,4,5)),is(equalTo(5)));
    }

    @Test
    public void shouldReverseAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(PTestimpl.reverse(numbers), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }

    @Test
    public void shouldReturnTrueWhenListIsPalindrome() throws Exception {
        assertTrue(PTestimpl.isPalindrome(Arrays.asList("x", "a", "m", "a", "x")));
    }

    @Test
    public void shouldRemoveKthElementFromList() throws Exception {
        Object[] result = PTestimpl.removeAt(Arrays.asList("a", "b", "c", "d"), 2);
        assertThat(result[0], equalTo(Arrays.asList("a", "c", "d")));
        assertThat(result[1], equalTo("b"));
    }

    @Test
    public void shouldReturnAListOfThreeRandomSelectedElements() throws Exception {
        List<String> result = PTestimpl.randomSelect(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"), 3);
        System.out.println(result);
        assertThat(result, hasSize(3));
    }

}
