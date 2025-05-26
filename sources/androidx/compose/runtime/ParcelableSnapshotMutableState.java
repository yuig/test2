package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import i2.i3;
import i2.j3;
import i2.p2;
import i2.r1;
import i2.v1;
import i2.y3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Li2/i3;", "Landroid/os/Parcelable;", "am/d", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends i3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new v1();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int i14;
        parcel.writeValue(getValue());
        r1 r1Var = r1.f71258a;
        j3 j3Var = this.f71130b;
        if (Intrinsics.d(j3Var, r1Var)) {
            i14 = 0;
        } else if (Intrinsics.d(j3Var, y3.f71400a)) {
            i14 = 1;
        } else {
            if (!Intrinsics.d(j3Var, p2.f71234a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i14 = 2;
        }
        parcel.writeInt(i14);
    }
}
