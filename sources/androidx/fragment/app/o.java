package androidx.fragment.app;

import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public final class o implements androidx.lifecycle.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f18391a;

    public o(q qVar) {
        this.f18391a = qVar;
    }

    @Override // androidx.lifecycle.m0
    public final void a(Object obj) {
        if (((androidx.lifecycle.z) obj) != null) {
            q qVar = this.f18391a;
            if (qVar.f18412h) {
                View requireView = qVar.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (qVar.f18416l != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + qVar.f18416l);
                    }
                    qVar.f18416l.setContentView(requireView);
                }
            }
        }
    }
}
