package androidx.activity;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15943i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f15944j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(i0 i0Var, int i13) {
        super(0);
        this.f15943i = i13;
        this.f15944j = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f15943i) {
            case 0:
                m6invoke();
                break;
            default:
                m6invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6invoke() {
        x xVar;
        int i13 = this.f15943i;
        i0 i0Var = this.f15944j;
        switch (i13) {
            case 0:
                i0Var.b();
                break;
            default:
                x xVar2 = i0Var.f15904c;
                if (xVar2 == null) {
                    kotlin.collections.v vVar = i0Var.f15903b;
                    ListIterator listIterator = vVar.listIterator(vVar.b());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            xVar = listIterator.previous();
                            if (((x) xVar).isEnabled()) {
                            }
                        } else {
                            xVar = 0;
                        }
                    }
                    xVar2 = xVar;
                }
                i0Var.f15904c = null;
                if (xVar2 != null) {
                    xVar2.handleOnBackCancelled();
                    break;
                }
                break;
        }
    }
}
