package com.pinterest.feature.scheduledpins.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.kg0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q22.a;
import q22.b;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f\rB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/scheduledpins/view/ScheduledPinCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "l3/c", "z51/c", "scheduledPins_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScheduledPinCellView extends ConstraintLayout implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f47593e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f47594a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f47595b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f47596c;

    /* renamed from: d, reason: collision with root package name */
    public kg0 f47597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPinCellView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_scheduled_pin_cell, this);
        View findViewById = findViewById(a.scheduled_pin_cell_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47594a = (WebImageView) findViewById;
        View findViewById2 = findViewById(a.scheduled_pin_cell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47595b = (GestaltText) findViewById2;
        this.f47596c = ((GestaltText) findViewById(a.scheduled_pin_cell_subtitle)).i(z51.a.f140856j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPinCellView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_scheduled_pin_cell, this);
        View findViewById = findViewById(a.scheduled_pin_cell_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47594a = (WebImageView) findViewById;
        View findViewById2 = findViewById(a.scheduled_pin_cell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47595b = (GestaltText) findViewById2;
        this.f47596c = ((GestaltText) findViewById(a.scheduled_pin_cell_subtitle)).i(z51.a.f140856j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPinCellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_scheduled_pin_cell, this);
        View findViewById = findViewById(a.scheduled_pin_cell_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47594a = (WebImageView) findViewById;
        View findViewById2 = findViewById(a.scheduled_pin_cell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47595b = (GestaltText) findViewById2;
        this.f47596c = ((GestaltText) findViewById(a.scheduled_pin_cell_subtitle)).i(z51.a.f140856j);
    }
}
