package com.pinterest.feature.profile.savedtab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.ui.components.banners.LegoBannerView;
import com.pinterest.ui.components.banners.LegoBoardInviteBannerView;
import d5.a;
import d51.e;
import ja2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.u2;
import lu.a0;
import m60.r0;
import m60.s0;
import m60.x0;
import org.jetbrains.annotations.NotNull;
import pb0.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/profile/savedtab/view/LegoBoardInviteProfileCell;", "Landroid/widget/FrameLayout;", "Ld51/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegoBoardInviteProfileCell extends a0 implements e {

    /* renamed from: d, reason: collision with root package name */
    public u2 f47585d;

    /* renamed from: e, reason: collision with root package name */
    public d f47586e;

    /* renamed from: f, reason: collision with root package name */
    public final AttributeSet f47587f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47588g;

    /* renamed from: h, reason: collision with root package name */
    public LegoBannerView f47589h;

    /* renamed from: i, reason: collision with root package name */
    public LegoBoardInviteBannerView f47590i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardInviteProfileCell(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 7);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClipChildren(false);
        setClipToPadding(false);
        u2 u2Var = this.f47585d;
        if (u2Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (u2Var.d()) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.f47590i = i(context2, this.f47587f, this.f47588g);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            LegoBannerView g13 = g(context3, this.f47587f, this.f47588g);
            g13.f52261p.i(b.f75312k);
            this.f47589h = g13;
        }
        this.f47587f = attributeSet;
    }

    public final LegoBannerView g(Context context, AttributeSet attributeSet, int i13) {
        LegoBannerView legoBannerView = new LegoBannerView(context, attributeSet, i13);
        legoBannerView.D();
        String string = legoBannerView.getResources().getString(x0.accept);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        legoBannerView.d0(string);
        String string2 = legoBannerView.getResources().getString(x0.decline);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        legoBannerView.g0(string2);
        legoBannerView.t(legoBannerView.getResources().getDimension(r0.group_board_banner_corner_radius));
        legoBannerView.l(legoBannerView.getResources().getDimension(r0.group_board_banner_elevation));
        addView(legoBannerView, new FrameLayout.LayoutParams(-1, -2));
        return legoBannerView;
    }

    public final LegoBoardInviteBannerView i(Context context, AttributeSet attributeSet, int i13) {
        LegoBoardInviteBannerView legoBoardInviteBannerView = new LegoBoardInviteBannerView(context, attributeSet, i13);
        int i14 = s0.profile_board_invite_large_rounded_rect_light_grey;
        Object obj = a.f53679a;
        legoBoardInviteBannerView.setBackground(context.getDrawable(i14));
        legoBoardInviteBannerView.setElevation(legoBoardInviteBannerView.getResources().getDimension(r0.group_board_banner_elevation));
        addView(legoBoardInviteBannerView, new FrameLayout.LayoutParams(-1, -2));
        return legoBoardInviteBannerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardInviteProfileCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 7, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClipChildren(false);
        setClipToPadding(false);
        u2 u2Var = this.f47585d;
        if (u2Var != null) {
            if (u2Var.d()) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.f47590i = i(context2, this.f47587f, this.f47588g);
            } else {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                LegoBannerView g13 = g(context3, this.f47587f, this.f47588g);
                g13.f52261p.i(b.f75312k);
                this.f47589h = g13;
            }
            this.f47587f = attributeSet;
            this.f47588g = i13;
            return;
        }
        Intrinsics.r("experiments");
        throw null;
    }
}
