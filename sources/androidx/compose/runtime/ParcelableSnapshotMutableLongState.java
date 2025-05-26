package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import i2.f3;
import i2.g3;
import i2.u1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s2.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "Li2/g3;", "Landroid/os/Parcelable;", "bk/f", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableLongState extends g3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new u1(2);

    public ParcelableSnapshotMutableLongState(long j13) {
        f3 f3Var = new f3(j13);
        if (p.f110666a.a() != null) {
            f3 f3Var2 = new f3(j13);
            f3Var2.f110604a = 1;
            f3Var.f110605b = f3Var2;
        }
        this.f71120b = f3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(((f3) p.t(this.f71120b, this)).f71117c);
    }
}
