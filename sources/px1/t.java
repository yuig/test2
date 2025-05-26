package px1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.feature.filter.NestedSelectionView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class t extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f101691d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f101692e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f101693f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f101694g;

    /* renamed from: h, reason: collision with root package name */
    public int f101695h;

    /* renamed from: i, reason: collision with root package name */
    public int f101696i;

    public t(Context context, s onSelected, s onNestedSelected) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Intrinsics.checkNotNullParameter(onNestedSelected, "onNestedSelected");
        this.f101691d = onSelected;
        this.f101692e = onNestedSelected;
        this.f101693f = new ArrayList();
        this.f101694g = true;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f101693f.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        r holder = (r) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        q filterSelection = (q) this.f101693f.get(i13);
        boolean z13 = this.f101695h == i13;
        boolean z14 = this.f101694g;
        final int i14 = this.f101696i;
        s onSelected = new s(this, 0);
        s onNestedSelected = new s(this, 1);
        Intrinsics.checkNotNullParameter(filterSelection, "filterSelection");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Intrinsics.checkNotNullParameter(onNestedSelected, "onNestedSelected");
        int i15 = com.pinterest.partnerAnalytics.d.tvDescription;
        View view = holder.f19717a;
        GestaltText gestaltText = (GestaltText) view.findViewById(i15);
        GestaltText gestaltText2 = (GestaltText) view.findViewById(com.pinterest.partnerAnalytics.d.tvDisclaimer);
        GestaltIcon gestaltIcon = (GestaltIcon) view.findViewById(com.pinterest.partnerAnalytics.d.ivCheckIcon);
        final NestedSelectionView nestedSelectionView = (NestedSelectionView) view.findViewById(com.pinterest.partnerAnalytics.d.selectionView);
        Intrinsics.f(gestaltText);
        a0.p(gestaltText, filterSelection.f101682b);
        gestaltText2.i(new ex1.n(filterSelection, 8));
        gestaltIcon.g2(new fx1.d(z13, 6));
        if (z14 && z13) {
            final List entries = filterSelection.f101688h;
            if (!entries.isEmpty()) {
                nestedSelectionView.getClass();
                Intrinsics.checkNotNullParameter(entries, "entries");
                q qVar = (q) CollectionsKt.U(i14, entries);
                if (qVar != null) {
                    final String str = filterSelection.f101685e;
                    a0.p(nestedSelectionView.f50197e, str == null ? "" : str);
                    a0.p(nestedSelectionView.f50196d, qVar.f101682b);
                    final String str2 = filterSelection.f101686f;
                    nestedSelectionView.f50195c.setOnClickListener(new View.OnClickListener() { // from class: px1.x
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i16 = NestedSelectionView.f50192h;
                            NestedSelectionView this$0 = NestedSelectionView.this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            List entries2 = entries;
                            Intrinsics.checkNotNullParameter(entries2, "$entries");
                            m60.w wVar = this$0.f50199g;
                            if (wVar == null) {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                            wVar.h(this$0);
                            m60.w wVar2 = this$0.f50199g;
                            if (wVar2 == null) {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                            if (wVar2 == null) {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                            wVar2.d(new jc0.v(new w(str, str2, i14, entries2, wVar2), false, 0L, 30));
                        }
                    });
                }
                Intrinsics.checkNotNullParameter(onNestedSelected, "<set-?>");
                nestedSelectionView.f50198f = onNestedSelected;
                nestedSelectionView.setVisibility(0);
                view.setOnClickListener(new fd1.e(20, onSelected, filterSelection));
            }
        }
        Intrinsics.f(nestedSelectionView);
        nestedSelectionView.setVisibility(8);
        view.setOnClickListener(new fd1.e(20, onSelected, filterSelection));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View view = LayoutInflater.from(bs1.c.k0(context)).inflate(com.pinterest.partnerAnalytics.e.filter_selection_item_view, (ViewGroup) parent, false);
        Intrinsics.f(view);
        Intrinsics.checkNotNullParameter(view, "view");
        return new r(view);
    }
}
