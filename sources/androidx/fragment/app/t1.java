package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t1 extends z1 {

    /* renamed from: h, reason: collision with root package name */
    public final d1 f18437h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t1(androidx.fragment.app.x1 r3, androidx.fragment.app.u1 r4, androidx.fragment.app.d1 r5, j5.d r6) {
        /*
            r2 = this;
            java.lang.String r0 = "finalState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "lifecycleImpact"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "fragmentStateManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "cancellationSignal"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.Fragment r0 = r5.f18305c
            java.lang.String r1 = "fragmentStateManager.fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r4, r0, r6)
            r2.f18437h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t1.<init>(androidx.fragment.app.x1, androidx.fragment.app.u1, androidx.fragment.app.d1, j5.d):void");
    }

    @Override // androidx.fragment.app.z1
    public final void b() {
        if (!this.f18514g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f18514g = true;
            Iterator it = this.f18511d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f18437h.l();
    }

    @Override // androidx.fragment.app.z1
    public final void d() {
        u1 u1Var = this.f18509b;
        u1 u1Var2 = u1.ADDING;
        d1 d1Var = this.f18437h;
        if (u1Var != u1Var2) {
            if (u1Var == u1.REMOVING) {
                Fragment fragment = d1Var.f18305c;
                Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                View requireView = fragment.requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + fragment);
                }
                requireView.clearFocus();
                return;
            }
            return;
        }
        Fragment fragment2 = d1Var.f18305c;
        Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
        View findFocus = fragment2.mView.findFocus();
        if (findFocus != null) {
            fragment2.setFocusedView(findFocus);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment2);
            }
        }
        View requireView2 = this.f18510c.requireView();
        Intrinsics.checkNotNullExpressionValue(requireView2, "this.fragment.requireView()");
        if (requireView2.getParent() == null) {
            d1Var.b();
            requireView2.setAlpha(0.0f);
        }
        if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
            requireView2.setVisibility(4);
        }
        requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
    }
}
