package bm1;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23516c;

    public /* synthetic */ p(int i13, Object obj, Object obj2) {
        this.f23514a = i13;
        this.f23515b = obj;
        this.f23516c = obj2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i13 = this.f23514a;
        Object obj = this.f23516c;
        Object obj2 = this.f23515b;
        switch (i13) {
            case 0:
                ((GestaltButtonToggle) obj2).startAnimation((ScaleAnimation) obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ca2.e eVar = (ca2.e) obj2;
                eVar.f27256o = true;
                BottomSheetBehavior bottomSheetBehavior = eVar.f27255n;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.X(4);
                }
                ca2.b bVar = eVar.f27252k;
                if (bVar != null) {
                    bVar.M0((String) obj);
                }
                eVar.k(f1.BOTTOM_SHEET_SNAP_MINIMIZED, (String) obj);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.f23514a) {
            case 0:
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f23514a) {
            case 0:
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }
}
