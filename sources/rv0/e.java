package rv0;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ha2.a0;
import ha2.x;
import ha2.z;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import nx.j0;
import so.jb;
import ye2.o;

/* loaded from: classes5.dex */
public final class e extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f110095a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f110096b;

    /* renamed from: c, reason: collision with root package name */
    public final gg1.b f110097c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f110098d;

    /* renamed from: e, reason: collision with root package name */
    public final w f110099e;

    /* renamed from: f, reason: collision with root package name */
    public final o5.c f110100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, gg1.b modalListener, j0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalListener, "modalListener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (!this.f110096b) {
            this.f110096b = true;
            this.f110099e = (w) ((jb) ((f) generatedComponent())).f113483a.f113885r0.get();
            this.f110100f = a02.e.I1();
        }
        this.f110097c = modalListener;
        this.f110098d = pinalytics;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        c cVar = new c(this, 1);
        x xVar = new x(dq1.f.story_pin_support_label, null, null, null, null, 30);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a0(dq1.f.pin_creation_help_option_how_to_create_pins, hg1.d.HOW_TO_CREATE_PINS.ordinal(), null, null, null, null, null, null, null, 1020));
        arrayList.add(new a0(dq1.f.pin_creation_help_option_best_practices, hg1.d.BEST_PRACTICES.ordinal(), null, null, null, null, null, null, null, 1020));
        arrayList.add(new a0(dq1.f.pin_creation_help_option_analytics_help_center, hg1.d.ANALYTICS_HELP_CENTER.ordinal(), null, null, null, null, null, null, null, 1020));
        arrayList.add(new a0(dq1.f.pin_creation_help_option_creator_code, hg1.d.CREATOR_CODE.ordinal(), null, null, null, null, null, null, null, 1020));
        z zVar = new z(xVar, arrayList, cVar);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        o5.c cVar2 = this.f110100f;
        if (cVar2 == null) {
            Intrinsics.r("bidiFormatter");
            throw null;
        }
        ha2.e eVar = new ha2.e(context2, cVar2);
        eVar.a(zVar);
        addView(eVar);
        c cVar3 = new c(this, 0);
        x xVar2 = new x(dq1.f.story_pin_contact_us_label, null, null, null, null, 30);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new a0(dq1.f.story_pin_share_feedback, hg1.b.FEEDBACK.ordinal(), null, null, null, null, null, null, null, 1020));
        arrayList2.add(new a0(dq1.f.pin_creation_help_option_get_help, hg1.b.HELP.ordinal(), null, null, null, null, null, null, null, 1020));
        z zVar2 = new z(xVar2, arrayList2, cVar3);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        o5.c cVar4 = this.f110100f;
        if (cVar4 == null) {
            Intrinsics.r("bidiFormatter");
            throw null;
        }
        ha2.e eVar2 = new ha2.e(context3, cVar4);
        eVar2.a(zVar2);
        addView(eVar2);
        pinalytics.z(null);
    }

    public static final void a(e eVar, hg1.d dVar) {
        w wVar = eVar.f110099e;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        a.c.y(wVar);
        eVar.f110097c.E6(dVar);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f110095a == null) {
            this.f110095a = new o(this);
        }
        return this.f110095a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f110095a == null) {
            this.f110095a = new o(this);
        }
        return this.f110095a.generatedComponent();
    }
}
