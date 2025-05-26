package a8;

import java.util.List;
import java.util.Map;
import pk.c1;
import pk.d1;
import pk.u0;

/* loaded from: classes3.dex */
public final class q implements gi.p, com.bumptech.glide.load.data.g, lo2.c {

    /* renamed from: a */
    public Object f1449a;

    public /* synthetic */ q(Object obj) {
        this.f1449a = obj;
    }

    public void a(String str, String str2) {
        d1 d1Var = (d1) this.f1449a;
        String b13 = r.b(str.trim());
        String trim = str2.trim();
        d1Var.getClass();
        pk.a0.B(b13, trim);
        Map map = (Map) d1Var.f102947b;
        if (map == null) {
            map = pk.f0.a();
            d1Var.f102947b = map;
        }
        u0 u0Var = (u0) map.get(b13);
        if (u0Var == null) {
            u0Var = c1.p(d1Var.f102946a);
            Map map2 = (Map) d1Var.f102947b;
            if (map2 == null) {
                map2 = pk.f0.a();
                d1Var.f102947b = map2;
            }
            map2.put(b13, u0Var);
        }
        u0Var.a(trim);
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.g
    public Object c() {
        return this.f1449a;
    }

    public void d(List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            String str = (String) list.get(i13);
            int i14 = d7.n0.f53866a;
            String[] split = str.split(":\\s?", 2);
            if (split.length == 2) {
                a(split[0], split[1]);
            }
        }
    }

    public r e() {
        return new r(this);
    }

    public void f() {
        Object obj = this.f1449a;
        ((b0) obj).f1294n = false;
        ((b0) obj).x();
    }

    public void g(l0 l0Var) {
        b0 b0Var = (b0) this.f1449a;
        long j13 = l0Var.f1394a;
        long j14 = l0Var.f1395b;
        b0Var.f1293m = d7.n0.X(j14 - j13);
        b0Var.f1294n = !(j14 == -9223372036854775807L);
        b0Var.f1295o = j14 == -9223372036854775807L;
        b0Var.f1296p = false;
        b0Var.x();
    }

    public Object h() {
        int i13 = gi.b.f65047a;
        Object obj = gi.d.f65055a;
        if (gi.d.f65056b == null) {
            gi.d.f65056b = new gi.c();
        }
        synchronized (gi.d.f65055a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public q() {
        this.f1449a = new d1();
    }

    public q(String str, String str2, int i13) {
        this();
        a("User-Agent", str);
        a("CSeq", String.valueOf(i13));
        if (str2 != null) {
            a("Session", str2);
        }
    }

    public q(ao2.v vVar, kl2.l lVar) {
        fi.b bVar = lo2.k.f84194a;
    }
}
