package jn1;

import android.view.animation.Animation;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f77105a;

    public g(i iVar) {
        this.f77105a = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        i iVar = this.f77105a;
        iVar.f77119j = true;
        BottomSheetBehavior bottomSheetBehavior = iVar.f77118i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X(4);
        }
        Function0 function0 = iVar.f77112c;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
