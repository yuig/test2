package qh;

import ai.k;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.deviceperformance.MediaPerformanceClassResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import lb.l0;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f103883b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.deviceperformance.internal.IDevicePerformanceCallbacks", 2);
        this.f103883b = taskCompletionSource;
    }

    @Override // ai.k
    public final boolean j(int i13, Parcel parcel) {
        if (i13 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i14 = ei.a.f58954a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        MediaPerformanceClassResult createFromParcel2 = parcel.readInt() == 0 ? null : MediaPerformanceClassResult.CREATOR.createFromParcel(parcel);
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(a.a.d("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        l0.l1(createFromParcel, createFromParcel2 != null ? Integer.valueOf(createFromParcel2.f31073f) : null, this.f103883b);
        return true;
    }
}
