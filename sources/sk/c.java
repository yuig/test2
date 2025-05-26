package sk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f113043a;

    static {
        byte[] bArr = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        Arrays.fill(bArr, (byte) -1);
        for (int i13 = 0; i13 < 10; i13++) {
            bArr[i13 + 48] = (byte) i13;
        }
        for (int i14 = 0; i14 < 26; i14++) {
            byte b13 = (byte) (i14 + 10);
            bArr[i14 + 65] = b13;
            bArr[i14 + 97] = b13;
        }
        f113043a = bArr;
    }

    public static int a(char c13) {
        if (c13 < 128) {
            return f113043a[c13];
        }
        return -1;
    }
}
