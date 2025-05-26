package id;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f72124a;

    public f(String str) {
        this.f72124a = str;
    }

    @Override // id.c
    public final Object a() {
        return this.f72124a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f72124a, ((f) obj).f72124a);
    }

    @Override // id.c
    public final Object get() {
        return this.f72124a;
    }

    public final int hashCode() {
        Object obj = this.f72124a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "ValueProvider(value=" + this.f72124a + ')';
    }
}
