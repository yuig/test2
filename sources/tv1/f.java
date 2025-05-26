package tv1;

import a.cb;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.g0;
import h32.i0;
import ja.y;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import pk.a0;
import sq0.c0;
import uv1.l;
import wk1.q;
import yk1.n;

/* loaded from: classes4.dex */
public final class f extends q {

    /* renamed from: a, reason: collision with root package name */
    public final w f119568a;

    /* renamed from: b, reason: collision with root package name */
    public final lb0.q f119569b;

    /* renamed from: c, reason: collision with root package name */
    public final vv1.e f119570c;

    /* renamed from: d, reason: collision with root package name */
    public final vv1.j f119571d;

    /* renamed from: e, reason: collision with root package name */
    public final vv1.a f119572e;

    /* renamed from: f, reason: collision with root package name */
    public final vv1.c f119573f;

    /* renamed from: g, reason: collision with root package name */
    public e f119574g;

    /* renamed from: h, reason: collision with root package name */
    public h f119575h;

    /* renamed from: i, reason: collision with root package name */
    public b f119576i;

    /* renamed from: j, reason: collision with root package name */
    public rv1.a f119577j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f119578k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f119579l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f119580m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(uk1.d presenterPinalytics, uj2.q networkStateStream, w eventManager, lb0.q prefsManagerPersisted, vv1.e eVar, vv1.j jVar, vv1.a aVar, vv1.c cVar) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f119568a = eventManager;
        this.f119569b = prefsManagerPersisted;
        this.f119570c = eVar;
        this.f119571d = jVar;
        this.f119572e = aVar;
        this.f119573f = cVar;
        this.f119579l = new HashMap();
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        vv1.c cVar = this.f119573f;
        vv1.a aVar = this.f119572e;
        vv1.j jVar = this.f119571d;
        vv1.e eVar = this.f119570c;
        if (eVar == null && jVar == null && aVar == null && cVar == null) {
            this.f119580m = true;
            return;
        }
        if (eVar != null) {
            this.f119578k = 1;
            e eVar2 = new e(this.f119570c, getPresenterPinalytics(), this.f119568a, this.f119569b, this);
            ((wk1.i) dataSources).b(eVar2);
            this.f119574g = eVar2;
        }
        if (jVar != null) {
            this.f119578k = 2;
            h hVar = new h(this.f119571d, getPresenterPinalytics(), this.f119568a, this, this.f119569b);
            ((wk1.i) dataSources).b(hVar);
            this.f119575h = hVar;
        }
        if (aVar != null) {
            this.f119578k = 3;
            b bVar = new b(this.f119572e, getPresenterPinalytics(), this.f119568a, this.f119569b, this);
            ((wk1.i) dataSources).b(bVar);
            this.f119576i = bVar;
        }
        if (cVar != null) {
            this.f119578k = 4;
            rv1.a aVar2 = new rv1.a(cVar, getPresenterPinalytics(), this.f119568a, this);
            ((wk1.i) dataSources).b(aVar2);
            this.f119577j = aVar2;
        }
    }

    public final void t3() {
        n view = getView();
        Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
        ((l) ((vv1.g) view)).V8("navigation");
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(vv1.g view) {
        String titleText;
        HashMap<String, String> hashMap;
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f119580m) {
            ((l) view).U8();
            return;
        }
        super.r3((c0) view);
        l lVar = (l) view;
        Intrinsics.checkNotNullParameter(this, "filterListener");
        lVar.M0 = this;
        HashMap<String, String> auxData = null;
        vv1.a aVar = this.f119572e;
        vv1.j jVar = this.f119571d;
        vv1.e eVar = this.f119570c;
        if (eVar == null || (titleText = eVar.f126771h) == null) {
            if (jVar != null) {
                titleText = jVar.f126778h;
            } else {
                titleText = aVar != null ? aVar.f126756h : null;
                if (titleText == null) {
                    vv1.c cVar = this.f119573f;
                    titleText = cVar != null ? cVar.f126765h : null;
                    if (titleText == null) {
                        titleText = "";
                    }
                }
            }
        }
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        GestaltText gestaltText = lVar.F0;
        if (gestaltText == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        a0.p(gestaltText, titleText);
        if (aVar != null) {
            String subtitle = aVar.f126757i;
            if (subtitle != null) {
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                String actionText = aVar.f126758j;
                Intrinsics.checkNotNullParameter(actionText, "actionText");
                int length = subtitle.length() - 3;
                int length2 = subtitle.length();
                Intrinsics.checkNotNullParameter(subtitle, "<this>");
                if (length2 < length) {
                    throw new IndexOutOfBoundsException(cb.j("End index (", length2, ") is less than start index (", length, ")."));
                }
                if (length2 == length) {
                    charSequence = subtitle.subSequence(0, subtitle.length());
                } else {
                    StringBuilder sb3 = new StringBuilder(subtitle.length() - (length2 - length));
                    sb3.append((CharSequence) subtitle, 0, length);
                    Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
                    sb3.append((CharSequence) subtitle, length2, subtitle.length());
                    Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
                    charSequence = sb3;
                }
                String obj = charSequence.toString();
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) obj);
                Intrinsics.checkNotNullExpressionValue(append, "append(...)");
                int i13 = 1;
                StyleSpan styleSpan = new StyleSpan(1);
                int length3 = append.length();
                append.append((CharSequence) actionText);
                append.setSpan(styleSpan, length3, append.length(), 17);
                GestaltText gestaltText2 = lVar.G0;
                if (gestaltText2 == null) {
                    Intrinsics.r("subtitleView");
                    throw null;
                }
                gestaltText2.i(new xs0.j(append, subtitle, i13));
                GestaltText gestaltText3 = lVar.G0;
                if (gestaltText3 == null) {
                    Intrinsics.r("subtitleView");
                    throw null;
                }
                gestaltText3.post(new y(lVar, obj, actionText, 28));
            }
            String str = aVar.f126761m;
            if (str == null || str.length() == 0) {
                GestaltButton gestaltButton = lVar.H0;
                if (gestaltButton == null) {
                    Intrinsics.r("clearButton");
                    throw null;
                }
                a0.l0(gestaltButton);
            }
            this.f119579l = aVar.f126763o;
            d0 d0Var = getPresenterPinalytics().f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0.B(d0Var, f1.RENDER, g0.ONEBAR_DRAWER, null, bs1.c.n(this.f119579l), 20);
        } else {
            if (eVar != null && (hashMap = eVar.f126775l) != null) {
                auxData = hashMap;
            } else if (jVar != null) {
                auxData = jVar.f126782l;
            }
            if (auxData != null) {
                d0 pinalytics = getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(auxData, "auxData");
                d71.c cVar2 = d71.c.BOTTOM_SHEET_RENDERED_FROM_ONE_BAR;
                cVar2.setAuxData(auxData);
                Unit unit = Unit.f80348a;
                pinalytics.U(new i0(cVar2.getViewType(), cVar2.getViewParameterType(), null, cVar2.getComponentType(), null, cVar2.getElementType()), cVar2.getEventType(), null, null, cVar2.getAuxData(), false);
            }
        }
        ca2.e.w((ca2.e) lVar.O0.getValue(), 0, null, null, null, 15);
    }
}
