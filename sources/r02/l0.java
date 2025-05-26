package r02;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f105771a;

    /* renamed from: b, reason: collision with root package name */
    public final String f105772b;

    /* renamed from: c, reason: collision with root package name */
    public final long f105773c;

    public l0(long j13, String fileName, String base64Content) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(base64Content, "base64Content");
        this.f105771a = fileName;
        this.f105772b = base64Content;
        this.f105773c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f105771a, l0Var.f105771a) && Intrinsics.d(this.f105772b, l0Var.f105772b) && this.f105773c == l0Var.f105773c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f105773c) + cb.d(this.f105772b, this.f105771a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FileInfo(fileName=");
        sb3.append(this.f105771a);
        sb3.append(", base64Content=");
        sb3.append(this.f105772b);
        sb3.append(", fileSize=");
        return a.a.o(sb3, this.f105773c, ")");
    }
}
