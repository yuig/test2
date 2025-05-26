package pb2;

import com.pinterest.api.model.k8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final k8 f99499a;

    public a(@NotNull k8 boardInvite) {
        Intrinsics.checkNotNullParameter(boardInvite, "boardInvite");
        this.f99499a = boardInvite;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f99499a.f39332b;
    }

    @Override // pb2.f
    public final int r() {
        return 18;
    }
}
