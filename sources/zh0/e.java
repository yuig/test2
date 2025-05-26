package zh0;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import tb0.g;
import tb0.h;
import tb0.p;

/* loaded from: classes5.dex */
public abstract class e {
    public static final void a(RelativeLayout relativeLayout, Resources resources) {
        LockableBottomSheetBehavior lockableBottomSheetBehavior;
        Intrinsics.checkNotNullParameter(relativeLayout, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        try {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
        } catch (IllegalArgumentException e13) {
            HashSet hashSet = h.f117076w;
            h hVar = g.f117075a;
            int id3 = relativeLayout.getId();
            String resourceName = resources.getResourceName(relativeLayout.getId());
            String resourceName2 = resources.getResourceName(relativeLayout.getRootView().getId());
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            androidx.coordinatorlayout.widget.c cVar = layoutParams2 instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams2 : null;
            hVar.q(e13, "view = id[" + id3 + "] name[" + resourceName + "], rootView = " + resourceName2 + ", layoutParams = " + layoutParams + ", behavior = " + (cVar != null ? cVar.f17900a : null), p.ACCOUNT_SETTINGS);
            lockableBottomSheetBehavior = new LockableBottomSheetBehavior();
            ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((androidx.coordinatorlayout.widget.c) layoutParams3).d(lockableBottomSheetBehavior);
        }
        lockableBottomSheetBehavior.f44543h0 = false;
        lockableBottomSheetBehavior.X(3);
        relativeLayout.requestLayout();
    }
}
