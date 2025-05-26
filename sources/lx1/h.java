package lx1;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import ex1.n;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import sw0.u;

/* loaded from: classes4.dex */
public final class h extends b2 {

    /* renamed from: i, reason: collision with root package name */
    public static final DecimalFormat f85079i = new DecimalFormat("#.##");

    /* renamed from: d, reason: collision with root package name */
    public final boolean f85080d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85081e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f85082f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public l f85083g = l.AFFINITY;

    /* renamed from: h, reason: collision with root package name */
    public final n f85084h = new n(this, 3);

    public h(boolean z13, int i13) {
        this.f85080d = z13;
        this.f85081e = i13;
    }

    public final void C(List list) {
        ArrayList arrayList = this.f85082f;
        arrayList.clear();
        arrayList.add(gx1.i.f66305b);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof gx1.j) {
                arrayList2.add(obj);
            }
        }
        int i13 = g.f85078a[this.f85083g.ordinal()];
        Collection collection = arrayList2;
        if (i13 != 1) {
            if (i13 == 2) {
                collection = CollectionsKt.x0(arrayList2, new u(12));
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                collection = CollectionsKt.x0(arrayList2, new u(13));
            }
        }
        arrayList.addAll(collection);
        h();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        int i13;
        ArrayList arrayList = this.f85082f;
        int i14 = this.f85081e;
        return (i14 <= 0 || (i13 = i14 + 1) > arrayList.size()) ? arrayList.size() : i13;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        return i13 == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 holder, int i13) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final int i14 = 0;
        if (!(holder instanceof e)) {
            if (holder instanceof f) {
                f fVar = (f) holder;
                Object obj = this.f85082f.get(i13);
                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.partnerAnalytics.feature.audience.model.TopCategoryModel.TopCategoryItem");
                gx1.j item = (gx1.j) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                if (i13 == 0) {
                    View itemView = fVar.f19717a;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    itemView.setPaddingRelative(itemView.getPaddingStart(), 0, itemView.getPaddingEnd(), itemView.getPaddingBottom());
                }
                a0.p(fVar.f85075u, item.f66306b);
                DecimalFormat decimalFormat = f85079i;
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                a0.p(fVar.f85076v, a.a.C(decimalFormat.format(Float.valueOf(item.f66307c)), "x"));
                a0.p(fVar.f85077w, d7.g.i(new StringBuilder(), item.f66308d, "%"));
                return;
            }
            return;
        }
        final e eVar = (e) holder;
        l sortBy = this.f85083g;
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        GestaltText gestaltText = eVar.f85073w;
        GestaltText gestaltText2 = eVar.f85074x;
        if (!eVar.f85071u) {
            gestaltText.i(c.f85067k);
            gestaltText2.i(c.f85066j);
            return;
        }
        gestaltText2.j(new gm1.a() { // from class: lx1.a
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                e this$0 = eVar;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f85072v.invoke(l.AFFINITY);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            this$0.f85072v.invoke(l.AUDIENCE);
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        gestaltText.j(new gm1.a() { // from class: lx1.a
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                e this$0 = eVar;
                switch (i152) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f85072v.invoke(l.AFFINITY);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            this$0.f85072v.invoke(l.AUDIENCE);
                            break;
                        }
                        break;
                }
            }
        });
        Resources resources = gestaltText2.getResources();
        int i16 = b.f85065a[sortBy.ordinal()];
        if (i16 == 1) {
            gestaltText.i(new d(i14, resources));
            gestaltText2.i(new d(i15, resources));
            return;
        }
        int i17 = 3;
        int i18 = 2;
        if (i16 == 2) {
            gestaltText.i(new d(i18, resources));
            gestaltText2.i(new d(i17, resources));
        } else {
            if (i16 != 3) {
                return;
            }
            gestaltText.i(new d(4, resources));
            gestaltText2.i(new d(5, resources));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LayoutInflater from = LayoutInflater.from(bs1.c.k0(context));
        if (i13 == 0) {
            View inflate = from.inflate(com.pinterest.partnerAnalytics.e.top_categories_list_header, (ViewGroup) parent, false);
            Intrinsics.f(inflate);
            return new e(inflate, this.f85084h, this.f85080d);
        }
        View itemView = from.inflate(com.pinterest.partnerAnalytics.e.top_categories_list_item, (ViewGroup) parent, false);
        Intrinsics.f(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        f fVar = new f(itemView);
        View findViewById = itemView.findViewById(com.pinterest.partnerAnalytics.d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        fVar.f85075u = (GestaltText) findViewById;
        View findViewById2 = itemView.findViewById(com.pinterest.partnerAnalytics.d.tvAffinity);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        fVar.f85076v = (GestaltText) findViewById2;
        View findViewById3 = itemView.findViewById(com.pinterest.partnerAnalytics.d.tvAudience);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        fVar.f85077w = (GestaltText) findViewById3;
        return fVar;
    }
}
