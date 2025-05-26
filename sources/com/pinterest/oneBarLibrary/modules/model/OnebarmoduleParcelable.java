package com.pinterest.oneBarLibrary.modules.model;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wv1.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/oneBarLibrary/modules/model/OnebarmoduleParcelable;", "Landroid/os/Parcelable;", "CREATOR", "wv1/c", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class OnebarmoduleParcelable implements Parcelable {

    @NotNull
    public static final c CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final String f50011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50012b;

    /* renamed from: c, reason: collision with root package name */
    public final OnebarmoduleactionParcelable f50013c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f50014d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f50015e;

    /* renamed from: f, reason: collision with root package name */
    public final OnebarmoduledisplayParcelable f50016f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f50017g;

    /* renamed from: h, reason: collision with root package name */
    public final String f50018h;

    /* renamed from: i, reason: collision with root package name */
    public final String f50019i;

    public OnebarmoduleParcelable(String uid, String str, OnebarmoduleactionParcelable onebarmoduleactionParcelable, Integer num, Map map, OnebarmoduledisplayParcelable onebarmoduledisplayParcelable, Integer num2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f50011a = uid;
        this.f50012b = str;
        this.f50013c = onebarmoduleactionParcelable;
        this.f50014d = num;
        this.f50015e = map;
        this.f50016f = onebarmoduledisplayParcelable;
        this.f50017g = num2;
        this.f50018h = str2;
        this.f50019i = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnebarmoduleParcelable)) {
            return false;
        }
        OnebarmoduleParcelable onebarmoduleParcelable = (OnebarmoduleParcelable) obj;
        return Intrinsics.d(this.f50011a, onebarmoduleParcelable.f50011a) && Intrinsics.d(this.f50012b, onebarmoduleParcelable.f50012b) && Intrinsics.d(this.f50013c, onebarmoduleParcelable.f50013c) && Intrinsics.d(this.f50014d, onebarmoduleParcelable.f50014d) && Intrinsics.d(this.f50015e, onebarmoduleParcelable.f50015e) && Intrinsics.d(this.f50016f, onebarmoduleParcelable.f50016f) && Intrinsics.d(this.f50017g, onebarmoduleParcelable.f50017g) && Intrinsics.d(this.f50018h, onebarmoduleParcelable.f50018h) && Intrinsics.d(this.f50019i, onebarmoduleParcelable.f50019i);
    }

    public final int hashCode() {
        int hashCode = this.f50011a.hashCode() * 31;
        String str = this.f50012b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        OnebarmoduleactionParcelable onebarmoduleactionParcelable = this.f50013c;
        int hashCode3 = (hashCode2 + (onebarmoduleactionParcelable == null ? 0 : onebarmoduleactionParcelable.hashCode())) * 31;
        Integer num = this.f50014d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.f50015e;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        OnebarmoduledisplayParcelable onebarmoduledisplayParcelable = this.f50016f;
        int hashCode6 = (hashCode5 + (onebarmoduledisplayParcelable == null ? 0 : onebarmoduledisplayParcelable.hashCode())) * 31;
        Integer num2 = this.f50017g;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f50018h;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50019i;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnebarmoduleParcelable(uid=");
        sb3.append(this.f50011a);
        sb3.append(", nodeId=");
        sb3.append(this.f50012b);
        sb3.append(", action=");
        sb3.append(this.f50013c);
        sb3.append(", animation=");
        sb3.append(this.f50014d);
        sb3.append(", auxData=");
        sb3.append(this.f50015e);
        sb3.append(", display=");
        sb3.append(this.f50016f);
        sb3.append(", moduleType=");
        sb3.append(this.f50017g);
        sb3.append(", trackingParams=");
        sb3.append(this.f50018h);
        sb3.append(", type=");
        return a.p(sb3, this.f50019i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50011a);
        parcel.writeString(this.f50012b);
        parcel.writeParcelable(this.f50013c, i13);
        parcel.writeValue(this.f50014d);
        parcel.writeValue(this.f50015e);
        parcel.writeParcelable(this.f50016f, i13);
        parcel.writeValue(this.f50017g);
        parcel.writeString(this.f50018h);
        parcel.writeString(this.f50019i);
    }
}
