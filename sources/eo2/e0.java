package eo2;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* loaded from: classes2.dex */
public final class e0 extends ho2.u {
    @Override // ao2.a2
    public final boolean B(Throwable th3) {
        if (th3 instanceof ChildCancelledException) {
            return true;
        }
        return w(th3);
    }
}
