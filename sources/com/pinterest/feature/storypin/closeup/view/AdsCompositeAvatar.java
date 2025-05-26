package com.pinterest.feature.storypin.closeup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pq1.d;
import pq1.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/storypin/closeup/view/AdsCompositeAvatar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinDisplayLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AdsCompositeAvatar extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f48537a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltAvatar f48538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsCompositeAvatar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.ads_composite_avatar, this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f17671i = 0;
            layoutParams2.f17691t = 0;
            layoutParams2.f17677l = 0;
        }
        View findViewById = findViewById(d.ads_idea_pin_attribution_avatar_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48537a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(d.ads_idea_pin_attribution_avatar_sponsor);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48538b = (GestaltAvatar) findViewById2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsCompositeAvatar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.ads_composite_avatar, this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f17671i = 0;
            layoutParams2.f17691t = 0;
            layoutParams2.f17677l = 0;
        }
        View findViewById = findViewById(d.ads_idea_pin_attribution_avatar_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48537a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(d.ads_idea_pin_attribution_avatar_sponsor);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48538b = (GestaltAvatar) findViewById2;
    }
}
