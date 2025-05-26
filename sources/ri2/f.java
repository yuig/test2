package ri2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f108406a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean[] f108407b;

    static {
        char[] cArr = new char[BitmapUtils.BITMAP_TO_JPEG_SIZE];
        for (int i13 = 0; i13 < 256; i13++) {
            cArr[i13] = "0123456789abcdef".charAt(i13 >>> 4);
            cArr[i13 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER] = "0123456789abcdef".charAt(i13 & 15);
        }
        f108406a = cArr;
        byte[] bArr = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        Arrays.fill(bArr, (byte) -1);
        for (int i14 = 0; i14 < 16; i14++) {
            bArr["0123456789abcdef".charAt(i14)] = (byte) i14;
        }
        boolean[] zArr = new boolean[65535];
        int i15 = 0;
        while (i15 < 65535) {
            zArr[i15] = (48 <= i15 && i15 <= 57) || (97 <= i15 && i15 <= 102);
            i15++;
        }
        f108407b = zArr;
    }

    public static void a(byte b13, char[] cArr, int i13) {
        int i14 = b13 & 255;
        char[] cArr2 = f108406a;
        cArr[i13] = cArr2[i14];
        cArr[i13 + 1] = cArr2[i14 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
    }

    public static void b(long j13, char[] cArr, int i13) {
        a((byte) ((j13 >> 56) & 255), cArr, i13);
        a((byte) ((j13 >> 48) & 255), cArr, i13 + 2);
        a((byte) ((j13 >> 40) & 255), cArr, i13 + 4);
        a((byte) ((j13 >> 32) & 255), cArr, i13 + 6);
        a((byte) ((j13 >> 24) & 255), cArr, i13 + 8);
        a((byte) ((j13 >> 16) & 255), cArr, i13 + 10);
        a((byte) ((j13 >> 8) & 255), cArr, i13 + 12);
        a((byte) (j13 & 255), cArr, i13 + 14);
    }
}
