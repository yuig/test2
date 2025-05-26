package g40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements g, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f63491d;

    /* renamed from: e, reason: collision with root package name */
    public final b f63492e;

    public c(String __typename, b error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f63491d = __typename;
        this.f63492e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f63492e;
    }

    @Override // z40.b
    public final String b() {
        return this.f63491d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f63491d, cVar.f63491d) && Intrinsics.d(this.f63492e, cVar.f63492e);
    }

    public final int hashCode() {
        return this.f63492e.hashCode() + (this.f63491d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3RemoveFatigueForInterestAfterFeedbackMutation(__typename=" + this.f63491d + ", error=" + this.f63492e + ")";
    }
}
