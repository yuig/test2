package ua1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ta1.f;
import va1.m1;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121415i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f121416j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m1 f121417k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, m1 m1Var, int i13) {
        super(0);
        this.f121415i = i13;
        this.f121416j = dVar;
        this.f121417k = m1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d dVar = this.f121416j;
        m1 item = this.f121417k;
        int i13 = this.f121415i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        f fVar = dVar.C0;
                        if (fVar != null) {
                            Intrinsics.checkNotNullParameter(item, "item");
                            fVar.u3(item, false);
                            break;
                        }
                        break;
                    default:
                        f fVar2 = dVar.C0;
                        if (fVar2 != null) {
                            Intrinsics.checkNotNullParameter(item, "item");
                            fVar2.v3(item, true);
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        f fVar3 = dVar.C0;
                        if (fVar3 != null) {
                            Intrinsics.checkNotNullParameter(item, "item");
                            fVar3.u3(item, false);
                            break;
                        }
                        break;
                    default:
                        f fVar4 = dVar.C0;
                        if (fVar4 != null) {
                            Intrinsics.checkNotNullParameter(item, "item");
                            fVar4.v3(item, true);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
