package mj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f87258a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87259b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87260c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f87261d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f87262e;

    /* renamed from: f, reason: collision with root package name */
    public final float f87263f;

    /* renamed from: g, reason: collision with root package name */
    public final float f87264g;

    public k(j jVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f87258a = jVar;
        this.f87259b = Collections.unmodifiableList(arrayList);
        this.f87260c = Collections.unmodifiableList(arrayList2);
        float f13 = ((j) ep.b.h(arrayList, 1)).b().f87246a - jVar.b().f87246a;
        this.f87263f = f13;
        float f14 = jVar.d().f87246a - ((j) ep.b.h(arrayList2, 1)).d().f87246a;
        this.f87264g = f14;
        this.f87261d = d(f13, arrayList, true);
        this.f87262e = d(f14, arrayList2, false);
    }

    public static float[] d(float f13, ArrayList arrayList, boolean z13) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i13 = 1;
        while (i13 < size) {
            int i14 = i13 - 1;
            j jVar = (j) arrayList.get(i14);
            j jVar2 = (j) arrayList.get(i13);
            fArr[i13] = i13 == size + (-1) ? 1.0f : fArr[i14] + ((z13 ? jVar2.b().f87246a - jVar.b().f87246a : jVar.d().f87246a - jVar2.d().f87246a) / f13);
            i13++;
        }
        return fArr;
    }

    public static j e(j jVar, int i13, int i14, float f13, int i15, int i16, float f14) {
        ArrayList arrayList = new ArrayList(jVar.f87255b);
        arrayList.add(i14, (i) arrayList.remove(i13));
        h hVar = new h(jVar.f87254a, f14);
        float f15 = f13;
        int i17 = 0;
        while (i17 < arrayList.size()) {
            i iVar = (i) arrayList.get(i17);
            float f16 = iVar.f87249d;
            hVar.b((f16 / 2.0f) + f15, iVar.f87248c, f16, i17 >= i15 && i17 <= i16, iVar.f87250e, iVar.f87251f, 0.0f, 0.0f);
            f15 += iVar.f87249d;
            i17++;
        }
        return hVar.d();
    }

    public static j f(j jVar, float f13, float f14, boolean z13, float f15) {
        int i13;
        List list = jVar.f87255b;
        ArrayList arrayList = new ArrayList(list);
        float f16 = jVar.f87254a;
        h hVar = new h(f16, f14);
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (((i) it.next()).f87250e) {
                i14++;
            }
        }
        float size = f13 / (list.size() - i14);
        float f17 = z13 ? f13 : 0.0f;
        int i15 = 0;
        while (i15 < arrayList.size()) {
            i iVar = (i) arrayList.get(i15);
            if (iVar.f87250e) {
                i13 = i15;
                hVar.b(iVar.f87247b, iVar.f87248c, iVar.f87249d, false, true, iVar.f87251f, 0.0f, 0.0f);
            } else {
                i13 = i15;
                boolean z14 = i13 >= jVar.f87256c && i13 <= jVar.f87257d;
                float f18 = iVar.f87249d - size;
                float a13 = g.a(f18, f16, f15);
                float f19 = (f18 / 2.0f) + f17;
                float f23 = f19 - iVar.f87247b;
                hVar.b(f19, a13, f18, z14, false, iVar.f87251f, z13 ? f23 : 0.0f, z13 ? 0.0f : f23);
                f17 += f18;
            }
            i15 = i13 + 1;
        }
        return hVar.d();
    }

    public final j a() {
        return (j) ep.b.i(this.f87260c, 1);
    }

    public final j b(float f13, float f14, float f15) {
        float b13;
        List list;
        float[] fArr;
        float[] fArr2;
        float f16 = this.f87263f;
        float f17 = f14 + f16;
        float f18 = this.f87264g;
        float f19 = f15 - f18;
        float f23 = c().a().f87252g;
        float f24 = a().c().f87253h;
        if (f16 == f23) {
            f17 += f23;
        }
        if (f18 == f24) {
            f19 -= f24;
        }
        if (f13 < f17) {
            b13 = gj.a.b(1.0f, 0.0f, f14, f17, f13);
            list = this.f87259b;
            fArr = this.f87261d;
        } else {
            if (f13 <= f19) {
                return this.f87258a;
            }
            b13 = gj.a.b(0.0f, 1.0f, f19, f15, f13);
            list = this.f87260c;
            fArr = this.f87262e;
        }
        int size = list.size();
        float f25 = fArr[0];
        int i13 = 1;
        while (true) {
            if (i13 >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f26 = fArr[i13];
            if (b13 <= f26) {
                fArr2 = new float[]{gj.a.b(0.0f, 1.0f, f25, f26, b13), i13 - 1, i13};
                break;
            }
            i13++;
            f25 = f26;
        }
        j jVar = (j) list.get((int) fArr2[1]);
        j jVar2 = (j) list.get((int) fArr2[2]);
        float f27 = fArr2[0];
        if (jVar.f87254a != jVar2.f87254a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list2 = jVar.f87255b;
        int size2 = list2.size();
        List list3 = jVar2.f87255b;
        if (size2 != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list2.size(); i14++) {
            i iVar = (i) list2.get(i14);
            i iVar2 = (i) list3.get(i14);
            arrayList.add(new i(gj.a.a(iVar.f87246a, iVar2.f87246a, f27), gj.a.a(iVar.f87247b, iVar2.f87247b, f27), gj.a.a(iVar.f87248c, iVar2.f87248c, f27), gj.a.a(iVar.f87249d, iVar2.f87249d, f27), false, 0.0f, 0.0f, 0.0f));
        }
        return new j(jVar.f87254a, arrayList, gj.a.c(jVar.f87256c, f27, jVar2.f87256c), gj.a.c(jVar.f87257d, f27, jVar2.f87257d));
    }

    public final j c() {
        return (j) ep.b.i(this.f87259b, 1);
    }
}
