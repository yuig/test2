package com.pinterest.feature.shopping.shoppingstories.feed.emptystate;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import d91.l;
import ee1.d;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import la1.k;
import org.jetbrains.annotations.NotNull;
import qe1.a;
import qe1.b;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingstories/feed/emptystate/StructuredFeedEmptyStateView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "qe1/a", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StructuredFeedEmptyStateView extends LinearLayout implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f48497f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f48498a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltButton f48499b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f48500c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f48501d;

    /* renamed from: e, reason: collision with root package name */
    public a f48502e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StructuredFeedEmptyStateView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_1600);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_1600);
        this.f48498a = getResources().getDimensionPixelSize(c.space_400);
        setOrientation(1);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize2);
        setLayoutParams(layoutParams);
    }

    public final void a(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f48502e = listener;
    }

    public final void b(d logAction) {
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        if (this.f48499b == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.topMargin = this.f48498a;
            smallSecondaryButton.setLayoutParams(layoutParams);
            GestaltButton e13 = smallSecondaryButton.d(b.f103632i).e(new k(5, logAction, this));
            this.f48499b = e13;
            addView(e13);
        }
    }

    public final void e(String str) {
        if (str == null || this.f48500c != null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new l(str, 20));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        gestaltText.setLayoutParams(layoutParams);
        this.f48500c = gestaltText;
        addView(gestaltText);
    }

    public final void g(String str) {
        if (str == null || this.f48501d != null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new l(str, 21));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = this.f48498a;
        gestaltText.setLayoutParams(layoutParams);
        this.f48501d = gestaltText;
        addView(gestaltText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StructuredFeedEmptyStateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_1600);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_1600);
        this.f48498a = getResources().getDimensionPixelSize(c.space_400);
        setOrientation(1);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize2);
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StructuredFeedEmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_1600);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_1600);
        this.f48498a = getResources().getDimensionPixelSize(c.space_400);
        setOrientation(1);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize2);
        setLayoutParams(layoutParams);
    }
}
