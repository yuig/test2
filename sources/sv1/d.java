package sv1;

import android.view.View;
import c71.b0;
import h32.g0;
import h32.u0;
import h61.h;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.w;
import nx.d0;
import yb0.n;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f115390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f115391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f115392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f115393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f115394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f115395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f115396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f115397i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f115398j;

    public /* synthetic */ d(d0 d0Var, g0 g0Var, HashMap hashMap, q qVar, String str, w wVar, h hVar, String str2, n nVar, int i13) {
        this.f115389a = i13;
        this.f115390b = d0Var;
        this.f115391c = g0Var;
        this.f115392d = hashMap;
        this.f115393e = qVar;
        this.f115394f = str;
        this.f115395g = wVar;
        this.f115396h = hVar;
        this.f115397i = str2;
        this.f115398j = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f115389a;
        n this_apply = this.f115398j;
        w eventManager = this.f115395g;
        q prefsManagerPersisted = this.f115393e;
        HashMap auxData = this.f115392d;
        g0 componenType = this.f115391c;
        d0 pinalytics = this.f115390b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(componenType, "$componenType");
                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "$prefsManagerPersisted");
                String pattern = this.f115394f;
                Intrinsics.checkNotNullParameter(pattern, "$hairPatternTerm");
                Intrinsics.checkNotNullParameter(eventManager, "$eventManager");
                h searchType = this.f115396h;
                Intrinsics.checkNotNullParameter(searchType, "$searchType");
                String query = this.f115397i;
                Intrinsics.checkNotNullParameter(query, "$query");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                pinalytics.h(componenType, u0.HAIR_PATTERN_FILTER_REMEMBER_YES, auxData);
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "<this>");
                Intrinsics.checkNotNullParameter(pattern, "pattern");
                prefsManagerPersisted.b("PREF_HAIR_PATTERN_SELECTION", pattern);
                eventManager.d(b0.c(new b0(searchType, query, null, null, null, null, null, null, null, "filter", null, null, null, null, pattern, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -787460, 2097151), false, 3));
                this_apply.g(yb0.d.CONFIRM_BUTTON_CLICK);
                break;
            default:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(componenType, "$componentType");
                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "$prefsManagerPersisted");
                String tone = this.f115394f;
                Intrinsics.checkNotNullParameter(tone, "$skinToneTerm");
                Intrinsics.checkNotNullParameter(eventManager, "$eventManager");
                h searchType2 = this.f115396h;
                Intrinsics.checkNotNullParameter(searchType2, "$searchType");
                String query2 = this.f115397i;
                Intrinsics.checkNotNullParameter(query2, "$query");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                pinalytics.h(componenType, u0.SKIN_TONE_FILTER_REMEMBER_YES, auxData);
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "<this>");
                Intrinsics.checkNotNullParameter(tone, "tone");
                prefsManagerPersisted.b("PREF_SKIN_TONE_SELECTION", tone);
                eventManager.d(b0.c(new b0(searchType2, query2, null, null, null, null, null, null, null, "filter", null, null, null, tone, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -787460, 2097151), false, 3));
                this_apply.g(yb0.d.CONFIRM_BUTTON_CLICK);
                break;
        }
    }
}
