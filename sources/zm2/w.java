package zm2;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f142256a;

    static {
        byte[] bArr = new byte[0];
        f142256a = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return com.bumptech.glide.c.O0(bArr, 0, bArr.length) == 0;
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException("UTF-8 not supported?", e13);
        }
    }
}
