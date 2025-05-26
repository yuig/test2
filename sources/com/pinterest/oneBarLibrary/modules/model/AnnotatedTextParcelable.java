package com.pinterest.oneBarLibrary.modules.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wv1.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/oneBarLibrary/modules/model/AnnotatedTextParcelable;", "Landroid/os/Parcelable;", "CREATOR", "wv1/a", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class AnnotatedTextParcelable implements Parcelable {

    @NotNull
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f50000a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50001b;

    /* renamed from: c, reason: collision with root package name */
    public final List f50002c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50003d;

    public AnnotatedTextParcelable(String uid, String str, String str2, List list) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f50000a = uid;
        this.f50001b = str;
        this.f50002c = list;
        this.f50003d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedTextParcelable)) {
            return false;
        }
        AnnotatedTextParcelable annotatedTextParcelable = (AnnotatedTextParcelable) obj;
        return Intrinsics.d(this.f50000a, annotatedTextParcelable.f50000a) && Intrinsics.d(this.f50001b, annotatedTextParcelable.f50001b) && Intrinsics.d(this.f50002c, annotatedTextParcelable.f50002c) && Intrinsics.d(this.f50003d, annotatedTextParcelable.f50003d);
    }

    public final int hashCode() {
        int hashCode = this.f50000a.hashCode() * 31;
        String str = this.f50001b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f50002c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f50003d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AnnotatedTextParcelable(uid=");
        sb3.append(this.f50000a);
        sb3.append(", nodeId=");
        sb3.append(this.f50001b);
        sb3.append(", args=");
        sb3.append(this.f50002c);
        sb3.append(", format=");
        return a.a.p(sb3, this.f50003d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50000a);
        parcel.writeString(this.f50001b);
        List list = this.f50002c;
        if (list != null) {
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeValue((Map) it.next());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f50003d);
    }
}
