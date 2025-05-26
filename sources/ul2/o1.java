package ul2;

import a.cb;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o1 extends t implements rl2.u {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f122566m = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final i0 f122567g;

    /* renamed from: h, reason: collision with root package name */
    public final String f122568h;

    /* renamed from: i, reason: collision with root package name */
    public final String f122569i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f122570j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.k f122571k;

    /* renamed from: l, reason: collision with root package name */
    public final w1 f122572l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o1(ul2.i0 r8, am2.r0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            ym2.g r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            tb.f r0 = ul2.a2.c(r9)
            java.lang.String r4 = r0.v()
            java.lang.Object r6 = kotlin.jvm.internal.e.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.o1.<init>(ul2.i0, am2.r0):void");
    }

    public final boolean equals(Object obj) {
        o1 c13 = c2.c(obj);
        return c13 != null && Intrinsics.d(this.f122567g, c13.f122567g) && Intrinsics.d(this.f122568h, c13.f122568h) && Intrinsics.d(this.f122569i, c13.f122569i) && Intrinsics.d(this.f122570j, c13.f122570j);
    }

    @Override // rl2.c
    public final String getName() {
        return this.f122568h;
    }

    public final int hashCode() {
        return this.f122569i.hashCode() + cb.d(this.f122568h, this.f122567g.hashCode() * 31, 31);
    }

    @Override // ul2.t
    public final vl2.g i() {
        return w().i();
    }

    @Override // rl2.u
    public final boolean isConst() {
        return n().isConst();
    }

    @Override // rl2.u
    public final boolean isLateinit() {
        return n().j0();
    }

    @Override // rl2.c
    public final boolean isSuspend() {
        return false;
    }

    @Override // ul2.t
    public final i0 j() {
        return this.f122567g;
    }

    @Override // ul2.t
    public final vl2.g l() {
        w().getClass();
        return null;
    }

    @Override // ul2.t
    public final boolean t() {
        return !Intrinsics.d(this.f122570j, kotlin.jvm.internal.e.NO_RECEIVER);
    }

    public final String toString() {
        an2.y yVar = z1.f122650a;
        return z1.d(n());
    }

    public final Member u() {
        if (!n().s()) {
            return null;
        }
        ym2.b bVar = a2.f122487a;
        tb.f c13 = a2.c(n());
        if (c13 instanceof p) {
            p pVar = (p) c13;
            wm2.f fVar = pVar.f122575j;
            if ((fVar.f130374b & 16) == 16) {
                wm2.d dVar = fVar.f130379g;
                int i13 = dVar.f130360b;
                if ((i13 & 1) != 1 || (i13 & 2) != 2) {
                    return null;
                }
                int i14 = dVar.f130361c;
                vm2.f fVar2 = pVar.f122576k;
                return this.f122567g.g(fVar2.c(i14), fVar2.c(dVar.f130362d));
            }
        }
        return (Field) this.f122571k.getValue();
    }

    @Override // ul2.t
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final am2.r0 n() {
        Object invoke = this.f122572l.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (am2.r0) invoke;
    }

    public abstract k1 w();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o1(i0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    public o1(i0 i0Var, String str, String str2, am2.r0 r0Var, Object obj) {
        this.f122567g = i0Var;
        this.f122568h = str;
        this.f122569i = str2;
        this.f122570j = obj;
        this.f122571k = xk2.m.a(xk2.n.PUBLICATION, new n1(this, 1));
        w1 w1Var = new w1(r0Var, new n1(this, 0));
        Intrinsics.checkNotNullExpressionValue(w1Var, "lazySoft(...)");
        this.f122572l = w1Var;
    }
}
