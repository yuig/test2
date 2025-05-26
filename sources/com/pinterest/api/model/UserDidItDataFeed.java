package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class UserDidItDataFeed extends Feed<az0> {
    public static final Parcelable.Creator<UserDidItDataFeed> CREATOR = new dz0();

    public UserDidItDataFeed() {
        super(null, null);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return new ArrayList();
    }

    public UserDidItDataFeed(Parcel parcel) {
        super(parcel);
    }

    public UserDidItDataFeed(vd0.c cVar, String str, ke0.b bVar) {
        super(cVar, str);
        List arrayList;
        try {
            arrayList = bVar.c(cVar.k("data"));
        } catch (Exception unused) {
            arrayList = new ArrayList();
        }
        H(arrayList);
    }
}
