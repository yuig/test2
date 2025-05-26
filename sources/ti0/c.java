package ti0;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q5.x;
import r70.h;
import rg0.n;
import s.f;
import sq0.c0;
import uk1.d;
import wk1.e;
import wk1.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class c extends q implements ca2.b {

    /* renamed from: a, reason: collision with root package name */
    public final List f117698a;

    /* renamed from: b, reason: collision with root package name */
    public final n f117699b;

    /* renamed from: c, reason: collision with root package name */
    public final nu1.a f117700c;

    /* renamed from: d, reason: collision with root package name */
    public final e f117701d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List announcementItems, n nVar, d presenterPinalytics, uj2.q networkStateStream, nu1.a inAppNavigator) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(announcementItems, "announcementItems");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        this.f117698a = announcementItems;
        this.f117699b = nVar;
        this.f117700c = inAppNavigator;
        this.f117701d = new si0.a(announcementItems, announcementItems.size() == 1 ? new a(this) : null, new a(this), new b(this, presenterPinalytics));
    }

    @Override // ca2.b
    public final void M0(String str) {
        if (isBound()) {
            ui0.e eVar = (ui0.e) ((ri0.a) getView());
            n nVar = eVar.J0;
            if (nVar != null) {
                nVar.c(null, null);
            }
            eVar.J0 = null;
            eVar.P7();
            eVar.f7().f(new h(true, false));
        }
    }

    @Override // ca2.b
    public final void U2() {
        if (isBound()) {
            ui0.e eVar = (ui0.e) ((ri0.a) getView());
            n nVar = eVar.J0;
            if (nVar != null) {
                nVar.a(null, null);
            }
            eVar.J0 = null;
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f117701d);
    }

    @Override // ca2.b
    public final void o2(int i13) {
        if (isBound()) {
            bs1.c.X0(((ui0.e) ((ri0.a) getView())).E0);
        }
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((ui0.e) ((ri0.a) getView())).W8().q(null);
        super.onUnbind();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(ri0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        ui0.e eVar = (ui0.e) view;
        eVar.W8().q(this);
        ca2.e W8 = eVar.W8();
        View view2 = W8.f27254m;
        if (view2 != null) {
            x.a(view2, new f(view2, eVar, W8, 22, 0));
        }
    }
}
