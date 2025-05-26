package rq;

import android.content.Context;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class w3 extends PinCloseupBaseModule {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f109618h = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f109619a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f109620b;

    /* renamed from: c, reason: collision with root package name */
    public final e11.a f109621c;

    /* renamed from: d, reason: collision with root package name */
    public i92.k f109622d;

    /* renamed from: e, reason: collision with root package name */
    public is1.i0 f109623e;

    /* renamed from: f, reason: collision with root package name */
    public oq.q0 f109624f;

    /* renamed from: g, reason: collision with root package name */
    public final xj2.b f109625g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Context context, e11.a pinCloseupMetadataModuleListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataModuleListener, "pinCloseupMetadataModuleListener");
        inject();
        this.f109620b = context;
        this.f109621c = pinCloseupMetadataModuleListener;
        this.f109625g = new xj2.b();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 7));
        } else {
            pinCloseupMetadataModuleListener.w6(getHeight());
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        boolean z13;
        String uid;
        updateHorizontalPadding();
        setOrientation(1);
        f30 pin = getPin();
        if (pin == null || (uid = pin.getUid()) == null) {
            z13 = false;
        } else {
            is1.i0 i0Var = this.f109623e;
            if (i0Var == null) {
                Intrinsics.r("translationsTracker");
                throw null;
            }
            z13 = i0Var.e(uid);
        }
        oq.q0 q0Var = new oq.q0(this.f109620b, 0);
        db.m action = new db.m(this, 18);
        Intrinsics.checkNotNullParameter(action, "action");
        ((GestaltText) q0Var.f97131a).setOnClickListener(new co.a(12, q0Var, action));
        q0Var.a(z13 ? oq.p0.SHOW_ORIGINAL : oq.p0.SHOW_TRANSLATION);
        this.f109624f = q0Var;
        addView(q0Var);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_MACHINE_TRANSLATIONS;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        f30 pin;
        f30 pin2 = getPin();
        return pin2 != null && Intrinsics.d(pin2.d5(), Boolean.FALSE) && (pin = getPin()) != null && Intrinsics.d(pin.j5(), Boolean.TRUE);
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109619a) {
            return;
        }
        this.f109619a = true;
        jb jbVar = (jb) ((x3) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109622d = (i92.k) oaVar.f113921t1.get();
        this.f109623e = (is1.i0) oaVar.Yf.get();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f109625g.d();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return hasContent();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }
}
