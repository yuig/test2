package pb2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final z40.n f99502a;

    public e(@NotNull z40.n conversationFields) {
        Intrinsics.checkNotNullParameter(conversationFields, "conversationFields");
        this.f99502a = conversationFields;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f99502a.getId();
    }

    @Override // pb2.f
    public final int r() {
        return 3;
    }
}
