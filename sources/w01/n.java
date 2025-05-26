package w01;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.h4;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;
import m60.t0;
import m60.u0;
import m60.x0;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f127087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f127088c;

    public /* synthetic */ n(Object obj, boolean z13, int i13) {
        this.f127086a = i13;
        this.f127088c = obj;
        this.f127087b = z13;
    }

    @Override // ak2.a
    public final void run() {
        yb0.n a13;
        int i13 = this.f127086a;
        boolean z13 = this.f127087b;
        Object obj = this.f127088c;
        switch (i13) {
            case 0:
                PinCloseupPresenter this$0 = (PinCloseupPresenter) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) PinCloseupPresenter.access$getView(this$0);
                pinCloseupFragment.G9();
                if (ig1.b.h0()) {
                    if (pinCloseupFragment.Y1 == null) {
                        pinCloseupFragment.Y1 = MediaPlayer.create(pinCloseupFragment.getContext(), xb2.c.button_click_5);
                    }
                    MediaPlayer mediaPlayer = pinCloseupFragment.Y1;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q91.o0 this$02 = (q91.o0) obj;
                int i14 = q91.o0.f103151s0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                m60.w f73 = this$02.f7();
                bd1.b bVar = bd1.b.BIRTHDAY_FIELD;
                Calendar calendar = this$02.f103165p0;
                if (calendar == null) {
                    Intrinsics.r("cal");
                    throw null;
                }
                f73.d(new p91.k(bVar, String.valueOf(calendar.getTimeInMillis())));
                if (z13) {
                    this$02.f7().d(Navigation.w1(h4.a()));
                    return;
                }
                this$02.D5();
                FragmentActivity E4 = this$02.E4();
                if (E4 != null) {
                    va.f b13 = va.f.b(E4, s0.confetti_variable_final_android);
                    try {
                        ms1.b bVar2 = this$02.H;
                        if (bVar2 != null) {
                            bVar2.inflateConfettiContainer();
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    ImageView imageView = (ImageView) E4.findViewById(t0.confetti_image_view);
                    if (imageView != null) {
                        imageView.setImageDrawable(b13);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new e21.d(b13, 2), this$02.getResources().getInteger(u0.anim_speed_slow));
                }
                this$02.f7().d(new dg0.c(dg0.b.COMPLETE));
                String string = this$02.getString(h52.c.age_collection_update_success);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                this$02.f7().d(new i92.i(new i92.g(string)));
                return;
            default:
                ab1.c this$03 = (ab1.c) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                i92.k kVar = ((bb1.i) ((ya1.a) this$03.getView())).f22511l0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.k(l52.c.settings_disable_mfa_email_sent);
                if (z13) {
                    return;
                }
                ya1.a aVar = (ya1.a) this$03.getView();
                wy0 wy0Var = this$03.f1704d;
                if (wy0Var == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                String email = wy0Var.N2();
                if (email == null) {
                    email = "";
                }
                bb1.i iVar = (bb1.i) aVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(email, "email");
                m60.w f74 = iVar.f7();
                int i15 = yb0.n.f138503p;
                Context requireContext = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String string2 = iVar.getString(l52.c.settings_disable_mfa_forgot_alert_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Context requireContext2 = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                String string3 = iVar.getString(l52.c.settings_disable_mfa_forgot_alert_description);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                SpannableStringBuilder D = f0.h.D(requireContext2, string3, email);
                String string4 = iVar.getString(x0.okay);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = iVar.getString(l52.c.settings_disable_mfa_forgot_alert_resend_email);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                a13 = xa0.j.a(requireContext, string2, D, string4, (r20 & 16) != 0 ? "" : string5, (r20 & 32) != 0 ? yb0.k.f138491j : null, (r20 & 64) != 0 ? yb0.k.f138492k : new h81.b(iVar, 10), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
                f74.d(new yb0.e(a13));
                return;
        }
    }
}
