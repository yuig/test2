package z70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f140989a;

    public c(String str) {
        this.f140989a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f140989a, ((c) obj).f140989a);
    }

    public final int hashCode() {
        String str = this.f140989a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ChromeSessionInBackground(pinId="), this.f140989a, ")");
    }
}
