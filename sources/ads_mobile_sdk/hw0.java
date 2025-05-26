package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class hw0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6126a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6127b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f6128c;

    static {
        Charset.forName("US-ASCII");
        f6126a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6127b = bArr;
        f6128c = ByteBuffer.wrap(bArr);
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void a(Object obj) {
        obj.getClass();
    }
}
