package com.pinterest.partnerAnalytics.feature.audience.metadata;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.c;
import com.pinterest.partnerAnalytics.e;
import com.pinterest.partnerAnalytics.h;
import d5.a;
import fx1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/audience/metadata/MetadataOptionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MetadataOptionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f50146a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIcon f50147b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataOptionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(boolean z13) {
        this.f50147b.g2(new d(z13, 0));
        Context context = getContext();
        int i13 = z13 ? c.audience_metadata_selected : c.audience_metadata_not_selected;
        Object obj = a.f53679a;
        setBackground(context.getDrawable(i13));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataOptionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.metadata_option_view, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.tvOptionValue);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50146a = (GestaltText) findViewById2;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.ivIsChecked);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50147b = (GestaltIcon) findViewById3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, h.MetadataOptionViewAttrs, 0, 0);
        try {
            a0.p(gestaltText, String.valueOf(obtainStyledAttributes.getString(h.MetadataOptionViewAttrs_metadataOptionTitle)));
            String optionValue = obtainStyledAttributes.getString(h.MetadataOptionViewAttrs_metadataOptionValue);
            optionValue = optionValue == null ? "" : optionValue;
            Intrinsics.checkNotNullParameter(optionValue, "optionValue");
            a0.p(this.f50146a, optionValue);
            a(obtainStyledAttributes.getBoolean(h.MetadataOptionViewAttrs_metadataOptionIsChecked, false));
            obtainStyledAttributes.recycle();
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
