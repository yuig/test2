package com.pinterest.oneBarLibrary.modules.model;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wv1.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/oneBarLibrary/modules/model/OnebarmoduleactionParcelable;", "Landroid/os/Parcelable;", "CREATOR", "wv1/d", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class OnebarmoduleactionParcelable implements Parcelable {

    @NotNull
    public static final d CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final String f50020a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50021b;

    /* renamed from: c, reason: collision with root package name */
    public final AnnotatedTextParcelable f50022c;

    /* renamed from: d, reason: collision with root package name */
    public final List f50023d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50024e;

    /* renamed from: f, reason: collision with root package name */
    public final List f50025f;

    /* renamed from: g, reason: collision with root package name */
    public final List f50026g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f50027h;

    /* renamed from: i, reason: collision with root package name */
    public final List f50028i;

    /* renamed from: j, reason: collision with root package name */
    public final String f50029j;

    /* renamed from: k, reason: collision with root package name */
    public final String f50030k;

    /* renamed from: l, reason: collision with root package name */
    public final String f50031l;

    public OnebarmoduleactionParcelable(String uid, String str, AnnotatedTextParcelable annotatedTextParcelable, ArrayList arrayList, String str2, List list, ArrayList arrayList2, Map map, List list2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f50020a = uid;
        this.f50021b = str;
        this.f50022c = annotatedTextParcelable;
        this.f50023d = arrayList;
        this.f50024e = str2;
        this.f50025f = list;
        this.f50026g = arrayList2;
        this.f50027h = map;
        this.f50028i = list2;
        this.f50029j = str3;
        this.f50030k = str4;
        this.f50031l = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnebarmoduleactionParcelable)) {
            return false;
        }
        OnebarmoduleactionParcelable onebarmoduleactionParcelable = (OnebarmoduleactionParcelable) obj;
        return Intrinsics.d(this.f50020a, onebarmoduleactionParcelable.f50020a) && Intrinsics.d(this.f50021b, onebarmoduleactionParcelable.f50021b) && Intrinsics.d(this.f50022c, onebarmoduleactionParcelable.f50022c) && Intrinsics.d(this.f50023d, onebarmoduleactionParcelable.f50023d) && Intrinsics.d(this.f50024e, onebarmoduleactionParcelable.f50024e) && Intrinsics.d(this.f50025f, onebarmoduleactionParcelable.f50025f) && Intrinsics.d(this.f50026g, onebarmoduleactionParcelable.f50026g) && Intrinsics.d(this.f50027h, onebarmoduleactionParcelable.f50027h) && Intrinsics.d(this.f50028i, onebarmoduleactionParcelable.f50028i) && Intrinsics.d(this.f50029j, onebarmoduleactionParcelable.f50029j) && Intrinsics.d(this.f50030k, onebarmoduleactionParcelable.f50030k) && Intrinsics.d(this.f50031l, onebarmoduleactionParcelable.f50031l);
    }

    public final int hashCode() {
        int hashCode = this.f50020a.hashCode() * 31;
        String str = this.f50021b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnnotatedTextParcelable annotatedTextParcelable = this.f50022c;
        int hashCode3 = (hashCode2 + (annotatedTextParcelable == null ? 0 : annotatedTextParcelable.hashCode())) * 31;
        List list = this.f50023d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f50024e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.f50025f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f50026g;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map map = this.f50027h;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        List list4 = this.f50028i;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str3 = this.f50029j;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50030k;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50031l;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnebarmoduleactionParcelable(uid=");
        sb3.append(this.f50020a);
        sb3.append(", nodeId=");
        sb3.append(this.f50021b);
        sb3.append(", annotatedTitle=");
        sb3.append(this.f50022c);
        sb3.append(", contents=");
        sb3.append(this.f50023d);
        sb3.append(", feedURL=");
        sb3.append(this.f50024e);
        sb3.append(", filterKeys=");
        sb3.append(this.f50025f);
        sb3.append(", filters=");
        sb3.append(this.f50026g);
        sb3.append(", requestParams=");
        sb3.append(this.f50027h);
        sb3.append(", searchParameters=");
        sb3.append(this.f50028i);
        sb3.append(", searchQuery=");
        sb3.append(this.f50029j);
        sb3.append(", title=");
        sb3.append(this.f50030k);
        sb3.append(", type=");
        return a.p(sb3, this.f50031l, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50020a);
        parcel.writeString(this.f50021b);
        parcel.writeParcelable(this.f50022c, i13);
        parcel.writeTypedList(this.f50023d);
        parcel.writeString(this.f50024e);
        parcel.writeStringList(this.f50025f);
        parcel.writeTypedList(this.f50026g);
        parcel.writeValue(this.f50027h);
        parcel.writeStringList(this.f50028i);
        parcel.writeString(this.f50029j);
        parcel.writeString(this.f50030k);
        parcel.writeString(this.f50031l);
    }
}
