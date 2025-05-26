package com.pinterest.partnerAnalytics.feature.filter;

import a.a;
import android.app.DatePickerDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.feature.filter.FilterDateRangeView;
import ex1.n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.c0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kw1.b;
import org.jetbrains.annotations.NotNull;
import pe.i;
import pk.a0;
import px1.e;
import px1.o;
import px1.p;
import px1.q;
import w1.d;
import zx.f;
import zx.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/filter/FilterDateRangeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FilterDateRangeView extends LinearLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f50165s = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f50166a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f50167b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f50168c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50169d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltSwitchWithLabel f50170e;

    /* renamed from: f, reason: collision with root package name */
    public final FilterSelectionView f50171f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f50172g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f50173h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f50174i;

    /* renamed from: j, reason: collision with root package name */
    public long f50175j;

    /* renamed from: k, reason: collision with root package name */
    public long f50176k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f50177l;

    /* renamed from: m, reason: collision with root package name */
    public List f50178m;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f50179n;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f50180o;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f50181p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f50182q;

    /* renamed from: r, reason: collision with root package name */
    public Function1 f50183r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterDateRangeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(GestaltText gestaltText, Long l13) {
        gestaltText.i(new d(l13.longValue(), 9));
    }

    public final void b(g dateRange) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        long j13 = dateRange.f142971c;
        this.f50175j = j13;
        a(this.f50172g, Long.valueOf(j13));
        long j14 = dateRange.f142972d;
        this.f50176k = j14;
        a(this.f50173h, Long.valueOf(j14));
        List list = this.f50178m;
        f fVar = dateRange.f142969a;
        this.f50171f.h(list.indexOf(fVar));
        String string = getContext().getString(fVar.getDescription());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(this.f50169d, string);
        if (this.f50166a) {
            f fVar2 = f.HOURS_24;
            GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f50170e;
            if (fVar == fVar2) {
                this.f50177l = false;
                gestaltSwitchWithLabel.T(e.f101642u);
            } else {
                gestaltSwitchWithLabel.T(e.f101643v);
            }
        }
        k(fVar);
        this.f50177l = false;
        this.f50170e.T(new n(dateRange, 7));
    }

    public final void c(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f50178m = value;
        List list = value;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            f fVar = (f) obj;
            String name = fVar.name();
            String string = getResources().getString(fVar.getDescription());
            Intrinsics.f(string);
            arrayList.add(new q(i13, string, name, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER));
            i13 = i14;
        }
        this.f50171f.c(arrayList);
    }

    public final void d(boolean z13) {
        this.f50168c.setVisibility(z13 ^ true ? 0 : 8);
        this.f50167b.setVisibility(z13 ? 0 : 8);
        if (z13) {
            return;
        }
        this.f50179n.invoke(new g((f) this.f50178m.get(this.f50171f.f50189e), this.f50170e.Z().f96740a.f96708a, this.f50175j, this.f50176k));
    }

    public final void e(boolean z13) {
        this.f50166a = z13;
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f50170e;
        Intrinsics.checkNotNullParameter(gestaltSwitchWithLabel, "<this>");
        gestaltSwitchWithLabel.T(on1.e.f96723q);
    }

    public final void f(px1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f50179n = dVar;
    }

    public final void g(px1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f50182q = dVar;
    }

    public final void h(px1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f50180o = dVar;
    }

    public final void i(px1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f50183r = dVar;
    }

    public final void j(px1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f50181p = dVar;
    }

    public final void k(f fVar) {
        int i13;
        long timeInMillis;
        long timeInMillis2;
        String string = getContext().getString(fVar.getDescription());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(this.f50169d, string);
        f fVar2 = f.CUSTOM;
        GestaltText gestaltText = this.f50172g;
        if (fVar == fVar2) {
            gestaltText.i(e.f101640s);
            timeInMillis = this.f50175j;
        } else {
            gestaltText.i(e.f101641t);
            switch (p.f101680a[fVar.ordinal()]) {
                case 1:
                    i13 = -1;
                    break;
                case 2:
                    i13 = -7;
                    break;
                case 3:
                    i13 = -14;
                    break;
                case 4:
                    i13 = -21;
                    break;
                case 5:
                    i13 = -30;
                    break;
                case 6:
                    i13 = -60;
                    break;
                case 7:
                    i13 = -90;
                    break;
                case 8:
                    i13 = 0;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, i13);
            timeInMillis = calendar.getTimeInMillis();
        }
        this.f50175j = timeInMillis;
        a(gestaltText, Long.valueOf(timeInMillis));
        GestaltText gestaltText2 = this.f50173h;
        if (fVar == fVar2) {
            gestaltText2.i(e.f101638q);
            timeInMillis2 = this.f50176k;
        } else {
            gestaltText2.i(e.f101639r);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, this.f50170e.Z().f96740a.f96708a ? 0 : -1);
            timeInMillis2 = calendar2.getTimeInMillis();
        }
        this.f50176k = timeInMillis2;
        a(gestaltText2, Long.valueOf(timeInMillis2));
        b bVar = b.DATE;
        a0.p(this.f50174i, a.D(kw1.e.a(timeInMillis, bVar), " - ", kw1.e.a(timeInMillis2, bVar)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterDateRangeView(@NotNull final Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i14 = 1;
        this.f50166a = true;
        this.f50175j = System.currentTimeMillis();
        this.f50176k = System.currentTimeMillis();
        this.f50177l = true;
        this.f50178m = c0.b0(f.values());
        this.f50179n = e.f101633l;
        this.f50180o = e.f101635n;
        this.f50181p = e.f101637p;
        this.f50182q = e.f101634m;
        this.f50183r = e.f101636o;
        View inflate = LayoutInflater.from(context).inflate(com.pinterest.partnerAnalytics.e.filter_date_range, (ViewGroup) null);
        final int i15 = 0;
        addView(inflate, 0, new FrameLayout.LayoutParams(-1, -2));
        View findViewById = inflate.findViewById(com.pinterest.partnerAnalytics.d.llCollapsedContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50168c = (ConstraintLayout) findViewById;
        View findViewById2 = inflate.findViewById(com.pinterest.partnerAnalytics.d.clExpandedContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50167b = (ConstraintLayout) findViewById2;
        View findViewById3 = inflate.findViewById(com.pinterest.partnerAnalytics.d.dateRangeContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(com.pinterest.partnerAnalytics.d.tvDateRangeSelection);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50169d = (GestaltText) findViewById4;
        View findViewById5 = findViewById(com.pinterest.partnerAnalytics.d.tvDateRangeRange);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f50174i = (GestaltText) findViewById5;
        View findViewById6 = inflate.findViewById(com.pinterest.partnerAnalytics.d.fDateFilterType);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        FilterSelectionView filterSelectionView = (FilterSelectionView) findViewById6;
        this.f50171f = filterSelectionView;
        View findViewById7 = inflate.findViewById(com.pinterest.partnerAnalytics.d.startDate);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById7;
        this.f50172g = gestaltText;
        View findViewById8 = inflate.findViewById(com.pinterest.partnerAnalytics.d.endDate);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById8;
        this.f50173h = gestaltText2;
        View findViewById9 = inflate.findViewById(com.pinterest.partnerAnalytics.d.mscRealTimeEstimates);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        GestaltSwitchWithLabel gestaltSwitchWithLabel = (GestaltSwitchWithLabel) findViewById9;
        this.f50170e = gestaltSwitchWithLabel;
        o oVar = new o(this, 0);
        filterSelectionView.getClass();
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        filterSelectionView.f50188d = oVar;
        gestaltText.j(new gm1.a(this) { // from class: px1.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FilterDateRangeView f101674b;

            {
                this.f101674b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i15;
                final int i17 = 1;
                final FilterDateRangeView this$0 = this.f101674b;
                switch (i16) {
                    case 0:
                        int i18 = FilterDateRangeView.f50165s;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Context context2 = context;
                        Intrinsics.checkNotNullParameter(context2, "$context");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.f50172g.l().f108850h != vn1.c.DISABLED) {
                            Calendar calendar = Calendar.getInstance(kw1.e.f81041a);
                            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
                            calendar.setTimeInMillis(this$0.f50175j);
                            int i19 = calendar.get(5);
                            int i23 = calendar.get(2);
                            new DatePickerDialog(context2, new DatePickerDialog.OnDateSetListener() { // from class: px1.n
                                @Override // android.app.DatePickerDialog.OnDateSetListener
                                public final void onDateSet(DatePicker datePicker, int i24, int i25, int i26) {
                                    int i27 = i17;
                                    FilterDateRangeView filterDateRangeView = this$0;
                                    switch (i27) {
                                        case 0:
                                            int i28 = FilterDateRangeView.f50165s;
                                            filterDateRangeView.getClass();
                                            Calendar calendar2 = Calendar.getInstance(kw1.e.f81041a);
                                            calendar2.set(i24, i25, i26);
                                            filterDateRangeView.f50176k = calendar2.getTimeInMillis();
                                            FilterDateRangeView.a(filterDateRangeView.f50173h, Long.valueOf(calendar2.getTimeInMillis()));
                                            filterDateRangeView.f50182q.invoke(Long.valueOf(calendar2.getTimeInMillis()));
                                            break;
                                        default:
                                            int i29 = FilterDateRangeView.f50165s;
                                            filterDateRangeView.getClass();
                                            Calendar calendar3 = Calendar.getInstance(kw1.e.f81041a);
                                            calendar3.set(i24, i25, i26);
                                            filterDateRangeView.f50175j = calendar3.getTimeInMillis();
                                            FilterDateRangeView.a(filterDateRangeView.f50172g, Long.valueOf(calendar3.getTimeInMillis()));
                                            filterDateRangeView.f50181p.invoke(Long.valueOf(calendar3.getTimeInMillis()));
                                            break;
                                    }
                                }
                            }, calendar.get(1), i23, i19).show();
                            break;
                        }
                        break;
                    default:
                        int i24 = FilterDateRangeView.f50165s;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Context context3 = context;
                        Intrinsics.checkNotNullParameter(context3, "$context");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.f50173h.l().f108850h != vn1.c.DISABLED) {
                            Calendar calendar2 = Calendar.getInstance(kw1.e.f81041a);
                            Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance(...)");
                            calendar2.setTimeInMillis(this$0.f50176k);
                            int i25 = calendar2.get(5);
                            int i26 = calendar2.get(2);
                            final int i27 = 0;
                            DatePickerDialog datePickerDialog = new DatePickerDialog(context3, new DatePickerDialog.OnDateSetListener() { // from class: px1.n
                                @Override // android.app.DatePickerDialog.OnDateSetListener
                                public final void onDateSet(DatePicker datePicker, int i242, int i252, int i262) {
                                    int i272 = i27;
                                    FilterDateRangeView filterDateRangeView = this$0;
                                    switch (i272) {
                                        case 0:
                                            int i28 = FilterDateRangeView.f50165s;
                                            filterDateRangeView.getClass();
                                            Calendar calendar22 = Calendar.getInstance(kw1.e.f81041a);
                                            calendar22.set(i242, i252, i262);
                                            filterDateRangeView.f50176k = calendar22.getTimeInMillis();
                                            FilterDateRangeView.a(filterDateRangeView.f50173h, Long.valueOf(calendar22.getTimeInMillis()));
                                            filterDateRangeView.f50182q.invoke(Long.valueOf(calendar22.getTimeInMillis()));
                                            break;
                                        default:
                                            int i29 = FilterDateRangeView.f50165s;
                                            filterDateRangeView.getClass();
                                            Calendar calendar3 = Calendar.getInstance(kw1.e.f81041a);
                                            calendar3.set(i242, i252, i262);
                                            filterDateRangeView.f50175j = calendar3.getTimeInMillis();
                                            FilterDateRangeView.a(filterDateRangeView.f50172g, Long.valueOf(calendar3.getTimeInMillis()));
                                            filterDateRangeView.f50181p.invoke(Long.valueOf(calendar3.getTimeInMillis()));
                                            break;
                                    }
                                }
                            }, calendar2.get(1), i26, i25);
                            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                            datePickerDialog.show();
                            break;
                        }
                        break;
                }
            }
        });
        gestaltText2.j(new gm1.a(this) { // from class: px1.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FilterDateRangeView f101674b;

            {
                this.f101674b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i14;
                final int i17 = 1;
                final FilterDateRangeView this$0 = this.f101674b;
                switch (i16) {
                    case 0:
                        int i18 = FilterDateRangeView.f50165s;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Context context2 = context;
                        Intrinsics.checkNotNullParameter(context2, "$context");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.f50172g.l().f108850h != vn1.c.DISABLED) {
                            Calendar calendar = Calendar.getInstance(kw1.e.f81041a);
                            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
                            calendar.setTimeInMillis(this$0.f50175j);
                            int i19 = calendar.get(5);
                            int i23 = calendar.get(2);
                            new DatePickerDialog(context2, new DatePickerDialog.OnDateSetListener() { // from class: px1.n
                                @Override // android.app.DatePickerDialog.OnDateSetListener
                                public final void onDateSet(DatePicker datePicker, int i242, int i252, int i262) {
                                    int i272 = i17;
                                    FilterDateRangeView filterDateRangeView = this$0;
                                    switch (i272) {
                                        case 0:
                                            int i28 = FilterDateRangeView.f50165s;
                                            filterDateRangeView.getClass();
                                            Calendar calendar22 = Calendar.getInstance(kw1.e.f81041a);
                                            calendar22.set(i242, i252, i262);
                                            filterDateRangeView.f50176k = calendar22.getTimeInMillis();
                                            FilterDateRangeView.a(filterDateRangeView.f50173h, Long.valueOf(calendar22.getTimeInMillis()));
                                            filterDateRangeView.f50182q.invoke(Long.valueOf(calendar22.getTimeInMillis()));
                                            break;
                                        default:
                                            int i29 = FilterDateRangeView.f50165s;
                                            filterDateRangeView.getClass();
                                            Calendar calendar3 = Calendar.getInstance(kw1.e.f81041a);
                                            calendar3.set(i242, i252, i262);
                                            filterDateRangeView.f50175j = calendar3.getTimeInMillis();
                                            FilterDateRangeView.a(filterDateRangeView.f50172g, Long.valueOf(calendar3.getTimeInMillis()));
                                            filterDateRangeView.f50181p.invoke(Long.valueOf(calendar3.getTimeInMillis()));
                                            break;
                                    }
                                }
                            }, calendar.get(1), i23, i19).show();
                            break;
                        }
                        break;
                    default:
                        int i24 = FilterDateRangeView.f50165s;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Context context3 = context;
                        Intrinsics.checkNotNullParameter(context3, "$context");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.f50173h.l().f108850h != vn1.c.DISABLED) {
                            Calendar calendar2 = Calendar.getInstance(kw1.e.f81041a);
                            Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance(...)");
                            calendar2.setTimeInMillis(this$0.f50176k);
                            int i25 = calendar2.get(5);
                            int i26 = calendar2.get(2);
                            final int i27 = 0;
                            DatePickerDialog datePickerDialog = new DatePickerDialog(context3, new DatePickerDialog.OnDateSetListener() { // from class: px1.n
                                @Override // android.app.DatePickerDialog.OnDateSetListener
                                public final void onDateSet(DatePicker datePicker, int i242, int i252, int i262) {
                                    int i272 = i27;
                                    FilterDateRangeView filterDateRangeView = this$0;
                                    switch (i272) {
                                        case 0:
                                            int i28 = FilterDateRangeView.f50165s;
                                            filterDateRangeView.getClass();
                                            Calendar calendar22 = Calendar.getInstance(kw1.e.f81041a);
                                            calendar22.set(i242, i252, i262);
                                            filterDateRangeView.f50176k = calendar22.getTimeInMillis();
                                            FilterDateRangeView.a(filterDateRangeView.f50173h, Long.valueOf(calendar22.getTimeInMillis()));
                                            filterDateRangeView.f50182q.invoke(Long.valueOf(calendar22.getTimeInMillis()));
                                            break;
                                        default:
                                            int i29 = FilterDateRangeView.f50165s;
                                            filterDateRangeView.getClass();
                                            Calendar calendar3 = Calendar.getInstance(kw1.e.f81041a);
                                            calendar3.set(i242, i252, i262);
                                            filterDateRangeView.f50175j = calendar3.getTimeInMillis();
                                            FilterDateRangeView.a(filterDateRangeView.f50172g, Long.valueOf(calendar3.getTimeInMillis()));
                                            filterDateRangeView.f50181p.invoke(Long.valueOf(calendar3.getTimeInMillis()));
                                            break;
                                    }
                                }
                            }, calendar2.get(1), i26, i25);
                            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                            datePickerDialog.show();
                            break;
                        }
                        break;
                }
            }
        });
        i.j(gestaltSwitchWithLabel, new o(this, 1));
    }
}
