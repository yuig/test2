package sr;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final us1.a f115049a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.security.i f115050b;

    /* renamed from: c, reason: collision with root package name */
    public final lu1.b f115051c;

    public e(us1.a activity, com.pinterest.security.i sessionVerificationHandler, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sessionVerificationHandler, "sessionVerificationHandler");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f115049a = activity;
        this.f115050b = sessionVerificationHandler;
        this.f115051c = baseActivityHelper;
    }

    public final void a(Bundle bundle) {
        us1.a aVar = this.f115049a;
        ((lu1.c) this.f115051c).q(aVar.getContext(), bundle);
        aVar.g();
    }
}
