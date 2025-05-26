package dm2;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pn2.t1;

/* loaded from: classes4.dex */
public abstract class g extends p implements am2.b1 {

    /* renamed from: e, reason: collision with root package name */
    public final on2.u f55418e;

    /* renamed from: f, reason: collision with root package name */
    public final am2.q f55419f;

    /* renamed from: g, reason: collision with root package name */
    public List f55420g;

    /* renamed from: h, reason: collision with root package name */
    public final f f55421h;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(g.class), "constructors", "getConstructors()Ljava/util/Collection;"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(on2.u r3, am2.m r4, bm2.i r5, ym2.g r6, am2.q r7) {
        /*
            r2 = this;
            am2.v0 r0 = am2.w0.f15602a
            java.lang.String r1 = "storageManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "containingDeclaration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.lang.String r1 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "sourceElement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "visibilityImpl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            r2.<init>(r4, r5, r6, r0)
            r2.f55418e = r3
            r2.f55419f = r7
            kh2.g2 r4 = new kh2.g2
            r5 = 12
            r4.<init>(r2, r5)
            on2.q r3 = (on2.q) r3
            r3.c(r4)
            dm2.f r3 = new dm2.f
            r3.<init>(r2)
            r2.f55421h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.g.<init>(on2.u, am2.m, bm2.i, ym2.g, am2.q):void");
    }

    @Override // am2.a0
    public final boolean M() {
        return false;
    }

    @Override // am2.a0
    public final boolean Z() {
        return false;
    }

    @Override // dm2.p, dm2.o, am2.m
    /* renamed from: a */
    public final am2.j o0() {
        return this;
    }

    @Override // am2.j
    public final pn2.b1 e() {
        return this.f55421h;
    }

    @Override // am2.p
    public final am2.q getVisibility() {
        return this.f55419f;
    }

    @Override // am2.a0
    public final boolean isExternal() {
        return false;
    }

    @Override // am2.k
    public final List k() {
        List list = this.f55420g;
        if (list != null) {
            return list;
        }
        Intrinsics.r("declaredTypeParametersImpl");
        throw null;
    }

    @Override // am2.m
    public final Object l0(ul2.e visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        switch (visitor.f122512a) {
            case 0:
                return null;
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                an2.y yVar = (an2.y) visitor.f122513b;
                an2.y yVar2 = an2.y.f15818c;
                yVar.getClass();
                yVar.C(builder, this, null);
                am2.q qVar = this.f55419f;
                Intrinsics.checkNotNullExpressionValue(qVar, "getVisibility(...)");
                yVar.m0(qVar, builder);
                yVar.O(this, builder);
                builder.append(yVar.M("typealias"));
                builder.append(" ");
                yVar.U(this, builder, true);
                List k13 = k();
                Intrinsics.checkNotNullExpressionValue(k13, "getDeclaredTypeParameters(...)");
                yVar.i0(k13, builder, false);
                yVar.D(this, builder);
                builder.append(" = ");
                builder.append(yVar.d0(((nn2.u) this).v0()));
                return Unit.f80348a;
        }
    }

    @Override // dm2.p
    public final am2.n o0() {
        return this;
    }

    @Override // am2.k
    public final boolean q() {
        return t1.c(((nn2.u) this).v0(), new e(this, 1));
    }

    @Override // dm2.o
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // dm2.p, dm2.o, am2.m
    /* renamed from: a */
    public final am2.m o0() {
        return this;
    }
}
