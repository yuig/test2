package ac2;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2066a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final v f2067b = new v();

    /* renamed from: c, reason: collision with root package name */
    public static final v f2068c = new v();

    /* renamed from: d, reason: collision with root package name */
    public static final xk2.v f2069d = xk2.m.b(e.f1942k);

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String M = d7.n0.M(context);
            Intrinsics.f(M);
            return M;
        } catch (Exception unused) {
            return a.a.k("Pinterest/? (Linux;Android ", Build.VERSION.RELEASE, ") AndroidXMedia3/1.6.1");
        }
    }

    public static h7.a b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (h7.a) f2066a.a(new l5.a(context, 8));
    }
}
