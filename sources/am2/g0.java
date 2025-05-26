package am2;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import pn2.w1;

/* loaded from: classes2.dex */
public final class g0 extends dm2.l {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15554h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f15555i;

    /* renamed from: j, reason: collision with root package name */
    public final pn2.o f15556j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(on2.u storageManager, i container, ym2.g name, boolean z13, int i13) {
        super(storageManager, container, name, w0.f15602a);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15554h = z13;
        IntRange q13 = ql2.s.q(0, i13);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(q13, 10));
        ql2.k it = q13.iterator();
        while (it.f104109c) {
            int b13 = it.b();
            arrayList.add(dm2.z0.x0(this, w1.INVARIANT, ym2.g.e(RequestConfiguration.MAX_AD_CONTENT_RATING_T + b13), b13, storageManager));
        }
        this.f15555i = arrayList;
        this.f15556j = new pn2.o(this, lb.l0.M(this), kotlin.collections.g1.b(fn2.d.j(this).f().e()), storageManager);
    }

    @Override // am2.g
    public final g1 J() {
        return null;
    }

    @Override // am2.a0
    public final boolean M() {
        return false;
    }

    @Override // am2.g
    public final boolean P() {
        return false;
    }

    @Override // am2.g
    public final boolean S() {
        return false;
    }

    @Override // am2.g
    public final boolean Y() {
        return false;
    }

    @Override // am2.a0
    public final boolean Z() {
        return false;
    }

    @Override // dm2.f0
    public final in2.n a0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return in2.m.f72874b;
    }

    @Override // am2.g
    public final /* bridge */ /* synthetic */ in2.n b0() {
        return in2.m.f72874b;
    }

    @Override // am2.g
    public final h c() {
        return h.CLASS;
    }

    @Override // am2.g
    public final g c0() {
        return null;
    }

    @Override // am2.j
    public final pn2.b1 e() {
        return this.f15556j;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return bm2.h.f23540a;
    }

    @Override // am2.g, am2.p
    public final q getVisibility() {
        r PUBLIC = s.f15577e;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // dm2.l, am2.a0
    public final boolean isExternal() {
        return false;
    }

    @Override // am2.g
    public final boolean isInline() {
        return false;
    }

    @Override // am2.g, am2.k
    public final List k() {
        return this.f15555i;
    }

    @Override // am2.g, am2.a0
    public final c0 l() {
        return c0.FINAL;
    }

    @Override // am2.g
    public final Collection n() {
        return kotlin.collections.s0.f80394a;
    }

    @Override // am2.g
    public final Collection p() {
        return kotlin.collections.q0.f80391a;
    }

    @Override // am2.k
    public final boolean q() {
        return this.f15554h;
    }

    @Override // am2.g
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // am2.g
    public final f u() {
        return null;
    }
}
