package l82;

import ao2.j0;
import do2.f2;
import do2.x1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements u50.r {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f82209a;

    /* renamed from: b, reason: collision with root package name */
    public final m82.b f82210b;

    /* renamed from: c, reason: collision with root package name */
    public String f82211c;

    public c(j0 scope, f2 channel, m82.b bVar) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f82209a = channel;
        this.f82210b = bVar;
    }

    @Override // u50.r
    public final void a(Object obj) {
        u50.s event = (u50.s) obj;
        Intrinsics.checkNotNullParameter(event, "event");
        x1 x1Var = this.f82209a;
        m82.b bVar = this.f82210b;
        if (bVar != null) {
            ((m82.a) bVar).e(x1Var, event, this.f82211c);
        }
        x1Var.b(event);
    }
}
