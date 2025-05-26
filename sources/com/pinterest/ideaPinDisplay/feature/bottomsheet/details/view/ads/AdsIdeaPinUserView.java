package com.pinterest.ideaPinDisplay.feature.bottomsheet.details.view.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import fq1.b;
import fq1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq1.a;
import kq1.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ideaPinDisplay/feature/bottomsheet/details/view/ads/AdsIdeaPinUserView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinDisplay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AdsIdeaPinUserView extends ConstraintLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f49736f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f49737a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f49738b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f49739c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f49740d;

    /* renamed from: e, reason: collision with root package name */
    public final Group f49741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsIdeaPinUserView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.ads_idea_pin_user_view, this);
        int W = bs1.c.W(this, eo1.c.space_400);
        setPadding(W, W, W, W);
        View findViewById = findViewById(b.ads_idea_pin_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49737a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(b.ads_idea_pin_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49738b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.ads_idea_pin_user_followers);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49739c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b.ads_idea_pin_user_follow_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        gestaltButton.d(d.f80669i);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f49740d = gestaltButton;
        View findViewById5 = findViewById(b.ads_idea_pin_user_attribution_group);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f49741e = (Group) findViewById5;
    }

    public final void L(kq1.b action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int[] k13 = this.f49741e.k();
        Intrinsics.checkNotNullExpressionValue(k13, "getReferencedIds(...)");
        for (int i13 : k13) {
            findViewById(i13).setOnClickListener(new a(1, action));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsIdeaPinUserView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.ads_idea_pin_user_view, this);
        int W = bs1.c.W(this, eo1.c.space_400);
        setPadding(W, W, W, W);
        View findViewById = findViewById(b.ads_idea_pin_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49737a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(b.ads_idea_pin_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49738b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.ads_idea_pin_user_followers);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49739c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b.ads_idea_pin_user_follow_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        gestaltButton.d(d.f80669i);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f49740d = gestaltButton;
        View findViewById5 = findViewById(b.ads_idea_pin_user_attribution_group);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f49741e = (Group) findViewById5;
    }
}
