package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class UserFeed extends Feed<wy0> {
    public static final Parcelable.Creator<UserFeed> CREATOR = new ez0();

    public UserFeed() {
        super(null, null);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        gw gwVar = fw.f37821a;
        ArrayList arrayList = this.f35559k;
        gwVar.getClass();
        if (arrayList == null || arrayList.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wy0 e13 = ew.e((String) it.next());
            if (e13 != null) {
                arrayList2.add(e13);
            }
        }
        return arrayList2.size() == arrayList.size() ? arrayList2 : new ArrayList();
    }

    public UserFeed(vd0.c cVar, String str, ke0.b bVar) {
        super(cVar, str);
        if (cVar != null) {
            Object obj = this.f105381a;
            if (obj instanceof vd0.a) {
                H(bVar.c((vd0.a) obj));
                g(null);
            }
        }
    }

    public UserFeed(vd0.c cVar, @NonNull List<wy0> list, String str) {
        super(cVar, str);
        if (cVar == null || !(this.f105381a instanceof vd0.a)) {
            return;
        }
        H(list);
        g(null);
    }

    public UserFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }
}
