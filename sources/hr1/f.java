package hr1;

import com.pinterest.identity.core.error.UnauthException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.b0;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f f69990i = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return throwable instanceof UnauthException.AuthenticationError.UserNotFoundError ? b0.g(new UnauthException.AuthenticationError.FacebookDeprecatedError(throwable)) : b0.g(throwable);
    }
}
