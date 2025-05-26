package com.pinterest.feature.storypin.closeup.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import eo1.c;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pq1.d;
import pq1.e;
import xe0.a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/storypin/closeup/view/IdeaPinHideView;", "Lcom/pinterest/design/widget/RoundedCornersLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinDisplayLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class IdeaPinHideView extends RoundedCornersLayout {

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f48557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinHideView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.idea_pin_hide_view, this);
        setId(d.story_pin_hide_view);
        setClickable(true);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a N = s0.N(c.lego_corner_radius_large, resources);
        g((int) N.f134648a, (int) N.f134649b, (int) N.f134651d, (int) N.f134650c);
        View findViewById = findViewById(d.undo_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48557f = (GestaltButton) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinHideView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.idea_pin_hide_view, this);
        setId(d.story_pin_hide_view);
        setClickable(true);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a N = s0.N(c.lego_corner_radius_large, resources);
        g((int) N.f134648a, (int) N.f134649b, (int) N.f134651d, (int) N.f134650c);
        View findViewById = findViewById(d.undo_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48557f = (GestaltButton) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinHideView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.idea_pin_hide_view, this);
        setId(d.story_pin_hide_view);
        setClickable(true);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a N = s0.N(c.lego_corner_radius_large, resources);
        g((int) N.f134648a, (int) N.f134649b, (int) N.f134651d, (int) N.f134650c);
        View findViewById = findViewById(d.undo_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48557f = (GestaltButton) findViewById;
    }
}
