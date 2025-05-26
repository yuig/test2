package ve1;

import kotlin.jvm.internal.Intrinsics;
import re1.j;
import u50.o;

/* loaded from: classes5.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f125757a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f125758b = 8;

    /* renamed from: c, reason: collision with root package name */
    public final j f125759c;

    public c(j jVar) {
        this.f125759c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f125757a == cVar.f125757a && this.f125758b == cVar.f125758b && Intrinsics.d(this.f125759c, cVar.f125759c);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f125758b, Integer.hashCode(this.f125757a) * 31, 31);
        j jVar = this.f125759c;
        return b13 + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "StructuredFeedStoryDisplayState(orientation=" + this.f125757a + ", visibility=" + this.f125758b + ", footer=" + this.f125759c + ")";
    }
}
