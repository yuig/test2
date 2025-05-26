package wv1;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleactionParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduledisplayParcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Intrinsics.f(readString);
        String readString2 = parcel.readString();
        OnebarmoduleactionParcelable onebarmoduleactionParcelable = (OnebarmoduleactionParcelable) parcel.readParcelable(OnebarmoduleactionParcelable.class.getClassLoader());
        Class cls = Integer.TYPE;
        Object readValue = parcel.readValue(cls.getClassLoader());
        Integer num = readValue instanceof Integer ? (Integer) readValue : null;
        Object readValue2 = parcel.readValue(Map.class.getClassLoader());
        Map map = readValue2 instanceof Map ? (Map) readValue2 : null;
        OnebarmoduledisplayParcelable onebarmoduledisplayParcelable = (OnebarmoduledisplayParcelable) parcel.readParcelable(OnebarmoduledisplayParcelable.class.getClassLoader());
        Object readValue3 = parcel.readValue(cls.getClassLoader());
        return new OnebarmoduleParcelable(readString, readString2, onebarmoduleactionParcelable, num, map, onebarmoduledisplayParcelable, readValue3 instanceof Integer ? (Integer) readValue3 : null, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new OnebarmoduleParcelable[i13];
    }
}
