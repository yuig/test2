package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yj0 extends CancellationException implements a.jf {

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f14274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj0(CancellationException cancellationException) {
        super(cancellationException.getMessage());
        Intrinsics.checkNotNullParameter(cancellationException, "cancellationException");
        this.f14274a = cancellationException;
    }

    @Override // a.jf
    public final Throwable a() {
        return this.f14274a;
    }
}
