package xu1;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.lifecycle.z;
import ao2.j0;
import do2.t2;
import do2.u2;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import uj2.a0;

/* loaded from: classes2.dex */
public final class y implements g {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f135988b;

    /* renamed from: c, reason: collision with root package name */
    public static final uk2.d f135989c;

    /* renamed from: d, reason: collision with root package name */
    public static final t2 f135990d;

    /* renamed from: e, reason: collision with root package name */
    public static final uk2.d f135991e;

    /* renamed from: f, reason: collision with root package name */
    public static final t2 f135992f;

    /* renamed from: a, reason: collision with root package name */
    public final z f135993a;

    static {
        j jVar = j.FOREGROUND;
        uk2.d R = uk2.d.R(jVar);
        Intrinsics.checkNotNullExpressionValue(R, "createDefault(...)");
        f135989c = R;
        f135990d = u2.a(jVar);
        i iVar = i.NONE;
        uk2.d R2 = uk2.d.R(iVar);
        Intrinsics.checkNotNullExpressionValue(R2, "createDefault(...)");
        f135991e = R2;
        f135992f = u2.a(iVar);
    }

    public y(Context context, j0 applicationScope, z lifecycleOwner, o00.a coroutineDispatcherProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        this.f135993a = lifecycleOwner;
        if (f135988b) {
            return;
        }
        t tVar = new t(applicationScope, coroutineDispatcherProvider);
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        try {
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(tVar);
        } catch (SecurityException e13) {
            e13.getMessage();
        }
        this.f135993a.getLifecycle().a(new m(applicationScope));
        f135988b = true;
    }

    public static i b() {
        return (i) f135992f.getValue();
    }

    public static jk2.x c() {
        jk2.h h10 = uj2.q.h(f135991e, f135989c, new ep.g(23, v.f135981a));
        a0 a0Var = tk2.e.f118017c;
        jk2.x H = new j1(new jk2.x(h10.A(a0Var), new b22.f(7, u.f135978k), 2), new jr1.a(14, u.f135979l), 0).o().H(a0Var);
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }

    @Override // xu1.g
    public final uj2.q a() {
        jk2.x c13 = c();
        a0 a0Var = tk2.e.f118017c;
        jk2.x H = new j1(c13.A(a0Var), new jr1.a(13, u.f135977j), 0).o().H(a0Var);
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }
}
