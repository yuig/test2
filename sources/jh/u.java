package jh;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import kh2.c3;

/* loaded from: classes3.dex */
public final class u implements com.google.android.gms.common.api.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3 f76195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f76196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f76197c;

    public u(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, kp.n nVar) {
        this.f76195a = basePendingResult;
        this.f76196b = taskCompletionSource;
        this.f76197c = nVar;
    }

    @Override // com.google.android.gms.common.api.j
    public final void a(Status status) {
        boolean z13 = status.f30751f <= 0;
        TaskCompletionSource taskCompletionSource = this.f76196b;
        if (!z13) {
            taskCompletionSource.setException(tb.f.L(status));
            return;
        }
        com.google.android.gms.common.api.k p13 = this.f76195a.p(TimeUnit.MILLISECONDS);
        switch (((kp.n) this.f76197c).f80561a) {
            case 9:
                jq.b.u(p13);
                throw null;
            default:
                taskCompletionSource.setResult(null);
                return;
        }
    }
}
