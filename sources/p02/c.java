package p02;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.reportFlow.feature.rvc.model.LinkedBA;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new LinkedBA(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new LinkedBA[i13];
    }
}
