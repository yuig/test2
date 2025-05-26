package aa2;

import h32.d4;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import ls1.j;
import m60.w;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final w f1685a;

    public a(w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f1685a = eventManager;
    }

    public final void a(int i13, d4 d4Var) {
        if (d4Var == null || i13 < 0 || !c0.y(new d4[]{d4.SEARCH, d4.PIN, d4.FEED}, d4Var)) {
            return;
        }
        this.f1685a.d(new j(i13, d4Var));
    }
}
