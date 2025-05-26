package xk2;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 implements k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f135221a;

    /* renamed from: b, reason: collision with root package name */
    public Object f135222b;

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // xk2.k
    public final Object getValue() {
        if (this.f135222b == g0.f135210a) {
            Function0 function0 = this.f135221a;
            Intrinsics.f(function0);
            this.f135222b = function0.invoke();
            this.f135221a = null;
        }
        return this.f135222b;
    }

    @Override // xk2.k
    public final boolean isInitialized() {
        return this.f135222b != g0.f135210a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
