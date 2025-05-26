package wk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f130077a = e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        int[] b13 = b(e(bArr), e(bArr2));
        ByteBuffer order = ByteBuffer.allocate(b13.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b13);
        return order.array();
    }

    public static int[] b(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = f130077a;
        System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
        System.arraycopy(iArr, 0, iArr3, iArr4.length, 8);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        d(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    public static void c(int i13, int i14, int i15, int i16, int[] iArr) {
        int i17 = iArr[i13] + iArr[i14];
        iArr[i13] = i17;
        int i18 = i17 ^ iArr[i16];
        int i19 = (i18 >>> (-16)) | (i18 << 16);
        iArr[i16] = i19;
        int i23 = iArr[i15] + i19;
        iArr[i15] = i23;
        int i24 = iArr[i14] ^ i23;
        int i25 = (i24 >>> (-12)) | (i24 << 12);
        iArr[i14] = i25;
        int i26 = iArr[i13] + i25;
        iArr[i13] = i26;
        int i27 = iArr[i16] ^ i26;
        int i28 = (i27 >>> (-8)) | (i27 << 8);
        iArr[i16] = i28;
        int i29 = iArr[i15] + i28;
        iArr[i15] = i29;
        int i33 = iArr[i14] ^ i29;
        iArr[i14] = (i33 >>> (-7)) | (i33 << 7);
    }

    public static void d(int[] iArr) {
        for (int i13 = 0; i13 < 10; i13++) {
            c(0, 4, 8, 12, iArr);
            c(1, 5, 9, 13, iArr);
            c(2, 6, 10, 14, iArr);
            c(3, 7, 11, 15, iArr);
            c(0, 5, 10, 15, iArr);
            c(1, 6, 11, 12, iArr);
            c(2, 7, 8, 13, iArr);
            c(3, 4, 9, 14, iArr);
        }
    }

    public static int[] e(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
