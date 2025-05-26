package a7;

import a.cb;

/* loaded from: classes.dex */
public class g1 {
    public static final g1 F = new g1(new f1());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final pk.h1 D;
    public final pk.o1 E;

    /* renamed from: a, reason: collision with root package name */
    public final int f1027a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1029c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1030d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1031e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1032f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1033g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1034h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1035i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1036j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1037k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1038l;

    /* renamed from: m, reason: collision with root package name */
    public final pk.c1 f1039m;

    /* renamed from: n, reason: collision with root package name */
    public final pk.c1 f1040n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1041o;

    /* renamed from: p, reason: collision with root package name */
    public final pk.c1 f1042p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1043q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1044r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1045s;

    /* renamed from: t, reason: collision with root package name */
    public final pk.c1 f1046t;

    /* renamed from: u, reason: collision with root package name */
    public final e1 f1047u;

    /* renamed from: v, reason: collision with root package name */
    public final pk.c1 f1048v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1049w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1050x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1051y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f1052z;

    static {
        cb.s(1, 2, 3, 4, 5);
        cb.s(6, 7, 8, 9, 10);
        cb.s(11, 12, 13, 14, 15);
        cb.s(16, 17, 18, 19, 20);
        cb.s(21, 22, 23, 24, 25);
        cb.s(26, 27, 28, 29, 30);
        d7.n0.Q(31);
        d7.n0.Q(32);
        d7.n0.Q(33);
        d7.n0.Q(34);
    }

    public g1(f1 f1Var) {
        this.f1027a = f1Var.f994a;
        this.f1028b = f1Var.f995b;
        this.f1029c = f1Var.f996c;
        this.f1030d = f1Var.f997d;
        this.f1031e = f1Var.f998e;
        this.f1032f = f1Var.f999f;
        this.f1033g = f1Var.f1000g;
        this.f1034h = f1Var.f1001h;
        this.f1035i = f1Var.f1002i;
        this.f1036j = f1Var.f1003j;
        this.f1037k = f1Var.f1004k;
        this.f1038l = f1Var.f1005l;
        this.f1039m = f1Var.f1006m;
        this.f1040n = f1Var.f1007n;
        this.f1041o = f1Var.f1008o;
        this.f1042p = f1Var.f1009p;
        this.f1043q = f1Var.f1010q;
        this.f1044r = f1Var.f1011r;
        this.f1045s = f1Var.f1012s;
        this.f1046t = f1Var.f1013t;
        this.f1047u = f1Var.f1014u;
        this.f1048v = f1Var.f1015v;
        this.f1049w = f1Var.f1016w;
        this.f1050x = f1Var.f1017x;
        this.f1051y = f1Var.f1018y;
        this.f1052z = f1Var.f1019z;
        this.A = f1Var.A;
        this.B = f1Var.B;
        this.C = f1Var.C;
        this.D = pk.h1.c(f1Var.D);
        this.E = pk.o1.r(f1Var.E);
    }

    public f1 a() {
        f1 f1Var = new f1();
        f1Var.b(this);
        return f1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f1027a == g1Var.f1027a && this.f1028b == g1Var.f1028b && this.f1029c == g1Var.f1029c && this.f1030d == g1Var.f1030d && this.f1031e == g1Var.f1031e && this.f1032f == g1Var.f1032f && this.f1033g == g1Var.f1033g && this.f1034h == g1Var.f1034h && this.f1038l == g1Var.f1038l && this.f1035i == g1Var.f1035i && this.f1036j == g1Var.f1036j && this.f1037k == g1Var.f1037k && this.f1039m.equals(g1Var.f1039m) && this.f1040n.equals(g1Var.f1040n) && this.f1041o == g1Var.f1041o && this.f1042p.equals(g1Var.f1042p) && this.f1043q == g1Var.f1043q && this.f1044r == g1Var.f1044r && this.f1045s == g1Var.f1045s && this.f1046t.equals(g1Var.f1046t) && this.f1047u.equals(g1Var.f1047u) && this.f1048v.equals(g1Var.f1048v) && this.f1049w == g1Var.f1049w && this.f1050x == g1Var.f1050x && this.f1051y == g1Var.f1051y && this.f1052z == g1Var.f1052z && this.A == g1Var.A && this.B == g1Var.B && this.C == g1Var.C) {
            pk.h1 h1Var = this.D;
            h1Var.getClass();
            if (bf.b.M(g1Var.D, h1Var) && this.E.equals(g1Var.E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f1046t.hashCode() + ((((((((this.f1042p.hashCode() + ((((this.f1040n.hashCode() + ((this.f1039m.hashCode() + ((((((((((((((((((((((((this.f1027a + 31) * 31) + this.f1028b) * 31) + this.f1029c) * 31) + this.f1030d) * 31) + this.f1031e) * 31) + this.f1032f) * 31) + this.f1033g) * 31) + this.f1034h) * 31) + (this.f1038l ? 1 : 0)) * 31) + this.f1035i) * 31) + this.f1036j) * 31) + (this.f1037k ? 1 : 0)) * 31)) * 31)) * 31) + this.f1041o) * 31)) * 31) + this.f1043q) * 31) + this.f1044r) * 31) + this.f1045s) * 31)) * 31;
        this.f1047u.getClass();
        return this.E.hashCode() + ((this.D.hashCode() + ((((((((((((((((this.f1048v.hashCode() + ((hashCode + 29791) * 31)) * 31) + this.f1049w) * 31) + (this.f1050x ? 1 : 0)) * 31) + this.f1051y) * 31) + (this.f1052z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31)) * 31);
    }
}
