package com.pinterest.ui.components.banners;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.components.banners.LegoBoardInviteBannerView;
import com.pinterest.ui.imageview.WebImageView;
import ga2.b;
import ja2.e;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l60.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ui/components/banners/LegoBoardInviteBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bannerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class LegoBoardInviteBannerView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f52272a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f52273b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f52274c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f52275d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f52276e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f52277f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f52278g;

    /* renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f52279h;

    /* renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f52280i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f52281j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltAvatar f52282k;

    /* renamed from: l, reason: collision with root package name */
    public Function0 f52283l;

    /* renamed from: m, reason: collision with root package name */
    public Function0 f52284m;

    /* renamed from: n, reason: collision with root package name */
    public final float f52285n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardInviteBannerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52283l = e.f75317l;
        this.f52284m = e.f75318m;
        float dimensionPixelSize = getResources().getDimensionPixelSize(b.lego_board_rep_pin_preview_corner_radius);
        this.f52285n = dimensionPixelSize;
        View.inflate(getContext(), l60.b.lego_board_invite_banner_view, this);
        View findViewById = findViewById(a.primary_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f52272a = webImageView;
        View findViewById2 = findViewById(a.primary_image_one);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52273b = (WebImageView) findViewById2;
        View findViewById3 = findViewById(a.primary_image_two);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f52274c = (WebImageView) findViewById3;
        View findViewById4 = findViewById(a.secondary_image_two);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f52275d = (WebImageView) findViewById4;
        View findViewById5 = findViewById(a.secondary_top_image);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        WebImageView webImageView2 = (WebImageView) findViewById5;
        this.f52276e = webImageView2;
        View findViewById6 = findViewById(a.secondary_bottom_image);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        WebImageView webImageView3 = (WebImageView) findViewById6;
        this.f52277f = webImageView3;
        View findViewById7 = findViewById(a.banner_message);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f52281j = (GestaltText) findViewById7;
        View findViewById8 = findViewById(a.banner_button_group);
        final GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById8;
        final int i13 = 0;
        gestaltButtonGroup.b(new gm1.a() { // from class: ja2.f
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                LegoBoardInviteBannerView.L(gestaltButtonGroup, this, cVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        View findViewById9 = findViewById(a.banner_content_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f52282k = (GestaltAvatar) findViewById9;
        View findViewById10 = findViewById(a.board_invite_images_three);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f52278g = (ConstraintLayout) findViewById10;
        View findViewById11 = findViewById(a.board_invite_images_two);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f52279h = (ConstraintLayout) findViewById11;
        View findViewById12 = findViewById(a.board_invite_images_one);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f52280i = (ConstraintLayout) findViewById12;
        if (c.l1(this)) {
            webImageView.g2(0.0f, dimensionPixelSize, 0.0f, 0.0f);
            webImageView2.g2(dimensionPixelSize, 0.0f, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            webImageView.g2(dimensionPixelSize, 0.0f, 0.0f, 0.0f);
            webImageView2.g2(0.0f, dimensionPixelSize, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public static void L(GestaltButtonGroup gestaltButtonGroup, LegoBoardInviteBannerView this$0, gm1.c event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.f(gestaltButtonGroup);
        if (r.Z0(event, gestaltButtonGroup)) {
            this$0.f52283l.invoke();
        } else if (r.a1(event, gestaltButtonGroup)) {
            this$0.f52284m.invoke();
        }
    }

    public static void T(WebImageView webImageView, String str) {
        webImageView.w2((str == null || str.length() == 0) ? null : Uri.parse(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardInviteBannerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52283l = e.f75317l;
        this.f52284m = e.f75318m;
        float dimensionPixelSize = getResources().getDimensionPixelSize(b.lego_board_rep_pin_preview_corner_radius);
        this.f52285n = dimensionPixelSize;
        View.inflate(getContext(), l60.b.lego_board_invite_banner_view, this);
        View findViewById = findViewById(a.primary_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f52272a = webImageView;
        View findViewById2 = findViewById(a.primary_image_one);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52273b = (WebImageView) findViewById2;
        View findViewById3 = findViewById(a.primary_image_two);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f52274c = (WebImageView) findViewById3;
        View findViewById4 = findViewById(a.secondary_image_two);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f52275d = (WebImageView) findViewById4;
        View findViewById5 = findViewById(a.secondary_top_image);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        WebImageView webImageView2 = (WebImageView) findViewById5;
        this.f52276e = webImageView2;
        View findViewById6 = findViewById(a.secondary_bottom_image);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        WebImageView webImageView3 = (WebImageView) findViewById6;
        this.f52277f = webImageView3;
        View findViewById7 = findViewById(a.banner_message);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f52281j = (GestaltText) findViewById7;
        View findViewById8 = findViewById(a.banner_button_group);
        final GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById8;
        final int i14 = 1;
        gestaltButtonGroup.b(new gm1.a() { // from class: ja2.f
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i142 = i14;
                LegoBoardInviteBannerView.L(gestaltButtonGroup, this, cVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        View findViewById9 = findViewById(a.banner_content_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f52282k = (GestaltAvatar) findViewById9;
        View findViewById10 = findViewById(a.board_invite_images_three);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f52278g = (ConstraintLayout) findViewById10;
        View findViewById11 = findViewById(a.board_invite_images_two);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f52279h = (ConstraintLayout) findViewById11;
        View findViewById12 = findViewById(a.board_invite_images_one);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f52280i = (ConstraintLayout) findViewById12;
        if (c.l1(this)) {
            webImageView.g2(0.0f, dimensionPixelSize, 0.0f, 0.0f);
            webImageView2.g2(dimensionPixelSize, 0.0f, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            webImageView.g2(dimensionPixelSize, 0.0f, 0.0f, 0.0f);
            webImageView2.g2(0.0f, dimensionPixelSize, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }
}
