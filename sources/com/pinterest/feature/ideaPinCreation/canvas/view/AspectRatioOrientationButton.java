package com.pinterest.feature.ideaPinCreation.canvas.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import aq1.b;
import aq1.h;
import bs1.c;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import rq.o2;
import vt0.e;
import xt0.a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/canvas/view/AspectRatioOrientationButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AspectRatioOrientationButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public e f45960a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIconButton f45961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioOrientationButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45960a = e.PORTRAIT;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltIconButton t13 = new GestaltIconButton(6, context2, (AttributeSet) null).t(a.f135900p);
        t13.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.f45961b = t13;
        int W = c.W(this, b.idea_pin_aspect_ratio_button_size);
        setLayoutParams(new FrameLayout.LayoutParams(W, W));
        setBackgroundResource(aq1.c.rounded_rect_dark_radius_10);
        addView(t13);
        a();
    }

    public final void a() {
        Pair pair;
        int i13 = xt0.b.f135902a[this.f45960a.ordinal()];
        if (i13 == 1) {
            pair = new Pair(q.ORIENTATION_LANDSCAPE, Integer.valueOf(h.accessibility_idea_pin_canvas_orientation_landscape));
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(q.ORIENTATION_PORTRAIT, Integer.valueOf(h.accessibility_idea_pin_canvas_orientation_portrait));
        }
        q qVar = (q) pair.f80346a;
        int intValue = ((Number) pair.f80347b).intValue();
        o2 o2Var = new o2(qVar, 9);
        GestaltIconButton gestaltIconButton = this.f45961b;
        gestaltIconButton.t(o2Var);
        gestaltIconButton.setContentDescription(c.f2(this, intValue));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioOrientationButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45960a = e.PORTRAIT;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltIconButton t13 = new GestaltIconButton(6, context2, (AttributeSet) null).t(a.f135900p);
        t13.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.f45961b = t13;
        int W = c.W(this, b.idea_pin_aspect_ratio_button_size);
        setLayoutParams(new FrameLayout.LayoutParams(W, W));
        setBackgroundResource(aq1.c.rounded_rect_dark_radius_10);
        addView(t13);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioOrientationButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45960a = e.PORTRAIT;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltIconButton t13 = new GestaltIconButton(6, context2, (AttributeSet) null).t(a.f135900p);
        t13.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.f45961b = t13;
        int W = c.W(this, b.idea_pin_aspect_ratio_button_size);
        setLayoutParams(new FrameLayout.LayoutParams(W, W));
        setBackgroundResource(aq1.c.rounded_rect_dark_radius_10);
        addView(t13);
        a();
    }
}
