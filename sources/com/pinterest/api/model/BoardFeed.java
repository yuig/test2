package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Deprecated
/* loaded from: classes.dex */
public class BoardFeed extends Feed<v7> {
    public static final Parcelable.Creator<BoardFeed> CREATOR = new a8();

    public BoardFeed() {
        super(null, null);
    }

    public static BoardFeed I(List list, String str, ke0.b bVar) {
        BoardFeed boardFeed = new BoardFeed(null, str, bVar);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            y8 y8Var = (y8) list.get(i13);
            u7 x03 = v7.x0();
            x03.P(UUID.randomUUID().toString());
            x03.C(y8Var.d());
            c9 I = kh2.j.I(y8Var);
            if (I != null) {
                x03.O(I.e());
                x03.N(I.f());
                x03.M(I.d());
            }
            arrayList.add(x03.a());
        }
        boardFeed.H(arrayList);
        return boardFeed;
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
            v7 a13 = ew.a((String) it.next());
            if (a13 != null) {
                arrayList2.add(a13);
            }
        }
        return arrayList2.size() == arrayList.size() ? arrayList2 : new ArrayList();
    }

    public BoardFeed(vd0.c cVar, String str, ke0.b bVar) {
        super(cVar, str);
        if (cVar == null) {
            return;
        }
        H(bVar.c(cVar.k("data")));
        g(null);
    }

    public BoardFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }
}
