package co2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28293c;

    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        this.f28291a = i13;
        this.f28293c = obj;
        this.f28292b = obj2;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f28291a;
        Object obj4 = this.f28292b;
        Object obj5 = this.f28293c;
        switch (i13) {
            case 0:
                kg.t.r((Function1) obj5, obj4, (CoroutineContext) obj3);
                break;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mo2.c.f87811h;
                ((mo2.c) obj5).i(obj4);
                break;
            default:
                mo2.c cVar = (mo2.c) obj5;
                mo2.b bVar = (mo2.b) obj4;
                mo2.c.f87811h.set(cVar, bVar.f87809b);
                cVar.i(bVar.f87809b);
                break;
        }
        return Unit.f80348a;
    }
}
