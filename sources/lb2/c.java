package lb2;

import com.pinterest.identity.core.error.AccountException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f82745i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return b0.g(new AccountException.GenericAccountError(throwable));
    }
}
