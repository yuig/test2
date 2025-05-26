package com.pinterest.report.library.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.report.library.model.ReportData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        String str = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        String str2 = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        String str3 = readString3 == null ? "" : readString3;
        String readString4 = parcel.readString();
        return new ReportData.LinkReportData(str, str2, str3, readString4 == null ? "" : readString4, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ReportData.LinkReportData[i13];
    }
}
