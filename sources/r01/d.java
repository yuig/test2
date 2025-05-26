package r01;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f105712a;

    public d(b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f105712a = activeUserManager;
    }

    public final boolean a() {
        wy0 f13 = ((b60.d) this.f105712a).f();
        if (f13 != null) {
            return dl2.b.O1(f13, false) || dl2.b.R1(f13);
        }
        return false;
    }
}
