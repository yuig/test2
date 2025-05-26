package kc1;

import java.util.Set;
import kotlin.collections.s0;

/* loaded from: classes5.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f79163a;

    public k(boolean z13) {
        this.f79163a = z13;
    }

    @Override // kc1.m
    public final boolean a() {
        return this.f79163a;
    }

    @Override // kc1.m
    public final Set b() {
        return s0.f80394a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f79163a == ((k) obj).f79163a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79163a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("Empty(doneAvailable="), this.f79163a, ")");
    }
}
