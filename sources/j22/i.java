package j22;

import com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import x02.k2;

/* loaded from: classes4.dex */
public final /* synthetic */ class i extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int ordinal;
        SearchTypeaheadItemFeed feed = (SearchTypeaheadItemFeed) obj;
        Intrinsics.checkNotNullParameter(feed, "p0");
        e eVar = (e) this.receiver;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(feed, "feed");
        k2 k2Var = eVar.f74515a;
        int i13 = d.f74514a[k2Var.f131431c.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return feed;
            }
            List q13 = feed.q();
            Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
            Iterator it = q13.iterator();
            while (it.hasNext()) {
                ((br.d) it.next()).f23707e = br.c.TRENDING_QUERY;
            }
            return feed;
        }
        SearchTypeaheadItemFeed searchTypeaheadItemFeed = new SearchTypeaheadItemFeed();
        int i14 = k2Var.f131432d == a.RECENT_MY_QUERIES ? 8 : 4;
        for (int i15 = 0; i15 < i14; i15++) {
            br.d dVar = (br.d) feed.k(i15);
            if (dVar == null || ((ordinal = dVar.f23707e.ordinal()) != 5 && ordinal != 8 && ordinal != 13)) {
                if (dVar != null) {
                    br.c cVar = dVar.f23707e;
                    Objects.requireNonNull(cVar);
                    if (cVar != br.c.STORY) {
                    }
                }
            }
            List list = searchTypeaheadItemFeed.f35557i;
            if (!searchTypeaheadItemFeed.v()) {
                searchTypeaheadItemFeed.B();
            }
            list.add(dVar);
            searchTypeaheadItemFeed.H(list);
        }
        return searchTypeaheadItemFeed;
    }
}
