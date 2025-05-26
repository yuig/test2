package t80;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final List f116690a;

    /* renamed from: b, reason: collision with root package name */
    public final List f116691b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f116692c;

    public f(List drafts, List remixes, boolean z13) {
        Intrinsics.checkNotNullParameter(drafts, "drafts");
        Intrinsics.checkNotNullParameter(remixes, "remixes");
        this.f116690a = drafts;
        this.f116691b = remixes;
        this.f116692c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f116690a, fVar.f116690a) && Intrinsics.d(this.f116691b, fVar.f116691b) && this.f116692c == fVar.f116692c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116692c) + ep.b.c(this.f116691b, this.f116690a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContentLoaded(drafts=");
        sb3.append(this.f116690a);
        sb3.append(", remixes=");
        sb3.append(this.f116691b);
        sb3.append(", showOnboarding=");
        return a.a.r(sb3, this.f116692c, ")");
    }
}
