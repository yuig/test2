package ac2;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1974a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f1975b;

    public i0(Function2 function2) {
        this.f1975b = function2;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        xk2.w t13 = (xk2.w) obj;
        Intrinsics.checkNotNullParameter(t13, "t");
        if (((Number) t13.f135236c).longValue() != -9223372036854775807L) {
            AtomicBoolean atomicBoolean = this.f1974a;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            this.f1975b.invoke(t13.f135234a, t13.f135236c);
        }
    }
}
