package i2;

import a.cb;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f71318a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f71319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71320c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f71321d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71322e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71323f;

    /* renamed from: g, reason: collision with root package name */
    public int f71324g;

    /* renamed from: h, reason: collision with root package name */
    public int f71325h;

    /* renamed from: i, reason: collision with root package name */
    public int f71326i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f71327j;

    /* renamed from: k, reason: collision with root package name */
    public int f71328k;

    /* renamed from: l, reason: collision with root package name */
    public int f71329l;

    /* renamed from: m, reason: collision with root package name */
    public int f71330m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f71331n;

    public v2(w2 w2Var) {
        this.f71318a = w2Var;
        this.f71319b = w2Var.f71340a;
        int i13 = w2Var.f71341b;
        this.f71320c = i13;
        this.f71321d = w2Var.f71342c;
        this.f71322e = w2Var.f71343d;
        this.f71325h = i13;
        this.f71326i = -1;
        this.f71327j = new z0();
    }

    public final d a(int i13) {
        ArrayList arrayList = this.f71318a.f71347h;
        int h13 = lb.l0.h1(arrayList, i13, this.f71320c);
        if (h13 >= 0) {
            return (d) arrayList.get(h13);
        }
        d dVar = new d(i13);
        arrayList.add(-(h13 + 1), dVar);
        return dVar;
    }

    public final Object b(int[] iArr, int i13) {
        int O;
        if (!lb.l0.j(iArr, i13)) {
            return n.f71185a;
        }
        int i14 = i13 * 5;
        if (i14 >= iArr.length) {
            O = iArr.length;
        } else {
            O = lb.l0.O(iArr[i14 + 1] >> 29) + iArr[i14 + 4];
        }
        return this.f71321d[O];
    }

    public final void c() {
        int i13;
        this.f71323f = true;
        w2 w2Var = this.f71318a;
        w2Var.getClass();
        if (this.f71318a != w2Var || (i13 = w2Var.f71344e) <= 0) {
            u.i("Unexpected reader close()");
            throw null;
        }
        w2Var.f71344e = i13 - 1;
    }

    public final void d() {
        if (this.f71328k == 0) {
            if (!(this.f71324g == this.f71325h)) {
                u.i("endGroup() not called at the end of a group");
                throw null;
            }
            int i13 = this.f71326i;
            int[] iArr = this.f71319b;
            int p13 = lb.l0.p(iArr, i13);
            this.f71326i = p13;
            int i14 = this.f71320c;
            this.f71325h = p13 < 0 ? i14 : lb.l0.i(iArr, p13) + p13;
            int a13 = this.f71327j.a();
            if (a13 < 0) {
                this.f71329l = 0;
                this.f71330m = 0;
            } else {
                this.f71329l = a13;
                this.f71330m = p13 >= i14 - 1 ? this.f71322e : lb.l0.h(iArr, p13 + 1);
            }
        }
    }

    public final Object e() {
        int i13 = this.f71324g;
        if (i13 < this.f71325h) {
            return b(this.f71319b, i13);
        }
        return 0;
    }

    public final int f() {
        int i13 = this.f71324g;
        if (i13 >= this.f71325h) {
            return 0;
        }
        return this.f71319b[i13 * 5];
    }

    public final Object g(int i13, int i14) {
        int[] iArr = this.f71319b;
        int s13 = lb.l0.s(iArr, i13);
        int i15 = i13 + 1;
        int i16 = s13 + i14;
        return i16 < (i15 < this.f71320c ? iArr[(i15 * 5) + 4] : this.f71322e) ? this.f71321d[i16] : n.f71185a;
    }

    public final Object h() {
        int i13;
        if (this.f71328k > 0 || (i13 = this.f71329l) >= this.f71330m) {
            this.f71331n = false;
            return n.f71185a;
        }
        this.f71331n = true;
        this.f71329l = i13 + 1;
        return this.f71321d[i13];
    }

    public final Object i(int i13) {
        int[] iArr = this.f71319b;
        if (!lb.l0.m(iArr, i13)) {
            return null;
        }
        if (!lb.l0.m(iArr, i13)) {
            return n.f71185a;
        }
        return this.f71321d[iArr[(i13 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i13) {
        if (!lb.l0.k(iArr, i13)) {
            return null;
        }
        int i14 = i13 * 5;
        return this.f71321d[lb.l0.O(iArr[i14 + 1] >> 30) + iArr[i14 + 4]];
    }

    public final void k(int i13) {
        if (!(this.f71328k == 0)) {
            u.i("Cannot reposition while in an empty region");
            throw null;
        }
        this.f71324g = i13;
        int[] iArr = this.f71319b;
        int i14 = this.f71320c;
        int p13 = i13 < i14 ? lb.l0.p(iArr, i13) : -1;
        this.f71326i = p13;
        if (p13 < 0) {
            this.f71325h = i14;
        } else {
            this.f71325h = lb.l0.i(iArr, p13) + p13;
        }
        this.f71329l = 0;
        this.f71330m = 0;
    }

    public final int l() {
        if (!(this.f71328k == 0)) {
            u.i("Cannot skip while in an empty region");
            throw null;
        }
        int i13 = this.f71324g;
        int[] iArr = this.f71319b;
        int o13 = lb.l0.m(iArr, i13) ? 1 : lb.l0.o(iArr, this.f71324g);
        int i14 = this.f71324g;
        this.f71324g = lb.l0.i(iArr, i14) + i14;
        return o13;
    }

    public final void m() {
        if (!(this.f71328k == 0)) {
            u.i("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f71324g = this.f71325h;
        this.f71329l = 0;
        this.f71330m = 0;
    }

    public final void n() {
        if (this.f71328k <= 0) {
            int i13 = this.f71326i;
            int i14 = this.f71324g;
            int[] iArr = this.f71319b;
            if (!(lb.l0.p(iArr, i14) == i13)) {
                ao2.m0.o0("Invalid slot table detected");
                throw null;
            }
            int i15 = this.f71329l;
            int i16 = this.f71330m;
            z0 z0Var = this.f71327j;
            if (i15 == 0 && i16 == 0) {
                z0Var.b(-1);
            } else {
                z0Var.b(i15);
            }
            this.f71326i = i14;
            this.f71325h = lb.l0.i(iArr, i14) + i14;
            int i17 = i14 + 1;
            this.f71324g = i17;
            this.f71329l = lb.l0.s(iArr, i14);
            this.f71330m = i14 >= this.f71320c - 1 ? this.f71322e : lb.l0.h(iArr, i17);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SlotReader(current=");
        sb3.append(this.f71324g);
        sb3.append(", key=");
        sb3.append(f());
        sb3.append(", parent=");
        sb3.append(this.f71326i);
        sb3.append(", end=");
        return cb.l(sb3, this.f71325h, ')');
    }
}
