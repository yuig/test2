package vr1;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.identity.password.StrongPasswordTextField;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import u50.g0;
import u50.k0;
import xm1.l;
import yb0.o;
import yb0.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StrongPasswordTextField f126456b;

    public /* synthetic */ a(StrongPasswordTextField strongPasswordTextField, int i13) {
        this.f126455a = i13;
        this.f126456b = strongPasswordTextField;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        int i13 = this.f126455a;
        StrongPasswordTextField this$0 = this.f126456b;
        switch (i13) {
            case 0:
                f fVar = StrongPasswordTextField.f49845m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.a) {
                    hf0.b.k(this$0.f49851h);
                    int i14 = g.f126462a[this$0.f49849f.ordinal()];
                    int i15 = 1;
                    if (i14 != 1) {
                        if (i14 != 2) {
                            return;
                        }
                        w wVar = this$0.f49848e;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        Context context = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        j jVar = new j(context);
                        LinearLayout i16 = jVar.i();
                        i16.removeAllViews();
                        View.inflate(context, yr1.b.view_strong_password_tips, i16);
                        ((GestaltButton) jVar.findViewById(yr1.a.password_tips_okay_button)).e(new gh1.e(jVar, 13));
                        wVar.d(new yb0.e(jVar));
                        return;
                    }
                    Context context2 = this$0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    k0 b13 = g0.b(new String[0], yr1.c.strong_password_tips_title);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) this$0.getContext().getString(yr1.c.strong_password_tips_details));
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    SpannableString spannableString = new SpannableString(this$0.getContext().getString(yr1.c.strong_password_tips_what_to_avoid));
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append(this$0.getContext().getText(yr1.c.strong_password_tips_common_passwords));
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(this$0.getContext().getText(yr1.c.strong_password_tips_recent_dates));
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(this$0.getContext().getText(yr1.c.strong_password_tips_simple_patterns));
                    spannableStringBuilder.append((CharSequence) "\n");
                    p pVar = new p(context2, new o(b13, bs1.c.p2(spannableStringBuilder), g0.b(new String[0], x0.okay), false, false, null, 0, 1008));
                    pVar.f(new a(this$0, i15));
                    w wVar2 = this$0.f49848e;
                    if (wVar2 != null) {
                        wVar2.d(new yb0.e(pVar));
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            default:
                f fVar2 = StrongPasswordTextField.f49845m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof l) {
                    w wVar3 = this$0.f49848e;
                    if (wVar3 != null) {
                        wVar3.d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
        }
    }
}
