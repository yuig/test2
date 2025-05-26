package ed0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import jc0.s;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import ra0.l0;
import so.i7;
import so.oa;
import so.r8;
import x02.x2;

/* loaded from: classes5.dex */
public final class e extends yk1.l {

    /* renamed from: a, reason: collision with root package name */
    public final i7 f58506a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.e f58507b;

    /* renamed from: c, reason: collision with root package name */
    public g f58508c;

    public e(i7 presenterFactory, uk1.e presenterPinalyticsFactory) {
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        this.f58506a = presenterFactory;
        this.f58507b = presenterPinalyticsFactory;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        GestaltButton d2;
        GestaltButton d13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final g gVar = new g(context);
        final int i13 = 1;
        if (!gVar.f58512b) {
            gVar.f58512b = true;
            ((h) gVar.generatedComponent()).getClass();
        }
        View.inflate(context, pd0.b.branded_content_confirm_unenrollment, gVar);
        GestaltButton gestaltButton = (GestaltButton) gVar.findViewById(pd0.a.confirm_button);
        final int i14 = 0;
        if (gestaltButton != null && (d13 = gestaltButton.d(b.f58499k)) != null) {
            d13.e(new gm1.a() { // from class: ed0.f
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i14;
                    g this$0 = gVar;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            dd0.c cVar = this$0.f58513c;
                            if (cVar != null) {
                                cVar.f54443a.d(new s());
                                break;
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            dd0.c cVar2 = this$0.f58513c;
                            if (cVar2 != null) {
                                xj2.c o13 = cVar2.f54444b.a(false).r(tk2.e.f118017c).l(wj2.c.a()).o(new k90.i(12, new l0(cVar2, 18)), new k90.i(13, dd0.a.f54437m));
                                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                                cVar2.addDisposable(o13);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        GestaltButton gestaltButton2 = (GestaltButton) gVar.findViewById(pd0.a.cancel_button);
        if (gestaltButton2 != null && (d2 = gestaltButton2.d(b.f58500l)) != null) {
            d2.e(new gm1.a() { // from class: ed0.f
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i13;
                    g this$0 = gVar;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            dd0.c cVar = this$0.f58513c;
                            if (cVar != null) {
                                cVar.f54443a.d(new s());
                                break;
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            dd0.c cVar2 = this$0.f58513c;
                            if (cVar2 != null) {
                                xj2.c o13 = cVar2.f54444b.a(false).r(tk2.e.f118017c).l(wj2.c.a()).o(new k90.i(12, new l0(cVar2, 18)), new k90.i(13, dd0.a.f54437m));
                                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                                cVar2.addDisposable(o13);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f58508c = gVar;
        jc0.n nVar = new jc0.n(context);
        g gVar2 = this.f58508c;
        if (gVar2 == null) {
            Intrinsics.r("modalView");
            throw null;
        }
        nVar.x(gVar2);
        nVar.q(false);
        nVar.T(false);
        nVar.Z(bs1.c.W(nVar, eo1.c.space_800), bs1.c.W(nVar, eo1.c.space_800), bs1.c.W(nVar, eo1.c.space_800), bs1.c.W(nVar, eo1.c.space_800));
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        uk1.d g13 = ((uk1.a) this.f58507b).g();
        r8 r8Var = this.f58506a.f113463a;
        w wVar = (w) r8Var.f114090a.f113885r0.get();
        oa oaVar = r8Var.f114090a;
        dd0.c cVar = new dd0.c(wVar, (k12.a) oaVar.Je.get(), (x2) oaVar.f113800m3.get(), (b60.b) oaVar.f113850p0.get(), g13);
        g gVar = this.f58508c;
        if (gVar != null) {
            gVar.f58513c = cVar;
            return cVar;
        }
        Intrinsics.r("modalView");
        throw null;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        g gVar = this.f58508c;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("modalView");
        throw null;
    }
}
