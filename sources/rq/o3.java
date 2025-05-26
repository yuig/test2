package rq;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o3 extends cf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109427a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f109428b;

    public o3(af2.c cVar, int i13) {
        this.f109427a = i13;
        this.f109428b = cVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        int i13 = this.f109427a;
        Object obj = this.f109428b;
        switch (i13) {
            case 0:
                kg.n.a(view);
                Intrinsics.checkNotNullParameter(view, "view");
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 1:
                kg.n.a(view);
                Intrinsics.checkNotNullParameter(view, "widget");
                ((CommentPreviewView) obj).f35104m.invoke(uq.p.Username);
                return;
            case 2:
                kg.n.a(view);
                Intrinsics.checkNotNullParameter(view, "widget");
                ((ki0.c) obj).f7().d(Navigation.w1(com.pinterest.screens.z3.c()));
                return;
            case 3:
                kg.n.a(view);
                Intrinsics.checkNotNullParameter(view, "text");
                z21.a aVar = ((b31.g) obj).K0;
                if (aVar == null) {
                    Intrinsics.r("viewListener");
                    throw null;
                }
                a31.d dVar = (a31.d) aVar;
                NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.i3.f50983q.getValue());
                w13.m0("com.pinterest.EXTRA_USER_ID", dVar.f505a);
                w13.Y1("com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", true);
                wy0 wy0Var = dVar.f517m;
                if (wy0Var == null || (str = wy0Var.o()) == null) {
                    str = "";
                }
                w13.m0("com.pinterest.node_id", str);
                dVar.f508d.d(w13);
                return;
            default:
                kg.n.a(view);
                Intrinsics.checkNotNullParameter(view, "widget");
                ib1.b bVar = (ib1.b) obj;
                lu1.b bVar2 = bVar.f72023f;
                if (bVar2 == null) {
                    Intrinsics.r("baseActivityHelper");
                    throw null;
                }
                Context context = bVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ((lu1.c) bVar2).m(context, bVar.f72022e);
                return;
        }
    }

    public o3(View.OnClickListener onClickListener) {
        this.f109427a = 0;
        this.f109428b = onClickListener;
    }
}
