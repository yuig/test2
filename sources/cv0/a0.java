package cv0;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Intrinsics.f(readString);
        aq.e valueOf = aq.e.valueOf(readString);
        String readString2 = parcel.readString();
        boolean z13 = parcel.readByte() != 0;
        boolean z14 = parcel.readByte() != 0;
        boolean z15 = parcel.readByte() != 0;
        boolean z16 = parcel.readByte() != 0;
        String readString3 = parcel.readString();
        Intrinsics.f(readString3);
        return new PinEditAdvanceMeta(valueOf, readString2, z13, z14, z15, z16, readString3, parcel.readString(), parcel.readByte() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new PinEditAdvanceMeta[i13];
    }
}
