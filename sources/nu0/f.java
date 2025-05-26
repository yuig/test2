package nu0;

import com.pinterest.feature.ideaPinCreation.drafts.view.IdeaPinDraftPreview;
import com.pinterest.feature.ideaPinCreation.metadata.view.settings.SettingsPartnerBrandItemView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import cv0.p;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import pk.a0;
import rq.t4;
import yk1.n;

/* loaded from: classes5.dex */
public final class f extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92325a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f92326b;

    public f(s1 experiments, int i13) {
        this.f92325a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            this.f92326b = experiments;
        } else {
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            this.f92326b = experiments;
        }
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        switch (this.f92325a) {
            case 0:
                IdeaPinDraftPreview view = (IdeaPinDraftPreview) nVar;
                ku0.a model = (ku0.a) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                WebImageView webImageView = view.f46470d;
                webImageView.clear();
                webImageView.Y(null);
                GestaltText gestaltText = view.f46469c;
                a0.k0(gestaltText);
                long j13 = model.f80892e;
                GestaltText gestaltText2 = view.f46471e;
                if (j13 == 0) {
                    a0.k0(gestaltText2);
                } else {
                    gestaltText2.i(new d(j13, view, (int) (j13 / pb0.i.SECONDS.getMilliseconds())));
                }
                String description = model.f80893f;
                Intrinsics.checkNotNullParameter(description, "description");
                view.f46472f.i(new t4(description, model.f80889b, 11));
                view.setOnClickListener(new com.pinterest.feature.home.view.c(model, 4));
                e listener = new e(model, i13, 0);
                Intrinsics.checkNotNullParameter(listener, "listener");
                view.f46473g.u(new defpackage.a(14, listener));
                e listener2 = new e(model, i13, 1);
                Intrinsics.checkNotNullParameter(listener2, "listener");
                view.f46467a = listener2;
                String str = model.f80890c;
                if (str == null) {
                    str = "";
                }
                File file = new File(str);
                if (!file.exists()) {
                    view.postDelayed(new vs0.b(view, 4), 270L);
                    a0.w1(gestaltText);
                    break;
                } else {
                    c cVar = new c(view);
                    WebImageView webImageView2 = view.f46470d;
                    webImageView2.Y(cVar);
                    webImageView2.t2(file);
                    break;
                }
            default:
                SettingsPartnerBrandItemView view2 = (SettingsPartnerBrandItemView) nVar;
                p model2 = (p) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                String brandTitle = model2.f53287b;
                view2.getClass();
                Intrinsics.checkNotNullParameter(brandTitle, "brandTitle");
                GestaltText gestaltText3 = (GestaltText) view2.f46548b.getValue();
                Intrinsics.checkNotNullExpressionValue(gestaltText3, "<get-title>(...)");
                a0.p(gestaltText3, brandTitle);
                String imageUrl = model2.f53288c;
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                String name = model2.f53287b;
                Intrinsics.checkNotNullParameter(name, "name");
                ((GestaltAvatar) view2.f46547a.getValue()).H2(new fv0.g(model2.f53289d, imageUrl, name));
                boolean d2 = this.f92326b.d();
                GestaltText gestaltText4 = (GestaltText) view2.f46549c.getValue();
                Intrinsics.checkNotNullExpressionValue(gestaltText4, "<get-approvalStatus>(...)");
                a0.p(gestaltText4, model2.f53290e ? bs1.c.f2(view2, aq1.h.idea_pin_metadata_paid_partnership_tag_approved) : d2 ? bs1.c.f2(view2, aq1.h.idea_pin_metadata_paid_partnership_tag_pending_publish_new) : bs1.c.f2(view2, aq1.h.idea_pin_metadata_paid_partnership_tag_pending_publish));
                Function0 action = model2.f53291f;
                Intrinsics.checkNotNullParameter(action, "action");
                view2.f46550d = action;
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f92325a) {
            case 0:
                ku0.a model = (ku0.a) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                p model2 = (p) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return null;
    }
}
