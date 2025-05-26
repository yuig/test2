package ed1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c2.m4;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.feature.sharesheet.view.SharesheetModalVerticalContactView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import fd1.w0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f58613a;

    /* renamed from: b, reason: collision with root package name */
    public final ap.o f58614b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f58615c;

    /* renamed from: d, reason: collision with root package name */
    public final SendableObject f58616d;

    /* renamed from: e, reason: collision with root package name */
    public final z70.m f58617e;

    /* renamed from: f, reason: collision with root package name */
    public final lu1.b f58618f;

    /* renamed from: g, reason: collision with root package name */
    public final uk1.d f58619g;

    /* renamed from: h, reason: collision with root package name */
    public final int f58620h;

    /* renamed from: i, reason: collision with root package name */
    public final y f58621i;

    /* renamed from: j, reason: collision with root package name */
    public final i91.a0 f58622j;

    /* renamed from: k, reason: collision with root package name */
    public final e82.h0 f58623k;

    /* renamed from: l, reason: collision with root package name */
    public nx.d0 f58624l;

    public h0(Context context, ap.o uploadContactsUtil, m60.w eventManager, SendableObject sendableObject, z70.m chromeTabHelper, lu1.b baseActivityHelper, uk1.d presenterPinalytics, int i13, y listener, i91.a0 sendShareState, e82.h0 socialUtils, lz1.a sendShareUpsellPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(chromeTabHelper, "chromeTabHelper");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(sendShareState, "sendShareState");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
        this.f58613a = context;
        this.f58614b = uploadContactsUtil;
        this.f58615c = eventManager;
        this.f58616d = sendableObject;
        this.f58617e = chromeTabHelper;
        this.f58618f = baseActivityHelper;
        this.f58619g = presenterPinalytics;
        this.f58620h = i13;
        this.f58621i = listener;
        this.f58622j = sendShareState;
        this.f58623k = socialUtils;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        SharesheetModalVerticalContactView view = (SharesheetModalVerticalContactView) nVar;
        TypeAheadItem item = (TypeAheadItem) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "model");
        if (this.f58616d.f35129c == 8) {
            Set h10 = ((lb0.b) lb0.n.f82725d.a()).h("PREF_INVITES_SENT_USER_IDS", new LinkedHashSet());
            if (h10 != null && h10.contains(String.valueOf(item.A()))) {
                item.f35153n = er.d.SENT;
            }
        }
        view.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        int i14 = this.f58620h;
        m4 m4Var = new m4(i14, item, 17);
        GestaltListAction gestaltListAction = view.f48424a;
        kg.a.h(gestaltListAction, m4Var);
        if (item.f35145f.equals(er.c.SEARCH_PLACEHOLDER)) {
            kg.a.h(gestaltListAction, fd1.i.D);
            if (view.f48425b) {
                ((LinearLayout) view.findViewById(b62.b.search_contacts)).setVisibility(0);
                GestaltDivider gestaltDivider = (GestaltDivider) view.findViewById(b62.b.contact_list_divider);
                if (gestaltDivider != null) {
                    j1.A0(gestaltDivider);
                }
            } else {
                View findViewById = view.findViewById(b62.b.search_title);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                pk.a0.w1((GestaltText) findViewById);
                GestaltDivider gestaltDivider2 = (GestaltDivider) view.findViewById(b62.b.contact_list_divider);
                if (gestaltDivider2 != null) {
                    j1.W1(gestaltDivider2);
                }
            }
        } else {
            String n13 = item.n();
            Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
            if (n13.length() != 0) {
                kg.a.h(gestaltListAction, new ic1.c(10, item, view));
                if (item.f35153n == er.d.SENT) {
                    new w0(i14, item, view).start();
                } else if (i14 != y32.f.BOARD.value()) {
                    kg.a.h(gestaltListAction, fd1.i.I);
                }
                GestaltDivider gestaltDivider3 = (GestaltDivider) view.findViewById(b62.b.contact_list_divider);
                if (gestaltDivider3 != null) {
                    j1.A0(gestaltDivider3);
                }
                GestaltText gestaltText = (GestaltText) view.findViewById(b62.b.search_title);
                if (gestaltText != null) {
                    gestaltText.i(fd1.i.f61926J);
                }
                LinearLayout linearLayout = (LinearLayout) view.findViewById(b62.b.search_contacts);
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                GestaltAvatar gestaltAvatar = (GestaltAvatar) view.findViewById(b62.b.pinner_avatar);
                if (gestaltAvatar != null) {
                    pe.i.K(gestaltAvatar);
                }
                kg.a.h(gestaltListAction, fd1.i.K);
            }
        }
        kg.a.f79364a = item;
        kg.a.f79365b = i13;
        kg.a.f79366c = this.f58621i;
        nx.d0 d0Var = this.f58619g.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.f58624l = d0Var;
        view.setOnClickListener(new oq.t(item, this, new j91.n(this.f58613a, this.f58614b, this.f58617e, this.f58618f), i13, 2));
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        TypeAheadItem model = (TypeAheadItem) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    public final nx.d0 h() {
        nx.d0 d0Var = this.f58624l;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("pinalytics");
        throw null;
    }
}
