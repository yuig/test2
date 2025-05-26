package hd1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f68910a;

    /* renamed from: b, reason: collision with root package name */
    public gb2.d f68911b;

    /* renamed from: c, reason: collision with root package name */
    public String f68912c;

    public e(String originalPinId, gb2.d savedLocation, String str) {
        Intrinsics.checkNotNullParameter(originalPinId, "originalPinId");
        Intrinsics.checkNotNullParameter(savedLocation, "savedLocation");
        this.f68910a = originalPinId;
        this.f68911b = savedLocation;
        this.f68912c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f68910a, eVar.f68910a) && Intrinsics.d(this.f68911b, eVar.f68911b) && Intrinsics.d(this.f68912c, eVar.f68912c);
    }

    public final int hashCode() {
        int hashCode = (this.f68911b.hashCode() + (this.f68910a.hashCode() * 31)) * 31;
        String str = this.f68912c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        gb2.d dVar = this.f68911b;
        String str = this.f68912c;
        StringBuilder sb3 = new StringBuilder("SavedPinInfo(originalPinId=");
        sb3.append(this.f68910a);
        sb3.append(", savedLocation=");
        sb3.append(dVar);
        sb3.append(", newPinId=");
        return a.a.p(sb3, str, ")");
    }
}
