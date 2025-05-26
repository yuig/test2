package androidx.activity;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15941i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f15942j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(i0 i0Var, int i13) {
        super(1);
        this.f15941i = i13;
        this.f15942j = i0Var;
    }

    public final void b(b backEvent) {
        int i13 = this.f15941i;
        Object obj = null;
        i0 i0Var = this.f15942j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                kotlin.collections.v vVar = i0Var.f15903b;
                ListIterator listIterator = vVar.listIterator(vVar.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((x) previous).isEnabled()) {
                            obj = previous;
                        }
                    }
                }
                x xVar = (x) obj;
                i0Var.f15904c = xVar;
                if (xVar != null) {
                    xVar.handleOnBackStarted(backEvent);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                x xVar2 = i0Var.f15904c;
                if (xVar2 == null) {
                    kotlin.collections.v vVar2 = i0Var.f15903b;
                    ListIterator listIterator2 = vVar2.listIterator(vVar2.b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            Object previous2 = listIterator2.previous();
                            if (((x) previous2).isEnabled()) {
                                obj = previous2;
                            }
                        }
                    }
                    xVar2 = (x) obj;
                }
                if (xVar2 != null) {
                    xVar2.handleOnBackProgressed(backEvent);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f15941i) {
            case 0:
                b((b) obj);
                break;
            default:
                b((b) obj);
                break;
        }
        return Unit.f80348a;
    }
}
