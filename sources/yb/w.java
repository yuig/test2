package yb;

import ec.y;
import ec.z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w implements c, zb.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f138465a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f138466b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final y f138467c;

    /* renamed from: d, reason: collision with root package name */
    public final zb.i f138468d;

    /* renamed from: e, reason: collision with root package name */
    public final zb.i f138469e;

    /* renamed from: f, reason: collision with root package name */
    public final zb.i f138470f;

    public w(fc.c cVar, z zVar) {
        zVar.getClass();
        this.f138465a = zVar.f();
        this.f138467c = zVar.e();
        zb.e a13 = zVar.d().a();
        this.f138468d = (zb.i) a13;
        zb.e a14 = zVar.b().a();
        this.f138469e = (zb.i) a14;
        zb.e a15 = zVar.c().a();
        this.f138470f = (zb.i) a15;
        cVar.e(a13);
        cVar.e(a14);
        cVar.e(a15);
        a13.a(this);
        a14.a(this);
        a15.a(this);
    }

    @Override // zb.a
    public final void a() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f138466b;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((zb.a) arrayList.get(i13)).a();
            i13++;
        }
    }

    @Override // yb.c
    public final void b(List list, List list2) {
    }

    public final void d(zb.a aVar) {
        this.f138466b.add(aVar);
    }

    public final y e() {
        return this.f138467c;
    }
}
