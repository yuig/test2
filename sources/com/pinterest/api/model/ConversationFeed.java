package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class ConversationFeed extends Feed<ue> {
    public static final Parcelable.Creator<ConversationFeed> CREATOR = new we();

    public ConversationFeed(vd0.c cVar, String str, ke0.b bVar) {
        super(cVar, str);
        vd0.a c13 = cVar.c("data");
        if (c13 != null) {
            g(c13);
            H(bVar.c(c13));
        }
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return null;
    }

    public ConversationFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }
}
