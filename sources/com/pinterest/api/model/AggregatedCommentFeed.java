package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class AggregatedCommentFeed extends Feed<z2> {
    public static final Parcelable.Creator<AggregatedCommentFeed> CREATOR = new a3();

    public AggregatedCommentFeed() {
        super(null, null);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return Collections.emptyList();
    }

    public AggregatedCommentFeed(Parcel parcel) {
        super(parcel);
    }

    public AggregatedCommentFeed(vd0.c cVar, @NonNull String str, @NonNull ke0.b bVar) {
        super(cVar, str);
        if (cVar == null) {
            return;
        }
        H(bVar.c(cVar.k("data")));
        g(null);
    }
}
