package com.pinterest.reportFlow.feature.rvc.model;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p02.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/reportFlow/feature/rvc/model/LinkedBA;", "Landroid/os/Parcelable;", "CREATOR", "p02/c", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class LinkedBA implements Parcelable {

    @NotNull
    public static final c CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final String f50426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50427b;

    public LinkedBA(String str, String str2) {
        this.f50426a = str;
        this.f50427b = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getF50426a() {
        return this.f50426a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedBA)) {
            return false;
        }
        LinkedBA linkedBA = (LinkedBA) obj;
        return Intrinsics.d(this.f50426a, linkedBA.f50426a) && Intrinsics.d(this.f50427b, linkedBA.f50427b);
    }

    public final int hashCode() {
        String str = this.f50426a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f50427b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LinkedBA(fullName=");
        sb3.append(this.f50426a);
        sb3.append(", id=");
        return a.p(sb3, this.f50427b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50426a);
        parcel.writeString(this.f50427b);
    }
}
