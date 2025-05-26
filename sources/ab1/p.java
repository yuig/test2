package ab1;

import bb1.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qr1.v;

/* loaded from: classes5.dex */
public final class p extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1737i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f1738j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i13) {
        super(1);
        this.f1737i = i13;
        this.f1738j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q qVar = this.f1738j;
        int i13 = this.f1737i;
        switch (i13) {
            case 0:
                v vVar = (v) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(vVar);
                        q.p3(qVar, vVar);
                        break;
                    default:
                        Intrinsics.f(vVar);
                        q.p3(qVar, vVar);
                        break;
                }
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th3);
                        q.q3(qVar, th3);
                        break;
                    default:
                        Intrinsics.f(th3);
                        q.q3(qVar, th3);
                        break;
                }
                break;
            case 2:
                ((z) ((ya1.f) qVar.getView())).b8(true);
                break;
            case 3:
                v vVar2 = (v) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(vVar2);
                        q.p3(qVar, vVar2);
                        break;
                    default:
                        Intrinsics.f(vVar2);
                        q.p3(qVar, vVar2);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th4);
                        q.q3(qVar, th4);
                        break;
                    default:
                        Intrinsics.f(th4);
                        q.q3(qVar, th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
