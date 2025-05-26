package fk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f62275a;

    public b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f62275a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f62275a, ((b) obj).f62275a);
    }

    public final int hashCode() {
        return this.f62275a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardNameChanged(text="), this.f62275a, ")");
    }
}
