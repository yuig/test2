package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import wa.b;
import wa.c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final c f19860a;

    public ParcelImpl(Parcel parcel) {
        this.f19860a = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        new b(parcel).k(this.f19860a);
    }
}
