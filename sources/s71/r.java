package s71;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.search.visual.PinchToZoomTransitionContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Intrinsics.f(readString);
        return new PinchToZoomTransitionContext(readString, parcel.readString(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readByte() == 1, Float.valueOf(parcel.readFloat()), Float.valueOf(parcel.readFloat()), parcel.readByte() == 1, parcel.readByte() == 1, parcel.readByte() == 1, parcel.readByte() == 1, parcel.readByte() == 1, false, 16384);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new PinchToZoomTransitionContext[i13];
    }
}
