package uw1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import f0.h;
import gw1.i;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class e extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f123229d;

    /* renamed from: e, reason: collision with root package name */
    public List f123230e;

    /* renamed from: f, reason: collision with root package name */
    public h f123231f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f123232g;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f123229d = context;
        this.f123230e = q0.f80391a;
        this.f123231f = new fy1.e(fy1.d.BIG_NUMBERS, 2);
        this.f123232g = true;
    }

    public final void C(List dataSet, h formatter, boolean z13) {
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f123230e = dataSet;
        this.f123231f = formatter;
        this.f123232g = z13;
        h();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f123230e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        d holder = (d) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        mw1.e eVar = (mw1.e) this.f123230e.get(i13);
        holder.f123226u.setColorFilter(eVar.f88430c);
        a0.p(holder.f123227v, this.f123229d.getText(eVar.f88428a).toString());
        holder.f123228w.i(new i(3, eVar, this));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View view = LayoutInflater.from(bs1.c.k0(context)).inflate(com.pinterest.partnerAnalytics.e.layout_analytics_graph_legend_item, (ViewGroup) parent, false);
        Intrinsics.f(view);
        Intrinsics.checkNotNullParameter(view, "view");
        d dVar = new d(view);
        View findViewById = view.findViewById(com.pinterest.partnerAnalytics.d.view_series_color);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        dVar.f123226u = (ImageView) findViewById;
        View findViewById2 = view.findViewById(com.pinterest.partnerAnalytics.d.text_series_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        dVar.f123227v = (GestaltText) findViewById2;
        View findViewById3 = view.findViewById(com.pinterest.partnerAnalytics.d.text_series_value);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        dVar.f123228w = (GestaltText) findViewById3;
        return dVar;
    }
}
