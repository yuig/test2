package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f55931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f55932c;

    public /* synthetic */ s0(int i13, Function2 function2, i iVar) {
        this.f55930a = i13;
        this.f55931b = iVar;
        this.f55932c = function2;
    }

    @Override // do2.i
    public final Object collect(j jVar, bl2.c cVar) {
        int i13 = this.f55930a;
        i iVar = this.f55931b;
        Function2 function2 = this.f55932c;
        switch (i13) {
            case 0:
                Object collect = iVar.collect(new u0(new kotlin.jvm.internal.f0(), jVar, function2), cVar);
                if (collect != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = iVar.collect(new l5.c(3, jVar, function2), cVar);
                if (collect2 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
