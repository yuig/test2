package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u62.c f112157a;

    /* renamed from: b, reason: collision with root package name */
    public final p f112158b;

    public a(u62.c cVar, p sourceDimensions) {
        Intrinsics.checkNotNullParameter(sourceDimensions, "sourceDimensions");
        this.f112157a = cVar;
        this.f112158b = sourceDimensions;
    }

    public static a e(a aVar, u62.c cVar, p sourceDimensions, int i13) {
        if ((i13 & 1) != 0) {
            cVar = aVar.f112157a;
        }
        if ((i13 & 2) != 0) {
            sourceDimensions = aVar.f112158b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(sourceDimensions, "sourceDimensions");
        return new a(cVar, sourceDimensions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f112157a, aVar.f112157a) && Intrinsics.d(this.f112158b, aVar.f112158b);
    }

    public final int hashCode() {
        u62.c cVar = this.f112157a;
        return this.f112158b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }

    public final String toString() {
        return "CutoutEditorDisplayState(model=" + this.f112157a + ", sourceDimensions=" + this.f112158b + ")";
    }

    public a() {
        this(null, p.f112182d);
    }
}
