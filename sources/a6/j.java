package a6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f852a;

    public j(Throwable finalException) {
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f852a = finalException;
    }

    public final Throwable a() {
        return this.f852a;
    }
}
