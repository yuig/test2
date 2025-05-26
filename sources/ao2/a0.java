package ao2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public interface a0 extends n2 {
    a0 copyForChild();

    CoroutineContext mergeForChild(CoroutineContext.Element element);
}
