package u80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f120941a;

    /* renamed from: b, reason: collision with root package name */
    public final ra0.l f120942b;

    public h(String id3, ra0.l source) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f120941a = id3;
        this.f120942b = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f120941a, hVar.f120941a) && Intrinsics.d(this.f120942b, hVar.f120942b);
    }

    public final int hashCode() {
        return this.f120942b.hashCode() + (this.f120941a.hashCode() * 31);
    }

    public final String toString() {
        return "CarouselCardPreviewState(id=" + this.f120941a + ", source=" + this.f120942b + ")";
    }

    public /* synthetic */ h() {
        this("", ra0.k.f106951a);
    }
}
