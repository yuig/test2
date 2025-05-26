package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class ContactRequestFeed extends Feed<ve> {
    public static final Parcelable.Creator<ContactRequestFeed> CREATOR = new le();

    public ContactRequestFeed() {
        super(null, null);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return null;
    }

    public ContactRequestFeed(vd0.c cVar, String str, ke0.b bVar) {
        super(cVar, str);
        if (cVar == null) {
            return;
        }
        Object obj = this.f105381a;
        if (obj instanceof vd0.a) {
            H(bVar.c((vd0.a) obj));
        } else if (obj instanceof vd0.c) {
            vd0.a aVar = new vd0.a();
            aVar.f125618a.t(((vd0.c) obj).f125623a);
            H(bVar.c(aVar));
        }
        g(null);
    }

    public ContactRequestFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }
}
