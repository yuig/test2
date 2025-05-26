package wc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f129137a;

    public h(String js2) {
        Intrinsics.checkNotNullParameter(js2, "js");
        this.f129137a = js2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f129137a, ((h) obj).f129137a);
    }

    public final int hashCode() {
        return this.f129137a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadedJS(js="), this.f129137a, ")");
    }
}
