package rq;

import android.text.SpannableString;
import android.text.style.BulletSpan;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.qp;
import com.pinterest.feature.board.headerimage.BoardHeaderImageView;
import com.pinterest.feature.ideaPinCreation.producttagging.view.IdeaPinProductTagsItemView;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class t4 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i */
    public final /* synthetic */ int f109559i;

    /* renamed from: j */
    public final /* synthetic */ boolean f109560j;

    /* renamed from: k */
    public final /* synthetic */ String f109561k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(String str, boolean z13, int i13) {
        super(1);
        this.f109559i = i13;
        this.f109561k = str;
        this.f109560j = z13;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f109559i;
        u50.k0 k0Var = null;
        String str = this.f109561k;
        boolean z13 = this.f109560j;
        switch (i13) {
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c Z = d7.b.Z(z13);
                if (str != null) {
                    k0Var = bs1.c.j2(new String[]{str}, n42.e.recent_search_clear_with_text);
                }
                return om1.c.e(it, null, null, null, Z, k0Var, false, 0, 999);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c Z2 = d7.b.Z(z13);
                if (str != null) {
                    k0Var = bs1.c.j2(new String[]{str}, n42.e.recent_search_clear_with_text);
                }
                return om1.c.e(it, null, null, null, Z2, k0Var, false, 0, 999);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rn1.a e(rn1.a it) {
        String str;
        CharSequence string;
        int i13 = this.f109559i;
        str = "";
        boolean z13 = this.f109560j;
        String string2 = this.f109561k;
        switch (i13) {
            case 0:
                return rn1.a.y(it, jq.b.p(it, "it", string2, "string", string2), null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(z13 ? rm1.q.MUSIC_OFF : rm1.q.MUSIC_ON, rm1.i.XS), rm1.c.LIGHT, null, 0, null, 28), false, 0, null, null, null, null, null, false, null, null, 2096638);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = vn1.c.DEFAULT;
                vn1.g gVar = vn1.g.BODY_300;
                if (z13) {
                    SpannableString spannableString = new SpannableString(string2);
                    spannableString.setSpan(new BulletSpan(8), 0, 1, 17);
                    string2 = spannableString;
                }
                return rn1.a.y(it, bs1.c.h2(string2), cVar, null, null, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097132);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar2 = vn1.g.BODY_200;
                if (z13) {
                    SpannableString spannableString2 = new SpannableString(string2);
                    spannableString2.setSpan(new BulletSpan(8), 0, 1, 17);
                    string = StringsKt.i0(spannableString2);
                } else {
                    string = StringsKt.i0(string2).toString();
                }
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, gVar2, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 3:
                return rn1.a.y(it, jq.b.p(it, "it", string2, "string", string2), null, kotlin.collections.e0.b(vn1.b.START), z13 ? kotlin.collections.e0.b(vn1.e.BOLD) : kotlin.collections.q0.f80391a, vn1.g.BODY_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, fm1.b.LOCALE, 1048546);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(String.valueOf(string2)), null, null, null, null, 0, z13 ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string2), null, null, null, null, 0, z13 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 6:
            case 10:
            case 12:
            case 20:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string2), null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string2), null, z13 ? kotlin.collections.e0.b(vn1.b.CENTER_HORIZONTAL) : kotlin.collections.e0.b(vn1.b.START), null, null, 0, string2.length() > 0 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097082);
            case 8:
                return rn1.a.y(it, jq.b.p(it, "it", string2, "string", string2), null, null, null, z13 ? vn1.g.UI_300 : vn1.g.UI_400, 0, d7.b.Z(!kotlin.text.z.j(string2)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097070);
            case 9:
                return rn1.a.y(it, jq.b.p(it, "it", string2, "string", string2), null, null, null, z13 ? vn1.g.UI_300 : vn1.g.UI_400, 0, d7.b.Z(!kotlin.text.z.j(string2)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097070);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string2), z13 ? vn1.c.ERROR : vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c Z = d7.b.Z(string2 != null);
                u50.f0 h23 = bs1.c.h2(string2 != null ? string2 : "");
                int i14 = IdeaPinProductTagsItemView.f46551k;
                return rn1.a.y(it, h23, vt1.a.s(z13), null, null, null, 0, Z, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c Z2 = d7.b.Z(string2 != null);
                u50.f0 h24 = bs1.c.h2(string2 != null ? string2 : "");
                int i15 = IdeaPinProductTagsItemView.f46551k;
                return rn1.a.y(it, h24, vt1.a.s(z13), null, null, null, 0, Z2, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c Z3 = d7.b.Z(string2 != null);
                u50.f0 h25 = bs1.c.h2(string2 != null ? string2 : "");
                int i16 = IdeaPinProductTagsItemView.f46551k;
                return rn1.a.y(it, h25, vt1.a.s(z13), null, null, null, 0, Z3, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                if (z13 && string2 != null) {
                    str = string2;
                }
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string2 != null ? string2 : ""), vn1.c.DEFAULT, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullExpressionValue(string2, "$title");
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new u50.f0(string2), z13 ? vn1.c.LIGHT : vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string2 != null ? string2 : ""), null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(z13 ? rm1.q.GLOBE_CHECKED : rm1.q.GLOBE, rm1.i.LG), null, null, 0, null, 30), false, 0, null, null, null, null, null, false, null, null, 2096638);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string2), null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                if (string2.length() > 0 && !z13) {
                    r7 = true;
                }
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(r7), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.f0 h26 = bs1.c.h2(string2);
                if (string2.length() > 0 && !z13) {
                    r7 = true;
                }
                return rn1.a.y(it, h26, null, null, null, null, 0, d7.b.Z(r7), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.f0 h27 = bs1.c.h2(string2);
                if (string2.length() > 0 && z13) {
                    r7 = true;
                }
                return rn1.a.y(it, h27, null, null, null, null, 0, d7.b.Z(r7), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, z13 ? bs1.c.j2(new String[]{string2}, k42.f.search_people_cell_follower_badge_with_dot) : bs1.c.h2(string2), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(string2)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109559i;
        boolean z13 = false;
        boolean z14 = this.f109560j;
        String name = this.f109561k;
        switch (i13) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return e((rn1.a) obj);
            case 2:
                return e((rn1.a) obj);
            case 3:
                return e((rn1.a) obj);
            case 4:
                return e((rn1.a) obj);
            case 5:
                return e((rn1.a) obj);
            case 6:
                d6.b it = (d6.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(name, "name");
                d6.g key = new d6.g(name);
                Boolean valueOf = Boolean.valueOf(z14);
                it.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                it.c(key, valueOf);
                return Unit.f80348a;
            case 7:
                return e((rn1.a) obj);
            case 8:
                return e((rn1.a) obj);
            case 9:
                return e((rn1.a) obj);
            case 10:
                BoardHeaderImageView view = (BoardHeaderImageView) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                BoardHeaderImageView.L(view, this.f109561k, null, null, this.f109560j, 14);
                return Unit.f80348a;
            case 11:
                return e((rn1.a) obj);
            case 12:
                ln0 it2 = (ln0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return ln0.a(it2, null, null, null, null, null, null, false, null, new qp(name, Boolean.valueOf(z14)), null, null, 15359);
            case 13:
                return e((rn1.a) obj);
            case 14:
                return e((rn1.a) obj);
            case 15:
                return e((rn1.a) obj);
            case 16:
                return e((rn1.a) obj);
            case 17:
                return e((rn1.a) obj);
            case 18:
                return e((rn1.a) obj);
            case 19:
                return e((rn1.a) obj);
            case 20:
                Navigation navigateTo = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateTo, "$this$navigateTo");
                navigateTo.m0("com.pinterest.EXTRA_USER_ID", name);
                navigateTo.Y1("com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", true);
                navigateTo.Y1("com.pinterest.EXTRAS_KEY_WRAP_IN_APP_BAR", false);
                navigateTo.Y1("com.pinterest.EXTRAS_KEY_SHOW_BOARDS_TAB", z14);
                navigateTo.Y1("com.pinterest.EXTRAS_KEY_SHOW_COUNT", false);
                return Unit.f80348a;
            case 21:
                return e((rn1.a) obj);
            case 22:
                return e((rn1.a) obj);
            case 23:
                return e((rn1.a) obj);
            case 24:
                return e((rn1.a) obj);
            case 25:
                return e((rn1.a) obj);
            case 26:
                return b((om1.c) obj);
            case 27:
                return b((om1.c) obj);
            case 28:
                return e((rn1.a) obj);
            default:
                wm1.k0 bind = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.q middleItem = new wm1.q(u50.g0.b(new String[0], b52.c.enable_auto_publish_title), u50.g0.b(new String[]{name}, b52.c.enable_auto_publish_description), z13, 4);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                wm1.k endItem = new wm1.k(z14, false, 6);
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(boolean z13, String str, int i13) {
        super(1);
        this.f109559i = i13;
        this.f109560j = z13;
        this.f109561k = str;
    }
}
