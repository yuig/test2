package xk2;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class u implements k, Serializable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final t f135227c = new t(null);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f135228d = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile Function0 f135229a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f135230b;

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // xk2.k
    public final Object getValue() {
        Object obj = this.f135230b;
        g0 g0Var = g0.f135210a;
        if (obj != g0Var) {
            return obj;
        }
        Function0 function0 = this.f135229a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f135228d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, g0Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != g0Var) {
                }
            }
            this.f135229a = null;
            return invoke;
        }
        return this.f135230b;
    }

    @Override // xk2.k
    public final boolean isInitialized() {
        return this.f135230b != g0.f135210a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
