package aw0;

import ao2.j0;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f20557r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IdeaPinVideoExportWorker f20558s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IdeaPinVideoExportWorker ideaPinVideoExportWorker, bl2.c cVar) {
        super(2, cVar);
        this.f20558s = ideaPinVideoExportWorker;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f20558s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f20557r;
        if (i13 == 0) {
            ue.c.H(obj);
            IdeaPinVideoExportWorker ideaPinVideoExportWorker = this.f20558s;
            g gVar = new g(ideaPinVideoExportWorker, 11);
            this.f20557r = 1;
            if (ideaPinVideoExportWorker.z(gVar, 25000L, 100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
