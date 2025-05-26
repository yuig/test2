package p71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends com.pinterest.hairball.network.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99082a;

    /* renamed from: b, reason: collision with root package name */
    public final j22.b f99083b;

    public c(j22.b searchService, int i13) {
        this.f99082a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(searchService, "searchService");
            this.f99083b = searchService;
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(searchService, "searchService");
            this.f99083b = searchService;
        } else {
            Intrinsics.checkNotNullParameter(searchService, "searchService");
            this.f99083b = searchService;
        }
    }

    @Override // com.pinterest.hairball.network.g
    public final com.pinterest.hairball.network.f a(Object[] params) {
        switch (this.f99082a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj = params[0];
                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.search.typeahead.remoterequest.BoardAutocompleteRequestParams");
                return new ar.a(this, (a) obj);
            case 1:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj2 = params[0];
                Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.feature.search.typeahead.remoterequest.GeneralAutocompleteRequestParams");
                return new ar.a(this, (d) obj2);
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj3 = params[0];
                Intrinsics.g(obj3, "null cannot be cast to non-null type com.pinterest.feature.search.typeahead.remoterequest.PinAutocompleteRequestParams");
                return new ar.a(this, (e) obj3);
        }
    }
}
