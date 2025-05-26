package va1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u0 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f125248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125249b;

    public u0(@NotNull wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f125248a = user;
        this.f125249b = 19;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String id3 = this.f125248a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Intrinsics.d(this.f125248a, ((u0) obj).f125248a);
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125249b;
    }

    public final int hashCode() {
        return this.f125248a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("ProfilePreview(user="), this.f125248a, ")");
    }
}
