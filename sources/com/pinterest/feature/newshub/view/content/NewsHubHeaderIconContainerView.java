package com.pinterest.feature.newshub.view.content;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bs1.c;
import com.airbnb.lottie.LottieAnimationView;
import com.makeramen.RoundedImageView;
import com.pinterest.component.avatarpairs.AvatarPair;
import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import q21.g;
import r1.j0;
import rl1.n;
import vx0.b;
import zu1.a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/newshub/view/content/NewsHubHeaderIconContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vo/i", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewsHubHeaderIconContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final RoundedImageView f46827a;

    /* renamed from: b, reason: collision with root package name */
    public final ProportionalImageView f46828b;

    /* renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f46829c;

    /* renamed from: d, reason: collision with root package name */
    public final AvatarPair f46830d;

    /* renamed from: e, reason: collision with root package name */
    public final g f46831e;

    /* renamed from: f, reason: collision with root package name */
    public final SmallOverlayIconView f46832f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsHubHeaderIconContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NewsHubHeaderIconContainerView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubHeaderIconContainerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = c.W(this, a.news_hub_compact_icon_width);
        int W2 = c.W(this, a.news_hub_compact_icon_height);
        c.s1(this, 0, 0, new ck0.a(W, W2, 2), 3);
        ProportionalImageView proportionalImageView = new ProportionalImageView(context);
        proportionalImageView.setId(zu1.c.news_hub_header_icon);
        c.s1(proportionalImageView, 0, 0, b.f126819k, 3);
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f46828b = proportionalImageView;
        RoundedImageView roundedImageView = new RoundedImageView(context);
        roundedImageView.setId(zu1.c.news_hub_header_animation);
        c.s1(roundedImageView, 0, 0, new ck0.a(W, W2, 3), 3);
        roundedImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f46827a = roundedImageView;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setId(zu1.c.news_hub_header_lottie);
        c.s1(lottieAnimationView, 0, 0, new ck0.a(W, W2, 4), 3);
        lottieAnimationView.M2(-1);
        this.f46829c = lottieAnimationView;
        AvatarPair avatarPair = new AvatarPair(context);
        avatarPair.setId(zu1.c.news_hub_header_avatar_pair);
        avatarPair.Z(n.f(context), n.h(context));
        c.s1(avatarPair, 0, 0, b.f126820l, 3);
        this.f46830d = avatarPair;
        g gVar = new g(context, r0.corner_radius_large);
        gVar.setId(zu1.c.news_hub_header_pin_icon);
        c.s1(gVar, 0, 0, new ck0.a(W, W2, 5), 3);
        this.f46831e = gVar;
        SmallOverlayIconView smallOverlayIconView = new SmallOverlayIconView(6, context, (AttributeSet) null);
        smallOverlayIconView.setId(zu1.c.news_hub_header_small_overlay_icon);
        c.s1(smallOverlayIconView, 0, 0, new j0(c.W(smallOverlayIconView, rl1.j0.lego_avatar_size_extra_small), 28), 3);
        c.R1(smallOverlayIconView, false);
        this.f46832f = smallOverlayIconView;
        addView(roundedImageView);
        addView(proportionalImageView);
        addView(lottieAnimationView);
        addView(avatarPair);
        addView(gVar);
        addView(smallOverlayIconView);
    }
}
