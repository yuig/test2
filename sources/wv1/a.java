package wv1;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.oneBarLibrary.modules.model.AnnotatedTextParcelable;
import java.util.ArrayList;
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
        AnnotatedTextParcelable.CREATOR.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < readInt; i13++) {
            arrayList.add((Map) parcel.readValue(Map.class.getClassLoader()));
        }
        return new AnnotatedTextParcelable(readString, readString2, parcel.readString(), arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new AnnotatedTextParcelable[i13];
    }
}
