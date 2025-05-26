package oq;

import android.app.Activity;
import android.content.Context;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f97018a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f97019b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f97020c;

    /* renamed from: d, reason: collision with root package name */
    public final f30 f97021d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.d0 f97022e;

    /* renamed from: f, reason: collision with root package name */
    public final g f97023f;

    /* renamed from: g, reason: collision with root package name */
    public final sf1.v0 f97024g;

    /* renamed from: h, reason: collision with root package name */
    public final es.a f97025h;

    /* renamed from: i, reason: collision with root package name */
    public final es.h f97026i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f97027j;

    /* renamed from: k, reason: collision with root package name */
    public final mf1.a f97028k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f97029l;

    public f(Context context, Activity activity, d1 storyPinCloseupParams, f30 pin, nx.d0 pinalytics, g gVar, sf1.v0 v0Var, es.a adFormats, es.h adsCommonDisplay, hs.d moduleViewabilityHelper) {
        mf1.a aVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storyPinCloseupParams, "storyPinCloseupParams");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        this.f97018a = context;
        this.f97019b = activity;
        this.f97020c = storyPinCloseupParams;
        this.f97021d = pin;
        this.f97022e = pinalytics;
        this.f97023f = gVar;
        this.f97024g = v0Var;
        this.f97025h = adFormats;
        this.f97026i = adsCommonDisplay;
        this.f97027j = moduleViewabilityHelper.a();
        if (n60.o.B(pin, "getIsPromoted(...)")) {
            aVar = mf1.a.PIN_CLOSEUP_PROMOTED;
        } else if (gVar == null || (aVar = gVar.f97033a) == null) {
            aVar = mf1.a.PIN_CLOSEUP;
        }
        this.f97028k = aVar;
        this.f97029l = ig1.b.e1(activity) && !b40.P0(pin);
    }

    public static int b() {
        return hf0.b.p() ? com.bumptech.glide.c.G() : hf0.b.n() ? (int) (hf0.b.f69002b / 2) : ml2.c.c(hf0.b.f69002b);
    }

    public final int a(int i13) {
        f30 f30Var = this.f97021d;
        boolean P0 = b40.P0(f30Var);
        float p13 = c0.d.p(f30Var);
        d1 d1Var = this.f97020c;
        return (d1Var.f97012g && d1Var.f97014i && !P0) ? hf0.b.f69003c / 2 : c0.d.r((int) (i13 / p13), P0, 0, 4);
    }

    public final rf1.p0 c() {
        d1 d1Var = this.f97020c;
        so.t tVar = (so.t) d1Var.f97006a.get();
        rf1.q0 a13 = rf1.r0.a(this.f97018a, new e(this, 0), this.f97028k);
        rf1.u0 origin = new rf1.u0(d1Var.f97011f, d1Var.f97009d, d1Var.f97010e, rf1.r0.f107893b.f107915d);
        rf1.t0 t0Var = rf1.r0.f107892a;
        es.c cVar = (es.c) this.f97025h;
        f30 f30Var = this.f97021d;
        boolean z13 = !cVar.U(f30Var);
        sf1.u0 primaryActionType = t0Var.f107903a;
        Intrinsics.checkNotNullParameter(primaryActionType, "primaryActionType");
        tf1.b pageProgression = t0Var.f107904b;
        Intrinsics.checkNotNullParameter(pageProgression, "pageProgression");
        rf1.t0 featureDisplay = new rf1.t0(primaryActionType, pageProgression, t0Var.f107905c, z13, t0Var.f107907e, t0Var.f107908f);
        boolean P0 = b40.P0(f30Var);
        e eventLogging = new e(this, 1);
        rf1.a0 userActionLogging = rf1.a0.f107733l;
        Function0 presenterPinalyticsProvider = a13.f107880a;
        Intrinsics.checkNotNullParameter(presenterPinalyticsProvider, "presenterPinalyticsProvider");
        rf1.a musicStateProvider = a13.f107881b;
        Intrinsics.checkNotNullParameter(musicStateProvider, "musicStateProvider");
        Intrinsics.checkNotNullParameter(featureDisplay, "featureDisplay");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(eventLogging, "eventLogging");
        Intrinsics.checkNotNullParameter(userActionLogging, "userActionLogging");
        Map pinFeedbackStateUpdates = a13.f107886g;
        Intrinsics.checkNotNullParameter(pinFeedbackStateUpdates, "pinFeedbackStateUpdates");
        mf1.a ideaPinHostView = a13.f107889j;
        Intrinsics.checkNotNullParameter(ideaPinHostView, "ideaPinHostView");
        return tVar.a(new rf1.q0(presenterPinalyticsProvider, musicStateProvider, featureDisplay, origin, eventLogging, userActionLogging, pinFeedbackStateUpdates, d1Var.f97012g, P0, ideaPinHostView));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 sf1.e1, still in use, count: 2, list:
          (r4v1 sf1.e1) from 0x0152: MOVE (r33v0 sf1.e1) = (r4v1 sf1.e1)
          (r4v1 sf1.e1) from 0x013c: MOVE (r33v2 sf1.e1) = (r4v1 sf1.e1)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final sf1.e1 d() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.f.d():sf1.e1");
    }

    public final int e() {
        Activity activity = this.f97019b;
        return activity != null ? hf0.b.d(activity) - hf0.b.f() : hf0.b.f69003c;
    }
}
