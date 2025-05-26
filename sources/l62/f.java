package l62;

import android.content.Context;
import android.graphics.PointF;
import android.util.Size;
import android.view.View;
import com.pinterest.shuffles.composer.ui.ComposerView;
import com.pinterest.shuffles.composer.ui.widget.ActionMenu;
import com.pinterest.shuffles.composer.ui.widget.SceneViewContainer;
import com.pinterest.shuffles.scene.composer.c1;
import kotlin.jvm.internal.Intrinsics;
import r72.l1;

/* loaded from: classes4.dex */
public final class f implements p62.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposerView f81630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f81631b;

    public f(ComposerView composerView, Context context) {
        this.f81630a = composerView;
        this.f81631b = context;
    }

    @Override // p62.d
    public final void a(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81630a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            View view = composerView.f51862t;
            if (view == null) {
                Intrinsics.r("horizontalGuideline");
                throw null;
            }
            view.setVisibility(8);
            View view2 = composerView.f51863u;
            if (view2 == null) {
                Intrinsics.r("verticalGuideline");
                throw null;
            }
            view2.setVisibility(8);
            composerView.f51858p.H(o13);
        }
    }

    @Override // p62.d
    public final void b(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81630a;
        composerView.Y();
        if (com.pinterest.shuffles.scene.composer.y.o(item) != null) {
            int i13 = com.pinterest.shuffles.scene.composer.z.f52181a;
            SceneViewContainer sceneViewContainer = composerView.f51861s;
            if (sceneViewContainer == null) {
                Intrinsics.r("sceneViewContainer");
                throw null;
            }
            Size a13 = sceneViewContainer.e().a();
            PointF pointF = item.f79320b.f79304a;
            PointF b13 = com.pinterest.shuffles.scene.composer.z.b(a13, pointF.x, pointF.y);
            float abs = Math.abs(b13.y);
            Context context = this.f81631b;
            boolean z13 = abs < ((float) kg.a.g0(5, context));
            boolean z14 = Math.abs(b13.x) < ((float) kg.a.g0(5, context));
            View view = composerView.f51862t;
            if (view == null) {
                Intrinsics.r("horizontalGuideline");
                throw null;
            }
            view.setVisibility(z13 ? 0 : 8);
            View view2 = composerView.f51863u;
            if (view2 != null) {
                view2.setVisibility(z14 ? 0 : 8);
            } else {
                Intrinsics.r("verticalGuideline");
                throw null;
            }
        }
    }

    @Override // p62.d
    public final void c(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81630a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            composerView.f51858p.E(o13);
        }
    }

    @Override // p62.d
    public final void d(ke2.d item) {
        double d2;
        double a13;
        float f13;
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81630a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            int i13 = com.pinterest.shuffles.scene.composer.z.f52181a;
            SceneViewContainer sceneViewContainer = composerView.f51861s;
            if (sceneViewContainer == null) {
                Intrinsics.r("sceneViewContainer");
                throw null;
            }
            Size a14 = sceneViewContainer.e().a();
            PointF pointF = item.f79320b.f79304a;
            PointF b13 = com.pinterest.shuffles.scene.composer.z.b(a14, pointF.x, pointF.y);
            ke2.i iVar = item.f79319a;
            if (iVar instanceof com.pinterest.shuffles.scene.composer.h) {
                a13 = iVar.a();
                f13 = ((com.pinterest.shuffles.scene.composer.h) iVar).f52050p;
            } else {
                if (!(iVar instanceof c1)) {
                    d2 = 1.0d;
                    composerView.f51858p.s(o13, new l1(b13.x, b13.y), d2, -item.f79320b.f79306c.a());
                }
                a13 = iVar.a();
                f13 = ((c1) iVar).f52020t;
            }
            d2 = a13 / f13;
            composerView.f51858p.s(o13, new l1(b13.x, b13.y), d2, -item.f79320b.f79306c.a());
        }
    }

    @Override // p62.d
    public final void e(ke2.d item, int i13) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81630a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            composerView.f51858p.o(i13, o13);
        }
    }

    @Override // p62.d
    public final void f(ke2.d item, int i13) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81630a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            composerView.f51858p.d(i13, o13);
        }
    }

    @Override // p62.d
    public final void g(ke2.d item, int i13) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81630a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            composerView.f51858p.L(i13, o13);
        }
        SceneViewContainer sceneViewContainer = composerView.f51861s;
        if (sceneViewContainer == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        sceneViewContainer.c().e(h62.n.composer_action_menu_lock, oe.f.W0(item));
        SceneViewContainer sceneViewContainer2 = composerView.f51861s;
        if (sceneViewContainer2 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        ActionMenu c13 = sceneViewContainer2.c();
        int i14 = h62.n.composer_action_menu_hide;
        Intrinsics.checkNotNullParameter(item, "<this>");
        Object obj = item.f79321c.get(2);
        Boolean bool = (Boolean) (obj != null ? obj : null);
        c13.e(i14, bool != null ? bool.booleanValue() : false);
    }

    @Override // p62.d
    public final void h() {
        this.f81630a.f51858p.N();
    }

    @Override // p62.d
    public final void i(PointF location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f81630a.f51858p.i(location);
    }

    @Override // p62.d
    public final void j(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81630a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            composerView.f51858p.v(o13);
        }
    }
}
