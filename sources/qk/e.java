package qk;

import com.bugsnag.android.d2;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f104043a = 0;

    static {
        new d2(1);
    }

    public static byte[] a(ArrayDeque arrayDeque, int i13) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i13) {
            return bArr;
        }
        int length = i13 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i13);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i13 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, Integer.highestOneBit(0) * 2));
        int i13 = 0;
        while (i13 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i13);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i14 = 0;
            while (i14 < min2) {
                int read = inputStream.read(bArr, i14, min2 - i14);
                if (read == -1) {
                    return a(arrayDeque, i13);
                }
                i14 += read;
                i13 += read;
            }
            min = d7.b.r0(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
