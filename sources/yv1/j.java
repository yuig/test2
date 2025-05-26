package yv1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.component.button.LegoButton;
import com.pinterest.gestalt.avatargroup.legacy.AvatarGroup;
import com.pinterest.ui.imageview.WebImageView;
import en1.b0;
import h32.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.g3;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lu.a0;
import nx.v;
import tl1.n;
import v.s;

/* loaded from: classes4.dex */
public final class j extends a0 implements vv1.i, v {

    /* renamed from: j, reason: collision with root package name */
    public static final List f140235j = f0.j(q42.c.FILTER, q42.c.DROPDOWN);

    /* renamed from: d, reason: collision with root package name */
    public final LegoButton f140236d;

    /* renamed from: e, reason: collision with root package name */
    public com.pinterest.feature.search.results.view.h f140237e;

    /* renamed from: f, reason: collision with root package name */
    public AvatarGroup f140238f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f140239g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f140240h;

    /* renamed from: i, reason: collision with root package name */
    public xv1.l f140241i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context, 13);
        Intrinsics.checkNotNullParameter(context, "context");
        LegoButton legoButton = new LegoButton(context, ga2.g.LegoButton_Secondary_Small);
        this.f140236d = legoButton;
        ImageView imageView = new ImageView(context);
        int dimensionPixelOffset = imageView.getResources().getDimensionPixelOffset(eo1.c.space_300);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset, 8388661));
        imageView.setImageResource(vc2.b.circle_badge);
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        imageView.setColorFilter(context.getColor(i13), PorterDuff.Mode.SRC_ATOP);
        imageView.setVisibility(8);
        this.f140239g = imageView;
        WebImageView webImageView = new WebImageView(context);
        int b03 = bs1.c.b0(webImageView, ga2.b.lego_button_small_height) - bs1.c.b0(webImageView, eo1.c.space_200);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b03, b03, 8388627);
        layoutParams.setMarginStart(bs1.c.b0(webImageView, eo1.c.space_100));
        webImageView.setLayoutParams(layoutParams);
        webImageView.i2(true);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.setBackgroundColor(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_200));
        webImageView.f52564p = new g(0);
        webImageView.a2(true);
        this.f140240h = webImageView;
        addView(legoButton);
        addView(imageView);
        addView(webImageView);
        setOnClickListener(new f(this, 1));
    }

    @Override // vv1.i
    public final void B2(boolean z13) {
        LegoButton legoButton = this.f140236d;
        if (z13) {
            dl2.b.A2(legoButton);
        } else {
            dl2.b.C2(legoButton);
        }
    }

    @Override // vv1.i
    public final void D1(ArrayList avatarsUrlUidPairs) {
        Intrinsics.checkNotNullParameter(avatarsUrlUidPairs, "avatarsUrlUidPairs");
        WebImageView webImageView = this.f140240h;
        Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
        int i13 = 0;
        bs1.c.R1(webImageView, false);
        bs1.c.R1(this.f140238f, false);
        ArrayList imageUrls = new ArrayList(g0.q(avatarsUrlUidPairs, 10));
        Iterator it = avatarsUrlUidPairs.iterator();
        while (it.hasNext()) {
            imageUrls.add((String) ((Pair) it.next()).f80346a);
        }
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        if (imageUrls.isEmpty()) {
            return;
        }
        int b03 = bs1.c.b0(this, eo1.c.space_100);
        int b04 = bs1.c.b0(this, ga2.b.lego_button_small_height) - bs1.c.b0(this, eo1.c.space_300);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AvatarGroup avatarGroup = new AvatarGroup(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, b04);
        layoutParams.setMarginStart(b03);
        layoutParams.gravity = 8388627;
        avatarGroup.setLayoutParams(layoutParams);
        avatarGroup.l(new tl1.d(new tl1.a(ga2.a.secondary_button_background_colors, 5), new n(h.f140232i, m42.b.one_bar_avatar_group_background, eo1.c.font_size_100, new i(this, i13), 6), null, 0, 0.55f, null, true, false, false, 940), true);
        avatarGroup.i(imageUrls.size(), (!ph.a.w0(com.bumptech.glide.d.E()) && imageUrls.size() == 3) ? 3 : 2, imageUrls);
        if (avatarGroup.f49268i != b04) {
            avatarGroup.f49268i = b04;
            avatarGroup.k();
            avatarGroup.requestLayout();
        }
        avatarGroup.f49267h = false;
        bs1.c.R1(avatarGroup.f49262c, false);
        avatarGroup.requestLayout();
        avatarGroup.setOnClickListener(new f(this, 0));
        this.f140238f = avatarGroup;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(m42.a.one_bar_module_single_image_group_padding);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(m42.a.one_bar_module_multi_image_group_padding);
        int size = imageUrls.size();
        if (size != 1) {
            dimensionPixelOffset = size != 2 ? dimensionPixelOffset + (dimensionPixelOffset2 * 2) : dimensionPixelOffset + dimensionPixelOffset2;
        }
        this.f140236d.setPaddingRelative((b03 * (imageUrls.size() > 2 ? 2 : 3)) + dimensionPixelOffset, 0, getResources().getDimensionPixelOffset(ga2.b.lego_button_small_side_padding), 0);
        addView(this.f140238f);
    }

    @Override // vv1.i
    public final void F(String str) {
        WebImageView webImageView = this.f140240h;
        Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
        bs1.c.R1(webImageView, str != null);
        webImageView.loadUrl(str);
    }

    @Override // vv1.i
    public final void F4(Integer num, Integer num2) {
        this.f140236d.setPaddingRelative(bs1.c.b0(this, num.intValue()), 0, bs1.c.b0(this, num2.intValue()), 0);
    }

    @Override // vv1.i
    public final void G3(List backgroundColors, List textColors) {
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        Intrinsics.checkNotNullParameter(textColors, "textColors");
        boolean z13 = !backgroundColors.isEmpty();
        LegoButton legoButton = this.f140236d;
        if (z13) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            legoButton.setBackgroundColor(g3.j2(context, backgroundColors));
        } else {
            legoButton.setBackgroundColor(bs1.c.B(this, mz1.b.secondary_button_elevated));
        }
        if (!(!textColors.isEmpty())) {
            legoButton.setTextColor(d5.a.b(getContext(), ga2.a.secondary_button_text_colors));
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        legoButton.setTextColor(g3.j2(context2, textColors));
    }

    @Override // vv1.i
    public final void H6(boolean z13) {
        s3(z13, false);
        B2(z13);
    }

    @Override // vv1.i
    public final void J6(int[] iArr) {
        LegoButton legoButton = this.f140236d;
        legoButton.setBackgroundTintList(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(getResources().getDimension(eo1.c.lego_corner_radius_large));
        legoButton.setBackground(gradientDrawable);
    }

    @Override // vv1.i
    public final void K4(q42.c cVar) {
        String contentDescription = cVar == q42.c.FILTER ? getResources().getString(mz1.g.filter_button_label) : "";
        Intrinsics.f(contentDescription);
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        setContentDescription(contentDescription);
    }

    @Override // vv1.i
    public final void Q4(en1.a0 skinTone) {
        Intrinsics.checkNotNullParameter(skinTone, "skinTone");
    }

    @Override // vv1.i
    public final void Z4(Integer num, Integer num2) {
    }

    @Override // vv1.i
    public final void d1(q42.f fVar) {
        setTag(m42.c.one_bar_module_type_view_tag, fVar);
    }

    @Override // vv1.i
    public final void i1(String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        setContentDescription(contentDescription);
    }

    @Override // vv1.i
    public final void l0(String displayText) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        this.f140236d.setText(displayText);
    }

    @Override // vv1.i
    public final void l4() {
        AvatarGroup avatarGroup = this.f140238f;
        if (avatarGroup != null) {
            bs1.c.R1(avatarGroup, false);
        }
    }

    @Override // vv1.i
    public final void l5(xv1.l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f140241i = listener;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        xv1.l lVar = this.f140241i;
        if (lVar != null) {
            return lVar.s3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        u1 t33;
        xv1.l lVar = this.f140241i;
        if (lVar == null || (t33 = lVar.t3()) == null) {
            return null;
        }
        return new vv1.n(t33, null);
    }

    @Override // vv1.i
    public final void n3(int i13, q42.c cVar, boolean z13, b0 b0Var) {
        Drawable mutate;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.space_300);
        int dimensionPixelOffset2 = cVar == q42.c.DROPDOWN ? dimensionPixelOffset : getResources().getDimensionPixelOffset(eo1.c.space_400);
        LegoButton legoButton = this.f140236d;
        legoButton.f44746f = dimensionPixelOffset2;
        if (CollectionsKt.L(f140235j, cVar)) {
            LegoButton.d(legoButton, i13);
            return;
        }
        if (!z13) {
            if (i13 == 0) {
                legoButton.setCompoundDrawablesRelative(null, null, null, null);
                return;
            }
            Context context = legoButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            legoButton.f44744d = bs1.c.h0(context, i13);
            legoButton.f(true, true);
            return;
        }
        if (i13 == 0) {
            legoButton.setCompoundDrawablesRelative(null, null, null, null);
            return;
        }
        Context context2 = legoButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        legoButton.f44744d = bs1.c.h0(context2, i13);
        Context context3 = legoButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        legoButton.f44745e = bs1.c.h0(context3, sm1.b.ic_arrow_down_gestalt);
        int dimensionPixelOffset3 = legoButton.getResources().getDimensionPixelOffset(eo1.c.space_900);
        Drawable drawable = legoButton.f44745e;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
            mutate.setColorFilter(new PorterDuffColorFilter(legoButton.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
        Drawable drawable2 = legoButton.f44744d;
        if (drawable2 != null) {
            Drawable mutate2 = drawable2.mutate();
            mutate2.setBounds(0, 0, dimensionPixelOffset3, dimensionPixelOffset3);
            legoButton.setCompoundDrawablesRelative(mutate2, null, legoButton.f44745e, null);
            legoButton.e();
        }
        if (legoButton.getCompoundDrawablePadding() == 0) {
            legoButton.setCompoundDrawablePadding(legoButton.getResources().getDimensionPixelSize(eo1.c.margin_quarter));
        }
    }

    @Override // vv1.i
    public final void n4(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        setTag(tag);
    }

    @Override // vv1.i
    public final void r6(boolean z13) {
        LegoButton legoButton = this.f140236d;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(legoButton, "scaleX", 1.0f, 0.95f, 1.05f, 1.0f);
        ofFloat.setDuration(600L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(legoButton, "scaleY", 1.0f, 0.95f, 1.05f, 1.0f);
        ofFloat2.setDuration(600L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(legoButton, "rotation", 0.0f, 5.0f, 0.0f, -5.0f, 0.0f, 5.0f, 0.0f, -5.0f, 0.0f, 5.0f, 0.0f, -5.0f, 0.0f);
        ofFloat3.setDuration(2100L);
        if (z13) {
            ofFloat3.start();
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).after(ofFloat);
        animatorSet.start();
    }

    @Override // vv1.i
    public final void s3(boolean z13, boolean z14) {
        com.pinterest.feature.search.results.view.h hVar = this.f140237e;
        if (hVar != null) {
            removeView(hVar);
        }
        if (z13) {
            post(new s(this, z14, 8));
        }
    }

    @Override // android.view.View, vv1.i
    public final void setEnabled(boolean z13) {
        super.setEnabled(z13);
        this.f140236d.setAlpha(z13 ? 1.0f : 0.5f);
    }

    @Override // vv1.i
    public final void v2(int i13) {
        this.f140236d.setId(i13);
    }

    @Override // vv1.i
    public final void y2(boolean z13) {
        bs1.c.R1(this.f140239g, z13);
    }
}
