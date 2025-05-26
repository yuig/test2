package eu;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.ads.feature.owc.view.collection.AdsProductView;
import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qa2.s1;

/* loaded from: classes3.dex */
public final class k extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final List f60140d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f60141e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f60142f;

    public k(List products, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.f60140d = products;
        this.f60141e = z13;
        this.f60142f = z14;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f60140d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        n holder = (n) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        f30 product = (f30) this.f60140d.get(i13);
        Intrinsics.checkNotNullParameter(product, "product");
        AdsProductView adsProductView = holder.f60147u;
        adsProductView.f35353p = this.f60142f;
        Intrinsics.checkNotNullParameter(product, "<set-?>");
        adsProductView.f35354q.d(adsProductView, AdsProductView.f35340s[0], product);
        adsProductView.f35352o = holder.m();
        adsProductView.f35355r = this.f60141e;
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new n(new AdsProductView(6, context, (AttributeSet) null));
    }
}
