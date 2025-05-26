package uj2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f122340b = new o(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f122341a;

    public o(Object obj) {
        this.f122341a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return ck2.i.a(this.f122341a, ((o) obj).f122341a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f122341a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f122341a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (pk2.l.isError(obj)) {
            return "OnErrorNotification[" + pk2.l.getError(obj) + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
