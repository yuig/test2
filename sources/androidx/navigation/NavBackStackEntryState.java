package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.r;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z9.k;
import z9.z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "g4/u", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class NavBackStackEntryState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f19146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19147b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f19148c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f19149d;

    public NavBackStackEntryState(k entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f19146a = entry.f141215f;
        this.f19147b = entry.f141211b.f141329h;
        this.f19148c = entry.a();
        Bundle outBundle = new Bundle();
        this.f19149d = outBundle;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        entry.f141218i.c(outBundle);
    }

    public final k a(Context context, z destination, r hostLifecycleState, z9.r rVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f19148c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        String id3 = this.f19146a;
        Intrinsics.checkNotNullParameter(id3, "id");
        return new k(context, destination, bundle2, hostLifecycleState, rVar, id3, this.f19149d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f19146a);
        parcel.writeInt(this.f19147b);
        parcel.writeBundle(this.f19148c);
        parcel.writeBundle(this.f19149d);
    }

    public NavBackStackEntryState(Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String readString = inParcel.readString();
        Intrinsics.f(readString);
        this.f19146a = readString;
        this.f19147b = inParcel.readInt();
        this.f19148c = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Intrinsics.f(readBundle);
        this.f19149d = readBundle;
    }
}
