package bk;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Object f23078a = new l();

    /* renamed from: b, reason: collision with root package name */
    public Object f23079b = new l();

    /* renamed from: c, reason: collision with root package name */
    public Object f23080c = new l();

    /* renamed from: d, reason: collision with root package name */
    public Object f23081d = new l();

    /* renamed from: e, reason: collision with root package name */
    public Object f23082e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public Object f23083f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public Object f23084g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public Object f23085h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public Object f23086i = new f();

    /* renamed from: j, reason: collision with root package name */
    public Object f23087j = new f();

    /* renamed from: k, reason: collision with root package name */
    public Object f23088k = new f();

    /* renamed from: l, reason: collision with root package name */
    public Object f23089l = new f();

    public static void b(bs1.c cVar) {
        if (cVar instanceof l) {
            ((l) cVar).getClass();
        } else if (cVar instanceof e) {
            ((e) cVar).getClass();
        }
    }

    public final o a() {
        o oVar = new o();
        oVar.f23091a = (bs1.c) this.f23078a;
        oVar.f23092b = (bs1.c) this.f23079b;
        oVar.f23093c = (bs1.c) this.f23080c;
        oVar.f23094d = (bs1.c) this.f23081d;
        oVar.f23095e = (d) this.f23082e;
        oVar.f23096f = (d) this.f23083f;
        oVar.f23097g = (d) this.f23084g;
        oVar.f23098h = (d) this.f23085h;
        oVar.f23099i = (f) this.f23086i;
        oVar.f23100j = (f) this.f23087j;
        oVar.f23101k = (f) this.f23088k;
        oVar.f23102l = (f) this.f23089l;
        return oVar;
    }

    public final void c(float f13) {
        g(f13);
        h(f13);
        f(f13);
        e(f13);
    }

    public final void d(float f13) {
        bs1.c u13 = d7.b.u(0);
        this.f23078a = u13;
        b(u13);
        this.f23079b = u13;
        b(u13);
        this.f23080c = u13;
        b(u13);
        this.f23081d = u13;
        b(u13);
        c(f13);
    }

    public final void e(float f13) {
        this.f23085h = new a(f13);
    }

    public final void f(float f13) {
        this.f23084g = new a(f13);
    }

    public final void g(float f13) {
        this.f23082e = new a(f13);
    }

    public final void h(float f13) {
        this.f23083f = new a(f13);
    }
}
