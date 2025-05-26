package hv0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f70459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70460b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70461c;

    public h(String uid, String str, String str2) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f70459a = uid;
        this.f70460b = str;
        this.f70461c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f70459a, hVar.f70459a) && Intrinsics.d(this.f70460b, hVar.f70460b) && Intrinsics.d(this.f70461c, hVar.f70461c);
    }

    public final int hashCode() {
        int hashCode = this.f70459a.hashCode() * 31;
        String str = this.f70460b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70461c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UpdateOverlayViewColorPicker(uid=");
        sb3.append(this.f70459a);
        sb3.append(", title=");
        sb3.append(this.f70460b);
        sb3.append(", imageUrl=");
        return a.a.p(sb3, this.f70461c, ")");
    }
}
