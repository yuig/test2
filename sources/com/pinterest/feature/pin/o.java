package com.pinterest.feature.pin;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.f30;
import com.pinterest.ui.imageview.WebImageView;
import i32.y0;
import java.util.Set;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.w;
import rg0.y;
import so.h4;
import so.i4;
import so.oa;
import so.r8;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47248a;

    /* renamed from: b, reason: collision with root package name */
    public final ku1.j f47249b;

    /* renamed from: c, reason: collision with root package name */
    public final rg0.s f47250c;

    /* renamed from: d, reason: collision with root package name */
    public final jo1.c f47251d;

    /* renamed from: e, reason: collision with root package name */
    public final r f47252e;

    /* renamed from: f, reason: collision with root package name */
    public final w f47253f;

    /* renamed from: g, reason: collision with root package name */
    public final p f47254g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47255h;

    /* renamed from: i, reason: collision with root package name */
    public final WebImageView f47256i;

    /* renamed from: j, reason: collision with root package name */
    public final f f47257j;

    /* renamed from: k, reason: collision with root package name */
    public final h f47258k;

    public o(MainActivity context, View rootView, ku1.j navigationManager, rg0.s experiences, jo1.c baseGridActionUtils, r repinAnimationUtil, w eventManager, p pVar, h4 defaultRepinAnimationFactory, i4 exaggeratedRepinAnimationFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(baseGridActionUtils, "baseGridActionUtils");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(defaultRepinAnimationFactory, "defaultRepinAnimationFactory");
        Intrinsics.checkNotNullParameter(exaggeratedRepinAnimationFactory, "exaggeratedRepinAnimationFactory");
        this.f47248a = context;
        this.f47249b = navigationManager;
        this.f47250c = experiences;
        this.f47251d = baseGridActionUtils;
        this.f47252e = repinAnimationUtil;
        this.f47253f = eventManager;
        this.f47254g = pVar;
        this.f47256i = (WebImageView) rootView.findViewById(t0.repin_profile_image);
        r70.a a13 = a();
        r8 r8Var = defaultRepinAnimationFactory.f113444a;
        this.f47257j = new f(context, rootView, a13, (r70.f) r8Var.f114090a.Ac.get(), (ku1.j) r8Var.f114091b.f114402n.get());
        r70.a a14 = a();
        r8 r8Var2 = exaggeratedRepinAnimationFactory.f113459a;
        ku1.j jVar = (ku1.j) r8Var2.f114091b.f114402n.get();
        oa oaVar = r8Var2.f114090a;
        this.f47258k = new h(context, rootView, a14, jVar, (jo1.c) oaVar.f113810md.get(), (b60.b) oaVar.f113850p0.get(), (r70.f) oaVar.Ac.get(), (es.a) oaVar.P6.get());
    }

    public final r70.a a() {
        com.pinterest.framework.screens.s sVar = this.f47249b.f80914l;
        r70.a aVar = sVar != null ? sVar.f49234i : null;
        if (aVar instanceof r70.a) {
            return aVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rg0.n b() {
        /*
            r6 = this;
            ku1.j r0 = r6.f47249b
            com.pinterest.framework.screens.s r0 = r0.f80914l
            r1 = 0
            if (r0 == 0) goto Lc
            com.pinterest.framework.screens.m r0 = r0.j()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r2 = r0 instanceof nl1.d
            if (r2 == 0) goto L14
            nl1.d r0 = (nl1.d) r0
            goto L15
        L14:
            r0 = r1
        L15:
            jo1.c r2 = r6.f47251d
            r2.getClass()
            jo1.a r2 = jo1.c.a(r0)
            boolean r3 = r0 instanceof com.pinterest.feature.core.view.MvpViewPagerFragment
            if (r3 == 0) goto L26
            r3 = r0
            com.pinterest.feature.core.view.MvpViewPagerFragment r3 = (com.pinterest.feature.core.view.MvpViewPagerFragment) r3
            goto L27
        L26:
            r3 = r1
        L27:
            if (r3 == 0) goto L2e
            nl1.d r3 = r3.Z7()
            goto L2f
        L2e:
            r3 = r1
        L2f:
            jo1.a r4 = jo1.a.MORE_IDEAS
            if (r2 == r4) goto L8e
            if (r3 == 0) goto L3a
            java.lang.Class r4 = r3.getClass()
            goto L3b
        L3a:
            r4 = r1
        L3b:
            xk2.v r5 = com.pinterest.screens.k3.f51026a
            java.lang.Object r5 = r5.getValue()
            com.pinterest.framework.screens.ScreenLocation r5 = (com.pinterest.framework.screens.ScreenLocation) r5
            java.lang.Class r5 = r5.getF46596a()
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            if (r4 == 0) goto L4e
            goto L8e
        L4e:
            if (r0 == 0) goto L55
            java.lang.Class r0 = r0.getClass()
            goto L56
        L55:
            r0 = r1
        L56:
            xk2.v r4 = com.pinterest.screens.k3.f51029d
            java.lang.Object r5 = r4.getValue()
            com.pinterest.framework.screens.ScreenLocation r5 = (com.pinterest.framework.screens.ScreenLocation) r5
            java.lang.Class r5 = r5.getF46596a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r5)
            if (r0 != 0) goto L8b
            if (r3 == 0) goto L6f
            java.lang.Class r0 = r3.getClass()
            goto L70
        L6f:
            r0 = r1
        L70:
            java.lang.Object r3 = r4.getValue()
            com.pinterest.framework.screens.ScreenLocation r3 = (com.pinterest.framework.screens.ScreenLocation) r3
            java.lang.Class r3 = r3.getF46596a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r0 == 0) goto L81
            goto L8b
        L81:
            jo1.a r0 = jo1.a.HOMEFEED
            if (r2 != r0) goto L88
            i32.y0 r0 = i32.y0.ANDROID_HOME_FEED_AFTER_SAVE
            goto L90
        L88:
            i32.y0 r0 = i32.y0.NOOP
            goto L90
        L8b:
            i32.y0 r0 = i32.y0.ANDROID_TOPIC_LANDING_FEED_AFTER_SAVE
            goto L90
        L8e:
            i32.y0 r0 = i32.y0.ANDROID_BOARD_MORE_IDEAS_FEED_AFTER_SAVE
        L90:
            rg0.s r2 = r6.f47250c
            dh0.d r2 = (dh0.d) r2
            rg0.n r0 = r2.b(r0)
            if (r0 == 0) goto La5
            i32.l r2 = i32.l.ANDROID_REPIN_ANIMATION_AFTER_SAVE
            int r2 = r2.value()
            int r3 = r0.f108060b
            if (r3 != r2) goto La5
            return r0
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.pin.o.b():rg0.n");
    }

    public final void c(f30 f30Var, Set set, RepinAnimationData repinAnimationData, boolean z13) {
        d dVar;
        if (repinAnimationData == null || b() == null) {
            dVar = this.f47257j;
        } else {
            rg0.n b13 = b();
            if (b13 != null) {
                b13.g();
            }
            lb0.p pVar = lb0.n.f82725d;
            int f13 = ((lb0.b) pVar.a()).f("PREF_EXAGGERATED_REPIN_ANIMATION_VIEW_COUNT", 0) + 1;
            if (f13 == 5) {
                this.f47252e.getClass();
                ((lb0.b) pVar.a()).l("PREF_EXAGGERATED_REPIN_ANIMATION_VIEW_COUNT", 0);
                for (y0 placement : f0.j(y0.ANDROID_HOME_FEED_AFTER_SAVE, y0.ANDROID_BOARD_MORE_IDEAS_FEED_AFTER_SAVE, y0.ANDROID_TOPIC_LANDING_FEED_AFTER_SAVE)) {
                    rg0.n b14 = ((dh0.d) this.f47250c).b(placement);
                    if (b14 != null) {
                        if (b14.f108060b == i32.l.ANDROID_REPIN_ANIMATION_AFTER_SAVE.value()) {
                            dh0.d dVar2 = (dh0.d) y.a();
                            dVar2.getClass();
                            Intrinsics.checkNotNullParameter(placement, "placement");
                            dVar2.f54984c.remove(placement);
                        }
                    }
                }
            } else {
                ((lb0.b) pVar.a()).l("PREF_EXAGGERATED_REPIN_ANIMATION_VIEW_COUNT", f13);
            }
            dVar = this.f47258k;
        }
        dVar.j(f30Var, set, new ky0.b(7, this, f30Var), repinAnimationData, z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.pinterest.api.model.f30 r10, com.pinterest.feature.pin.RepinAnimationData r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.pinterest.feature.pin.p r1 = r9.f47254g
            if (r1 == 0) goto L39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.LinkedHashSet r0 = r1.f47259a
            java.lang.String r1 = bs1.c.p0(r10)
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L1b
            kotlin.collections.s0 r0 = kotlin.collections.s0.f80394a
            goto L34
        L1b:
            java.lang.String r1 = bs1.c.p0(r10)
            r0.add(r1)
            int r1 = r0.size()
            r2 = 5
            if (r1 != r2) goto L32
            java.util.LinkedHashSet r1 = kotlin.collections.CollectionsKt.I0(r0)
            r0.clear()
            r0 = r1
            goto L34
        L32:
            kotlin.collections.s0 r0 = kotlin.collections.s0.f80394a
        L34:
            if (r0 != 0) goto L37
            goto L39
        L37:
            r5 = r0
            goto L3c
        L39:
            kotlin.collections.s0 r0 = kotlin.collections.s0.f80394a
            goto L37
        L3c:
            boolean r0 = r9.f47255h
            if (r0 == 0) goto L46
            com.pinterest.feature.pin.f r10 = r9.f47257j
            r10.h()
            return
        L46:
            r0 = 1
            r9.f47255h = r0
            r70.a r2 = r9.a()
            if (r2 == 0) goto L6e
            boolean r0 = r2.a()
            if (r0 == 0) goto L59
            r9.c(r10, r5, r11, r12)
            goto L6e
        L59:
            android.widget.LinearLayout r0 = r2.getView()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.pinterest.feature.pin.n r8 = new com.pinterest.feature.pin.n
            r1 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.addOnGlobalLayoutListener(r8)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.pin.o.d(com.pinterest.api.model.f30, com.pinterest.feature.pin.RepinAnimationData, boolean):void");
    }
}
