package do2;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class f2 extends eo2.a implements x1, i, eo2.g0 {

    /* renamed from: e */
    public final int f55784e;

    /* renamed from: f */
    public final int f55785f;

    /* renamed from: g */
    public final co2.a f55786g;

    /* renamed from: h */
    public Object[] f55787h;

    /* renamed from: i */
    public long f55788i;

    /* renamed from: j */
    public long f55789j;

    /* renamed from: k */
    public int f55790k;

    /* renamed from: l */
    public int f55791l;

    public f2(int i13, int i14, co2.a aVar) {
        this.f55784e = i13;
        this.f55785f = i14;
        this.f55786g = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:47|48))(1:49)|12|13|14|15|(3:16|(3:39|40|(2:42|43)(1:44))(4:18|(3:23|24|25)|33|(2:35|36)(1:37))|38))(4:50|51|52|53)|31|32)(5:59|60|61|(2:63|(1:65))|67)|54|55|15|(3:16|(0)(0)|38)))|70|6|(0)(0)|54|55|15|(3:16|(0)(0)|38)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static cl2.a j(do2.f2 r8, do2.j r9, bl2.c r10) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.f2.j(do2.f2, do2.j, bl2.c):cl2.a");
    }

    @Override // eo2.g0
    public final i a(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return g2.d(this, coroutineContext, i13, aVar);
    }

    @Override // do2.x1
    public final boolean b(Object obj) {
        int i13;
        boolean z13;
        bl2.c[] cVarArr = eo2.b.f59738a;
        synchronized (this) {
            if (r(obj)) {
                cVarArr = o(cVarArr);
                z13 = true;
            } else {
                z13 = false;
            }
        }
        for (bl2.c cVar : cVarArr) {
            if (cVar != null) {
                xk2.q qVar = xk2.s.f135225b;
                cVar.resumeWith(Unit.f80348a);
            }
        }
        return z13;
    }

    @Override // do2.i
    public final Object collect(j jVar, bl2.c cVar) {
        return j(this, jVar, cVar);
    }

    @Override // eo2.a
    public final eo2.c d() {
        h2 h2Var = new h2();
        h2Var.f55811a = -1L;
        return h2Var;
    }

    @Override // eo2.a
    public final eo2.c[] e() {
        return new h2[2];
    }

    @Override // do2.x1, do2.j
    public final Object emit(Object obj, bl2.c frame) {
        bl2.c[] cVarArr;
        c2 c2Var;
        if (b(obj)) {
            return Unit.f80348a;
        }
        int i13 = 1;
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        bl2.c[] cVarArr2 = eo2.b.f59738a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    xk2.q qVar = xk2.s.f135225b;
                    oVar.resumeWith(Unit.f80348a);
                    cVarArr = o(cVarArr2);
                    c2Var = null;
                } else {
                    c2 c2Var2 = new c2(this, this.f55790k + this.f55791l + p(), obj, oVar);
                    n(c2Var2);
                    this.f55791l++;
                    if (this.f55785f == 0) {
                        cVarArr2 = o(cVarArr2);
                    }
                    cVarArr = cVarArr2;
                    c2Var = c2Var2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c2Var != null) {
            lb.l0.E0(oVar, new ao2.k(c2Var, i13));
        }
        for (bl2.c cVar : cVarArr) {
            if (cVar != null) {
                xk2.q qVar2 = xk2.s.f135225b;
                cVar.resumeWith(Unit.f80348a);
            }
        }
        Object u13 = oVar.u();
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (u13 != aVar) {
            u13 = Unit.f80348a;
        }
        return u13 == aVar ? u13 : Unit.f80348a;
    }

    public final Object h(h2 h2Var, e2 frame) {
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        synchronized (this) {
            if (s(h2Var) < 0) {
                h2Var.f55812b = oVar;
            } else {
                xk2.q qVar = xk2.s.f135225b;
                oVar.resumeWith(Unit.f80348a);
            }
            Unit unit = Unit.f80348a;
        }
        Object u13 = oVar.u();
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13 == aVar ? u13 : Unit.f80348a;
    }

    public final void i() {
        if (this.f55785f != 0 || this.f55791l > 1) {
            Object[] objArr = this.f55787h;
            Intrinsics.f(objArr);
            while (this.f55791l > 0) {
                long p13 = p();
                int i13 = this.f55790k;
                int i14 = this.f55791l;
                if (objArr[((int) ((p13 + (i13 + i14)) - 1)) & (objArr.length - 1)] != g2.f55806a) {
                    return;
                }
                this.f55791l = i14 - 1;
                g2.c(objArr, p() + this.f55790k + this.f55791l, null);
            }
        }
    }

    public final void k(long j13) {
        eo2.c[] cVarArr;
        if (this.f59732b != 0 && (cVarArr = this.f59731a) != null) {
            for (eo2.c cVar : cVarArr) {
                if (cVar != null) {
                    h2 h2Var = (h2) cVar;
                    long j14 = h2Var.f55811a;
                    if (j14 >= 0 && j14 < j13) {
                        h2Var.f55811a = j13;
                    }
                }
            }
        }
        this.f55789j = j13;
    }

    @Override // do2.x1
    public final void l() {
        synchronized (this) {
            u(p() + this.f55790k, this.f55789j, p() + this.f55790k, p() + this.f55790k + this.f55791l);
            Unit unit = Unit.f80348a;
        }
    }

    public final void m() {
        Object[] objArr = this.f55787h;
        Intrinsics.f(objArr);
        g2.c(objArr, p(), null);
        this.f55790k--;
        long p13 = p() + 1;
        if (this.f55788i < p13) {
            this.f55788i = p13;
        }
        if (this.f55789j < p13) {
            k(p13);
        }
    }

    public final void n(Object obj) {
        int i13 = this.f55790k + this.f55791l;
        Object[] objArr = this.f55787h;
        if (objArr == null) {
            objArr = q(0, 2, null);
        } else if (i13 >= objArr.length) {
            objArr = q(i13, objArr.length * 2, objArr);
        }
        g2.c(objArr, p() + i13, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final bl2.c[] o(bl2.c[] cVarArr) {
        eo2.c[] cVarArr2;
        h2 h2Var;
        ao2.o oVar;
        int length = cVarArr.length;
        if (this.f59732b != 0 && (cVarArr2 = this.f59731a) != null) {
            int length2 = cVarArr2.length;
            int i13 = 0;
            cVarArr = cVarArr;
            while (i13 < length2) {
                eo2.c cVar = cVarArr2[i13];
                if (cVar != null && (oVar = (h2Var = (h2) cVar).f55812b) != null && s(h2Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = oVar;
                    h2Var.f55812b = null;
                    length++;
                }
                i13++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long p() {
        return Math.min(this.f55789j, this.f55788i);
    }

    public final Object[] q(int i13, int i14, Object[] objArr) {
        if (i14 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i14];
        this.f55787h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long p13 = p();
        for (int i15 = 0; i15 < i13; i15++) {
            long j13 = i15 + p13;
            g2.c(objArr2, j13, objArr[((int) j13) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean r(Object obj) {
        int i13 = this.f59732b;
        int i14 = this.f55784e;
        if (i13 == 0) {
            if (i14 != 0) {
                n(obj);
                int i15 = this.f55790k + 1;
                this.f55790k = i15;
                if (i15 > i14) {
                    m();
                }
                this.f55789j = p() + this.f55790k;
            }
            return true;
        }
        int i16 = this.f55790k;
        int i17 = this.f55785f;
        if (i16 >= i17 && this.f55789j <= this.f55788i) {
            int i18 = d2.f55759a[this.f55786g.ordinal()];
            if (i18 == 1) {
                return false;
            }
            if (i18 == 2) {
                return true;
            }
            if (i18 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        n(obj);
        int i19 = this.f55790k + 1;
        this.f55790k = i19;
        if (i19 > i17) {
            m();
        }
        long p13 = p() + this.f55790k;
        long j13 = this.f55788i;
        if (((int) (p13 - j13)) > i14) {
            u(j13 + 1, this.f55789j, p() + this.f55790k, p() + this.f55790k + this.f55791l);
        }
        return true;
    }

    public final long s(h2 h2Var) {
        long j13 = h2Var.f55811a;
        if (j13 < p() + this.f55790k) {
            return j13;
        }
        if (this.f55785f <= 0 && j13 <= p() && this.f55791l != 0) {
            return j13;
        }
        return -1L;
    }

    public final Object t(h2 h2Var) {
        Object obj;
        bl2.c[] cVarArr = eo2.b.f59738a;
        synchronized (this) {
            long s13 = s(h2Var);
            if (s13 < 0) {
                obj = g2.f55806a;
            } else {
                long j13 = h2Var.f55811a;
                Object[] objArr = this.f55787h;
                Intrinsics.f(objArr);
                Object obj2 = objArr[((int) s13) & (objArr.length - 1)];
                if (obj2 instanceof c2) {
                    obj2 = ((c2) obj2).f55746c;
                }
                h2Var.f55811a = s13 + 1;
                Object obj3 = obj2;
                cVarArr = v(j13);
                obj = obj3;
            }
        }
        for (bl2.c cVar : cVarArr) {
            if (cVar != null) {
                xk2.q qVar = xk2.s.f135225b;
                cVar.resumeWith(Unit.f80348a);
            }
        }
        return obj;
    }

    public final void u(long j13, long j14, long j15, long j16) {
        long min = Math.min(j14, j13);
        for (long p13 = p(); p13 < min; p13++) {
            Object[] objArr = this.f55787h;
            Intrinsics.f(objArr);
            g2.c(objArr, p13, null);
        }
        this.f55788i = j13;
        this.f55789j = j14;
        this.f55790k = (int) (j15 - min);
        this.f55791l = (int) (j16 - j15);
    }

    public final bl2.c[] v(long j13) {
        long j14;
        long j15;
        bl2.c[] cVarArr;
        long j16;
        eo2.c[] cVarArr2;
        long j17 = this.f55789j;
        bl2.c[] cVarArr3 = eo2.b.f59738a;
        if (j13 > j17) {
            return cVarArr3;
        }
        long p13 = p();
        long j18 = this.f55790k + p13;
        int i13 = this.f55785f;
        if (i13 == 0 && this.f55791l > 0) {
            j18++;
        }
        if (this.f59732b != 0 && (cVarArr2 = this.f59731a) != null) {
            for (eo2.c cVar : cVarArr2) {
                if (cVar != null) {
                    long j19 = ((h2) cVar).f55811a;
                    if (j19 >= 0 && j19 < j18) {
                        j18 = j19;
                    }
                }
            }
        }
        if (j18 <= this.f55789j) {
            return cVarArr3;
        }
        long p14 = p() + this.f55790k;
        int min = this.f59732b > 0 ? Math.min(this.f55791l, i13 - ((int) (p14 - j18))) : this.f55791l;
        long j23 = this.f55791l + p14;
        int i14 = 1;
        if (min > 0) {
            bl2.c[] cVarArr4 = new bl2.c[min];
            Object[] objArr = this.f55787h;
            Intrinsics.f(objArr);
            long j24 = p14;
            int i15 = 0;
            while (true) {
                if (p14 >= j23) {
                    j14 = j18;
                    j15 = j23;
                    break;
                }
                j14 = j18;
                Object obj = objArr[((int) p14) & (objArr.length - i14)];
                fi.b bVar = g2.f55806a;
                if (obj != bVar) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    c2 c2Var = (c2) obj;
                    int i16 = i15 + 1;
                    j15 = j23;
                    cVarArr4[i15] = c2Var.f55747d;
                    g2.c(objArr, p14, bVar);
                    g2.c(objArr, j24, c2Var.f55746c);
                    j16 = 1;
                    j24++;
                    if (i16 >= min) {
                        break;
                    }
                    i15 = i16;
                } else {
                    j15 = j23;
                    j16 = 1;
                }
                p14 += j16;
                j18 = j14;
                j23 = j15;
                i14 = 1;
            }
            cVarArr = cVarArr4;
            p14 = j24;
        } else {
            j14 = j18;
            j15 = j23;
            cVarArr = cVarArr3;
        }
        int i17 = (int) (p14 - p13);
        long j25 = this.f59732b == 0 ? p14 : j14;
        long max = Math.max(this.f55788i, p14 - Math.min(this.f55784e, i17));
        if (i13 == 0 && max < j15) {
            Object[] objArr2 = this.f55787h;
            Intrinsics.f(objArr2);
            if (Intrinsics.d(objArr2[((int) max) & (objArr2.length - 1)], g2.f55806a)) {
                p14++;
                max++;
            }
        }
        u(max, j25, p14, j15);
        i();
        return (cVarArr.length == 0) ^ true ? o(cVarArr) : cVarArr;
    }
}
