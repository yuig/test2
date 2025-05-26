package wt1;

import android.view.View;
import g1.p0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nx.r0;
import sq0.g0;
import sq0.h0;

/* loaded from: classes4.dex */
public final class f0 implements vq0.f {

    /* renamed from: a, reason: collision with root package name */
    public final vq0.e f131110a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.o f131111b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f131112c;

    public f0(vq0.e dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f131110a = dataSource;
        this.f131111b = new a7.o(true);
        this.f131112c = new LinkedHashSet();
    }

    public final void I0(int i13, r0 provide) {
        Intrinsics.checkNotNullParameter(provide, "provide");
        a7.o oVar = this.f131111b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(provide, "provide");
        ((p0) oVar.f1155b).j(i13, new g0(provide));
        this.f131112c.add(Integer.valueOf(i13));
    }

    @Override // yq0.a0
    public final yk1.m S(int i13) {
        vq0.h hVar = (vq0.h) this.f131111b.g(i13);
        if (hVar != null) {
            return hVar.f();
        }
        return null;
    }

    @Override // vq0.f
    public final Set X1() {
        throw null;
    }

    @Override // sq0.e0
    public final int a() {
        return this.f131110a.a();
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return this.f131110a.getItemViewType(i13);
    }

    @Override // vq0.f
    public final void o(int i13, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f131111b.j(i13, viewBinderInstance);
        this.f131112c.add(Integer.valueOf(i13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yq0.a0
    public final void p(int i13, yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        vq0.e eVar = this.f131110a;
        h0 g13 = this.f131111b.g(eVar.getItemViewType(i13));
        vq0.h hVar = g13 instanceof vq0.h ? (vq0.h) g13 : null;
        Object item = eVar.getItem(i13);
        if (hVar == null || item == null) {
            return;
        }
        hVar.c(view, item, i13);
        String g14 = hVar.g(i13, item);
        if (g14 == null || !(!kotlin.text.z.j(g14))) {
            return;
        }
        View view2 = view instanceof View ? (View) view : null;
        if (view2 == null) {
            return;
        }
        view2.setContentDescription(g14);
    }
}
