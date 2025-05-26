package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType", "Landroid/os/Parcelable;", "RESOURCE", "com/bugsnag/android/a0", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class GraphRequest$ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GraphRequest$ParcelableResourceWithMimeType<?>> CREATOR = new a(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f29915a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f29916b;

    public GraphRequest$ParcelableResourceWithMimeType(Parcelable parcelable) {
        this.f29915a = "image/png";
        this.f29916b = parcelable;
    }

    /* renamed from: a, reason: from getter */
    public final String getF29915a() {
        return this.f29915a;
    }

    /* renamed from: b, reason: from getter */
    public final Parcelable getF29916b() {
        return this.f29916b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f29915a);
        out.writeParcelable(this.f29916b, i13);
    }

    public GraphRequest$ParcelableResourceWithMimeType(Parcel parcel) {
        this.f29915a = parcel.readString();
        this.f29916b = parcel.readParcelable(v.a().getClassLoader());
    }
}
