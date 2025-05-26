package wv1;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduledisplayParcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Intrinsics.f(readString);
        String readString2 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        String readString3 = parcel.readString();
        Object readValue = parcel.readValue(Integer.TYPE.getClassLoader());
        Integer num = readValue instanceof Integer ? (Integer) readValue : null;
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        Object readValue2 = parcel.readValue(Boolean.TYPE.getClassLoader());
        return new OnebarmoduledisplayParcelable(readString, readString2, createStringArrayList, readString3, num, readString4, readString5, createStringArrayList2, readValue2 instanceof Boolean ? (Boolean) readValue2 : null, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new OnebarmoduledisplayParcelable[i13];
    }
}
