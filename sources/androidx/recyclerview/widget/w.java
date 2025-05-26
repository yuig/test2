package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final List f19659a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f19660b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f19661c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f19662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19663e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19664f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19665g;

    public w(a0 a0Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        a0 a0Var2;
        int i13;
        v vVar;
        int i14;
        this.f19659a = arrayList;
        this.f19660b = iArr;
        this.f19661c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f19662d = a0Var;
        int i15 = a0Var.i();
        this.f19663e = i15;
        int h10 = a0Var.h();
        this.f19664f = h10;
        this.f19665g = true;
        v vVar2 = arrayList.isEmpty() ? null : (v) arrayList.get(0);
        if (vVar2 == null || vVar2.f19647a != 0 || vVar2.f19648b != 0) {
            arrayList.add(0, new v(0, 0, 0));
        }
        arrayList.add(new v(i15, h10, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iArr3 = this.f19661c;
            iArr4 = this.f19660b;
            a0Var2 = this.f19662d;
            if (!hasNext) {
                break;
            }
            v vVar3 = (v) it.next();
            for (int i16 = 0; i16 < vVar3.f19649c; i16++) {
                int i17 = vVar3.f19647a + i16;
                int i18 = vVar3.f19648b + i16;
                int i19 = a0Var2.a(i17, i18) ? 1 : 2;
                iArr4[i17] = (i18 << 4) | i19;
                iArr3[i18] = (i17 << 4) | i19;
            }
        }
        if (this.f19665g) {
            Iterator it2 = arrayList.iterator();
            int i23 = 0;
            while (it2.hasNext()) {
                v vVar4 = (v) it2.next();
                while (true) {
                    i13 = vVar4.f19647a;
                    if (i23 < i13) {
                        if (iArr4[i23] == 0) {
                            int size = arrayList.size();
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                if (i24 < size) {
                                    vVar = (v) arrayList.get(i24);
                                    while (true) {
                                        i14 = vVar.f19648b;
                                        if (i25 < i14) {
                                            if (iArr3[i25] == 0 && a0Var2.c(i23, i25)) {
                                                int i26 = a0Var2.a(i23, i25) ? 8 : 4;
                                                iArr4[i23] = (i25 << 4) | i26;
                                                iArr3[i25] = i26 | (i23 << 4);
                                            } else {
                                                i25++;
                                            }
                                        }
                                    }
                                }
                                i25 = vVar.f19649c + i14;
                                i24++;
                            }
                        }
                        i23++;
                    }
                }
                i23 = vVar4.f19649c + i13;
            }
        }
    }

    public static x c(ArrayDeque arrayDeque, int i13, boolean z13) {
        x xVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                xVar = null;
                break;
            }
            xVar = (x) it.next();
            if (xVar.f19691a == i13 && xVar.f19693c == z13) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            x xVar2 = (x) it.next();
            if (z13) {
                xVar2.f19692b--;
            } else {
                xVar2.f19692b++;
            }
        }
        return xVar;
    }

    public final void a(g1 g1Var) {
        int[] iArr;
        a0 a0Var;
        int i13;
        int i14;
        List list;
        int i15;
        w wVar = this;
        g gVar = g1Var instanceof g ? (g) g1Var : new g(g1Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        List list2 = wVar.f19659a;
        int size = list2.size() - 1;
        int i16 = wVar.f19663e;
        int i17 = wVar.f19664f;
        int i18 = i16;
        while (size >= 0) {
            v vVar = (v) list2.get(size);
            int i19 = vVar.f19647a;
            int i23 = vVar.f19649c;
            int i24 = i19 + i23;
            int i25 = vVar.f19648b;
            int i26 = i25 + i23;
            while (true) {
                iArr = wVar.f19660b;
                a0Var = wVar.f19662d;
                i13 = 0;
                if (i18 <= i24) {
                    break;
                }
                i18--;
                int i27 = iArr[i18];
                if ((i27 & 12) != 0) {
                    list = list2;
                    int i28 = i27 >> 4;
                    x c13 = c(arrayDeque, i28, false);
                    if (c13 != null) {
                        i15 = i17;
                        int i29 = (i16 - c13.f19692b) - 1;
                        gVar.q(i18, i29);
                        if ((i27 & 4) != 0) {
                            gVar.p(i29, a0Var.f(i18, i28), 1);
                        }
                    } else {
                        i15 = i17;
                        arrayDeque.add(new x(i18, (i16 - i18) - 1, true));
                    }
                } else {
                    list = list2;
                    i15 = i17;
                    gVar.m(i18, 1);
                    i16--;
                }
                list2 = list;
                i17 = i15;
            }
            List list3 = list2;
            while (i17 > i26) {
                i17--;
                int i33 = wVar.f19661c[i17];
                if ((i33 & 12) != 0) {
                    int i34 = i33 >> 4;
                    x c14 = c(arrayDeque, i34, true);
                    if (c14 == null) {
                        arrayDeque.add(new x(i17, i16 - i18, false));
                        i14 = 0;
                    } else {
                        i14 = 0;
                        gVar.q((i16 - c14.f19692b) - 1, i18);
                        if ((i33 & 4) != 0) {
                            gVar.p(i18, a0Var.f(i34, i17), 1);
                        }
                    }
                } else {
                    i14 = i13;
                    gVar.j(i18, 1);
                    i16++;
                }
                wVar = this;
                i13 = i14;
            }
            i18 = vVar.f19647a;
            int i35 = i18;
            int i36 = i25;
            while (i13 < i23) {
                if ((iArr[i35] & 15) == 2) {
                    gVar.p(i35, a0Var.f(i35, i36), 1);
                }
                i35++;
                i36++;
                i13++;
            }
            size--;
            wVar = this;
            i17 = i25;
            list2 = list3;
        }
        gVar.a();
    }

    public final void b(b2 b2Var) {
        a(new androidx.appcompat.widget.q(b2Var, 0));
    }
}
