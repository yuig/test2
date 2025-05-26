package com.pinterest.oneBarLibrary.modals.views;

import a11.p;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import bs1.c;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import eo1.a;
import eo1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lu.a0;
import m60.w;
import nv1.d;
import nv1.e;
import org.jetbrains.annotations.NotNull;
import q71.r0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/oneBarLibrary/modals/views/BodyTypeFilterEducationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyTypeFilterEducationView extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f49996g = 0;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f49997d;

    /* renamed from: e, reason: collision with root package name */
    public NestedScrollView f49998e;

    /* renamed from: f, reason: collision with root package name */
    public w f49999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyTypeFilterEducationView(Context context) {
        super(context, 12);
        Intrinsics.checkNotNullParameter(context, "context");
        g();
    }

    public final void g() {
        View.inflate(getContext(), e.body_type_education, this);
        View findViewById = findViewById(d.body_type_scroll_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById;
        Intrinsics.checkNotNullParameter(nestedScrollView, "<set-?>");
        this.f49998e = nestedScrollView;
        View findViewById2 = findViewById(d.header_container);
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Intrinsics.f(frameLayout);
        gradientDrawable.setColors(new int[]{c.B(frameLayout, b.color_pink_flaminglow_50), c.B(frameLayout, b.color_blue_skycicle_50), c.B(frameLayout, b.color_teal_spabattical_50), c.B(frameLayout, b.color_orange_firetini_50), dl2.b.y0(frameLayout, a.sema_color_background_default)});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setGradientType(0);
        float dimension = frameLayout.getResources().getDimension(eo1.c.lego_corner_radius_large);
        gradientDrawable.setCornerRadii(new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = findViewById(d.body_type_image_one);
        WebImageView webImageView = (WebImageView) findViewById3;
        webImageView.loadUrl("https://i.pinimg.com/originals/3c/5a/88/3c5a8846a4c2b55d6b52f2aded04ed9d.png");
        webImageView.setScaleType(ImageView.ScaleType.FIT_START);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        View findViewById4 = findViewById(d.body_type_image_two);
        ((WebImageView) findViewById4).loadUrl("https://i.pinimg.com/originals/85/0a/41/850a41a47850643e730ec29bc9bb6159.png");
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        View findViewById5 = findViewById(d.body_type_image_three);
        ((WebImageView) findViewById5).loadUrl("https://i.pinimg.com/originals/71/63/18/71631814a2de737b377940e3239e26cf.png");
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        View findViewById6 = findViewById(d.body_type_image_four);
        ((WebImageView) findViewById6).loadUrl("https://i.pinimg.com/originals/90/02/80/9002808c65ac3989cfd0fd19f9ba5092.png");
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        View findViewById7 = findViewById(d.body_type_image_five);
        ((WebImageView) findViewById7).loadUrl("https://i.pinimg.com/originals/39/a6/68/39a66863622178a296d329f600fd533d.png");
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        View findViewById8 = findViewById(d.contact_us_text_view);
        GestaltText gestaltText = (GestaltText) findViewById8;
        Intrinsics.f(gestaltText);
        pk.a0.R(gestaltText);
        String f23 = c.f2(gestaltText, m42.e.body_type_call_to_action_learn);
        String f24 = c.f2(gestaltText, m42.e.body_type_call_to_action_contact);
        String str = f23 + " " + c.f2(gestaltText, m42.e.body_type_call_to_action_connector) + "\n\n" + f24;
        int L = StringsKt.L(str, f23, 0, false, 6);
        int length = f23.length() + L;
        int L2 = StringsKt.L(str, f24, 0, false, 6);
        int length2 = f24.length() + L2;
        uv1.a aVar = new uv1.a(this, 1);
        uv1.a aVar2 = new uv1.a(this, 0);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(aVar, L, length, 33);
        spannableString.setSpan(aVar2, L2, length2, 33);
        gestaltText.i(new r0(spannableString, 4));
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        GestaltIconButtonFloating gestaltIconButtonFloating = (GestaltIconButtonFloating) findViewById(d.dismiss_button);
        gestaltIconButtonFloating.c(new gh1.e(this, 17));
        Object parent = gestaltIconButtonFloating.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.post(new p(22, gestaltIconButtonFloating, view));
        }
    }

    public final void w() {
        NestedScrollView nestedScrollView = this.f49998e;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, 0);
        } else {
            Intrinsics.r("scrollView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyTypeFilterEducationView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 12);
        Intrinsics.checkNotNullParameter(context, "context");
        g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyTypeFilterEducationView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 12, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        g();
    }
}
