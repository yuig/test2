package hs1;

import android.os.Build;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class v implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f70078a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70079b;

    public v(String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.f70078a = userAgent;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        this.f70079b = j1.T1(MODEL);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request.Builder b13 = chain.getF95974e().b();
        b13.h("User-Agent");
        b13.a("User-Agent", this.f70078a);
        String a13 = vb0.b.f125448a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstallId(...)");
        b13.a("X-Pinterest-InstallId", a13);
        b13.a("X-Pinterest-Device", this.f70079b);
        return chain.b(b13.b());
    }
}
