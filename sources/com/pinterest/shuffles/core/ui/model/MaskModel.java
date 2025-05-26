package com.pinterest.shuffles.core.ui.model;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r72.g2;
import r72.i1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/shuffles/core/ui/model/MaskModel;", "Landroid/os/Parcelable;", "org/chromium/net/y", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MaskModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MaskModel> CREATOR = new com.pinterest.feature.todaytab.a(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f51940a;

    /* renamed from: b, reason: collision with root package name */
    public final BitmapMaskModel f51941b;

    public MaskModel(String str, BitmapMaskModel bitmapMaskModel) {
        this.f51940a = str;
        this.f51941b = bitmapMaskModel;
    }

    public final i1 a() {
        String value = this.f51940a;
        if (value != null) {
            int i13 = g2.f106487b;
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        BitmapMaskModel bitmapMaskModel = this.f51941b;
        return new i1(value, bitmapMaskModel != null ? bitmapMaskModel.a() : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskModel)) {
            return false;
        }
        MaskModel maskModel = (MaskModel) obj;
        return Intrinsics.d(this.f51940a, maskModel.f51940a) && Intrinsics.d(this.f51941b, maskModel.f51941b);
    }

    public final int hashCode() {
        String str = this.f51940a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BitmapMaskModel bitmapMaskModel = this.f51941b;
        return hashCode + (bitmapMaskModel != null ? bitmapMaskModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o13 = cb.o("MaskModel(svgMask=", r.l1(this.f51940a), ", bitmapMaskModel=");
        o13.append(this.f51941b);
        o13.append(")");
        return o13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f51940a);
        BitmapMaskModel bitmapMaskModel = this.f51941b;
        if (bitmapMaskModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bitmapMaskModel.writeToParcel(out, i13);
        }
    }
}
