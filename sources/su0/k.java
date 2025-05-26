package su0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pk.a0;

/* loaded from: classes5.dex */
public final class k extends xo.s {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f115201e = 0;

    /* renamed from: d, reason: collision with root package name */
    public w f115202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String overlayTitle, String str, List options) {
        super(context, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overlayTitle, "overlayTitle");
        Intrinsics.checkNotNullParameter(options, "options");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        com.bumptech.glide.c.a1(layoutParams, 0, 0, 0, bs1.c.W(this, eo1.c.space_1000));
        setLayoutParams(layoutParams);
        View.inflate(context, aq1.f.view_idea_pin_overlay_duration_modal, this);
        setOrientation(1);
        View findViewById = findViewById(aq1.d.overlay_title);
        GestaltText gestaltText = (GestaltText) findViewById;
        Intrinsics.f(gestaltText);
        a0.p(gestaltText, overlayTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = findViewById(aq1.d.overlay_subtitle);
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        Intrinsics.f(gestaltText2);
        a0.p(gestaltText2, str == null ? "" : str);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        if (str == null) {
            gestaltText.setPaddingRelative(gestaltText.getPaddingStart(), gestaltText.getPaddingTop(), gestaltText.getPaddingEnd(), bs1.c.W(this, eo1.c.space_200));
            a0.k0(gestaltText2);
        }
        Iterator it = options.iterator();
        while (it.hasNext()) {
            qu0.a aVar = (qu0.a) it.next();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltButton.LargeSecondaryButton largeSecondaryButton = new GestaltButton.LargeSecondaryButton(6, context2, (AttributeSet) null);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            com.bumptech.glide.c.a1(layoutParams2, 0, bs1.c.W(largeSecondaryButton, eo1.c.space_200), 0, 0);
            largeSecondaryButton.setLayoutParams(layoutParams2);
            largeSecondaryButton.d(new au0.f(aVar, 6));
            largeSecondaryButton.e(new lq0.o(5, this, aVar));
            addView(largeSecondaryButton);
        }
    }
}
