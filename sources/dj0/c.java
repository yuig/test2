package dj0;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class c implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ do2.i f55129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55130c;

    public /* synthetic */ c(do2.i iVar, Object obj, int i13) {
        this.f55128a = i13;
        this.f55129b = iVar;
        this.f55130c = obj;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        int i13 = this.f55128a;
        do2.i iVar = this.f55129b;
        Object obj = this.f55130c;
        switch (i13) {
            case 0:
                Object collect = iVar.collect(new b(jVar, obj, 0), cVar);
                if (collect != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = iVar.collect(new b(jVar, obj, 1), cVar);
                if (collect2 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = iVar.collect(new b(jVar, obj, 2), cVar);
                if (collect3 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = iVar.collect(new b(jVar, obj, 3), cVar);
                if (collect4 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = iVar.collect(new b(jVar, obj, 4), cVar);
                if (collect5 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = iVar.collect(new b(jVar, obj, 5), cVar);
                if (collect6 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = iVar.collect(new b(jVar, obj, 6), cVar);
                if (collect7 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect8 = iVar.collect(new b(jVar, obj, 7), cVar);
                if (collect8 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
