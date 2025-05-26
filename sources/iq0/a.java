package iq0;

import a.cb;
import a.z0;
import android.content.Context;
import eq0.m;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import qa2.n;
import so.oa;
import so.x6;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liq0/a;", "Lgq0/d;", "Leq0/e;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends i implements eq0.e {

    /* renamed from: f1, reason: collision with root package name */
    public static final /* synthetic */ int f73386f1 = 0;
    public uk1.e X0;
    public i2 Y0;
    public x6 Z0;

    /* renamed from: a1, reason: collision with root package name */
    public w f73387a1;

    /* renamed from: b1, reason: collision with root package name */
    public m f73388b1;

    /* renamed from: c1, reason: collision with root package name */
    public final d4 f73389c1 = d4.CONVERSATION;

    /* renamed from: d1, reason: collision with root package name */
    public final a4 f73390d1 = a4.FEED_RELATED_PIN;

    /* renamed from: e1, reason: collision with root package name */
    public final g0 f73391e1 = g0.MODAL_CONVERSATION_DISCOVERY;

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // gq0.d, sq0.e
    public final n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        return new eq0.d(s7(), y32.f.CLOSEUP_LONGPRESS, new z0(this, 4)).a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        eq0.n nVar;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.X0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.Y0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        x6 x6Var = this.Z0;
        if (x6Var == null) {
            Intrinsics.r("conversationRelatedPinsTabPresenterFactory");
            throw null;
        }
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_ID", "");
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID", "");
        boolean G = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_CONVO_SHOULD_CREATE_NEW_THREAD", false);
        String Z3 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_NEW_THREAD_PIN_ANCHOR_ID", "");
        String Z4 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_NEW_THREAD_TEXT_ANCHOR", "");
        if (Z2.length() > 0) {
            String Z5 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_THREAD_ID", "");
            nVar = new eq0.n(Z5.length() == 0 ? null : Z5, Z2, null, null, false);
        } else if (!G || (Z3.length() <= 0 && Z4.length() <= 0)) {
            nVar = null;
        } else {
            String Z6 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_THREAD_ID", "");
            nVar = new eq0.n(z.j(Z6) ? null : Z6, Z2, Z4, Z3, true);
        }
        w wVar = this.f73387a1;
        if (wVar != null) {
            return x6Var.a(Z, nVar, wVar, a13);
        }
        Intrinsics.r("localEventManager");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF128048d1() {
        return this.f73391e1;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.f73390d1;
    }

    @Override // gq0.d, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f73389c1;
    }

    @Override // eq0.e
    public final void r(m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f73388b1 = listener;
    }

    @Override // eq0.e
    public final void y5(hq0.f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
