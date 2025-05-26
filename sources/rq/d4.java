package rq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d4 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109144i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j4 f109145j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(j4 j4Var, int i13) {
        super(1);
        this.f109144i = i13;
        this.f109145j = j4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j4 j4Var = this.f109145j;
        int i13 = this.f109144i;
        switch (i13) {
            case 0:
                uq.p it = (uq.p) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        j4.b(j4Var, uq.p.Body, c.Comment);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "element");
                        j4.b(j4Var, it, c.Reply);
                        break;
                }
                break;
            default:
                uq.p it2 = (uq.p) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        j4.b(j4Var, uq.p.Body, c.Comment);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "element");
                        j4.b(j4Var, it2, c.Reply);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
