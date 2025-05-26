package pa;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final f f99354a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f99355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f99354a = callbackName;
        this.f99355b = cause;
    }

    public final f a() {
        return this.f99354a;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f99355b;
    }
}
