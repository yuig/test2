package td;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f117366d;

    /* renamed from: a, reason: collision with root package name */
    public int f117367a;

    /* renamed from: b, reason: collision with root package name */
    public int f117368b;

    /* renamed from: c, reason: collision with root package name */
    public Object f117369c;

    static {
        char[] cArr = he.n.f68959a;
        f117366d = new ArrayDeque(0);
    }

    public static a0 a(Object obj) {
        a0 a0Var;
        ArrayDeque arrayDeque = f117366d;
        synchronized (arrayDeque) {
            a0Var = (a0) arrayDeque.poll();
        }
        if (a0Var == null) {
            a0Var = new a0();
        }
        a0Var.f117369c = obj;
        a0Var.f117368b = 0;
        a0Var.f117367a = 0;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f117368b == a0Var.f117368b && this.f117367a == a0Var.f117367a && this.f117369c.equals(a0Var.f117369c);
    }

    public final int hashCode() {
        return this.f117369c.hashCode() + (((this.f117367a * 31) + this.f117368b) * 31);
    }
}
