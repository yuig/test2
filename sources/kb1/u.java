package kb1;

import android.app.Application;
import ao2.j0;
import com.pinterest.feature.settings.notifications.y0;
import h32.a4;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import zy.l0;

/* loaded from: classes5.dex */
public final class u extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final y f79097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Application application, j0 scope, da1.c passcodeSetupSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(passcodeSetupSEP, "passcodeSetupSEP");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(21, "stateTransformer");
        a0Var.c(this, application);
        this.f79097c = a0.b(a0Var, new t(new l0(new i0(d4.PARENTAL_PASSCODE, a4.PARENTAL_PASSCODE_BACKUP_EMAIL, null, null, null, null), 2), ""), new y0(passcodeSetupSEP, 4), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f79097c.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f79097c.e();
    }
}
