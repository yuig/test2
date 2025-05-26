package com.pinterest.feature.scheduledpins.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q22.a;
import q22.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/scheduledpins/view/ScheduledPinDateTabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "l3/c", "scheduledPins_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScheduledPinDateTabView extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final SimpleDateFormat f47598e = new SimpleDateFormat("dd", Locale.getDefault());

    /* renamed from: f, reason: collision with root package name */
    public static final SimpleDateFormat f47599f = new SimpleDateFormat("EEE", Locale.getDefault());

    /* renamed from: a, reason: collision with root package name */
    public final View f47600a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f47601b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f47602c;

    /* renamed from: d, reason: collision with root package name */
    public final View f47603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPinDateTabView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_scheduled_pin_date_tab, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        View findViewById = findViewById(a.scheduled_pin_date_tab_background);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47600a = findViewById;
        View findViewById2 = findViewById(a.scheduled_pin_date_tab_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47601b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.scheduled_pin_date_tab_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47602c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a.scheduled_pin_date_tab_dot_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47603d = findViewById4;
    }

    public final void L(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        String format = f47598e.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        a0.p(this.f47601b, format);
        String format2 = f47599f.format(date);
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        a0.p(this.f47602c, format2);
    }

    public final void T(boolean z13) {
        View view = this.f47603d;
        if (z13) {
            c.U1(view);
        } else {
            c.b1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPinDateTabView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(getContext(), b.view_scheduled_pin_date_tab, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        View findViewById = findViewById(a.scheduled_pin_date_tab_background);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47600a = findViewById;
        View findViewById2 = findViewById(a.scheduled_pin_date_tab_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47601b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.scheduled_pin_date_tab_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47602c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a.scheduled_pin_date_tab_dot_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47603d = findViewById4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPinDateTabView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(getContext(), b.view_scheduled_pin_date_tab, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        View findViewById = findViewById(a.scheduled_pin_date_tab_background);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47600a = findViewById;
        View findViewById2 = findViewById(a.scheduled_pin_date_tab_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47601b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.scheduled_pin_date_tab_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47602c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a.scheduled_pin_date_tab_dot_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47603d = findViewById4;
    }
}
