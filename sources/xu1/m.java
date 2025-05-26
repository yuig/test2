package xu1;

import androidx.lifecycle.z;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements androidx.lifecycle.f {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f135960a;

    public m(j0 applicationScope) {
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        this.f135960a = applicationScope;
    }

    @Override // androidx.lifecycle.f
    public final void onPause(z owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        y.f135989c.c(j.BACKGROUND);
        kotlin.jvm.internal.j.z(this.f135960a, null, null, new k(2, null), 3);
    }

    @Override // androidx.lifecycle.f
    public final void onResume(z owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        y.f135989c.c(j.FOREGROUND);
        kotlin.jvm.internal.j.z(this.f135960a, null, null, new l(2, null), 3);
    }
}
