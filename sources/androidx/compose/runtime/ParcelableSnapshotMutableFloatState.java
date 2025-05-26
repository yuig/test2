package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b3;
import i2.c3;
import i2.u1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s2.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Li2/c3;", "Landroid/os/Parcelable;", "bk/f", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableFloatState extends c3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new u1(0);

    public ParcelableSnapshotMutableFloatState(float f13) {
        b3 b3Var = new b3(f13);
        if (p.f110666a.a() != null) {
            b3 b3Var2 = new b3(f13);
            b3Var2.f110604a = 1;
            b3Var.f110605b = b3Var2;
        }
        this.f71086b = b3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeFloat(h());
    }
}
