package rr0;

import android.content.Context;
import df.j1;
import hs1.q;
import hs1.t;
import is1.s;
import java.util.ArrayList;
import m60.f0;
import m60.h0;
import m60.u;
import m60.w;
import nx.d1;
import nx.o0;
import qa2.n;
import so.oa;
import sq0.m;
import x02.i2;
import x02.x0;
import yk1.j;
import yk1.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public uk1.d f109912a;

    /* renamed from: b, reason: collision with root package name */
    public or0.b f109913b;

    /* renamed from: c, reason: collision with root package name */
    public n f109914c;

    /* renamed from: d, reason: collision with root package name */
    public o0 f109915d;

    /* renamed from: e, reason: collision with root package name */
    public d1 f109916e;

    /* renamed from: f, reason: collision with root package name */
    public w f109917f;

    /* renamed from: g, reason: collision with root package name */
    public q f109918g;

    /* renamed from: h, reason: collision with root package name */
    public ky.e f109919h;

    /* renamed from: i, reason: collision with root package name */
    public final vr.a f109920i;

    /* renamed from: j, reason: collision with root package name */
    public final uj2.q f109921j;

    /* renamed from: k, reason: collision with root package name */
    public final v f109922k;

    /* renamed from: l, reason: collision with root package name */
    public sq0.f f109923l;

    /* renamed from: m, reason: collision with root package name */
    public m f109924m;

    /* renamed from: n, reason: collision with root package name */
    public x0 f109925n;

    /* renamed from: o, reason: collision with root package name */
    public j f109926o;

    /* renamed from: p, reason: collision with root package name */
    public i2 f109927p;

    /* renamed from: q, reason: collision with root package name */
    public final nr0.m f109928q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f109929r;

    /* renamed from: s, reason: collision with root package name */
    public ac2.m f109930s;

    /* renamed from: t, reason: collision with root package name */
    public final es.h f109931t;

    /* renamed from: u, reason: collision with root package name */
    public final es.a f109932u;

    /* renamed from: v, reason: collision with root package name */
    public final s f109933v;

    public h(h hVar) {
        this.f109912a = hVar.f109912a;
        this.f109913b = hVar.f109913b;
        this.f109914c = hVar.f109914c;
        this.f109915d = hVar.f109915d;
        this.f109916e = hVar.f109916e;
        this.f109917f = hVar.f109917f;
        this.f109918g = hVar.f109918g;
        this.f109919h = hVar.f109919h;
        this.f109921j = hVar.f109921j;
        this.f109922k = hVar.f109922k;
        this.f109923l = hVar.f109923l;
        this.f109924m = hVar.f109924m;
        this.f109925n = hVar.f109925n;
        this.f109926o = hVar.f109926o;
        this.f109927p = hVar.f109927p;
        this.f109928q = hVar.f109928q;
        this.f109929r = hVar.f109929r;
        this.f109930s = hVar.f109930s;
        this.f109932u = hVar.f109932u;
        this.f109931t = hVar.f109931t;
        this.f109920i = hVar.f109920i;
        this.f109933v = hVar.f109933v;
    }

    public static void b(Class cls) {
        throw new IllegalStateException("DynamicFeedPresenterParameters REQUIRES a valid, non-null ".concat(cls.getSimpleName()));
    }

    public final h a() {
        if (this.f109918g == null) {
            this.f109918g = t.a();
        }
        if (this.f109917f == null) {
            this.f109917f = u.f85943a;
        }
        if (this.f109915d == null) {
            this.f109915d = o0.f92437i;
        }
        if (this.f109919h == null) {
            this.f109919h = new ky.f();
        }
        if (this.f109923l == null) {
            hf0.b bVar = new hf0.b();
            h0 h0Var = new h0(hf0.b.q());
            ArrayList arrayList = new ArrayList();
            arrayList.add(new xq0.b(this.f109932u, this.f109931t));
            this.f109923l = new sq0.f(this.f109918g, bVar, h0Var, 2, arrayList);
        }
        if (this.f109913b == null) {
            b(or0.b.class);
            throw null;
        }
        if (this.f109914c == null) {
            b(n.class);
            throw null;
        }
        if (this.f109922k == null) {
            b(v.class);
            throw null;
        }
        if (this.f109925n == null) {
            b(x0.class);
            throw null;
        }
        if (this.f109926o == null) {
            b(j.class);
            throw null;
        }
        if (this.f109927p == null) {
            b(i2.class);
            throw null;
        }
        if (this.f109912a == null) {
            b(uk1.d.class);
            throw null;
        }
        if (this.f109916e != null) {
            return new h(this);
        }
        b(d1.class);
        throw null;
    }

    public h(Context context, nr0.m mVar) {
        this.f109929r = false;
        Context context2 = kb0.a.f79058b;
        oa oaVar = (oa) ((i) j1.b0(i.class, f0.W()));
        this.f109921j = oaVar.u2();
        this.f109912a = ((uk1.a) oaVar.x2()).g();
        this.f109928q = mVar;
        this.f109922k = new yk1.a(context.getResources(), context.getTheme());
        this.f109931t = oaVar.o2();
        this.f109932u = oaVar.m2();
        this.f109920i = oaVar.n2();
        this.f109933v = oaVar.S2();
    }
}
