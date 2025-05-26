package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f18597a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f18598b;

    public c(int i13, Method method) {
        this.f18597a = i13;
        this.f18598b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18597a == cVar.f18597a && this.f18598b.getName().equals(cVar.f18598b.getName());
    }

    public final int hashCode() {
        return this.f18598b.getName().hashCode() + (this.f18597a * 31);
    }
}
