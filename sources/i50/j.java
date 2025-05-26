package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements l, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f71552d;

    /* renamed from: e, reason: collision with root package name */
    public final i f71553e;

    public j(String __typename, i error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f71552d = __typename;
        this.f71553e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f71553e;
    }

    @Override // z40.b
    public final String b() {
        return this.f71552d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f71552d, jVar.f71552d) && Intrinsics.d(this.f71553e, jVar.f71553e);
    }

    public final int hashCode() {
        return this.f71553e.hashCode() + (this.f71552d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3PollDownloadIdeaPinQuery(__typename=" + this.f71552d + ", error=" + this.f71553e + ")";
    }
}
