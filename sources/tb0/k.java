package tb0;

import android.util.Pair;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final Regex f117100b = new Regex("[^A-Z]");

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f117101c = q0.f80391a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f117102a = new ArrayList();

    public final void a(String str, String str2, Throwable th3) {
        String concat = th3 instanceof ParseException ? "ParseException" : th3 instanceof IllegalStateException ? "IllegalStateException" : th3 instanceof UnknownHostException ? "UnknownHostException" : th3 instanceof SocketTimeoutException ? "SocketTimeoutException" : th3 instanceof IOException ? "IOException" : th3 instanceof SecurityException ? "SecurityException" : th3 instanceof Exception ? "Exception" : "Unknown - ".concat(th3.getClass().getSimpleName());
        String message = th3.getMessage();
        if (message == null || message.length() == 0 || Intrinsics.d(message, "null")) {
            message = th3.getClass().getName();
        }
        if (str2 == null) {
            str2 = null;
        } else {
            String replace = f117100b.replace(str2, "");
            if (replace.length() != 0) {
                str2 = replace;
            }
        }
        if (str2 != null) {
            message = str2 + "-" + ((Object) message);
        }
        if (str != null) {
            concat = a.a.D(str, "-", concat);
        }
        Intrinsics.f(message);
        d(concat, message);
    }

    public final void b(String str, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a(null, str, throwable);
    }

    public final void c(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        d(key, value);
    }

    public final void d(String str, String str2) {
        HashSet hashSet = h.f117076w;
        h hVar = g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        hVar.getClass();
        if (h.z(str)) {
            str = "<filtered>";
        }
        Intrinsics.checkNotNullExpressionValue(str, "maybeClean(...)");
        if (h.z(str2)) {
            str2 = "<filtered>";
        }
        Intrinsics.checkNotNullExpressionValue(str2, "maybeClean(...)");
        this.f117102a.add(new Pair(str, str2));
    }
}
