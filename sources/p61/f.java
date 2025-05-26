package p61;

import com.pinterest.api.model.cz;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class f extends t {

    /* renamed from: a, reason: collision with root package name */
    public final cz f98918a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(com.pinterest.api.model.cz r2, nx.a0 r3, uk1.e r4, uj2.q r5) {
        /*
            r1 = this;
            java.lang.String r0 = "noticeActionSafetyRootOutro"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "noOpPinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "pinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            uk1.d r3 = uk1.e.b(r4, r3)
            r1.<init>(r3, r5)
            r1.f98918a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.f.<init>(com.pinterest.api.model.cz, nx.a0, uk1.e, uj2.q):void");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        a view = (a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((d) view).f98911k0 = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((d) ((a) getView())).f98911k0 = null;
        super.onUnbind();
    }

    public final void p3() {
        cz czVar = this.f98918a;
        String text = czVar.g();
        if (text != null) {
            d dVar = (d) ((a) getView());
            dVar.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            GestaltText gestaltText = dVar.f98913m0;
            if (gestaltText == null) {
                Intrinsics.r("title");
                throw null;
            }
            a0.p(gestaltText, text);
        }
        String text2 = czVar.f();
        if (text2 != null) {
            d dVar2 = (d) ((a) getView());
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(text2, "text");
            GestaltButton gestaltButton = dVar2.f98914n0;
            if (gestaltButton != null) {
                gestaltButton.d(new b31.f(text2, 13));
            } else {
                Intrinsics.r("closeButton");
                throw null;
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        a view = (a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((d) view).f98911k0 = this;
    }
}
