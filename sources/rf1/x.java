package rf1;

import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.g1;
import lh0.u1;
import lh0.z3;
import nx.d1;
import so.k8;
import so.oa;
import so.r8;
import so.s8;
import x02.i2;
import x02.x2;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107923i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f107924j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(p0 p0Var, int i13) {
        super(0);
        this.f107923i = i13;
        this.f107924j = p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dl0 v63;
        int i13 = this.f107923i;
        int i14 = 1;
        p0 p0Var = this.f107924j;
        switch (i13) {
            case 0:
                so.u uVar = p0Var.f107857p;
                nx.d0 pinalytics = p0Var.getPinalytics();
                r8 r8Var = uVar.f114642a;
                so.v vVar = (so.v) r8Var.f114091b.L5.get();
                oa oaVar = r8Var.f114090a;
                m60.w wVar = (m60.w) oaVar.f113885r0.get();
                i92.k kVar = (i92.k) oaVar.f113921t1.get();
                s8 s8Var = r8Var.f114091b;
                return new qf1.i0(pinalytics, p0Var.Q, vVar, wVar, kVar, s8Var.h5(), (i2) oaVar.F3.get(), (x2) oaVar.f113800m3.get(), (d1) oaVar.f113730i2.get(), (il1.a) s8Var.f114581z.get(), s8Var.I5(), (h22.f) oaVar.P7.get(), (uk1.e) oaVar.f113702ga.get(), (so.x) s8Var.M5.get(), (e02.a) oaVar.f113757jd.get(), (k8) s8Var.T4.get(), (b60.b) oaVar.f113850p0.get(), (q11.a) s8Var.P3.get(), s8Var.p6(), s8.X4(s8Var), (es.a) oaVar.P6.get(), (so.y) s8Var.O5.get(), s8Var.D6(), (nx.b0) oaVar.R8.get(), (ku1.j) s8Var.f114402n.get(), (jo1.c) oaVar.f113810md.get());
            case 1:
                return ((s0) p0Var.f107826J.invoke()).f107899d;
            case 2:
                String F3 = p0Var.F3(p0Var.Z);
                h32.g0 g0Var = ((s0) p0Var.f107826J.invoke()).f107897b ? h32.g0.PIN_IDEA_STREAM : h32.g0.PIN_CLOSEUP_BODY;
                u1 u1Var = p0Var.f107851m;
                u1Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) u1Var.f83486a;
                return new oq.b(F3, p0Var.A, p0Var.D, p0Var.B, g0Var, new x(p0Var, i14), p0Var.C, g1Var.o("android_dynamic_ads_killswitch", "enabled", z3Var) || g1Var.l("android_dynamic_ads_killswitch"));
            case 3:
                f30 f30Var = p0Var.Z;
                return new qg1.l((f30Var == null || (v63 = f30Var.v6()) == null) ? null : v63.s(), true);
            default:
                u1 u1Var2 = p0Var.f107851m;
                u1Var2.getClass();
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) u1Var2.f83486a;
                return Boolean.valueOf(g1Var2.o("closeup_scrubber_restart_android", "enabled", z3Var2) || g1Var2.l("closeup_scrubber_restart_android"));
        }
    }
}
