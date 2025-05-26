package m02;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.reportFlow.feature.model.ReportReasonData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Unit unit = Unit.f80348a;
        String readString6 = parcel.readString();
        ArrayList arrayList2 = new ArrayList();
        parcel.readStringList(arrayList2);
        return new ReportReasonData(readString, readString2, readString3, readString4, readString5, arrayList, readString6, arrayList2, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ReportReasonData[i13];
    }
}
