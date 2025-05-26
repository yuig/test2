package wm0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.feature.board.selectpins.BoardSelectPinsHeaderView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kotlin.jvm.internal.Intrinsics;
import xk2.k;
import xk2.m;
import xk2.n;

/* loaded from: classes5.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    public final View f130252b;

    /* renamed from: c, reason: collision with root package name */
    public final View f130253c;

    /* renamed from: d, reason: collision with root package name */
    public final View f130254d;

    /* renamed from: e, reason: collision with root package name */
    public final View f130255e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f130256f;

    /* renamed from: g, reason: collision with root package name */
    public final k f130257g;

    /* renamed from: h, reason: collision with root package name */
    public final k f130258h;

    /* renamed from: i, reason: collision with root package name */
    public final k f130259i;

    /* renamed from: j, reason: collision with root package name */
    public final k f130260j;

    /* renamed from: k, reason: collision with root package name */
    public a f130261k;

    public h(FloatingToolbarView baseTools, GestaltToolbarImpl baseHeader, FloatingToolbarView organizeTools, BoardSelectPinsHeaderView organizeHeader, RecyclerView scrollable) {
        Intrinsics.checkNotNullParameter(baseTools, "baseTools");
        Intrinsics.checkNotNullParameter(baseHeader, "baseHeader");
        Intrinsics.checkNotNullParameter(organizeTools, "organizeTools");
        Intrinsics.checkNotNullParameter(organizeHeader, "organizeHeader");
        Intrinsics.checkNotNullParameter(scrollable, "scrollable");
        this.f130252b = baseTools;
        this.f130253c = baseHeader;
        this.f130254d = organizeTools;
        this.f130255e = organizeHeader;
        this.f130256f = scrollable;
        n nVar = n.NONE;
        this.f130257g = m.a(nVar, e.f130240l);
        this.f130258h = m.a(nVar, e.f130242n);
        this.f130259i = m.a(nVar, e.f130241m);
        this.f130260j = m.a(nVar, e.f130243o);
        this.f130261k = a.NoTools;
    }

    public final void a() {
        ((vm0.c) this.f130257g.getValue()).c();
        ((vm0.c) this.f130259i.getValue()).c();
        ((vm0.c) this.f130258h.getValue()).c();
        ((vm0.c) this.f130260j.getValue()).c();
    }

    public final void b() {
        k kVar = this.f130259i;
        vm0.c.a((vm0.c) kVar.getValue(), this.f130252b, false, 0L, 28);
        ((vm0.c) kVar.getValue()).d();
    }

    public final void c() {
        vm0.c.a((vm0.c) this.f130258h.getValue(), this.f130255e, false, 0L, 28);
    }

    public final void d() {
        k kVar = this.f130260j;
        vm0.c.a((vm0.c) kVar.getValue(), this.f130254d, false, 0L, 28);
        ((vm0.c) kVar.getValue()).d();
    }

    public final void e(a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (this.f130261k == mode) {
            return;
        }
        this.f130261k = mode;
        int i13 = g.f130251a[mode.ordinal()];
        k kVar = this.f130257g;
        RecyclerView recyclerView = this.f130256f;
        if (i13 == 1) {
            vm0.c.a((vm0.c) kVar.getValue(), this.f130253c, true, 0L, 28);
            k kVar2 = this.f130259i;
            vm0.c.a((vm0.c) kVar2.getValue(), this.f130252b, true, 0L, 28);
            ((vm0.c) kVar2.getValue()).e(recyclerView, this.f130252b);
            c();
            d();
            return;
        }
        if (i13 == 2) {
            vm0.c.a((vm0.c) this.f130258h.getValue(), this.f130255e, true, 0L, 28);
            k kVar3 = this.f130260j;
            vm0.c.a((vm0.c) kVar3.getValue(), this.f130254d, true, 0L, 28);
            ((vm0.c) kVar3.getValue()).e(recyclerView, this.f130254d);
            vm0.c.a((vm0.c) kVar.getValue(), this.f130253c, false, 0L, 28);
            b();
            return;
        }
        if (i13 == 3) {
            vm0.c.a((vm0.c) kVar.getValue(), this.f130253c, true, 0L, 28);
            b();
            c();
            d();
            return;
        }
        if (i13 != 4) {
            return;
        }
        vm0.c.a((vm0.c) kVar.getValue(), this.f130253c, false, 0L, 28);
        b();
        c();
        d();
    }
}
