package com.facebook.share.model;

import android.os.Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/share/model/ShareMessengerActionButton;", "Lcom/facebook/share/model/ShareModel;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f30127a;

    public ShareMessengerActionButton(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30127a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f30127a);
    }
}
