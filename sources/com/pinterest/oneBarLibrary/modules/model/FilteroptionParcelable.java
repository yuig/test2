package com.pinterest.oneBarLibrary.modules.model;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wv1.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/oneBarLibrary/modules/model/FilteroptionParcelable;", "Landroid/os/Parcelable;", "CREATOR", "wv1/b", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class FilteroptionParcelable implements Parcelable {

    @NotNull
    public static final b CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f50004a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50005b;

    /* renamed from: c, reason: collision with root package name */
    public final OnebarmoduleactionParcelable f50006c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f50007d;

    /* renamed from: e, reason: collision with root package name */
    public final OnebarmoduledisplayParcelable f50008e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f50009f;

    /* renamed from: g, reason: collision with root package name */
    public final String f50010g;

    public FilteroptionParcelable(String uid, String str, OnebarmoduleactionParcelable onebarmoduleactionParcelable, Boolean bool, OnebarmoduledisplayParcelable onebarmoduledisplayParcelable, Boolean bool2, String str2) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f50004a = uid;
        this.f50005b = str;
        this.f50006c = onebarmoduleactionParcelable;
        this.f50007d = bool;
        this.f50008e = onebarmoduledisplayParcelable;
        this.f50009f = bool2;
        this.f50010g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilteroptionParcelable)) {
            return false;
        }
        FilteroptionParcelable filteroptionParcelable = (FilteroptionParcelable) obj;
        return Intrinsics.d(this.f50004a, filteroptionParcelable.f50004a) && Intrinsics.d(this.f50005b, filteroptionParcelable.f50005b) && Intrinsics.d(this.f50006c, filteroptionParcelable.f50006c) && Intrinsics.d(this.f50007d, filteroptionParcelable.f50007d) && Intrinsics.d(this.f50008e, filteroptionParcelable.f50008e) && Intrinsics.d(this.f50009f, filteroptionParcelable.f50009f) && Intrinsics.d(this.f50010g, filteroptionParcelable.f50010g);
    }

    public final int hashCode() {
        int hashCode = this.f50004a.hashCode() * 31;
        String str = this.f50005b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        OnebarmoduleactionParcelable onebarmoduleactionParcelable = this.f50006c;
        int hashCode3 = (hashCode2 + (onebarmoduleactionParcelable == null ? 0 : onebarmoduleactionParcelable.hashCode())) * 31;
        Boolean bool = this.f50007d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        OnebarmoduledisplayParcelable onebarmoduledisplayParcelable = this.f50008e;
        int hashCode5 = (hashCode4 + (onebarmoduledisplayParcelable == null ? 0 : onebarmoduledisplayParcelable.hashCode())) * 31;
        Boolean bool2 = this.f50009f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f50010g;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilteroptionParcelable(uid=");
        sb3.append(this.f50004a);
        sb3.append(", nodeId=");
        sb3.append(this.f50005b);
        sb3.append(", action=");
        sb3.append(this.f50006c);
        sb3.append(", disabled=");
        sb3.append(this.f50007d);
        sb3.append(", display=");
        sb3.append(this.f50008e);
        sb3.append(", isSelected=");
        sb3.append(this.f50009f);
        sb3.append(", type=");
        return a.p(sb3, this.f50010g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50004a);
        parcel.writeString(this.f50005b);
        parcel.writeParcelable(this.f50006c, i13);
        parcel.writeValue(this.f50007d);
        parcel.writeParcelable(this.f50008e, i13);
        parcel.writeValue(this.f50009f);
        parcel.writeString(this.f50010g);
    }
}
