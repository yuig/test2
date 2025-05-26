package p91;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z3;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99325i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f99326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(w wVar, int i13) {
        super(1);
        this.f99325i = i13;
        this.f99326j = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yb0.n a13;
        int i13 = this.f99325i;
        int i14 = 1;
        w wVar = this.f99326j;
        switch (i13) {
            case 0:
                Object c13 = ((tt1.a) obj).c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                HashMap hashMap = wVar.f99340h;
                bd1.b bVar = bd1.b.EMAIL_FIELD;
                String newEmailAddress = (String) z0.e(bVar.getValue(), hashMap);
                wVar.f99337e.a(new d91.l(newEmailAddress, 1));
                wVar.f99335c.d(new k(bVar, newEmailAddress));
                nm.s v13 = ((nm.u) c13).v("email_changing_to");
                if (Intrinsics.d(v13 != null ? v13.p() : null, newEmailAddress)) {
                    q91.u uVar = (q91.u) ((l91.i) wVar.getView());
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(newEmailAddress, "newEmailAddress");
                    m60.w f73 = uVar.f7();
                    int i15 = yb0.n.f138503p;
                    Context requireContext = uVar.requireContext();
                    String string = uVar.getString(b52.c.email_change_title_almost_done);
                    String string2 = uVar.getString(b52.c.email_change_message_confirmation_sent, newEmailAddress);
                    String string3 = uVar.getString(x0.okay);
                    Intrinsics.f(requireContext);
                    Intrinsics.f(string);
                    Intrinsics.f(string3);
                    a13 = xa0.j.a(requireContext, string, string2, string3, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? yb0.k.f138491j : new q91.t(uVar, 0), (r20 & 64) != 0 ? yb0.k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : new q91.t(uVar, 1), (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
                    f73.d(new yb0.e(a13));
                } else {
                    yk1.n view = wVar.getView();
                    Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                    ((q91.u) ((l91.i) view)).W8(b52.c.edit_email_success, false);
                }
                q91.u uVar2 = (q91.u) ((l91.i) wVar.getView());
                hf0.b.l(uVar2.requireActivity());
                uVar2.D5();
                break;
            case 1:
                String typedPasscode = (String) obj;
                Intrinsics.checkNotNullParameter(typedPasscode, "typedPasscode");
                w.D3(wVar, typedPasscode, false, 2);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                ((q91.u) ((l91.i) wVar.getView())).X8(true);
                Intrinsics.f(th3);
                if (r91.b.c(th3) && wVar.isBound()) {
                    ((q91.u) ((l91.i) wVar.getView())).y6(new t(wVar, i14));
                } else if (r91.b.d(th3) && wVar.isBound()) {
                    ((q91.u) ((l91.i) wVar.getView())).z3(new h81.b(wVar, 4));
                } else if (r91.b.b(th3) && wVar.isBound()) {
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) z3.f51677c.getValue());
                    HashMap hashMap2 = wVar.f99340h;
                    w13.m0("com.pinterest.EXTRA_EMAIL", (String) hashMap2.get(bd1.b.EMAIL_FIELD.getValue()));
                    w13.b("com.pinterest.EXTRA_PRIOR_EMAIL_CHANGE_REQUEST", hashMap2);
                    wVar.f99335c.d(w13);
                } else {
                    w.t3(wVar, th3);
                }
                break;
        }
        return Unit.f80348a;
    }
}
