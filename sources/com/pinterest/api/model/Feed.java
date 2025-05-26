package com.pinterest.api.model;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class Feed<T extends dl1.s> extends qz.d implements Parcelable {

    /* renamed from: i */
    public List f35557i;

    /* renamed from: j */
    public String f35558j;

    /* renamed from: k */
    public ArrayList f35559k;

    public Feed() {
        this.f35557i = new ArrayList();
        this.f35559k = new ArrayList();
    }

    public static Feed F(String str, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Feed feed = (Feed) bundle.getParcelable(str);
        if (feed != null && feed.f105387g != -1) {
            feed.E(bundle);
            feed.B();
        }
        return feed;
    }

    public final void B() {
        ArrayList arrayList = this.f35559k;
        if (arrayList == null || arrayList.size() <= 0 || v()) {
            return;
        }
        this.f35559k.size();
        H(u());
        this.f35559k.size();
    }

    public void C(Parcel parcel) {
        if (parcel == null) {
            return;
        }
        this.f105387g = parcel.readInt();
        this.f105382b = parcel.readString();
        this.f105384d = parcel.readString();
        this.f105383c = parcel.readString();
        this.f35558j = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f35559k = arrayList;
        parcel.readList(arrayList, String.class.getClassLoader());
    }

    public void D() {
        if (this.f35557i == null) {
            return;
        }
        ArrayList arrayList = this.f35559k;
        if (arrayList == null) {
            this.f35559k = new ArrayList();
        } else {
            arrayList.clear();
        }
        Iterator it = this.f35557i.iterator();
        while (it.hasNext()) {
            this.f35559k.add(((dl1.s) it.next()).getId());
        }
    }

    public void E(Bundle bundle) {
    }

    public void G(Bundle bundle) {
    }

    public void H(List list) {
        this.f35557i = list;
        D();
    }

    @Override // qz.d, dl1.s
    /* renamed from: b */
    public final String getId() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void h(dl1.s sVar) {
        List list = this.f35557i;
        if (list == null || list.size() < 0) {
            return;
        }
        this.f35557i.add(0, sVar);
        this.f35559k.add(0, sVar.getId());
    }

    public void j(Feed feed) {
        this.f105383c = feed.f105383c;
        this.f105387g = feed.f105387g;
        this.f105382b = feed.f105382b;
        this.f105384d = feed.f105384d;
        if (!v()) {
            B();
        }
        List list = this.f35557i;
        if (list == null) {
            H(feed.q());
            return;
        }
        int n13 = feed.n();
        for (int i13 = 0; i13 < n13; i13++) {
            dl1.s k13 = feed.k(i13);
            if (!y(k13)) {
                list.add(k13);
            }
        }
        H(list);
    }

    public final dl1.s k(int i13) {
        if (n() == 0 || i13 > this.f35557i.size() - 1) {
            return null;
        }
        return (dl1.s) this.f35557i.get(i13);
    }

    public final int l() {
        ArrayList arrayList = this.f35559k;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int n() {
        List list = this.f35557i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final List q() {
        if (n() == 0) {
            B();
        }
        List list = this.f35557i;
        return list == null ? new ArrayList() : list;
    }

    public final String s() {
        if (!df.j1.d1(this.f35558j) || !df.j1.d1(this.f105383c)) {
            return null;
        }
        String replaceAll = this.f35558j.replaceAll("(?<=[?&;])bookmark=.*?($|[&;])", "");
        this.f35558j = replaceAll;
        if (replaceAll.contains("item_count=")) {
            qb0.e eVar = qb0.d.f103396a;
            this.f35558j = qb0.e.f(this.f35558j, "item_count", String.valueOf(n()));
        }
        return df.j1.V("%s%s%s", this.f35558j, this.f35558j.contains("?") ? "&bookmark=" : "?bookmark=", Uri.encode(this.f105383c));
    }

    public abstract List u();

    public final boolean v() {
        List list = this.f35557i;
        return list != null && list.size() > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f105387g);
        if (this.f105382b == null) {
            this.f105382b = "";
        }
        parcel.writeString(this.f105382b);
        if (this.f105384d == null) {
            this.f105384d = "";
        }
        parcel.writeString(this.f105384d);
        if (this.f105383c == null) {
            this.f105383c = "";
        }
        parcel.writeString(this.f105383c);
        if (this.f35558j == null) {
            this.f35558j = "";
        }
        parcel.writeString(this.f35558j);
        if (this.f35559k == null) {
            this.f35559k = new ArrayList();
        }
        parcel.writeList(this.f35559k);
    }

    public final boolean x() {
        List list = this.f35557i;
        return list == null || list.isEmpty();
    }

    public boolean y(dl1.s sVar) {
        return this.f35559k.contains(sVar.getId());
    }

    public Feed(Parcel parcel) {
        this.f35557i = new ArrayList();
        this.f35559k = new ArrayList();
        C(parcel);
    }

    public Feed(Feed<T> feed) {
        super(null);
        this.f35557i = new ArrayList();
        this.f35559k = new ArrayList();
        if (feed == null) {
            return;
        }
        this.f105387g = feed.f105387g;
        this.f105382b = feed.f105382b;
        this.f105383c = feed.f105383c;
        this.f105384d = feed.f105384d;
        this.f105385e = feed.f105385e;
        this.f35558j = feed.f35558j;
        H(new ArrayList(feed.q()));
    }

    public Feed(vd0.c cVar, String str) {
        super(cVar);
        this.f35557i = new ArrayList();
        this.f35559k = new ArrayList();
        this.f35558j = str;
    }
}
