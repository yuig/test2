package ji0;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.account.recovery.view.ResetPasswordView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import fd1.d1;
import fd1.e1;
import kc1.w;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import pk.a0;
import so.s8;
import u50.f0;

/* loaded from: classes5.dex */
public final class b extends yk1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76240a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f76241b;

    /* renamed from: c, reason: collision with root package name */
    public Object f76242c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String usernameOrEmail) {
        this(new hi0.b(usernameOrEmail));
        Intrinsics.checkNotNullParameter(usernameOrEmail, "email");
        Intrinsics.checkNotNullParameter(usernameOrEmail, "usernameOrEmail");
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        switch (this.f76240a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                ResetPasswordView resetPasswordView = new ResetPasswordView(context);
                resetPasswordView.a();
                gb2.d resetAccountModal = (gb2.d) this.f76241b;
                Intrinsics.checkNotNullParameter(resetAccountModal, "resetAccountModal");
                if (resetAccountModal instanceof hi0.b) {
                    String str = resetAccountModal.f64745a;
                    Context context2 = resetPasswordView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltText gestaltText = resetPasswordView.f45064c;
                    if (gestaltText == null) {
                        Intrinsics.r("resendTv");
                        throw null;
                    }
                    String string = resetPasswordView.getResources().getString(yr1.c.didnt_get_password_reset);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = resetPasswordView.getResources().getString(yr1.c.click_to_resend_password_reset_email);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    f0.h.n(context2, gestaltText, string, string2);
                    GestaltText gestaltText2 = resetPasswordView.f45063b;
                    if (gestaltText2 == null) {
                        Intrinsics.r("textView");
                        throw null;
                    }
                    CharSequence a03 = j1.a0(resetPasswordView.getResources().getString(yr1.c.password_reset_email_sent_confirmation_message, str));
                    Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                    a0.q(gestaltText2, bs1.c.h2(a03));
                } else if (resetAccountModal instanceof hi0.a) {
                    String str2 = resetAccountModal.f64745a;
                    GestaltText gestaltText3 = resetPasswordView.f45062a;
                    if (gestaltText3 == null) {
                        Intrinsics.r("headerText");
                        throw null;
                    }
                    String string3 = resetPasswordView.getResources().getString(yr1.c.account_recovery_header);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    Intrinsics.checkNotNullParameter(string3, "string");
                    a0.q(gestaltText3, new f0(string3));
                    Context context3 = resetPasswordView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    GestaltText gestaltText4 = resetPasswordView.f45064c;
                    if (gestaltText4 == null) {
                        Intrinsics.r("resendTv");
                        throw null;
                    }
                    String string4 = resetPasswordView.getResources().getString(yr1.c.account_recovery_email_without_access);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    String string5 = resetPasswordView.getResources().getString(yr1.c.account_recovery_help_center);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    f0.h.n(context3, gestaltText4, string4, string5);
                    GestaltText gestaltText5 = resetPasswordView.f45063b;
                    if (gestaltText5 == null) {
                        Intrinsics.r("textView");
                        throw null;
                    }
                    CharSequence string6 = j1.a0(resetPasswordView.getResources().getString(yr1.c.account_recovery_email_sent_confirmation_message, str2));
                    Intrinsics.checkNotNullExpressionValue(string6, "fromHtml(...)");
                    Intrinsics.checkNotNullParameter(string6, "string");
                    a0.q(gestaltText5, new f0(string6));
                    GestaltButton gestaltButton = resetPasswordView.f45065d;
                    if (gestaltButton == null) {
                        Intrinsics.r("okButton");
                        throw null;
                    }
                    gestaltButton.d(new hh0.a(resetPasswordView, 9));
                }
                this.f76242c = resetPasswordView;
                ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
                ResetPasswordView resetPasswordView2 = (ResetPasswordView) this.f76242c;
                if (resetPasswordView2 == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                modalViewWrapper.t(resetPasswordView2);
                modalViewWrapper.q(false);
                return modalViewWrapper;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                ModalViewWrapper modalViewWrapper2 = new ModalViewWrapper(context);
                modalViewWrapper2.setVisibility(8);
                return modalViewWrapper2;
        }
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        switch (this.f76240a) {
            case 0:
                ResetPasswordView resetPasswordView = (ResetPasswordView) this.f76242c;
                if (resetPasswordView == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                Context context = resetPasswordView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                s8 s8Var = (s8) ((a) o.a(bs1.c.k0(context), a.class));
                return new ii0.a((gb2.d) this.f76241b, (cr1.a) s8Var.f114255d.B2.get(), ((uk1.a) ((uk1.e) s8Var.f114255d.f113702ga.get())).g(), s8Var.z5());
            default:
                return new nd0.a(0);
        }
    }

    @Override // yk1.l
    public final yk1.n getView() {
        switch (this.f76240a) {
            case 0:
                ResetPasswordView resetPasswordView = (ResetPasswordView) this.f76242c;
                if (resetPasswordView != null) {
                    return resetPasswordView;
                }
                Intrinsics.r("view");
                throw null;
            default:
                return new e1();
        }
    }

    @Override // jc0.b, jc0.a0
    public final void setOverlay(View view) {
        View inflate;
        switch (this.f76240a) {
            case 1:
                super.setOverlay(view);
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null && (inflate = LayoutInflater.from(((ViewGroup) view).getContext()).inflate(a62.d.downloading_video_modal_view, viewGroup)) != null) {
                    int color = viewGroup.getContext().getColor(eo1.b.color_white_0);
                    ProgressBar progressBar = (ProgressBar) inflate.findViewById(a62.c.progress_spinner);
                    Drawable progressDrawable = progressBar.getProgressDrawable();
                    if (progressDrawable == null) {
                        progressDrawable = progressBar.getIndeterminateDrawable();
                    }
                    Drawable mutate = progressDrawable.mutate();
                    Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
                    mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                    progressBar.setProgressDrawable(mutate);
                    ((uk2.f) this.f76241b).A(wj2.c.a()).H(tk2.e.f118017c).F(new ed1.g(24, new w(progressBar, 15)), new ed1.g(25, d1.f61905k), ck2.i.f27923c, ck2.i.f27924d);
                    View findViewById = inflate.findViewById(a62.c.brio_spinner);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    s0.w((GestaltSpinner) findViewById, d1.f61904j);
                    ((GestaltText) inflate.findViewById(a62.c.cancel_button)).j(new ca1.h(this, 18));
                    break;
                }
                break;
            default:
                super.setOverlay(view);
                break;
        }
    }

    public b(gb2.d resetAccountModal) {
        Intrinsics.checkNotNullParameter(resetAccountModal, "resetAccountModal");
        this.f76241b = resetAccountModal;
    }

    public b(uk2.f downloadProgressSubject, fd1.c cancelListener) {
        Intrinsics.checkNotNullParameter(downloadProgressSubject, "downloadProgressSubject");
        Intrinsics.checkNotNullParameter(cancelListener, "cancelListener");
        this.f76241b = downloadProgressSubject;
        this.f76242c = cancelListener;
    }
}
