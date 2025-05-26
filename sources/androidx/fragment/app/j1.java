package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j1 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f18359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18360b;

    public j1(View view, ArrayList arrayList) {
        this.f18359a = view;
        this.f18360b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f18359a.setVisibility(8);
        ArrayList arrayList = this.f18360b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((View) arrayList.get(i13)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
