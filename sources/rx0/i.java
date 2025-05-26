package rx0;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView;
import com.pinterest.feature.newshub.view.content.NewsHubHeaderIconContainerView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;
import h32.u0;
import ha2.a0;
import ha2.x;
import ha2.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lh0.h2;
import om1.l;
import org.chromium.net.y;
import x02.w1;

/* loaded from: classes5.dex */
public final class i extends NewsHubFeedItemBaseView {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f110196r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        final int i13 = 1;
        this.f46815p = true;
        this.f110196r = z13;
        View.inflate(context, zu1.d.news_hub_feed_item_compact, this);
        View findViewById = findViewById(zu1.c.news_hub_content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46810k = findViewById;
        View findViewById2 = findViewById(av1.c.news_hub_time_header);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(av1.c.news_hub_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46811l = (GestaltText) findViewById3;
        View findViewById4 = findViewById(zu1.c.news_hub_header_icon_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46812m = (NewsHubHeaderIconContainerView) findViewById4;
        View findViewById5 = findViewById(zu1.c.news_hub_ellipsis_menu);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f46814o = (GestaltIconButton) findViewById5;
        this.f46813n = findViewById(zu1.c.news_hub_unread_dot);
        y yVar = new y();
        g gVar = new g(this);
        pb0.d dVar = this.f46807h;
        if (dVar == null) {
            Intrinsics.r("fuzzyDateFormatter");
            throw null;
        }
        this.f46809j = new ux0.e(yVar, gVar, dVar);
        View view = this.f46810k;
        if (view == null) {
            Intrinsics.r("contentView");
            throw null;
        }
        final int i14 = 0;
        view.setOnClickListener(new View.OnClickListener() { // from class: rx0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                NewsHubFeedItemBaseView this$0 = this;
                switch (i15) {
                    case 0:
                        int i16 = NewsHubFeedItemBaseView.f46800q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        mx0.a aVar = this$0.f46808i;
                        if (aVar != null) {
                            u0 u0Var = u0.NEWS_HUB_CELL;
                            w1 w1Var = this$0.f46804e;
                            if (w1Var == null) {
                                Intrinsics.r("newsHubRepository");
                                throw null;
                            }
                            ((px0.j) aVar).p3(u0Var, w1Var.f131517a);
                            return;
                        }
                        return;
                    default:
                        int i17 = NewsHubFeedItemBaseView.f46800q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        mx0.a aVar2 = this$0.f46808i;
                        if (aVar2 != null) {
                            u0 u0Var2 = u0.NEWS_HUB_HEADER_ICON;
                            w1 w1Var2 = this$0.f46804e;
                            if (w1Var2 == null) {
                                Intrinsics.r("newsHubRepository");
                                throw null;
                            }
                            ((px0.j) aVar2).p3(u0Var2, w1Var2.f131517a);
                            return;
                        }
                        return;
                }
            }
        });
        GestaltText gestaltText = this.f46811l;
        if (gestaltText == null) {
            Intrinsics.r("headerTextView");
            throw null;
        }
        gestaltText.j(new gm1.a() { // from class: rx0.e
            @Override // gm1.a
            public final void h3(gm1.c it) {
                mx0.a aVar;
                List list;
                ox0.b bVar;
                String str;
                int i15 = i14;
                NewsHubFeedItemBaseView this$0 = this;
                switch (i15) {
                    case 0:
                        int i16 = NewsHubFeedItemBaseView.f46800q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        mx0.a aVar2 = this$0.f46808i;
                        if (aVar2 != null) {
                            u0 u0Var = u0.NEWS_HUB_HEADER_TEXT;
                            w1 w1Var = this$0.f46804e;
                            if (w1Var != null) {
                                ((px0.j) aVar2).p3(u0Var, w1Var.f131517a);
                                return;
                            } else {
                                Intrinsics.r("newsHubRepository");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = NewsHubFeedItemBaseView.f46800q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!(it instanceof l) || (aVar = this$0.f46808i) == null) {
                            return;
                        }
                        px0.j jVar = (px0.j) aVar;
                        qx qxVar = jVar.f101619d;
                        List list2 = qxVar != null ? qxVar.f41416w : null;
                        s sVar = list2 != null ? (s) CollectionsKt.U(0, list2) : null;
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list2) {
                                if (obj instanceof zs) {
                                    arrayList.add(obj);
                                }
                            }
                            list = CollectionsKt.y0(arrayList, 2);
                        } else {
                            list = null;
                        }
                        ArrayList actions = new ArrayList();
                        j0 j0Var = new j0();
                        List list3 = list;
                        if (list3 == null || list3.isEmpty()) {
                            if (sVar instanceof f30) {
                                if (((NewsHubFeedItemBaseView) ((mx0.b) jVar.getView())).f46815p) {
                                    bVar = ox0.b.UnfollowPinAction;
                                    j0Var.f80434a = Integer.valueOf(zu1.e.notice_pin_unsubscribed);
                                } else {
                                    bVar = ox0.b.FollowPinAction;
                                    j0Var.f80434a = Integer.valueOf(zu1.e.notice_pin_resubscribed);
                                }
                                str = null;
                            } else if (sVar instanceof wy0) {
                                if (((NewsHubFeedItemBaseView) ((mx0.b) jVar.getView())).f46815p) {
                                    bVar = ox0.b.UnfollowUserAction;
                                    j0Var.f80434a = Integer.valueOf(zu1.e.notice_user_unsubscribed);
                                } else {
                                    bVar = ox0.b.FollowUserAction;
                                    j0Var.f80434a = Integer.valueOf(zu1.e.notice_user_resubscribed);
                                }
                                str = ((wy0) sVar).Z2();
                            } else {
                                bVar = null;
                                str = null;
                            }
                            if (bVar != null) {
                                actions.add(new ox0.a(bVar, str, null));
                            }
                        } else {
                            int i18 = 0;
                            for (Object obj2 : list) {
                                int i19 = i18 + 1;
                                if (i18 < 0) {
                                    f0.p();
                                    throw null;
                                }
                                zs zsVar = (zs) obj2;
                                String D = zsVar.D();
                                if (D != null) {
                                    ox0.b bVar2 = i18 != 0 ? i18 != 1 ? null : ox0.b.SeeLessAboutInterest2 : ox0.b.SeeLessAboutInterest1;
                                    if (bVar2 != null) {
                                        actions.add(new ox0.a(bVar2, D, zsVar.getUid()));
                                    }
                                }
                                j0Var.f80434a = Integer.valueOf(zu1.e.see_less_about_interest_confirmation);
                                i18 = i19;
                            }
                        }
                        mx0.b bVar3 = (mx0.b) jVar.getView();
                        aw0.j optionHandler = new aw0.j(jVar, sVar, j0Var, actions);
                        Intrinsics.checkNotNullParameter(actions, "actions");
                        Intrinsics.checkNotNullParameter(optionHandler, "optionHandler");
                        x xVar = new x(zu1.e.options, null, null, null, null, 30);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = actions.iterator();
                        while (it2.hasNext()) {
                            ox0.a aVar3 = (ox0.a) it2.next();
                            arrayList2.add(new a0(aVar3.f97980a.getTitleId(), aVar3.f97980a.ordinal(), null, aVar3.f97981b, null, null, null, null, null, 1012));
                        }
                        ox0.b bVar4 = ox0.b.DeleteNewsHubItem;
                        arrayList2.add(new a0(bVar4.getTitleId(), bVar4.ordinal(), null, null, null, null, null, null, null, 1020));
                        ox0.b bVar5 = ox0.b.ViewNotificationSettings;
                        arrayList2.add(new a0(bVar5.getTitleId(), bVar5.ordinal(), null, null, null, null, null, null, null, 1020));
                        ((NewsHubFeedItemBaseView) bVar3).Y4(new ha2.a(e0.b(new z(xVar, arrayList2, optionHandler)), false, (Integer) null, 14));
                        jVar.f101616a.X(u0.NEWS_HUB_FEED_ITEM_ELLIPSIS_ICON);
                        return;
                }
            }
        });
        NewsHubHeaderIconContainerView newsHubHeaderIconContainerView = this.f46812m;
        if (newsHubHeaderIconContainerView == null) {
            Intrinsics.r("headerIconContainerView");
            throw null;
        }
        newsHubHeaderIconContainerView.setOnClickListener(new View.OnClickListener() { // from class: rx0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i13;
                NewsHubFeedItemBaseView this$0 = this;
                switch (i15) {
                    case 0:
                        int i16 = NewsHubFeedItemBaseView.f46800q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        mx0.a aVar = this$0.f46808i;
                        if (aVar != null) {
                            u0 u0Var = u0.NEWS_HUB_CELL;
                            w1 w1Var = this$0.f46804e;
                            if (w1Var == null) {
                                Intrinsics.r("newsHubRepository");
                                throw null;
                            }
                            ((px0.j) aVar).p3(u0Var, w1Var.f131517a);
                            return;
                        }
                        return;
                    default:
                        int i17 = NewsHubFeedItemBaseView.f46800q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        mx0.a aVar2 = this$0.f46808i;
                        if (aVar2 != null) {
                            u0 u0Var2 = u0.NEWS_HUB_HEADER_ICON;
                            w1 w1Var2 = this$0.f46804e;
                            if (w1Var2 == null) {
                                Intrinsics.r("newsHubRepository");
                                throw null;
                            }
                            ((px0.j) aVar2).p3(u0Var2, w1Var2.f131517a);
                            return;
                        }
                        return;
                }
            }
        });
        GestaltIconButton gestaltIconButton = this.f46814o;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new gm1.a() { // from class: rx0.e
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    mx0.a aVar;
                    List list;
                    ox0.b bVar;
                    String str;
                    int i15 = i13;
                    NewsHubFeedItemBaseView this$0 = this;
                    switch (i15) {
                        case 0:
                            int i16 = NewsHubFeedItemBaseView.f46800q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            mx0.a aVar2 = this$0.f46808i;
                            if (aVar2 != null) {
                                u0 u0Var = u0.NEWS_HUB_HEADER_TEXT;
                                w1 w1Var = this$0.f46804e;
                                if (w1Var != null) {
                                    ((px0.j) aVar2).p3(u0Var, w1Var.f131517a);
                                    return;
                                } else {
                                    Intrinsics.r("newsHubRepository");
                                    throw null;
                                }
                            }
                            return;
                        default:
                            int i17 = NewsHubFeedItemBaseView.f46800q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (!(it instanceof l) || (aVar = this$0.f46808i) == null) {
                                return;
                            }
                            px0.j jVar = (px0.j) aVar;
                            qx qxVar = jVar.f101619d;
                            List list2 = qxVar != null ? qxVar.f41416w : null;
                            s sVar = list2 != null ? (s) CollectionsKt.U(0, list2) : null;
                            if (list2 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list2) {
                                    if (obj instanceof zs) {
                                        arrayList.add(obj);
                                    }
                                }
                                list = CollectionsKt.y0(arrayList, 2);
                            } else {
                                list = null;
                            }
                            ArrayList actions = new ArrayList();
                            j0 j0Var = new j0();
                            List list3 = list;
                            if (list3 == null || list3.isEmpty()) {
                                if (sVar instanceof f30) {
                                    if (((NewsHubFeedItemBaseView) ((mx0.b) jVar.getView())).f46815p) {
                                        bVar = ox0.b.UnfollowPinAction;
                                        j0Var.f80434a = Integer.valueOf(zu1.e.notice_pin_unsubscribed);
                                    } else {
                                        bVar = ox0.b.FollowPinAction;
                                        j0Var.f80434a = Integer.valueOf(zu1.e.notice_pin_resubscribed);
                                    }
                                    str = null;
                                } else if (sVar instanceof wy0) {
                                    if (((NewsHubFeedItemBaseView) ((mx0.b) jVar.getView())).f46815p) {
                                        bVar = ox0.b.UnfollowUserAction;
                                        j0Var.f80434a = Integer.valueOf(zu1.e.notice_user_unsubscribed);
                                    } else {
                                        bVar = ox0.b.FollowUserAction;
                                        j0Var.f80434a = Integer.valueOf(zu1.e.notice_user_resubscribed);
                                    }
                                    str = ((wy0) sVar).Z2();
                                } else {
                                    bVar = null;
                                    str = null;
                                }
                                if (bVar != null) {
                                    actions.add(new ox0.a(bVar, str, null));
                                }
                            } else {
                                int i18 = 0;
                                for (Object obj2 : list) {
                                    int i19 = i18 + 1;
                                    if (i18 < 0) {
                                        f0.p();
                                        throw null;
                                    }
                                    zs zsVar = (zs) obj2;
                                    String D = zsVar.D();
                                    if (D != null) {
                                        ox0.b bVar2 = i18 != 0 ? i18 != 1 ? null : ox0.b.SeeLessAboutInterest2 : ox0.b.SeeLessAboutInterest1;
                                        if (bVar2 != null) {
                                            actions.add(new ox0.a(bVar2, D, zsVar.getUid()));
                                        }
                                    }
                                    j0Var.f80434a = Integer.valueOf(zu1.e.see_less_about_interest_confirmation);
                                    i18 = i19;
                                }
                            }
                            mx0.b bVar3 = (mx0.b) jVar.getView();
                            aw0.j optionHandler = new aw0.j(jVar, sVar, j0Var, actions);
                            Intrinsics.checkNotNullParameter(actions, "actions");
                            Intrinsics.checkNotNullParameter(optionHandler, "optionHandler");
                            x xVar = new x(zu1.e.options, null, null, null, null, 30);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = actions.iterator();
                            while (it2.hasNext()) {
                                ox0.a aVar3 = (ox0.a) it2.next();
                                arrayList2.add(new a0(aVar3.f97980a.getTitleId(), aVar3.f97980a.ordinal(), null, aVar3.f97981b, null, null, null, null, null, 1012));
                            }
                            ox0.b bVar4 = ox0.b.DeleteNewsHubItem;
                            arrayList2.add(new a0(bVar4.getTitleId(), bVar4.ordinal(), null, null, null, null, null, null, null, 1020));
                            ox0.b bVar5 = ox0.b.ViewNotificationSettings;
                            arrayList2.add(new a0(bVar5.getTitleId(), bVar5.ordinal(), null, null, null, null, null, null, null, 1020));
                            ((NewsHubFeedItemBaseView) bVar3).Y4(new ha2.a(e0.b(new z(xVar, arrayList2, optionHandler)), false, (Integer) null, 14));
                            jVar.f101616a.X(u0.NEWS_HUB_FEED_ITEM_ELLIPSIS_ICON);
                            return;
                    }
                }
            });
        } else {
            Intrinsics.r("ellipsisMenuView");
            throw null;
        }
    }

    @Override // com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView, mx0.b
    public final void I1(String textCacheKey, String headerText, Map textMappings, Date lastUpdatedAt) {
        GestaltText timeSinceText;
        Intrinsics.checkNotNullParameter(textCacheKey, "textCacheKey");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(textMappings, "textMappings");
        Intrinsics.checkNotNullParameter(textCacheKey, "textCacheKey");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(textMappings, "textMappings");
        ux0.e eVar = this.f46809j;
        if (eVar == null) {
            Intrinsics.r("textInteractor");
            throw null;
        }
        CharSequence a13 = eVar.a(textCacheKey, headerText, textMappings);
        GestaltText gestaltText = this.f46811l;
        if (gestaltText == null) {
            Intrinsics.r("headerTextView");
            throw null;
        }
        pk.a0.q(gestaltText, bs1.c.h2(a13));
        View view = this.f46810k;
        if (view == null) {
            Intrinsics.r("contentView");
            throw null;
        }
        view.setContentDescription(a13);
        if (lastUpdatedAt == null || (timeSinceText = (GestaltText) findViewById(zu1.c.news_hub_item_time)) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(timeSinceText, "timeSinceText");
        Intrinsics.checkNotNullParameter(lastUpdatedAt, "lastUpdatedAt");
        ux0.e eVar2 = this.f46809j;
        if (eVar2 == null) {
            Intrinsics.r("textInteractor");
            throw null;
        }
        SpannableString spannableString = new SpannableString(eVar2.b(lastUpdatedAt, pb0.b.STYLE_COMPACT));
        spannableString.setSpan(new TextAppearanceSpan(getContext(), av1.e.lego_news_hub_time_since_text), 0, spannableString.length(), 33);
        timeSinceText.i(new f(spannableString, this, lastUpdatedAt));
    }

    @Override // com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView, mx0.b
    public final void e0(boolean z13) {
        if (this.f110196r) {
            super.e0(false);
        } else {
            super.e0(z13);
        }
    }

    @Override // com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView, mx0.b
    public final void m2(boolean z13) {
        CardView cardView = (CardView) findViewById(zu1.c.news_hub_item_card_view);
        if (cardView != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            GestaltText gestaltText = (GestaltText) findViewById(zu1.c.news_hub_featured_title);
            GestaltText gestaltText2 = (GestaltText) findViewById(zu1.c.news_hub_header_text);
            if (this.f110196r && z13) {
                cardView.k(cardView.getContext().getColor(eo1.b.color_purple_mysticool_100));
                int dimensionPixelOffset = cardView.getResources().getDimensionPixelOffset(eo1.c.space_200);
                h2 h2Var = this.f46805f;
                if (h2Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                int i13 = h2Var.d() ? dimensionPixelOffset : 0;
                layoutParams.setMargins(dimensionPixelOffset, i13, dimensionPixelOffset, i13);
                if (gestaltText != null) {
                    gestaltText.i(b.f110179k);
                }
                if (gestaltText2 != null) {
                    gestaltText2.i(b.f110180l);
                }
            } else {
                Context context = cardView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                cardView.k(dl2.b.x0(context, eo1.a.sema_color_background_transparent));
                layoutParams.setMargins(0, 0, 0, 0);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (pk.a0.q0(context2)) {
                    if (gestaltText != null) {
                        gestaltText.i(b.f110181m);
                    }
                    if (gestaltText2 != null) {
                        gestaltText2.i(b.f110182n);
                    }
                } else {
                    if (gestaltText != null) {
                        gestaltText.i(b.f110183o);
                    }
                    if (gestaltText2 != null) {
                        gestaltText2.i(b.f110184p);
                    }
                }
            }
            cardView.setLayoutParams(layoutParams);
        }
    }
}
