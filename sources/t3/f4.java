package t3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f4 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        Outline b13 = ((g4) view).f116022e.b();
        Intrinsics.f(b13);
        outline.set(b13);
    }
}
