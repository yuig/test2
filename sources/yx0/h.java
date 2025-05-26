package yx0;

import androidx.appcompat.widget.x;
import bv0.k;
import ck2.i;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import cp.b0;
import fk2.m;
import gk2.f0;
import h32.u0;
import ha2.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.h2;
import r1.j0;
import uj2.a0;
import x02.w1;
import yk1.n;

/* loaded from: classes5.dex */
public final class h extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final bv1.a f140335a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f140336b;

    /* renamed from: c, reason: collision with root package name */
    public final h2 f140337c;

    /* renamed from: d, reason: collision with root package name */
    public final x f140338d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f140339e;

    /* renamed from: f, reason: collision with root package name */
    public final r f140340f;

    /* renamed from: g, reason: collision with root package name */
    public final fv1.b f140341g;

    /* renamed from: h, reason: collision with root package name */
    public final xj2.b f140342h;

    /* renamed from: i, reason: collision with root package name */
    public final uk1.d f140343i;

    /* renamed from: j, reason: collision with root package name */
    public c f140344j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(bv1.a notificationsBadgeInteractor, w1 newsHubRepository, h2 newshubExperiments, x inboxBadgeManager, b60.b activeUserManager, uk1.e presenterPinalyticsFactory, r prefsManagerUser, fv1.b notificationCount) {
        super(0);
        Intrinsics.checkNotNullParameter(notificationsBadgeInteractor, "notificationsBadgeInteractor");
        Intrinsics.checkNotNullParameter(newsHubRepository, "newsHubRepository");
        Intrinsics.checkNotNullParameter(newshubExperiments, "newshubExperiments");
        Intrinsics.checkNotNullParameter(inboxBadgeManager, "inboxBadgeManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(notificationCount, "notificationCount");
        this.f140335a = notificationsBadgeInteractor;
        this.f140336b = newsHubRepository;
        this.f140337c = newshubExperiments;
        this.f140338d = inboxBadgeManager;
        this.f140339e = activeUserManager;
        this.f140340f = prefsManagerUser;
        this.f140341g = notificationCount;
        this.f140342h = new xj2.b();
        this.f140343i = ((uk1.a) presenterPinalyticsFactory).g();
        b bVar = c.Companion;
        w12.a newsType = newsHubRepository.f131517a;
        c defaultFilter = c.All;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(defaultFilter, "defaultFilter");
        if (newsType != null) {
            Intrinsics.checkNotNullParameter(newsType, "newsType");
            int i13 = a.f140327a[newsType.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    defaultFilter = c.Comments;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    defaultFilter = c.Photos;
                }
            }
        }
        this.f140344j = defaultFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    @Override // yk1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivate() {
        /*
            r9 = this;
            fv1.b r0 = r9.f140341g
            int r1 = r0.f63028b
            yk1.n r2 = r9.getView()
            xx0.a r2 = (xx0.a) r2
            r3 = 99
            if (r1 <= r3) goto Lf
            r1 = r3
        Lf:
            zx0.f r2 = (zx0.f) r2
            r3 = 0
            r2.l8(r3, r1)
            b60.b r1 = r9.f140339e
            b60.d r1 = (b60.d) r1
            com.pinterest.api.model.wy0 r2 = r1.f()
            r4 = 1
            if (r2 == 0) goto L64
            boolean r2 = dl2.b.G2(r2)
            if (r2 != r4) goto L64
            androidx.appcompat.widget.x r2 = r9.f140338d
            java.lang.Object r2 = r2.f16708a
            e82.n r2 = (e82.n) r2
            r2.getClass()
            uj2.a0 r2 = wj2.c.a()
            uk2.d r5 = e82.n.f57886c
            jk2.l1 r2 = r5.A(r2)
            java.lang.String r5 = "observeOn(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            yx0.g r5 = new yx0.g
            r6 = 2
            r5.<init>(r9, r6)
            hx0.a r6 = new hx0.a
            r7 = 11
            r6.<init>(r7, r5)
            yx0.e r5 = yx0.e.f140331l
            hx0.a r7 = new hx0.a
            r8 = 12
            r7.<init>(r8, r5)
            ck2.c r5 = ck2.i.f27923c
            x02.a2 r8 = ck2.i.f27924d
            xj2.c r2 = r2.F(r6, r7, r5, r8)
            java.lang.String r5 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r9.addDisposable(r2)
        L64:
            java.lang.Boolean r2 = tz1.b.f119715c
            java.lang.String r5 = "SHOULD_PRIORITIZE_BADGED_TAB"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L97
            com.pinterest.api.model.wy0 r1 = r1.f()
            r2 = -1
            if (r1 == 0) goto L88
            boolean r1 = dl2.b.G2(r1)
            if (r1 != r4) goto L88
            e82.n r1 = e82.n.f57884a
            int r1 = e82.n.b()
            if (r1 <= 0) goto L88
            r3 = r4
            goto L8e
        L88:
            int r1 = r0.f63028b
            if (r1 <= 0) goto L8d
            goto L8e
        L8d:
            r3 = r2
        L8e:
            if (r3 == r2) goto L93
            r9.r3(r3)
        L93:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            tz1.b.f119715c = r1
        L97:
            lh0.h2 r1 = r9.f140337c
            boolean r1 = r1.d()
            if (r1 == 0) goto La6
            int r0 = r0.f63028b
            if (r0 <= 0) goto La6
            r9.p3()
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.h.onActivate():void");
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        xx0.a view = (xx0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((zx0.f) view).f143022y0 = this;
        uk2.d dVar = this.f140336b.f131518b;
        k kVar = new k(22, new g(this, 0));
        dVar.getClass();
        this.f140342h.a(new jk2.x(dVar, kVar, 2).F(new hx0.a(13, new g(this, 1)), new hx0.a(14, e.f140330k), i.f27923c, i.f27924d));
    }

    @Override // yk1.b
    public final void onDeactivate() {
        clearDisposables();
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f140342h.d();
        super.onUnbind();
    }

    public final void p3() {
        uj2.b bVar;
        bv1.a aVar = this.f140335a;
        fv1.b bVar2 = aVar.f23957b;
        if (bVar2.f63028b > 0) {
            bVar2.f63028b = 0;
            bVar2.f63027a.d(new fv1.a());
            uo.a aVar2 = aVar.f23956a;
            aVar2.getClass();
            f0 u03 = com.bumptech.glide.d.u0(aVar2.f122922a.a(new b40.g()));
            a0 a0Var = tk2.e.f118017c;
            fk2.g i13 = u03.r(a0Var).l(wj2.c.a()).i();
            Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
            bVar = i13.l(a0Var).h(wj2.c.a());
        } else {
            bVar = m.f62459a;
        }
        fk2.c b13 = bVar.b(aVar.a());
        Intrinsics.checkNotNullExpressionValue(b13, "andThen(...)");
        ek2.f i14 = new fk2.c(1, b13, i.f27926f).i(new b0(this, 23), new hx0.a(15, e.f140329j));
        Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
        addDisposable(i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q3() {
        /*
            r6 = this;
            b60.b r0 = r6.f140339e
            b60.d r0 = (b60.d) r0
            com.pinterest.api.model.wy0 r1 = r0.f()
            r2 = 1
            if (r1 == 0) goto L32
            boolean r1 = dl2.b.G2(r1)
            if (r1 != r2) goto L32
            lh0.z3 r1 = lh0.a4.f83298b
            lh0.h2 r3 = r6.f140337c
            r3.getClass()
            java.lang.String r4 = "enabled_inbox_default"
            java.lang.String r5 = "group"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.String r5 = "activate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            lh0.z0 r3 = r3.f83382a
            lh0.g1 r3 = (lh0.g1) r3
            java.lang.String r5 = "android_conversation_empty_ui_update"
            boolean r1 = r3.o(r5, r4, r1)
            if (r1 == 0) goto L32
            r1 = r2
            goto L33
        L32:
            r1 = 0
        L33:
            fv1.b r3 = r6.f140341g
            int r3 = r3.f63028b
            e82.n r4 = e82.n.f57884a
            int r4 = e82.n.b()
            int r4 = r4 + r3
            if (r4 > 0) goto L49
            lb0.r r0 = r6.f140340f
            java.lang.String r2 = "PREF_ACTIVE_NOTIFICATION_TAB"
            int r0 = r0.g(r2, r1)
            return r0
        L49:
            com.pinterest.api.model.wy0 r0 = r0.f()
            if (r0 == 0) goto L5c
            boolean r0 = dl2.b.G2(r0)
            if (r0 != r2) goto L5c
            int r0 = e82.n.b()
            if (r0 <= 0) goto L5c
            goto L5d
        L5c:
            r2 = r1
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.h.q3():int");
    }

    public final void r3(int i13) {
        xx0.a aVar = (xx0.a) getViewIfBound();
        if (aVar != null) {
            zx0.f fVar = (zx0.f) aVar;
            if (i13 != 0 || fVar.k8()) {
                GestaltIconButton gestaltIconButton = fVar.f143019v0;
                if (gestaltIconButton == null) {
                    Intrinsics.r("filterButton");
                    throw null;
                }
                com.bumptech.glide.c.d0(gestaltIconButton);
                GestaltText gestaltText = fVar.f143020w0;
                if (gestaltText == null) {
                    Intrinsics.r("filterBadge");
                    throw null;
                }
                pk.a0.k0(gestaltText);
            } else {
                GestaltIconButton gestaltIconButton2 = fVar.f143019v0;
                if (gestaltIconButton2 == null) {
                    Intrinsics.r("filterButton");
                    throw null;
                }
                com.bumptech.glide.c.u1(gestaltIconButton2);
            }
            fVar.b8().w(i13, true);
            GestaltTabLayout gestaltTabLayout = fVar.f143018u0;
            if (gestaltTabLayout == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            ek.e n13 = gestaltTabLayout.n(i13);
            if (n13 != null) {
                n13.b();
            }
        }
        if (i13 == 0) {
            t3(this.f140344j);
            if (this.f140341g.f63028b > 0) {
                p3();
            }
        } else {
            xx0.a aVar2 = (xx0.a) getViewIfBound();
            if (aVar2 != null) {
                GestaltText gestaltText2 = ((zx0.f) aVar2).f143020w0;
                if (gestaltText2 == null) {
                    Intrinsics.r("filterBadge");
                    throw null;
                }
                gestaltText2.i(zx0.b.f143009i);
            }
        }
        this.f140340f.h("PREF_ACTIVE_NOTIFICATION_TAB", i13);
    }

    public final void s3() {
        this.f140343i.f122379a.X(u0.NOTIFICATION_FILTERS_BUTTON);
        xx0.a aVar = (xx0.a) getView();
        c selectedOption = this.f140344j;
        f filterOptionSelectionHandler = new f(1, this, h.class, "handleFilterSelection", "handleFilterSelection(I)V", 0);
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(filterOptionSelectionHandler, "filterOptionSelectionHandler");
        ha2.x xVar = new ha2.x(zu1.e.notification_filters_title, null, null, null, null, 30);
        c0[] c0VarArr = new c0[3];
        c cVar = c.All;
        c0VarArr[0] = new c0(cVar.getTitleId(), cVar.ordinal(), null, selectedOption == cVar, false, null, null, null, null, null, 4084);
        c cVar2 = c.Comments;
        c0VarArr[1] = new c0(cVar2.getTitleId(), cVar2.ordinal(), null, selectedOption == cVar2, false, null, null, null, null, null, 4084);
        c cVar3 = c.Photos;
        c0VarArr[2] = new c0(cVar3.getTitleId(), cVar3.ordinal(), null, selectedOption == cVar3, false, null, null, null, null, null, 4084);
        ((zx0.f) aVar).Y4(new ha2.a(e0.b(new ha2.b0(xVar, kotlin.collections.f0.j(c0VarArr), filterOptionSelectionHandler)), false, (Integer) null, 14));
    }

    public final void t3(c cVar) {
        int i13 = 1;
        if (d.f140328a[cVar.ordinal()] == 1) {
            GestaltText gestaltText = ((zx0.f) ((xx0.a) getView())).f143020w0;
            if (gestaltText != null) {
                gestaltText.i(zx0.b.f143009i);
                return;
            } else {
                Intrinsics.r("filterBadge");
                throw null;
            }
        }
        zx0.f fVar = (zx0.f) ((xx0.a) getView());
        if (fVar.k8()) {
            return;
        }
        GestaltText gestaltText2 = fVar.f143020w0;
        if (gestaltText2 != null) {
            gestaltText2.i(new j0(i13, 29));
        } else {
            Intrinsics.r("filterBadge");
            throw null;
        }
    }
}
