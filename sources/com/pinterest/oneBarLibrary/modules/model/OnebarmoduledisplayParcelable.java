package com.pinterest.oneBarLibrary.modules.model;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wv1.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/oneBarLibrary/modules/model/OnebarmoduledisplayParcelable;", "Landroid/os/Parcelable;", "CREATOR", "wv1/e", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class OnebarmoduledisplayParcelable implements Parcelable {

    @NotNull
    public static final e CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final String f50032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50033b;

    /* renamed from: c, reason: collision with root package name */
    public final List f50034c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50035d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f50036e;

    /* renamed from: f, reason: collision with root package name */
    public final String f50037f;

    /* renamed from: g, reason: collision with root package name */
    public final String f50038g;

    /* renamed from: h, reason: collision with root package name */
    public final List f50039h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f50040i;

    /* renamed from: j, reason: collision with root package name */
    public final List f50041j;

    /* renamed from: k, reason: collision with root package name */
    public final List f50042k;

    /* renamed from: l, reason: collision with root package name */
    public final String f50043l;

    /* renamed from: m, reason: collision with root package name */
    public final String f50044m;

    public OnebarmoduledisplayParcelable(String uid, String str, List list, String str2, Integer num, String str3, String str4, List list2, Boolean bool, List list3, List list4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f50032a = uid;
        this.f50033b = str;
        this.f50034c = list;
        this.f50035d = str2;
        this.f50036e = num;
        this.f50037f = str3;
        this.f50038g = str4;
        this.f50039h = list2;
        this.f50040i = bool;
        this.f50041j = list3;
        this.f50042k = list4;
        this.f50043l = str5;
        this.f50044m = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnebarmoduledisplayParcelable)) {
            return false;
        }
        OnebarmoduledisplayParcelable onebarmoduledisplayParcelable = (OnebarmoduledisplayParcelable) obj;
        return Intrinsics.d(this.f50032a, onebarmoduledisplayParcelable.f50032a) && Intrinsics.d(this.f50033b, onebarmoduledisplayParcelable.f50033b) && Intrinsics.d(this.f50034c, onebarmoduledisplayParcelable.f50034c) && Intrinsics.d(this.f50035d, onebarmoduledisplayParcelable.f50035d) && Intrinsics.d(this.f50036e, onebarmoduledisplayParcelable.f50036e) && Intrinsics.d(this.f50037f, onebarmoduledisplayParcelable.f50037f) && Intrinsics.d(this.f50038g, onebarmoduledisplayParcelable.f50038g) && Intrinsics.d(this.f50039h, onebarmoduledisplayParcelable.f50039h) && Intrinsics.d(this.f50040i, onebarmoduledisplayParcelable.f50040i) && Intrinsics.d(this.f50041j, onebarmoduledisplayParcelable.f50041j) && Intrinsics.d(this.f50042k, onebarmoduledisplayParcelable.f50042k) && Intrinsics.d(this.f50043l, onebarmoduledisplayParcelable.f50043l) && Intrinsics.d(this.f50044m, onebarmoduledisplayParcelable.f50044m);
    }

    public final int hashCode() {
        int hashCode = this.f50032a.hashCode() * 31;
        String str = this.f50033b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f50034c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f50035d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f50036e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f50037f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50038g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list2 = this.f50039h;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f50040i;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list3 = this.f50041j;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f50042k;
        int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str5 = this.f50043l;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f50044m;
        return hashCode12 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnebarmoduledisplayParcelable(uid=");
        sb3.append(this.f50032a);
        sb3.append(", nodeId=");
        sb3.append(this.f50033b);
        sb3.append(", backgroundColorHex=");
        sb3.append(this.f50034c);
        sb3.append(", displayText=");
        sb3.append(this.f50035d);
        sb3.append(", icon=");
        sb3.append(this.f50036e);
        sb3.append(", iconURL=");
        sb3.append(this.f50037f);
        sb3.append(", imageMediumURL=");
        sb3.append(this.f50038g);
        sb3.append(", imageUrls=");
        sb3.append(this.f50039h);
        sb3.append(", isSelected=");
        sb3.append(this.f50040i);
        sb3.append(", selectedBackgroundColorHex=");
        sb3.append(this.f50041j);
        sb3.append(", textColorHex=");
        sb3.append(this.f50042k);
        sb3.append(", type=");
        sb3.append(this.f50043l);
        sb3.append(", altText=");
        return a.p(sb3, this.f50044m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50032a);
        parcel.writeString(this.f50033b);
        parcel.writeStringList(this.f50034c);
        parcel.writeString(this.f50035d);
        parcel.writeValue(this.f50036e);
        parcel.writeString(this.f50037f);
        parcel.writeString(this.f50038g);
        parcel.writeStringList(this.f50039h);
        parcel.writeValue(this.f50040i);
        parcel.writeStringList(this.f50041j);
        parcel.writeStringList(this.f50042k);
        parcel.writeString(this.f50043l);
        parcel.writeString(this.f50044m);
    }
}
