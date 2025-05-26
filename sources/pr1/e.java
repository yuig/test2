package pr1;

import com.pinterest.api.model.wy0;
import com.pinterest.identity.core.error.UnauthException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qr1.m;
import qr1.r;
import qr1.t;

/* loaded from: classes2.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f101187i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f101187i = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qr1.d response = (qr1.d) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        f fVar = this.f101187i;
        m mVar = fVar.f88086a;
        String v3AccessToken = response.getV3AccessToken();
        if (v3AccessToken == null) {
            throw new UnauthException.AuthenticationError.MissingAccessTokenError(null);
        }
        c60.a aVar = new c60.a(v3AccessToken, response.getV5AccessToken(), response.getV5RefreshToken());
        r rVar = r.LOGIN;
        wy0 user = response.getUser();
        if (user != null) {
            return new t(mVar, aVar, rVar, user, (String) fVar.c().get("password"));
        }
        throw new UnauthException.AuthenticationError.MissingLoggedUser(null);
    }
}
