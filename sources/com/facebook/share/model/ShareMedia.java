package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareMedia;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pf.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002\u0002\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/ShareMedia;", "M", "Lpf/e;", "B", "Lcom/facebook/share/model/ShareModel;", "pf/f", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends e> implements ShareModel {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f30125a;

    public ShareMedia(e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f30125a = new Bundle(builder.f100004a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeBundle(this.f30125a);
    }

    public ShareMedia(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f30125a = readBundle == null ? new Bundle() : readBundle;
    }
}
