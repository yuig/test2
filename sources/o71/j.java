package o71;

import com.pinterest.feature.search.typeahead.view.SearchTypeaheadAutoCompleteUpsellCell;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public br.d f93307a;

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        k71.b view = (k71.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3();
    }

    public final void q3() {
        if (isBound()) {
            br.d dVar = this.f93307a;
            if (dVar != null) {
                k71.b bVar = (k71.b) getView();
                String title = dVar.f23704b;
                if (title == null) {
                    title = "";
                }
                SearchTypeaheadAutoCompleteUpsellCell searchTypeaheadAutoCompleteUpsellCell = (SearchTypeaheadAutoCompleteUpsellCell) bVar;
                searchTypeaheadAutoCompleteUpsellCell.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                searchTypeaheadAutoCompleteUpsellCell.f47838a.i(new b31.f(title, 20));
                k71.b bVar2 = (k71.b) getView();
                String str = dVar.f23721s;
                String actionText = str != null ? str : "";
                SearchTypeaheadAutoCompleteUpsellCell searchTypeaheadAutoCompleteUpsellCell2 = (SearchTypeaheadAutoCompleteUpsellCell) bVar2;
                searchTypeaheadAutoCompleteUpsellCell2.getClass();
                Intrinsics.checkNotNullParameter(actionText, "actionText");
                searchTypeaheadAutoCompleteUpsellCell2.f47839b.d(new b31.f(actionText, 19)).g(new q71.o(searchTypeaheadAutoCompleteUpsellCell2, 1));
            }
            SearchTypeaheadAutoCompleteUpsellCell searchTypeaheadAutoCompleteUpsellCell3 = (SearchTypeaheadAutoCompleteUpsellCell) ((k71.b) getView());
            searchTypeaheadAutoCompleteUpsellCell3.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            searchTypeaheadAutoCompleteUpsellCell3.f47840c = this;
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        k71.b view = (k71.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3();
    }
}
