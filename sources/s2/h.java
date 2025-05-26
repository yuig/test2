package s2;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p1.p1;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xk2.g f110641b;

    public /* synthetic */ h(p1 p1Var, int i13) {
        this.f110640a = i13;
        this.f110641b = p1Var;
    }

    public final void a() {
        switch (this.f110640a) {
            case 0:
                Function2 function2 = (Function2) this.f110641b;
                synchronized (p.f110667b) {
                    p.f110672g = CollectionsKt.h0(p.f110672g, function2);
                    Unit unit = Unit.f80348a;
                }
                return;
            default:
                Function1 function1 = (Function1) this.f110641b;
                synchronized (p.f110667b) {
                    p.f110673h = CollectionsKt.h0(p.f110673h, function1);
                    Unit unit2 = Unit.f80348a;
                }
                p.a();
                return;
        }
    }
}
