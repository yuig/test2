package xk2;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v implements k, Serializable {

    /* renamed from: a */
    public Function0 f135231a;

    /* renamed from: b */
    public volatile Object f135232b;

    /* renamed from: c */
    public final Object f135233c;

    public v(Function0 initializer, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i13 & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f135231a = initializer;
        this.f135232b = g0.f135210a;
        this.f135233c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // xk2.k
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f135232b;
        g0 g0Var = g0.f135210a;
        if (obj2 != g0Var) {
            return obj2;
        }
        synchronized (this.f135233c) {
            obj = this.f135232b;
            if (obj == g0Var) {
                Function0 function0 = this.f135231a;
                Intrinsics.f(function0);
                obj = function0.invoke();
                this.f135232b = obj;
                this.f135231a = null;
            }
        }
        return obj;
    }

    @Override // xk2.k
    public final boolean isInitialized() {
        return this.f135232b != g0.f135210a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
