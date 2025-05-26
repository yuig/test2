package q71;

import com.pinterest.feature.search.typeahead.view.SearchTypeaheadTextCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102756i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchTypeaheadTextCell f102757j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f102758k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(SearchTypeaheadTextCell searchTypeaheadTextCell, int i13, int i14) {
        super(1);
        this.f102756i = i14;
        this.f102757j = searchTypeaheadTextCell;
        this.f102758k = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f102756i;
        int i14 = this.f102758k;
        SearchTypeaheadTextCell searchTypeaheadTextCell = this.f102757j;
        switch (i13) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                int i15 = SearchTypeaheadTextCell.f47887r;
                searchTypeaheadTextCell.getClass();
                standard.a(i14 == 2 ? rm1.q.HISTORY : rm1.q.SEARCH);
                break;
            default:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new q0(searchTypeaheadTextCell, i14, 0));
                bind.c(fm1.c.VISIBLE);
                break;
        }
        return Unit.f80348a;
    }
}
