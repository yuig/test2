package sf1;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112509i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1 f112510j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(e1 e1Var, int i13) {
        super(0);
        this.f112509i = i13;
        this.f112510j = e1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f112509i;
        e1 e1Var = this.f112510j;
        switch (i13) {
            case 0:
                m259invoke();
                return Unit.f80348a;
            case 1:
                m259invoke();
                return Unit.f80348a;
            case 2:
                m259invoke();
                return Unit.f80348a;
            case 3:
                m259invoke();
                return Unit.f80348a;
            case 4:
                lh0.v1 a03 = e1Var.a0();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) a03.f83491a;
                return Boolean.valueOf(g1Var.o("closeup_scrubber_preview_android", "enabled", z3Var) || g1Var.l("closeup_scrubber_preview_android"));
            default:
                c91.e eVar = e1Var.f112550i;
                if (eVar != null) {
                    return eVar.a(bs1.c.l0(e1Var), e1Var.f112545d);
                }
                Intrinsics.r("onDemandModuleControllerFactory");
                throw null;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m259invoke() {
        rf1.p0 p0Var;
        f30 f30Var;
        rf1.p0 p0Var2;
        f30 f30Var2;
        int i13 = this.f112509i;
        e1 e1Var = this.f112510j;
        switch (i13) {
            case 0:
                j1 j1Var = e1Var.G;
                if (j1Var != null) {
                    ((rf1.p0) j1Var).f4("bottom");
                    break;
                }
                break;
            case 1:
                j1 j1Var2 = e1Var.G;
                if (j1Var2 != null) {
                    qf1.d action = new qf1.d("", "", lf1.a.f83133g);
                    Intrinsics.checkNotNullParameter(action, "action");
                    ((rf1.p0) j1Var2).l4(action, null);
                    break;
                }
                break;
            case 2:
                j1 j1Var3 = e1Var.G;
                if (j1Var3 != null && (f30Var = (p0Var = (rf1.p0) j1Var3).Z) != null) {
                    gs0.k.a(p0Var.f107867u, f30Var, jo1.a.OTHER, true, false, null, null, false, null, null, false, null, null, false, null, null, null, false, false, false, false, null, null, false, 8388600).showFeedBack();
                    break;
                }
                break;
            default:
                j1 j1Var4 = e1Var.G;
                if (j1Var4 != null && (f30Var2 = (p0Var2 = (rf1.p0) j1Var4).Z) != null) {
                    new rf1.m0(p0Var2, f30Var2, 0).invoke();
                    break;
                }
                break;
        }
    }
}
