package g70;

import com.pinterest.api.model.v7;
import com.pinterest.navigation.NavigationImpl;
import i92.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.u;
import m60.w;
import x02.x0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final w f63879a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f63880b;

    /* renamed from: c, reason: collision with root package name */
    public final u f63881c;

    /* renamed from: d, reason: collision with root package name */
    public final k f63882d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f63883e;

    /* renamed from: f, reason: collision with root package name */
    public final tb0.h f63884f;

    public h(w eventManager, x0 boardRepository, u experiments, k toastUtils, b60.b activeUserManager, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f63879a = eventManager;
        this.f63880b = boardRepository;
        this.f63881c = experiments;
        this.f63882d = toastUtils;
        this.f63883e = activeUserManager;
        this.f63884f = crashReporting;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(g70.h r5, java.lang.String r6, g70.b r7, bl2.c r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof g70.e
            if (r0 == 0) goto L16
            r0 = r8
            g70.e r0 = (g70.e) r0
            int r1 = r0.f63869v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f63869v = r1
            goto L1b
        L16:
            g70.e r0 = new g70.e
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.f63867t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f63869v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            g70.b r7 = r0.f63866s
            g70.h r5 = r0.f63865r
            ue.c.H(r8)
            goto L57
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            ue.c.H(r8)
            x02.x0 r8 = r5.f63880b
            do2.c r8 = ve.h.x(r8, r6)
            fd.t r2 = new fd.t
            r2.<init>(r5, r6, r3, r4)
            do2.j0 r6 = new do2.j0
            r6.<init>(r8, r2)
            r0.f63865r = r5
            r0.f63866s = r7
            r0.f63869v = r4
            java.lang.Object r8 = lb.l0.h0(r6, r0)
            if (r8 != r1) goto L57
            goto L62
        L57:
            com.pinterest.api.model.v7 r8 = (com.pinterest.api.model.v7) r8
            if (r8 == 0) goto L61
            com.pinterest.navigation.NavigationImpl r5 = r5.c(r8, r7)
            r1 = r5
            goto L62
        L61:
            r1 = r3
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g70.h.a(g70.h, java.lang.String, g70.b, bl2.c):java.lang.Object");
    }

    public static void b(h hVar, String boardId, Function1 customNavigation) {
        b override = b.NONE;
        d applyExtras = d.f63861j;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(override, "override");
        Intrinsics.checkNotNullParameter(applyExtras, "applyExtras");
        Intrinsics.checkNotNullParameter(customNavigation, "customNavigation");
        hVar.d(boardId, override, applyExtras, customNavigation);
    }

    public static /* synthetic */ void f(h hVar, v7 v7Var, Function1 function1, int i13) {
        b bVar = b.NONE;
        if ((i13 & 4) != 0) {
            function1 = d.f63863l;
        }
        hVar.e(v7Var, bVar, function1);
    }

    public static void g(h hVar, String boardId, b override, Function1 applyExtras, int i13) {
        if ((i13 & 2) != 0) {
            override = b.NONE;
        }
        if ((i13 & 4) != 0) {
            applyExtras = d.f63862k;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(override, "override");
        Intrinsics.checkNotNullParameter(applyExtras, "applyExtras");
        hVar.d(boardId, override, applyExtras, new g(hVar, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.l("android_curation_blp_redesign") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.pinterest.navigation.NavigationImpl c(com.pinterest.api.model.v7 r6, g70.b r7) {
        /*
            r5 = this;
            int[] r0 = g70.c.f63860a
            int r1 = r7.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L95
            r1 = 2
            if (r0 == r1) goto L95
            r1 = 3
            java.lang.String r2 = "android_curation_blp_redesign"
            lh0.u r3 = r5.f63881c
            java.lang.String r4 = "enabled"
            if (r0 == r1) goto L18
            goto L2e
        L18:
            r3.getClass()
            lh0.z3 r0 = lh0.a4.f83298b
            lh0.z0 r1 = r3.f83484a
            lh0.g1 r1 = (lh0.g1) r1
            boolean r0 = r1.o(r2, r4, r0)
            if (r0 != 0) goto L95
            boolean r0 = r1.l(r2)
            if (r0 == 0) goto L2e
            goto L95
        L2e:
            boolean r7 = kh2.d.B0(r6)
            if (r7 == 0) goto L50
            r3.getClass()
            lh0.z3 r7 = lh0.a4.f83297a
            lh0.z0 r0 = r3.f83484a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r1 = "android_automagical_board_surface"
            boolean r7 = r0.o(r1, r4, r7)
            if (r7 != 0) goto L4b
            boolean r7 = r0.l(r1)
            if (r7 == 0) goto L50
        L4b:
            com.pinterest.framework.screens.ScreenLocation r7 = com.pinterest.screens.u.a()
            goto L99
        L50:
            b60.b r7 = r5.f63883e
            b60.d r7 = (b60.d) r7
            com.pinterest.api.model.wy0 r7 = r7.f()
            boolean r0 = kh2.w.i0(r6)
            if (r0 == 0) goto L90
            if (r7 == 0) goto L90
            java.lang.Boolean r0 = r7.G3()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto L90
            java.lang.Boolean r7 = r7.u4()
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L90
            r3.getClass()
            lh0.z3 r7 = lh0.a4.f83298b
            lh0.z0 r0 = r3.f83484a
            lh0.g1 r0 = (lh0.g1) r0
            boolean r7 = r0.o(r2, r4, r7)
            if (r7 != 0) goto L8b
            boolean r7 = r0.l(r2)
            if (r7 == 0) goto L90
        L8b:
            com.pinterest.framework.screens.ScreenLocation r7 = com.pinterest.screens.u.c()
            goto L99
        L90:
            com.pinterest.framework.screens.ScreenLocation r7 = com.pinterest.screens.u.b()
            goto L99
        L95:
            com.pinterest.framework.screens.ScreenLocation r7 = r7.getScreenLocation()
        L99:
            java.lang.String r6 = r6.getId()
            com.pinterest.navigation.NavigationImpl r6 = com.pinterest.navigation.Navigation.z0(r7, r6)
            java.lang.String r7 = "create(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g70.h.c(com.pinterest.api.model.v7, g70.b):com.pinterest.navigation.NavigationImpl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r0.l("android_curation_blp_redesign") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r12, g70.b r13, kotlin.jvm.functions.Function1 r14, kotlin.jvm.functions.Function1 r15) {
        /*
            r11 = this;
            int[] r0 = g70.c.f63860a
            int r1 = r13.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L4a
            r1 = 2
            if (r0 == r1) goto L4a
            r2 = 3
            if (r0 == r2) goto L12
            goto L2e
        L12:
            lh0.u r0 = r11.f63881c
            r0.getClass()
            lh0.z3 r2 = lh0.a4.f83298b
            lh0.z0 r0 = r0.f83484a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r3 = "android_curation_blp_redesign"
            java.lang.String r4 = "enabled"
            boolean r2 = r0.o(r3, r4, r2)
            if (r2 != 0) goto L4a
            boolean r0 = r0.l(r3)
            if (r0 == 0) goto L2e
            goto L4a
        L2e:
            com.pinterest.api.model.jw r0 = com.pinterest.api.model.nw.f40514g
            r0.getClass()
            ho2.c r0 = com.pinterest.api.model.nw.f40515h
            ko2.f r2 = ao2.v0.f20219a
            ao2.e2 r2 = ho2.q.f69782a
            g70.f r10 = new g70.f
            r9 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r12 = 0
            kotlin.jvm.internal.j.z(r0, r2, r12, r10, r1)
            goto L58
        L4a:
            com.pinterest.framework.screens.ScreenLocation r13 = r13.getScreenLocation()
            com.pinterest.navigation.NavigationImpl r12 = com.pinterest.navigation.Navigation.z0(r13, r12)
            r14.invoke(r12)
            r15.invoke(r12)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g70.h.d(java.lang.String, g70.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    public final void e(v7 board, b override, Function1 applyExtras) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(override, "override");
        Intrinsics.checkNotNullParameter(applyExtras, "applyExtras");
        g gVar = new g(this, 1);
        NavigationImpl c13 = c(board, override);
        applyExtras.invoke(c13);
        gVar.invoke(c13);
    }
}
