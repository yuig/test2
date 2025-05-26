package androidx.transition;

import a.a;
import a.e;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.d;
import com.google.firebase.messaging.q;
import g1.g;
import g1.p;
import ig1.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import q5.m0;
import q5.v0;
import ua.k0;
import ua.l0;
import ua.n0;
import ua.o0;
import ua.o1;
import ua.p0;
import ua.y0;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] D = new Animator[0];
    public static final int[] E = {2, 1, 3, 4};
    public static final l0 F = new l0();
    public static final ThreadLocal G = new ThreadLocal();
    public k0 A;
    public k0 B;
    public PathMotion C;

    /* renamed from: a, reason: collision with root package name */
    public final String f19833a;

    /* renamed from: b, reason: collision with root package name */
    public long f19834b;

    /* renamed from: c, reason: collision with root package name */
    public long f19835c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f19836d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f19837e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f19838f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f19839g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f19840h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f19841i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f19842j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f19843k;

    /* renamed from: l, reason: collision with root package name */
    public q f19844l;

    /* renamed from: m, reason: collision with root package name */
    public q f19845m;

    /* renamed from: n, reason: collision with root package name */
    public TransitionSet f19846n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f19847o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f19848p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f19849q;

    /* renamed from: r, reason: collision with root package name */
    public o0[] f19850r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f19851s;

    /* renamed from: t, reason: collision with root package name */
    public Animator[] f19852t;

    /* renamed from: u, reason: collision with root package name */
    public int f19853u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19854v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19855w;

    /* renamed from: x, reason: collision with root package name */
    public Transition f19856x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f19857y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f19858z;

    public Transition() {
        this.f19833a = getClass().getName();
        this.f19834b = -1L;
        this.f19835c = -1L;
        this.f19836d = null;
        this.f19837e = new ArrayList();
        this.f19838f = new ArrayList();
        this.f19839g = null;
        this.f19840h = null;
        this.f19841i = null;
        this.f19842j = null;
        this.f19843k = null;
        this.f19844l = new q(7);
        this.f19845m = new q(7);
        this.f19846n = null;
        this.f19847o = E;
        this.f19851s = new ArrayList();
        this.f19852t = D;
        this.f19853u = 0;
        this.f19854v = false;
        this.f19855w = false;
        this.f19856x = null;
        this.f19857y = null;
        this.f19858z = new ArrayList();
        this.C = F;
    }

    public static boolean F(y0 y0Var, y0 y0Var2, String str) {
        Object obj = y0Var.f121377a.get(str);
        Object obj2 = y0Var2.f121377a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void i(q qVar, View view, y0 y0Var) {
        ((g) qVar.f33803a).put(view, y0Var);
        int id3 = view.getId();
        if (id3 >= 0) {
            if (((SparseArray) qVar.f33804b).indexOfKey(id3) >= 0) {
                ((SparseArray) qVar.f33804b).put(id3, null);
            } else {
                ((SparseArray) qVar.f33804b).put(id3, view);
            }
        }
        WeakHashMap weakHashMap = v0.f102521a;
        String f13 = m0.f(view);
        if (f13 != null) {
            if (((g) qVar.f33806d).containsKey(f13)) {
                ((g) qVar.f33806d).put(f13, null);
            } else {
                ((g) qVar.f33806d).put(f13, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (((p) qVar.f33805c).g(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ((p) qVar.f33805c).j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ((p) qVar.f33805c).c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ((p) qVar.f33805c).j(itemIdAtPosition, null);
                }
            }
        }
    }

    public static g z() {
        ThreadLocal threadLocal = G;
        g gVar = (g) threadLocal.get();
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        threadLocal.set(gVar2);
        return gVar2;
    }

    public String[] A() {
        return null;
    }

    public final y0 B(View view, boolean z13) {
        TransitionSet transitionSet = this.f19846n;
        if (transitionSet != null) {
            return transitionSet.B(view, z13);
        }
        return (y0) ((g) (z13 ? this.f19844l : this.f19845m).f33803a).get(view);
    }

    public boolean C() {
        return !this.f19851s.isEmpty();
    }

    public boolean D(y0 y0Var, y0 y0Var2) {
        if (y0Var == null || y0Var2 == null) {
            return false;
        }
        String[] A = A();
        if (A == null) {
            Iterator it = y0Var.f121377a.keySet().iterator();
            while (it.hasNext()) {
                if (F(y0Var, y0Var2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : A) {
            if (!F(y0Var, y0Var2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean E(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id3 = view.getId();
        ArrayList arrayList3 = this.f19841i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id3))) {
            return false;
        }
        ArrayList arrayList4 = this.f19842j;
        if (arrayList4 != null) {
            int size = arrayList4.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((Class) this.f19842j.get(i13)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f19843k != null) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (m0.f(view) != null && this.f19843k.contains(m0.f(view))) {
                return false;
            }
        }
        ArrayList arrayList5 = this.f19837e;
        int size2 = arrayList5.size();
        ArrayList arrayList6 = this.f19838f;
        if ((size2 == 0 && arrayList6.size() == 0 && (((arrayList = this.f19840h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f19839g) == null || arrayList2.isEmpty()))) || arrayList5.contains(Integer.valueOf(id3)) || arrayList6.contains(view)) {
            return true;
        }
        ArrayList arrayList7 = this.f19839g;
        if (arrayList7 != null) {
            WeakHashMap weakHashMap2 = v0.f102521a;
            if (arrayList7.contains(m0.f(view))) {
                return true;
            }
        }
        if (this.f19840h != null) {
            for (int i14 = 0; i14 < this.f19840h.size(); i14++) {
                if (((Class) this.f19840h.get(i14)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void G(Transition transition, e eVar) {
        Transition transition2 = this.f19856x;
        if (transition2 != null) {
            transition2.G(transition, eVar);
        }
        ArrayList arrayList = this.f19857y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f19857y.size();
        o0[] o0VarArr = this.f19850r;
        if (o0VarArr == null) {
            o0VarArr = new o0[size];
        }
        this.f19850r = null;
        o0[] o0VarArr2 = (o0[]) this.f19857y.toArray(o0VarArr);
        for (int i13 = 0; i13 < size; i13++) {
            eVar.k(o0VarArr2[i13], transition);
            o0VarArr2[i13] = null;
        }
        this.f19850r = o0VarArr2;
    }

    public void H(View view) {
        if (this.f19855w) {
            return;
        }
        ArrayList arrayList = this.f19851s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f19852t);
        this.f19852t = D;
        for (int i13 = size - 1; i13 >= 0; i13--) {
            Animator animator = animatorArr[i13];
            animatorArr[i13] = null;
            animator.pause();
        }
        this.f19852t = animatorArr;
        G(this, p0.f121339ap);
        this.f19854v = true;
    }

    public Transition I(o0 o0Var) {
        Transition transition;
        ArrayList arrayList = this.f19857y;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(o0Var) && (transition = this.f19856x) != null) {
            transition.I(o0Var);
        }
        if (this.f19857y.size() == 0) {
            this.f19857y = null;
        }
        return this;
    }

    public void J(View view) {
        this.f19838f.remove(view);
    }

    public void K(ViewGroup viewGroup) {
        if (this.f19854v) {
            if (!this.f19855w) {
                ArrayList arrayList = this.f19851s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f19852t);
                this.f19852t = D;
                for (int i13 = size - 1; i13 >= 0; i13--) {
                    Animator animator = animatorArr[i13];
                    animatorArr[i13] = null;
                    animator.resume();
                }
                this.f19852t = animatorArr;
                G(this, p0.f121340bp);
            }
            this.f19854v = false;
        }
    }

    public void L() {
        S();
        g z13 = z();
        Iterator it = this.f19858z.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (z13.containsKey(animator)) {
                S();
                if (animator != null) {
                    animator.addListener(new ua.m0(0, this, z13));
                    long j13 = this.f19835c;
                    if (j13 >= 0) {
                        animator.setDuration(j13);
                    }
                    long j14 = this.f19834b;
                    if (j14 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j14);
                    }
                    TimeInterpolator timeInterpolator = this.f19836d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new d(this, 1));
                    animator.start();
                }
            }
        }
        this.f19858z.clear();
        s();
    }

    public void M(long j13) {
        this.f19835c = j13;
    }

    public void N(k0 k0Var) {
        this.B = k0Var;
    }

    public void O(TimeInterpolator timeInterpolator) {
        this.f19836d = timeInterpolator;
    }

    public void P(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.C = F;
        } else {
            this.C = pathMotion;
        }
    }

    public void Q(k0 k0Var) {
        this.A = k0Var;
    }

    public void R(long j13) {
        this.f19834b = j13;
    }

    public final void S() {
        if (this.f19853u == 0) {
            G(this, p0.Xo);
            this.f19855w = false;
        }
        this.f19853u++;
    }

    public String T(String str) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(getClass().getSimpleName());
        sb3.append("@");
        sb3.append(Integer.toHexString(hashCode()));
        sb3.append(": ");
        if (this.f19835c != -1) {
            sb3.append("dur(");
            sb3.append(this.f19835c);
            sb3.append(") ");
        }
        if (this.f19834b != -1) {
            sb3.append("dly(");
            sb3.append(this.f19834b);
            sb3.append(") ");
        }
        if (this.f19836d != null) {
            sb3.append("interp(");
            sb3.append(this.f19836d);
            sb3.append(") ");
        }
        ArrayList arrayList = this.f19837e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f19838f;
        if (size > 0 || arrayList2.size() > 0) {
            sb3.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(arrayList.get(i13));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    if (i14 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(arrayList2.get(i14));
                }
            }
            sb3.append(")");
        }
        return sb3.toString();
    }

    public void a(o0 o0Var) {
        if (this.f19857y == null) {
            this.f19857y = new ArrayList();
        }
        this.f19857y.add(o0Var);
    }

    public void b(int i13) {
        if (i13 != 0) {
            this.f19837e.add(Integer.valueOf(i13));
        }
    }

    public void c(View view) {
        this.f19838f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f19851s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f19852t);
        this.f19852t = D;
        for (int i13 = size - 1; i13 >= 0; i13--) {
            Animator animator = animatorArr[i13];
            animatorArr[i13] = null;
            animator.cancel();
        }
        this.f19852t = animatorArr;
        G(this, p0.Zo);
    }

    public void g(Class cls) {
        if (this.f19840h == null) {
            this.f19840h = new ArrayList();
        }
        this.f19840h.add(cls);
    }

    public void h(String str) {
        if (this.f19839g == null) {
            this.f19839g = new ArrayList();
        }
        this.f19839g.add(str);
    }

    public abstract void j(y0 y0Var);

    public final void k(View view, boolean z13) {
        if (view == null) {
            return;
        }
        int id3 = view.getId();
        ArrayList arrayList = this.f19841i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id3))) {
            ArrayList arrayList2 = this.f19842j;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    if (((Class) this.f19842j.get(i13)).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                y0 y0Var = new y0(view);
                if (z13) {
                    m(y0Var);
                } else {
                    j(y0Var);
                }
                y0Var.f121379c.add(this);
                l(y0Var);
                if (z13) {
                    i(this.f19844l, view, y0Var);
                } else {
                    i(this.f19845m, view, y0Var);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    k(viewGroup.getChildAt(i14), z13);
                }
            }
        }
    }

    public void l(y0 y0Var) {
        if (this.A != null) {
            HashMap hashMap = y0Var.f121377a;
            if (hashMap.isEmpty()) {
                return;
            }
            this.A.getClass();
            String[] strArr = o1.f121336r;
            for (int i13 = 0; i13 < 2; i13++) {
                if (!hashMap.containsKey(strArr[i13])) {
                    this.A.d(y0Var);
                    return;
                }
            }
        }
    }

    public abstract void m(y0 y0Var);

    public final void n(ViewGroup viewGroup, boolean z13) {
        ArrayList arrayList;
        ArrayList arrayList2;
        o(z13);
        ArrayList arrayList3 = this.f19837e;
        int size = arrayList3.size();
        ArrayList arrayList4 = this.f19838f;
        if ((size <= 0 && arrayList4.size() <= 0) || (((arrayList = this.f19839g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f19840h) != null && !arrayList2.isEmpty()))) {
            k(viewGroup, z13);
            return;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList3.get(i13)).intValue());
            if (findViewById != null) {
                y0 y0Var = new y0(findViewById);
                if (z13) {
                    m(y0Var);
                } else {
                    j(y0Var);
                }
                y0Var.f121379c.add(this);
                l(y0Var);
                if (z13) {
                    i(this.f19844l, findViewById, y0Var);
                } else {
                    i(this.f19845m, findViewById, y0Var);
                }
            }
        }
        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
            View view = (View) arrayList4.get(i14);
            y0 y0Var2 = new y0(view);
            if (z13) {
                m(y0Var2);
            } else {
                j(y0Var2);
            }
            y0Var2.f121379c.add(this);
            l(y0Var2);
            if (z13) {
                i(this.f19844l, view, y0Var2);
            } else {
                i(this.f19845m, view, y0Var2);
            }
        }
    }

    public final void o(boolean z13) {
        if (z13) {
            ((g) this.f19844l.f33803a).clear();
            ((SparseArray) this.f19844l.f33804b).clear();
            ((p) this.f19844l.f33805c).a();
        } else {
            ((g) this.f19845m.f33803a).clear();
            ((SparseArray) this.f19845m.f33804b).clear();
            ((p) this.f19845m.f33805c).a();
        }
    }

    @Override // 
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f19858z = new ArrayList();
            transition.f19844l = new q(7);
            transition.f19845m = new q(7);
            transition.f19848p = null;
            transition.f19849q = null;
            transition.f19856x = this;
            transition.f19857y = null;
            return transition;
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public Animator q(ViewGroup viewGroup, y0 y0Var, y0 y0Var2) {
        return null;
    }

    public void r(ViewGroup viewGroup, q qVar, q qVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator q13;
        int i13;
        int i14;
        View view;
        y0 y0Var;
        Animator animator;
        g z13 = z();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        y().getClass();
        long j13 = Long.MAX_VALUE;
        int i15 = 0;
        while (i15 < size) {
            y0 y0Var2 = (y0) arrayList.get(i15);
            y0 y0Var3 = (y0) arrayList2.get(i15);
            if (y0Var2 != null && !y0Var2.f121379c.contains(this)) {
                y0Var2 = null;
            }
            if (y0Var3 != null && !y0Var3.f121379c.contains(this)) {
                y0Var3 = null;
            }
            if (!(y0Var2 == null && y0Var3 == null) && ((y0Var2 == null || y0Var3 == null || D(y0Var2, y0Var3)) && (q13 = q(viewGroup, y0Var2, y0Var3)) != null)) {
                String str = this.f19833a;
                if (y0Var3 != null) {
                    String[] A = A();
                    view = y0Var3.f121378b;
                    i13 = size;
                    if (A != null && A.length > 0) {
                        y0Var = new y0(view);
                        y0 y0Var4 = (y0) ((g) qVar2.f33803a).get(view);
                        if (y0Var4 != null) {
                            animator = q13;
                            int i16 = 0;
                            while (i16 < A.length) {
                                HashMap hashMap = y0Var.f121377a;
                                int i17 = i15;
                                String str2 = A[i16];
                                hashMap.put(str2, y0Var4.f121377a.get(str2));
                                i16++;
                                i15 = i17;
                                A = A;
                            }
                            i14 = i15;
                        } else {
                            i14 = i15;
                            animator = q13;
                        }
                        int i18 = z13.f63294c;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= i18) {
                                break;
                            }
                            n0 n0Var = (n0) z13.get((Animator) z13.f(i19));
                            if (n0Var.f121324c != null && n0Var.f121322a == view && n0Var.f121323b.equals(str) && n0Var.f121324c.equals(y0Var)) {
                                animator = null;
                                break;
                            }
                            i19++;
                        }
                    } else {
                        i14 = i15;
                        animator = q13;
                        y0Var = null;
                    }
                    q13 = animator;
                } else {
                    i13 = size;
                    i14 = i15;
                    view = y0Var2.f121378b;
                    y0Var = null;
                }
                if (q13 != null) {
                    k0 k0Var = this.A;
                    if (k0Var != null) {
                        long e13 = k0Var.e(viewGroup, this, y0Var2, y0Var3);
                        sparseIntArray.put(this.f19858z.size(), (int) e13);
                        j13 = Math.min(e13, j13);
                    }
                    WindowId windowId = viewGroup.getWindowId();
                    n0 n0Var2 = new n0();
                    n0Var2.f121322a = view;
                    n0Var2.f121323b = str;
                    n0Var2.f121324c = y0Var;
                    n0Var2.f121325d = windowId;
                    n0Var2.f121326e = this;
                    n0Var2.f121327f = q13;
                    z13.put(q13, n0Var2);
                    this.f19858z.add(q13);
                }
            } else {
                i13 = size;
                i14 = i15;
            }
            i15 = i14 + 1;
            size = i13;
        }
        if (sparseIntArray.size() != 0) {
            for (int i23 = 0; i23 < sparseIntArray.size(); i23++) {
                n0 n0Var3 = (n0) z13.get((Animator) this.f19858z.get(sparseIntArray.keyAt(i23)));
                n0Var3.f121327f.setStartDelay(n0Var3.f121327f.getStartDelay() + (sparseIntArray.valueAt(i23) - j13));
            }
        }
    }

    public final void s() {
        int i13 = this.f19853u - 1;
        this.f19853u = i13;
        if (i13 == 0) {
            G(this, p0.Yo);
            for (int i14 = 0; i14 < ((p) this.f19844l.f33805c).m(); i14++) {
                View view = (View) ((p) this.f19844l.f33805c).n(i14);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i15 = 0; i15 < ((p) this.f19845m.f33805c).m(); i15++) {
                View view2 = (View) ((p) this.f19845m.f33805c).n(i15);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f19855w = true;
        }
    }

    public void t(int i13) {
        ArrayList arrayList = this.f19841i;
        if (i13 > 0) {
            arrayList = b.p(Integer.valueOf(i13), arrayList);
        }
        this.f19841i = arrayList;
    }

    public final String toString() {
        return T("");
    }

    public void u(Class cls) {
        this.f19842j = b.p(cls, this.f19842j);
    }

    public void v(String str) {
        this.f19843k = b.p(str, this.f19843k);
    }

    public void w(ViewGroup viewGroup) {
        g z13 = z();
        int i13 = z13.f63294c;
        if (viewGroup == null || i13 == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        g gVar = new g(z13);
        z13.clear();
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            n0 n0Var = (n0) gVar.j(i14);
            if (n0Var.f121322a != null && windowId.equals(n0Var.f121325d)) {
                ((Animator) gVar.f(i14)).end();
            }
        }
    }

    public final y0 x(View view, boolean z13) {
        TransitionSet transitionSet = this.f19846n;
        if (transitionSet != null) {
            return transitionSet.x(view, z13);
        }
        ArrayList arrayList = z13 ? this.f19848p : this.f19849q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            }
            y0 y0Var = (y0) arrayList.get(i13);
            if (y0Var == null) {
                return null;
            }
            if (y0Var.f121378b == view) {
                break;
            }
            i13++;
        }
        if (i13 >= 0) {
            return (y0) (z13 ? this.f19849q : this.f19848p).get(i13);
        }
        return null;
    }

    public final Transition y() {
        TransitionSet transitionSet = this.f19846n;
        return transitionSet != null ? transitionSet.y() : this;
    }

    public Transition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.f19833a = getClass().getName();
        this.f19834b = -1L;
        this.f19835c = -1L;
        this.f19836d = null;
        this.f19837e = new ArrayList();
        this.f19838f = new ArrayList();
        this.f19839g = null;
        this.f19840h = null;
        this.f19841i = null;
        this.f19842j = null;
        this.f19843k = null;
        this.f19844l = new q(7);
        this.f19845m = new q(7);
        this.f19846n = null;
        int[] iArr = E;
        this.f19847o = iArr;
        this.f19851s = new ArrayList();
        this.f19852t = D;
        this.f19853u = 0;
        this.f19854v = false;
        this.f19855w = false;
        this.f19856x = null;
        this.f19857y = null;
        this.f19858z = new ArrayList();
        this.C = F;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121279b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long D2 = ao2.m0.D(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (D2 >= 0) {
            M(D2);
        }
        long j13 = ao2.m0.N(xmlResourceParser, "startDelay") ? obtainStyledAttributes.getInt(2, -1) : -1;
        if (j13 > 0) {
            R(j13);
        }
        int resourceId = !ao2.m0.N(xmlResourceParser, "interpolator") ? 0 : obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            O(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String E2 = ao2.m0.E(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (E2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(E2, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i13 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr2[i13] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr2[i13] = 1;
                } else if ("name".equalsIgnoreCase(trim)) {
                    iArr2[i13] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr2[i13] = 4;
                } else if (trim.isEmpty()) {
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i13);
                    i13--;
                    iArr2 = iArr3;
                } else {
                    throw new InflateException(a.k("Unknown match type in matchOrder: '", trim, "'"));
                }
                i13++;
            }
            if (iArr2.length == 0) {
                this.f19847o = iArr;
            } else {
                for (int i14 = 0; i14 < iArr2.length; i14++) {
                    int i15 = iArr2[i14];
                    if (i15 < 1 || i15 > 4) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    for (int i16 = 0; i16 < i14; i16++) {
                        if (iArr2[i16] == i15) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    }
                }
                this.f19847o = (int[]) iArr2.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
}
