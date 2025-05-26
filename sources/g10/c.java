package g10;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes.dex */
public final class c implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final c f63361a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static String f63362b;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Route route;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response b13 = chain.b(chain.getF95974e());
        Call call = chain.call();
        Intrinsics.g(call, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall");
        RealConnection realConnection = ((RealCall) call).f95906j;
        f63362b = String.valueOf((realConnection == null || (route = realConnection.f95920b) == null) ? null : route.f95756c);
        return b13;
    }
}
