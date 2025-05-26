package j51;

import com.pinterest.feature.profile.savedtab.view.GroupMyProfilePinsUpsellView;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final c51.d f74754a;

    public k(c51.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f74754a = listener;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        rg0.n nVar2;
        c51.c view = (c51.c) nVar;
        f51.a model = (f51.a) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        ag2.e eVar = model.f61205a.f108068j;
        rg0.a0 a0Var = eVar instanceof rg0.a0 ? (rg0.a0) eVar : null;
        if (a0Var == null) {
            return;
        }
        String title = a0Var.f15163a;
        if (title == null) {
            title = "";
        }
        ArrayList imageUrls = a0Var.f107958e;
        GroupMyProfilePinsUpsellView groupMyProfilePinsUpsellView = (GroupMyProfilePinsUpsellView) view;
        groupMyProfilePinsUpsellView.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        String subtitle = a0Var.f107956c;
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        String completeButtonText = a0Var.f107957d;
        Intrinsics.checkNotNullParameter(completeButtonText, "completeButtonText");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        final c51.d listener = this.f74754a;
        Intrinsics.checkNotNullParameter(listener, "listener");
        groupMyProfilePinsUpsellView.f47576a.i(new b31.f(title, 8));
        groupMyProfilePinsUpsellView.f47577b.i(new b31.f(subtitle, 9));
        groupMyProfilePinsUpsellView.f47583h = listener;
        final int i14 = 0;
        groupMyProfilePinsUpsellView.f47581f.u(new gm1.a() { // from class: j51.j
            @Override // gm1.a
            public final void h3(gm1.c it) {
                rg0.n nVar3;
                rg0.n nVar4;
                int i15 = i14;
                c51.d listener2 = listener;
                switch (i15) {
                    case 0:
                        int i16 = GroupMyProfilePinsUpsellView.f47575j;
                        Intrinsics.checkNotNullParameter(listener2, "$listener");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            d51.h hVar = (d51.h) listener2;
                            dl1.s item = hVar.getItem(0);
                            f51.a aVar = item instanceof f51.a ? (f51.a) item : null;
                            if (aVar != null && (nVar3 = aVar.f61205a) != null) {
                                nVar3.c(null, null);
                            }
                            hVar.removeItem(0);
                            break;
                        }
                        break;
                    default:
                        int i17 = GroupMyProfilePinsUpsellView.f47575j;
                        Intrinsics.checkNotNullParameter(listener2, "$listener");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d51.h hVar2 = (d51.h) listener2;
                        dl1.s item2 = hVar2.getItem(0);
                        f51.a aVar2 = item2 instanceof f51.a ? (f51.a) item2 : null;
                        if (aVar2 != null && (nVar4 = aVar2.f61205a) != null) {
                            nVar4.a(null, null);
                        }
                        ((g51.n) hVar2.L).N3();
                        hVar2.removeItem(0);
                        break;
                }
            }
        });
        final int i15 = 1;
        groupMyProfilePinsUpsellView.f47582g.d(new b31.f(completeButtonText, 10)).e(new gm1.a() { // from class: j51.j
            @Override // gm1.a
            public final void h3(gm1.c it) {
                rg0.n nVar3;
                rg0.n nVar4;
                int i152 = i15;
                c51.d listener2 = listener;
                switch (i152) {
                    case 0:
                        int i16 = GroupMyProfilePinsUpsellView.f47575j;
                        Intrinsics.checkNotNullParameter(listener2, "$listener");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            d51.h hVar = (d51.h) listener2;
                            dl1.s item = hVar.getItem(0);
                            f51.a aVar = item instanceof f51.a ? (f51.a) item : null;
                            if (aVar != null && (nVar3 = aVar.f61205a) != null) {
                                nVar3.c(null, null);
                            }
                            hVar.removeItem(0);
                            break;
                        }
                        break;
                    default:
                        int i17 = GroupMyProfilePinsUpsellView.f47575j;
                        Intrinsics.checkNotNullParameter(listener2, "$listener");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d51.h hVar2 = (d51.h) listener2;
                        dl1.s item2 = hVar2.getItem(0);
                        f51.a aVar2 = item2 instanceof f51.a ? (f51.a) item2 : null;
                        if (aVar2 != null && (nVar4 = aVar2.f61205a) != null) {
                            nVar4.a(null, null);
                        }
                        ((g51.n) hVar2.L).N3();
                        hVar2.removeItem(0);
                        break;
                }
            }
        });
        String str = (String) CollectionsKt.U(0, imageUrls);
        if (str != null) {
            groupMyProfilePinsUpsellView.f47578c.loadUrl(str);
        }
        String str2 = (String) CollectionsKt.U(1, imageUrls);
        if (str2 != null) {
            groupMyProfilePinsUpsellView.f47579d.loadUrl(str2);
        }
        String str3 = (String) CollectionsKt.U(2, imageUrls);
        if (str3 != null) {
            groupMyProfilePinsUpsellView.f47580e.loadUrl(str3);
        }
        if (!groupMyProfilePinsUpsellView.isAttachedToWindow() || groupMyProfilePinsUpsellView.f47584i) {
            return;
        }
        dl1.s item = ((d51.h) listener).getItem(0);
        f51.a aVar = item instanceof f51.a ? (f51.a) item : null;
        if (aVar != null && (nVar2 = aVar.f61205a) != null) {
            nVar2.g();
        }
        groupMyProfilePinsUpsellView.f47584i = true;
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f51.a model = (f51.a) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
