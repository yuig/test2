package d51;

import com.pinterest.api.model.vh;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import h32.d4;
import h32.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53700i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f53701j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, int i13) {
        super(1);
        this.f53700i = i13;
        this.f53701j = lVar;
    }

    public final void b(vh it) {
        int i13 = this.f53700i;
        l lVar = this.f53701j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                c51.e eVar = lVar.M;
                if (eVar != null) {
                    g51.n nVar = (g51.n) eVar;
                    d0.B(nVar.getPinalytics(), null, g0.ALL_PINS_REP, nVar.f63621a, null, 25);
                    new my.k(s92.i.ALL_PINS, s92.l.USER_NAVIGATION, d4.USER, null).i();
                    if (nVar.isBound()) {
                        uk1.c cVar = (c51.f) nVar.getView();
                        NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.f50968b.getValue());
                        w13.m0("com.pinterest.EXTRA_USER_ID", nVar.f63621a);
                        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                        ((nl1.d) cVar).M1(w13);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                c51.e eVar2 = lVar.M;
                if (eVar2 != null) {
                    g51.n nVar2 = (g51.n) eVar2;
                    if (nVar2.isBound()) {
                        uk1.c cVar2 = (c51.f) nVar2.getView();
                        NavigationImpl w14 = Navigation.w1((ScreenLocation) i3.f50973g.getValue());
                        Intrinsics.checkNotNullExpressionValue(w14, "create(...)");
                        ((nl1.d) cVar2).M1(w14);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f53700i
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            com.pinterest.api.model.vh r6 = (com.pinterest.api.model.vh) r6
            r5.b(r6)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        Ld:
            com.pinterest.api.model.vh r6 = (com.pinterest.api.model.vh) r6
            r5.b(r6)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L15:
            com.pinterest.api.model.v7 r6 = (com.pinterest.api.model.v7) r6
            java.lang.String r0 = "board"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.pinterest.api.model.ph0 r1 = r6.u1()
            d51.l r2 = r5.f53701j
            if (r1 == 0) goto L4f
            java.lang.Boolean r1 = r1.f()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r1 == 0) goto L4f
            g51.f r1 = r2.N
            wj0.a r1 = r1.f63602b
            java.lang.String r3 = r6.getUid()
            java.lang.String r4 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r1.getClass()
            java.lang.String r4 = "boardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.util.ArrayList r1 = r1.f130018a
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            c51.e r2 = r2.M
            if (r2 == 0) goto L79
            g51.n r2 = (g51.n) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r2.isBound()
            if (r0 == 0) goto L79
            boolean r0 = r2.f63625e
            if (r0 == 0) goto L6b
            boolean r0 = r2.f63626f
            if (r0 == 0) goto L68
            goto L6b
        L68:
            g70.b r0 = g70.b.NONE
            goto L6d
        L6b:
            g70.b r0 = g70.b.PUBLIC_BOARD
        L6d:
            i31.a r3 = new i31.a
            r4 = 13
            r3.<init>(r1, r4)
            g70.h r1 = r2.f63638r
            r1.e(r6, r0, r3)
        L79:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d51.j.invoke(java.lang.Object):java.lang.Object");
    }
}
