package ai;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import lb.l0;

/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 0);
        this.f15219b = taskCompletionSource;
    }

    @Override // ai.k
    public final boolean B(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 != 1) {
            return false;
        }
        Status status = (Status) l.a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) l.a(parcel, BeginSignInResult.CREATOR);
        l.b(parcel);
        l0.l1(status, beginSignInResult, this.f15219b);
        return true;
    }
}
