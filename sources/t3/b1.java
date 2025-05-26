package t3;

import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f115855a = new b1();

    public final void a(@NotNull View view, n3.n nVar) {
        PointerIcon systemIcon = nVar instanceof n3.a ? PointerIcon.getSystemIcon(view.getContext(), ((n3.a) nVar).f89028b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (Intrinsics.d(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
