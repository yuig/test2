package com.pinterest.pushnotification;

import kb.z;
import kh2.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements uj2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f50254a;

    public b(boolean z13, k kVar) {
        this.f50254a = kVar;
    }

    @Override // uj2.d
    public final void a() {
        kk2.a aVar = (kk2.a) this.f50254a.f50292a;
        if (aVar.isDisposed()) {
            return;
        }
        aVar.b(z.a());
    }

    @Override // uj2.d
    public final void b(xj2.c d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
    }

    @Override // uj2.d
    public final void onError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "error");
        k kVar = this.f50254a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        r.g("RegistrationFailure", message);
        kk2.a aVar = (kk2.a) kVar.f50292a;
        if (aVar.isDisposed()) {
            return;
        }
        aVar.a(throwable);
    }
}
