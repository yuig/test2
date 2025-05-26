package a7;

import java.util.HashMap;
import java.util.HashSet;
import pk.v2;

/* loaded from: classes.dex */
public class f1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;

    /* renamed from: a, reason: collision with root package name */
    public int f994a;

    /* renamed from: b, reason: collision with root package name */
    public int f995b;

    /* renamed from: c, reason: collision with root package name */
    public int f996c;

    /* renamed from: d, reason: collision with root package name */
    public int f997d;

    /* renamed from: e, reason: collision with root package name */
    public int f998e;

    /* renamed from: f, reason: collision with root package name */
    public int f999f;

    /* renamed from: g, reason: collision with root package name */
    public int f1000g;

    /* renamed from: h, reason: collision with root package name */
    public int f1001h;

    /* renamed from: i, reason: collision with root package name */
    public int f1002i;

    /* renamed from: j, reason: collision with root package name */
    public int f1003j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1004k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1005l;

    /* renamed from: m, reason: collision with root package name */
    public pk.c1 f1006m;

    /* renamed from: n, reason: collision with root package name */
    public pk.c1 f1007n;

    /* renamed from: o, reason: collision with root package name */
    public int f1008o;

    /* renamed from: p, reason: collision with root package name */
    public pk.c1 f1009p;

    /* renamed from: q, reason: collision with root package name */
    public int f1010q;

    /* renamed from: r, reason: collision with root package name */
    public int f1011r;

    /* renamed from: s, reason: collision with root package name */
    public int f1012s;

    /* renamed from: t, reason: collision with root package name */
    public pk.c1 f1013t;

    /* renamed from: u, reason: collision with root package name */
    public e1 f1014u;

    /* renamed from: v, reason: collision with root package name */
    public pk.c1 f1015v;

    /* renamed from: w, reason: collision with root package name */
    public int f1016w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1017x;

    /* renamed from: y, reason: collision with root package name */
    public int f1018y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1019z;

    public f1() {
        this.f994a = Integer.MAX_VALUE;
        this.f995b = Integer.MAX_VALUE;
        this.f996c = Integer.MAX_VALUE;
        this.f997d = Integer.MAX_VALUE;
        this.f1002i = Integer.MAX_VALUE;
        this.f1003j = Integer.MAX_VALUE;
        this.f1004k = true;
        this.f1005l = true;
        pk.y0 y0Var = pk.c1.f100372b;
        v2 v2Var = v2.f100502e;
        this.f1006m = v2Var;
        this.f1007n = v2Var;
        this.f1008o = 0;
        this.f1009p = v2Var;
        this.f1010q = 0;
        this.f1011r = Integer.MAX_VALUE;
        this.f1012s = Integer.MAX_VALUE;
        this.f1013t = v2Var;
        this.f1014u = e1.f986a;
        this.f1015v = v2Var;
        this.f1016w = 0;
        this.f1017x = true;
        this.f1018y = 0;
        this.f1019z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = new HashMap();
        this.E = new HashSet();
    }

    public g1 a() {
        return new g1(this);
    }

    public final void b(g1 g1Var) {
        this.f994a = g1Var.f1027a;
        this.f995b = g1Var.f1028b;
        this.f996c = g1Var.f1029c;
        this.f997d = g1Var.f1030d;
        this.f998e = g1Var.f1031e;
        this.f999f = g1Var.f1032f;
        this.f1000g = g1Var.f1033g;
        this.f1001h = g1Var.f1034h;
        this.f1002i = g1Var.f1035i;
        this.f1003j = g1Var.f1036j;
        this.f1004k = g1Var.f1037k;
        this.f1005l = g1Var.f1038l;
        this.f1006m = g1Var.f1039m;
        this.f1007n = g1Var.f1040n;
        this.f1008o = g1Var.f1041o;
        this.f1009p = g1Var.f1042p;
        this.f1010q = g1Var.f1043q;
        this.f1011r = g1Var.f1044r;
        this.f1012s = g1Var.f1045s;
        this.f1013t = g1Var.f1046t;
        this.f1014u = g1Var.f1047u;
        this.f1015v = g1Var.f1048v;
        this.f1016w = g1Var.f1049w;
        this.f1017x = g1Var.f1050x;
        this.f1018y = g1Var.f1051y;
        this.f1019z = g1Var.f1052z;
        this.A = g1Var.A;
        this.B = g1Var.B;
        this.C = g1Var.C;
        this.E = new HashSet(g1Var.E);
        this.D = new HashMap(g1Var.D);
    }

    public f1 c(int i13, boolean z13) {
        if (z13) {
            this.E.add(Integer.valueOf(i13));
        } else {
            this.E.remove(Integer.valueOf(i13));
        }
        return this;
    }

    public f1(g1 g1Var) {
        b(g1Var);
    }
}
