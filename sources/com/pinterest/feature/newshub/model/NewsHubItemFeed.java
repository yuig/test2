package com.pinterest.feature.newshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.qx;
import com.pinterest.feature.board.permissions.b;
import java.util.List;
import vd0.c;

@Deprecated
/* loaded from: classes5.dex */
public class NewsHubItemFeed extends Feed<qx> {
    public static final Parcelable.Creator<NewsHubItemFeed> CREATOR = new b(13);

    public NewsHubItemFeed() {
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return null;
    }

    public NewsHubItemFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }

    public NewsHubItemFeed(c cVar, String str, boolean z13, @NonNull ke0.b bVar) {
        super(cVar, str);
        if (cVar == null) {
            return;
        }
        H(bVar.a(cVar.k("data"), z13));
        g(null);
    }
}
