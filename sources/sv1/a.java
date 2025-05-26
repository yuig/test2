package sv1;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.oneBarLibrary.modals.model.BodyTypeFilterBottomSheetModel;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Intrinsics.f(readString);
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Intrinsics.f(readString3);
        ArrayList createTypedArrayList = parcel.createTypedArrayList(OnebarmoduleParcelable.CREATOR);
        Intrinsics.f(createTypedArrayList);
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        Object readValue = parcel.readValue(Map.class.getClassLoader());
        Intrinsics.g(readValue, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map = (Map) readValue;
        String readString6 = parcel.readString();
        Intrinsics.f(readString6);
        Object readValue2 = parcel.readValue(Map.class.getClassLoader());
        return new BodyTypeFilterBottomSheetModel(readString, readString2, readString3, createTypedArrayList, readString4, readString5, map, readString6, readValue2 instanceof List ? (List) readValue2 : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new BodyTypeFilterBottomSheetModel[i13];
    }
}
