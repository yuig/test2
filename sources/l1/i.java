package l1;

import b2.t0;
import b4.p0;
import h4.f0;
import h4.y;
import i1.m0;
import kh2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import s80.z2;
import w1.l1;
import w1.w0;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81330i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f81331j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f81332k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f81333l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f81334m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f81335n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, Object obj, Object obj2, Object obj3, Object obj4, boolean z13) {
        super(3);
        this.f81330i = i13;
        this.f81332k = obj;
        this.f81331j = z13;
        this.f81333l = obj2;
        this.f81334m = obj3;
        this.f81335n = obj4;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f81330i;
        Object obj4 = this.f81334m;
        Object obj5 = this.f81335n;
        Object obj6 = this.f81333l;
        boolean z13 = false;
        z13 = false;
        z13 = false;
        Object obj7 = this.f81332k;
        switch (i13) {
            case 0:
                c cVar = (c) obj;
                i2.o oVar = (i2.o) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((i2.s) oVar).h(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return Unit.f80348a;
                    }
                }
                String str = (String) ((Function2) obj7).invoke(oVar, 0);
                if (!(!z.j(str))) {
                    throw new IllegalStateException("Label must not be blank".toString());
                }
                t.b(str, this.f81331j, cVar, (u2.q) obj6, (kl2.l) obj4, (Function0) obj5, oVar, (intValue << 6) & 896, 0);
                return Unit.f80348a;
            case 1:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue2 = ((y) obj7).a(intValue2);
                }
                if (!booleanValue) {
                    intValue3 = ((y) obj7).a(intValue3);
                }
                if (this.f81331j) {
                    f0 f0Var = (f0) obj6;
                    long j13 = f0Var.f67560b;
                    int i14 = p0.f21640c;
                    if (intValue2 != ((int) (j13 >> 32)) || intValue3 != ((int) (j13 & 4294967295L))) {
                        if (Math.min(intValue2, intValue3) >= 0) {
                            int max = Math.max(intValue2, intValue3);
                            b4.g gVar = f0Var.f67559a;
                            if (max <= gVar.f21571a.length()) {
                                if (booleanValue || intValue2 == intValue3) {
                                    t0 t0Var = (t0) obj4;
                                    t0Var.u(false);
                                    t0Var.r(w0.None);
                                } else {
                                    ((t0) obj4).h(true);
                                }
                                ((l1) obj5).f127374t.invoke(new f0(gVar, b7.c.h(intValue2, intValue3), (p0) null));
                                z13 = true;
                            }
                        }
                        t0 t0Var2 = (t0) obj4;
                        t0Var2.u(false);
                        t0Var2.r(w0.None);
                    }
                }
                return Boolean.valueOf(z13);
            default:
                m0 AnimatedVisibility = (m0) obj;
                i2.o oVar2 = (i2.o) obj2;
                ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                w80.b bVar = ((s80.j) obj7).f111594c;
                u2.q j14 = androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f).j(b0.y1(oVar2));
                i2.s sVar2 = (i2.s) oVar2;
                sVar2.W(-1296673427);
                Function1 function1 = (Function1) obj6;
                boolean h10 = sVar2.h(function1);
                Object J2 = sVar2.J();
                am.d dVar = i2.n.f71185a;
                Object obj8 = J2;
                if (h10 || J2 == dVar) {
                    obj8 = jq.b.o(2, function1, sVar2);
                }
                Function0 function0 = (Function0) obj8;
                sVar2.r(false);
                sVar2.W(-1296671763);
                boolean h13 = sVar2.h(function1);
                Object J3 = sVar2.J();
                Object obj9 = J3;
                if (h13 || J3 == dVar) {
                    obj9 = jq.b.o(3, function1, sVar2);
                }
                Function0 function02 = (Function0) obj9;
                sVar2.r(false);
                sVar2.W(-1296670132);
                boolean h14 = sVar2.h(function1);
                Object J4 = sVar2.J();
                Object obj10 = J4;
                if (h14 || J4 == dVar) {
                    obj10 = jq.b.o(4, function1, sVar2);
                }
                Function0 function03 = (Function0) obj10;
                sVar2.r(false);
                z2 z2Var = new z2(function1, (e.l) obj5, false ? 1 : 0);
                sVar2.W(-1296655505);
                boolean h15 = sVar2.h(function1);
                Object J5 = sVar2.J();
                Object obj11 = J5;
                if (h15 || J5 == dVar) {
                    obj11 = jq.b.o(5, function1, sVar2);
                }
                sVar2.r(false);
                w80.z.e(bVar, this.f81331j, j14, null, function0, function02, function03, z2Var, (Function0) obj11, (Function1) obj4, false, sVar2, 0, 0, 1032);
                return Unit.f80348a;
        }
    }
}
