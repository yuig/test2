package o71;

import android.view.ViewGroup;
import com.pinterest.api.model.kj;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHeaderCell;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j3;
import lh0.z3;

/* loaded from: classes5.dex */
public final class p extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public br.d f93362a;

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        k71.f view = (k71.f) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3();
    }

    public final void q3() {
        br.d dVar;
        if (isBound() && (dVar = this.f93362a) != null) {
            kj kjVar = dVar.f23719q.f42855m;
            String title = kjVar != null ? kjVar.b() : null;
            if (title == null) {
                title = "";
            }
            ((k71.f) getView()).setId(k42.d.autocomplete_header);
            SearchTypeaheadHeaderCell searchTypeaheadHeaderCell = (SearchTypeaheadHeaderCell) ((k71.f) getView());
            searchTypeaheadHeaderCell.getClass();
            Intrinsics.checkNotNullParameter(title, "title");
            b31.f fVar = new b31.f(title, 22);
            GestaltText gestaltText = searchTypeaheadHeaderCell.f47861d;
            gestaltText.i(fVar);
            j3 j3Var = searchTypeaheadHeaderCell.f47860c;
            if (j3Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) j3Var.f83398a;
            if (g1Var.o("mobile_search_autocomplete_empty_state", "enabled", z3Var) || g1Var.l("mobile_search_autocomplete_empty_state")) {
                ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(searchTypeaheadHeaderCell.getResources().getDimensionPixelSize(eo1.c.space_100));
                marginLayoutParams.topMargin = searchTypeaheadHeaderCell.getResources().getDimensionPixelSize(eo1.c.space_100);
                marginLayoutParams.bottomMargin = searchTypeaheadHeaderCell.getResources().getDimensionPixelSize(eo1.c.space_200);
                gestaltText.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        k71.f view = (k71.f) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3();
    }
}
