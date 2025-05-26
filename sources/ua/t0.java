package ua;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.view.ViewGroup;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoTransition f121358a = new AutoTransition();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f121359b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f121360c = new ArrayList();

    public static void a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = f121360c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = f121358a;
        }
        Transition clone = transition.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).H(viewGroup);
            }
        }
        clone.n(viewGroup, true);
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(viewGroup.getTag(e0.transition_current_scene));
        viewGroup.setTag(e0.transition_current_scene, null);
        s0 s0Var = new s0();
        s0Var.f121355a = clone;
        s0Var.f121356b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(s0Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(s0Var);
    }

    public static g1.g b() {
        g1.g gVar;
        ThreadLocal threadLocal = f121359b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (gVar = (g1.g) weakReference.get()) != null) {
            return gVar;
        }
        g1.g gVar2 = new g1.g();
        threadLocal.set(new WeakReference(gVar2));
        return gVar2;
    }
}
