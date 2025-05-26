package pj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100262i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f100263j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, int i13) {
        super(1);
        this.f100262i = i13;
        this.f100263j = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f100262i;
        s sVar = this.f100263j;
        switch (i13) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((mj0.c) sVar.getView()).C5(it);
                break;
            default:
                if (sVar.isBound()) {
                    ((mj0.c) sVar.getView()).U5();
                }
                break;
        }
        return Unit.f80348a;
    }
}
