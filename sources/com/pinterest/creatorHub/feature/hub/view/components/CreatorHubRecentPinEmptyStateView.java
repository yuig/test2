package com.pinterest.creatorHub.feature.hub.view.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import d5.a;
import eo1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/creatorHub/feature/hub/view/components/CreatorHubRecentPinEmptyStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreatorHubRecentPinEmptyStateView extends ConstraintLayout implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f44801c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltButton f44802a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubRecentPinEmptyStateView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.creator_hub_recent_pins_empty_state, this);
        Context context2 = getContext();
        int i13 = b.color_background_elevation_floating_added;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i13));
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(rd0.b.creator_hub_recent_pins_empty_state_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44802a = (GestaltButton) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubRecentPinEmptyStateView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(getContext(), c.creator_hub_recent_pins_empty_state, this);
        Context context2 = getContext();
        int i13 = b.color_background_elevation_floating_added;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i13));
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(rd0.b.creator_hub_recent_pins_empty_state_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44802a = (GestaltButton) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubRecentPinEmptyStateView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(getContext(), c.creator_hub_recent_pins_empty_state, this);
        Context context2 = getContext();
        int i14 = b.color_background_elevation_floating_added;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i14));
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(rd0.b.creator_hub_recent_pins_empty_state_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44802a = (GestaltButton) findViewById;
    }
}
