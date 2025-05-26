package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.LruCache;
import com.pinterest.api.model.deserializer.BoardInviteDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

@Deprecated
/* loaded from: classes.dex */
public class BoardInviteFeed extends Feed<k8> {
    public static final Parcelable.Creator<BoardInviteFeed> CREATOR = new l8();

    public BoardInviteFeed() {
        super(null, null);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        k8 k8Var;
        gw gwVar = fw.f37821a;
        ArrayList arrayList = this.f35559k;
        gwVar.getClass();
        if (arrayList == null || arrayList.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                LruCache lruCache = ew.f37357a;
                k8Var = null;
            } else {
                k8Var = (k8) ew.f37371o.get(str);
            }
            if (k8Var != null) {
                arrayList2.add(k8Var);
            }
        }
        return arrayList2.size() == arrayList.size() ? arrayList2 : new ArrayList();
    }

    public BoardInviteFeed(vd0.c cVar, String str, BoardInviteDeserializer boardInviteDeserializer) {
        super(cVar, str);
        if (cVar == null) {
            return;
        }
        Object obj = this.f105381a;
        boardInviteDeserializer.getClass();
        ArrayList arrayList = new ArrayList();
        if (obj != null) {
            if (obj instanceof vd0.a) {
                arrayList = CollectionsKt.H0(boardInviteDeserializer.c((vd0.a) obj));
            } else if (obj instanceof vd0.c) {
                arrayList.add(boardInviteDeserializer.d((vd0.c) obj));
            }
            boardInviteDeserializer.f36748e.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ew.h((k8) it.next());
            }
        }
        H(arrayList);
        g(null);
    }

    public BoardInviteFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }
}
