package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class DynamicFeed implements Parcelable, dl1.s {
    public static final Parcelable.Creator<DynamicFeed> CREATOR = new ph();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f35553a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f35554b;

    /* renamed from: c, reason: collision with root package name */
    public String f35555c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35556d;

    public DynamicFeed(Parcel parcel) {
        if (parcel == null) {
            return;
        }
        this.f35556d = parcel.readString();
        this.f35555c = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f35554b = arrayList;
        parcel.readStringList(arrayList);
    }

    public final List a() {
        ArrayList arrayList = this.f35553a;
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    @Override // dl1.s
    public final String b() {
        return String.valueOf(hashCode());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DynamicFeed {");
        List a13 = a();
        int size = a13.size();
        for (int i13 = 0; i13 < size; i13++) {
            dl1.s sVar = (dl1.s) a13.get(i13);
            sb3.append(sVar.getClass().getSimpleName());
            sb3.append(":");
            sb3.append(sVar.b());
            if (i13 < size - 1) {
                sb3.append(", ");
            }
        }
        sb3.append("}");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        String str = this.f35556d;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        String str2 = this.f35555c;
        parcel.writeString(str2 != null ? str2 : "");
        List<String> list = this.f35554b;
        if (list == null) {
            list = Collections.emptyList();
        }
        parcel.writeStringList(list);
    }

    public DynamicFeed(String str, String str2, @NonNull List<dl1.s> list, @NonNull List<String> list2) {
        this.f35555c = str;
        this.f35556d = str2;
        this.f35553a = new ArrayList(list);
        this.f35554b = new ArrayList(list2);
    }
}
