package ao2;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public interface o1 extends CoroutineContext.Element {

    /* renamed from: yn */
    public static final /* synthetic */ int f20187yn = 0;

    s attachChild(u uVar);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th3);

    CancellationException getCancellationException();

    Sequence getChildren();

    lo2.c getOnJoin();

    o1 getParent();

    x0 invokeOnCompletion(Function1 function1);

    x0 invokeOnCompletion(boolean z13, boolean z14, Function1 function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(bl2.c cVar);

    o1 plus(o1 o1Var);

    boolean start();
}
