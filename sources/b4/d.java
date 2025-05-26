package b4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class d implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f21536a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21537b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21538c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21539d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21540e;

    public d() {
        this.f21536a = new StringBuilder(16);
        this.f21537b = new ArrayList();
        this.f21538c = new ArrayList();
        this.f21539d = new ArrayList();
        this.f21540e = new ArrayList();
    }

    public final void a(g0 g0Var, int i13, int i14) {
        this.f21537b.add(new c(g0Var, i13, i14, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i13, int i14) {
        ?? r83;
        ?? r13;
        List list;
        boolean z13 = charSequence instanceof g;
        StringBuilder sb3 = this.f21536a;
        if (z13) {
            g gVar = (g) charSequence;
            int length = sb3.length();
            sb3.append((CharSequence) gVar.f21571a, i13, i14);
            List b13 = h.b(gVar, i13, i14);
            if (b13 != null) {
                int size = b13.size();
                for (int i15 = 0; i15 < size; i15++) {
                    e eVar = (e) b13.get(i15);
                    a((g0) eVar.f21542a, eVar.f21543b + length, eVar.f21544c + length);
                }
            }
            String str = gVar.f21571a;
            if (i13 == i14 || (r83 = gVar.f21573c) == 0) {
                r83 = 0;
            } else if (i13 != 0 || i14 < str.length()) {
                ArrayList arrayList = new ArrayList(r83.size());
                int size2 = r83.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    Object obj = r83.get(i16);
                    e eVar2 = (e) obj;
                    if (h.c(i13, i14, eVar2.f21543b, eVar2.f21544c)) {
                        arrayList.add(obj);
                    }
                }
                r83 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    e eVar3 = (e) arrayList.get(i17);
                    r83.add(new e(eVar3.f21542a, ql2.s.g(eVar3.f21543b, i13, i14) - i13, ql2.s.g(eVar3.f21544c, i13, i14) - i13));
                }
            }
            if (r83 != 0) {
                int size4 = r83.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    e eVar4 = (e) r83.get(i18);
                    this.f21538c.add(new c((v) eVar4.f21542a, eVar4.f21543b + length, eVar4.f21544c + length, 8));
                }
            }
            if (i13 == i14 || (r13 = gVar.f21574d) == 0) {
                list = null;
            } else {
                if (i13 != 0 || i14 < str.length()) {
                    ArrayList arrayList2 = new ArrayList(r13.size());
                    int size5 = r13.size();
                    for (int i19 = 0; i19 < size5; i19++) {
                        Object obj2 = r13.get(i19);
                        e eVar5 = (e) obj2;
                        if (h.c(i13, i14, eVar5.f21543b, eVar5.f21544c)) {
                            arrayList2.add(obj2);
                        }
                    }
                    r13 = new ArrayList(arrayList2.size());
                    int size6 = arrayList2.size();
                    for (int i23 = 0; i23 < size6; i23++) {
                        e eVar6 = (e) arrayList2.get(i23);
                        r13.add(new e(ql2.s.g(eVar6.f21543b, i13, i14) - i13, ql2.s.g(eVar6.f21544c, i13, i14) - i13, eVar6.f21542a, eVar6.f21545d));
                    }
                }
                list = r13;
            }
            if (list != null) {
                int size7 = list.size();
                for (int i24 = 0; i24 < size7; i24++) {
                    e eVar7 = (e) list.get(i24);
                    this.f21539d.add(new c(eVar7.f21543b + length, eVar7.f21544c + length, eVar7.f21542a, eVar7.f21545d));
                }
            }
        } else {
            sb3.append(charSequence, i13, i14);
        }
        return this;
    }

    public final void b(g gVar) {
        StringBuilder sb3 = this.f21536a;
        int length = sb3.length();
        sb3.append(gVar.f21571a);
        List list = gVar.f21572b;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar = (e) list.get(i13);
                a((g0) eVar.f21542a, eVar.f21543b + length, eVar.f21544c + length);
            }
        }
        List list2 = gVar.f21573c;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                e eVar2 = (e) list2.get(i14);
                this.f21538c.add(new c((v) eVar2.f21542a, eVar2.f21543b + length, eVar2.f21544c + length, 8));
            }
        }
        List list3 = gVar.f21574d;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i15 = 0; i15 < size3; i15++) {
                e eVar3 = (e) list3.get(i15);
                this.f21539d.add(new c(eVar3.f21543b + length, eVar3.f21544c + length, eVar3.f21542a, eVar3.f21545d));
            }
        }
    }

    public final void c(int i13) {
        ArrayList arrayList = this.f21540e;
        if (i13 >= arrayList.size()) {
            throw new IllegalStateException((i13 + " should be less than " + arrayList.size()).toString());
        }
        while (arrayList.size() - 1 >= i13) {
            if (!(!arrayList.isEmpty())) {
                throw new IllegalStateException("Nothing to pop.".toString());
            }
            ((c) arrayList.remove(arrayList.size() - 1)).f21533c = this.f21536a.length();
        }
    }

    public final int d(g0 g0Var) {
        c cVar = new c(g0Var, this.f21536a.length(), 0, 12);
        this.f21540e.add(cVar);
        this.f21537b.add(cVar);
        return r5.size() - 1;
    }

    public final g e() {
        StringBuilder sb3 = this.f21536a;
        String sb4 = sb3.toString();
        ArrayList arrayList = this.f21537b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(((c) arrayList.get(i13)).a(sb3.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f21538c;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i14 = 0; i14 < size2; i14++) {
            arrayList4.add(((c) arrayList3.get(i14)).a(sb3.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f21539d;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i15 = 0; i15 < size3; i15++) {
            arrayList6.add(((c) arrayList5.get(i15)).a(sb3.length()));
        }
        return new g(sb4, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    public d(g gVar) {
        this();
        b(gVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof g) {
            b((g) charSequence);
        } else {
            this.f21536a.append(charSequence);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c13) {
        this.f21536a.append(c13);
        return this;
    }
}
