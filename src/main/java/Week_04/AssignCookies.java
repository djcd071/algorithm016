package Week_04;
import java.util.Arrays;
/**
 * @author djcd
 * @version V1.0
 * @ClassName：AssignCookies
 * @Description：TODO
 * @date 2020/10/12 0:10
 */
public class AssignCookies {

		public int findContentChildren(int[] g, int[] s) {
			Arrays.sort(g);
			Arrays.sort(s);

			int gI = 0;
			int sI = 0;

			int gratifyCount = 0;

			while (gI < g.length && sI < s.length) {
				if (g[gI]  <= s[sI]) {
					gratifyCount ++;
					gI++;
					sI++;
				} else {
					sI++;
				}
			}

			return gratifyCount;
		}
}
