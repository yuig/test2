package q0;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.ImageView;
import c0.w;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import d7.g;
import df.j1;
import f0.h;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import m60.e0;
import m60.x0;
import pk.a0;
import u50.i0;
import yl1.l;
import ym1.p;

/* loaded from: classes2.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101753i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f101754j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Context context, int i13) {
        super(1);
        this.f101753i = i13;
        this.f101754j = context;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f101753i;
        Context context = this.f101754j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a03 = j1.a0(context.getString(x0.brand_survey_invite_message));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                int i14 = eo1.b.color_themed_text_default;
                Object obj = d5.a.f53679a;
                return rn1.a.y(it, bs1.c.h2(h.l0(context.getColor(i14), a03)), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, g.q(context.getResources(), x0.copy_link, "getString(...)"), null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, g.q(context.getResources(), x0.report_link, "getString(...)"), null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, g.q(context.getResources(), x0.iab_open_in_browser, "getString(...)"), null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 11:
            case 12:
            case 13:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Spanned fromHtml = Html.fromHtml(context.getResources().getString(com.pinterest.partnerAnalytics.g.analytics_feedback_message1), 63);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(fromHtml), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = context.getString(ct1.e.pin_web_tip);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Spanned fromHtml2 = Html.fromHtml(j1.Y(string, new Object[]{e0.a()}, null, 6));
                Intrinsics.checkNotNullExpressionValue(fromHtml2, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(fromHtml2), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, a0.o0(context), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(context, "<this>");
                return rn1.a.y(it, null, null, null, null, dl2.b.T1(context) ? vn1.g.HEADING_400 : vn1.g.HEADING_700, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, a0.o0(context), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, a0.o0(context), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a04 = j1.a0(context.getString(fb0.f.comment_with_warning_confirmation));
                Intrinsics.checkNotNullExpressionValue(a04, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a04), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = kotlin.collections.e0.b(vn1.b.CENTER_HORIZONTAL);
                vn1.g gVar = vn1.g.BODY_300;
                String string2 = context.getString(fb0.f.question_comment_pin_description);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string2), null, b13, null, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097130);
        }
    }

    public final void e(p bind) {
        int i13 = this.f101753i;
        Context context = this.f101754j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(oc0.p.custom_slot);
                bind.f139446f = imageView;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                ym1.g variant = ym1.g.NOTIFICATION;
                bind.getClass();
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind.f139445e = variant;
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(oc0.p.custom_slot);
                bind.f139446f = imageView2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101753i;
        Context context = this.f101754j;
        switch (i13) {
            case 0:
                w cameraX = (w) obj;
                f fVar = f.f101757h;
                Intrinsics.checkNotNullExpressionValue(cameraX, "cameraX");
                fVar.f101762e = cameraX;
                Context t13 = r.t(context);
                Intrinsics.checkNotNullExpressionValue(t13, "getApplicationContext(context)");
                fVar.f101763f = t13;
                break;
            case 1:
                z9.e0 A = kh2.j1.A(context);
                A.w((Bundle) obj);
                break;
            case 2:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
                Context it2 = (Context) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 4:
                i0 it3 = (i0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 5:
                e((p) obj);
                break;
            case 6:
                e((p) obj);
                break;
            case 11:
                l bind = (l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(a0.o1(context));
                break;
            case 12:
                ln0 draft = (ln0) obj;
                Intrinsics.checkNotNullParameter(draft, "draft");
                tp y13 = draft.y();
                Context applicationContext = context.getApplicationContext();
                Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
                break;
            case 13:
                ln0 pinLocalData = (ln0) obj;
                Intrinsics.checkNotNullParameter(pinLocalData, "pinLocalData");
                tp y14 = pinLocalData.y();
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.g(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                break;
        }
        return b((rn1.a) obj);
    }
}
