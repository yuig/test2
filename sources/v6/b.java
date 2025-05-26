package v6;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
import i2.o;
import i2.s;
import i2.u0;
import i2.y3;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f124191a = new u0(y3.f71400a, a.f124190i);

    public static u1 a(o oVar) {
        s sVar = (s) oVar;
        sVar.X(-584162872);
        u1 u1Var = (u1) sVar.m(f124191a);
        if (u1Var == null) {
            sVar.X(1382572291);
            u1Var = d7.b.J((View) sVar.m(AndroidCompositionLocals_androidKt.f17459f));
            sVar.r(false);
        }
        sVar.r(false);
        return u1Var;
    }
}
