package ok;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class h0 implements g0, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient Object f95426a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final g0 f95427b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f95428c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object f95429d;

    public h0(g0 g0Var) {
        this.f95427b = g0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f95426a = new Object();
    }

    @Override // ok.g0
    public final Object get() {
        if (!this.f95428c) {
            synchronized (this.f95426a) {
                try {
                    if (!this.f95428c) {
                        Object obj = this.f95427b.get();
                        this.f95429d = obj;
                        this.f95428c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f95429d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb3 = new StringBuilder("Suppliers.memoize(");
        if (this.f95428c) {
            obj = "<supplier that returned " + this.f95429d + ">";
        } else {
            obj = this.f95427b;
        }
        sb3.append(obj);
        sb3.append(")");
        return sb3.toString();
    }
}
