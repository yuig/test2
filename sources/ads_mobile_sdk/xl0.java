package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class xl0 extends CancellationException implements a.jf {

    /* renamed from: a, reason: collision with root package name */
    public final TimeoutCancellationException f13714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(TimeoutCancellationException timeoutException) {
        super(timeoutException.getMessage());
        Intrinsics.checkNotNullParameter(timeoutException, "timeoutException");
        this.f13714a = timeoutException;
    }

    @Override // a.jf
    public final Throwable a() {
        return this.f13714a;
    }
}
