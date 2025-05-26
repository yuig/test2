package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ei implements gi, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132362d;

    /* renamed from: e, reason: collision with root package name */
    public final di f132363e;

    public ei(String __typename, di error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132362d = __typename;
        this.f132363e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132363e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132362d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        return Intrinsics.d(this.f132362d, eiVar.f132362d) && Intrinsics.d(this.f132363e, eiVar.f132363e);
    }

    public final int hashCode() {
        return this.f132363e.hashCode() + (this.f132362d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3ReportContactRequestsMutation(__typename=" + this.f132362d + ", error=" + this.f132363e + ")";
    }
}
