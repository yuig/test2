package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s extends g2 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f19617s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19618g = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f19619h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f19620i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f19621j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f19622k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f19623l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f19624m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f19625n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f19626o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f19627p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f19628q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f19629r = new ArrayList();

    public static void o(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((y2) arrayList.get(size)).f19717a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean a(y2 y2Var, f2 f2Var, f2 f2Var2) {
        int i13;
        int i14;
        if (f2Var != null && ((i13 = f2Var.f19405b) != (i14 = f2Var2.f19405b) || f2Var.f19406c != f2Var2.f19406c)) {
            return n(y2Var, i13, f2Var.f19406c, i14, f2Var2.f19406c);
        }
        t(y2Var);
        y2Var.f19717a.setAlpha(0.0f);
        this.f19620i.add(y2Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean b(y2 y2Var, y2 y2Var2, f2 f2Var, f2 f2Var2) {
        int i13;
        int i14;
        int i15 = f2Var.f19405b;
        int i16 = f2Var.f19406c;
        if (y2Var2.d0()) {
            int i17 = f2Var.f19405b;
            i14 = f2Var.f19406c;
            i13 = i17;
        } else {
            i13 = f2Var2.f19405b;
            i14 = f2Var2.f19406c;
        }
        if (y2Var == y2Var2) {
            return n(y2Var, i15, i16, i13, i14);
        }
        View view = y2Var.f19717a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        t(y2Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        t(y2Var2);
        float f13 = -((int) ((i13 - i15) - translationX));
        View view2 = y2Var2.f19717a;
        view2.setTranslationX(f13);
        view2.setTranslationY(-((int) ((i14 - i16) - translationY)));
        view2.setAlpha(0.0f);
        this.f19622k.add(new q(y2Var, y2Var2, i15, i16, i13, i14));
        return true;
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean c(y2 y2Var, f2 f2Var, f2 f2Var2) {
        int i13 = f2Var.f19405b;
        int i14 = f2Var.f19406c;
        View view = y2Var.f19717a;
        int left = f2Var2 == null ? view.getLeft() : f2Var2.f19405b;
        int top = f2Var2 == null ? view.getTop() : f2Var2.f19406c;
        if (!y2Var.z() && (i13 != left || i14 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return n(y2Var, i13, i14, left, top);
        }
        t(y2Var);
        this.f19619h.add(y2Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean d(y2 y2Var, f2 f2Var, f2 f2Var2) {
        int i13 = f2Var.f19405b;
        int i14 = f2Var2.f19405b;
        if (i13 != i14 || f2Var.f19406c != f2Var2.f19406c) {
            return n(y2Var, i13, f2Var.f19406c, i14, f2Var2.f19406c);
        }
        h(y2Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean f(y2 y2Var) {
        return !this.f19618g || y2Var.t();
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean g(y2 y2Var, List list) {
        return !list.isEmpty() || f(y2Var);
    }

    @Override // androidx.recyclerview.widget.g2
    public final void j(y2 y2Var) {
        View view = y2Var.f19717a;
        view.animate().cancel();
        ArrayList arrayList = this.f19621j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((r) arrayList.get(size)).f19611a == y2Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(y2Var);
                arrayList.remove(size);
            }
        }
        q(y2Var, this.f19622k);
        if (this.f19619h.remove(y2Var)) {
            view.setAlpha(1.0f);
            h(y2Var);
        }
        if (this.f19620i.remove(y2Var)) {
            view.setAlpha(1.0f);
            h(y2Var);
        }
        ArrayList arrayList2 = this.f19625n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            q(y2Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f19624m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((r) arrayList5.get(size4)).f19611a == y2Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(y2Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f19623l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(y2Var)) {
                view.setAlpha(1.0f);
                h(y2Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f19628q.remove(y2Var);
        this.f19626o.remove(y2Var);
        this.f19629r.remove(y2Var);
        this.f19627p.remove(y2Var);
        p();
    }

    @Override // androidx.recyclerview.widget.g2
    public final void k() {
        ArrayList arrayList = this.f19621j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            r rVar = (r) arrayList.get(size);
            View view = rVar.f19611a.f19717a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(rVar.f19611a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f19619h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h((y2) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f19620i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            y2 y2Var = (y2) arrayList3.get(size3);
            y2Var.f19717a.setAlpha(1.0f);
            h(y2Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f19622k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            r((q) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (l()) {
            ArrayList arrayList5 = this.f19624m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    r rVar2 = (r) arrayList6.get(size6);
                    View view2 = rVar2.f19611a.f19717a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(rVar2.f19611a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f19623l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    y2 y2Var2 = (y2) arrayList8.get(size8);
                    y2Var2.f19717a.setAlpha(1.0f);
                    h(y2Var2);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f19625n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    r((q) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            o(this.f19628q);
            o(this.f19627p);
            o(this.f19626o);
            o(this.f19629r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.g2
    public final boolean l() {
        return (this.f19620i.isEmpty() && this.f19622k.isEmpty() && this.f19621j.isEmpty() && this.f19619h.isEmpty() && this.f19627p.isEmpty() && this.f19628q.isEmpty() && this.f19626o.isEmpty() && this.f19629r.isEmpty() && this.f19624m.isEmpty() && this.f19623l.isEmpty() && this.f19625n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.g2
    public final void m() {
        ArrayList arrayList = this.f19619h;
        int i13 = 1;
        boolean z13 = !arrayList.isEmpty();
        ArrayList arrayList2 = this.f19621j;
        boolean z14 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.f19622k;
        boolean z15 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.f19620i;
        boolean z16 = !arrayList4.isEmpty();
        if (z13 || z14 || z16 || z15) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y2 y2Var = (y2) it.next();
                View view = y2Var.f19717a;
                ViewPropertyAnimator animate = view.animate();
                this.f19628q.add(y2Var);
                animate.setDuration(this.f19422d).alpha(0.0f).setListener(new n(this, y2Var, animate, view)).start();
            }
            arrayList.clear();
            int i14 = 0;
            if (z14) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f19624m.add(arrayList5);
                arrayList2.clear();
                m mVar = new m(this, arrayList5, i14);
                if (z13) {
                    View view2 = ((r) arrayList5.get(0)).f19611a.f19717a;
                    long j13 = this.f19422d;
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    view2.postOnAnimationDelayed(mVar, j13);
                } else {
                    mVar.run();
                }
            }
            if (z15) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.f19625n.add(arrayList6);
                arrayList3.clear();
                m mVar2 = new m(this, arrayList6, i13);
                if (z13) {
                    View view3 = ((q) arrayList6.get(0)).f19563a.f19717a;
                    long j14 = this.f19422d;
                    WeakHashMap weakHashMap2 = q5.v0.f102521a;
                    view3.postOnAnimationDelayed(mVar2, j14);
                } else {
                    mVar2.run();
                }
            }
            if (z16) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f19623l.add(arrayList7);
                arrayList4.clear();
                m mVar3 = new m(this, arrayList7, 2);
                if (!z13 && !z14 && !z15) {
                    mVar3.run();
                    return;
                }
                long max = Math.max(z14 ? this.f19423e : 0L, z15 ? this.f19424f : 0L) + (z13 ? this.f19422d : 0L);
                View view4 = ((y2) arrayList7.get(0)).f19717a;
                WeakHashMap weakHashMap3 = q5.v0.f102521a;
                view4.postOnAnimationDelayed(mVar3, max);
            }
        }
    }

    public final boolean n(y2 y2Var, int i13, int i14, int i15, int i16) {
        View view = y2Var.f19717a;
        int translationX = i13 + ((int) view.getTranslationX());
        int translationY = i14 + ((int) y2Var.f19717a.getTranslationY());
        t(y2Var);
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
        this.f19621j.add(new r(y2Var, translationX, translationY, i15, i16));
        return true;
    }

    public final void p() {
        if (l()) {
            return;
        }
        i();
    }

    public final void q(y2 y2Var, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q qVar = (q) arrayList.get(size);
            if (s(qVar, y2Var) && qVar.f19563a == null && qVar.f19564b == null) {
                arrayList.remove(qVar);
            }
        }
    }

    public final void r(q qVar) {
        y2 y2Var = qVar.f19563a;
        if (y2Var != null) {
            s(qVar, y2Var);
        }
        y2 y2Var2 = qVar.f19564b;
        if (y2Var2 != null) {
            s(qVar, y2Var2);
        }
    }

    public final boolean s(q qVar, y2 y2Var) {
        if (qVar.f19564b == y2Var) {
            qVar.f19564b = null;
        } else {
            if (qVar.f19563a != y2Var) {
                return false;
            }
            qVar.f19563a = null;
        }
        y2Var.f19717a.setAlpha(1.0f);
        View view = y2Var.f19717a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        h(y2Var);
        return true;
    }

    public final void t(y2 y2Var) {
        if (f19617s == null) {
            f19617s = new ValueAnimator().getInterpolator();
        }
        y2Var.f19717a.animate().setInterpolator(f19617s);
        j(y2Var);
    }
}
