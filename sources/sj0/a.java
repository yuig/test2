package sj0;

import android.content.Context;
import android.content.res.Resources;
import bs1.c;
import com.pinterest.api.model.v7;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import d7.g;
import df.j1;
import do1.d;
import do1.l;
import g70.h;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import qj0.b;
import rm1.f;
import rm1.i;
import rm1.q;
import x60.e;

/* loaded from: classes5.dex */
public final class a extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f113011d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f113012e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f113013f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f113014g;

    public a(v7 board, d0 pinalytics, h boardNavigator) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f113012e = board;
        this.f113013f = pinalytics;
        this.f113014g = boardNavigator;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        switch (this.f113011d) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                String Y = j1.Y("%s\n%s", new Object[]{(CharSequence) this.f113012e, (String) this.f113013f}, null, 6);
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new GestaltToast(context, new d(c.h2(Y), new l(new f(q.ARROW_CIRCLE_FORWARD, i.LG)), null, null, 0, 0, 0, null, false, 508));
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Resources resources = container.getResources();
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new GestaltToast(context2, new d(g.q(resources, e.create_new_group_board_success, "getString(...)"), new l(new f(q.ARROW_CIRCLE_FORWARD, i.LG)), null, null, 0, 0, 0, null, false, 508));
        }
    }

    @Override // we0.a
    public final void b(Context context) {
        int i13 = this.f113011d;
        Object obj = this.f113014g;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                super.b(context);
                qj0.a aVar = (qj0.a) obj;
                b bVar = aVar.f104008a;
                bVar.f104014d.f0(u0.BOARD_MORE_IDEAS_UPSELL_TOAST, g0.TOAST, aVar.f104009b, new HashMap(), false);
                hh0.a aVar2 = new hh0.a(aVar.f104010c, 16);
                h.g(bVar.f104016f, aVar.f104009b, null, aVar2, 2);
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                ((d0) this.f113013f).F(g0.MODAL_CREATE_BOARD, u0.CONVERSATION_GROUP_BOARD_UPSELL_GROUP_BOARD_CREATE_TOAST_BUTTON);
                h.f((h) obj, (v7) this.f113012e, fk0.i.f62290r, 2);
                break;
        }
    }

    public a(CharSequence title, String subtitle, qj0.a toastClickedListener) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(toastClickedListener, "toastClickedListener");
        this.f113012e = title;
        this.f113013f = subtitle;
        this.f113014g = toastClickedListener;
    }
}
