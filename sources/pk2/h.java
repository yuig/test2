package pk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final g f100547a = new g("No further exceptions");

    public static boolean a(AtomicReference atomicReference, Throwable th3) {
        Throwable th4;
        do {
            th4 = (Throwable) atomicReference.get();
            if (th4 == f100547a) {
                return false;
            }
        } while (!f.s(atomicReference, th4, th4 == null ? th3 : new CompositeException(th4, th3)));
        return true;
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th3 = (Throwable) atomicReference.get();
        g gVar = f100547a;
        return th3 != gVar ? (Throwable) atomicReference.getAndSet(gVar) : th3;
    }

    public static String c(long j13, TimeUnit timeUnit) {
        StringBuilder u13 = a.a.u("The source did not signal an event for ", j13, " ");
        u13.append(timeUnit.toString().toLowerCase());
        u13.append(" and has been terminated.");
        return u13.toString();
    }

    public static RuntimeException d(Throwable th3) {
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
        return th3 instanceof RuntimeException ? (RuntimeException) th3 : new RuntimeException(th3);
    }
}
