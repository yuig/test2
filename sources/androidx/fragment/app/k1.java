package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class k1 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18370c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18371d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1 f18374g;

    public k1(m1 m1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f18374g = m1Var;
        this.f18368a = obj;
        this.f18369b = arrayList;
        this.f18372e = obj2;
        this.f18373f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        m1 m1Var = this.f18374g;
        Object obj = this.f18368a;
        if (obj != null) {
            m1Var.v(obj, this.f18369b, null);
        }
        Object obj2 = this.f18370c;
        if (obj2 != null) {
            m1Var.v(obj2, this.f18371d, null);
        }
        Object obj3 = this.f18372e;
        if (obj3 != null) {
            m1Var.v(obj3, this.f18373f, null);
        }
    }
}
