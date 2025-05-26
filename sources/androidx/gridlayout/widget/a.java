package androidx.gridlayout.widget;

import android.util.LogPrinter;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.gridlayout.widget.GridLayout;
import ep.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o6.e;
import o6.f;
import o6.g;
import o6.h;
import o6.i;
import o6.j;
import o6.k;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18556a;

    /* renamed from: d, reason: collision with root package name */
    public d f18559d;

    /* renamed from: f, reason: collision with root package name */
    public d f18561f;

    /* renamed from: h, reason: collision with root package name */
    public d f18563h;

    /* renamed from: j, reason: collision with root package name */
    public int[] f18565j;

    /* renamed from: l, reason: collision with root package name */
    public int[] f18567l;

    /* renamed from: n, reason: collision with root package name */
    public e[] f18569n;

    /* renamed from: p, reason: collision with root package name */
    public int[] f18571p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18573r;

    /* renamed from: t, reason: collision with root package name */
    public int[] f18575t;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ GridLayout f18579x;

    /* renamed from: b, reason: collision with root package name */
    public int f18557b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f18558c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18560e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18562g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18564i = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18566k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18568m = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18570o = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18572q = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18574s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18576u = true;

    /* renamed from: v, reason: collision with root package name */
    public final j f18577v = new j(0);

    /* renamed from: w, reason: collision with root package name */
    public final j f18578w = new j(-100000);

    public a(GridLayout gridLayout, boolean z13) {
        this.f18579x = gridLayout;
        this.f18556a = z13;
    }

    public static void a(ArrayList arrayList, d dVar) {
        int i13 = 0;
        while (true) {
            i[] iVarArr = (i[]) ((Object[]) dVar.f15967c);
            if (i13 >= iVarArr.length) {
                return;
            }
            l(arrayList, iVarArr[i13], ((j[]) ((Object[]) dVar.f15968d))[i13], false);
            i13++;
        }
    }

    public static void l(ArrayList arrayList, i iVar, j jVar, boolean z13) {
        if (iVar.a() == 0) {
            return;
        }
        if (z13) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((e) it.next()).f92919a.equals(iVar)) {
                    return;
                }
            }
        }
        arrayList.add(new e(iVar, jVar));
    }

    public static boolean o(int[] iArr, e eVar) {
        if (!eVar.f92921c) {
            return false;
        }
        i iVar = eVar.f92919a;
        int i13 = iVar.f92932a;
        int i14 = iArr[i13] + eVar.f92920b.f92934a;
        int i15 = iVar.f92933b;
        if (i14 <= iArr[i15]) {
            return false;
        }
        iArr[i15] = i14;
        return true;
    }

    public final String b(ArrayList arrayList) {
        StringBuilder sb3;
        String str = this.f18556a ? "x" : "y";
        StringBuilder sb4 = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z13 = true;
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (z13) {
                z13 = false;
            } else {
                sb4.append(", ");
            }
            i iVar = eVar.f92919a;
            int i13 = iVar.f92932a;
            int i14 = eVar.f92920b.f92934a;
            int i15 = iVar.f92933b;
            if (i13 < i15) {
                sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i15);
                sb3.append("-");
                sb3.append(str);
                sb3.append(i13);
                sb3.append(">=");
            } else {
                sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i13);
                sb3.append("-");
                sb3.append(str);
                sb3.append(i15);
                sb3.append("<=");
                i14 = -i14;
            }
            sb3.append(i14);
            sb4.append(sb3.toString());
        }
        return sb4.toString();
    }

    public final void c(d dVar, boolean z13) {
        for (j jVar : (j[]) ((Object[]) dVar.f15968d)) {
            jVar.f92934a = Integer.MIN_VALUE;
        }
        h[] hVarArr = (h[]) ((Object[]) h().f15968d);
        for (int i13 = 0; i13 < hVarArr.length; i13++) {
            int d2 = hVarArr[i13].d(z13);
            j jVar2 = (j) dVar.z(i13);
            int i14 = jVar2.f92934a;
            if (!z13) {
                d2 = -d2;
            }
            jVar2.f92934a = Math.max(i14, d2);
        }
    }

    public final void d(boolean z13) {
        int[] iArr = z13 ? this.f18565j : this.f18567l;
        GridLayout gridLayout = this.f18579x;
        int childCount = gridLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = gridLayout.getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) childAt.getLayoutParams();
                boolean z14 = this.f18556a;
                i iVar = (z14 ? layoutParams.f18555b : layoutParams.f18554a).f92937b;
                int i14 = z13 ? iVar.f92932a : iVar.f92933b;
                iArr[i14] = Math.max(iArr[i14], gridLayout.j(childAt, z14, z13));
            }
        }
    }

    public final d e(boolean z13) {
        i iVar;
        f fVar = new f(i.class, j.class);
        k[] kVarArr = (k[]) ((Object[]) h().f15967c);
        int length = kVarArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (z13) {
                iVar = kVarArr[i13].f92937b;
            } else {
                i iVar2 = kVarArr[i13].f92937b;
                iVar = new i(iVar2.f92933b, iVar2.f92932a);
            }
            j jVar = new j();
            jVar.f92934a = Integer.MIN_VALUE;
            fVar.add(Pair.create(iVar, jVar));
        }
        return fVar.b();
    }

    public final e[] f() {
        if (this.f18569n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f18561f == null) {
                this.f18561f = e(true);
            }
            if (!this.f18562g) {
                c(this.f18561f, true);
                this.f18562g = true;
            }
            a(arrayList, this.f18561f);
            if (this.f18563h == null) {
                this.f18563h = e(false);
            }
            if (!this.f18564i) {
                c(this.f18563h, false);
                this.f18564i = true;
            }
            a(arrayList2, this.f18563h);
            if (this.f18576u) {
                int i13 = 0;
                while (i13 < g()) {
                    int i14 = i13 + 1;
                    l(arrayList, new i(i13, i14), new j(0), true);
                    i13 = i14;
                }
            }
            int g13 = g();
            l(arrayList, new i(0, g13), this.f18577v, false);
            l(arrayList2, new i(g13, 0), this.f18578w, false);
            e[] s13 = s(arrayList);
            e[] s14 = s(arrayList2);
            LogPrinter logPrinter = GridLayout.f18515i;
            Object[] objArr = (Object[]) Array.newInstance(s13.getClass().getComponentType(), s13.length + s14.length);
            System.arraycopy(s13, 0, objArr, 0, s13.length);
            System.arraycopy(s14, 0, objArr, s13.length, s14.length);
            this.f18569n = (e[]) objArr;
        }
        if (!this.f18570o) {
            if (this.f18561f == null) {
                this.f18561f = e(true);
            }
            if (!this.f18562g) {
                c(this.f18561f, true);
                this.f18562g = true;
            }
            if (this.f18563h == null) {
                this.f18563h = e(false);
            }
            if (!this.f18564i) {
                c(this.f18563h, false);
                this.f18564i = true;
            }
            this.f18570o = true;
        }
        return this.f18569n;
    }

    public final int g() {
        return Math.max(this.f18557b, j());
    }

    public final d h() {
        int i13;
        int i14;
        d dVar = this.f18559d;
        boolean z13 = this.f18556a;
        GridLayout gridLayout = this.f18579x;
        if (dVar == null) {
            f fVar = new f(k.class, h.class);
            int childCount = gridLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) gridLayout.getChildAt(i15).getLayoutParams();
                k kVar = z13 ? layoutParams.f18555b : layoutParams.f18554a;
                fVar.add(Pair.create(kVar, kVar.a(z13).f()));
            }
            this.f18559d = fVar.b();
        }
        if (!this.f18560e) {
            for (h hVar : (h[]) ((Object[]) this.f18559d.f15968d)) {
                hVar.c();
            }
            int childCount2 = gridLayout.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = gridLayout.getChildAt(i16);
                GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) childAt.getLayoutParams();
                k kVar2 = z13 ? layoutParams2.f18555b : layoutParams2.f18554a;
                if (childAt.getVisibility() == 8) {
                    i13 = 0;
                } else {
                    LogPrinter logPrinter = GridLayout.f18515i;
                    i13 = gridLayout.i(childAt, z13, false) + gridLayout.i(childAt, z13, true) + (z13 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (kVar2.f92939d == 0.0f) {
                    i14 = 0;
                } else {
                    if (this.f18575t == null) {
                        this.f18575t = new int[gridLayout.getChildCount()];
                    }
                    i14 = this.f18575t[i16];
                }
                int i17 = i13 + i14;
                h hVar2 = (h) this.f18559d.z(i16);
                hVar2.f92931c = ((kVar2.f92938c == GridLayout.f18523q && kVar2.f92939d == 0.0f) ? 0 : 2) & hVar2.f92931c;
                int e13 = kVar2.a(z13).e(childAt, i17, gridLayout.getLayoutMode());
                hVar2.b(e13, i17 - e13);
            }
            this.f18560e = true;
        }
        return this.f18559d;
    }

    public final int[] i() {
        boolean z13;
        if (this.f18571p == null) {
            this.f18571p = new int[g() + 1];
        }
        if (!this.f18572q) {
            int[] iArr = this.f18571p;
            boolean z14 = this.f18574s;
            GridLayout gridLayout = this.f18579x;
            float f13 = 0.0f;
            boolean z15 = this.f18556a;
            if (!z14) {
                int childCount = gridLayout.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        z13 = false;
                        break;
                    }
                    View childAt = gridLayout.getChildAt(i13);
                    if (childAt.getVisibility() != 8) {
                        GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) childAt.getLayoutParams();
                        if ((z15 ? layoutParams.f18555b : layoutParams.f18554a).f92939d != 0.0f) {
                            z13 = true;
                            break;
                        }
                    }
                    i13++;
                }
                this.f18573r = z13;
                this.f18574s = true;
            }
            if (this.f18573r) {
                if (this.f18575t == null) {
                    this.f18575t = new int[gridLayout.getChildCount()];
                }
                Arrays.fill(this.f18575t, 0);
                r(f(), iArr, true);
                int childCount2 = (gridLayout.getChildCount() * this.f18577v.f92934a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt2 = gridLayout.getChildAt(i14);
                        if (childAt2.getVisibility() != 8) {
                            GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) childAt2.getLayoutParams();
                            f13 += (z15 ? layoutParams2.f18555b : layoutParams2.f18554a).f92939d;
                        }
                    }
                    int i15 = -1;
                    boolean z16 = true;
                    int i16 = 0;
                    while (i16 < childCount2) {
                        int i17 = (int) ((i16 + childCount2) / 2);
                        n();
                        q(i17, f13);
                        boolean r13 = r(f(), iArr, false);
                        if (r13) {
                            i16 = i17 + 1;
                            i15 = i17;
                        } else {
                            childCount2 = i17;
                        }
                        z16 = r13;
                    }
                    if (i15 > 0 && !z16) {
                        n();
                        q(i15, f13);
                        r(f(), iArr, true);
                    }
                }
            } else {
                r(f(), iArr, true);
            }
            if (!this.f18576u) {
                int i18 = iArr[0];
                int length = iArr.length;
                for (int i19 = 0; i19 < length; i19++) {
                    iArr[i19] = iArr[i19] - i18;
                }
            }
            this.f18572q = true;
        }
        return this.f18571p;
    }

    public final int j() {
        if (this.f18558c == Integer.MIN_VALUE) {
            GridLayout gridLayout = this.f18579x;
            int childCount = gridLayout.getChildCount();
            int i13 = -1;
            for (int i14 = 0; i14 < childCount; i14++) {
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) gridLayout.getChildAt(i14).getLayoutParams();
                i iVar = (this.f18556a ? layoutParams.f18555b : layoutParams.f18554a).f92937b;
                i13 = Math.max(Math.max(Math.max(i13, iVar.f92932a), iVar.f92933b), iVar.a());
            }
            this.f18558c = Math.max(0, i13 != -1 ? i13 : Integer.MIN_VALUE);
        }
        return this.f18558c;
    }

    public final int k(int i13) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        if (mode == Integer.MIN_VALUE) {
            this.f18577v.f92934a = 0;
            this.f18578w.f92934a = -size;
            this.f18572q = false;
            return i()[g()];
        }
        if (mode == 0) {
            this.f18577v.f92934a = 0;
            this.f18578w.f92934a = -100000;
            this.f18572q = false;
            return i()[g()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        this.f18577v.f92934a = size;
        this.f18578w.f92934a = -size;
        this.f18572q = false;
        return i()[g()];
    }

    public final void m() {
        this.f18558c = Integer.MIN_VALUE;
        this.f18559d = null;
        this.f18561f = null;
        this.f18563h = null;
        this.f18565j = null;
        this.f18567l = null;
        this.f18569n = null;
        this.f18571p = null;
        this.f18575t = null;
        this.f18574s = false;
        n();
    }

    public final void n() {
        this.f18560e = false;
        this.f18562g = false;
        this.f18564i = false;
        this.f18566k = false;
        this.f18568m = false;
        this.f18570o = false;
        this.f18572q = false;
    }

    public final void p(int i13) {
        if (i13 == Integer.MIN_VALUE || i13 >= j()) {
            this.f18557b = i13;
        } else {
            GridLayout.k((this.f18556a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void q(int i13, float f13) {
        Arrays.fill(this.f18575t, 0);
        GridLayout gridLayout = this.f18579x;
        int childCount = gridLayout.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = gridLayout.getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) childAt.getLayoutParams();
                float f14 = (this.f18556a ? layoutParams.f18555b : layoutParams.f18554a).f92939d;
                if (f14 != 0.0f) {
                    int round = Math.round((i13 * f14) / f13);
                    this.f18575t[i14] = round;
                    i13 -= round;
                    f13 -= f14;
                }
            }
        }
    }

    public final boolean r(e[] eVarArr, int[] iArr, boolean z13) {
        String str = this.f18556a ? "horizontal" : "vertical";
        int g13 = g() + 1;
        boolean[] zArr = null;
        for (int i13 = 0; i13 < eVarArr.length; i13++) {
            Arrays.fill(iArr, 0);
            for (int i14 = 0; i14 < g13; i14++) {
                boolean z14 = false;
                for (e eVar : eVarArr) {
                    z14 |= o(iArr, eVar);
                }
                if (!z14) {
                    if (zArr != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < eVarArr.length; i15++) {
                            e eVar2 = eVarArr[i15];
                            if (zArr[i15]) {
                                arrayList.add(eVar2);
                            }
                            if (!eVar2.f92921c) {
                                arrayList2.add(eVar2);
                            }
                        }
                        LogPrinter logPrinter = this.f18579x.f18540h;
                        StringBuilder D = b.D(str, " constraints: ");
                        D.append(b(arrayList));
                        D.append(" are inconsistent; permanently removing: ");
                        D.append(b(arrayList2));
                        D.append(". ");
                        logPrinter.println(D.toString());
                    }
                    return true;
                }
            }
            if (!z13) {
                return false;
            }
            boolean[] zArr2 = new boolean[eVarArr.length];
            for (int i16 = 0; i16 < g13; i16++) {
                int length = eVarArr.length;
                for (int i17 = 0; i17 < length; i17++) {
                    zArr2[i17] = zArr2[i17] | o(iArr, eVarArr[i17]);
                }
            }
            if (i13 == 0) {
                zArr = zArr2;
            }
            int i18 = 0;
            while (true) {
                if (i18 >= eVarArr.length) {
                    break;
                }
                if (zArr2[i18]) {
                    e eVar3 = eVarArr[i18];
                    i iVar = eVar3.f92919a;
                    if (iVar.f92932a >= iVar.f92933b) {
                        eVar3.f92921c = false;
                        break;
                    }
                }
                i18++;
            }
        }
        return true;
    }

    public final e[] s(ArrayList arrayList) {
        g gVar = new g(this, (e[]) arrayList.toArray(new e[arrayList.size()]));
        int length = gVar.f92926c.length;
        for (int i13 = 0; i13 < length; i13++) {
            gVar.a(i13);
        }
        return gVar.f92924a;
    }
}
