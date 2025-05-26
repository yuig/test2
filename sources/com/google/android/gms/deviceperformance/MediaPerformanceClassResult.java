package com.google.android.gms.deviceperformance;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/gms/deviceperformance/MediaPerformanceClassResult;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "com/google/android/gms/common/api/d", "java.com.google.android.gmscore.integ.client.device_performance_device_performance"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MediaPerformanceClassResult extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<MediaPerformanceClassResult> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    public final int f31073f;

    static {
        new d(1, 0);
        CREATOR = new u1(16);
    }

    public MediaPerformanceClassResult(int i13) {
        this.f31073f = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int M2 = c.M2(dest, 20293);
        c.O2(dest, 1, 4);
        dest.writeInt(this.f31073f);
        c.N2(dest, M2);
    }
}
