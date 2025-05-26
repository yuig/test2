package lr1;

import com.pinterest.identity.core.error.UnauthException;
import kk2.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.b0;

/* loaded from: classes2.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f84592i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f84592i = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        e eVar = this.f84592i;
        k g13 = b0.g(new UnauthException.AutoLoginAuthenticationError(eVar.f84597f));
        Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
        return e.c(eVar, throwable, g13);
    }
}
