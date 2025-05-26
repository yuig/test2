package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/AppGroupCreationContent;", "Lcom/facebook/share/model/ShareModel;", "pf/a", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class AppGroupCreationContent implements ShareModel {

    @NotNull
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new a(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f30100a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30101b;

    /* renamed from: c, reason: collision with root package name */
    public final pf.a f30102c;

    public AppGroupCreationContent(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30100a = parcel.readString();
        this.f30101b = parcel.readString();
        this.f30102c = (pf.a) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f30100a);
        out.writeString(this.f30101b);
        out.writeSerializable(this.f30102c);
    }
}
