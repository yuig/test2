package ai;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import lb.l0;

/* loaded from: classes3.dex */
public final class f extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 0);
        this.f15221b = taskCompletionSource;
    }

    @Override // ai.k
    public final boolean B(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 != 1) {
            return false;
        }
        Status status = (Status) l.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) l.a(parcel, PendingIntent.CREATOR);
        l.b(parcel);
        l0.l1(status, pendingIntent, this.f15221b);
        return true;
    }
}
