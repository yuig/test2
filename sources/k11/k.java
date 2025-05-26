package k11;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public j f78148a;

    public final void a() {
        this.f78148a = new j();
    }

    public final void b(Function1 update, boolean z13) {
        Intrinsics.checkNotNullParameter(update, "update");
        if (z13) {
            a();
        }
        this.f78148a = (j) update.invoke(this.f78148a);
    }
}
