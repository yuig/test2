package wm0;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import kotlin.jvm.internal.Intrinsics;
import xk2.k;
import xk2.m;
import xk2.n;

/* loaded from: classes5.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    public final View f130245b;

    /* renamed from: c, reason: collision with root package name */
    public final View f130246c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f130247d;

    /* renamed from: e, reason: collision with root package name */
    public final k f130248e;

    /* renamed from: f, reason: collision with root package name */
    public final k f130249f;

    /* renamed from: g, reason: collision with root package name */
    public a f130250g;

    public f(FloatingToolbarView baseTools, ComposeView baseHeader, RecyclerView scrollable) {
        Intrinsics.checkNotNullParameter(baseTools, "baseTools");
        Intrinsics.checkNotNullParameter(baseHeader, "baseHeader");
        Intrinsics.checkNotNullParameter(scrollable, "scrollable");
        this.f130245b = baseTools;
        this.f130246c = baseHeader;
        this.f130247d = scrollable;
        n nVar = n.NONE;
        this.f130248e = m.a(nVar, e.f130238j);
        this.f130249f = m.a(nVar, e.f130239k);
        this.f130250g = a.NoTools;
    }

    public final void a(a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (this.f130250g == mode) {
            return;
        }
        this.f130250g = mode;
        int i13 = d.f130237a[mode.ordinal()];
        k kVar = this.f130248e;
        k kVar2 = this.f130249f;
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            vm0.c.a((vm0.c) kVar.getValue(), this.f130246c, true, 0L, 28);
            vm0.c.a((vm0.c) kVar2.getValue(), this.f130245b, false, 0L, 28);
            ((vm0.c) kVar2.getValue()).d();
            return;
        }
        vm0.c.a((vm0.c) kVar.getValue(), this.f130246c, true, 0L, 28);
        vm0.c.a((vm0.c) kVar2.getValue(), this.f130245b, true, 0L, 28);
        ((vm0.c) kVar2.getValue()).e(this.f130247d, this.f130245b);
    }
}
