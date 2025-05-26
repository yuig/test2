package wp0;

import com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f130759j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f130760k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f130761l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f130762m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130763i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f130763i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130763i;
        switch (i13) {
            case 0:
                SearchTypeaheadItemFeed it = (SearchTypeaheadItemFeed) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.q();
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.q();
                }
            case 1:
                br.d searchTypeaheadItem = (br.d) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(searchTypeaheadItem, "searchTypeaheadItem");
                        return searchTypeaheadItem;
                    default:
                        Intrinsics.checkNotNullParameter(searchTypeaheadItem, "searchTypeaheadItem");
                        return searchTypeaheadItem;
                }
            case 2:
                SearchTypeaheadItemFeed it2 = (SearchTypeaheadItemFeed) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.q();
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.q();
                }
            default:
                br.d searchTypeaheadItem2 = (br.d) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(searchTypeaheadItem2, "searchTypeaheadItem");
                        return searchTypeaheadItem2;
                    default:
                        Intrinsics.checkNotNullParameter(searchTypeaheadItem2, "searchTypeaheadItem");
                        return searchTypeaheadItem2;
                }
        }
    }
}
