package ba1;

import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f22338a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f22339b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22340c;

    /* renamed from: d, reason: collision with root package name */
    public final Navigation f22341d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22342e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22343f;

    public a(u50.k0 k0Var, u50.k0 k0Var2, boolean z13, NavigationImpl navigationImpl, String str, boolean z14, int i13) {
        u50.i0 title = k0Var;
        title = (i13 & 1) != 0 ? u50.h0.f120562a : title;
        k0Var2 = (i13 & 2) != 0 ? null : k0Var2;
        z13 = (i13 & 4) != 0 ? false : z13;
        navigationImpl = (i13 & 8) != 0 ? null : navigationImpl;
        str = (i13 & 16) != 0 ? null : str;
        z14 = (i13 & 32) != 0 ? false : z14;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f22338a = title;
        this.f22339b = k0Var2;
        this.f22340c = z13;
        this.f22341d = navigationImpl;
        this.f22342e = str;
        this.f22343f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f22338a, aVar.f22338a) && Intrinsics.d(this.f22339b, aVar.f22339b) && this.f22340c == aVar.f22340c && Intrinsics.d(this.f22341d, aVar.f22341d) && Intrinsics.d(this.f22342e, aVar.f22342e) && this.f22343f == aVar.f22343f;
    }

    public final int hashCode() {
        int hashCode = this.f22338a.hashCode() * 31;
        u50.i0 i0Var = this.f22339b;
        int e13 = ep.b.e(this.f22340c, (hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31);
        Navigation navigation = this.f22341d;
        int hashCode2 = (e13 + (navigation == null ? 0 : navigation.hashCode())) * 31;
        String str = this.f22342e;
        return Boolean.hashCode(this.f22343f) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClaimedAccountItem(title=");
        sb3.append(this.f22338a);
        sb3.append(", description=");
        sb3.append(this.f22339b);
        sb3.append(", isClickable=");
        sb3.append(this.f22340c);
        sb3.append(", navigationTarget=");
        sb3.append(this.f22341d);
        sb3.append(", instagramUsername=");
        sb3.append(this.f22342e);
        sb3.append(", isConnectedToNewInstagramApi=");
        return a.a.r(sb3, this.f22343f, ")");
    }
}
