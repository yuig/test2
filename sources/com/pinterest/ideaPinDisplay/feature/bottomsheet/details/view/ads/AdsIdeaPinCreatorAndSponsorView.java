package com.pinterest.ideaPinDisplay.feature.bottomsheet.details.view.ads;

import an1.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pinterest.api.model.wy0;
import d5.a;
import eo1.d;
import fq1.b;
import fq1.c;
import fv0.g;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import s1.w;
import yk1.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ideaPinDisplay/feature/bottomsheet/details/view/ads/AdsIdeaPinCreatorAndSponsorView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinDisplay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AdsIdeaPinCreatorAndSponsorView extends CoordinatorLayout {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x, reason: collision with root package name */
    public final AdsIdeaPinUserView f49733x;

    /* renamed from: y, reason: collision with root package name */
    public final AdsIdeaPinUserView f49734y;

    /* renamed from: z, reason: collision with root package name */
    public final AppCompatImageView f49735z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsIdeaPinCreatorAndSponsorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.ads_idea_pin_creator_sponsor_view, this);
        setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
        Context context2 = getContext();
        int i13 = d.drawable_themed_transparent;
        Object obj = a.f53679a;
        setBackground(context2.getDrawable(i13));
        View findViewById = findViewById(b.ads_idea_pin_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49733x = (AdsIdeaPinUserView) findViewById;
        View findViewById2 = findViewById(b.ads_idea_pin_sponsor);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49734y = (AdsIdeaPinUserView) findViewById2;
        View findViewById3 = findViewById(b.ads_idea_pin_bottom_sheet_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49735z = (AppCompatImageView) findViewById3;
    }

    public static void T(wy0 user, AdsIdeaPinUserView adsIdeaPinUserView, v viewResources) {
        bs1.c.U1(adsIdeaPinUserView);
        String imageUrl = dl2.b.u0(user);
        String fallbackText = user.Z2();
        if (fallbackText == null) {
            fallbackText = "";
        }
        Integer q23 = user.q2();
        Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
        int intValue = q23.intValue();
        adsIdeaPinUserView.getClass();
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(fallbackText, "fallbackText");
        adsIdeaPinUserView.f49737a.H2(new g(imageUrl, intValue, 2, fallbackText));
        String Z2 = user.Z2();
        String name = Z2 != null ? Z2 : "";
        Intrinsics.checkNotNullParameter(name, "name");
        a0.p(adsIdeaPinUserView.f49738b, name);
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        a0.p(adsIdeaPinUserView.f49739c, r.M(user, viewResources, new qb0.a()));
    }

    public final void P(wy0 wy0Var, wy0 wy0Var2, i action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f49733x.L(new kq1.b(action, wy0Var, 0));
        this.f49734y.L(new kq1.b(action, wy0Var2, 1));
    }

    public final void Q(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f49735z.setOnClickListener(new kq1.a(0, action));
    }

    public final void R(wy0 wy0Var, wy0 wy0Var2, jq1.b action) {
        Intrinsics.checkNotNullParameter(action, "action");
        kq1.c action2 = new kq1.c(action, wy0Var, 0);
        AdsIdeaPinUserView adsIdeaPinUserView = this.f49733x;
        adsIdeaPinUserView.getClass();
        Intrinsics.checkNotNullParameter(action2, "action");
        adsIdeaPinUserView.f49740d.e(new defpackage.a(29, action2));
        kq1.c action3 = new kq1.c(action, wy0Var2, 1);
        AdsIdeaPinUserView adsIdeaPinUserView2 = this.f49734y;
        adsIdeaPinUserView2.getClass();
        Intrinsics.checkNotNullParameter(action3, "action");
        adsIdeaPinUserView2.f49740d.e(new defpackage.a(29, action3));
    }

    public final void S(wy0 wy0Var, wy0 wy0Var2, v viewResources) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        int i13 = 23;
        if (wy0Var != null) {
            AdsIdeaPinUserView adsIdeaPinUserView = this.f49733x;
            T(wy0Var, adsIdeaPinUserView, viewResources);
            boolean d2 = c0.d.d2(wy0Var);
            Intrinsics.checkNotNullParameter(viewResources, "viewResources");
            adsIdeaPinUserView.f49740d.d(new w(adsIdeaPinUserView, d2, viewResources, i13));
        }
        if (wy0Var2 != null) {
            AdsIdeaPinUserView adsIdeaPinUserView2 = this.f49734y;
            T(wy0Var2, adsIdeaPinUserView2, viewResources);
            boolean d23 = c0.d.d2(wy0Var2);
            Intrinsics.checkNotNullParameter(viewResources, "viewResources");
            adsIdeaPinUserView2.f49740d.d(new w(adsIdeaPinUserView2, d23, viewResources, i13));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsIdeaPinCreatorAndSponsorView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.ads_idea_pin_creator_sponsor_view, this);
        setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
        Context context2 = getContext();
        int i14 = d.drawable_themed_transparent;
        Object obj = a.f53679a;
        setBackground(context2.getDrawable(i14));
        View findViewById = findViewById(b.ads_idea_pin_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49733x = (AdsIdeaPinUserView) findViewById;
        View findViewById2 = findViewById(b.ads_idea_pin_sponsor);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49734y = (AdsIdeaPinUserView) findViewById2;
        View findViewById3 = findViewById(b.ads_idea_pin_bottom_sheet_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49735z = (AppCompatImageView) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsIdeaPinCreatorAndSponsorView(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.ads_idea_pin_creator_sponsor_view, this);
        setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
        Context context2 = getContext();
        int i13 = d.drawable_themed_transparent;
        Object obj = a.f53679a;
        setBackground(context2.getDrawable(i13));
        View findViewById = findViewById(b.ads_idea_pin_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49733x = (AdsIdeaPinUserView) findViewById;
        View findViewById2 = findViewById(b.ads_idea_pin_sponsor);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49734y = (AdsIdeaPinUserView) findViewById2;
        View findViewById3 = findViewById(b.ads_idea_pin_bottom_sheet_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49735z = (AppCompatImageView) findViewById3;
    }
}
