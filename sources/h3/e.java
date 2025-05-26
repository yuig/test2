package h3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f66627a;

    /* renamed from: b, reason: collision with root package name */
    public final float f66628b;

    /* renamed from: c, reason: collision with root package name */
    public final float f66629c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66630d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66631e;

    /* renamed from: f, reason: collision with root package name */
    public final long f66632f;

    /* renamed from: g, reason: collision with root package name */
    public final int f66633g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f66634h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f66635i;

    /* renamed from: j, reason: collision with root package name */
    public final d f66636j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f66637k;

    public e(String str, float f13, float f14, float f15, float f16, long j13, int i13, boolean z13, int i14) {
        String str2 = (i14 & 1) != 0 ? "" : str;
        long j14 = (i14 & 32) != 0 ? b3.w.f21390n : j13;
        int i15 = (i14 & 64) != 0 ? 5 : i13;
        this.f66627a = str2;
        this.f66628b = f13;
        this.f66629c = f14;
        this.f66630d = f15;
        this.f66631e = f16;
        this.f66632f = j14;
        this.f66633g = i15;
        this.f66634h = z13;
        ArrayList arrayList = new ArrayList();
        this.f66635i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f66636j = dVar;
        arrayList.add(dVar);
    }

    public final f a() {
        c();
        while (this.f66635i.size() > 1) {
            b();
        }
        d dVar = this.f66636j;
        f fVar = new f(this.f66627a, this.f66628b, this.f66629c, this.f66630d, this.f66631e, new g0(dVar.f66615a, dVar.f66616b, dVar.f66617c, dVar.f66618d, dVar.f66619e, dVar.f66620f, dVar.f66621g, dVar.f66622h, dVar.f66623i, dVar.f66624j), this.f66632f, this.f66633g, this.f66634h);
        this.f66637k = true;
        return fVar;
    }

    public final void b() {
        c();
        ArrayList arrayList = this.f66635i;
        d dVar = (d) arrayList.remove(arrayList.size() - 1);
        ((d) ep.b.h(arrayList, 1)).f66624j.add(new g0(dVar.f66615a, dVar.f66616b, dVar.f66617c, dVar.f66618d, dVar.f66619e, dVar.f66620f, dVar.f66621g, dVar.f66622h, dVar.f66623i, dVar.f66624j));
    }

    public final void c() {
        if (!this.f66637k) {
            return;
        }
        jk.r.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        throw null;
    }
}
