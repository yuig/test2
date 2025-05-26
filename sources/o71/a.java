package o71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f93228a;

    public a(int i13) {
        Intrinsics.checkNotNullParameter("query", "autoCompleteType");
        this.f93228a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Intrinsics.d("query", "query") && this.f93228a == aVar.f93228a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93228a) - 948699080;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("AutocompleteData(autoCompleteType=query, position="), this.f93228a, ")");
    }
}
