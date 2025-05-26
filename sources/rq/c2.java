package rq;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109121i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltText f109122j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(GestaltText gestaltText, int i13) {
        super(1);
        this.f109121i = i13;
        this.f109122j = gestaltText;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f109121i;
        GestaltText this_apply = this.f109122j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(this_apply.getResources(), m60.x0.product_detail_shipping_title, "getString(...)"), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                CharSequence a03 = df.j1.a0(bs1.c.f2(this_apply, pd0.c.branded_content_learn_more_about_make_money));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                return rn1.a.y(it, bs1.c.h2(f0.h.l0(bs1.c.B(this_apply, eo1.b.color_themed_text_default), a03)), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                CharSequence a04 = df.j1.a0(bs1.c.f2(this_apply, pd0.c.branded_content_learn_more_about_partnership));
                Intrinsics.checkNotNullExpressionValue(a04, "fromHtml(...)");
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                return rn1.a.y(it, bs1.c.h2(f0.h.l0(bs1.c.B(this_apply, eo1.b.color_themed_text_default), a04)), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                CharSequence a05 = df.j1.a0(bs1.c.f2(this_apply, pd0.c.branded_content_get_support));
                Intrinsics.checkNotNullExpressionValue(a05, "fromHtml(...)");
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                return rn1.a.y(it, bs1.c.h2(f0.h.l0(bs1.c.B(this_apply, eo1.b.color_themed_text_default), a05)), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                List j13 = kotlin.collections.f0.j(vn1.b.START, vn1.b.CENTER_VERTICAL);
                vn1.g gVar = vn1.g.UI_300;
                List b13 = kotlin.collections.e0.b(vn1.e.REGULAR);
                vn1.c cVar = vn1.c.DEFAULT;
                rn1.b bVar = rn1.b.END;
                rm1.f fVar = new rm1.f(rm1.q.SEARCH);
                Context context = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, null, cVar, j13, b13, null, 2, null, bVar, null, new rm1.d(fVar, dl2.b.T1(context) ? rm1.c.DEFAULT : rm1.c.SUBTLE, null, 0, null, 28), false, 0, null, null, gVar, null, null, false, null, null, 2080081);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context2 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                vn1.g a13 = pk.a0.a(context2);
                List b14 = kotlin.collections.e0.b(vn1.b.CENTER);
                int i14 = bd0.c.content_creation_menu_title_start_creating;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new u50.k0(i14, new ArrayList(0)), null, b14, null, a13, 0, null, null, null, null, false, 0, null, null, null, null, null, false, fm1.a.YES, null, 1572842);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                Spanned fromHtml = Html.fromHtml(this_apply.getResources().getString(xp1.d.turn_on_signal), 0);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.p2(fromHtml), null, kotlin.collections.e0.b(vn1.b.CENTER), kotlin.collections.e0.b(vn1.e.BOLD), null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096114);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                List b15 = kotlin.collections.e0.b(vn1.b.CENTER);
                vn1.c cVar2 = vn1.c.LIGHT;
                CharSequence text = this_apply.getResources().getText(aq1.h.idea_pin_product_tagging_email_confirm_message);
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                return rn1.a.y(it, bs1.c.h2(text), cVar2, b15, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097144);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                List b16 = kotlin.collections.e0.b(vn1.b.CENTER);
                vn1.c cVar3 = vn1.c.LIGHT;
                u50.f0 h23 = bs1.c.h2(bs1.c.f2(this_apply, aq1.h.idea_pin_product_tagging_email_confirm_title));
                vn1.g gVar2 = vn1.h.f126278d;
                vn1.g gVar3 = vn1.g.HEADING_700;
                return rn1.a.y(it, h23, cVar3, b16, kotlin.collections.e0.b(vn1.e.BOLD), gVar3, 0, null, null, null, null, false, 0, null, gVar2, gVar3, null, null, false, null, null, 2072544);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(bs1.c.f2(this_apply, m60.x0.see_more)), vn1.c.LIGHT, kotlin.collections.e0.b(vn1.b.CENTER), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097144);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                return rn1.a.y(it, bs1.c.h2(bs1.c.f2(this_apply, aq1.h.idea_pin_board_sticker)), null, null, kotlin.collections.f0.j(vn1.e.BOLD, vn1.e.ITALIC), vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(bs1.c.f2(this_apply, aq1.h.idea_pin_image_sticker)), null, null, kotlin.collections.f0.j(vn1.e.BOLD, vn1.e.ITALIC), vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(this_apply.getResources(), m42.e.search_results_hair_pattern_title, "getString(...)"), null, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, null, null, null, null, false, m42.c.hair_pattern_selector_title, d7.g.q(this_apply.getResources(), m42.e.search_results_hair_pattern_title, "getString(...)"), null, null, null, null, false, null, null, 2090986);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence string = df.j1.a0(this_apply.getResources().getString(f52.c.settings_parental_code_forgot_instructions, this_apply.getResources().getString(c52.e.manage_parental_passcode_url)));
                Intrinsics.checkNotNullExpressionValue(string, "fromHtml(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a06 = df.j1.a0(this_apply.getResources().getString(f52.c.settings_parental_code_forgot_instructions, this_apply.getResources().getString(c52.e.manage_parental_passcode_url)));
                Intrinsics.checkNotNullExpressionValue(a06, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a06), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                boolean linksClickable = this_apply.getLinksClickable();
                CharSequence a07 = df.j1.a0(this_apply.getContext().getString(c52.e.product_tagging_disabled));
                Intrinsics.checkNotNullExpressionValue(a07, "fromHtml(...)");
                Context context3 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return rn1.a.y(it, bs1.c.h2(f0.h.l0(dl2.b.x0(context3, vn1.c.ERROR.getColorRes()), a07)), null, null, null, null, 0, null, null, null, null, linksClickable, 0, null, null, null, null, null, false, null, null, 2096126);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(this_apply.getResources(), tq1.c.story_pin_video_still_uploading, "getString(...)"), vn1.c.LIGHT, kotlin.collections.e0.b(vn1.b.CENTER), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097144);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context4 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                return rn1.a.y(it, null, null, null, null, pk.a0.s(context4), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context5 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                return rn1.a.y(it, null, null, null, null, pk.a0.s(context5), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context6 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                return rn1.a.y(it, null, null, null, null, pk.a0.s(context6), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context7 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                return rn1.a.y(it, null, null, null, kotlin.collections.e0.b(vn1.e.BOLD), pk.a0.u(context7), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097127);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context8 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                Intrinsics.checkNotNullParameter(context8, "<this>");
                return rn1.a.y(it, null, null, null, null, dl2.b.T1(context8) ? vn1.g.UI_100 : vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context9 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                return rn1.a.y(it, null, null, null, null, pk.a0.t(context9), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context10 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                return rn1.a.y(it, null, null, null, null, pk.a0.w(context10), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(this_apply.getResources(), up1.c.hashtag_modal_title, "getString(...)"), null, kotlin.collections.e0.b(vn1.b.CENTER), kotlin.collections.e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097138);
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                CharSequence string2 = df.j1.a0(this_apply.getContext().getString(vq1.d.recover_account_help_center_link));
                Intrinsics.checkNotNullExpressionValue(string2, "fromHtml(...)");
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new u50.f0(string2), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f109121i) {
        }
        return b((rn1.a) obj);
    }
}
