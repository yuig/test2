package ic1;

import android.content.Context;
import android.text.SpannableString;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.feature.sharesheet.view.SharesheetModalVerticalContactView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.mediaPipeline.PipelineException;
import com.pinterest.navigation.NavigationImpl;
import et1.w0;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.EnumMap;
import java.util.HashMap;
import kc1.d0;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import pk.a0;
import rf1.l0;
import rf1.p0;
import u50.f0;
import u50.i0;
import va1.m1;
import we1.m0;
import wm1.k0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72068i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f72069j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f72070k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        super(1);
        this.f72068i = i13;
        this.f72069j = obj;
        this.f72070k = obj2;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f72068i;
        Object obj = this.f72070k;
        Object obj2 = this.f72069j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = ((d0) obj2).getString(((kc1.n) obj).f79167b);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2((String) obj2), null, e0.b(vn1.b.CENTER_HORIZONTAL), e0.b(vn1.e.BOLD), (vn1.g) obj, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097122);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), ((m0) obj2).f129470a ? vn1.g.BODY_300 : a0.a((Context) obj), 2, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096967);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                SpannableString spannableString = (SpannableString) obj;
                com.pinterest.feature.todaytab.articlefeed.j.j9((com.pinterest.feature.todaytab.articlefeed.j) obj2, spannableString);
                return rn1.a.y(it, bs1.c.h2(spannableString), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096062);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = ((gh1.b) obj2).getResources().getString(n92.d.article_by, (String) obj);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string2), null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 23:
                Intrinsics.checkNotNullParameter(it, "state");
                return rn1.a.y(it, bs1.c.h2((String) obj2), ((hh1.o) obj).f69199f, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltText gestaltText = ((hh1.f) obj2).f69165c;
                if (gestaltText == null) {
                    Intrinsics.r("boardCount");
                    throw null;
                }
                hh1.o oVar = (hh1.o) obj;
                String quantityString = gestaltText.getResources().getQuantityString(p92.d.idea_pin_tooltip_board_sticker_body, oVar.f69202i.intValue(), oVar.f69202i);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                return rn1.a.y(it, bs1.c.h2(quantityString), oVar.f69199f, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
        }
    }

    public final void e(com.pinterest.feature.unifiedcomments.d view) {
        int i13 = this.f72068i;
        Object obj = this.f72070k;
        Object obj2 = this.f72069j;
        switch (i13) {
            case 28:
                Intrinsics.checkNotNullParameter(view, "view");
                boolean X3 = ((oh1.m) obj2).X3((f30) obj);
                rh1.k kVar = (rh1.k) view;
                LegoEmptyStateView W8 = kVar.W8();
                String string = W8.getResources().getString(ob2.f.comment_empty_state_title_creator_solicited_comments);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                W8.p(string);
                String string2 = W8.getResources().getString(ob2.f.comment_empty_state_text_creator_solicited_comments);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                W8.e(string2);
                W8.g(vn1.g.BODY_300);
                rh1.k.j9(kVar, W8);
                lb0.r rVar = kVar.G0;
                if (rVar == null) {
                    Intrinsics.r("prefsManagerUser");
                    throw null;
                }
                String d2 = rVar.d("PREF_COMMENT_COMPOSER_DRAFT", null);
                if (!(d2 == null || z.j(d2))) {
                    return;
                }
                if (!X3) {
                    kVar.g9(false);
                    return;
                } else {
                    kVar.f9(true);
                    kVar.g9(true);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                rp0.d replyTo = (rp0.d) obj2;
                if (replyTo.x()) {
                    oh1.m mVar = (oh1.m) obj;
                    String m13 = replyTo.m();
                    if (m13 == null) {
                        return;
                    }
                    mVar.f94542x = m13;
                    String l13 = replyTo.l();
                    if (l13 == null) {
                        return;
                    } else {
                        mVar.f94543y = l13;
                    }
                } else {
                    oh1.m mVar2 = (oh1.m) obj;
                    mVar2.f94542x = replyTo.v();
                    mVar2.f94543y = replyTo.k();
                }
                rh1.k kVar2 = (rh1.k) view;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(replyTo, "replyTo");
                kVar2.Y8().S0(replyTo);
                return;
        }
    }

    public final void f(String userId) {
        int i13 = this.f72068i;
        Object obj = this.f72070k;
        Object obj2 = this.f72069j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(userId, "userId");
                if (!z.j(userId)) {
                    id1.g gVar = (id1.g) obj2;
                    nx.d0.B(gVar.getPinalytics(), f1.TAP, null, userId, null, 26);
                    NavigationImpl c13 = r41.k.c(r41.k.f106176a, userId, r41.b.BaseShoppingFeed, null, null, 28);
                    String str = (String) obj;
                    if (str != null) {
                        c13.m0("shop_source", str);
                    }
                    String str2 = (String) gVar.f72153a.f72165d.get("source_identifier");
                    if (str2 != null) {
                        c13.m0("source_identifier", str2);
                    }
                    m60.u.f85943a.d(c13);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(userId, "userId");
                oe1.b bVar = (oe1.b) obj2;
                g0 g0Var = bVar.f94257d;
                vh vhVar = (vh) obj;
                String storyType = vhVar.q();
                Intrinsics.checkNotNullExpressionValue(storyType, "getStoryType(...)");
                String n13 = vhVar.n();
                Intrinsics.checkNotNullParameter(userId, "userId");
                nx.d0 pinalytics = bVar.f94259f;
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(storyType, "storyType");
                if (!z.j(userId)) {
                    f1 f1Var = f1.TAP;
                    u0 u0Var = u0.SHOPPING_DOMAIN_MODULE_USER_AVATAR;
                    HashMap hashMap = new HashMap();
                    String str3 = bVar.f94261h;
                    bs1.c.G1("story_id", str3, hashMap);
                    hashMap.put("story_type", storyType);
                    Unit unit = Unit.f80348a;
                    c0.d.j2(pinalytics, f1Var, userId, g0Var, u0Var, bVar.f94272s, hashMap);
                    NavigationImpl c14 = r41.k.c(r41.k.f106176a, userId, r41.b.StructuredStoryActionUtil, null, null, 28);
                    if (n13 != null) {
                        c14.m0("shop_source", n13);
                    }
                    if (str3 != null) {
                        c14.m0("source_identifier", str3);
                    }
                    m60.u.f85943a.d(c14);
                    break;
                }
                break;
        }
    }

    public final void h(Throwable exception) {
        PipelineException pipelineException;
        int i13 = this.f72068i;
        Object obj = this.f72069j;
        switch (i13) {
            case 17:
                p0 p0Var = (p0) this.f72070k;
                p0Var.f107849l.q(exception, "Error loading Pin with ID: " + ((String) obj) + " in " + new l0(0, p0Var.getClass(), Class.class, "getSimpleName", "getSimpleName()Ljava/lang/String;", 0), tb0.p.IDEA_PINS_DISPLAY);
                return;
            default:
                Intrinsics.checkNotNullParameter(exception, "exception");
                if (exception instanceof PipelineException) {
                    pipelineException = (PipelineException) exception;
                } else {
                    String message = exception.getMessage();
                    if (message == null) {
                        message = "Pipeline Exception [" + exception.getClass() + "]";
                    }
                    pipelineException = new PipelineException(message, null, exception, null, ((jg1.q) obj).d(), 10);
                }
                jg1.q qVar = (jg1.q) obj;
                et1.f fVar = (et1.f) qVar.f76054n.getValue();
                et1.d pipeline = qVar.d();
                ((w0) fVar).getClass();
                Intrinsics.checkNotNullParameter(pipeline, "pipeline");
                throw pipelineException;
        }
    }

    public final void i(k0 bind) {
        int i13 = this.f72068i;
        Object obj = this.f72070k;
        Object obj2 = this.f72069j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.m mVar = (wm1.m) obj2;
                rm1.q qVar = ((va1.f1) obj).f125175e;
                EnumMap enumMap = bd1.c.f22718a;
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                wm1.d icon = (wm1.d) bd1.c.f22718a.get(qVar);
                if (icon == null) {
                    icon = wm1.d.ARROW_FORWARD;
                }
                i0 text = mVar.f130319c;
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(icon, "icon");
                wm1.m endItem = new wm1.m(text, icon, mVar.f130321e);
                bind.getClass();
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                TypeAheadItem typeAheadItem = (TypeAheadItem) obj2;
                String string = typeAheadItem.n();
                Intrinsics.checkNotNullExpressionValue(string, "getTitle(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                f0 f0Var = new f0(string);
                String string2 = "@" + typeAheadItem.k();
                Intrinsics.checkNotNullParameter(string2, "string");
                wm1.q middleItem = new wm1.q(f0Var, new f0(string2), false, 4);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                String string3 = ((SharesheetModalVerticalContactView) obj).getResources().getString(le0.h.content_description_user_avatar, typeAheadItem.n());
                bind.f130315f = string3 != null ? new f0(string3) : null;
                String l13 = typeAheadItem.l();
                if (l13 != null) {
                    String n13 = typeAheadItem.n();
                    Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
                    wm1.u startItem = new wm1.u(l13, n13);
                    Intrinsics.checkNotNullParameter(startItem, "startItem");
                    bind.f130311b = startItem;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02bf, code lost:
    
        if (r3 != fd1.z0.APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ic1.c.invoke(java.lang.Object):java.lang.Object");
    }

    public final void j(yb0.d reason) {
        tc1.a aVar;
        int i13 = this.f72068i;
        Object obj = this.f72070k;
        Object obj2 = this.f72069j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (reason == yb0.d.OUTSIDE_TOUCH && (aVar = ((wc1.e) obj2).D0) != null) {
                    m1 item = (m1) obj;
                    Intrinsics.checkNotNullParameter(item, "item");
                    ((vc1.d) aVar).z3(item, true);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(reason, "it");
                ((wc1.e) obj2).f7().d((za1.d) obj);
                break;
        }
    }
}
