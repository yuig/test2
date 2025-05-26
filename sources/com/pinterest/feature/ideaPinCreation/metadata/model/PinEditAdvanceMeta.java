package com.pinterest.feature.ideaPinCreation.metadata.model;

import a.a;
import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import aq.e;
import cv0.a0;
import ep.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/metadata/model/PinEditAdvanceMeta;", "Landroid/os/Parcelable;", "CREATOR", "cv0/a0", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class PinEditAdvanceMeta implements Parcelable {

    @NotNull
    public static final a0 CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final e f46535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46536b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46537c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46538d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f46539e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f46540f;

    /* renamed from: g, reason: collision with root package name */
    public String f46541g;

    /* renamed from: h, reason: collision with root package name */
    public String f46542h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f46543i;

    public PinEditAdvanceMeta(e editablePinType, String str, boolean z13, boolean z14, boolean z15, boolean z16, String altText, String str2, boolean z17) {
        Intrinsics.checkNotNullParameter(editablePinType, "editablePinType");
        Intrinsics.checkNotNullParameter(altText, "altText");
        this.f46535a = editablePinType;
        this.f46536b = str;
        this.f46537c = z13;
        this.f46538d = z14;
        this.f46539e = z15;
        this.f46540f = z16;
        this.f46541g = altText;
        this.f46542h = str2;
        this.f46543i = z17;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinEditAdvanceMeta)) {
            return false;
        }
        PinEditAdvanceMeta pinEditAdvanceMeta = (PinEditAdvanceMeta) obj;
        return this.f46535a == pinEditAdvanceMeta.f46535a && Intrinsics.d(this.f46536b, pinEditAdvanceMeta.f46536b) && this.f46537c == pinEditAdvanceMeta.f46537c && this.f46538d == pinEditAdvanceMeta.f46538d && this.f46539e == pinEditAdvanceMeta.f46539e && this.f46540f == pinEditAdvanceMeta.f46540f && Intrinsics.d(this.f46541g, pinEditAdvanceMeta.f46541g) && Intrinsics.d(this.f46542h, pinEditAdvanceMeta.f46542h) && this.f46543i == pinEditAdvanceMeta.f46543i;
    }

    public final int hashCode() {
        int hashCode = this.f46535a.hashCode() * 31;
        String str = this.f46536b;
        int d2 = cb.d(this.f46541g, b.e(this.f46540f, b.e(this.f46539e, b.e(this.f46538d, b.e(this.f46537c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str2 = this.f46542h;
        return Boolean.hashCode(this.f46543i) + ((d2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        boolean z13 = this.f46537c;
        boolean z14 = this.f46538d;
        String str = this.f46541g;
        String str2 = this.f46542h;
        StringBuilder sb3 = new StringBuilder("PinEditAdvanceMeta(editablePinType=");
        sb3.append(this.f46535a);
        sb3.append(", createdId=");
        sb3.append(this.f46536b);
        sb3.append(", isCommentEnabled=");
        sb3.append(z13);
        sb3.append(", isShoppingRecEnabledByUser=");
        sb3.append(z14);
        sb3.append(", hasTaggedProducts=");
        sb3.append(this.f46539e);
        sb3.append(", isIdeaPin=");
        sb3.append(this.f46540f);
        sb3.append(", altText=");
        sb3.append(str);
        sb3.append(", sponsorId=");
        sb3.append(str2);
        sb3.append(", isSponsorable=");
        return a.r(sb3, this.f46543i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f46535a.name());
        parcel.writeString(this.f46536b);
        parcel.writeByte(this.f46537c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46538d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46539e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46540f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f46541g);
        parcel.writeString(this.f46542h);
        parcel.writeByte(this.f46543i ? (byte) 1 : (byte) 0);
    }
}
