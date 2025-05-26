package com.pinterest.oneBarLibrary.modals.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sv1.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/oneBarLibrary/modals/model/BodyTypeFilterBottomSheetModel;", "Landroid/os/Parcelable;", "CREATOR", "sv1/a", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyTypeFilterBottomSheetModel implements Parcelable {

    @NotNull
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f49987a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49988b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49989c;

    /* renamed from: d, reason: collision with root package name */
    public final List f49990d;

    /* renamed from: e, reason: collision with root package name */
    public final String f49991e;

    /* renamed from: f, reason: collision with root package name */
    public final String f49992f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f49993g;

    /* renamed from: h, reason: collision with root package name */
    public final String f49994h;

    /* renamed from: i, reason: collision with root package name */
    public final List f49995i;

    public BodyTypeFilterBottomSheetModel(String titleText, String str, String educationActionString, ArrayList filteroptions, String str2, String str3, Map bodyTypeAuxData, String query, List list) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(educationActionString, "educationActionString");
        Intrinsics.checkNotNullParameter(filteroptions, "filteroptions");
        Intrinsics.checkNotNullParameter(bodyTypeAuxData, "bodyTypeAuxData");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f49987a = titleText;
        this.f49988b = str;
        this.f49989c = educationActionString;
        this.f49990d = filteroptions;
        this.f49991e = str2;
        this.f49992f = str3;
        this.f49993g = bodyTypeAuxData;
        this.f49994h = query;
        this.f49995i = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f49987a);
        parcel.writeString(this.f49988b);
        parcel.writeString(this.f49989c);
        parcel.writeTypedList(this.f49990d);
        parcel.writeString(this.f49991e);
        parcel.writeString(this.f49992f);
        parcel.writeValue(this.f49993g);
        parcel.writeString(this.f49994h);
        parcel.writeList(this.f49995i);
    }
}
