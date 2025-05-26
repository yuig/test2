package g51;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import h32.f1;
import h32.g0;
import h32.u0;
import j51.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63616i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f63617j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, int i13) {
        super(0);
        this.f63616i = i13;
        this.f63617j = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r0.booleanValue() != false) goto L19;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke() {
        /*
            r5 = this;
            int r0 = r5.f63616i
            r1 = 0
            r2 = 1
            g51.n r3 = r5.f63617j
            switch(r0) {
                case 5: goto L1f;
                default: goto L9;
            }
        L9:
            boolean r0 = r3.F3()
            if (r0 != 0) goto L13
            com.pinterest.api.model.wy0 r0 = r3.K
            if (r0 != 0) goto L1a
        L13:
            boolean r0 = r3.S3()
            if (r0 != 0) goto L1a
            r1 = r2
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L1f:
            com.pinterest.api.model.wy0 r0 = r3.K
            if (r0 == 0) goto L42
            java.lang.Boolean r3 = r0.g3()
            java.lang.String r4 = "getHasPinClusters(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L41
            java.lang.Boolean r0 = r0.d3()
            java.lang.String r3 = "getHasCreatedAllClusters(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
        L41:
            r1 = r2
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g51.l.invoke():java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f63616i;
        n nVar = this.f63617j;
        switch (i13) {
            case 0:
                break;
            case 1:
                m142invoke();
                break;
            case 2:
                m142invoke();
                break;
            case 3:
                m142invoke();
                break;
            case 4:
                m142invoke();
                break;
            case 5:
                break;
            case 6:
                m142invoke();
                break;
            case 7:
                break;
            case 8:
                wy0 wy0Var = nVar.K;
                Integer i43 = wy0Var != null ? wy0Var.i4() : null;
                break;
            case 9:
                m142invoke();
                break;
            default:
                m142invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m142invoke() {
        c51.f fVar;
        int i13 = this.f63616i;
        n nVar = this.f63617j;
        switch (i13) {
            case 1:
                nVar.M3();
                break;
            case 2:
                nVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.BOARD_ADD_COLLABORATOR_EMPTY_STATE, (r18 & 4) != 0 ? null : g0.BOARDS_TAB, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
            case 3:
                nVar.K3();
                break;
            case 4:
                nVar.getPinalytics().X(u0.BOARD_RESTORE_BUTTON);
                if (nVar.isBound()) {
                    uk1.c cVar = (c51.f) nVar.getView();
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.C.getValue());
                    Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                    ((nl1.d) cVar).M1(w13);
                    break;
                }
                break;
            case 5:
            case 7:
            case 8:
            default:
                nVar.N3();
                break;
            case 6:
                if (nVar.f63629i && (fVar = (c51.f) nVar.getViewIfBound()) != null) {
                    ((d0) fVar).D8();
                    break;
                }
                break;
            case 9:
                nVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.BOARD_UNORGANIZED_IDEAS, (r18 & 4) != 0 ? null : g0.BOARDS_TAB, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
        }
    }
}
