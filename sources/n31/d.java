package n31;

import a.cb;
import com.pinterest.api.model.v7;
import dl1.s;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f89162a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89163b;

    /* renamed from: c, reason: collision with root package name */
    public final String f89164c;

    public d(@NotNull List<? extends v7> boards, int i13) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        this.f89162a = boards;
        this.f89163b = i13;
        this.f89164c = cb.g("toString(...)");
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f89164c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f89162a, dVar.f89162a) && this.f89163b == dVar.f89163b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89163b) + (this.f89162a.hashCode() * 31);
    }

    public final String toString() {
        return "SoftDeletionModel(boards=" + this.f89162a + ", total=" + this.f89163b + ")";
    }

    public /* synthetic */ d(List list, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i14 & 2) != 0 ? list.isEmpty() ? 0 : list.size() : i13);
    }
}
