package c02;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.f2;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.y2;
import ja.c0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class u extends g2 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f24460g;

    /* renamed from: h, reason: collision with root package name */
    public final t f24461h;

    /* renamed from: i, reason: collision with root package name */
    public final l f24462i;

    /* renamed from: j, reason: collision with root package name */
    public final p f24463j;

    /* renamed from: k, reason: collision with root package name */
    public final r f24464k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f24465l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f24466m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f24467n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f24468o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f24469p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f24470q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f24471r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f24472s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f24473t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f24474u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f24475v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f24476w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f24477x;

    /* JADX WARN: Multi-variable type inference failed */
    public u(t tVar, l lVar, p pVar, r rVar, c0 c0Var) {
        this.f24460g = true;
        this.f24466m = new ArrayList();
        this.f24467n = new ArrayList();
        this.f24468o = new ArrayList();
        this.f24469p = new ArrayList();
        this.f24470q = new ArrayList();
        this.f24471r = new ArrayList();
        this.f24472s = new ArrayList();
        this.f24473t = new ArrayList();
        this.f24474u = new ArrayList();
        this.f24475v = new ArrayList();
        this.f24476w = new ArrayList();
        this.f24477x = new ArrayList();
        this.f24461h = tVar;
        this.f24462i = lVar;
        this.f24463j = pVar;
        this.f24464k = rVar;
        this.f24465l = c0Var;
        this.f19422d = ((q7.s) tVar).f102678a;
        this.f19421c = lVar.getDuration();
        this.f19424f = ((q7.s) pVar).f102678a;
        this.f19423e = ((q7.s) rVar).f102678a;
    }

    public static void p(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((y2) arrayList.get(size)).f19717a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean a(y2 y2Var, f2 f2Var, f2 f2Var2) {
        int i13;
        int i14;
        if (f2Var != null && ((i13 = f2Var.f19405b) != (i14 = f2Var2.f19405b) || f2Var.f19406c != f2Var2.f19406c)) {
            return o(y2Var, i13, f2Var.f19406c, i14, f2Var2.f19406c);
        }
        j(y2Var);
        this.f24462i.f(y2Var);
        this.f24467n.add(y2Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean b(y2 y2Var, y2 y2Var2, f2 f2Var, f2 f2Var2) {
        int i13 = f2Var.f19405b;
        int i14 = f2Var.f19406c;
        int i15 = f2Var2.f19405b;
        int i16 = f2Var2.f19406c;
        if (y2Var == y2Var2) {
            return o(y2Var, i13, i14, i15, i16);
        }
        View view = y2Var.f19717a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float alpha = view.getAlpha();
        j(y2Var);
        view.setAlpha(alpha);
        view.setScaleY(scaleY);
        view.setScaleX(scaleX);
        view.setTranslationY(translationY);
        view.setTranslationX(translationX);
        int i17 = (int) ((i15 - i13) - translationX);
        int i18 = (int) ((i16 - i14) - translationY);
        j(y2Var2);
        View view2 = y2Var2.f19717a;
        view2.setTranslationX(-i17);
        view2.setTranslationY(-i18);
        p pVar = this.f24463j;
        pVar.i(y2Var, true);
        pVar.i(y2Var2, false);
        this.f24469p.add(new q(y2Var, y2Var2, i13, i14, i15, i16));
        return true;
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean c(y2 y2Var, f2 f2Var, f2 f2Var2) {
        int i13 = f2Var.f19405b;
        int i14 = f2Var.f19406c;
        View view = y2Var.f19717a;
        if (f2Var2 == null) {
            j(y2Var);
            this.f24461h.getClass();
            this.f24466m.add(y2Var);
            return true;
        }
        int i15 = f2Var2.f19405b;
        int i16 = f2Var2.f19406c;
        view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
        return o(y2Var, i13, i14, i15, i16);
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean d(y2 y2Var, f2 f2Var, f2 f2Var2) {
        int i13 = f2Var.f19405b;
        int i14 = f2Var2.f19405b;
        if (i13 != i14 || f2Var.f19406c != f2Var2.f19406c) {
            return o(y2Var, i13, f2Var.f19406c, i14, f2Var2.f19406c);
        }
        h(y2Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean f(y2 y2Var) {
        return !this.f24460g;
    }

    @Override // androidx.recyclerview.widget.g2
    public final void j(y2 y2Var) {
        r rVar;
        y2Var.f19717a.animate().cancel();
        ArrayList arrayList = this.f24468o;
        int size = arrayList.size() - 1;
        while (true) {
            rVar = this.f24464k;
            if (size < 0) {
                break;
            }
            if (((s) arrayList.get(size)).f24455a == y2Var) {
                rVar.m(y2Var, 0, 0, true);
                h(y2Var);
                arrayList.remove(size);
                break;
            }
            size--;
        }
        t(y2Var, this.f24469p);
        boolean remove = this.f24466m.remove(y2Var);
        t tVar = this.f24461h;
        if (remove) {
            tVar.d(y2Var);
            h(y2Var);
        }
        boolean remove2 = this.f24467n.remove(y2Var);
        l lVar = this.f24462i;
        if (remove2) {
            lVar.d(y2Var);
            h(y2Var);
        }
        ArrayList arrayList2 = this.f24474u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            List list = (List) arrayList2.get(size2);
            int size3 = list.size() - 1;
            while (true) {
                if (size3 < 0) {
                    break;
                }
                if (((s) list.get(size3)).f24455a == y2Var) {
                    rVar.m(y2Var, 0, 0, true);
                    h(y2Var);
                    list.remove(size3);
                    if (list.isEmpty()) {
                        arrayList2.remove(size2);
                    }
                } else {
                    size3--;
                }
            }
        }
        ArrayList arrayList3 = this.f24475v;
        for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
            List list2 = (List) arrayList3.get(size4);
            t(y2Var, list2);
            if (list2.isEmpty()) {
                arrayList3.remove(size4);
            }
        }
        ArrayList arrayList4 = this.f24477x;
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            List list3 = (List) arrayList4.get(size5);
            if (list3.remove(y2Var)) {
                tVar.d(y2Var);
                h(y2Var);
                if (list3.isEmpty()) {
                    arrayList4.remove(size5);
                }
            }
        }
        ArrayList arrayList5 = this.f24476w;
        for (int size6 = arrayList5.size() - 1; size6 >= 0; size6--) {
            List list4 = (List) arrayList5.get(size6);
            if (list4.remove(y2Var)) {
                lVar.d(y2Var);
                h(y2Var);
                if (list4.isEmpty()) {
                    arrayList5.remove(size6);
                }
            }
        }
        q();
    }

    @Override // androidx.recyclerview.widget.g2
    public final void k() {
        r rVar;
        t tVar;
        l lVar;
        ArrayList arrayList = this.f24468o;
        int size = arrayList.size() - 1;
        while (true) {
            rVar = this.f24464k;
            if (size < 0) {
                break;
            }
            y2 y2Var = ((s) arrayList.get(size)).f24455a;
            rVar.m(y2Var, 0, 0, true);
            h(y2Var);
            arrayList.remove(size);
            size--;
        }
        ArrayList arrayList2 = this.f24469p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            r((q) arrayList2.get(size2));
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f24466m;
        int size3 = arrayList3.size() - 1;
        while (true) {
            tVar = this.f24461h;
            if (size3 < 0) {
                break;
            }
            y2 y2Var2 = (y2) arrayList3.get(size3);
            tVar.d(y2Var2);
            h(y2Var2);
            arrayList3.remove(size3);
            size3--;
        }
        ArrayList arrayList4 = this.f24467n;
        int size4 = arrayList4.size() - 1;
        while (true) {
            lVar = this.f24462i;
            if (size4 < 0) {
                break;
            }
            y2 y2Var3 = (y2) arrayList4.get(size4);
            lVar.d(y2Var3);
            h(y2Var3);
            arrayList4.remove(size4);
            size4--;
        }
        ArrayList arrayList5 = this.f24474u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            List list = (List) arrayList5.get(size5);
            for (int size6 = list.size() - 1; size6 >= 0; size6--) {
                y2 y2Var4 = ((s) list.get(size6)).f24455a;
                rVar.m(y2Var4, 0, 0, true);
                h(y2Var4);
                list.remove(size6);
                if (list.isEmpty()) {
                    arrayList5.remove(list);
                }
            }
        }
        ArrayList arrayList6 = this.f24475v;
        for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
            List list2 = (List) arrayList6.get(size7);
            for (int size8 = list2.size() - 1; size8 >= 0; size8--) {
                r((q) list2.get(size8));
                if (list2.isEmpty()) {
                    arrayList6.remove(list2);
                }
            }
        }
        ArrayList arrayList7 = this.f24477x;
        for (int size9 = arrayList7.size() - 1; size9 >= 0; size9--) {
            List list3 = (List) arrayList7.get(size9);
            for (int size10 = list3.size() - 1; size10 >= 0; size10--) {
                y2 y2Var5 = (y2) list3.get(size10);
                tVar.d(y2Var5);
                h(y2Var5);
                list3.remove(size10);
                if (list3.isEmpty()) {
                    arrayList7.remove(list3);
                }
            }
        }
        ArrayList arrayList8 = this.f24476w;
        for (int size11 = arrayList8.size() - 1; size11 >= 0; size11--) {
            List list4 = (List) arrayList8.get(size11);
            for (int size12 = list4.size() - 1; size12 >= 0; size12--) {
                y2 y2Var6 = (y2) list4.get(size12);
                lVar.d(y2Var6);
                h(y2Var6);
                list4.remove(size12);
                if (list4.isEmpty()) {
                    arrayList8.remove(list4);
                }
            }
        }
        p(this.f24472s);
        p(this.f24473t);
        p(this.f24470q);
        p(this.f24471r);
        q();
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean l() {
        return (this.f24468o.isEmpty() && this.f24469p.isEmpty() && this.f24466m.isEmpty() && this.f24467n.isEmpty() && this.f24472s.isEmpty() && this.f24473t.isEmpty() && this.f24470q.isEmpty() && this.f24471r.isEmpty() && this.f24474u.isEmpty() && this.f24475v.isEmpty() && this.f24477x.isEmpty() && this.f24476w.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    @Override // androidx.recyclerview.widget.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c02.u.m():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(q qVar, y2 y2Var, View view, boolean z13) {
        this.f24473t.add(y2Var);
        ViewPropertyAnimator animate = view.animate();
        p pVar = this.f24463j;
        ViewPropertyAnimator C = pVar.C(animate, qVar, z13);
        q7.s sVar = (q7.s) pVar;
        C.setDuration(sVar.f102678a).setStartDelay(sVar.f102679b).setInterpolator((Interpolator) sVar.f102680c).setListener(new androidx.fragment.app.i(this, qVar, z13, C, y2Var)).start();
    }

    public final boolean o(y2 y2Var, int i13, int i14, int i15, int i16) {
        View view = y2Var.f19717a;
        int translationX = (int) (view.getTranslationX() + i13);
        int translationY = (int) (view.getTranslationY() + i14);
        j(y2Var);
        int i17 = i15 - translationX;
        int i18 = i16 - translationY;
        if (i17 == 0 && i18 == 0) {
            h(y2Var);
            return false;
        }
        if (i17 != 0) {
            view.setTranslationX(-i17);
        }
        if (i18 != 0) {
            view.setTranslationY(-i18);
        }
        s sVar = new s(y2Var, translationX, translationY, i15, i16);
        this.f24464k.getClass();
        this.f24468o.add(sVar);
        return true;
    }

    public final void q() {
        if (l()) {
            return;
        }
        i();
    }

    public final void r(q qVar) {
        y2 y2Var = qVar.f24449a;
        if (y2Var != null) {
            s(qVar, y2Var);
        }
        y2 y2Var2 = qVar.f24450b;
        if (y2Var2 != null) {
            s(qVar, y2Var2);
        }
    }

    public final boolean s(q qVar, y2 y2Var) {
        if (qVar.f24450b == y2Var) {
            qVar.f24450b = null;
        } else {
            if (qVar.f24449a != y2Var) {
                return false;
            }
            qVar.f24449a = null;
        }
        this.f24463j.s(y2Var);
        h(y2Var);
        return true;
    }

    public final void t(y2 y2Var, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            q qVar = (q) list.get(size);
            if (s(qVar, y2Var) && qVar.f24449a == null && qVar.f24450b == null) {
                list.remove(qVar);
            }
        }
    }

    public final void u(long j13) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f24469p;
        arrayList.addAll(arrayList2);
        this.f24475v.add(arrayList);
        arrayList2.clear();
        j jVar = new j(this, arrayList, 2);
        if (j13 <= 0) {
            jVar.run();
        } else if (((q) arrayList.get(0)).f24449a != null) {
            ((q) arrayList.get(0)).f24449a.f19717a.postOnAnimationDelayed(jVar, j13);
        }
    }

    public final void v(long j13) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f24468o;
        arrayList.addAll(arrayList2);
        this.f24474u.add(arrayList);
        arrayList2.clear();
        j jVar = new j(this, arrayList, 1);
        if (j13 > 0) {
            ((s) arrayList.get(0)).f24455a.f19717a.postOnAnimationDelayed(jVar, j13);
        } else {
            jVar.run();
        }
    }

    public final void w(long j13) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f24466m;
        arrayList.addAll(arrayList2);
        this.f24477x.add(arrayList);
        arrayList2.clear();
        j jVar = new j(this, arrayList, 0);
        if (j13 > 0) {
            ((y2) arrayList.get(0)).f19717a.postOnAnimationDelayed(jVar, j13);
        } else {
            jVar.run();
        }
    }

    public u() {
        this(new h(), new a(), new f(), new g(), i.f24442e);
    }
}
