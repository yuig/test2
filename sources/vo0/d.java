package vo0;

import com.pinterest.api.model.wx;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d extends wx {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f126392a;

    public d(@NotNull wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f126392a = user;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return a.a.j("curator_", this.f126392a.getId());
    }
}
