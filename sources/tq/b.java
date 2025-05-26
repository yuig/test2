package tq;

import android.content.Context;
import android.view.ViewGroup;
import com.pinterest.activity.pin.view.PinCloseupChevronIconView;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public abstract class b extends PinCloseupBaseModule {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f118799j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f118800a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f118801b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f118802c;

    /* renamed from: d, reason: collision with root package name */
    public ViewGroup f118803d;

    /* renamed from: e, reason: collision with root package name */
    public PinCloseupChevronIconView f118804e;

    /* renamed from: f, reason: collision with root package name */
    public ViewGroup f118805f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f118806g;

    /* renamed from: h, reason: collision with root package name */
    public int f118807h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f118808i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f118800a = true;
        this.f118801b = true;
        inject();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            android.view.ViewGroup r3 = r10.e()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            r5 = 0
            if (r4 == 0) goto L13
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L14
        L13:
            r3 = r5
        L14:
            if (r3 == 0) goto L19
            int r3 = r3.topMargin
            goto L1a
        L19:
            r3 = r2
        L1a:
            android.view.ViewGroup r4 = r10.f118805f
            if (r4 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r6 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L29
            r5 = r4
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L29:
            if (r5 == 0) goto L2e
            int r4 = r5.topMargin
            goto L2f
        L2e:
            r4 = r2
        L2f:
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = -r3
            android.view.ViewGroup r4 = r10.e()
            boolean r5 = r10.f118801b
            r6 = 200(0xc8, double:9.9E-322)
            r8 = 0
            if (r5 == 0) goto L6b
            android.view.ViewGroup r5 = r10.f118805f
            if (r5 != 0) goto L42
            goto L47
        L42:
            r9 = 8
            r5.setVisibility(r9)
        L47:
            r4.setVisibility(r2)
            float[] r0 = new float[r0]
            r0[r2] = r3
            r0[r1] = r8
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            tq.e r1 = new tq.e
            r1.<init>(r4, r2)
            r0.addUpdateListener(r1)
            r0.setDuration(r6)
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            r0.start()
            goto L94
        L6b:
            float[] r0 = new float[r0]
            r0[r2] = r8
            r0[r1] = r3
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            tq.e r2 = new tq.e
            r2.<init>(r4, r1)
            r0.addUpdateListener(r2)
            ua.m0 r1 = new ua.m0
            r2 = 4
            r1.<init>(r4, r10, r2)
            r0.addListener(r1)
            r0.setDuration(r6)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            r0.start()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tq.b.b():void");
    }

    public final ViewGroup e() {
        ViewGroup viewGroup = this.f118803d;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.r("expandedContent");
        throw null;
    }

    public final void g(u0 u0Var) {
        nx.d0 viewPinalytics = getViewPinalytics();
        if (viewPinalytics != null) {
            f1 f1Var = f1.TAP;
            h32.g0 g0Var = h32.g0.PIN_CLOSEUP_PRODUCT_DETAILS;
            HashMap hashMap = new HashMap();
            f30 pin = getPin();
            if (pin != null) {
                getPinAuxHelper().c(pin, hashMap);
            }
            Unit unit = Unit.f80348a;
            viewPinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // rq.k
    public final void inject() {
        if (this.f118808i) {
            return;
        }
        this.f118808i = true;
        g0 g0Var = (g0) this;
        jb jbVar = (jb) ((h0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        g0Var.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        g0Var.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        g0Var.closeupActionController = s8Var.h5();
        g0Var.bidiFormatter = a02.e.I1();
        g0Var.baseCloseupLibraryExperiments = s8Var.k5();
        g0Var.pinAuxHelper = (nx.b0) oaVar.R8.get();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public boolean shouldUpdateView() {
        return hasContent();
    }
}
