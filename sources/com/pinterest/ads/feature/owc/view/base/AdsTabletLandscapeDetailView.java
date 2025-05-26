package com.pinterest.ads.feature.owc.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps.p;
import ps.q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/base/AdsTabletLandscapeDetailView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsTabletLandscapeDetailView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f35298a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f35299b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f35300c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f35301d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f35302e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsTabletLandscapeDetailView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsTabletLandscapeDetailView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, q.ads_detail_view_landscape_tablet, this);
        View findViewById = findViewById(p.opaque_one_tap_title_tablet);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35298a = (GestaltText) findViewById;
        View findViewById2 = findViewById(p.opaque_one_tap_description_tablet);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f35299b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(p.opaque_one_tap_creator_tablet);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35300c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(p.opaque_one_tap_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f35302e = (WebImageView) findViewById4;
        View findViewById5 = findViewById(p.opaque_one_tap_followers_tablet);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f35301d = (GestaltText) findViewById5;
    }
}
