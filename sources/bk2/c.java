package bk2;

import ck2.i;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public enum c implements xj2.c {
    DISPOSED;

    public static boolean replace(AtomicReference<xj2.c> atomicReference, xj2.c cVar) {
        while (true) {
            xj2.c cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(cVar2, cVar)) {
                if (atomicReference.get() != cVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void reportDisposableSet() {
        l0.R0(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<xj2.c> atomicReference, xj2.c cVar) {
        while (true) {
            xj2.c cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(cVar2, cVar)) {
                if (atomicReference.get() != cVar2) {
                    break;
                }
            }
            if (cVar2 == null) {
                return true;
            }
            cVar2.dispose();
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<xj2.c> atomicReference, xj2.c cVar) {
        i.b(cVar, "d is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                reportDisposableSet();
                return false;
            }
        }
        return true;
    }

    public static boolean trySet(AtomicReference<xj2.c> atomicReference, xj2.c cVar) {
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                if (atomicReference.get() != DISPOSED) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(xj2.c cVar, xj2.c cVar2) {
        if (cVar2 == null) {
            l0.R0(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // xj2.c
    public void dispose() {
    }

    @Override // xj2.c
    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<xj2.c> atomicReference) {
        xj2.c andSet;
        xj2.c cVar = atomicReference.get();
        c cVar2 = DISPOSED;
        if (cVar == cVar2 || (andSet = atomicReference.getAndSet(cVar2)) == cVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(xj2.c cVar) {
        return cVar == DISPOSED;
    }
}
