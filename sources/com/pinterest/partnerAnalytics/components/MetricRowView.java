package com.pinterest.partnerAnalytics.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.e;
import com.pinterest.partnerAnalytics.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mm1.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/MetricRowView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MetricRowView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltDivider f50049a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f50050b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f50051c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50052d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltIcon f50053e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetricRowView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f50053e.g2(new i(onClickListener != null, 26));
    }

    public /* synthetic */ MetricRowView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricRowView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int i14;
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.metadata_view, this);
        View findViewById = findViewById(d.itemImage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(d.tvDescription);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50050b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.tvPercentage);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50051c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(d.tvValue);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50052d = (GestaltText) findViewById4;
        View findViewById5 = findViewById(d.forwardIndicator);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f50053e = (GestaltIcon) findViewById5;
        View findViewById6 = findViewById(d.mdDivider);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f50049a = (GestaltDivider) findViewById6;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, h.MetaDataView, 0, 0);
        try {
            Intrinsics.f(obtainStyledAttributes);
            i14 = h.MetaDataView_metadata_image;
        } catch (Exception unused) {
            imageView.setVisibility(8);
        }
        if (obtainStyledAttributes.hasValue(i14)) {
            imageView.setImageResource(obtainStyledAttributes.getResourceId(i14, 0));
            this.f50050b.i(new vr1.h(obtainStyledAttributes, 1));
            pe.i.g(this.f50049a, new i(obtainStyledAttributes.getBoolean(h.MetaDataView_metadata_showDivider, true), 25));
            return;
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }
}
