package ed1;

import android.content.Context;
import android.widget.ImageView;
import com.pinterest.feature.sharesheet.view.InviteModalAppView;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppView;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppWithBadgeView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58535a;

    /* renamed from: b, reason: collision with root package name */
    public final g91.d f58536b;

    public b(g91.d listener, int i13) {
        this.f58535a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f58536b = listener;
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f58536b = listener;
        } else {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f58536b = listener;
        }
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        switch (this.f58535a) {
            case 0:
                InviteModalAppView view = (InviteModalAppView) nVar;
                os.g contact = (os.g) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(contact, "model");
                g91.d listener = this.f58536b;
                view.getClass();
                Intrinsics.checkNotNullParameter(contact, "contact");
                Intrinsics.checkNotNullParameter(listener, "listener");
                String text = contact.f97485b;
                Intrinsics.checkNotNullExpressionValue(text, "text");
                pk.a0.p(view.f48402e, text);
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                boolean T1 = dl2.b.T1(context);
                GestaltIconButton gestaltIconButton = view.f48401d;
                ImageView imageView = view.f48400c;
                if (!T1 || gestaltIconButton == null || contact.f97487d == null) {
                    imageView.setImageDrawable(contact.f97484a);
                    imageView.setBackgroundColor(dl2.b.y0(view, eo1.a.sema_color_background_transparent));
                    if (gestaltIconButton != null) {
                        com.bumptech.glide.c.d0(gestaltIconButton);
                    }
                } else {
                    g3.y(gestaltIconButton, new fd1.q(contact, 0));
                    bs1.c.X0(imageView);
                }
                imageView.setBackgroundColor(dl2.b.y0(view, eo1.a.sema_color_background_transparent));
                view.setOnClickListener(new fd1.p(listener, contact, 0));
                break;
            case 1:
                SharesheetModalAppView view2 = (SharesheetModalAppView) nVar;
                os.g model = (os.g) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view2.a(model, this.f58536b);
                break;
            default:
                SharesheetModalAppWithBadgeView view3 = (SharesheetModalAppWithBadgeView) nVar;
                dd1.a model2 = (dd1.a) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                g91.d listener2 = this.f58536b;
                view3.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(listener2, "listener");
                view3.f48422c.a(model2, listener2);
                view3.f48423d.setVisibility(0);
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f58535a;
        switch (i14) {
            case 0:
                os.g model = (os.g) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            case 1:
                os.g model2 = (os.g) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                }
            default:
                Intrinsics.checkNotNullParameter((dd1.a) obj, "model");
                break;
        }
        return null;
    }
}
