package com.pinterest.feature.creator.analytics.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.gestalt.text.GestaltText;
import cr0.i;
import dl2.b;
import eo1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lj0.a;
import m60.t0;
import m60.x0;
import oq.m;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qb0.j;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/creator/analytics/view/CreatorPinalyticsItemMediumView;", "Landroid/widget/RelativeLayout;", "Lcr0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "creatorAnalyticsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreatorPinalyticsItemMediumView extends RelativeLayout implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f45651e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final IconView f45652a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45653b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f45654c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f45655d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatorPinalyticsItemMediumView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr0.i
    public final void Y2(Integer num, int i13) {
        if (num == 0) {
            s4(i13, (String) num);
        } else {
            s4(i13, j.b(num.intValue()));
        }
    }

    @Override // cr0.i
    public final void s4(int i13, String str) {
        Integer intOrNull;
        int i14 = 0;
        GestaltText gestaltText = this.f45653b;
        if (str == null) {
            a0.o(gestaltText, x0.creator_stats_empty_value, new Object[0]);
            gestaltText.k(new a(this, 22));
        } else {
            a0.p(gestaltText, str);
            gestaltText.k(new m(2));
        }
        Resources resources = getResources();
        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            i14 = intOrNull.intValue();
        }
        String quantityString = resources.getQuantityString(i13, i14);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        a0.p(this.f45655d, quantityString);
    }

    @Override // cr0.i
    public final void u3(int i13) {
        IconView iconView = this.f45652a;
        iconView.setVisibility(0);
        Context context = getContext();
        Object obj = d5.a.f53679a;
        iconView.setImageDrawable(context.getDrawable(i13));
    }

    @Override // cr0.i
    public final void y() {
        setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorPinalyticsItemMediumView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        fr0.a init = fr0.a.f62809n;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        Context context2 = getContext();
        Intrinsics.f(context2);
        IconView iconView = new IconView(context2);
        init.invoke(iconView);
        addView(iconView);
        this.f45652a = iconView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
        gestaltText.i(fr0.a.f62806k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(17, t0.image);
        layoutParams.addRule(10);
        gestaltText.setLayoutParams(layoutParams);
        b.y2(gestaltText);
        addView(gestaltText);
        this.f45653b = gestaltText;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText2 = new GestaltText(6, context4, (AttributeSet) null);
        b.y2(gestaltText2);
        gestaltText2.i(fr0.a.f62808m);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(cd0.b.creator_analytics_item_unavailable_tooltip);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, b70.b.pin_count);
        layoutParams2.addRule(10);
        frameLayout.setLayoutParams(layoutParams2);
        Context context5 = frameLayout.getContext();
        int i14 = d.toggle_tooltip_bg;
        Object obj = d5.a.f53679a;
        frameLayout.setBackground(context5.getDrawable(i14));
        frameLayout.setVisibility(4);
        frameLayout.addView(gestaltText2);
        addView(frameLayout);
        this.f45654c = frameLayout;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        GestaltText gestaltText3 = new GestaltText(6, context6, (AttributeSet) null);
        gestaltText3.i(fr0.a.f62807l);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(17, t0.image);
        layoutParams3.addRule(3, b70.b.pin_count);
        gestaltText3.setLayoutParams(layoutParams3);
        b.y2(gestaltText3);
        addView(gestaltText3);
        this.f45655d = gestaltText3;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        GestaltText gestaltText4 = new GestaltText(6, context7, (AttributeSet) null);
        gestaltText4.i(fr0.a.f62805j);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(17, t0.image);
        layoutParams4.addRule(3, cd0.b.desc);
        gestaltText4.setLayoutParams(layoutParams4);
        b.y2(gestaltText4);
        addView(gestaltText4);
    }
}
