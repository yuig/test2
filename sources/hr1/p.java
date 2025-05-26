package hr1;

import com.facebook.FacebookException;
import com.facebook.login.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        le.m mVar = (le.m) obj;
        ((x) this.receiver).getClass();
        if (!(mVar instanceof df.j)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((df.j) mVar).c(df.i.Login.toRequestCode());
        return Unit.f80348a;
    }
}
