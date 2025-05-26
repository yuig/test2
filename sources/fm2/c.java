package fm2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import rm2.f0;

/* loaded from: classes2.dex */
public final class c implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f62576a;

    /* renamed from: b, reason: collision with root package name */
    public final sm2.c f62577b;

    public c(Class cls, sm2.c cVar) {
        this.f62576a = cls;
        this.f62577b = cVar;
    }

    public final String a() {
        StringBuilder sb3 = new StringBuilder();
        String name = this.f62576a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb3.append(z.m(name, '.', '/'));
        sb3.append(".class");
        return sb3.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (Intrinsics.d(this.f62576a, ((c) obj).f62576a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f62576a.hashCode();
    }

    public final String toString() {
        return c.class.getName() + ": " + this.f62576a;
    }
}
