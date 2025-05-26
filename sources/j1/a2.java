package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a2 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f73971a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f73972b;

    public a2(Object obj, Object obj2) {
        this.f73971a = obj;
        this.f73972b = obj2;
    }

    @Override // j1.z1
    public final Object a() {
        return this.f73972b;
    }

    @Override // j1.z1
    public final Object c() {
        return this.f73971a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z1) {
            z1 z1Var = (z1) obj;
            if (Intrinsics.d(this.f73971a, z1Var.c())) {
                if (Intrinsics.d(this.f73972b, z1Var.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f73971a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f73972b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
