package j51;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f74746a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74747b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74748c;

    /* renamed from: d, reason: collision with root package name */
    public final String f74749d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74750e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f74751f;

    public h(String id3, String name, int i13, String str, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f74746a = id3;
        this.f74747b = name;
        this.f74748c = i13;
        this.f74749d = str;
        this.f74750e = z13;
        this.f74751f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f74746a, hVar.f74746a) && Intrinsics.d(this.f74747b, hVar.f74747b) && this.f74748c == hVar.f74748c && Intrinsics.d(this.f74749d, hVar.f74749d) && this.f74750e == hVar.f74750e && this.f74751f == hVar.f74751f;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f74748c, cb.d(this.f74747b, this.f74746a.hashCode() * 31, 31), 31);
        String str = this.f74749d;
        return Boolean.hashCode(this.f74751f) + ep.b.e(this.f74750e, (b13 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardRestoreItemViewModel(id=");
        sb3.append(this.f74746a);
        sb3.append(", name=");
        sb3.append(this.f74747b);
        sb3.append(", pinCount=");
        sb3.append(this.f74748c);
        sb3.append(", imageCoverURL=");
        sb3.append(this.f74749d);
        sb3.append(", isSecret=");
        sb3.append(this.f74750e);
        sb3.append(", isSelected=");
        return a.a.r(sb3, this.f74751f, ")");
    }
}
