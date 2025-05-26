package v21;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123892i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u50.r f123893j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v3 f123894k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u50.r rVar, v3 v3Var, int i13) {
        super(1);
        this.f123892i = i13;
        this.f123893j = rVar;
        this.f123894k = v3Var;
    }

    public final void b(xl1.b event) {
        int i13 = this.f123892i;
        u50.r rVar = this.f123893j;
        v3 v3Var = this.f123894k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.a) {
                    rVar.a(new f(((c) v3Var.getValue()).f123862a));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.a) {
                    rVar.a(new g(((c) v3Var.getValue()).f123865d, ((c) v3Var.getValue()).f123866e));
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f123892i) {
            case 0:
                b((xl1.b) obj);
                break;
            default:
                b((xl1.b) obj);
                break;
        }
        return Unit.f80348a;
    }
}
