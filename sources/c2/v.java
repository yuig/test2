package c2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25295i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f25296j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f25297k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13, Object obj, Object obj2) {
        super(0);
        this.f25295i = i13;
        this.f25296j = obj;
        this.f25297k = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f25295i;
        Object obj = this.f25297k;
        Object obj2 = this.f25296j;
        switch (i13) {
            case 0:
                m78invoke();
                return Unit.f80348a;
            case 1:
                i2 i2Var = (i2) obj2;
                if (((Boolean) i2Var.f24842a.f25328d.invoke(j2.Closed)).booleanValue()) {
                    kotlin.jvm.internal.j.z((ao2.j0) obj, null, null, new x1(i2Var, null), 3);
                }
                return Boolean.TRUE;
            case 2:
                return new i2((j2) obj2, (Function1) obj);
            default:
                m78invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m78invoke() {
        i2.f2 f2Var;
        i2.g2 g2Var;
        int i13 = this.f25295i;
        Object obj = this.f25297k;
        Object obj2 = this.f25296j;
        switch (i13) {
            case 0:
                w wVar = (w) obj2;
                q qVar = wVar.f25338n;
                float c13 = wVar.d().c(obj);
                if (!Float.isNaN(c13)) {
                    w wVar2 = qVar.f25079a;
                    wVar2.f25334j.i(c13);
                    wVar2.f25335k.i(0.0f);
                    wVar.h(null);
                }
                wVar.g(obj);
                break;
            default:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                p2 p2Var = (p2) obj;
                if (!Intrinsics.d(null, p2Var.f25065a)) {
                    ArrayList arrayList = p2Var.f25066b;
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                    kotlin.collections.k0.y(arrayList, new e4(1));
                    i2.e2 e2Var = p2Var.f25067c;
                    if (e2Var != null && (g2Var = (f2Var = (i2.f2) e2Var).f71111b) != null) {
                        g2Var.a(f2Var, null);
                        break;
                    }
                }
                break;
        }
    }
}
