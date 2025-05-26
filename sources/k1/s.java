package k1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public b3.f0 f77998a = null;

    /* renamed from: b, reason: collision with root package name */
    public b3.u f77999b = null;

    /* renamed from: c, reason: collision with root package name */
    public d3.c f78000c = null;

    /* renamed from: d, reason: collision with root package name */
    public b3.o0 f78001d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f77998a, sVar.f77998a) && Intrinsics.d(this.f77999b, sVar.f77999b) && Intrinsics.d(this.f78000c, sVar.f78000c) && Intrinsics.d(this.f78001d, sVar.f78001d);
    }

    public final int hashCode() {
        b3.f0 f0Var = this.f77998a;
        int hashCode = (f0Var == null ? 0 : f0Var.hashCode()) * 31;
        b3.u uVar = this.f77999b;
        int hashCode2 = (hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        d3.c cVar = this.f78000c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b3.o0 o0Var = this.f78001d;
        return hashCode3 + (o0Var != null ? o0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f77998a + ", canvas=" + this.f77999b + ", canvasDrawScope=" + this.f78000c + ", borderPath=" + this.f78001d + ')';
    }
}
