package hr1;

import com.facebook.FacebookException;
import com.facebook.login.y;
import com.pinterest.identity.core.error.UnauthException;
import kotlin.jvm.internal.Intrinsics;
import uj2.c0;

/* loaded from: classes4.dex */
public final class l implements le.q {

    /* renamed from: a, reason: collision with root package name */
    public c0 f70002a;

    public final void a() {
        c0 c0Var = this.f70002a;
        if (c0Var == null) {
            Intrinsics.r("emitter");
            throw null;
        }
        ((kk2.a) c0Var).c(new UnauthException.AuthCanceledError(null));
    }

    public final void b(FacebookException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        c0 c0Var = this.f70002a;
        if (c0Var == null) {
            Intrinsics.r("emitter");
            throw null;
        }
        ((kk2.a) c0Var).c(new UnauthException.ThirdParty.Facebook.LoginResultError(error));
    }

    public final void c(y result) {
        Intrinsics.checkNotNullParameter(result, "result");
        c0 c0Var = this.f70002a;
        if (c0Var != null) {
            ((kk2.a) c0Var).b(result);
        } else {
            Intrinsics.r("emitter");
            throw null;
        }
    }
}
