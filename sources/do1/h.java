package do1;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f55679a;

    public h(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f55679a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f55679a, ((h) obj).f55679a);
    }

    public final int hashCode() {
        return this.f55679a.hashCode();
    }

    public final String toString() {
        return "Uri(uri=" + this.f55679a + ")";
    }
}
