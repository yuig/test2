package bu;

import av.d;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import qt.g;
import xj2.c;

/* loaded from: classes3.dex */
public final class b extends g implements jt.a {
    public final void G3(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        c o13 = this.f105113c.Q(pinId).s().o(new zt.b(5, new wt.c(this, 3)), new zt.b(6, a.f23895i));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // qt.g
    public final void v3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.v3(pin);
        d dVar = (d) ((jt.b) getView());
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "presenter");
        dVar.C0 = this;
    }
}
