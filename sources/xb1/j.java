package xb1;

import ab1.o;
import dl1.s;
import h32.f1;
import h32.u0;
import i92.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import m60.w;
import nm.u;
import qz.f0;
import t90.n;
import w1.h0;
import wb1.c0;
import wb1.d0;
import wb1.l0;
import wk1.q;
import x02.x2;
import yb1.r;
import yq0.m;
import yq0.t;

/* loaded from: classes5.dex */
public final class j extends q implements com.pinterest.feature.settings.permissions.e {

    /* renamed from: a, reason: collision with root package name */
    public final w f134525a;

    /* renamed from: b, reason: collision with root package name */
    public final h20.a f134526b;

    /* renamed from: c, reason: collision with root package name */
    public final x10.d f134527c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f134528d;

    /* renamed from: e, reason: collision with root package name */
    public final k f134529e;

    /* renamed from: f, reason: collision with root package name */
    public final kc2.a f134530f;

    /* renamed from: g, reason: collision with root package name */
    public final go0.c f134531g;

    /* renamed from: h, reason: collision with root package name */
    public final g f134532h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uk1.d pinalytics, uj2.q networkStateStream, w eventManager, h20.a commentsFeaturesService, x10.d settingsApi, x2 userRepository, b60.b activeUserManager, k toastUtils, kc2.a videoPreferences) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(commentsFeaturesService, "commentsFeaturesService");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        this.f134525a = eventManager;
        this.f134526b = commentsFeaturesService;
        this.f134527c = settingsApi;
        this.f134528d = activeUserManager;
        this.f134529e = toastUtils;
        this.f134530f = videoPreferences;
        this.f134531g = new go0.c(userRepository, commentsFeaturesService, videoPreferences);
        this.f134532h = new g(this);
    }

    public static final void t3(j jVar, boolean z13, boolean z14) {
        go0.c cVar = jVar.f134531g;
        List F0 = CollectionsKt.F0(cVar.f135191h);
        Iterator it = F0.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((s) it.next()) instanceof d0) {
                break;
            } else {
                i13++;
            }
        }
        Object obj = F0.get(i13);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.settings.permissions.model.SettingsPermissionsMenuItem.CreatorManualFilterToggle");
        d0 d0Var = (d0) obj;
        d0Var.f125211f = z13;
        boolean z15 = d0Var.f125210e != z14;
        d0Var.f125210e = z14;
        m mVar = ((t) ((com.pinterest.feature.settings.permissions.f) jVar.getView())).f139732f0;
        if (mVar != null) {
            mVar.i(i13);
        }
        if (z15) {
            List list = (List) cVar.f65833q;
            if (list != null) {
                jVar.x3(d0.class, z14, new c0(list));
            } else {
                Intrinsics.r("creatorCommentsPhraseFilterList");
                throw null;
            }
        }
    }

    public static void w3(j jVar, String str, HashMap hashMap, Function1 function1, Function1 function12, String str2, boolean z13, int i13) {
        if ((i13 & 16) != 0) {
            str2 = null;
        }
        if ((i13 & 32) != 0) {
            z13 = false;
        }
        jVar.getClass();
        String sVar = ((u) vd0.c.f125622b.o(hashMap)).toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        jVar.f134526b.a(str, sVar, str2, z13).r(tk2.e.f118017c).l(wj2.c.a()).o(new o(24, new n(21, function1)), new o(25, new i(function12, jVar, str, hashMap, function1)));
    }

    public final void B3(bd1.b bVar, Object obj, String str, boolean z13, Function1 function1) {
        f0 f0Var = new f0();
        f0Var.d(obj, bVar.getValue());
        if (str != null) {
            f0Var.e("passcode", str);
        }
        f0Var.d(Boolean.valueOf(z13), "user_confirm_skip_passcode");
        kk2.t r13 = this.f134527c.a(f0Var.i()).l(wj2.c.a()).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        nl.b.q(r13, new n(23, function1), new h0(this, bVar, obj, str, function1, z13));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        nx.d0.v(getPinalytics(), f1.MANUAL_FILTERS_VISIT, null, false, 12);
        ((wk1.i) dataSources).b(this.f134531g);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.settings.permissions.f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        this.f134525a.h(this.f134532h);
        yb1.t tVar = (yb1.t) view;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        tVar.F0 = this;
    }

    @Override // yk1.b, yk1.m
    public final void unbind() {
        super.unbind();
        this.f134525a.j(this.f134532h);
        ((yb1.t) ((com.pinterest.feature.settings.permissions.f) getView())).F0 = null;
    }

    public final void v3(va1.t item, String text) {
        List split$default;
        List split$default2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(text, "text");
        getPinalytics().X(u0.ANALYTICS_BUTTON);
        boolean z13 = item instanceof c0;
        int i13 = 0;
        b60.b bVar = this.f134528d;
        if (z13) {
            nm.q qVar = new nm.q();
            HashMap hashMap = new HashMap();
            split$default2 = StringsKt__StringsKt.split$default(text, new String[]{", "}, false, 0, 6, null);
            Iterator it = split$default2.iterator();
            while (it.hasNext()) {
                qVar.s((String) it.next());
            }
            hashMap.put("comments_phrase_filter_list", qVar);
            String uid = com.bumptech.glide.d.Q(bVar).getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            w3(this, uid, hashMap, new h(this, i13), new h(this, 1), null, false, 48);
            return;
        }
        if (item instanceof l0) {
            nm.q qVar2 = new nm.q();
            HashMap hashMap2 = new HashMap();
            split$default = StringsKt__StringsKt.split$default(text, new String[]{", "}, false, 0, 6, null);
            Iterator it2 = split$default.iterator();
            while (it2.hasNext()) {
                qVar2.s((String) it2.next());
            }
            hashMap2.put("pinner_comments_phrase_filter_list", qVar2);
            String uid2 = com.bumptech.glide.d.Q(bVar).getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            w3(this, uid2, hashMap2, new h(this, 2), new h(this, 3), null, false, 48);
        }
    }

    public final void x3(Class cls, boolean z13, va1.t tVar) {
        go0.c cVar = this.f134531g;
        int i13 = 0;
        for (Object obj : CollectionsKt.F0(cVar.f135191h)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            if (Intrinsics.d(((s) obj).getClass(), cls)) {
                if (z13) {
                    cVar.r(i14, tVar);
                } else {
                    cVar.removeItem(i14);
                }
            }
            i13 = i14;
        }
    }

    public final void z3(String str, Class cls, boolean z13, va1.t tVar, r rVar) {
        HashMap hashMap = new HashMap();
        getPinalytics().X(u0.ANALYTICS_BUTTON);
        hashMap.put(str, Boolean.valueOf(z13));
        String uid = com.bumptech.glide.d.Q(this.f134528d).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        w3(this, uid, hashMap, new z9.n(3, this, cls, tVar, rVar, z13), new n(22, rVar), null, false, 48);
    }
}
