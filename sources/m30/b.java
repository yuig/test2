package m30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements d, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f85745d;

    /* renamed from: e, reason: collision with root package name */
    public final a f85746e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f85745d = __typename;
        this.f85746e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f85746e;
    }

    @Override // z40.b
    public final String b() {
        return this.f85745d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85745d, bVar.f85745d) && Intrinsics.d(this.f85746e, bVar.f85746e);
    }

    public final int hashCode() {
        return this.f85746e.hashCode() + (this.f85745d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetPinQuery(__typename=" + this.f85745d + ", error=" + this.f85746e + ")";
    }
}
