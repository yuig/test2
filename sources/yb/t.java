package yb;

import android.graphics.Path;
import ec.y;
import i2.a2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements n, zb.a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f138454b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f138455c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.v f138456d;

    /* renamed from: e, reason: collision with root package name */
    public final zb.p f138457e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f138458f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f138453a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final a2 f138459g = new a2(1);

    public t(com.airbnb.lottie.v vVar, fc.c cVar, ec.t tVar) {
        this.f138454b = tVar.f58346a;
        this.f138455c = tVar.f58349d;
        this.f138456d = vVar;
        zb.p pVar = new zb.p((List) tVar.f58348c.f92902b);
        this.f138457e = pVar;
        cVar.e(pVar);
        pVar.a(this);
    }

    @Override // zb.a
    public final void a() {
        this.f138458f = false;
        this.f138456d.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i13 >= arrayList2.size()) {
                this.f138457e.f141524m = arrayList;
                return;
            }
            c cVar = (c) arrayList2.get(i13);
            if (cVar instanceof w) {
                w wVar = (w) cVar;
                if (wVar.e() == y.SIMULTANEOUSLY) {
                    this.f138459g.f71073a.add(wVar);
                    wVar.d(this);
                    i13++;
                }
            }
            if (cVar instanceof u) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((u) cVar);
            }
            i13++;
        }
    }

    @Override // cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        if (obj == com.airbnb.lottie.y.K) {
            this.f138457e.l(dVar);
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        jc.f.f(fVar, i13, arrayList, fVar2, this);
    }

    @Override // yb.c
    public final String getName() {
        return this.f138454b;
    }

    @Override // yb.n
    public final Path r() {
        boolean z13 = this.f138458f;
        zb.p pVar = this.f138457e;
        Path path = this.f138453a;
        if (z13 && pVar.f141498e == null) {
            return path;
        }
        path.reset();
        if (this.f138455c) {
            this.f138458f = true;
            return path;
        }
        Path path2 = (Path) pVar.g();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f138459g.e(path);
        this.f138458f = true;
        return path;
    }
}
