package zy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements y {

    /* renamed from: a, reason: collision with root package name */
    public final n f143104a;

    public p(n impressionParams) {
        Intrinsics.checkNotNullParameter(impressionParams, "impressionParams");
        this.f143104a = impressionParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f143104a, ((p) obj).f143104a);
    }

    public final int hashCode() {
        return this.f143104a.hashCode();
    }

    public final String toString() {
        return "LogArticleImpressions(impressionParams=" + this.f143104a + ")";
    }
}
