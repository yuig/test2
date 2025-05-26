package oj0;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u60.l;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f95361i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f95362j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f95363k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, f30 f30Var, int i13) {
        super(1);
        this.f95361i = i13;
        this.f95362j = dVar;
        this.f95363k = f30Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f95361i;
        f30 f30Var = this.f95363k;
        d dVar = this.f95362j;
        switch (i13) {
            case 0:
                f30 f30Var2 = (f30) obj;
                d.a(dVar, f30Var, dVar.f95364a);
                Intrinsics.f(f30Var2);
                dVar.b(f30Var2, f30Var);
                dVar.f95377n.remove(f30Var);
                dVar.f95379p = true;
                dVar.e(f30Var, f30Var2);
                break;
            default:
                dVar.f95377n.remove(f30Var);
                ((l) dVar.f95373j).h(f30Var);
                d.a(dVar, f30Var, dVar.f95364a);
                break;
        }
        return Unit.f80348a;
    }
}
