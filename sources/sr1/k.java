package sr1;

import com.pinterest.identity.core.error.UnauthException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qr1.m;
import qr1.r;
import qr1.t;

/* loaded from: classes4.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f115116i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(1);
        this.f115116i = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qr1.d result = (qr1.d) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        l lVar = this.f115116i;
        m mVar = lVar.f88086a;
        String v3AccessToken = result.getV3AccessToken();
        if (v3AccessToken != null) {
            return new t(mVar, new c60.a(v3AccessToken, result.getV5AccessToken(), result.getV5RefreshToken()), r.SIGNUP, null, lVar.f115118c);
        }
        throw new UnauthException.AuthenticationError.MissingAccessTokenError(null);
    }
}
