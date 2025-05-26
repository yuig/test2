package com.pinterest.feature.newshub.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pp2.a;
import yk1.n;
import zu1.c;
import zu1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/newshub/feed/view/NewsHubUnifiedInboxEmptyView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewsHubUnifiedInboxEmptyView extends LinearLayout implements n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubUnifiedInboxEmptyView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.view_unified_inbox_empty_news, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View findViewById = findViewById(c.empty_state_main_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(c.empty_state_primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.empty_state_secondary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.A1(context2)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(eo1.c.space_1000);
            imageView.setLayoutParams(marginLayoutParams);
            tm1.d dVar = tm1.d.MESSAGE_BOTTLE;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer drawableRes$default = tm1.d.drawableRes$default(dVar, context3, tm1.b.SPOT, null, 4, null);
            imageView.setImageResource(drawableRes$default != null ? drawableRes$default.intValue() : zu1.b.empty_state_airplane);
            a0.k0(gestaltText);
            a.k(gestaltText2, rx0.b.f110185q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubUnifiedInboxEmptyView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.view_unified_inbox_empty_news, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View findViewById = findViewById(c.empty_state_main_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(c.empty_state_primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.empty_state_secondary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.A1(context2)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(eo1.c.space_1000);
                imageView.setLayoutParams(marginLayoutParams);
                tm1.d dVar = tm1.d.MESSAGE_BOTTLE;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Integer drawableRes$default = tm1.d.drawableRes$default(dVar, context3, tm1.b.SPOT, null, 4, null);
                imageView.setImageResource(drawableRes$default != null ? drawableRes$default.intValue() : zu1.b.empty_state_airplane);
                a0.k0(gestaltText);
                a.k(gestaltText2, rx0.b.f110185q);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubUnifiedInboxEmptyView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.view_unified_inbox_empty_news, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View findViewById = findViewById(c.empty_state_main_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(c.empty_state_primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.empty_state_secondary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.A1(context2)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(eo1.c.space_1000);
                imageView.setLayoutParams(marginLayoutParams);
                tm1.d dVar = tm1.d.MESSAGE_BOTTLE;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Integer drawableRes$default = tm1.d.drawableRes$default(dVar, context3, tm1.b.SPOT, null, 4, null);
                imageView.setImageResource(drawableRes$default != null ? drawableRes$default.intValue() : zu1.b.empty_state_airplane);
                a0.k0(gestaltText);
                a.k(gestaltText2, rx0.b.f110185q);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
