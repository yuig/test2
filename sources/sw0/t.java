package sw0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f115574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115575b;

    /* renamed from: c, reason: collision with root package name */
    public final long f115576c;

    public t(long j13, String filePath, String mimeType) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f115574a = filePath;
        this.f115575b = mimeType;
        this.f115576c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f115574a, tVar.f115574a) && Intrinsics.d(this.f115575b, tVar.f115575b) && this.f115576c == tVar.f115576c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f115576c) + cb.d(this.f115575b, this.f115574a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Media(filePath=");
        sb3.append(this.f115574a);
        sb3.append(", mimeType=");
        sb3.append(this.f115575b);
        sb3.append(", lastUpdate=");
        return a.a.o(sb3, this.f115576c, ")");
    }
}
