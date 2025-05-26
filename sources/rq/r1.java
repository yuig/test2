package rq;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class r1 extends PinCloseupBaseModule implements jq.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f109506a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (hf0.b.n()) {
            return;
        }
        int i13 = eo1.b.color_black_900;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i13));
    }

    public static /* synthetic */ void openPinOverflowMenuModal$closeup_release$default(r1 r1Var, gs0.k kVar, String str, boolean z13, ArrayList arrayList, boolean z14, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPinOverflowMenuModal");
        }
        boolean z15 = (i13 & 4) != 0 ? false : z13;
        if ((i13 & 8) != 0) {
            arrayList = new ArrayList();
        }
        r1Var.openPinOverflowMenuModal$closeup_release(kVar, str, z15, arrayList, (i13 & 16) != 0 ? false : z14);
    }

    public static /* synthetic */ GestaltIconButton setUpGradientAndMaybeCreateOverflowButton$closeup_release$default(r1 r1Var, ViewGroup viewGroup, boolean z13, boolean z14, boolean z15, boolean z16, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUpGradientAndMaybeCreateOverflowButton");
        }
        if ((i13 & 16) != 0) {
            z16 = false;
        }
        return r1Var.setUpGradientAndMaybeCreateOverflowButton$closeup_release(viewGroup, z13, z14, z15, z16);
    }

    public static /* synthetic */ void updatePinOverflowMenuModal$closeup_release$default(r1 r1Var, GestaltIconButton gestaltIconButton, gs0.k kVar, String str, boolean z13, ArrayList arrayList, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePinOverflowMenuModal");
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            arrayList = new ArrayList();
        }
        r1Var.updatePinOverflowMenuModal$closeup_release(gestaltIconButton, kVar, str, z14, arrayList);
    }

    public final boolean maybeBringExistingGradientToFront$closeup_release(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        RelativeLayout relativeLayout = (RelativeLayout) container.findViewById(n80.c.pin_top_gradient);
        if (relativeLayout == null) {
            return false;
        }
        relativeLayout.bringToFront();
        return true;
    }

    public final void openPinOverflowMenuModal$closeup_release(@NotNull gs0.k pinOverflowMenuModalProvider, @NotNull String navigationSource, boolean z13, @NotNull ArrayList<Integer> additionalOverflow, boolean z14) {
        Intrinsics.checkNotNullParameter(pinOverflowMenuModalProvider, "pinOverflowMenuModalProvider");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        Intrinsics.checkNotNullParameter(additionalOverflow, "additionalOverflow");
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        gs0.k.a(pinOverflowMenuModalProvider, pin, jo1.a.RELATED_PINS, true, false, additionalOverflow, null, false, null, null, z13, navigationSource, null, false, null, null, null, false, false, false, false, null, null, z14, 4192744).showFeedBack();
    }

    public final GestaltIconButton setUpGradientAndMaybeCreateOverflowButton$closeup_release(@NotNull ViewGroup container, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(container, "container");
        AttributeSet attributeSet = null;
        if ((!z13 || z14) && !z16) {
            return null;
        }
        RelativeLayout relativeLayout = (RelativeLayout) container.findViewById(n80.c.pin_top_gradient);
        GestaltIconButton gestaltIconButton = relativeLayout != null ? (GestaltIconButton) relativeLayout.findViewById(n80.c.closeup_overflow_button) : null;
        if (relativeLayout != null) {
            relativeLayout.bringToFront();
            return gestaltIconButton;
        }
        RelativeLayout relativeLayout2 = setupTopBarBackgroundGradient$closeup_release(container, z15);
        Intrinsics.f(relativeLayout2);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltIconButton gestaltIconButton2 = new GestaltIconButton(6, context, attributeSet);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, gestaltIconButton2.getResources().getDimensionPixelSize(eo1.c.space_400), 0, 0);
        layoutParams.setMarginEnd(bs1.c.W(gestaltIconButton2, eo1.c.space_200));
        layoutParams.topMargin = z15 ? kh2.k3.k0(gestaltIconButton2.getContext()) : bs1.c.W(gestaltIconButton2, eo1.c.space_300);
        gestaltIconButton2.t(o.F);
        layoutParams.addRule(21);
        gestaltIconButton2.setLayoutParams(layoutParams);
        gestaltIconButton2.t(o.G);
        relativeLayout2.addView(gestaltIconButton2);
        return gestaltIconButton2;
    }

    @NotNull
    public final RelativeLayout setupTopBarBackgroundGradient$closeup_release(@NotNull ViewGroup container, boolean z13) {
        Intrinsics.checkNotNullParameter(container, "container");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, z13 ? kh2.k3.k0(relativeLayout.getContext()) + ((int) bs1.c.T(m60.r0.lego_floating_nav_bottom_bar_height)) : (int) bs1.c.T(m60.r0.lego_floating_nav_bottom_bar_height), 49.0f));
        relativeLayout.setId(n80.c.pin_top_gradient);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int y03 = dl2.b.y0(relativeLayout, eo1.a.color_background_dark_opacity_300);
        Context context = relativeLayout.getContext();
        int i13 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        relativeLayout.setBackground(new GradientDrawable(orientation, new int[]{y03, context.getColor(i13)}));
        container.addView(relativeLayout);
        return relativeLayout;
    }

    public final boolean shouldRenderLandscapeTablet() {
        return hf0.b.n();
    }

    public abstract void updateMediaViewSize(int i13);

    public final void updateModuleSize$closeup_release(int i13) {
        if (getHeight() > i13) {
            getLayoutParams().height = i13;
            updateMediaViewSize(i13);
        }
    }

    public final void updatePinOverflowMenuModal$closeup_release(@NotNull GestaltIconButton overflowButton, @NotNull gs0.k pinOverflowMenuModalProvider, @NotNull String navigationSource, boolean z13, @NotNull ArrayList<Integer> additionalOverflow) {
        Intrinsics.checkNotNullParameter(overflowButton, "overflowButton");
        Intrinsics.checkNotNullParameter(pinOverflowMenuModalProvider, "pinOverflowMenuModalProvider");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        Intrinsics.checkNotNullParameter(additionalOverflow, "additionalOverflow");
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        overflowButton.u(new xo.k(gs0.k.a(pinOverflowMenuModalProvider, pin, jo1.a.RELATED_PINS, true, false, additionalOverflow, null, false, null, null, z13, navigationSource, null, false, null, null, null, false, false, false, false, null, null, false, 8387048), 10));
    }
}
