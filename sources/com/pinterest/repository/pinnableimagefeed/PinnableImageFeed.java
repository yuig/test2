package com.pinterest.repository.pinnableimagefeed;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.feature.todaytab.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Deprecated
/* loaded from: classes4.dex */
public class PinnableImageFeed extends Feed<PinnableImage> {
    public static final Parcelable.Creator<PinnableImageFeed> CREATOR = new a(12);

    /* renamed from: l, reason: collision with root package name */
    public List f50456l;

    public PinnableImageFeed(Parcel parcel) {
        super(null, null);
        this.f50456l = Collections.emptyList();
        C(parcel);
    }

    @Override // com.pinterest.api.model.Feed
    public final void C(Parcel parcel) {
        if (parcel == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f35557i = arrayList;
        parcel.readList(arrayList, getClass().getClassLoader());
        super.C(parcel);
    }

    @Override // com.pinterest.api.model.Feed
    public final void H(List list) {
        super.H(list);
        this.f50456l = new ArrayList(list);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return new ArrayList(this.f50456l);
    }

    @Override // com.pinterest.api.model.Feed, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        if (this.f35557i == null) {
            this.f35557i = new ArrayList();
        }
        parcel.writeList(this.f35557i);
        super.writeToParcel(parcel, i13);
    }

    public PinnableImageFeed() {
        this.f50456l = Collections.emptyList();
        H(new ArrayList());
    }

    public PinnableImageFeed(PinnableImageFeed pinnableImageFeed) {
        super(pinnableImageFeed);
        this.f50456l = Collections.emptyList();
    }

    public PinnableImageFeed(vd0.a aVar) {
        this.f50456l = Collections.emptyList();
        if (aVar != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            int d2 = aVar.d();
            for (int i13 = 0; i13 < d2; i13++) {
                try {
                    PinnableImage l13 = PinnableImage.l(aVar.j(i13), UUID.randomUUID().toString());
                    if (l13 != null && hashSet.add(l13.f35569f)) {
                        arrayList.add(l13);
                    }
                } catch (Exception unused) {
                }
            }
            H(arrayList);
        }
    }

    public PinnableImageFeed(List<Object> list) {
        this.f50456l = Collections.emptyList();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Object> it = list.iterator();
        if (!it.hasNext()) {
            H(arrayList);
        } else {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
    }
}
