package b4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final g f21642a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21643b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.k f21644c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.k f21645d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21646e;

    public q(g gVar, q0 q0Var, List list, n4.b bVar, g4.d dVar) {
        v vVar;
        String str;
        ArrayList arrayList;
        int i13;
        int i14;
        ArrayList arrayList2;
        String str2;
        int i15;
        int i16;
        g gVar2 = gVar;
        this.f21642a = gVar2;
        this.f21643b = list;
        xk2.n nVar = xk2.n.NONE;
        this.f21644c = xk2.m.a(nVar, new p(this, 1));
        this.f21645d = xk2.m.a(nVar, new p(this, 0));
        g gVar3 = h.f21591a;
        int length = gVar2.f21571a.length();
        List list2 = gVar2.f21573c;
        list2 = list2 == null ? kotlin.collections.q0.f80391a : list2;
        ArrayList arrayList3 = new ArrayList();
        int size = list2.size();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            vVar = q0Var.f21649b;
            if (i17 >= size) {
                break;
            }
            e eVar = (e) list2.get(i17);
            v vVar2 = (v) eVar.f21542a;
            int i19 = eVar.f21543b;
            if (i19 != i18) {
                arrayList3.add(new e(vVar, i18, i19));
            }
            v a13 = vVar.a(vVar2);
            int i23 = eVar.f21544c;
            arrayList3.add(new e(a13, i19, i23));
            i17++;
            i18 = i23;
        }
        if (i18 != length) {
            arrayList3.add(new e(vVar, i18, length));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new e(vVar, 0, 0));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i24 = 0;
        while (i24 < size2) {
            e eVar2 = (e) arrayList3.get(i24);
            int i25 = eVar2.f21543b;
            int i26 = eVar2.f21544c;
            if (i25 != i26) {
                str = gVar2.f21571a.substring(i25, i26);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            g gVar4 = new g(str, h.b(gVar2, i25, i26), null, null);
            v vVar3 = (v) eVar2.f21542a;
            if (m4.l.a(vVar3.f21665b, Integer.MIN_VALUE)) {
                arrayList = arrayList3;
                i13 = i24;
                i14 = size2;
                arrayList2 = arrayList4;
                str2 = str;
                vVar3 = new v(vVar3.f21664a, vVar.f21665b, vVar3.f21666c, vVar3.f21667d, vVar3.f21668e, vVar3.f21669f, vVar3.f21670g, vVar3.f21671h, vVar3.f21672i);
            } else {
                arrayList2 = arrayList4;
                i14 = size2;
                arrayList = arrayList3;
                i13 = i24;
                str2 = str;
            }
            q0 q0Var2 = new q0(q0Var.f21648a, vVar.a(vVar3));
            List b13 = gVar4.b();
            List list3 = this.f21643b;
            ArrayList arrayList5 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i27 = 0;
            while (true) {
                i15 = eVar2.f21543b;
                if (i27 >= size3) {
                    break;
                }
                Object obj = list3.get(i27);
                e eVar3 = (e) obj;
                if (h.c(i15, i26, eVar3.f21543b, eVar3.f21544c)) {
                    arrayList5.add(obj);
                }
                i27++;
            }
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size4 = arrayList5.size();
            for (int i28 = 0; i28 < size4; i28++) {
                e eVar4 = (e) arrayList5.get(i28);
                int i29 = eVar4.f21543b;
                if (i15 > i29 || (i16 = eVar4.f21544c) > i26) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                arrayList6.add(new e(eVar4.f21542a, i29 - i15, i16 - i15));
            }
            t tVar = new t(new j4.d(q0Var2, dVar, bVar, str2, b13, arrayList6), i15, i26);
            arrayList4 = arrayList2;
            arrayList4.add(tVar);
            i24 = i13 + 1;
            gVar2 = gVar;
            arrayList3 = arrayList;
            size2 = i14;
        }
        this.f21646e = arrayList4;
    }

    @Override // b4.u
    public final boolean a() {
        ArrayList arrayList = this.f21646e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((t) arrayList.get(i13)).f21659a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // b4.u
    public final float b() {
        return ((Number) this.f21645d.getValue()).floatValue();
    }

    @Override // b4.u
    public final float c() {
        return ((Number) this.f21644c.getValue()).floatValue();
    }
}
