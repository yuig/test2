package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/share/model/ShareContent;", "M", "", "B", "Lcom/facebook/share/model/ShareModel;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B> implements ShareModel {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f30117a;

    /* renamed from: b, reason: collision with root package name */
    public final List f30118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30119c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30120d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30121e;

    /* renamed from: f, reason: collision with root package name */
    public final ShareHashtag f30122f;

    public ShareContent(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30117a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f30118b = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.f30119c = parcel.readString();
        this.f30120d = parcel.readString();
        this.f30121e = parcel.readString();
        a aVar = new a(2);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            aVar.f140498b = shareHashtag.f30123a;
        }
        this.f30122f = new ShareHashtag(aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f30117a, 0);
        out.writeStringList(this.f30118b);
        out.writeString(this.f30119c);
        out.writeString(this.f30120d);
        out.writeString(this.f30121e);
        out.writeParcelable(this.f30122f, 0);
    }
}
