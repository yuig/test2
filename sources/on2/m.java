package on2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class m implements Function1 {

    /* renamed from: a */
    public final q f96779a;

    /* renamed from: b */
    public final ConcurrentMap f96780b;

    /* renamed from: c */
    public final Function1 f96781c;

    public m(q qVar, ConcurrentHashMap concurrentHashMap, Function1 function1) {
        if (qVar == null) {
            b(0);
            throw null;
        }
        this.f96779a = qVar;
        this.f96780b = concurrentHashMap;
        this.f96781c = function1;
    }

    public static /* synthetic */ void b(int i13) {
        String str = (i13 == 3 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 3 || i13 == 4) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "map";
        } else if (i13 == 2) {
            objArr[0] = "compute";
        } else if (i13 == 3 || i13 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i13 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i13 != 3 && i13 != 4) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 3 && i13 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public final AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + o.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f96779a);
        q.h(assertionError);
        return assertionError;
    }

    public final AssertionError f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f96779a);
        q.h(assertionError);
        return assertionError;
    }

    public final p h(Object obj) {
        p g13 = this.f96779a.g(obj, "");
        if (g13 != null) {
            return g13;
        }
        b(3);
        throw null;
    }

    public final AssertionError i(Object obj, Throwable th3) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.f96779a, th3);
        q.h(assertionError);
        return assertionError;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        AssertionError assertionError;
        AssertionError i13;
        h hVar;
        h hVar2;
        ConcurrentMap concurrentMap = this.f96780b;
        Object obj2 = concurrentMap.get(obj);
        Object obj3 = wn2.k.f130609a;
        if (obj2 != null && obj2 != o.COMPUTING) {
            if (obj2 instanceof wn2.j) {
                Throwable e13 = ((wn2.j) obj2).b();
                Intrinsics.checkNotNullParameter(e13, "e");
                throw e13;
            }
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        q qVar = this.f96779a;
        t tVar = qVar.f96786a;
        t tVar2 = qVar.f96786a;
        tVar.lock();
        try {
            Object obj4 = concurrentMap.get(obj);
            o oVar = o.COMPUTING;
            if (obj4 == oVar) {
                obj4 = o.RECURSION_WAS_DETECTED;
                p h10 = h(obj);
                if (!h10.b()) {
                    return h10.a();
                }
            }
            if (obj4 == o.RECURSION_WAS_DETECTED) {
                p h13 = h(obj);
                if (!h13.b()) {
                    return h13.a();
                }
            }
            if (obj4 != null) {
                if (!(obj4 instanceof wn2.j)) {
                    return obj4 != obj3 ? obj4 : null;
                }
                Throwable e14 = ((wn2.j) obj4).b();
                Intrinsics.checkNotNullParameter(e14, "e");
                throw e14;
            }
            try {
                concurrentMap.put(obj, oVar);
                Object invoke = this.f96781c.invoke(obj);
                if (invoke != null) {
                    obj3 = invoke;
                }
                Object put = concurrentMap.put(obj, obj3);
                if (put == oVar) {
                    return invoke;
                }
                assertionError = f(obj, put);
                try {
                    throw assertionError;
                } catch (Throwable th3) {
                    th = th3;
                    if (l3.c.F0(th)) {
                        try {
                            Object remove = concurrentMap.remove(obj);
                            if (remove != o.COMPUTING) {
                                throw e(obj, remove);
                            }
                            throw th;
                        } finally {
                        }
                    }
                    if (th == assertionError) {
                        try {
                            concurrentMap.remove(obj);
                            hVar = qVar.f96787b;
                            ((ln2.k) hVar).i(th);
                            throw null;
                        } finally {
                        }
                    }
                    Object put2 = concurrentMap.put(obj, new wn2.j(th));
                    if (put2 != o.COMPUTING) {
                        throw f(obj, put2);
                    }
                    hVar2 = qVar.f96787b;
                    ((ln2.k) hVar2).i(th);
                    throw null;
                    tVar2.unlock();
                }
            } catch (Throwable th4) {
                th = th4;
                assertionError = null;
            }
        } finally {
            tVar2.unlock();
        }
    }
}
