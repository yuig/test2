package cp2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Random;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Random f53012a = new Random();

    public static String a(int i13) {
        Random random = f53012a;
        if (i13 == 0) {
            return "";
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested random string length ", i13, " is less than 0."));
        }
        char[] cArr = new char[i13];
        while (true) {
            int i14 = i13 - 1;
            if (i13 == 0) {
                return new String(cArr);
            }
            char nextInt = (char) (random.nextInt(91) + 32);
            if (Character.isLetter(nextInt) || Character.isDigit(nextInt)) {
                if (nextInt < 56320 || nextInt > 57343) {
                    if (nextInt < 55296 || nextInt > 56191) {
                        if (nextInt < 56192 || nextInt > 56319) {
                            cArr[i14] = nextInt;
                            i13 = i14;
                        }
                    } else if (i14 != 0) {
                        cArr[i14] = (char) (random.nextInt(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) + 56320);
                        i13 -= 2;
                        cArr[i13] = nextInt;
                    }
                } else if (i14 != 0) {
                    cArr[i14] = nextInt;
                    i13 -= 2;
                    cArr[i13] = (char) (random.nextInt(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) + 55296);
                }
            }
        }
    }
}
