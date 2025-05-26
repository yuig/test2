package ed1;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sharesheet.view.InviteModalAppListView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f58557c;

    /* renamed from: d, reason: collision with root package name */
    public final SendableObject f58558d;

    /* renamed from: e, reason: collision with root package name */
    public final e82.h0 f58559e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r13, p32.c r14, com.pinterest.activity.sendapin.model.SendableObject r15, uk1.d r16, bf2.d r17, so.b5 r18, e82.h0 r19) {
        /*
            r12 = this;
            r0 = r12
            r2 = r13
            r3 = r15
            r1 = r16
            r4 = r18
            r5 = r19
            java.lang.String r6 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r6)
            java.lang.String r6 = "inviteCategory"
            r7 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r6)
            java.lang.String r6 = "sendableObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r6)
            java.lang.String r6 = "presenterPinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "networkStateStream"
            r8 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r6)
            java.lang.String r6 = "inviteIconOnClickListenerFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            java.lang.String r6 = "socialUtils"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.Object r6 = r17.get()
            java.lang.String r8 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            uj2.q r6 = (uj2.q) r6
            r12.<init>(r1, r6)
            r0.f58557c = r2
            r0.f58558d = r3
            r0.f58559e = r5
            nx.d0 r5 = r12.getPinalytics()
            i91.s r10 = new i91.s
            so.r8 r1 = r4.f113346a
            so.s8 r4 = r1.f114091b
            bf2.d r4 = r4.L5
            java.lang.Object r4 = r4.get()
            r6 = r4
            so.v r6 = (so.v) r6
            so.s8 r4 = r1.f114091b
            ll.j r8 = r4.g6()
            so.oa r1 = r1.f114090a
            bf2.d r4 = r1.f113742ie
            java.lang.Object r4 = r4.get()
            r9 = r4
            i91.z r9 = (i91.z) r9
            e82.h0 r11 = r1.b3()
            r1 = r10
            r2 = r13
            r3 = r15
            r4 = r5
            r5 = r14
            r7 = r8
            r8 = r9
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            ed1.b r1 = new ed1.b
            r2 = 0
            r1.<init>(r10, r2)
            a7.o r2 = r0.f126436a
            r3 = 234(0xea, float:3.28E-43)
            r2.j(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ed1.d.<init>(android.content.Context, p32.c, com.pinterest.activity.sendapin.model.SendableObject, uk1.d, bf2.d, so.b5, e82.h0):void");
    }

    @Override // vq0.g
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(InviteModalAppListView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        boolean z13 = Resources.getSystem().getDisplayMetrics().heightPixels <= 1880;
        e82.h0 h0Var = this.f58559e;
        h0Var.getClass();
        Context context = this.f58557c;
        xj2.c o13 = h0Var.d(context, e82.h0.n(context, this.f58558d) ? "com.whatsapp" : null).r(tk2.e.f118017c).l(wj2.c.a()).o(new ec1.a(24, new s1.w(this, z13, view, 21)), new ec1.a(25, c.f58538j));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        if (getItem(i13) instanceof os.g) {
            return RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP;
        }
        return -2;
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }
}
