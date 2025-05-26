package hr1;

import com.pinterest.identity.core.error.UnauthException;
import kotlin.jvm.internal.Intrinsics;
import le.h0;

/* loaded from: classes2.dex */
public final class i implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.c f69997a;

    public i(fk2.f emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f69997a = emitter;
    }

    public final void a() {
        ((fk2.f) this.f69997a).a(new UnauthException.ThirdParty.Facebook.FetchAccessTokenFailure(null));
    }
}
