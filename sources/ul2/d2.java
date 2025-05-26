package ul2;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122511b;

    public d2(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f122510a = new WeakReference(classLoader);
        this.f122511b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d2) && this.f122510a.get() == ((d2) obj).f122510a.get();
    }

    public final int hashCode() {
        return this.f122511b;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.f122510a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
