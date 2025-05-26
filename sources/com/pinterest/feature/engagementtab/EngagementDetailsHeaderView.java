package com.pinterest.feature.engagementtab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.engagementtab.EngagementDetailsHeaderView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import eo1.c;
import kh2.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng0.a;
import ng0.b;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qb0.j;
import rl1.b0;
import rq.y;
import wr0.e;
import wr0.u;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/engagementtab/EngagementDetailsHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "engagementTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EngagementDetailsHeaderView extends ConstraintLayout implements n {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f45677k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltIconButton f45678a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIconButton f45679b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIconButton f45680c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f45681d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltAvatar f45682e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f45683f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f45684g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f45685h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f45686i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f45687j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngagementDetailsHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_engagement_detail_header, this);
        View findViewById = findViewById(a.engagement_details_header_like_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45678a = (GestaltIconButton) findViewById;
        View findViewById2 = findViewById(a.engagement_details_header_comments_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45679b = (GestaltIconButton) findViewById2;
        View findViewById3 = findViewById(a.engagement_details_header_edit_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45680c = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(a.engagement_details_header_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45681d = (WebImageView) findViewById4;
        View findViewById5 = findViewById(a.engagement_details_header_pin_description);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45683f = (GestaltText) findViewById5;
        View findViewById6 = findViewById(a.engagement_details_header_like_count);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45684g = (GestaltText) findViewById6;
        View findViewById7 = findViewById(a.engagement_details_header_comment_count);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f45685h = (GestaltText) findViewById7;
        View findViewById8 = findViewById(a.engagement_details_header_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f45682e = (GestaltAvatar) findViewById8;
        View findViewById9 = findViewById(a.engagement_details_header_username);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f45686i = (GestaltText) findViewById9;
        View findViewById10 = findViewById(a.engagement_details_header_mention_notification);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f45687j = (GestaltText) findViewById10;
    }

    public final void L(final u headerViewState) {
        Intrinsics.checkNotNullParameter(headerViewState, "headerViewState");
        WebImageView webImageView = this.f45681d;
        webImageView.loadUrl(headerViewState.f130920f);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float dimension = webImageView.getResources().getDimension(c.lego_corner_radius_small);
        webImageView.g2(dimension, dimension, dimension, dimension);
        webImageView.setOnClickListener(new lj0.a(headerViewState, 23));
        final int i13 = 0;
        this.f45683f.i(new e(headerViewState, i13)).j(new gm1.a() { // from class: wr0.d
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                u headerViewState2 = headerViewState;
                switch (i14) {
                    case 0:
                        int i15 = EngagementDetailsHeaderView.f45677k;
                        Intrinsics.checkNotNullParameter(headerViewState2, "$headerViewState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        headerViewState2.f130925k.invoke();
                        break;
                    default:
                        int i16 = EngagementDetailsHeaderView.f45677k;
                        Intrinsics.checkNotNullParameter(headerViewState2, "$headerViewState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            headerViewState2.f130918d.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        if (headerViewState.f130917c) {
            final int i14 = 1;
            this.f45684g.i(new e(headerViewState, i14));
            this.f45685h.i(new e(headerViewState, 2));
            com.bumptech.glide.c.u1(this.f45678a);
            com.bumptech.glide.c.u1(this.f45679b);
            GestaltIconButton gestaltIconButton = this.f45680c;
            com.bumptech.glide.c.u1(gestaltIconButton);
            gestaltIconButton.u(new gm1.a() { // from class: wr0.d
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i142 = i14;
                    u headerViewState2 = headerViewState;
                    switch (i142) {
                        case 0:
                            int i15 = EngagementDetailsHeaderView.f45677k;
                            Intrinsics.checkNotNullParameter(headerViewState2, "$headerViewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            headerViewState2.f130925k.invoke();
                            break;
                        default:
                            int i16 = EngagementDetailsHeaderView.f45677k;
                            Intrinsics.checkNotNullParameter(headerViewState2, "$headerViewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                headerViewState2.f130918d.invoke();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            wy0 wy0Var = headerViewState.f130921g;
            if (wy0Var != null) {
                GestaltAvatar gestaltAvatar = this.f45682e;
                m0.V0(gestaltAvatar, wy0Var);
                Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
                gestaltAvatar.H2(b0.f108526k);
                this.f45686i.i(new y(5, wy0Var));
                a0.w1(this.f45687j);
            }
        }
        bs1.c.U1(this);
    }

    public final void T(int i13) {
        GestaltText gestaltText = this.f45685h;
        if (bs1.c.o1(gestaltText)) {
            a0.p(gestaltText, j.b(i13));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngagementDetailsHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_engagement_detail_header, this);
        View findViewById = findViewById(a.engagement_details_header_like_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45678a = (GestaltIconButton) findViewById;
        View findViewById2 = findViewById(a.engagement_details_header_comments_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45679b = (GestaltIconButton) findViewById2;
        View findViewById3 = findViewById(a.engagement_details_header_edit_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45680c = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(a.engagement_details_header_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45681d = (WebImageView) findViewById4;
        View findViewById5 = findViewById(a.engagement_details_header_pin_description);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45683f = (GestaltText) findViewById5;
        View findViewById6 = findViewById(a.engagement_details_header_like_count);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45684g = (GestaltText) findViewById6;
        View findViewById7 = findViewById(a.engagement_details_header_comment_count);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f45685h = (GestaltText) findViewById7;
        View findViewById8 = findViewById(a.engagement_details_header_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f45682e = (GestaltAvatar) findViewById8;
        View findViewById9 = findViewById(a.engagement_details_header_username);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f45686i = (GestaltText) findViewById9;
        View findViewById10 = findViewById(a.engagement_details_header_mention_notification);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f45687j = (GestaltText) findViewById10;
    }
}
