package com.linecorp.linesdk.openchat;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oi.e7;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/linecorp/linesdk/openchat/OpenChatRoomInfo;", "Landroid/os/Parcelable;", "line-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class OpenChatRoomInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new e7(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f34144a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34145b;

    public OpenChatRoomInfo(String roomId, String landingPageUrl) {
        Intrinsics.h(roomId, "roomId");
        Intrinsics.h(landingPageUrl, "landingPageUrl");
        this.f34144a = roomId;
        this.f34145b = landingPageUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenChatRoomInfo)) {
            return false;
        }
        OpenChatRoomInfo openChatRoomInfo = (OpenChatRoomInfo) obj;
        return Intrinsics.d(this.f34144a, openChatRoomInfo.f34144a) && Intrinsics.d(this.f34145b, openChatRoomInfo.f34145b);
    }

    public final int hashCode() {
        String str = this.f34144a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f34145b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OpenChatRoomInfo(roomId=");
        sb3.append(this.f34144a);
        sb3.append(", landingPageUrl=");
        return a.p(sb3, this.f34145b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.h(parcel, "parcel");
        parcel.writeString(this.f34144a);
        parcel.writeString(this.f34145b);
    }
}
