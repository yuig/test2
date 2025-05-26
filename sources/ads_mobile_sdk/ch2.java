package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ch2 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final String f3917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch2(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f3917a = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3917a;
    }
}
