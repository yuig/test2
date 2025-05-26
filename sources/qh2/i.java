package qh2;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public final class i implements URLStreamHandlerFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f103952a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f103953b;

    static {
        HashMap hashMap = new HashMap();
        f103952a = hashMap;
        try {
            hashMap.put("http", new e(a("com.android.okhttp.HttpHandler"), 0));
            hashMap.put("https", new e(a("com.android.okhttp.HttpsHandler"), 1));
        } catch (Exception error) {
            f103953b.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            y.R().logInternalError(error);
        }
        f103953b = j.f103954a;
    }

    public static URLStreamHandler a(String str) {
        try {
            return (URLStreamHandler) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception error) {
            f103953b.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            y.R().logInternalError(error);
            return null;
        }
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if (str != null) {
            return (URLStreamHandler) f103952a.get(str);
        }
        return null;
    }
}
