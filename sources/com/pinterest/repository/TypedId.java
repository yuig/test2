package com.pinterest.repository;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.api.model.qw;
import com.pinterest.feature.todaytab.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/repository/TypedId;", "Landroid/os/Parcelable;", "gi2/b", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class TypedId implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TypedId> CREATOR = new a(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f50451a;

    /* renamed from: b, reason: collision with root package name */
    public final qw f50452b;

    public TypedId(String uid, qw type) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f50451a = uid;
        this.f50452b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypedId)) {
            return false;
        }
        TypedId typedId = (TypedId) obj;
        return Intrinsics.d(this.f50451a, typedId.f50451a) && this.f50452b == typedId.f50452b;
    }

    public final int hashCode() {
        return this.f50452b.hashCode() + (this.f50451a.hashCode() * 31);
    }

    public final String toString() {
        return "TypedId(uid=" + this.f50451a + ", type=" + this.f50452b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50451a);
        dest.writeInt(this.f50452b.ordinal());
    }
}
