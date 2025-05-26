package ao2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public interface n2 extends CoroutineContext.Element {
    void restoreThreadContext(CoroutineContext coroutineContext, Object obj);

    Object updateThreadContext(CoroutineContext coroutineContext);
}
