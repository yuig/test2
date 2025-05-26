package fo2;

import bl2.c;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Unit;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class a implements BiFunction {
    public volatile c<Object> cont;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Throwable cause;
        Throwable th3 = (Throwable) obj2;
        c<Object> cVar = this.cont;
        if (cVar != null) {
            if (th3 == null) {
                q qVar = s.f135225b;
                cVar.resumeWith(obj);
            } else {
                CompletionException completionException = th3 instanceof CompletionException ? (CompletionException) th3 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th3 = cause;
                }
                q qVar2 = s.f135225b;
                cVar.resumeWith(ue.c.m(th3));
            }
        }
        return Unit.f80348a;
    }
}
