package androidx.transition;

import a.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ao2.m0;
import com.google.firebase.messaging.q;
import ep.b;
import java.util.ArrayList;
import java.util.Iterator;
import ua.j;
import ua.k0;
import ua.o0;
import ua.u0;
import ua.y0;

/* loaded from: classes3.dex */
public class TransitionSet extends Transition {
    public ArrayList H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f19859J;
    public boolean K;
    public int L;

    public TransitionSet() {
        this.H = new ArrayList();
        this.I = true;
        this.K = false;
        this.L = 0;
    }

    @Override // androidx.transition.Transition
    public final boolean C() {
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            if (((Transition) this.H.get(i13)).C()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final void H(View view) {
        super.H(view);
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Transition) this.H.get(i13)).H(view);
        }
    }

    @Override // androidx.transition.Transition
    public final Transition I(o0 o0Var) {
        super.I(o0Var);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void J(View view) {
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            ((Transition) this.H.get(i13)).J(view);
        }
        this.f19838f.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void K(ViewGroup viewGroup) {
        super.K(viewGroup);
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Transition) this.H.get(i13)).K(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    public final void L() {
        if (this.H.isEmpty()) {
            S();
            s();
            return;
        }
        u0 u0Var = new u0(this, 1);
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).a(u0Var);
        }
        this.f19859J = this.H.size();
        if (this.I) {
            Iterator it2 = this.H.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).L();
            }
            return;
        }
        for (int i13 = 1; i13 < this.H.size(); i13++) {
            ((Transition) this.H.get(i13 - 1)).a(new j(2, this, (Transition) this.H.get(i13)));
        }
        Transition transition = (Transition) this.H.get(0);
        if (transition != null) {
            transition.L();
        }
    }

    @Override // androidx.transition.Transition
    public final void N(k0 k0Var) {
        this.B = k0Var;
        this.L |= 8;
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Transition) this.H.get(i13)).N(k0Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void P(PathMotion pathMotion) {
        super.P(pathMotion);
        this.L |= 4;
        if (this.H != null) {
            for (int i13 = 0; i13 < this.H.size(); i13++) {
                ((Transition) this.H.get(i13)).P(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void Q(k0 k0Var) {
        this.A = k0Var;
        this.L |= 2;
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Transition) this.H.get(i13)).Q(k0Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void R(long j13) {
        this.f19834b = j13;
    }

    @Override // androidx.transition.Transition
    public final String T(String str) {
        String T = super.T(str);
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            StringBuilder D = b.D(T, "\n");
            D.append(((Transition) this.H.get(i13)).T(str + "  "));
            T = D.toString();
        }
        return T;
    }

    public final void U(Transition transition) {
        this.H.add(transition);
        transition.f19846n = this;
        long j13 = this.f19835c;
        if (j13 >= 0) {
            transition.M(j13);
        }
        if ((this.L & 1) != 0) {
            transition.O(this.f19836d);
        }
        if ((this.L & 2) != 0) {
            transition.Q(this.A);
        }
        if ((this.L & 4) != 0) {
            transition.P(this.C);
        }
        if ((this.L & 8) != 0) {
            transition.N(this.B);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void M(long j13) {
        ArrayList arrayList;
        this.f19835c = j13;
        if (j13 < 0 || (arrayList = this.H) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Transition) this.H.get(i13)).M(j13);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void O(TimeInterpolator timeInterpolator) {
        this.L |= 1;
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((Transition) this.H.get(i13)).O(timeInterpolator);
            }
        }
        this.f19836d = timeInterpolator;
    }

    public final void X(int i13) {
        if (i13 == 0) {
            this.I = true;
        } else {
            if (i13 != 1) {
                throw new AndroidRuntimeException(a.d("Invalid parameter for TransitionSet ordering: ", i13));
            }
            this.I = false;
        }
    }

    @Override // androidx.transition.Transition
    public final void a(o0 o0Var) {
        super.a(o0Var);
    }

    @Override // androidx.transition.Transition
    public final void b(int i13) {
        for (int i14 = 0; i14 < this.H.size(); i14++) {
            ((Transition) this.H.get(i14)).b(i13);
        }
        super.b(i13);
    }

    @Override // androidx.transition.Transition
    public final void c(View view) {
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            ((Transition) this.H.get(i13)).c(view);
        }
        this.f19838f.add(view);
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Transition) this.H.get(i13)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public final void g(Class cls) {
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            ((Transition) this.H.get(i13)).g(cls);
        }
        super.g(cls);
    }

    @Override // androidx.transition.Transition
    public final void h(String str) {
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            ((Transition) this.H.get(i13)).h(str);
        }
        super.h(str);
    }

    @Override // androidx.transition.Transition
    public final void j(y0 y0Var) {
        if (E(y0Var.f121378b)) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.E(y0Var.f121378b)) {
                    transition.j(y0Var);
                    y0Var.f121379c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void l(y0 y0Var) {
        super.l(y0Var);
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Transition) this.H.get(i13)).l(y0Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void m(y0 y0Var) {
        if (E(y0Var.f121378b)) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.E(y0Var.f121378b)) {
                    transition.m(y0Var);
                    y0Var.f121379c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.H = new ArrayList();
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            Transition clone = ((Transition) this.H.get(i13)).clone();
            transitionSet.H.add(clone);
            clone.f19846n = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void r(ViewGroup viewGroup, q qVar, q qVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j13 = this.f19834b;
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            Transition transition = (Transition) this.H.get(i13);
            if (j13 > 0 && (this.I || i13 == 0)) {
                long j14 = transition.f19834b;
                if (j14 > 0) {
                    transition.R(j14 + j13);
                } else {
                    transition.R(j13);
                }
            }
            transition.r(viewGroup, qVar, qVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final void t(int i13) {
        for (int i14 = 0; i14 < this.H.size(); i14++) {
            ((Transition) this.H.get(i14)).t(i13);
        }
        super.t(i13);
    }

    @Override // androidx.transition.Transition
    public final void u(Class cls) {
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            ((Transition) this.H.get(i13)).u(cls);
        }
        super.u(cls);
    }

    @Override // androidx.transition.Transition
    public final void v(String str) {
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            ((Transition) this.H.get(i13)).v(str);
        }
        super.v(str);
    }

    @Override // androidx.transition.Transition
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.H.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Transition) this.H.get(i13)).w(viewGroup);
        }
    }

    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = new ArrayList();
        this.I = true;
        this.K = false;
        this.L = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121285h);
        X(m0.D(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
