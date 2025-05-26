package vs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f126493a;

    public l(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f126493a = input;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f126493a, ((l) obj).f126493a);
    }

    public final int hashCode() {
        return this.f126493a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnSearchTextChanged(input="), this.f126493a, ")");
    }
}
