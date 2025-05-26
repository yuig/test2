package com.pinterest.feature.pin;

import android.graphics.Rect;
import com.pinterest.ui.grid.LegoPinGridCell;
import i32.y0;
import java.util.Iterator;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import qa2.h0;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final rg0.s f47260a;

    public r(rg0.s experiences) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        this.f47260a = experiences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RepinAnimationData a(h0 h0Var) {
        int i13;
        if (h0Var == 0) {
            return null;
        }
        LegoPinGridCell legoPinGridCell = h0Var instanceof LegoPinGridCell ? (LegoPinGridCell) h0Var : null;
        if (legoPinGridCell == null) {
            return null;
        }
        Rect rect = new Rect();
        legoPinGridCell.getGlobalVisibleRect(rect);
        wa2.a pinDrawable = legoPinGridCell.getPinDrawable();
        if (pinDrawable == null || (i13 = pinDrawable.f128841d) > legoPinGridCell.getRootView().getWidth() / 2) {
            return null;
        }
        int pinDrawableHeight = legoPinGridCell.getPinDrawableHeight();
        int i14 = rect.top;
        int i15 = rect.left;
        Intrinsics.checkNotNullParameter(legoPinGridCell, "<this>");
        return new RepinAnimationData(i13, pinDrawableHeight, i14, i15, legoPinGridCell.getCornerRadius());
    }

    public static boolean b() {
        return r70.b.f106349i.k0().f106352b;
    }

    public final void c() {
        ((lb0.b) lb0.n.f82725d.a()).l("PREF_EXAGGERATED_REPIN_ANIMATION_VIEW_COUNT", 0);
        Iterator it = f0.j(y0.ANDROID_HOME_FEED_AFTER_SAVE, y0.ANDROID_BOARD_MORE_IDEAS_FEED_AFTER_SAVE, y0.ANDROID_TOPIC_LANDING_FEED_AFTER_SAVE).iterator();
        while (it.hasNext()) {
            rg0.n b13 = ((dh0.d) this.f47260a).b((y0) it.next());
            if (b13 != null) {
                if (b13.f108060b == i32.l.ANDROID_REPIN_ANIMATION_AFTER_SAVE.value()) {
                    b13.c(null, null);
                }
            }
        }
    }
}
