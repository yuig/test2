package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f18080a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18081b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f18081b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw InvalidProtocolBufferException.h();
        } catch (InvalidProtocolBufferException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j13) {
        return (int) (j13 ^ (j13 >>> 32));
    }

    public static g0 c(Object obj, Object obj2) {
        g0 g0Var = (g0) ((b) obj);
        g0Var.getClass();
        d0 d0Var = (d0) g0Var.d(f0.NEW_BUILDER);
        d0Var.i(g0Var);
        return d0Var.b((b) obj2).g();
    }
}
