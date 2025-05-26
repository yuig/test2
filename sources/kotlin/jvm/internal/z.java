package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public final class z implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Class f80449a;

    public z(Class jClass, String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f80449a = jClass;
    }

    @Override // kotlin.jvm.internal.g
    public final Class c() {
        return this.f80449a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            if (Intrinsics.d(this.f80449a, ((z) obj).f80449a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f80449a.hashCode();
    }

    public final String toString() {
        return this.f80449a.toString() + " (Kotlin reflection is not available)";
    }
}
