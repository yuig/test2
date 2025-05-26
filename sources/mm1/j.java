package mm1;

import android.view.animation.Animation;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h32.f1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements jn1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f87609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jn1.i f87610b;

    public j(k kVar, jn1.i iVar) {
        this.f87609a = kVar;
        this.f87610b = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        k kVar = this.f87609a;
        if (kVar.f87612b.f87590c <= 0) {
            jn1.c actionSource = jn1.c.INITIAL_SLIDE_UP;
            jn1.i iVar = this.f87610b;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(actionSource, "actionSource");
            BottomSheetBehavior bottomSheetBehavior = iVar.f77118i;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.X(3);
            }
            int i13 = iVar.f77110a;
            iVar.f77119j = false;
            BottomSheetBehavior bottomSheetBehavior2 = iVar.f77118i;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.W(i13);
            }
            Function0 function0 = iVar.f77114e;
            if (function0 != null) {
                function0.invoke();
            }
            iVar.c(f1.BOTTOM_SHEET_SNAP_FULLY_OPEN, actionSource);
        }
        Function0 function02 = kVar.f87624n;
        if (function02 != null) {
            function02.invoke();
        }
    }
}
