package u81;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.design.components.images.ImageStack;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.TopBottomGradientView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltButton f121099a;

    /* renamed from: b, reason: collision with root package name */
    public final List f121100b;

    /* renamed from: c, reason: collision with root package name */
    public final List f121101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f121102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f121103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, b60.b activeUserManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        String[] strArr = new String[3];
        wy0 f13 = ((b60.d) activeUserManager).f();
        strArr[0] = Intrinsics.d(f13 != null ? f13.a3() : null, "male") ? "https://i.pinimg.com/564x/f3/97/d6/f397d6069692f74980d9f7a2db215674.jpg" : "https://i.pinimg.com/564x/a3/1b/27/a31b27fcfea7099eb54287d031577bf2.jpg";
        strArr[1] = "https://i.pinimg.com/736x/6d/ea/2c/6dea2cb52a669381c794ef418b02705a.jpg";
        strArr[2] = "https://i.pinimg.com/564x/bf/70/ea/bf70ea6248c13b7d20ac704f15676c99.jpg";
        this.f121100b = kotlin.collections.f0.j(strArr);
        this.f121101c = kotlin.collections.f0.j(Integer.valueOf(bs1.c.W(this, uc2.b.lens_permissions_first_image_width)), Integer.valueOf(bs1.c.W(this, uc2.b.lens_permissions_second_image_width)), Integer.valueOf(bs1.c.W(this, uc2.b.lens_permissions_third_image_width)));
        this.f121102d = bs1.c.W(this, eo1.c.lego_corner_radius_small);
        int i13 = uc2.a.pinterest_white_transparent_97;
        Object obj = d5.a.f53679a;
        this.f121103e = context.getColor(i13);
        WebImageView webImageView = new WebImageView(getContext());
        webImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webImageView.setColorFilter(webImageView.getContext().getColor(wy1.a.pinterest_white_transparent_70), PorterDuff.Mode.SRC_ATOP);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.f52564p = new eu.l(webImageView, 4);
        webImageView.loadUrl("https://i.pinimg.com/564x/bf/70/ea/bf70ea6248c13b7d20ac704f15676c99.jpg");
        addView(webImageView);
        addView(new TopBottomGradientView(0, 0, 0, 30, context, null), -1, -1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(bs1.c.W(linearLayout, eo1.c.space_700), 0, bs1.c.W(linearLayout, eo1.c.space_700), bs1.c.W(linearLayout, uc2.b.lens_15_bottom_gradient_height));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        addView(linearLayout);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        int W = bs1.c.W(frameLayout, eo1.c.space_400);
        frameLayout.setPadding(W, W, W, W);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ArrayList arrayList = new ArrayList(3);
        int i14 = 0;
        for (int i15 = 3; i14 < i15; i15 = 3) {
            int intValue = ((Number) this.f121101c.get(i14)).intValue();
            float f14 = intValue;
            String str = (String) this.f121100b.get(i14);
            int i16 = (int) (1.3333f * f14);
            float f15 = i14 != 0 ? i14 != 1 ? i14 != 2 ? 0.0f : 10.24f : 9.72f : -9.12f;
            int M = pe.i.M(i14, intValue);
            int i17 = 8388611;
            if (i14 != 0) {
                if (i14 == 1) {
                    i17 = 48;
                } else if (i14 == 2) {
                    i17 = 80;
                }
            }
            arrayList.add(new xe0.b(str, intValue, i16, f15, M, i17, (int) (i14 == 0 ? f14 * 0.15f : 10.0f), (int) (i14 == 0 ? f14 * 0.15f : 15.0f), i14 == 2 ? (int) (intValue * 0.1d) : 0, null));
            i14++;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ImageStack imageStack = new ImageStack(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        imageStack.setLayoutParams(layoutParams2);
        int W2 = bs1.c.W(imageStack, eo1.c.space_200);
        imageStack.setPadding(W2, W2, W2, W2);
        ImageStack.b(imageStack, 0, 0, 0, bs1.c.W(imageStack, eo1.c.corner_radius_14), 4, 0, 0, 99);
        imageStack.a(arrayList);
        imageStack.setClipChildren(false);
        imageStack.setClipToPadding(false);
        frameLayout.addView(imageStack);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context3);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388661;
        layoutParams3.topMargin = bs1.c.W(roundedCornersLayout, eo1.c.space_1600);
        roundedCornersLayout.setLayoutParams(layoutParams3);
        int i18 = this.f121102d;
        roundedCornersLayout.g(i18, i18, i18, i18);
        int i19 = this.f121103e;
        roundedCornersLayout.a(i19);
        float f16 = i18;
        ef0.a cornerSettings = new ef0.a(f16, 6);
        Intrinsics.checkNotNullParameter(cornerSettings, "cornerSettings");
        roundedCornersLayout.f44944e = cornerSettings;
        int W3 = bs1.c.W(roundedCornersLayout, eo1.c.space_200);
        roundedCornersLayout.setPadding(W3, W3, W3, W3);
        roundedCornersLayout.setElevation(bs1.c.W(roundedCornersLayout, eo1.c.bottom_nav_elevation));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
        gestaltText.i(c.f121009r);
        roundedCornersLayout.addView(gestaltText);
        frameLayout.addView(roundedCornersLayout);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        RoundedCornersLayout roundedCornersLayout2 = new RoundedCornersLayout(context5);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.bottomMargin = bs1.c.W(roundedCornersLayout2, eo1.c.space_500);
        roundedCornersLayout2.setLayoutParams(layoutParams4);
        roundedCornersLayout2.g(i18, i18, i18, i18);
        roundedCornersLayout2.a(i19);
        ef0.a cornerSettings2 = new ef0.a(f16, 6);
        Intrinsics.checkNotNullParameter(cornerSettings2, "cornerSettings");
        roundedCornersLayout2.f44944e = cornerSettings2;
        int W4 = bs1.c.W(roundedCornersLayout2, eo1.c.space_200);
        roundedCornersLayout2.setPadding(W4, W4, W4, W4);
        roundedCornersLayout2.setElevation(bs1.c.W(roundedCornersLayout2, eo1.c.bottom_nav_elevation));
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        GestaltText gestaltText2 = new GestaltText(6, context6, (AttributeSet) null);
        gestaltText2.i(c.f121010s);
        roundedCornersLayout2.addView(gestaltText2);
        frameLayout.addView(roundedCornersLayout2);
        linearLayout.addView(frameLayout);
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        GestaltText gestaltText3 = new GestaltText(6, context7, (AttributeSet) null);
        int W5 = bs1.c.W(gestaltText3, eo1.c.space_100);
        gestaltText3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 8388659));
        gestaltText3.setPaddingRelative(W5, W5, W5, gestaltText3.getPaddingBottom());
        gestaltText3.i(c.f121012u);
        linearLayout.addView(gestaltText3);
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        GestaltText gestaltText4 = new GestaltText(6, context8, (AttributeSet) null);
        int W6 = bs1.c.W(gestaltText4, eo1.c.space_100);
        gestaltText4.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        gestaltText4.setPaddingRelative(W6, W6, W6, gestaltText4.getPaddingBottom());
        gestaltText4.i(c.f121011t);
        linearLayout.addView(gestaltText4);
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        GestaltButton gestaltButton = new GestaltButton(0, 14, context9, (AttributeSet) null);
        gestaltButton.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 1;
        layoutParams5.topMargin = bs1.c.W(gestaltButton, eo1.c.space_500);
        gestaltButton.setLayoutParams(layoutParams5);
        gestaltButton.d(c.f121008q);
        this.f121099a = gestaltButton;
        linearLayout.addView(gestaltButton);
    }

    public final GestaltButton a() {
        return this.f121099a;
    }
}
