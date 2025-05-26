package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/ShareHashtag;", "Lcom/facebook/share/model/ShareModel;", "z/a", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ShareHashtag implements ShareModel {

    @NotNull
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new a(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f30123a;

    public ShareHashtag(z.a aVar) {
        this.f30123a = aVar.f140498b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f30123a);
    }

    public ShareHashtag(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30123a = parcel.readString();
    }
}
