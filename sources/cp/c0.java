package cp;

import android.content.Context;
import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.fw;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import x40.xd;

/* loaded from: classes3.dex */
public final class c0 extends hb0.d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f52921g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f52922d;

    /* renamed from: e, reason: collision with root package name */
    public final no1.e f52923e;

    /* renamed from: f, reason: collision with root package name */
    public ek2.f f52924f;

    public c0(String conversationId, no1.e conversationDatasource) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationDatasource, "conversationDatasource");
        this.f52922d = conversationId;
        this.f52923e = conversationDatasource;
    }

    @Override // hb0.c
    public final void c() {
        no1.e eVar = this.f52923e;
        eVar.getClass();
        String uid = this.f52922d;
        Intrinsics.checkNotNullParameter(uid, "uid");
        fk2.l h10 = com.bumptech.glide.d.u0(eVar.f91667a.a(new xd(uid))).i().h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        this.f52924f = h10.i(new b0(this, 0), new vo.a(24, new z3.m(this, 10)));
        fw.f37821a.getClass();
        LruCache lruCache = ew.f37369m;
        synchronized (lruCache) {
            lruCache.remove(uid);
        }
    }

    @Override // hb0.d
    public final void e() {
        m60.w wVar = m60.u.f85943a;
        kp.h hVar = new kp.h();
        hVar.f80540a = this.f52922d;
        wVar.d(hVar);
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().k(xc0.i.remove_conversation_confirm);
        nx.d0 a13 = sh.f.a();
        f1 f1Var = f1.CONVERSATION_HIDE;
        u0 u0Var = u0.CONVERSATION_HIDE_BUTTON;
        Intrinsics.f(a13);
        a13.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : this.f52922d, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }
}
