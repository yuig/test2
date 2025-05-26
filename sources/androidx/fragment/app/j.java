package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f18353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f18354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18355c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f18356d;

    public j(View view, f fVar, k kVar, z1 z1Var) {
        this.f18353a = z1Var;
        this.f18354b = kVar;
        this.f18355c = view;
        this.f18356d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        k kVar = this.f18354b;
        kVar.f18361a.post(new h6.o(kVar, this.f18355c, this.f18356d, 3));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18353a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18353a + " has reached onAnimationStart.");
        }
    }
}
