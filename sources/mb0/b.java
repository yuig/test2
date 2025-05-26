package mb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f86863a;

    public b(String value) {
        Intrinsics.checkNotNullParameter("PREF_LAST_TIME_USER_LAND_ON_SEARCH", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f86863a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return Intrinsics.d("PREF_LAST_TIME_USER_LAND_ON_SEARCH", "PREF_LAST_TIME_USER_LAND_ON_SEARCH") && Intrinsics.d(this.f86863a, bVar.f86863a);
    }

    public final int hashCode() {
        return this.f86863a.hashCode() + 967631549;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SetStringValueSideEffectRequest(key=PREF_LAST_TIME_USER_LAND_ON_SEARCH, value="), this.f86863a, ")");
    }
}
