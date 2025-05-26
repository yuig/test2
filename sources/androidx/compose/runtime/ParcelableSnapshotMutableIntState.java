package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import i2.d3;
import i2.e3;
import i2.u1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s2.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Li2/e3;", "Landroid/os/Parcelable;", "am/d", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableIntState extends e3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new u1(1);

    public ParcelableSnapshotMutableIntState(int i13) {
        d3 d3Var = new d3(i13);
        if (p.f110666a.a() != null) {
            d3 d3Var2 = new d3(i13);
            d3Var2.f110604a = 1;
            d3Var.f110605b = d3Var2;
        }
        this.f71105b = d3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(h());
    }
}
