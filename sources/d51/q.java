package d51;

import a.cb;
import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final List f53715a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53716b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53717c;

    public q(@NotNull List<? extends f30> ideas, int i13) {
        Intrinsics.checkNotNullParameter(ideas, "ideas");
        this.f53715a = ideas;
        this.f53716b = i13;
        this.f53717c = cb.g("toString(...)");
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f53717c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f53715a, qVar.f53715a) && this.f53716b == qVar.f53716b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53716b) + (this.f53715a.hashCode() * 31);
    }

    public final String toString() {
        return "UnorganizedIdeasModel(ideas=" + this.f53715a + ", total=" + this.f53716b + ")";
    }

    public /* synthetic */ q(List list, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i14 & 2) != 0 ? list.isEmpty() ? 0 : list.size() : i13);
    }
}
