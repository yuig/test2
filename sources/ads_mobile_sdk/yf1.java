package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class yf1 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf1 f14221a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf1(zf1 zf1Var) {
        super(1);
        this.f14221a = zf1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        bj.g gVar = (bj.g) obj;
        f80 f13 = this.f14221a.f14737a.f();
        synchronized (f13) {
            f13.f5084k = gVar;
            f13.a(gVar);
            unit = Unit.f80348a;
        }
        return unit;
    }
}
