package p62;

import android.view.View;
import com.pinterest.shuffles.composer.ui.widget.SceneViewContainer;
import com.pinterest.shuffles.composer.ui.widget.ZOrderIndicator;
import kotlin.jvm.internal.Intrinsics;
import o62.k;
import rl2.u;
import v.z1;

/* loaded from: classes4.dex */
public final class e implements b, o62.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SceneViewContainer f98929a;

    public /* synthetic */ e(SceneViewContainer sceneViewContainer) {
        this.f98929a = sceneViewContainer;
    }

    @Override // o62.c
    public void G(k handler, ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f98929a.f51894a.j(item);
    }

    @Override // o62.c
    public void I(k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        ke2.d dVar = handler.f93004k;
        if (dVar == null) {
            return;
        }
        SceneViewContainer sceneViewContainer = this.f98929a;
        z1 z1Var = sceneViewContainer.f51904k;
        int i13 = handler.f93008o.f92984b;
        int size = handler.f92994a.getF52892h().f79314f.size();
        Integer num = (Integer) z1Var.f123757b;
        if (num != null) {
            i13 = num.intValue();
        }
        z1Var.A(i13, size);
        sceneViewContainer.f51894a.f(dVar, i13);
    }

    @Override // o62.c
    public void P(k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        ke2.d dVar = handler.f93004k;
        if (dVar == null) {
            return;
        }
        SceneViewContainer sceneViewContainer = this.f98929a;
        SceneViewContainer.a(sceneViewContainer);
        ke2.c f52892h = sceneViewContainer.e().getF52892h();
        f52892h.f79316h = dVar;
        f52892h.f79310b = true;
        sceneViewContainer.c().setVisibility(sceneViewContainer.f51897d ? 0 : 8);
        View view = sceneViewContainer.f51901h;
        if (view == null) {
            Intrinsics.r("longPressSceneOverlay");
            throw null;
        }
        view.setVisibility(0);
        int i13 = handler.f93008o.f92984b;
        int size = handler.f92994a.getF52892h().f79314f.size();
        z1 z1Var = sceneViewContainer.f51904k;
        ((SceneViewContainer) z1Var.f123758c).g().setVisibility(0);
        ZOrderIndicator g13 = ((SceneViewContainer) z1Var.f123758c).g();
        u[] uVarArr = ZOrderIndicator.f51907n;
        g13.f51909a.d(g13, uVarArr[0], Integer.valueOf(i13));
        ZOrderIndicator g14 = ((SceneViewContainer) z1Var.f123758c).g();
        g14.f51910b.d(g14, uVarArr[1], Integer.valueOf(size));
        sceneViewContainer.f51894a.g(dVar, handler.f93008o.f92984b);
    }

    @Override // o62.c
    public void Q(k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f98929a.f51894a.h();
    }

    @Override // o62.c
    public void a(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f98929a.f51894a.a(item);
    }

    @Override // o62.c
    public void b(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f98929a.f51894a.b(item);
    }

    @Override // o62.c
    public void c(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f98929a.f51894a.c(item);
    }

    @Override // p62.b
    public void d(Integer num) {
        SceneViewContainer sceneViewContainer = this.f98929a;
        ke2.d dVar = sceneViewContainer.f().f93004k;
        if (dVar == null) {
            return;
        }
        sceneViewContainer.f51895b.E(dVar, num);
    }

    @Override // o62.c
    public void e(k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        ke2.d dVar = handler.f93004k;
        if (dVar == null) {
            return;
        }
        SceneViewContainer sceneViewContainer = this.f98929a;
        SceneViewContainer.a(sceneViewContainer);
        int i13 = handler.f93008o.f92984b;
        int size = handler.f92994a.getF52892h().f79314f.size();
        z1 z1Var = sceneViewContainer.f51904k;
        Integer num = (Integer) z1Var.f123757b;
        if (num != null) {
            i13 = num.intValue();
        }
        ZOrderIndicator g13 = ((SceneViewContainer) z1Var.f123758c).g();
        u[] uVarArr = ZOrderIndicator.f51907n;
        g13.f51909a.d(g13, uVarArr[0], Integer.valueOf(i13));
        ZOrderIndicator g14 = ((SceneViewContainer) z1Var.f123758c).g();
        g14.f51910b.d(g14, uVarArr[1], Integer.valueOf(size));
        ke2.c f52892h = sceneViewContainer.e().getF52892h();
        f52892h.f79316h = null;
        f52892h.f79310b = true;
        sceneViewContainer.c().setVisibility(8);
        View view = sceneViewContainer.f51901h;
        if (view == null) {
            Intrinsics.r("longPressSceneOverlay");
            throw null;
        }
        view.setVisibility(8);
        ((SceneViewContainer) z1Var.f123758c).g().setVisibility(8);
        z1Var.f123756a = false;
        z1Var.f123757b = null;
        sceneViewContainer.f51894a.e(dVar, i13);
    }

    @Override // p62.b
    public void i(int i13) {
        SceneViewContainer sceneViewContainer = this.f98929a;
        ke2.d dVar = sceneViewContainer.f().f93004k;
        if (dVar == null) {
            return;
        }
        sceneViewContainer.f51904k.f123756a = true;
        sceneViewContainer.f51895b.B(dVar, i13);
    }

    @Override // o62.c
    public void m(k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        ke2.d dVar = handler.f93004k;
        if (dVar == null) {
            return;
        }
        this.f98929a.f51894a.d(dVar);
    }

    @Override // o62.c
    public void q(k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f98929a.f51894a.i(handler.f92997d);
    }
}
