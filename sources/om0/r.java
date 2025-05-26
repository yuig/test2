package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i f96572a;

    /* renamed from: b, reason: collision with root package name */
    public final n f96573b;

    /* renamed from: c, reason: collision with root package name */
    public final o f96574c;

    public r(i badge, n collaborators, o content) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f96572a = badge;
        this.f96573b = collaborators;
        this.f96574c = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f96572a, rVar.f96572a) && Intrinsics.d(this.f96573b, rVar.f96573b) && Intrinsics.d(this.f96574c, rVar.f96574c);
    }

    public final int hashCode() {
        return this.f96574c.hashCode() + ((this.f96573b.hashCode() + (this.f96572a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BoardMetadataState(badge=" + this.f96572a + ", collaborators=" + this.f96573b + ", content=" + this.f96574c + ")";
    }
}
