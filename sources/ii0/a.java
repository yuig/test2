package ii0;

import android.content.Context;
import com.pinterest.feature.account.recovery.view.ResetPasswordView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import cp.b0;
import gb2.d;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import uj2.q;
import yk1.c;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final d f72298a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f72299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d resetAccountModal, cr1.a accountService, uk1.d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(resetAccountModal, "resetAccountModal");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f72298a = resetAccountModal;
        this.f72299b = accountService;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(gi0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        final ResetPasswordView resetPasswordView = (ResetPasswordView) view;
        resetPasswordView.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        resetPasswordView.f45066e = this;
        GestaltText gestaltText = resetPasswordView.f45064c;
        if (gestaltText == null) {
            Intrinsics.r("resendTv");
            throw null;
        }
        final int i13 = 0;
        gestaltText.j(new gm1.a() { // from class: ji0.c
            @Override // gm1.a
            public final void h3(gm1.c it) {
                ResetPasswordView resetPasswordView2;
                Context context;
                int i14 = i13;
                ResetPasswordView this$0 = resetPasswordView;
                switch (i14) {
                    case 0:
                        int i15 = ResetPasswordView.f45061f;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        ii0.a aVar = this$0.f45066e;
                        if (aVar != null) {
                            gb2.d dVar = aVar.f72298a;
                            if (!(dVar instanceof hi0.b)) {
                                if ((dVar instanceof hi0.a) && (context = (resetPasswordView2 = (ResetPasswordView) ((gi0.a) aVar.getView())).getContext()) != null) {
                                    String string = resetPasswordView2.getResources().getString(yr1.c.url_account_recovery_contact);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    HashSet hashSet = tb0.h.f117076w;
                                    tb0.h hVar = tb0.g.f117075a;
                                    Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
                                    f0.h.P(context, string, hVar);
                                    break;
                                }
                            } else {
                                ek2.f i16 = aVar.f72299b.j(dVar.f64745a).l(tk2.e.f118017c).h(wj2.c.a()).i(new b0(aVar, 10), new dh0.a(16, new hh0.a(aVar, 8)));
                                Intrinsics.checkNotNullExpressionValue(i16, "subscribe(...)");
                                aVar.addDisposable(i16);
                                break;
                            }
                        }
                        break;
                    default:
                        int i17 = ResetPasswordView.f45061f;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        ii0.a aVar2 = this$0.f45066e;
                        if (aVar2 != null && aVar2.isBound()) {
                            ((ResetPasswordView) ((gi0.a) aVar2.getView())).getClass();
                            a.c.y(u.f85943a);
                            break;
                        }
                        break;
                }
            }
        });
        GestaltButton gestaltButton = resetPasswordView.f45065d;
        if (gestaltButton == null) {
            Intrinsics.r("okButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton.e(new gm1.a() { // from class: ji0.c
            @Override // gm1.a
            public final void h3(gm1.c it) {
                ResetPasswordView resetPasswordView2;
                Context context;
                int i142 = i14;
                ResetPasswordView this$0 = resetPasswordView;
                switch (i142) {
                    case 0:
                        int i15 = ResetPasswordView.f45061f;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        ii0.a aVar = this$0.f45066e;
                        if (aVar != null) {
                            gb2.d dVar = aVar.f72298a;
                            if (!(dVar instanceof hi0.b)) {
                                if ((dVar instanceof hi0.a) && (context = (resetPasswordView2 = (ResetPasswordView) ((gi0.a) aVar.getView())).getContext()) != null) {
                                    String string = resetPasswordView2.getResources().getString(yr1.c.url_account_recovery_contact);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    HashSet hashSet = tb0.h.f117076w;
                                    tb0.h hVar = tb0.g.f117075a;
                                    Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
                                    f0.h.P(context, string, hVar);
                                    break;
                                }
                            } else {
                                ek2.f i16 = aVar.f72299b.j(dVar.f64745a).l(tk2.e.f118017c).h(wj2.c.a()).i(new b0(aVar, 10), new dh0.a(16, new hh0.a(aVar, 8)));
                                Intrinsics.checkNotNullExpressionValue(i16, "subscribe(...)");
                                aVar.addDisposable(i16);
                                break;
                            }
                        }
                        break;
                    default:
                        int i17 = ResetPasswordView.f45061f;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        ii0.a aVar2 = this$0.f45066e;
                        if (aVar2 != null && aVar2.isBound()) {
                            ((ResetPasswordView) ((gi0.a) aVar2.getView())).getClass();
                            a.c.y(u.f85943a);
                            break;
                        }
                        break;
                }
            }
        });
    }
}
