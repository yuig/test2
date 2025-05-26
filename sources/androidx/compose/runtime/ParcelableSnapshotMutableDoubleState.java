package androidx.compose.runtime;

import a.d;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import i2.a3;
import i2.z2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s2.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "Li2/a3;", "Landroid/os/Parcelable;", "jk/r", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableDoubleState extends a3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new d(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeDouble(((z2) p.t(this.f71074b, this)).f71425c);
    }
}
