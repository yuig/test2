package gw1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kh2.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class k extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f66239d;

    /* renamed from: e, reason: collision with root package name */
    public List f66240e;

    public k(Context context, c onSelected) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        this.f66239d = onSelected;
        this.f66240e = q0.f80391a;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f66240e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        j holder = (j) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        px.h productTagItem = (px.h) this.f66240e.get(i13);
        c onClick = new c(this, 1);
        Intrinsics.checkNotNullParameter(productTagItem, "productTagItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        GestaltText pinTitle = holder.f66235v;
        Intrinsics.checkNotNullExpressionValue(pinTitle, "pinTitle");
        String str = productTagItem.f101567f;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        a0.p(pinTitle, str);
        holder.f66234u.loadUrl(productTagItem.f101568g);
        GestaltText pinPercentage = holder.f66238y;
        Intrinsics.checkNotNullExpressionValue(pinPercentage, "pinPercentage");
        kw1.d.a(pinPercentage, productTagItem.f101564c);
        GestaltText pinDescription = holder.f66236w;
        Intrinsics.checkNotNullExpressionValue(pinDescription, "pinDescription");
        String str3 = productTagItem.f101566e;
        String str4 = productTagItem.f101565d;
        if (str3 != null) {
            str2 = a.a.D(str3, " • ", str4);
        } else if (str4 != null) {
            str2 = str4;
        }
        a0.p(pinDescription, str2);
        GestaltText pinValue = holder.f66237x;
        Intrinsics.checkNotNullExpressionValue(pinValue, "pinValue");
        px.f fVar = productTagItem.f101569h;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String G = m0.x(ww1.c.valueOf(fVar.name()).getMetricFormatType()).G(productTagItem.f101563b != null ? r3.longValue() : 0.0f);
        Intrinsics.checkNotNullExpressionValue(G, "getFormattedValue(...)");
        a0.p(pinValue, G);
        holder.f19717a.setOnClickListener(new fd1.e(16, onClick, productTagItem));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View inflate = LayoutInflater.from(bs1.c.k0(context)).inflate(com.pinterest.partnerAnalytics.e.product_tag_item, (ViewGroup) parent, false);
        Intrinsics.f(inflate);
        return new j(inflate);
    }
}
