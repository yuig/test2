package ni0;

import ck2.i;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.vh;
import es.h;
import java.util.List;
import jk2.j1;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import sq0.e0;
import uj2.q;
import xk2.m;
import xk2.v;
import yk1.r;

/* loaded from: classes5.dex */
public final class d extends vq0.c {

    /* renamed from: o, reason: collision with root package name */
    public static final List f90575o = f0.j(Float.valueOf(1.5f), Float.valueOf(1.0f));

    /* renamed from: c, reason: collision with root package name */
    public final lh0.f f90576c;

    /* renamed from: d, reason: collision with root package name */
    public final h f90577d;

    /* renamed from: e, reason: collision with root package name */
    public final fs.c f90578e;

    /* renamed from: f, reason: collision with root package name */
    public final v f90579f;

    /* renamed from: g, reason: collision with root package name */
    public final v f90580g;

    /* renamed from: h, reason: collision with root package name */
    public final v f90581h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f90582i;

    /* renamed from: j, reason: collision with root package name */
    public final d f90583j;

    /* renamed from: k, reason: collision with root package name */
    public final v f90584k;

    /* renamed from: l, reason: collision with root package name */
    public final v f90585l;

    /* renamed from: m, reason: collision with root package name */
    public final v f90586m;

    /* renamed from: n, reason: collision with root package name */
    public final v f90587n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q networkStateStream, uk1.d presenterPinalytics, lh0.f experiments, h adsCommonDisplay, fs.c adsSalesDealsDisplay, hs.d moduleViewabilityHelper, l51.a adsQcmAnalytics) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adsSalesDealsDisplay, "adsSalesDealsDisplay");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        Intrinsics.checkNotNullParameter(adsQcmAnalytics, "adsQcmAnalytics");
        this.f90576c = experiments;
        this.f90577d = adsCommonDisplay;
        this.f90578e = adsSalesDealsDisplay;
        ep.c cVar = new ep.c(26);
        ep.c cVar2 = new ep.c(27);
        oi0.a aVar = new oi0.a(adsQcmAnalytics);
        this.f90579f = m.b(new a(this, 0));
        this.f90580g = m.b(new a(this, 1));
        this.f90581h = m.b(new jh0.d(moduleViewabilityHelper, 1));
        this.f126436a.j(0, cVar);
        this.f126436a.j(1, cVar2);
        this.f126436a.j(2, aVar);
        this.f90583j = this;
        this.f90584k = m.b(new a(this, 4));
        this.f90585l = m.b(new a(this, 3));
        this.f90586m = m.b(new a(this, 5));
        this.f90587n = m.b(new a(this, 2));
    }

    public final boolean D3() {
        return ((Boolean) this.f90579f.getValue()).booleanValue();
    }

    public final boolean F3() {
        return ((Boolean) this.f90581h.getValue()).booleanValue();
    }

    @Override // vq0.g
    /* renamed from: G3, reason: merged with bridge method [inline-methods] */
    public final void r3(pi0.f fVar) {
        super.r3(fVar);
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(5, b.f90569j);
        dVar.getClass();
        xj2.c F = new j1(pk2.f.j(new j1(dVar, aVar, 0), new qt.b(5, b.f90570k), 2, "filter(...)"), new lb0.c(26, b.f90571l), 0).F(new dh0.a(17, new hh0.a(this, 10)), new dh0.a(18, b.f90572m), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final boolean H3(vh vhVar) {
        kh khVar = vhVar.f42858p;
        return (khVar != null ? khVar.k() : null) == z32.i.HORIZONTAL && F3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06c9  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [int] */
    /* JADX WARN: Type inference failed for: r11v19, types: [int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I3(int r58, com.pinterest.api.model.vh r59, pi0.f r60) {
        /*
            Method dump skipped, instructions count: 2014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.d.I3(int, com.pinterest.api.model.vh, pi0.f):void");
    }

    @Override // yk1.p
    public final /* bridge */ /* synthetic */ void bindPinalytics(r rVar) {
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        f30 pin = (f30) d().get(i13);
        fs.c cVar = this.f90578e;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        es.c cVar2 = (es.c) cVar.f62828b;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (cVar2.Y(pin) && (cVar2.Q(pin) || cVar2.A(pin))) {
            lh0.d dVar = cVar.f62827a;
            dVar.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) dVar.f83323a;
            if (!g1Var.o("android_deal_module_hf_video_killswitch", "enabled", z3Var) && !g1Var.l("android_deal_module_hf_video_killswitch") && (g1Var.o("android_deal_module_hf_video_gate", "enabled", z3Var) || g1Var.l("android_deal_module_hf_video_gate"))) {
                return 1;
            }
        }
        return this.f90582i ? 2 : 0;
    }

    @Override // vq0.g, yk1.p, yk1.b
    public final void onUnbind() {
        clearDisposables();
        super.onUnbind();
    }

    @Override // vq0.g
    public final e0 p3() {
        return this.f90583j;
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }
}
