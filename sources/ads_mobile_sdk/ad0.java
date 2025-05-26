package ads_mobile_sdk;

import android.os.Bundle;
import ao2.j0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ad0 implements a.qe, a.bg {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f2359a;

    /* renamed from: b, reason: collision with root package name */
    public final fd0 f2360b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f2361c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f2362d;

    public ad0(wi.k baseRequest, fd0 firebaseAnalyticsAdapter, r0 adConfiguration, j0 backgroundScope) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.f2359a = baseRequest;
        this.f2360b = firebaseAnalyticsAdapter;
        this.f2361c = adConfiguration;
        this.f2362d = backgroundScope;
    }

    @Override // a.bg
    public final Unit a(cj.a aVar, bl2.c cVar) {
        Object a13 = this.f2360b.a("generateEventId");
        String obj = a13 != null ? a13.toString() : null;
        if (obj == null) {
            return Unit.f80348a;
        }
        String l13 = this.f2359a.l();
        if (l13 == null) {
            return Unit.f80348a;
        }
        Bundle j13 = e0.t.j(new Pair("_ai", l13), new Pair("reward_type", aVar.getType()), new Pair("reward_value", new Integer(aVar.getAmount())));
        Bundle bundle = this.f2361c.f10387q;
        cd0 cd0Var = cd0.f3865b;
        bundle.putBundle("_ar", j13);
        j0 j0Var = this.f2362d;
        yc0 block = new yc0(this, bundle, obj, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        return Unit.f80348a;
    }

    @Override // a.qe
    public final Object a(boolean z13, bl2.c cVar) {
        String l13 = this.f2359a.l();
        if (l13 == null) {
            return Unit.f80348a;
        }
        j0 j0Var = this.f2362d;
        zc0 block = new zc0(this, l13, z13, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        return Unit.f80348a;
    }
}
