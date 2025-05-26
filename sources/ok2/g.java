package ok2;

import ck2.i;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public enum g implements xp2.c {
    CANCELLED;

    public static void deferredRequest(AtomicReference<xp2.c> atomicReference, AtomicLong atomicLong, long j13) {
        xp2.c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j13);
            return;
        }
        if (validate(j13)) {
            d7.b.e(atomicLong, j13);
            xp2.c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<xp2.c> atomicReference, AtomicLong atomicLong, xp2.c cVar) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<xp2.c> atomicReference, xp2.c cVar) {
        xp2.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!jq.b.y(atomicReference, cVar2, cVar));
        return true;
    }

    public static void reportMoreProduced(long j13) {
        l0.R0(new ProtocolViolationException(a.a.g("More produced than requested: ", j13)));
    }

    public static void reportSubscriptionSet() {
        l0.R0(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<xp2.c> atomicReference, xp2.c cVar) {
        xp2.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!jq.b.y(atomicReference, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<xp2.c> atomicReference, xp2.c cVar) {
        i.b(cVar, "s is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                reportSubscriptionSet();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(long j13) {
        if (j13 > 0) {
            return true;
        }
        l0.R0(new IllegalArgumentException(a.a.g("n > 0 required but it was ", j13)));
        return false;
    }

    @Override // xp2.c
    public void cancel() {
    }

    @Override // xp2.c
    public void request(long j13) {
    }

    public static boolean cancel(AtomicReference<xp2.c> atomicReference) {
        xp2.c andSet;
        xp2.c cVar = atomicReference.get();
        g gVar = CANCELLED;
        if (cVar == gVar || (andSet = atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<xp2.c> atomicReference, xp2.c cVar, long j13) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        cVar.request(j13);
        return true;
    }

    public static boolean validate(xp2.c cVar, xp2.c cVar2) {
        if (cVar2 == null) {
            l0.R0(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        reportSubscriptionSet();
        return false;
    }
}
