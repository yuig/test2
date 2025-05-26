package gd0;

import android.content.res.Resources;
import android.view.View;
import b10.z;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bg;
import com.pinterest.api.model.f30;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubRecentPinRow;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import qb0.j;
import ra0.l0;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f64802a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64803b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64804c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f64805d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f64806e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f64807f;

    public b(boolean z13, String recentPinMetricKey, int i13, id0.b recentPinStateAction, c showIdeaStreamAction, id0.b logAction) {
        Intrinsics.checkNotNullParameter(recentPinMetricKey, "recentPinMetricKey");
        Intrinsics.checkNotNullParameter(recentPinStateAction, "recentPinStateAction");
        Intrinsics.checkNotNullParameter(showIdeaStreamAction, "showIdeaStreamAction");
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        this.f64802a = z13;
        this.f64803b = recentPinMetricKey;
        this.f64804c = i13;
        this.f64805d = recentPinStateAction;
        this.f64806e = showIdeaStreamAction;
        this.f64807f = logAction;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        bg bgVar;
        bg bgVar2;
        CreatorHubRecentPinRow view = (CreatorHubRecentPinRow) nVar;
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Map V3 = model.V3();
        final int i14 = 0;
        Integer num = 0;
        String str = this.f64803b;
        int intValue = ((V3 == null || (bgVar2 = (bg) V3.get(str)) == null) ? num : bgVar2.v()).intValue();
        Map V32 = model.V3();
        if (V32 != null && (bgVar = (bg) V32.get(str)) != null) {
            num = bgVar.B();
        }
        int intValue2 = num.intValue();
        DateFormat dateInstance = DateFormat.getDateInstance(3);
        dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        String uid = model.getUid();
        boolean Q0 = b40.Q0(model);
        String p03 = bs1.c.p0(model);
        int i15 = rd0.d.stats_impressions;
        String b13 = j.b(intValue);
        int i16 = this.f64804c;
        List j13 = f0.j(new fd0.h(i15, i16, null, b13), new fd0.h(rd0.d.stats_saves, i16, null, j.b(intValue2)));
        String r43 = model.r4();
        if (r43 == null) {
            r43 = "";
        }
        String str2 = r43;
        String format = model.U3() != null ? dateInstance.format(model.U3()) : null;
        Intrinsics.f(uid);
        final hd0.j state = new hd0.j(uid, i13, this.f64802a, Q0, p03, j13, format, str2, new z(18, this, model), this.f64806e, this.f64807f);
        view.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        WebImageView webImageView = view.f44805d;
        webImageView.loadUrl(state.f68871e);
        webImageView.setOnClickListener(new View.OnClickListener() { // from class: jd0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i14;
                hd0.j state2 = state;
                switch (i17) {
                    case 0:
                        int i18 = CreatorHubRecentPinRow.f44804m;
                        Intrinsics.checkNotNullParameter(state2, "$state");
                        if (!state2.f68869c) {
                            state2.f68876j.invoke(Integer.valueOf(state2.f68868b));
                            break;
                        } else {
                            state2.f68875i.invoke();
                            break;
                        }
                    default:
                        int i19 = CreatorHubRecentPinRow.f44804m;
                        Intrinsics.checkNotNullParameter(state2, "$state");
                        state2.f68875i.invoke();
                        break;
                }
            }
        });
        webImageView.setContentDescription(state.f68874h);
        Resources resources = view.getResources();
        List list = state.f68872f;
        String string = resources.getString(((fd0.h) list.get(0)).f61851a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(view.f44806e, string);
        a0.p(view.f44807f, ((fd0.h) list.get(0)).f61854d);
        final int i17 = 1;
        String string2 = view.getResources().getString(((fd0.h) list.get(1)).f61851a);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        a0.p(view.f44808g, string2);
        a0.p(view.f44809h, ((fd0.h) list.get(1)).f61854d);
        String str3 = state.f68873g;
        GestaltText gestaltText = view.f44811j;
        GestaltText gestaltText2 = view.f44810i;
        if (str3 != null) {
            a0.w1(gestaltText2);
            gestaltText.i(new l0(state, 23));
        } else {
            a0.k0(gestaltText2);
            a0.k0(gestaltText);
        }
        view.f44812k.setOnClickListener(new View.OnClickListener() { // from class: jd0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i172 = i17;
                hd0.j state2 = state;
                switch (i172) {
                    case 0:
                        int i18 = CreatorHubRecentPinRow.f44804m;
                        Intrinsics.checkNotNullParameter(state2, "$state");
                        if (!state2.f68869c) {
                            state2.f68876j.invoke(Integer.valueOf(state2.f68868b));
                            break;
                        } else {
                            state2.f68875i.invoke();
                            break;
                        }
                    default:
                        int i19 = CreatorHubRecentPinRow.f44804m;
                        Intrinsics.checkNotNullParameter(state2, "$state");
                        state2.f68875i.invoke();
                        break;
                }
            }
        });
        if (view.f44813l) {
            return;
        }
        md0.a aVar = md0.a.CREATOR_RECENT_PINS_ROW_VIEWED;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("pin_id", state.f68867a);
        aVar.setAuxData(hashMap);
        state.f68877k.invoke(aVar);
        view.f44813l = true;
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
