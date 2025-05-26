package q71;

import android.view.View;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadAutoCompleteUpsellCell;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.t3;
import kh2.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchTypeaheadAutoCompleteUpsellCell f102731b;

    public /* synthetic */ o(SearchTypeaheadAutoCompleteUpsellCell searchTypeaheadAutoCompleteUpsellCell, int i13) {
        this.f102730a = i13;
        this.f102731b = searchTypeaheadAutoCompleteUpsellCell;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        br.d dVar;
        String str;
        int i13 = this.f102730a;
        SearchTypeaheadAutoCompleteUpsellCell this$0 = this.f102731b;
        switch (i13) {
            case 0:
                int i14 = SearchTypeaheadAutoCompleteUpsellCell.f47837d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o71.j jVar = this$0.f47840c;
                if (jVar != null && (dVar = jVar.f93307a) != null && (str = dVar.f23722t) != null) {
                    if (n3.u0(str)) {
                        m60.w wVar = m60.u.f85943a;
                        NavigationImpl w13 = Navigation.w1((ScreenLocation) t3.f51396b.getValue());
                        w13.y0(str, "com.pinterest.EXTRA_GOLD_STANDARD_URL");
                        wVar.d(w13);
                    }
                    SearchTypeaheadAutoCompleteUpsellCell searchTypeaheadAutoCompleteUpsellCell = (SearchTypeaheadAutoCompleteUpsellCell) ((k71.b) jVar.getView());
                    searchTypeaheadAutoCompleteUpsellCell.getClass();
                    hf0.b.k(searchTypeaheadAutoCompleteUpsellCell);
                    break;
                }
                break;
            default:
                int i15 = SearchTypeaheadAutoCompleteUpsellCell.f47837d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.performClick();
                break;
        }
    }
}
