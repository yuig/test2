package o12;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f92783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92784b;

    public b(List models, String str) {
        Intrinsics.checkNotNullParameter(models, "models");
        this.f92783a = models;
        this.f92784b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f92783a, bVar.f92783a) && Intrinsics.d(this.f92784b, bVar.f92784b);
    }

    public final int hashCode() {
        int hashCode = this.f92783a.hashCode() * 31;
        String str = this.f92784b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ModelListWithBookmark(models=" + this.f92783a + ", bookmark=" + this.f92784b + ")";
    }
}
