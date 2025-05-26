package com.pinterest.report.library.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.report.library.model.ReportData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        String readString3 = parcel.readString();
        return new ReportData.UserReportData(readString, readString2, readString3 != null ? readString3 : "");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ReportData.UserReportData[i13];
    }
}
