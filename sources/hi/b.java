package hi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.tasks.TaskCompletionSource;
import lb.l0;

/* loaded from: classes3.dex */
public abstract class b extends j implements a {
    public b() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // hi.j
    public final boolean j(int i13, Parcel parcel) {
        ApiException L;
        if (i13 != 1) {
            return false;
        }
        Parcelable.Creator<zzad> creator = zzad.CREATOR;
        int i14 = k.f69236a;
        zzad createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        li.a aVar = (li.a) this;
        int i15 = aVar.f83531a;
        TaskCompletionSource taskCompletionSource = aVar.f83532b;
        switch (i15) {
            case 0:
                l0.l1(createFromParcel.f31246f, null, taskCompletionSource);
                return true;
            default:
                Status status = createFromParcel.f31246f;
                if (status == null) {
                    L = new ApiException(new Status(8, "Got null status from location service", null, null));
                } else {
                    if (status.f30751f == 0) {
                        taskCompletionSource.setResult(Boolean.TRUE);
                        return true;
                    }
                    L = tb.f.L(status);
                }
                taskCompletionSource.trySetException(L);
                return true;
        }
    }
}
