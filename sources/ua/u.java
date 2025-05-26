package ua;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class u extends androidx.fragment.app.o1 {
    @Override // androidx.fragment.app.o1
    public final void a(View view, Object obj) {
        ((Transition) obj).c(view);
    }

    @Override // androidx.fragment.app.o1
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i13 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.H.size();
            while (i13 < size) {
                b((i13 < 0 || i13 >= transitionSet.H.size()) ? null : (Transition) transitionSet.H.get(i13), arrayList);
                i13++;
            }
            return;
        }
        if (androidx.fragment.app.o1.h(transition.f19837e) && androidx.fragment.app.o1.h(transition.f19839g) && androidx.fragment.app.o1.h(transition.f19840h) && androidx.fragment.app.o1.h(transition.f19838f)) {
            int size2 = arrayList.size();
            while (i13 < size2) {
                transition.c((View) arrayList.get(i13));
                i13++;
            }
        }
    }

    @Override // androidx.fragment.app.o1
    public final void c(ViewGroup viewGroup, Object obj) {
        t0.a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.o1
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.o1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o1
    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.U(transition);
            transitionSet.U(transition2);
            transitionSet.X(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.U(transition);
        }
        transitionSet2.U(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.o1
    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.U((Transition) obj);
        }
        transitionSet.U((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o1
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).a(new r(view, arrayList));
    }

    @Override // androidx.fragment.app.o1
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).a(new s(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.o1
    public final void n(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            androidx.fragment.app.o1.g(rect, view);
            ((Transition) obj).N(new q(rect, 0));
        }
    }

    @Override // androidx.fragment.app.o1
    public final void o(Object obj, Rect rect) {
        ((Transition) obj).N(new q(rect, 1));
    }

    @Override // androidx.fragment.app.o1
    public final void p(Object obj, j5.d dVar, e5.k kVar) {
        Transition transition = (Transition) obj;
        dVar.b(new l0.d(null, transition, kVar, 9));
        transition.a(new t(kVar));
    }

    @Override // androidx.fragment.app.o1
    public final void r(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList arrayList2 = transitionSet.f19838f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            androidx.fragment.app.o1.d(arrayList2, (View) arrayList.get(i13));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.o1
    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            ArrayList arrayList3 = transitionSet.f19838f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.o1
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.U((Transition) obj);
        return transitionSet;
    }

    public final void u(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i13 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.H.size();
            while (i13 < size) {
                u((i13 < 0 || i13 >= transitionSet.H.size()) ? null : (Transition) transitionSet.H.get(i13), arrayList, arrayList2);
                i13++;
            }
            return;
        }
        if (androidx.fragment.app.o1.h(transition.f19837e) && androidx.fragment.app.o1.h(transition.f19839g) && androidx.fragment.app.o1.h(transition.f19840h)) {
            ArrayList arrayList3 = transition.f19838f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i13 < size2) {
                    transition.c((View) arrayList2.get(i13));
                    i13++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    transition.J((View) arrayList.get(size3));
                }
            }
        }
    }
}
