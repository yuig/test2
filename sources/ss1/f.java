package ss1;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.u;
import ao2.v0;
import ho2.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public ts1.b f115146a;

    /* renamed from: b, reason: collision with root package name */
    public FragmentActivity f115147b;

    public final void a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FragmentActivity fragmentActivity = this.f115147b;
        if (fragmentActivity == null) {
            throw new IllegalStateException("Don't call this after the activity is finished!".toString());
        }
        u S = bf.b.S(fragmentActivity);
        ko2.f fVar = v0.f20219a;
        j.z(S, q.f69782a, null, new e(this, block, null), 2);
    }
}
