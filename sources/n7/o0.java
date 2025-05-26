package n7;

import a7.o1;
import a7.u0;
import a7.z0;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class o0 implements c, i0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f89543a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f89544b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f89545c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f89546d;

    /* renamed from: e, reason: collision with root package name */
    public m0 f89547e;

    /* renamed from: f, reason: collision with root package name */
    public String f89548f;

    /* renamed from: g, reason: collision with root package name */
    public long f89549g;

    /* renamed from: h, reason: collision with root package name */
    public int f89550h;

    /* renamed from: i, reason: collision with root package name */
    public int f89551i;

    /* renamed from: j, reason: collision with root package name */
    public Exception f89552j;

    /* renamed from: k, reason: collision with root package name */
    public long f89553k;

    /* renamed from: l, reason: collision with root package name */
    public long f89554l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.media3.common.b f89555m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.media3.common.b f89556n;

    /* renamed from: o, reason: collision with root package name */
    public o1 f89557o;

    public o0() {
        e0 e0Var = new e0();
        this.f89543a = e0Var;
        this.f89544b = new HashMap();
        this.f89545c = new HashMap();
        this.f89547e = m0.O;
        this.f89546d = new z0();
        this.f89557o = o1.f1158d;
        e0Var.f89423d = this;
    }

    @Override // n7.c
    public final void L(b bVar, g8.v vVar, g8.a0 a0Var, IOException iOException, boolean z13) {
        this.f89552j = iOException;
    }

    @Override // n7.c
    public final void Q(b bVar, int i13, long j13, long j14) {
        this.f89553k = i13;
        this.f89554l = j13;
    }

    @Override // n7.c
    public final void R(b bVar, Exception exc) {
        this.f89552j = exc;
    }

    @Override // n7.i0
    public final void X(b bVar, String str, boolean z13) {
        n0 n0Var = (n0) this.f89544b.remove(str);
        n0Var.getClass();
        ((b) this.f89545c.remove(str)).getClass();
        long j13 = str.equals(this.f89548f) ? this.f89549g : -9223372036854775807L;
        int i13 = 11;
        if (n0Var.H != 11 && !z13) {
            i13 = 15;
        }
        long j14 = bVar.f89378a;
        n0Var.h(j14, j13);
        n0Var.e(j14);
        n0Var.d(j14);
        n0Var.j(bVar, i13);
        this.f89547e = m0.a(this.f89547e, n0Var.a(true));
    }

    public final m0 c0() {
        String str;
        e0 e0Var = this.f89543a;
        synchronized (e0Var) {
            str = e0Var.f89425f;
        }
        n0 n0Var = str == null ? null : (n0) this.f89544b.get(str);
        if (n0Var == null) {
            return null;
        }
        return n0Var.a(false);
    }

    public final boolean d0(tb.l lVar, String str, int i13) {
        if (lVar.d(i13)) {
            if (this.f89543a.b(lVar.v(i13), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // n7.c
    public final void f(b bVar, g8.a0 a0Var) {
        int i13 = a0Var.f64180b;
        androidx.media3.common.b bVar2 = a0Var.f64181c;
        if (i13 == 2 || i13 == 0) {
            this.f89555m = bVar2;
        } else if (i13 == 1) {
            this.f89556n = bVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020f  */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    @Override // n7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(a7.v0 r34, tb.l r35) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.o0.g(a7.v0, tb.l):void");
    }

    @Override // n7.i0
    public final void j(String str) {
        n0 n0Var = (n0) this.f89544b.get(str);
        n0Var.getClass();
        n0Var.L = true;
        n0Var.f89512J = false;
    }

    @Override // n7.c
    public final void l(int i13, b bVar) {
        this.f89551i = i13;
    }

    @Override // n7.i0
    public final void o(b bVar, String str) {
        this.f89544b.put(str, new n0(bVar, false));
        this.f89545c.put(str, bVar);
    }

    @Override // n7.c
    public final void w(b bVar, o1 o1Var) {
        this.f89557o = o1Var;
    }

    @Override // n7.c
    public final void x(b bVar, u0 u0Var, u0 u0Var2, int i13) {
        String str;
        if (this.f89548f == null) {
            e0 e0Var = this.f89543a;
            synchronized (e0Var) {
                str = e0Var.f89425f;
            }
            this.f89548f = str;
            this.f89549g = u0Var.f1213f;
        }
        this.f89550h = i13;
    }

    @Override // n7.i0
    public final void z(b bVar, String str) {
        n0 n0Var = (n0) this.f89544b.get(str);
        n0Var.getClass();
        n0Var.K = true;
    }
}
