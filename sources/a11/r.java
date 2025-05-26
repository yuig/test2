package a11;

import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Navigation f341a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f342b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f343c;

    public r(NavigationImpl navigationImpl, boolean z13, boolean z14) {
        this.f341a = navigationImpl;
        this.f342b = z13;
        this.f343c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f341a, rVar.f341a) && this.f342b == rVar.f342b && this.f343c == rVar.f343c;
    }

    public final int hashCode() {
        Navigation navigation = this.f341a;
        return Boolean.hashCode(this.f343c) + ep.b.e(this.f342b, (navigation == null ? 0 : navigation.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigationResult(navigation=");
        sb3.append(this.f341a);
        sb3.append(", isBrowserDestination=");
        sb3.append(this.f342b);
        sb3.append(", isNativeBrowserDestination=");
        return a.a.r(sb3, this.f343c, ")");
    }
}
