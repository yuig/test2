package df;

import android.net.Uri;
import c2.n2;
import java.io.BufferedOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f54751a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f54752b;

    /* renamed from: c, reason: collision with root package name */
    public static k0 f54753c;

    static {
        String f13 = kotlin.jvm.internal.k0.f80436a.b(f1.class).f();
        if (f13 == null) {
            f13 = "UrlRedirectCache";
        }
        f54751a = f13;
        f54752b = Intrinsics.n("_Redirect", f13);
    }

    public static final void a(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                k0 b13 = b();
                String uri3 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri3, "fromUri.toString()");
                bufferedOutputStream = b13.b(uri3, f54752b);
                String uri4 = uri2.toString();
                Intrinsics.checkNotNullExpressionValue(uri4, "toUri.toString()");
                byte[] bytes = uri4.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                bufferedOutputStream.write(bytes);
            } catch (IOException e13) {
                wc.b bVar = u0.f54860d;
                wc.b.z(le.g0.CACHE, f54751a, Intrinsics.n(e13.getMessage(), "IOException when accessing cache: "));
            }
        } finally {
            j1.z(bufferedOutputStream);
        }
    }

    public static final synchronized k0 b() {
        k0 k0Var;
        synchronized (f1.class) {
            try {
                k0Var = f54753c;
                if (k0Var == null) {
                    k0Var = new k0(f54751a, new n2(4));
                }
                f54753c = k0Var;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return k0Var;
    }
}
