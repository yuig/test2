package w21;

import com.pinterest.api.model.i50;
import i2.v3;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127825i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f127826j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f127827k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f127828l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v3 f127829m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j3.a f127830n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127831o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127832p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127833q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y1 f127834r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127835s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(float f13, float f14, float f15, v3 v3Var, j3.a aVar, ao2.j0 j0Var, i2.q1 q1Var, i2.q1 q1Var2, y1 y1Var, i2.q1 q1Var3, int i13) {
        super(2);
        this.f127825i = i13;
        this.f127826j = f13;
        this.f127827k = f14;
        this.f127828l = f15;
        this.f127829m = v3Var;
        this.f127830n = aVar;
        this.f127831o = j0Var;
        this.f127832p = q1Var;
        this.f127833q = q1Var2;
        this.f127834r = y1Var;
        this.f127835s = q1Var3;
    }

    public final void b(i2.o oVar, int i13) {
        String e13;
        i2.s sVar;
        boolean z13;
        String e14;
        i2.s sVar2;
        Integer num;
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        u2.i iVar = u2.b.f120013a;
        u2.n nVar = u2.n.f120041b;
        int i14 = this.f127825i;
        float f13 = this.f127828l;
        v3 v3Var = this.f127829m;
        float f14 = this.f127827k;
        float f15 = this.f127826j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                u2.q k13 = androidx.compose.foundation.layout.e.k(nVar, f15, f14);
                q3.p0 e15 = p1.q.e(iVar, false);
                i2.s sVar4 = (i2.s) oVar;
                int i15 = sVar4.P;
                i2.z1 o13 = sVar4.o();
                u2.q X = ao2.m0.X(oVar, k13);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar4.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar4.a0();
                if (sVar4.O) {
                    sVar4.n(iVar2);
                } else {
                    sVar4.j0();
                }
                tb.f.f0(oVar, e15, s3.j.f110801e);
                tb.f.f0(oVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar4.O || !Intrinsics.d(sVar4.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar4, i15, hVar);
                }
                tb.f.f0(oVar, X, s3.j.f110799c);
                TreeMap treeMap = e1.f127681a;
                String str = (((m) v3Var.getValue()).f127743d.size() >= 2 && (e13 = ((i50) ((m) v3Var.getValue()).f127743d.get(0)).e()) != null) ? e13 : "";
                u2.q b13 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.k(nVar, f15, f14), v1.i.a(f13));
                Unit unit = Unit.f80348a;
                j3.a aVar = this.f127830n;
                ao2.j0 j0Var = this.f127831o;
                i2.q1 q1Var = this.f127832p;
                i2.q1 q1Var2 = this.f127833q;
                e1.c(str, n3.f0.a(b13, unit, new t0(aVar, j0Var, q1Var, q1Var2, this.f127834r, this.f127835s, v3Var, null)), oVar, 0, 0);
                if (((Integer) q1Var.getValue()) != null) {
                    Integer num2 = (Integer) q1Var.getValue();
                    if (num2 != null) {
                        if (num2.intValue() != 1) {
                            sVar = sVar4;
                            z13 = true;
                            sVar.r(z13);
                            return;
                        }
                    }
                    sVar = sVar4;
                    z13 = true;
                    sVar.r(z13);
                    return;
                }
                if (((z1) q1Var2.getValue()).f127888a == e.Initial) {
                    c2.j1.h(androidx.compose.foundation.layout.b.n(cVar.a(nVar, iVar), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar)), v1.i.a(com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, oVar)), 0L, 0L, null, 0.0f, b.f127641a, oVar, 1572864, 60);
                }
                sVar = sVar4;
                z13 = true;
                sVar.r(z13);
                return;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        return;
                    }
                }
                u2.q k14 = androidx.compose.foundation.layout.e.k(nVar, f15, f14);
                q3.p0 e16 = p1.q.e(iVar, false);
                i2.s sVar6 = (i2.s) oVar;
                int i16 = sVar6.P;
                i2.z1 o14 = sVar6.o();
                u2.q X2 = ao2.m0.X(oVar, k14);
                s3.k.Qo.getClass();
                s3.i iVar3 = s3.j.f110798b;
                if (!(sVar6.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar6.a0();
                if (sVar6.O) {
                    sVar6.n(iVar3);
                } else {
                    sVar6.j0();
                }
                tb.f.f0(oVar, e16, s3.j.f110801e);
                tb.f.f0(oVar, o14, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar6.O || !Intrinsics.d(sVar6.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar6, i16, hVar2);
                }
                tb.f.f0(oVar, X2, s3.j.f110799c);
                TreeMap treeMap2 = e1.f127681a;
                if (((m) v3Var.getValue()).f127743d.size() < 2 || (e14 = ((i50) ((m) v3Var.getValue()).f127743d.get(1)).e()) == null) {
                    e14 = "";
                }
                u2.q b14 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.k(nVar, f15, f14), v1.i.a(f13));
                Unit unit2 = Unit.f80348a;
                j3.a aVar2 = this.f127830n;
                ao2.j0 j0Var2 = this.f127831o;
                i2.q1 q1Var3 = this.f127832p;
                i2.q1 q1Var4 = this.f127833q;
                e1.c(e14, n3.f0.a(b14, unit2, new w0(aVar2, j0Var2, q1Var3, q1Var4, this.f127834r, this.f127835s, v3Var, null)), oVar, 0, 0);
                if ((((Integer) q1Var3.getValue()) == null || ((num = (Integer) q1Var3.getValue()) != null && num.intValue() == 0)) && ((z1) q1Var4.getValue()).f127889b == e.Initial) {
                    sVar2 = sVar6;
                    c2.j1.h(androidx.compose.foundation.layout.b.n(cVar.a(nVar, iVar), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar)), v1.i.a(com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, oVar)), 0L, 0L, null, 0.0f, b.f127642b, oVar, 1572864, 60);
                } else {
                    sVar2 = sVar6;
                }
                sVar2.r(true);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f127825i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
