package dx0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import qa2.h0;

/* loaded from: classes5.dex */
public final class x implements mj0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f56466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mj0.g f56467b;

    public x(y yVar, mj0.g gVar) {
        this.f56466a = yVar;
        this.f56467b = gVar;
    }

    @Override // mj0.g
    public final boolean a6(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return this.f56467b.a6(pin);
    }

    @Override // mj0.g
    public final void l2(f30 pin, h0 h0Var) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        u50.r rVar = this.f56466a.f56476h;
        if (rVar != null) {
            rVar.a(new g(pin));
        }
        this.f56467b.l2(pin, h0Var);
    }
}
