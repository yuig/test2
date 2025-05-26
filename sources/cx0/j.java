package cx0;

import android.app.Application;
import androidx.lifecycle.u;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.settings.notifications.k0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.i0;
import l82.y;
import u50.o;
import u50.r;

/* loaded from: classes5.dex */
public final class j extends l82.b implements wt1.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f53378c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final y f53379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u scope, Application application, cb1.b expandableSectionExpandedSEP, eb1.h notificationToggleSEP, eb1.e optionsLoadSEP, nu.a notificationToastSEP, zb0.i alertSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(expandableSectionExpandedSEP, "expandableSectionExpandedSEP");
        Intrinsics.checkNotNullParameter(notificationToggleSEP, "notificationToggleSEP");
        Intrinsics.checkNotNullParameter(optionsLoadSEP, "optionsLoadSEP");
        Intrinsics.checkNotNullParameter(notificationToastSEP, "notificationToastSEP");
        Intrinsics.checkNotNullParameter(alertSEP, "alertSEP");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(19, "stateTransformer");
        a0Var.c(this, application);
        y a13 = a0Var.a();
        a13.a(expandableSectionExpandedSEP, cb1.e.f27275o, cb1.e.f27276p, expandableSectionExpandedSEP.a());
        a13.a(notificationToggleSEP, cb1.e.f27277q, cb1.e.f27278r, notificationToggleSEP.a());
        a13.a(optionsLoadSEP, cb1.e.f27279s, cb1.e.f27280t, optionsLoadSEP.a());
        a13.a(notificationToastSEP, cb1.e.f27281u, cb1.e.f27282v, notificationToastSEP.a());
        a13.a(alertSEP, cb1.e.f27283w, cb1.e.f27274n, alertSEP.a());
        this.f53379d = a13;
    }

    @Override // l82.i
    public final do2.i a() {
        int i13 = this.f53378c;
        y yVar = this.f53379d;
        switch (i13) {
        }
        return yVar.d();
    }

    @Override // wt1.d
    public final o b(i0 i0Var, boolean z13) {
        int i13 = this.f53378c;
        y yVar = this.f53379d;
        switch (i13) {
            case 0:
                f startState = (f) i0Var;
                Intrinsics.checkNotNullParameter(startState, "startState");
                return (a) yVar.j(startState, z13);
            default:
                k0 startState2 = (k0) i0Var;
                Intrinsics.checkNotNullParameter(startState2, "startState");
                return (com.pinterest.feature.settings.notifications.b) yVar.j(startState2, z13);
        }
    }

    @Override // l82.i
    public final r c() {
        int i13 = this.f53378c;
        y yVar = this.f53379d;
        switch (i13) {
        }
        return yVar.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j0 scope, Application application) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(15, "stateTransformer");
        a0Var.c(this, application);
        this.f53379d = a0.b(a0Var, new f(new f30(), new vh(), null, 0.0f, 0, null, false, false, null, null, 2044), null, 6);
    }
}
