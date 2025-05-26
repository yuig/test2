package p62;

import android.view.View;
import com.pinterest.shuffles.composer.ui.widget.SceneViewContainer;
import kotlin.jvm.internal.Intrinsics;
import rl2.u;
import v.z1;

/* loaded from: classes4.dex */
public final class g extends nl2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SceneViewContainer f98931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Boolean bool, SceneViewContainer sceneViewContainer, int i13) {
        super(bool);
        this.f98930b = i13;
        this.f98931c = sceneViewContainer;
    }

    @Override // nl2.a
    public final void a(Object obj, u property, Object obj2) {
        int i13 = this.f98930b;
        SceneViewContainer sceneViewContainer = this.f98931c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue) {
                    sceneViewContainer.f().f92996c = booleanValue;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                View view = (View) obj2;
                if (!Intrinsics.d((View) obj, view)) {
                    z1 z1Var = sceneViewContainer.f51904k;
                    ((SceneViewContainer) z1Var.f123758c).g().setEnabled(view == null);
                    z1Var.f123757b = (view != null || z1Var.f123756a) ? Integer.valueOf(((SceneViewContainer) z1Var.f123758c).f().f93008o.f92983a) : null;
                    SceneViewContainer sceneViewContainer2 = (SceneViewContainer) z1Var.f123758c;
                    sceneViewContainer2.f51906m.I(sceneViewContainer2.f());
                    break;
                }
                break;
        }
    }
}
