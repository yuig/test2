package ri1;

import bk1.q0;
import ek1.f0;
import kotlin.jvm.internal.Intrinsics;
import ni1.u1;
import ni1.v1;
import u50.r;

/* loaded from: classes2.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f108364b;

    public /* synthetic */ b(r rVar, int i13) {
        this.f108363a = i13;
        this.f108364b = rVar;
    }

    @Override // u50.r
    public final void a(Object event) {
        int i13 = this.f108363a;
        r rVar = this.f108364b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                rVar.a(new u1((q0) event));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(event, "event");
                rVar.a(new v1(new f0((yi1.f0) event)));
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                rVar.a(new v1(new f0((yi1.f0) event)));
                break;
        }
    }
}
