package p71;

import com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f99077j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f99078k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f99079l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f99080m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99081i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f99081i = i13;
    }

    public final List b(SearchTypeaheadItemFeed it) {
        switch (this.f99081i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return it.q();
            case 1:
                Intrinsics.checkNotNullParameter(it, "searchTypeaheadItemFeed");
                return it.q();
            case 2:
                Intrinsics.checkNotNullParameter(it, "searchTypeaheadItemFeed");
                return it.q();
            default:
                Intrinsics.checkNotNullParameter(it, "searchTypeaheadItemFeed");
                List q13 = it.q();
                Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : q13) {
                    br.d dVar = (br.d) obj;
                    int ordinal = dVar.f23707e.ordinal();
                    if (ordinal != 5 && ordinal != 8 && ordinal != 13) {
                        br.c cVar = dVar.f23707e;
                        Objects.requireNonNull(cVar);
                        if (cVar == br.c.STORY) {
                        }
                    }
                    arrayList.add(obj);
                }
                return arrayList;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f99081i) {
        }
        return b((SearchTypeaheadItemFeed) obj);
    }
}
