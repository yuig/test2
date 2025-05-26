package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.education.user.signals.UserSignalFields;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return UserSignalFields.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new UserSignalFields[i13];
    }
}
