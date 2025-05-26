package mo1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w0;
import kotlin.jvm.internal.Intrinsics;
import m60.n0;
import nx.n;

/* loaded from: classes2.dex */
public final class c {
    public static void a(androidx.fragment.app.a aVar, a animationType) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        switch (b.f87805a[animationType.ordinal()]) {
            case 1:
                aVar.m(n0.anim_fragment_in_fade, n0.anim_fragment_out_fade, n0.anim_fragment_close_in, n0.anim_fragment_close_out);
                break;
            case 2:
                aVar.m(n0.anim_slide_in_right_linear, n0.anim_slide_out_right, n0.anim_slide_close_in_left, n0.anim_slide_close_out_left);
                break;
            case 3:
                int i13 = n0.anim_slide_in_bottom;
                int i14 = n0.anim_slide_out_bottom;
                aVar.m(i13, i14, i13, i14);
                break;
            case 4:
                aVar.m(n0.anim_fragment_in, n0.anim_fragment_out, n0.anim_fragment_close_in, n0.anim_fragment_close_out);
                break;
            case 5:
                aVar.m(0, 0, 0, n0.anim_slide_out_bottom);
                break;
            case 6:
                aVar.m(n0.anim_slide_in_bottom_giftwrap, n0.anim_hold_giftwrap, 0, 0);
                break;
            case 7:
                aVar.m(0, 0, 0, 0);
                break;
        }
    }

    public static void b(w0 fragmentManager, int i13, Fragment nextFragment, boolean z13, a animationType, String fragmentTag) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(nextFragment, "nextFragment");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        LayoutInflater.Factory E4 = nextFragment.E4();
        if (!(E4 instanceof ms1.a) || ((ms1.a) E4).isRestored()) {
            fragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
            a(aVar, animationType);
            Fragment E = fragmentManager.E(i13);
            if (fragmentTag.length() > 0) {
                aVar.l(i13, nextFragment, fragmentTag);
            } else {
                aVar.l(i13, nextFragment, null);
            }
            FragmentActivity E42 = nextFragment.E4();
            if (z13) {
                aVar.c(null);
            }
            if (!aVar.f18266a.isEmpty() || (E42 != null && !E42.isFinishing())) {
                aVar.e(true);
            }
            if (E instanceof nl1.d) {
                ((nl1.d) E).Q7(false);
            }
            if (nextFragment instanceof nl1.d) {
                nextFragment.getClass().isAnnotationPresent(n.class);
                ((nl1.d) nextFragment).Q7(true);
            }
        }
    }

    public static /* synthetic */ void c(w0 w0Var, int i13, Fragment fragment, boolean z13, a aVar, int i14) {
        if ((i14 & 16) != 0) {
            aVar = a.DEFAULT;
        }
        b(w0Var, i13, fragment, z13, aVar, "");
    }

    public static void d(Activity activity, Integer num) {
        if (activity != null) {
            if (hf0.b.f69006f == null) {
                Boolean valueOf = Boolean.valueOf(hf0.b.q());
                hf0.b.f69006f = valueOf;
                if (valueOf == Boolean.FALSE) {
                    hf0.b.f69006f = Boolean.valueOf(hf0.b.f69001a > 1.5f);
                }
            }
            if (hf0.b.f69006f.booleanValue()) {
                View findViewById = activity.findViewById(num.intValue());
                Intrinsics.f(findViewById);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = hf0.b.f69002b;
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }
}
