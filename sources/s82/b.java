package s82;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.stubs.StubScreenLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new StubScreenLocation();
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new StubScreenLocation[i13];
    }
}
