package kb;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f78986a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f78987b;

    public f(boolean z13, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f78986a = uri;
        this.f78987b = z13;
    }

    public final Uri a() {
        return this.f78986a;
    }

    public final boolean b() {
        return this.f78987b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        f fVar = (f) obj;
        return Intrinsics.d(this.f78986a, fVar.f78986a) && this.f78987b == fVar.f78987b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78987b) + (this.f78986a.hashCode() * 31);
    }
}
