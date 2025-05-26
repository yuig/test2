package r71;

import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import h61.n;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k71.m;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import l71.i;
import l71.p;
import lh0.f3;
import nx.d0;
import o71.c0;
import o71.w;
import t3.s1;
import uj2.q;
import uk1.d;
import vq0.h;

/* loaded from: classes5.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final d f106407a;

    /* renamed from: b, reason: collision with root package name */
    public final q f106408b;

    /* renamed from: c, reason: collision with root package name */
    public final p f106409c;

    /* renamed from: d, reason: collision with root package name */
    public final w f106410d;

    /* renamed from: e, reason: collision with root package name */
    public final List f106411e;

    /* renamed from: f, reason: collision with root package name */
    public final f3 f106412f;

    /* renamed from: g, reason: collision with root package name */
    public String f106413g;

    /* renamed from: h, reason: collision with root package name */
    public String f106414h;

    /* renamed from: i, reason: collision with root package name */
    public Date f106415i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f106416j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f106417k;

    /* renamed from: l, reason: collision with root package name */
    public n f106418l;

    /* renamed from: m, reason: collision with root package name */
    public l71.q f106419m;

    /* renamed from: n, reason: collision with root package name */
    public String f106420n;

    /* renamed from: o, reason: collision with root package name */
    public o71.h f106421o;

    public b(d presenterPinalytics, q networkStateStream, p searchTypeaheadListener, w screenNavigatorManager, List searchDelightConfigs, f3 f3Var) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(searchTypeaheadListener, "searchTypeaheadListener");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(searchDelightConfigs, "searchDelightConfigs");
        this.f106407a = presenterPinalytics;
        this.f106408b = networkStateStream;
        this.f106409c = searchTypeaheadListener;
        this.f106410d = screenNavigatorManager;
        this.f106411e = searchDelightConfigs;
        this.f106412f = f3Var;
        this.f106413g = "";
        this.f106414h = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v24, types: [yk1.m] */
    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        String a13;
        Object view = (m) nVar;
        br.d model = (br.d) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            ?? j13 = s1.j(view2);
            r1 = j13 instanceof c0 ? j13 : null;
        }
        if (r1 != null) {
            String str = this.f106413g;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            r1.f93244i = str;
            r1.f93245j = this.f106416j;
            r1.f93246k = this.f106417k;
            r1.f93247l = this.f106420n;
            String str2 = this.f106414h;
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            r1.f93248m = str2;
            r1.f93249n = this.f106415i;
            r1.f93250o = this.f106418l;
            if (!Intrinsics.d(model, r1.f93240e) && model.f23707e == br.c.ENRICHED_AUTOCOMPLETE && (a13 = model.a()) != null && !z.j(a13)) {
                Map b13 = y0.b(new Pair("value", model.f23709g));
                d0 d0Var = this.f106407a.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.SEARCH_CURATED_SUGGESTION, (r18 & 4) != 0 ? null : g0.TYPEAHEAD_SUGGESTIONS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : new HashMap(b13), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
            r1.f93240e = model;
            r1.s3();
            l71.q qVar = this.f106419m;
            r1.f93242g = qVar != null ? ((i) qVar).a(i13) : false;
            r1.f93243h = i13;
            r1.f93251p = this.f106421o;
        }
    }

    @Override // vq0.h
    public final yk1.m f() {
        return new c0(this.f106407a, this.f106408b, this.f106409c, this.f106410d, this.f106411e, this.f106412f);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        br.d model = (br.d) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
