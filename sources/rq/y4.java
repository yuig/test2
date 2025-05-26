package rq;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import so.bb;

/* loaded from: classes3.dex */
public final class y4 extends r1 implements nx.v {

    /* renamed from: b, reason: collision with root package name */
    public final oq.d1 f109673b;

    /* renamed from: c, reason: collision with root package name */
    public final yk1.j f109674c;

    /* renamed from: d, reason: collision with root package name */
    public final bb f109675d;

    /* renamed from: e, reason: collision with root package name */
    public final hs.d f109676e;

    /* renamed from: f, reason: collision with root package name */
    public sf1.e1 f109677f;

    /* renamed from: g, reason: collision with root package name */
    public rf1.p0 f109678g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109679h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Context context, oq.d1 storyPinCloseupParams, yk1.j mvpBinder, bb ideaPinInPinCloseupCreatorFactory, hs.d moduleViewabilityHelper) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storyPinCloseupParams, "storyPinCloseupParams");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(ideaPinInPinCloseupCreatorFactory, "ideaPinInPinCloseupCreatorFactory");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        this.f109673b = storyPinCloseupParams;
        this.f109674c = mvpBinder;
        this.f109675d = ideaPinInPinCloseupCreatorFactory;
        this.f109676e = moduleViewabilityHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r11 = this;
            com.pinterest.api.model.f30 r8 = r11.getPin()
            if (r8 != 0) goto L7
            return
        L7:
            boolean r0 = a11.o.a(r8)
            r9 = 0
            if (r0 != 0) goto L17
            boolean r0 = a11.o.b(r8)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r10 = r9
            goto L19
        L17:
            r0 = 1
            r10 = r0
        L19:
            nx.d0 r5 = r11.getViewPinalytics()
            if (r5 != 0) goto L21
            goto Lba
        L21:
            hs.d r0 = r11.f109676e
            boolean r0 = r0.a()
            r1 = 11
            r2 = 0
            java.lang.String r3 = "getContext(...)"
            if (r0 == 0) goto L3b
            oq.g r0 = new oq.g
            int r4 = eo1.c.space_0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r2, r4, r1)
        L39:
            r6 = r0
            goto L53
        L3b:
            if (r10 == 0) goto L52
            oq.g r0 = new oq.g
            android.content.Context r4 = r11.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            int r4 = kh2.g0.v(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r2, r4, r1)
            goto L39
        L52:
            r6 = r2
        L53:
            android.content.Context r1 = r11.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            android.app.Activity r2 = bs1.c.l0(r11)
            r7 = 0
            so.bb r0 = r11.f109675d
            oq.d1 r3 = r11.f109673b
            r4 = r8
            oq.f r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            rf1.p0 r1 = r0.c()
            java.lang.String r2 = r8.getUid()
            rf1.p0.F4(r1, r2, r8, r9)
            r11.f109678g = r1
            sf1.e1 r0 = r0.d()
            if (r10 != 0) goto L85
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
        L85:
            android.view.ViewGroup r1 = r0.f112556o
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            if (r2 == 0) goto Lbb
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = eo1.c.space_200
            int r3 = bs1.c.W(r0, r3)
            r2.setMarginEnd(r3)
            int r3 = eo1.c.space_200
            int r3 = bs1.c.W(r0, r3)
            r2.topMargin = r3
            r1.setLayoutParams(r2)
            sf1.c r1 = sf1.c.f112532y
            com.pinterest.gestalt.iconcomponent.GestaltIcon r2 = r0.f112557p
            dl2.b.z(r2, r1)
            r11.f109677f = r0
            rf1.p0 r1 = r11.f109678g
            if (r1 == 0) goto Lb5
            yk1.j r2 = r11.f109674c
            r2.d(r0, r1)
        Lb5:
            sf1.e1 r0 = r11.f109677f
            r11.addView(r0)
        Lba:
            return
        Lbb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.y4.b():void");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        b();
    }

    public final Set e() {
        sf1.e1 e1Var = this.f109677f;
        if (e1Var == null) {
            return kotlin.collections.s0.f80394a;
        }
        HashSet hashSet = new HashSet();
        sf1.e1.X(e1Var, hashSet);
        return hashSet;
    }

    public final void g(boolean z13) {
        this.f109679h = z13;
        rf1.p0 p0Var = this.f109678g;
        if (p0Var != null) {
            if (z13) {
                p0Var.h4();
            } else {
                p0Var.i4();
            }
        }
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        sf1.e1 e1Var = this.f109677f;
        if (e1Var != null) {
            return kotlin.collections.e0.b(e1Var);
        }
        return null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_STORY_PIN_PAGE;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionStart() {
        return null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        sf1.e1 e1Var = this.f109677f;
        if (e1Var != null) {
            e1Var.onKeyDown(i13, keyEvent);
        }
        return super.onKeyDown(i13, keyEvent);
    }

    @Override // jq.a
    public final void openPinOverflowMenuModal(boolean z13) {
        rf1.p0 p0Var = this.f109678g;
        if (p0Var != null) {
            sf1.j1.Z1(p0Var, this);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // jq.a
    public final void showLoadingSpinner(boolean z13) {
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateActive(boolean z13) {
        rf1.p0 p0Var;
        if (z13 != getIsActive() && this.f109679h && (p0Var = this.f109678g) != null) {
            if (z13) {
                p0Var.h4();
            } else {
                p0Var.i4();
            }
        }
        super.updateActive(z13);
    }

    @Override // rq.r1
    public final void updateMediaViewSize(int i13) {
        sf1.e1 e1Var = this.f109677f;
        if (e1Var != null) {
            e1Var.K0(i13);
            ViewGroup.LayoutParams layoutParams = e1Var.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i13;
            e1Var.setLayoutParams(layoutParams);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        super.updateView();
        if (this.f109678g == null) {
            b();
        }
    }
}
