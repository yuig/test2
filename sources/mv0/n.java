package mv0;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.feature.storypin.creation.interesttagging.view.ShoppingBrandCapsule;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qa2.s1;

/* loaded from: classes5.dex */
public final class n extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public Function1 f88383d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f88384e = new ArrayList();

    public final void E(p pVar) {
        this.f88383d = pVar;
    }

    public final void F(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = this.f88384e;
        androidx.recyclerview.widget.w e13 = androidx.recyclerview.widget.a0.e(new vs.c(3, arrayList, items));
        Intrinsics.checkNotNullExpressionValue(e13, "calculateDiff(...)");
        arrayList.clear();
        arrayList.addAll(items);
        e13.b(this);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        ArrayList arrayList = this.f88384e;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        return (e() <= 0 || i13 != 0) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 holder, int i13) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof m) {
            m mVar = (m) holder;
            zd1.g model = (zd1.g) this.f88384e.get(i13 - 1);
            Intrinsics.checkNotNullParameter(model, "model");
            mVar.f88382v = model;
            String str = model.f141715f;
            ShoppingBrandCapsule shoppingBrandCapsule = mVar.f88381u;
            shoppingBrandCapsule.b(str);
            String imageUrl = model.f141717h;
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            if (j1.d1(imageUrl)) {
                shoppingBrandCapsule.f48576b.loadUrl(imageUrl);
            }
            shoppingBrandCapsule.setSelected(model.f141719j);
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i13 != 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new m(this, new ShoppingBrandCapsule(bs1.c.k0(context)));
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, bs1.c.k0(context2), (AttributeSet) null);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(gestaltText.getResources().getDimensionPixelSize(eo1.c.margin_quarter));
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.i(g.f88356s);
        gestaltText.setPaddingRelative(0, gestaltText.getResources().getDimensionPixelSize(eo1.c.margin), 0, 0);
        return new xo0.s(gestaltText, 1);
    }
}
