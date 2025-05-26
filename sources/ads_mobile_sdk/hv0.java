package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hv0 implements a.s8 {

    /* renamed from: a, reason: collision with root package name */
    public final ku0 f6104a;

    public hv0(ku0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.f6104a = inspectorManager;
    }

    @Override // a.s8
    public final Object a(nm.u uVar, bl2.c cVar) {
        ku0 ku0Var = this.f6104a;
        ku0Var.getClass();
        Object a13 = ku0.a(ku0Var, uVar, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
