package com.pinterest.shuffles.core.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/shuffles/core/ui/model/CutoutModel;", "Landroid/os/Parcelable;", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class CutoutModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CutoutModel> CREATOR = new com.pinterest.feature.todaytab.a(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f51930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51931b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51932c;

    /* renamed from: d, reason: collision with root package name */
    public final String f51933d;

    /* renamed from: e, reason: collision with root package name */
    public final String f51934e;

    /* renamed from: f, reason: collision with root package name */
    public final String f51935f;

    /* renamed from: g, reason: collision with root package name */
    public final MaskModel f51936g;

    /* renamed from: h, reason: collision with root package name */
    public final String f51937h;

    /* renamed from: i, reason: collision with root package name */
    public final String f51938i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f51939j;

    public CutoutModel(String imageUrl, int i13, int i14, String str, String str2, String str3, MaskModel maskModel, String str4, String str5, boolean z13) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(maskModel, "maskModel");
        this.f51930a = imageUrl;
        this.f51931b = i13;
        this.f51932c = i14;
        this.f51933d = str;
        this.f51934e = str2;
        this.f51935f = str3;
        this.f51936g = maskModel;
        this.f51937h = str4;
        this.f51938i = str5;
        this.f51939j = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutoutModel)) {
            return false;
        }
        CutoutModel cutoutModel = (CutoutModel) obj;
        return Intrinsics.d(this.f51930a, cutoutModel.f51930a) && this.f51931b == cutoutModel.f51931b && this.f51932c == cutoutModel.f51932c && Intrinsics.d(this.f51933d, cutoutModel.f51933d) && Intrinsics.d(this.f51934e, cutoutModel.f51934e) && Intrinsics.d(this.f51935f, cutoutModel.f51935f) && Intrinsics.d(this.f51936g, cutoutModel.f51936g) && Intrinsics.d(this.f51937h, cutoutModel.f51937h) && Intrinsics.d(this.f51938i, cutoutModel.f51938i) && this.f51939j == cutoutModel.f51939j;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f51932c, ep.b.b(this.f51931b, this.f51930a.hashCode() * 31, 31), 31);
        String str = this.f51933d;
        int hashCode = (b13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51934e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51935f;
        int hashCode3 = (this.f51936g.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f51937h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f51938i;
        return Boolean.hashCode(this.f51939j) + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CutoutModel(imageUrl=");
        sb3.append(this.f51930a);
        sb3.append(", width=");
        sb3.append(this.f51931b);
        sb3.append(", height=");
        sb3.append(this.f51932c);
        sb3.append(", shuffleItemId=");
        sb3.append(this.f51933d);
        sb3.append(", imageId=");
        sb3.append(this.f51934e);
        sb3.append(", pinId=");
        sb3.append(this.f51935f);
        sb3.append(", maskModel=");
        sb3.append(this.f51936g);
        sb3.append(", shuffleCutoutId=");
        sb3.append(this.f51937h);
        sb3.append(", userId=");
        sb3.append(this.f51938i);
        sb3.append(", isFavoritedByMe=");
        return a.a.r(sb3, this.f51939j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f51930a);
        out.writeInt(this.f51931b);
        out.writeInt(this.f51932c);
        out.writeString(this.f51933d);
        out.writeString(this.f51934e);
        out.writeString(this.f51935f);
        this.f51936g.writeToParcel(out, i13);
        out.writeString(this.f51937h);
        out.writeString(this.f51938i);
        out.writeInt(this.f51939j ? 1 : 0);
    }

    public /* synthetic */ CutoutModel(String str, int i13, int i14, String str2, String str3, String str4, MaskModel maskModel) {
        this(str, i13, i14, str2, str3, str4, maskModel, null, null, false);
    }
}
