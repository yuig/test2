package n41;

import android.content.Context;
import ck2.i;
import com.pinterest.api.model.wy0;
import h32.g0;
import h32.i0;
import h32.u0;
import i92.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import nx.f0;
import so.oa;
import sv.y;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f89206a;

    /* renamed from: b, reason: collision with root package name */
    public final w f89207b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f89208c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f89209d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f89210e;

    public b(d0 pinalytics, w eventManager, f0 pinalyticsFactory, boolean z13, Function1 removeFollowerAction) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(removeFollowerAction, "removeFollowerAction");
        this.f89206a = pinalytics;
        this.f89207b = eventManager;
        this.f89208c = pinalyticsFactory;
        this.f89209d = z13;
        this.f89210e = removeFollowerAction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r7.booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r30, com.pinterest.api.model.wy0 r31) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n41.b.a(android.content.Context, com.pinterest.api.model.wy0):void");
    }

    public final void b(wy0 user, Context uiContext, String str, String str2) {
        int i13 = r60.h.f106328e;
        Boolean s22 = user.s2();
        Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
        boolean booleanValue = s22.booleanValue();
        String uid = user.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        i0 i0Var = new i0(null, null, null, g0.MODAL_DIALOG, null, booleanValue ? u0.USER_BLOCK_BUTTON : u0.USER_UNBLOCK_BUTTON);
        d0 pinalytics = this.f89206a;
        s60.c loggingContext = new s60.c(pinalytics, i0Var, uid, 56);
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(user, "user");
        w eventManager = this.f89207b;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Context context = kb0.a.f79058b;
        k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
        new r60.h(uiContext, new s60.d(loggingContext)).a(user, str, str2).F(new dv.a(26, new r60.d(uiContext, eventManager, loggingContext, pinalytics, E2, user, 0)), new dv.a(27, new y(uiContext, E2, user, 3)), i.f27923c, i.f27924d);
    }
}
