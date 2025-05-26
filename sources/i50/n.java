package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f71558d;

    /* renamed from: e, reason: collision with root package name */
    public final m f71559e;

    public n(String __typename, m mVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f71558d = __typename;
        this.f71559e = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f71558d, nVar.f71558d) && Intrinsics.d(this.f71559e, nVar.f71559e);
    }

    public final int hashCode() {
        int hashCode = this.f71558d.hashCode() * 31;
        m mVar = this.f71559e;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "V3PollDownloadIdeaPinV3PollDownloadIdeaPinQuery(__typename=" + this.f71558d + ", data=" + this.f71559e + ")";
    }
}
