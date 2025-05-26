package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m5 extends kotlin.jvm.internal.s implements kl2.o {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f24972i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f24973j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f24974k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m1 f24975l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f24976m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f24977n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function2 f24978o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function2 f24979p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f24980q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y5 f24981r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function2 f24982s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f24983t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p1.x0 f24984u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f24985v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function2 f24986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(Function2 function2, Function2 function22, String str, m1 m1Var, boolean z13, boolean z14, o1.k kVar, Function2 function23, Function2 function24, b3.x0 x0Var, y5 y5Var, Function2 function25, boolean z15, p1.x0 x0Var2, boolean z16, Function2 function26) {
        super(6);
        this.f24972i = function2;
        this.f24973j = function22;
        this.f24974k = str;
        this.f24975l = m1Var;
        this.f24976m = z13;
        this.f24977n = z14;
        this.f24978o = function23;
        this.f24979p = function24;
        this.f24980q = x0Var;
        this.f24981r = y5Var;
        this.f24982s = function25;
        this.f24983t = z15;
        this.f24984u = x0Var2;
        this.f24985v = z16;
        this.f24986w = function26;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    @Override // kl2.o
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i13;
        boolean z13;
        q2.h hVar;
        q2.h hVar2;
        q2.h c13;
        q2.h hVar3;
        q2.h hVar4;
        float floatValue = ((Number) obj).floatValue();
        long j13 = ((b3.w) obj2).f21392a;
        long j14 = ((b3.w) obj3).f21392a;
        float floatValue2 = ((Number) obj4).floatValue();
        i2.o oVar = (i2.o) obj5;
        int intValue = ((Number) obj6).intValue();
        if ((intValue & 6) == 0) {
            i13 = (((i2.s) oVar).e(floatValue) ? 4 : 2) | intValue;
        } else {
            i13 = intValue;
        }
        if ((intValue & 48) == 0) {
            i13 |= ((i2.s) oVar).g(j13) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i13 |= ((i2.s) oVar).g(j14) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((intValue & 3072) == 0) {
            i13 |= ((i2.s) oVar).e(floatValue2) ? 2048 : 1024;
        }
        int i14 = i13;
        if ((i14 & 9363) == 9362) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        Function2 function2 = this.f24972i;
        if (function2 == null) {
            i2.s sVar2 = (i2.s) oVar;
            sVar2.W(-1572365903);
            sVar2.r(false);
            z13 = 0;
            hVar = null;
        } else {
            i2.s sVar3 = (i2.s) oVar;
            sVar3.W(-1572365902);
            z13 = 0;
            q2.h c14 = q2.i.c(-1865025495, new j5(floatValue, j14, function2, this.f24985v, j13), sVar3);
            sVar3.r(false);
            hVar = c14;
        }
        Function2 function22 = this.f24973j;
        boolean z14 = this.f24976m;
        m1 m1Var = this.f24975l;
        if (function22 == null || this.f24974k.length() != 0 || floatValue2 <= 0.0f) {
            i2.s sVar4 = (i2.s) oVar;
            sVar4.W(-1571160716);
            sVar4.r(z13);
            hVar2 = null;
        } else {
            i2.s sVar5 = (i2.s) oVar;
            sVar5.W(-1571586748);
            q2.h c15 = q2.i.c(-413527723, new l5(floatValue2, m1Var, z14, function22), sVar5);
            sVar5.r(z13);
            hVar2 = c15;
        }
        m1Var.getClass();
        i2.s sVar6 = (i2.s) oVar;
        sVar6.W(-1519634405);
        boolean z15 = this.f24977n;
        i2.q1 K1 = bs1.c.K1(new b3.w(!z14 ? m1Var.f24946j : z15 ? m1Var.f24947k : m1Var.f24945i), sVar6);
        sVar6.r(z13);
        long j15 = ((b3.w) K1.getValue()).f21392a;
        Function2 function23 = this.f24978o;
        if (function23 == null) {
            sVar6.W(-1570983241);
            sVar6.r(z13);
            c13 = null;
        } else {
            sVar6.W(-1570983240);
            c13 = q2.i.c(-1165144581, new k5(j15, function23, z13), sVar6);
            sVar6.r(z13);
        }
        sVar6.W(1383318157);
        i2.q1 K12 = bs1.c.K1(new b3.w(!z14 ? m1Var.f24949m : z15 ? m1Var.f24950n : m1Var.f24948l), sVar6);
        sVar6.r(z13);
        long j16 = ((b3.w) K12.getValue()).f21392a;
        int i15 = 1;
        Function2 function24 = this.f24979p;
        if (function24 == null) {
            sVar6.W(-1570681642);
            sVar6.r(z13);
            hVar3 = null;
        } else {
            sVar6.W(-1570681641);
            q2.h c16 = q2.i.c(1694126319, new k5(j16, function24, i15), sVar6);
            sVar6.r(z13);
            hVar3 = c16;
        }
        u2.n nVar = u2.n.f120041b;
        sVar6.W(-1423938813);
        i2.q1 K13 = bs1.c.K1(new b3.w(m1Var.f24951o), sVar6);
        sVar6.r(z13);
        u2.q b13 = androidx.compose.foundation.a.b(nVar, ((b3.w) K13.getValue()).f21392a, this.f24980q);
        int i16 = i5.f24846a[this.f24981r.ordinal()];
        if (i16 == 1) {
            sVar6.W(-1570370153);
            s5.b(b13, this.f24982s, hVar, hVar2, c13, hVar3, this.f24983t, floatValue, this.f24984u, sVar6, (i14 << 21) & 29360128);
            sVar6.r(z13);
        } else if (i16 != 2) {
            sVar6.W(-1568365383);
            sVar6.r(z13);
        } else {
            sVar6.W(-1569791817);
            Object J2 = sVar6.J();
            Object obj7 = i2.n.f71185a;
            if (J2 == obj7) {
                hVar4 = hVar3;
                J2 = bs1.c.u1(new a3.f(0L), i2.y3.f71400a);
                sVar6.g0(J2);
            } else {
                hVar4 = hVar3;
            }
            i2.q1 q1Var = (i2.q1) J2;
            q2.h c17 = q2.i.c(-1212965554, new l1.s(q1Var, this.f24984u, this.f24986w, 4), sVar6);
            boolean z16 = (i14 & 14) == 4 ? true : z13;
            Object J3 = sVar6.J();
            if (z16 || J3 == obj7) {
                J3 = new h5(floatValue, (Object) q1Var, (int) z13);
                sVar6.g0(J3);
            }
            j3.b(b13, this.f24982s, hVar2, hVar, c13, hVar4, this.f24983t, floatValue, (Function1) J3, c17, this.f24984u, sVar6, ((i14 << 21) & 29360128) | 805306368, 0);
            sVar6.r(z13);
        }
        return Unit.f80348a;
    }
}
