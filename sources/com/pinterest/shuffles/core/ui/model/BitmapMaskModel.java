package com.pinterest.shuffles.core.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r72.j1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/shuffles/core/ui/model/BitmapMaskModel;", "Landroid/os/Parcelable;", "org/chromium/net/y", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class BitmapMaskModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BitmapMaskModel> CREATOR = new com.pinterest.feature.todaytab.a(23);

    /* renamed from: a, reason: collision with root package name */
    public final float f51922a;

    /* renamed from: b, reason: collision with root package name */
    public final float f51923b;

    /* renamed from: c, reason: collision with root package name */
    public final float f51924c;

    /* renamed from: d, reason: collision with root package name */
    public final float f51925d;

    /* renamed from: e, reason: collision with root package name */
    public final String f51926e;

    public BitmapMaskModel(float f13, float f14, float f15, float f16, String base64Mask) {
        Intrinsics.checkNotNullParameter(base64Mask, "base64Mask");
        this.f51922a = f13;
        this.f51923b = f14;
        this.f51924c = f15;
        this.f51925d = f16;
        this.f51926e = base64Mask;
    }

    public final r72.a a() {
        j1 j1Var = new j1(this.f51922a, this.f51923b, this.f51924c, this.f51925d);
        String value = this.f51926e;
        Intrinsics.checkNotNullParameter(value, "value");
        return new r72.a(j1Var, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapMaskModel)) {
            return false;
        }
        BitmapMaskModel bitmapMaskModel = (BitmapMaskModel) obj;
        return Float.compare(this.f51922a, bitmapMaskModel.f51922a) == 0 && Float.compare(this.f51923b, bitmapMaskModel.f51923b) == 0 && Float.compare(this.f51924c, bitmapMaskModel.f51924c) == 0 && Float.compare(this.f51925d, bitmapMaskModel.f51925d) == 0 && Intrinsics.d(this.f51926e, bitmapMaskModel.f51926e);
    }

    public final int hashCode() {
        return this.f51926e.hashCode() + a.a.a(this.f51925d, a.a.a(this.f51924c, a.a.a(this.f51923b, Float.hashCode(this.f51922a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "BitmapMaskModel(left=" + this.f51922a + ", top=" + this.f51923b + ", width=" + this.f51924c + ", height=" + this.f51925d + ", base64Mask='" + r.l1(this.f51926e) + "')";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeFloat(this.f51922a);
        out.writeFloat(this.f51923b);
        out.writeFloat(this.f51924c);
        out.writeFloat(this.f51925d);
        out.writeString(this.f51926e);
    }
}
