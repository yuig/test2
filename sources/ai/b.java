package ai;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import lb.l0;

/* loaded from: classes3.dex */
public final class b extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15216b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 0);
        this.f15216b = taskCompletionSource;
    }

    @Override // ai.k
    public final boolean B(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 != 1) {
            return false;
        }
        Status status = (Status) l.a(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) l.a(parcel, SavePasswordResult.CREATOR);
        l.b(parcel);
        l0.l1(status, savePasswordResult, this.f15216b);
        return true;
    }
}
