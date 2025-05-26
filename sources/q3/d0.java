package q3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d0 implements o1, r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f102185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f102186b;

    public d0(l0 l0Var) {
        this.f102186b = l0Var;
        this.f102185a = l0Var.f102237h;
    }

    @Override // n4.b
    public final long A(float f13) {
        return this.f102185a.A(f13);
    }

    @Override // q3.s
    public final boolean K() {
        return this.f102185a.K();
    }

    @Override // n4.b
    public final int R(float f13) {
        return this.f102185a.R(f13);
    }

    @Override // n4.b
    public final float T(long j13) {
        return this.f102185a.T(j13);
    }

    @Override // q3.r0
    public final q0 Y(int i13, int i14, Map map, Function1 function1) {
        return this.f102185a.Y(i13, i14, map, function1);
    }

    @Override // n4.b
    public final float b() {
        return this.f102185a.f102205b;
    }

    @Override // n4.b
    public final float f0(int i13) {
        return this.f102185a.f0(i13);
    }

    @Override // n4.b
    public final float g0(float f13) {
        return this.f102185a.g0(f13);
    }

    @Override // q3.s
    public final n4.k getLayoutDirection() {
        return this.f102185a.f102204a;
    }

    @Override // n4.b
    public final float j0() {
        return this.f102185a.f102206c;
    }

    @Override // n4.b
    public final float l0(float f13) {
        return this.f102185a.b() * f13;
    }

    @Override // q3.o1
    public final List m(Object obj, Function2 function2) {
        l0 l0Var = this.f102186b;
        s3.k0 k0Var = (s3.k0) l0Var.f102236g.get(obj);
        List n13 = k0Var != null ? k0Var.n() : null;
        if (n13 != null) {
            return n13;
        }
        k2.e eVar = l0Var.f102242m;
        int i13 = eVar.f78184c;
        int i14 = l0Var.f102234e;
        if (i13 < i14) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
        }
        if (i13 == i14) {
            eVar.b(obj);
        } else {
            Object[] objArr = eVar.f78182a;
            Object obj2 = objArr[i14];
            objArr[i14] = obj;
        }
        l0Var.f102234e++;
        HashMap hashMap = l0Var.f102239j;
        if (!hashMap.containsKey(obj)) {
            l0Var.f102241l.put(obj, l0Var.k(obj, function2));
            s3.k0 k0Var2 = l0Var.f102230a;
            if (k0Var2.f110838z.f110969c == s3.g0.LayingOut) {
                k0Var2.U(true);
            } else {
                s3.k0.V(k0Var2, true, 6);
            }
        }
        s3.k0 k0Var3 = (s3.k0) hashMap.get(obj);
        if (k0Var3 == null) {
            return kotlin.collections.q0.f80391a;
        }
        List y03 = k0Var3.f110838z.f110984r.y0();
        k2.b bVar = (k2.b) y03;
        int i15 = bVar.f78176a.f78184c;
        for (int i16 = 0; i16 < i15; i16++) {
            ((s3.t0) bVar.get(i16)).H.f110968b = true;
        }
        return y03;
    }

    @Override // n4.b
    public final long o(float f13) {
        return this.f102185a.o(f13);
    }

    @Override // n4.b
    public final long p(long j13) {
        return this.f102185a.p(j13);
    }

    @Override // q3.r0
    public final q0 s0(int i13, int i14, Map map, Function1 function1) {
        return this.f102185a.Y(i13, i14, map, function1);
    }

    @Override // n4.b
    public final float t(long j13) {
        return this.f102185a.t(j13);
    }

    @Override // n4.b
    public final long v0(long j13) {
        return this.f102185a.v0(j13);
    }
}
