package pk2;

import uj2.v;

/* loaded from: classes2.dex */
public enum l {
    COMPLETE;

    public static <T> boolean accept(Object obj, xp2.b bVar) {
        if (obj == COMPLETE) {
            bVar.a();
            return true;
        }
        if (obj instanceof j) {
            bVar.onError(((j) obj).f100549a);
            return true;
        }
        bVar.c(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, xp2.b bVar) {
        if (obj == COMPLETE) {
            bVar.a();
            return true;
        }
        if (obj instanceof j) {
            bVar.onError(((j) obj).f100549a);
            return true;
        }
        if (obj instanceof k) {
            bVar.d(((k) obj).f100550a);
            return false;
        }
        bVar.c(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(xj2.c cVar) {
        return new i(cVar);
    }

    public static Object error(Throwable th3) {
        return new j(th3);
    }

    public static xj2.c getDisposable(Object obj) {
        return ((i) obj).f100548a;
    }

    public static Throwable getError(Object obj) {
        return ((j) obj).f100549a;
    }

    public static xp2.c getSubscription(Object obj) {
        return ((k) obj).f100550a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof i;
    }

    public static boolean isError(Object obj) {
        return obj instanceof j;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof k;
    }

    public static <T> Object next(T t13) {
        return t13;
    }

    public static Object subscription(xp2.c cVar) {
        return new k(cVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, v vVar) {
        if (obj == COMPLETE) {
            vVar.a();
            return true;
        }
        if (obj instanceof j) {
            vVar.onError(((j) obj).f100549a);
            return true;
        }
        vVar.c(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, v vVar) {
        if (obj == COMPLETE) {
            vVar.a();
            return true;
        }
        if (obj instanceof j) {
            vVar.onError(((j) obj).f100549a);
            return true;
        }
        if (obj instanceof i) {
            vVar.b(((i) obj).f100548a);
            return false;
        }
        vVar.c(obj);
        return false;
    }
}
