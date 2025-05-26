package ee1;

import com.pinterest.api.model.g00;
import dl1.s;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f58802a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58803b;

    public i(List<? extends g00> list, @NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f58802a = list;
        this.f58803b = uid;
    }

    @Override // dl1.s
    public final String b() {
        return this.f58803b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f58802a, iVar.f58802a) && Intrinsics.d(this.f58803b, iVar.f58803b);
    }

    public final int hashCode() {
        List list = this.f58802a;
        return this.f58803b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "ShoppingFilterEmptyStateEOFModel(oneBarModules=" + this.f58802a + ", uid=" + this.f58803b + ")";
    }

    public /* synthetic */ i(List list, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? "shopping_filter_eof_view" : str);
    }
}
