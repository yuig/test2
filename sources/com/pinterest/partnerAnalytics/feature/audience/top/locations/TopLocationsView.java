package com.pinterest.partnerAnalytics.feature.audience.top.locations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.components.barchartlist.HorizontalBarChartList;
import com.pinterest.partnerAnalytics.feature.audience.top.locations.TopLocationsView;
import ex1.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx1.d;
import nx1.e;
import org.jetbrains.annotations.NotNull;
import ox1.a;
import ox1.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/audience/top/locations/TopLocationsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TopLocationsView extends LinearLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f50155j = 0;

    /* renamed from: a, reason: collision with root package name */
    public Function1 f50156a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f50157b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f50158c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f50159d;

    /* renamed from: e, reason: collision with root package name */
    public final HorizontalBarChartList f50160e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f50161f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f50162g;

    /* renamed from: h, reason: collision with root package name */
    public b f50163h;

    /* renamed from: i, reason: collision with root package name */
    public a f50164i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopLocationsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(b data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f50163h = data;
        f();
        this.f50159d.d(new e(data, 0));
        this.f50158c.d(new e(data, 1));
        if (data.f97985c) {
            return;
        }
        e(a.COUNTRIES);
    }

    public final void b() {
        this.f50157b = 6;
    }

    public final void c(Function1 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f50156a = onClick;
    }

    public final void d(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f50161f.e(new c(2, onClick));
    }

    public final void e(a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f50164i = value;
        f();
        this.f50156a.invoke(value);
    }

    public final void f() {
        int i13 = nx1.c.f92502a[this.f50164i.ordinal()];
        GestaltButton gestaltButton = this.f50159d;
        GestaltButton gestaltButton2 = this.f50158c;
        d dVar = d.f92505l;
        d dVar2 = d.f92504k;
        List list = null;
        if (i13 == 1) {
            gestaltButton2.d(dVar);
            gestaltButton.d(dVar2);
            b bVar = this.f50163h;
            if (bVar != null) {
                list = bVar.f97984b;
            }
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gestaltButton2.d(dVar2);
            gestaltButton.d(dVar);
            b bVar2 = this.f50163h;
            if (bVar2 != null) {
                list = bVar2.f97986d;
            }
        }
        if (this.f50157b != null) {
            int i14 = list != null ? f0.i(list) : 0;
            if (list != null && (!list.isEmpty())) {
                Integer num = this.f50157b;
                Intrinsics.f(num);
                if (num.intValue() <= i14) {
                    Integer num2 = this.f50157b;
                    Intrinsics.f(num2);
                    i14 = num2.intValue();
                }
                list = list.subList(0, i14);
            }
            if (list == null) {
                list = q0.f80391a;
            }
        } else if (list == null) {
            list = q0.f80391a;
        }
        this.f50160e.j3(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopLocationsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50156a = d.f92503j;
        this.f50164i = a.METROS;
        View.inflate(context, com.pinterest.partnerAnalytics.e.audience_top_locations_view, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.btnMetros);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        this.f50158c = gestaltButton;
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.btnCountries);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        this.f50159d = gestaltButton2;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.btnSeeAllLocations);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50161f = (GestaltButton) findViewById3;
        View findViewById4 = findViewById(com.pinterest.partnerAnalytics.d.rvTopLocationsBarList);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        HorizontalBarChartList horizontalBarChartList = (HorizontalBarChartList) findViewById4;
        this.f50160e = horizontalBarChartList;
        View findViewById5 = findViewById(com.pinterest.partnerAnalytics.d.tvDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f50162g = (GestaltText) findViewById5;
        horizontalBarChartList.I0.f24020e = 1.0f;
        final int i14 = 0;
        gestaltButton.e(new gm1.a(this) { // from class: nx1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopLocationsView f92501b;

            {
                this.f92501b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                TopLocationsView this$0 = this.f92501b;
                switch (i15) {
                    case 0:
                        int i16 = TopLocationsView.f50155j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        this$0.e(ox1.a.METROS);
                        break;
                    default:
                        int i17 = TopLocationsView.f50155j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        this$0.e(ox1.a.COUNTRIES);
                        break;
                }
            }
        });
        final int i15 = 1;
        gestaltButton2.e(new gm1.a(this) { // from class: nx1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopLocationsView f92501b;

            {
                this.f92501b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                TopLocationsView this$0 = this.f92501b;
                switch (i152) {
                    case 0:
                        int i16 = TopLocationsView.f50155j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        this$0.e(ox1.a.METROS);
                        break;
                    default:
                        int i17 = TopLocationsView.f50155j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        this$0.e(ox1.a.COUNTRIES);
                        break;
                }
            }
        });
    }
}
