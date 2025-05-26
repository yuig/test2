package oq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f97115c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f97116a;

    /* renamed from: b, reason: collision with root package name */
    public final View f97117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i13) {
        super(context);
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(context, "context");
            super(context);
            setOrientation(1);
            View inflate = View.inflate(context, d70.e.view_floating_tool, this);
            inflate.setMinimumWidth(inflate.getResources().getDimensionPixelSize(eo1.c.space_1600));
            View findViewById = inflate.findViewById(d70.d.icon);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            this.f97116a = (GestaltIcon) findViewById;
            View findViewById2 = inflate.findViewById(d70.d.text);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            this.f97117b = (GestaltText) findViewById2;
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        gestaltText.i(n.f97098q);
        this.f97117b = gestaltText;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltIcon gestaltIcon = new GestaltIcon(context3);
        gestaltIcon.g2(n.f97097p);
        this.f97116a = gestaltIcon;
        setId(n80.c.pin_closeup_clickable_title_module);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackground(bs1.c.f0(this, r80.b.pin_closeup_redesign_module_background, null, null, 6));
        setGravity(16);
        int W = bs1.c.W(this, eo1.c.space_400);
        setPaddingRelative(W, W, bs1.c.W(this, eo1.c.space_500), W);
        addView(gestaltText);
        addView(gestaltIcon);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(GestaltAvatarGroup gestaltAvatarGroup, om1.c iconButtonState, sl1.l event, LinearLayout.LayoutParams layoutParams, Drawable drawable) {
        super(gestaltAvatarGroup.getContext());
        Intrinsics.checkNotNullParameter(iconButtonState, "iconButtonState");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        this.f97116a = gestaltAvatarGroup;
        setGravity(17);
        setBackground(drawable);
        setLayoutParams(layoutParams);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(context, iconButtonState);
        this.f97117b = gestaltIconButton;
        gestaltIconButton.u(new la1.k(13, gestaltAvatarGroup, event));
        addView(gestaltIconButton);
    }
}
