package ads_mobile_sdk;

import ao2.j0;
import java.util.Optional;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class an1 implements a.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final ub1 f2445a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional f2446b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f2447c;

    public an1(ub1 mraidAfmaDispatcher, Optional optionalWebView, j0 uiScope) {
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(optionalWebView, "optionalWebView");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.f2445a = mraidAfmaDispatcher;
        this.f2446b = optionalWebView;
        this.f2447c = uiScope;
    }

    @Override // a.l8
    public final Object a(hy2 hy2Var, bl2.c cVar) {
        ym0 ym0Var = (ym0) m2.U0(this.f2446b);
        if (ym0Var == null) {
            return Unit.f80348a;
        }
        py2 py2Var = hy2Var.f6143a;
        if (py2Var == py2.f9857a || py2Var == py2.f9858b) {
            kotlin.jvm.internal.j.z(this.f2447c, null, null, new zm1(this, ym0Var, null), 3);
        }
        return Unit.f80348a;
    }
}
