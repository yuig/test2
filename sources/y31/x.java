package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f136860a;

    public x(c link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f136860a = link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f136860a, ((x) obj).f136860a);
    }

    public final int hashCode() {
        return this.f136860a.hashCode();
    }

    public final String toString() {
        return "LinkClicked(link=" + this.f136860a + ")";
    }
}
