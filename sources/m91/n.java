package m91;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f86741a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86742b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f86743c;

    public n(String code, String name, boolean z13) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f86741a = code;
        this.f86742b = name;
        this.f86743c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f86741a, nVar.f86741a) && Intrinsics.d(this.f86742b, nVar.f86742b) && this.f86743c == nVar.f86743c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86743c) + cb.d(this.f86742b, this.f86741a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LanguageItem(code=" + this.f86741a + ", name=" + this.f86742b + ", selected=" + this.f86743c + ")";
    }
}
