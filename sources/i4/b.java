package i4;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f71502a;

    public b(Locale locale) {
        this.f71502a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.d(this.f71502a.toLanguageTag(), ((b) obj).f71502a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f71502a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f71502a.toLanguageTag();
    }
}
