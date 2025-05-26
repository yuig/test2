package fc;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f61648a;

    /* renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.h f61649b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61650c;

    /* renamed from: d, reason: collision with root package name */
    public final long f61651d;

    /* renamed from: e, reason: collision with root package name */
    public final g f61652e;

    /* renamed from: f, reason: collision with root package name */
    public final long f61653f;

    /* renamed from: g, reason: collision with root package name */
    public final String f61654g;

    /* renamed from: h, reason: collision with root package name */
    public final List f61655h;

    /* renamed from: i, reason: collision with root package name */
    public final dc.e f61656i;

    /* renamed from: j, reason: collision with root package name */
    public final int f61657j;

    /* renamed from: k, reason: collision with root package name */
    public final int f61658k;

    /* renamed from: l, reason: collision with root package name */
    public final int f61659l;

    /* renamed from: m, reason: collision with root package name */
    public final float f61660m;

    /* renamed from: n, reason: collision with root package name */
    public final float f61661n;

    /* renamed from: o, reason: collision with root package name */
    public final float f61662o;

    /* renamed from: p, reason: collision with root package name */
    public final float f61663p;

    /* renamed from: q, reason: collision with root package name */
    public final dc.c f61664q;

    /* renamed from: r, reason: collision with root package name */
    public final m.h f61665r;

    /* renamed from: s, reason: collision with root package name */
    public final dc.b f61666s;

    /* renamed from: t, reason: collision with root package name */
    public final List f61667t;

    /* renamed from: u, reason: collision with root package name */
    public final h f61668u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f61669v;

    /* renamed from: w, reason: collision with root package name */
    public final h1.b f61670w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.camera.core.impl.j f61671x;

    /* renamed from: y, reason: collision with root package name */
    public final ec.h f61672y;

    public i(List list, com.airbnb.lottie.h hVar, String str, long j13, g gVar, long j14, String str2, List list2, dc.e eVar, int i13, int i14, int i15, float f13, float f14, float f15, float f16, dc.c cVar, m.h hVar2, List list3, h hVar3, dc.b bVar, boolean z13, h1.b bVar2, androidx.camera.core.impl.j jVar, ec.h hVar4) {
        this.f61648a = list;
        this.f61649b = hVar;
        this.f61650c = str;
        this.f61651d = j13;
        this.f61652e = gVar;
        this.f61653f = j14;
        this.f61654g = str2;
        this.f61655h = list2;
        this.f61656i = eVar;
        this.f61657j = i13;
        this.f61658k = i14;
        this.f61659l = i15;
        this.f61660m = f13;
        this.f61661n = f14;
        this.f61662o = f15;
        this.f61663p = f16;
        this.f61664q = cVar;
        this.f61665r = hVar2;
        this.f61667t = list3;
        this.f61668u = hVar3;
        this.f61666s = bVar;
        this.f61669v = z13;
        this.f61670w = bVar2;
        this.f61671x = jVar;
        this.f61672y = hVar4;
    }

    public final com.airbnb.lottie.h a() {
        return this.f61649b;
    }

    public final String b(String str) {
        int i13;
        StringBuilder i14 = n60.o.i(str);
        i14.append(this.f61650c);
        i14.append("\n");
        com.airbnb.lottie.h hVar = this.f61649b;
        i iVar = (i) hVar.f28404i.c(this.f61653f);
        if (iVar != null) {
            i14.append("\t\tParents: ");
            i14.append(iVar.f61650c);
            for (i iVar2 = (i) hVar.f28404i.c(iVar.f61653f); iVar2 != null; iVar2 = (i) hVar.f28404i.c(iVar2.f61653f)) {
                i14.append("->");
                i14.append(iVar2.f61650c);
            }
            i14.append(str);
            i14.append("\n");
        }
        List list = this.f61655h;
        if (!list.isEmpty()) {
            i14.append(str);
            i14.append("\tMasks: ");
            i14.append(list.size());
            i14.append("\n");
        }
        int i15 = this.f61657j;
        if (i15 != 0 && (i13 = this.f61658k) != 0) {
            i14.append(str);
            i14.append("\tBackground: ");
            i14.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i15), Integer.valueOf(i13), Integer.valueOf(this.f61659l)));
        }
        List list2 = this.f61648a;
        if (!list2.isEmpty()) {
            i14.append(str);
            i14.append("\tShapes:\n");
            for (Object obj : list2) {
                i14.append(str);
                i14.append("\t\t");
                i14.append(obj);
                i14.append("\n");
            }
        }
        return i14.toString();
    }

    public final String toString() {
        return b("");
    }
}
