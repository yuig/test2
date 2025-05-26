package do1;

import a.cb;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f55674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55675b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f55676c;

    public e(String url, String name) {
        rm1.i iVar = GestaltToast.E;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f55674a = url;
        this.f55675b = name;
        this.f55676c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f55674a, eVar.f55674a) && Intrinsics.d(this.f55675b, eVar.f55675b) && Intrinsics.d(this.f55676c, eVar.f55676c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f55675b, this.f55674a.hashCode() * 31, 31);
        Integer num = this.f55676c;
        return d2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Avatar(url=");
        sb3.append(this.f55674a);
        sb3.append(", name=");
        sb3.append(this.f55675b);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f55676c, ")");
    }
}
