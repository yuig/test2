package jr1;

import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.pinterest.identity.core.error.UnauthException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f77552i = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LineAccessToken lineAccessToken;
        String str;
        String str2;
        LineLoginResult it = (LineLoginResult) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        rn.c cVar = it.f34075a;
        if (cVar == rn.c.CANCEL) {
            throw new UnauthException.AuthCanceledError(null);
        }
        if (cVar != rn.c.SUCCESS) {
            throw new UnauthException.ThirdParty.Line.LoginResultError(new Throwable(it.f34081g.f34027b));
        }
        LineCredential lineCredential = it.f34080f;
        if (lineCredential == null || (lineAccessToken = lineCredential.f34029a) == null || (str = lineAccessToken.f34022a) == null) {
            throw new UnauthException.ThirdParty.Line.MissingTokenError();
        }
        LineIdToken lineIdToken = it.f34078d;
        if (lineIdToken == null || (str2 = lineIdToken.f34035a) == null) {
            throw new UnauthException.ThirdParty.Line.MissingLineIdError();
        }
        return new b(str, str2);
    }
}
