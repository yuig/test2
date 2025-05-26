package com.pinterest.reportFlow.feature.model;

import android.os.Parcel;
import android.os.Parcelable;
import ep.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m02.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/reportFlow/feature/model/ReportReasonData;", "Landroid/os/Parcelable;", "CREATOR", "m02/a", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class ReportReasonData implements Parcelable {

    @NotNull
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f50416a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50417b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50418c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50419d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50420e;

    /* renamed from: f, reason: collision with root package name */
    public final List f50421f;

    /* renamed from: g, reason: collision with root package name */
    public final String f50422g;

    /* renamed from: h, reason: collision with root package name */
    public final List f50423h;

    /* renamed from: i, reason: collision with root package name */
    public final String f50424i;

    /* renamed from: j, reason: collision with root package name */
    public final String f50425j;

    public ReportReasonData(String str, String str2, String str3, String str4, String str5, List detailPageRemovalExamples, String str6, List detailPageNonRemovalExamples, String str7, String str8) {
        Intrinsics.checkNotNullParameter(detailPageRemovalExamples, "detailPageRemovalExamples");
        Intrinsics.checkNotNullParameter(detailPageNonRemovalExamples, "detailPageNonRemovalExamples");
        this.f50416a = str;
        this.f50417b = str2;
        this.f50418c = str3;
        this.f50419d = str4;
        this.f50420e = str5;
        this.f50421f = detailPageRemovalExamples;
        this.f50422g = str6;
        this.f50423h = detailPageNonRemovalExamples;
        this.f50424i = str7;
        this.f50425j = str8;
    }

    /* renamed from: a, reason: from getter */
    public final String getF50419d() {
        return this.f50419d;
    }

    /* renamed from: b, reason: from getter */
    public final String getF50418c() {
        return this.f50418c;
    }

    /* renamed from: d, reason: from getter */
    public final String getF50422g() {
        return this.f50422g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final List getF50423h() {
        return this.f50423h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportReasonData)) {
            return false;
        }
        ReportReasonData reportReasonData = (ReportReasonData) obj;
        return Intrinsics.d(this.f50416a, reportReasonData.f50416a) && Intrinsics.d(this.f50417b, reportReasonData.f50417b) && Intrinsics.d(this.f50418c, reportReasonData.f50418c) && Intrinsics.d(this.f50419d, reportReasonData.f50419d) && Intrinsics.d(this.f50420e, reportReasonData.f50420e) && Intrinsics.d(this.f50421f, reportReasonData.f50421f) && Intrinsics.d(this.f50422g, reportReasonData.f50422g) && Intrinsics.d(this.f50423h, reportReasonData.f50423h) && Intrinsics.d(this.f50424i, reportReasonData.f50424i) && Intrinsics.d(this.f50425j, reportReasonData.f50425j);
    }

    /* renamed from: f, reason: from getter */
    public final String getF50420e() {
        return this.f50420e;
    }

    /* renamed from: g, reason: from getter */
    public final List getF50421f() {
        return this.f50421f;
    }

    public final int hashCode() {
        String str = this.f50416a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f50417b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50418c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50419d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50420e;
        int c13 = b.c(this.f50421f, (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.f50422g;
        int c14 = b.c(this.f50423h, (c13 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.f50424i;
        int hashCode5 = (c14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f50425j;
        return hashCode5 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReportReasonData(key=");
        sb3.append(this.f50416a);
        sb3.append(", primaryText=");
        sb3.append(this.f50417b);
        sb3.append(", detailPageHeaderText=");
        sb3.append(this.f50418c);
        sb3.append(", detailPageAdditionalText=");
        sb3.append(this.f50419d);
        sb3.append(", detailPageRemovalExampleHeader=");
        sb3.append(this.f50420e);
        sb3.append(", detailPageRemovalExamples=");
        sb3.append(this.f50421f);
        sb3.append(", detailPageNonRemovalExampleHeader=");
        sb3.append(this.f50422g);
        sb3.append(", detailPageNonRemovalExamples=");
        sb3.append(this.f50423h);
        sb3.append(", openWebURL=");
        sb3.append(this.f50424i);
        sb3.append(", sensitivityType=");
        return a.a.p(sb3, this.f50425j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50416a);
        parcel.writeString(this.f50417b);
        parcel.writeString(this.f50418c);
        parcel.writeString(this.f50419d);
        parcel.writeString(this.f50420e);
        parcel.writeStringList(this.f50421f);
        parcel.writeString(this.f50422g);
        parcel.writeStringList(this.f50423h);
        parcel.writeString(this.f50424i);
        parcel.writeString(this.f50425j);
    }
}
