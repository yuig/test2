package androidx.recyclerview.widget;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public final y1 f19324d;

    /* renamed from: a, reason: collision with root package name */
    public final s4.f f19321a = new s4.f(30, 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19322b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19323c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f19326f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final y1 f19325e = new y1(this);

    public b(y1 y1Var) {
        this.f19324d = y1Var;
    }

    public final void a(a aVar) {
        l(aVar);
    }

    public final void b(a aVar) {
        int i13 = aVar.f19314b;
        int i14 = aVar.f19316d + i13;
        int i15 = 0;
        boolean z13 = -1;
        int i16 = i13;
        while (true) {
            y2 y2Var = null;
            if (i13 >= i14) {
                break;
            }
            RecyclerView recyclerView = (RecyclerView) this.f19324d.f19715a;
            y2 Y0 = recyclerView.Y0(i13, true);
            if (Y0 != null) {
                if (recyclerView.f19226f.i(Y0.f19717a)) {
                    int[] iArr = RecyclerView.A0;
                } else {
                    y2Var = Y0;
                }
            }
            if (y2Var != null || c(i13)) {
                if (!z13) {
                    f(k(4, i16, aVar.f19315c, i15));
                    i16 = i13;
                    i15 = 0;
                }
                z13 = true;
            } else {
                if (z13) {
                    l(k(4, i16, aVar.f19315c, i15));
                    i16 = i13;
                    i15 = 0;
                }
                z13 = false;
            }
            i15++;
            i13++;
        }
        if (i15 != aVar.f19316d) {
            Object obj = aVar.f19315c;
            aVar.f19315c = null;
            this.f19321a.a(aVar);
            aVar = k(4, i16, obj, i15);
        }
        if (z13) {
            l(aVar);
        } else {
            f(aVar);
        }
    }

    public final boolean c(int i13) {
        ArrayList arrayList = this.f19323c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            a aVar = (a) arrayList.get(i14);
            int i15 = aVar.f19313a;
            if (i15 == 8) {
                if (h(aVar.f19316d, i14 + 1) == i13) {
                    return true;
                }
            } else if (i15 == 1) {
                int i16 = aVar.f19314b;
                int i17 = aVar.f19316d + i16;
                while (i16 < i17) {
                    if (h(i16, i14 + 1) == i13) {
                        return true;
                    }
                    i16++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.f19323c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f19324d.d((a) arrayList.get(i13));
        }
        o(arrayList);
        this.f19326f = 0;
    }

    public final void e() {
        d();
        ArrayList arrayList = this.f19322b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            a aVar = (a) arrayList.get(i13);
            int i14 = aVar.f19313a;
            y1 y1Var = this.f19324d;
            if (i14 == 1) {
                y1Var.d(aVar);
                y1Var.k(aVar.f19314b, aVar.f19316d);
            } else if (i14 == 2) {
                y1Var.d(aVar);
                int i15 = aVar.f19314b;
                int i16 = aVar.f19316d;
                RecyclerView recyclerView = (RecyclerView) y1Var.f19715a;
                recyclerView.b2(i15, i16, true);
                recyclerView.f19235j0 = true;
                recyclerView.f19231h0.f19679c += i16;
            } else if (i14 == 4) {
                y1Var.d(aVar);
                y1Var.h(aVar.f19314b, aVar.f19315c, aVar.f19316d);
            } else if (i14 == 8) {
                y1Var.d(aVar);
                y1Var.l(aVar.f19314b, aVar.f19316d);
            }
        }
        o(arrayList);
        this.f19326f = 0;
    }

    public final void f(a aVar) {
        int i13;
        int i14 = aVar.f19313a;
        if (i14 == 1 || i14 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int p13 = p(aVar.f19314b, i14);
        int i15 = aVar.f19314b;
        int i16 = aVar.f19313a;
        if (i16 == 2) {
            i13 = 0;
        } else {
            if (i16 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i13 = 1;
        }
        int i17 = 1;
        for (int i18 = 1; i18 < aVar.f19316d; i18++) {
            int p14 = p((i13 * i18) + aVar.f19314b, aVar.f19313a);
            int i19 = aVar.f19313a;
            if (i19 == 2 ? p14 != p13 : !(i19 == 4 && p14 == p13 + 1)) {
                a k13 = k(i19, p13, aVar.f19315c, i17);
                g(k13, i15);
                k13.f19315c = null;
                this.f19321a.a(k13);
                if (aVar.f19313a == 4) {
                    i15 += i17;
                }
                i17 = 1;
                p13 = p14;
            } else {
                i17++;
            }
        }
        Object obj = aVar.f19315c;
        aVar.f19315c = null;
        this.f19321a.a(aVar);
        if (i17 > 0) {
            a k14 = k(aVar.f19313a, p13, obj, i17);
            g(k14, i15);
            k14.f19315c = null;
            this.f19321a.a(k14);
        }
    }

    public final void g(a aVar, int i13) {
        y1 y1Var = this.f19324d;
        y1Var.d(aVar);
        int i14 = aVar.f19313a;
        if (i14 != 2) {
            if (i14 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            y1Var.h(i13, aVar.f19315c, aVar.f19316d);
            return;
        }
        int i15 = aVar.f19316d;
        RecyclerView recyclerView = (RecyclerView) y1Var.f19715a;
        recyclerView.b2(i13, i15, true);
        recyclerView.f19235j0 = true;
        recyclerView.f19231h0.f19679c += i15;
    }

    public final int h(int i13, int i14) {
        ArrayList arrayList = this.f19323c;
        int size = arrayList.size();
        while (i14 < size) {
            a aVar = (a) arrayList.get(i14);
            int i15 = aVar.f19313a;
            if (i15 == 8) {
                int i16 = aVar.f19314b;
                if (i16 == i13) {
                    i13 = aVar.f19316d;
                } else {
                    if (i16 < i13) {
                        i13--;
                    }
                    if (aVar.f19316d <= i13) {
                        i13++;
                    }
                }
            } else {
                int i17 = aVar.f19314b;
                if (i17 > i13) {
                    continue;
                } else if (i15 == 2) {
                    int i18 = aVar.f19316d;
                    if (i13 < i17 + i18) {
                        return -1;
                    }
                    i13 -= i18;
                } else if (i15 == 1) {
                    i13 += aVar.f19316d;
                }
            }
            i14++;
        }
        return i13;
    }

    public final boolean i() {
        return this.f19322b.size() > 0;
    }

    public final boolean j() {
        return (this.f19323c.isEmpty() || this.f19322b.isEmpty()) ? false : true;
    }

    public final a k(int i13, int i14, Object obj, int i15) {
        a aVar = (a) this.f19321a.b();
        if (aVar != null) {
            aVar.f19313a = i13;
            aVar.f19314b = i14;
            aVar.f19316d = i15;
            aVar.f19315c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f19313a = i13;
        aVar2.f19314b = i14;
        aVar2.f19316d = i15;
        aVar2.f19315c = obj;
        return aVar2;
    }

    public final void l(a aVar) {
        this.f19323c.add(aVar);
        int i13 = aVar.f19313a;
        y1 y1Var = this.f19324d;
        if (i13 == 1) {
            y1Var.k(aVar.f19314b, aVar.f19316d);
            return;
        }
        if (i13 == 2) {
            int i14 = aVar.f19314b;
            int i15 = aVar.f19316d;
            RecyclerView recyclerView = (RecyclerView) y1Var.f19715a;
            recyclerView.b2(i14, i15, false);
            recyclerView.f19235j0 = true;
            return;
        }
        if (i13 == 4) {
            y1Var.h(aVar.f19314b, aVar.f19315c, aVar.f19316d);
        } else if (i13 == 8) {
            y1Var.l(aVar.f19314b, aVar.f19316d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.m():void");
    }

    public final void n(a aVar) {
        aVar.f19315c = null;
        this.f19321a.a(aVar);
    }

    public final void o(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            n((a) arrayList.get(i13));
        }
        arrayList.clear();
    }

    public final int p(int i13, int i14) {
        int i15;
        int i16;
        ArrayList arrayList = this.f19323c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i17 = aVar.f19313a;
            if (i17 == 8) {
                int i18 = aVar.f19314b;
                int i19 = aVar.f19316d;
                if (i18 < i19) {
                    i16 = i18;
                    i15 = i19;
                } else {
                    i15 = i18;
                    i16 = i19;
                }
                if (i13 < i16 || i13 > i15) {
                    if (i13 < i18) {
                        if (i14 == 1) {
                            aVar.f19314b = i18 + 1;
                            aVar.f19316d = i19 + 1;
                        } else if (i14 == 2) {
                            aVar.f19314b = i18 - 1;
                            aVar.f19316d = i19 - 1;
                        }
                    }
                } else if (i16 == i18) {
                    if (i14 == 1) {
                        aVar.f19316d = i19 + 1;
                    } else if (i14 == 2) {
                        aVar.f19316d = i19 - 1;
                    }
                    i13++;
                } else {
                    if (i14 == 1) {
                        aVar.f19314b = i18 + 1;
                    } else if (i14 == 2) {
                        aVar.f19314b = i18 - 1;
                    }
                    i13--;
                }
            } else {
                int i23 = aVar.f19314b;
                if (i23 <= i13) {
                    if (i17 == 1) {
                        i13 -= aVar.f19316d;
                    } else if (i17 == 2) {
                        i13 += aVar.f19316d;
                    }
                } else if (i14 == 1) {
                    aVar.f19314b = i23 + 1;
                } else if (i14 == 2) {
                    aVar.f19314b = i23 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f19313a == 8) {
                int i24 = aVar2.f19316d;
                if (i24 == aVar2.f19314b || i24 < 0) {
                    arrayList.remove(size2);
                    n(aVar2);
                }
            } else if (aVar2.f19316d <= 0) {
                arrayList.remove(size2);
                n(aVar2);
            }
        }
        return i13;
    }
}
