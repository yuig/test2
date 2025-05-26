package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/CameraEffectTextures;", "Lcom/facebook/share/model/ShareModel;", "pf/b", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class CameraEffectTextures implements ShareModel {

    @NotNull
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new a(18);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f30104a;

    public CameraEffectTextures(b bVar) {
        this.f30104a = bVar.f100003a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeBundle(this.f30104a);
    }

    public CameraEffectTextures(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30104a = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
