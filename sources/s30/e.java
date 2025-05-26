package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements g, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f111030d;

    /* renamed from: e, reason: collision with root package name */
    public final d f111031e;

    public e(String __typename, d error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f111030d = __typename;
        this.f111031e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f111031e;
    }

    @Override // z40.b
    public final String b() {
        return this.f111030d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f111030d, eVar.f111030d) && Intrinsics.d(this.f111031e, eVar.f111031e);
    }

    public final int hashCode() {
        return this.f111031e.hashCode() + (this.f111030d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3AndroidCubesSignInQuery(__typename=" + this.f111030d + ", error=" + this.f111031e + ")";
    }
}
