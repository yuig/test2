package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class InterestsFeed extends Feed<zs> {
    public static final Parcelable.Creator<InterestsFeed> CREATOR = new kt();

    public InterestsFeed() {
        super(null, null);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        gw gwVar = fw.f37821a;
        ArrayList arrayList = this.f35559k;
        gwVar.getClass();
        return gw.c(arrayList);
    }

    public InterestsFeed(vd0.c cVar, String str, ke0.b bVar) {
        super(cVar, str);
        if (cVar == null) {
            return;
        }
        Object obj = this.f105381a;
        if (obj instanceof vd0.a) {
            H(bVar.c((vd0.a) obj));
        } else {
            H(new ArrayList());
        }
        g(null);
    }

    public InterestsFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }
}
