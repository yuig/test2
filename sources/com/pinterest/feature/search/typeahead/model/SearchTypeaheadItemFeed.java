package com.pinterest.feature.search.typeahead.model;

import android.os.Parcel;
import android.os.Parcelable;
import br.d;
import com.pinterest.api.model.Feed;
import com.pinterest.feature.board.permissions.b;
import java.util.List;
import vd0.c;

@Deprecated
/* loaded from: classes2.dex */
public final class SearchTypeaheadItemFeed extends Feed<d> {
    public static final Parcelable.Creator<SearchTypeaheadItemFeed> CREATOR = new b(21);

    public /* synthetic */ SearchTypeaheadItemFeed(Parcel parcel, int i13) {
        this(parcel);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return null;
    }

    public SearchTypeaheadItemFeed() {
    }

    private SearchTypeaheadItemFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }

    public SearchTypeaheadItemFeed(c cVar, String str) {
        super(cVar, str);
    }
}
