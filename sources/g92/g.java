package g92;

import androidx.appcompat.app.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface g {
    static /* synthetic */ void a(g gVar, n nVar, boolean z13, boolean z14, int i13) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        gVar.e(nVar, z13, z14);
    }

    default void b(n activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(this, activity, false, false, 4);
    }

    e c();

    a d(Object... objArr);

    default void e(n activity, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object[] args = {Boolean.valueOf(z14)};
        Intrinsics.checkNotNullParameter(args, "args");
        h.a(activity, ((f) c()).a(), d(Boolean.valueOf(z14)), z13);
    }
}
