package cn0;

import android.media.MediaMuxer;
import co2.b0;
import do2.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f28049r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f28050s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f28051t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b0 f28052u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, b0 b0Var, bl2.c cVar) {
        super(2, cVar);
        this.f28051t = iVar;
        this.f28052u = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f28051t, this.f28052u, cVar);
        dVar.f28050s = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        MediaMuxer mediaMuxer;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f28049r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.j jVar = (do2.j) this.f28050s;
            i iVar = this.f28051t;
            String str = iVar.f28073f;
            bl2.c cVar = null;
            if (str == null) {
                Intrinsics.r("outputFilePath");
                throw null;
            }
            MediaMuxer mediaMuxer2 = new MediaMuxer(str, 0);
            f0 f0Var = new f0(l0.D(new f(iVar, this.f28052u, null)), new ed.l(i14, cVar));
            c cVar2 = new c(new bn0.a(mediaMuxer2, jVar), 0);
            this.f28050s = mediaMuxer2;
            this.f28049r = 1;
            if (f0Var.collect(cVar2, this) == aVar) {
                return aVar;
            }
            mediaMuxer = mediaMuxer2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaMuxer = (MediaMuxer) this.f28050s;
            ue.c.H(obj);
        }
        mediaMuxer.release();
        return Unit.f80348a;
    }
}
