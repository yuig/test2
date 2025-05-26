package r01;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.closeup.datasource.j;
import com.pinterest.feature.pin.closeup.datasource.l;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import i01.g;
import i01.h;
import i01.i;
import i01.t;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import tb0.p;

/* loaded from: classes5.dex */
public final class c implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final Set f105702i = h1.f(Integer.valueOf(q32.c.HOME_DECOR.getValue()), Integer.valueOf(q32.c.MENS_FASHION.getValue()), Integer.valueOf(q32.c.WOMENS_FASHION.getValue()), Integer.valueOf(q32.c.CHILDRENS_FASHION.getValue()));

    /* renamed from: j, reason: collision with root package name */
    public static final Set f105703j = h1.f("US", "GB", "CA", "FR", "DE", "AU", "BR", "MX", "ES", "IT", "CH", "NL");

    /* renamed from: a, reason: collision with root package name */
    public final Handler f105704a;

    /* renamed from: b, reason: collision with root package name */
    public final String f105705b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f105706c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f105707d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f105708e;

    /* renamed from: f, reason: collision with root package name */
    public h f105709f;

    /* renamed from: g, reason: collision with root package name */
    public g f105710g;

    /* renamed from: h, reason: collision with root package name */
    public j f105711h;

    public c(Handler handler, String str, boolean z13, boolean z14, w01.j getLatestPin) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(getLatestPin, "getLatestPin");
        this.f105704a = handler;
        this.f105705b = str;
        this.f105706c = z13;
        this.f105707d = z14;
        this.f105708e = getLatestPin;
        this.f105709f = h.PENDING;
        this.f105710g = g.MODULE_ELIGIBILITY_UNKNOWN;
    }

    public final h a() {
        return this.f105709f;
    }

    public final void b(f30 pin) {
        g gVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (this.f105710g == g.MODULE_ELIGIBILITY_UNKNOWN) {
            if (pin != null && !o.B(pin, "getIsPromoted(...)")) {
                if (f105702i.contains(pin.B6()) && CollectionsKt.L(f105703j, this.f105705b)) {
                    gVar = g.LOADING;
                    this.f105710g = gVar;
                }
            }
            gVar = g.COMPLETE;
            this.f105710g = gVar;
        }
    }

    public final void c(t view, l relatedPinsPagedList, j0 scope) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(relatedPinsPagedList, "relatedPinsPagedList");
        Intrinsics.checkNotNullParameter(scope, "scope");
        vb0.j.f125466a.R(this.f105711h != null, "PinCloseupLoadingIndicatorManager must have moduleList set before onPresenterBound()", p.CLOSEUP, new Object[0]);
        kotlin.jvm.internal.j.z(scope, null, null, new b(relatedPinsPagedList, this, view, null), 3);
    }

    public final void d(j moduleList) {
        Intrinsics.checkNotNullParameter(moduleList, "moduleList");
        this.f105711h = moduleList;
    }

    public final void e(t tVar) {
        au0.a aVar = new au0.a(this, 27);
        RecyclerView g83 = ((PinCloseupFragment) tVar).g8();
        if (g83 == null || !g83.V1()) {
            aVar.invoke();
        } else {
            this.f105704a.post(new p4.a(4, aVar));
        }
    }
}
