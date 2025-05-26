package wv1;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.oneBarLibrary.modules.model.FilteroptionParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleactionParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduledisplayParcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Intrinsics.f(readString);
        String readString2 = parcel.readString();
        OnebarmoduleactionParcelable onebarmoduleactionParcelable = (OnebarmoduleactionParcelable) parcel.readParcelable(OnebarmoduleactionParcelable.class.getClassLoader());
        Class cls = Boolean.TYPE;
        Object readValue = parcel.readValue(cls.getClassLoader());
        Boolean bool = readValue instanceof Boolean ? (Boolean) readValue : null;
        OnebarmoduledisplayParcelable onebarmoduledisplayParcelable = (OnebarmoduledisplayParcelable) parcel.readParcelable(OnebarmoduledisplayParcelable.class.getClassLoader());
        Object readValue2 = parcel.readValue(cls.getClassLoader());
        return new FilteroptionParcelable(readString, readString2, onebarmoduleactionParcelable, bool, onebarmoduledisplayParcelable, readValue2 instanceof Boolean ? (Boolean) readValue2 : null, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new FilteroptionParcelable[i13];
    }
}
