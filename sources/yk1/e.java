package yk1;

import ao2.h0;
import ao2.j0;
import ao2.m2;
import ao2.v0;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public interface e {
    default CoroutineContext getCoroutineContext() {
        m2 b13 = ue.c.b();
        ko2.f fVar = v0.f20219a;
        return kotlin.coroutines.g.d(((bo2.e) ho2.q.f69782a).f23612f, b13).plus(getExceptionHandler());
    }

    default h0 getExceptionHandler() {
        return new g4.h(1);
    }

    default j0 getScope() {
        return dl2.b.b(getCoroutineContext());
    }
}
