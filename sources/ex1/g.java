package ex1;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.k4;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.tb;
import com.pinterest.api.model.u5;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import java.util.List;
import java.util.Map;
import kh2.m0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class g extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f60395d;

    /* renamed from: e, reason: collision with root package name */
    public final List f60396e;

    /* renamed from: f, reason: collision with root package name */
    public final ww1.c f60397f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f60398g;

    public g(Context context, List dataSet, ww1.c metricType, Function1 onClickItem) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        this.f60395d = context;
        this.f60396e = dataSet;
        this.f60397f = metricType;
        this.f60398g = onClickItem;
        fy1.d format = fy1.d.BIG_NUMBERS;
        Intrinsics.checkNotNullParameter(format, "format");
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f60396e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        String c23;
        String c24;
        Double valueOf;
        String c25;
        Map A4;
        e holder = (e) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        tb tbVar = (tb) CollectionsKt.U(i13, this.f60396e);
        if (tbVar != null) {
            f30 l13 = tbVar.l();
            holder.f60389u.loadUrl(bs1.c.D0((l13 == null || (A4 = l13.A4()) == null) ? null : (sr) A4.get("200x")));
            f30 l14 = tbVar.l();
            Context context = this.f60395d;
            if (l14 != null) {
                if (j1.d1(l14.r4())) {
                    c25 = String.valueOf(l14.r4());
                } else if (j1.d1(l14.z6())) {
                    c25 = String.valueOf(l14.z6());
                } else if (j1.d1(l14.c4())) {
                    c25 = String.valueOf(l14.c4());
                } else {
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    c25 = bs1.c.c2(com.pinterest.partnerAnalytics.g.no_pin_description_label, resources);
                }
                a0.p(holder.f60390v, c25.toString());
            }
            u5 j13 = tbVar.j();
            Intrinsics.f(j13);
            boolean[] zArr = j13.f42416i;
            if (zArr.length <= 6 || !zArr[6]) {
                Resources resources2 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                c23 = bs1.c.c2(com.pinterest.partnerAnalytics.g.organic_type_label, resources2);
            } else {
                List j14 = j13.j();
                if (j14 == null || j14.size() != 2) {
                    List j15 = j13.j();
                    Boolean bool = j15 != null ? (Boolean) j15.get(0) : null;
                    Intrinsics.f(bool);
                    if (bool.booleanValue()) {
                        Resources resources3 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                        c23 = bs1.c.c2(com.pinterest.partnerAnalytics.g.paid_type_label, resources3);
                    } else {
                        Resources resources4 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                        c23 = bs1.c.c2(com.pinterest.partnerAnalytics.g.organic_type_label, resources4);
                    }
                } else {
                    Resources resources5 = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                    c23 = bs1.c.c2(com.pinterest.partnerAnalytics.g.all_types_label, resources5);
                }
            }
            a0.p(holder.f60391w, c23);
            u5 j16 = tbVar.j();
            Intrinsics.f(j16);
            boolean[] zArr2 = j16.f42416i;
            if (zArr2.length <= 4 || !zArr2[4]) {
                Resources resources6 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
                c24 = bs1.c.c2(com.pinterest.partnerAnalytics.g.other_profile_source_label, resources6);
            } else {
                List i14 = j16.i();
                if (i14 == null || i14.size() != 2) {
                    List i15 = j16.i();
                    Boolean bool2 = i15 != null ? (Boolean) i15.get(0) : null;
                    Intrinsics.f(bool2);
                    if (bool2.booleanValue()) {
                        Resources resources7 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources7, "getResources(...)");
                        c24 = bs1.c.c2(com.pinterest.partnerAnalytics.g.in_profile_source_label, resources7);
                    } else {
                        Resources resources8 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources8, "getResources(...)");
                        c24 = bs1.c.c2(com.pinterest.partnerAnalytics.g.other_profile_source_label, resources8);
                    }
                } else {
                    Resources resources9 = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources9, "getResources(...)");
                    c24 = bs1.c.c2(com.pinterest.partnerAnalytics.g.all_sources_label, resources9);
                }
            }
            a0.p(holder.f60392x, c24);
            int[] iArr = f.f60394a;
            ww1.c cVar = this.f60397f;
            switch (iArr[cVar.ordinal()]) {
                case 1:
                    k4 k13 = tbVar.k();
                    if (k13 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k13.B();
                        break;
                    }
                case 2:
                    k4 k14 = tbVar.k();
                    if (k14 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k14.A();
                        break;
                    }
                case 3:
                    k4 k15 = tbVar.k();
                    if (k15 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k15.D();
                        break;
                    }
                case 4:
                    k4 k16 = tbVar.k();
                    if (k16 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k16.C();
                        break;
                    }
                case 5:
                    k4 k17 = tbVar.k();
                    if (k17 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k17.F();
                        break;
                    }
                case 6:
                    k4 k18 = tbVar.k();
                    if (k18 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k18.I();
                        break;
                    }
                case 7:
                    k4 k19 = tbVar.k();
                    if (k19 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k19.J();
                        break;
                    }
                case 8:
                    k4 k23 = tbVar.k();
                    if (k23 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k23.H();
                        break;
                    }
                case 9:
                    k4 k24 = tbVar.k();
                    if (k24 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k24.E();
                        break;
                    }
                case 10:
                    k4 k25 = tbVar.k();
                    if (k25 == null) {
                        valueOf = Double.valueOf(0.0d);
                        break;
                    } else {
                        valueOf = k25.G();
                        break;
                    }
                default:
                    valueOf = Double.valueOf(0.0d);
                    break;
            }
            double doubleValue = valueOf.doubleValue();
            GestaltText gestaltText = holder.f60393y;
            if (doubleValue == 0.0d) {
                CharSequence text = context.getText(com.pinterest.partnerAnalytics.g.analytics_empty_value);
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                a0.q(gestaltText, bs1.c.h2(text));
            } else {
                String G = m0.x(cVar.getMetricFormatType()).G((float) doubleValue);
                Intrinsics.checkNotNullExpressionValue(G, "getFormattedValue(...)");
                a0.p(gestaltText, G);
            }
            holder.f19717a.setOnClickListener(new fd1.e(19, tbVar, this));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View view = LayoutInflater.from(bs1.c.k0(context)).inflate(com.pinterest.partnerAnalytics.e.layout_top_pins_item, (ViewGroup) parent, false);
        Intrinsics.f(view);
        Intrinsics.checkNotNullParameter(view, "view");
        e eVar = new e(view);
        View findViewById = view.findViewById(com.pinterest.partnerAnalytics.d.pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        eVar.f60389u = (WebImageView) findViewById;
        View findViewById2 = view.findViewById(com.pinterest.partnerAnalytics.d.pin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        eVar.f60390v = (GestaltText) findViewById2;
        View findViewById3 = view.findViewById(com.pinterest.partnerAnalytics.d.pin_type);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        eVar.f60391w = (GestaltText) findViewById3;
        View findViewById4 = view.findViewById(com.pinterest.partnerAnalytics.d.pin_source);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        eVar.f60392x = (GestaltText) findViewById4;
        View findViewById5 = view.findViewById(com.pinterest.partnerAnalytics.d.pin_value);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        eVar.f60393y = (GestaltText) findViewById5;
        return eVar;
    }
}
