package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class m1 extends o1 {
    public static boolean u(Transition transition) {
        return (o1.h(transition.getTargetIds()) && o1.h(transition.getTargetNames()) && o1.h(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.o1
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
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
            int transitionCount = transitionSet.getTransitionCount();
            while (i13 < transitionCount) {
                b(transitionSet.getTransitionAt(i13), arrayList);
                i13++;
            }
            return;
        }
        if (u(transition) || !o1.h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i13 < size) {
            transition.addTarget((View) arrayList.get(i13));
            i13++;
        }
    }

    @Override // androidx.fragment.app.o1
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
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
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o1
    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o1
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new j1(view, arrayList));
    }

    @Override // androidx.fragment.app.o1
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new k1(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.o1
    public final void n(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            o1.g(rect, view);
            ((Transition) obj).setEpicenterCallback(new i1(rect, 0));
        }
    }

    @Override // androidx.fragment.app.o1
    public final void o(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new i1(rect, 1));
    }

    @Override // androidx.fragment.app.o1
    public final void p(Object obj, j5.d dVar, e5.k kVar) {
        ((Transition) obj).addListener(new l1(kVar));
    }

    @Override // androidx.fragment.app.o1
    public final void r(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            o1.d(targets, (View) arrayList.get(i13));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.o1
    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            v(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.o1
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void v(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i13 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i13 < transitionCount) {
                v(transitionSet.getTransitionAt(i13), arrayList, arrayList2);
                i13++;
            }
            return;
        }
        if (u(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i13 < size) {
            transition.addTarget((View) arrayList2.get(i13));
            i13++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }
}
