package df;

import android.net.Uri;
import c2.n2;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f54840a;

    /* renamed from: b, reason: collision with root package name */
    public static k0 f54841b;

    static {
        String simpleName = r0.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "ImageResponseCache::class.java.simpleName");
        f54840a = simpleName;
    }

    public static final synchronized k0 a() {
        k0 k0Var;
        synchronized (r0.class) {
            try {
                if (f54841b == null) {
                    f54841b = new k0(f54840a, new n2(4));
                }
                k0Var = f54841b;
                if (k0Var == null) {
                    Intrinsics.r("imageCache");
                    throw null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return k0Var;
    }

    public static final BufferedInputStream b(Uri uri) {
        if (uri == null || !d(uri)) {
            return null;
        }
        try {
            k0 a13 = a();
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            String str = k0.f54779h;
            return a13.a(uri2, null);
        } catch (IOException e13) {
            wc.b bVar = u0.f54860d;
            wc.b.z(le.g0.CACHE, f54840a, e13.toString());
            return null;
        }
    }

    public static final InputStream c(HttpURLConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(connection.getURL().toString());
        InputStream inputStream = connection.getInputStream();
        try {
            if (d(parse)) {
                k0 a13 = a();
                String key = parse.toString();
                Intrinsics.checkNotNullExpressionValue(key, "uri.toString()");
                Intrinsics.checkNotNullParameter(connection, "connection");
                q0 input = new q0(inputStream, 8192);
                input.f54833a = connection;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(input, "input");
                return new h0(input, a13.b(key, null));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    public static boolean d(Uri uri) {
        String host;
        return (uri == null || (host = uri.getHost()) == null || (!Intrinsics.d(host, "fbcdn.net") && !kotlin.text.z.h(host, ".fbcdn.net", false) && (!kotlin.text.z.p(host, "fbcdn", false) || !kotlin.text.z.h(host, ".akamaihd.net", false)))) ? false : true;
    }
}
