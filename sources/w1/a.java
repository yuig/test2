package w1;

import com.pinterest.adsGmaLibrary.analytics.AdsGmaLogger$AdsGmaInitializationPayload;
import com.pinterest.api.model.bt0;
import com.pinterest.api.model.xs0;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127137i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f127138j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f127139k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j13, u2.q qVar) {
        super(2);
        this.f127137i = 0;
        this.f127138j = j13;
        this.f127139k = qVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f127137i;
        long j13 = this.f127138j;
        Object obj = this.f127139k;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                if (j13 == y2.h.f136670b) {
                    i2.s sVar2 = (i2.s) oVar;
                    sVar2.W(1829217412);
                    f.b((u2.q) obj, sVar2, 0, 0);
                    sVar2.r(false);
                    return;
                }
                i2.s sVar3 = (i2.s) oVar;
                sVar3.W(1828881000);
                u2.q h10 = androidx.compose.foundation.layout.e.h((u2.q) obj, n4.g.b(j13), n4.g.a(j13), 0.0f, 0.0f, 12);
                q3.p0 e13 = p1.q.e(u2.b.f120014b, false);
                int i15 = sVar3.P;
                i2.z1 o13 = sVar3.o();
                u2.q X = ao2.m0.X(sVar3, h10);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                if (!(sVar3.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar3.a0();
                if (sVar3.O) {
                    sVar3.n(iVar);
                } else {
                    sVar3.j0();
                }
                tb.f.f0(sVar3, e13, s3.j.f110801e);
                tb.f.f0(sVar3, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar3.O || !Intrinsics.d(sVar3.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar3, i15, hVar);
                }
                tb.f.f0(sVar3, X, s3.j.f110799c);
                f.b(null, sVar3, 0, 1);
                sVar3.r(true);
                sVar3.r(false);
                return;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        return;
                    }
                }
                ((kl2.l) obj).invoke(new n4.g(j13), oVar, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String e13;
        bt0 f13;
        String Z;
        switch (this.f127137i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                ew.j jVar = (ew.j) this.f127139k;
                fw.c cVar = jVar.f60323i;
                ix.d dVar = jVar.f60320f;
                xs0 xs0Var = dVar.f73790f;
                if (xs0Var == null || dVar.c()) {
                    xs0Var = null;
                }
                jVar.f60321g.getClass();
                pb0.g gVar = (pb0.g) jVar.f60317c;
                gVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j13 = this.f127138j;
                long j14 = currentTimeMillis - j13;
                cVar.getClass();
                h32.f1 f1Var = h32.f1.GMA_SDK_LOAD;
                HashMap hashMap = new HashMap();
                if (xs0Var != null && (f13 = xs0Var.f()) != null) {
                    hashMap.put("load", String.valueOf(f13.s().booleanValue()));
                    List o13 = f13.o();
                    if (o13 != null && (Z = CollectionsKt.Z(o13, ",", null, null, 0, null, null, 62)) != null) {
                    }
                    nm.u uVar = new nm.u();
                    uVar.s(Integer.valueOf(intValue), "total_count");
                    uVar.s(Integer.valueOf(intValue2), "ready_status_count");
                    uVar.s(Long.valueOf(j14), "sdk_load_duration");
                    uVar.u("power_score", String.valueOf(cVar.f63034b.a()));
                    String sVar = uVar.toString();
                    Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
                }
                if (xs0Var != null && (e13 = xs0Var.e()) != null) {
                }
                Unit unit = Unit.f80348a;
                cVar.f63033a.g(f1Var, null, hashMap, false);
                gVar.getClass();
                long currentTimeMillis2 = System.currentTimeMillis() - j13;
                fw.d dVar2 = jVar.f60332r;
                if (dVar2.a()) {
                    wr.c.a(dVar2.f63037a, new AdsGmaLogger$AdsGmaInitializationPayload("GMA_SDK_LOAD", currentTimeMillis2, dVar2.f63039c.a()), null, null, 14);
                }
                ((ew.c) jVar.f60324j).f60290g = true;
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, long j13, int i13) {
        super(2);
        this.f127137i = i13;
        this.f127139k = obj;
        this.f127138j = j13;
    }
}
