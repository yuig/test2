package wv1;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.oneBarLibrary.modules.model.AnnotatedTextParcelable;
import com.pinterest.oneBarLibrary.modules.model.FilteroptionParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleactionParcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Intrinsics.f(readString);
        return new OnebarmoduleactionParcelable(readString, parcel.readString(), (AnnotatedTextParcelable) parcel.readParcelable(AnnotatedTextParcelable.class.getClassLoader()), parcel.createTypedArrayList(OnebarmoduleParcelable.CREATOR), parcel.readString(), parcel.createStringArrayList(), parcel.createTypedArrayList(FilteroptionParcelable.CREATOR), (Map) parcel.readValue(Map.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new OnebarmoduleactionParcelable[i13];
    }
}
