package m1;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.e4;

/* loaded from: classes2.dex */
public final class x1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85628i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f85629j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f85630k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(int i13, Object obj, Object obj2) {
        super(1);
        this.f85628i = i13;
        this.f85629j = obj;
        this.f85630k = obj2;
    }

    public final void b(w wVar) {
        Float valueOf;
        int i13 = this.f85628i;
        Object obj = this.f85630k;
        Object obj2 = this.f85629j;
        switch (i13) {
            case 0:
                l2 l2Var = (l2) obj2;
                long j13 = wVar.f85612a;
                long a13 = ((o2) obj).f85496d == f1.Horizontal ? a3.c.a(j13, 0.0f, 1) : a3.c.a(j13, 0.0f, 2);
                o2 o2Var = l2Var.f85439a;
                o2Var.f85499g = 1;
                k1.e2 e2Var = o2Var.f85494b;
                if (e2Var != null && (o2Var.f85493a.e() || o2Var.f85493a.d())) {
                    e2Var.c(a13, o2Var.f85499g, o2Var.f85502j);
                    break;
                } else {
                    o2.a(o2Var, o2Var.f85500h, a13, 1);
                    break;
                }
                break;
            default:
                u0 u0Var = (u0) obj2;
                a1 a1Var = (a1) obj;
                long i14 = a3.c.i(wVar.f85612a, a1Var.C ? -1.0f : 1.0f);
                f1 f1Var = a1Var.f85282y;
                v0 v0Var = w0.f85613a;
                float e13 = f1Var == f1.Vertical ? a3.c.e(i14) : a3.c.d(i14);
                c2.s sVar = (c2.s) u0Var;
                int i15 = sVar.f25167a;
                Object obj3 = sVar.f25168b;
                switch (i15) {
                    case 0:
                        c2.w wVar2 = (c2.w) obj3;
                        c2.q qVar = wVar2.f25338n;
                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = wVar2.f25334j;
                        float h10 = (Float.isNaN(parcelableSnapshotMutableFloatState.h()) ? 0.0f : parcelableSnapshotMutableFloatState.h()) + e13;
                        Collection values = wVar2.d().f24525a.values();
                        Intrinsics.checkNotNullParameter(values, "<this>");
                        Iterator it = values.iterator();
                        Float f13 = null;
                        if (it.hasNext()) {
                            float floatValue = ((Number) it.next()).floatValue();
                            while (it.hasNext()) {
                                floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
                            }
                            valueOf = Float.valueOf(floatValue);
                        } else {
                            valueOf = null;
                        }
                        float floatValue2 = valueOf != null ? valueOf.floatValue() : Float.NaN;
                        Collection values2 = wVar2.d().f24525a.values();
                        Intrinsics.checkNotNullParameter(values2, "<this>");
                        Iterator it2 = values2.iterator();
                        if (it2.hasNext()) {
                            float floatValue3 = ((Number) it2.next()).floatValue();
                            while (it2.hasNext()) {
                                floatValue3 = Math.max(floatValue3, ((Number) it2.next()).floatValue());
                            }
                            f13 = Float.valueOf(floatValue3);
                        }
                        float f14 = ql2.s.f(h10, floatValue2, f13 != null ? f13.floatValue() : Float.NaN);
                        c2.w wVar3 = qVar.f25079a;
                        wVar3.f25334j.i(f14);
                        wVar3.f25335k.i(0.0f);
                        break;
                    default:
                        ((f2.e0) obj3).b(e13);
                        break;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f85628i;
        Object obj2 = this.f85630k;
        Object obj3 = this.f85629j;
        switch (i13) {
            case 0:
                b((w) obj);
                return Unit.f80348a;
            case 1:
                ((b) obj3).f85290a.n((i) obj2);
                return Unit.f80348a;
            case 2:
                o3.f fVar = (o3.f) obj3;
                kg.n.b(fVar, (n3.q) obj);
                t0 t0Var = (t0) obj2;
                float e13 = ((e4) com.bumptech.glide.c.w(t0Var, t3.f2.f115994q)).e();
                long z13 = kh2.b0.z(e13, e13);
                if (n4.o.d(z13) <= 0.0f || n4.o.e(z13) <= 0.0f) {
                    jk.r.y("maximumVelocity should be a positive value. You specified=" + ((Object) n4.o.i(z13)));
                    throw null;
                }
                float d2 = n4.o.d(z13);
                o3.e eVar = fVar.f92860a;
                float b13 = eVar.b(d2);
                float e14 = n4.o.e(z13);
                o3.e eVar2 = fVar.f92861b;
                long z14 = kh2.b0.z(b13, eVar2.b(e14));
                kotlin.collections.z.o(0, r10.length, null, eVar.f92855d);
                eVar.f92856e = 0;
                kotlin.collections.z.o(0, r4.length, null, eVar2.f92855d);
                eVar2.f92856e = 0;
                fVar.f92862c = 0L;
                co2.q qVar = t0Var.f85582t;
                if (qVar != null) {
                    v0 v0Var = w0.f85613a;
                    qVar.g(new y(kh2.b0.z(Float.isNaN(n4.o.d(z14)) ? 0.0f : n4.o.d(z14), Float.isNaN(n4.o.e(z14)) ? 0.0f : n4.o.e(z14))));
                }
                return Unit.f80348a;
            case 3:
                b((w) obj);
                return Unit.f80348a;
            default:
                ((Number) obj).longValue();
                s3 s3Var = (s3) obj3;
                float f13 = s3Var.f85576e;
                s3Var.f85576e = 0.0f;
                ((Function1) obj2).invoke(Float.valueOf(f13));
                return Unit.f80348a;
        }
    }
}
