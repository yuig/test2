package ab1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1707i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f1708j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f1707i = i13;
        this.f1708j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f fVar = this.f1708j;
        int i13 = this.f1707i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        ((bb1.l) ((ya1.b) fVar.getView())).b8(true);
                        break;
                    default:
                        ((bb1.l) ((ya1.b) fVar.getView())).b8(true);
                        break;
                }
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th3);
                        f.p3(fVar, th3);
                        break;
                    default:
                        Intrinsics.f(th3);
                        f.p3(fVar, th3);
                        break;
                }
                break;
            case 2:
                switch (i13) {
                    case 0:
                        ((bb1.l) ((ya1.b) fVar.getView())).b8(true);
                        break;
                    default:
                        ((bb1.l) ((ya1.b) fVar.getView())).b8(true);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th4);
                        f.p3(fVar, th4);
                        break;
                    default:
                        Intrinsics.f(th4);
                        f.p3(fVar, th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
