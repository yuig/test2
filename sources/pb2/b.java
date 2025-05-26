package pb2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x40.uc;

/* loaded from: classes4.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final z40.f f99500a;

    public b(@NotNull z40.f conversationContactRequest) {
        Intrinsics.checkNotNullParameter(conversationContactRequest, "conversationContactRequest");
        this.f99500a = conversationContactRequest;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        return ((uc) this.f99500a).f133465b;
    }

    @Override // pb2.f
    public final int r() {
        return 5;
    }
}
