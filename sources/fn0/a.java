package fn0;

import android.media.MediaMuxer;
import do2.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62601r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f62602s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f62603t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f62603t = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f62603t, cVar);
        aVar.f62602s = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        MediaMuxer mediaMuxer;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62601r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.j jVar = (do2.j) this.f62602s;
            c cVar = this.f62603t;
            MediaMuxer mediaMuxer2 = new MediaMuxer(cVar.f62607a, 0);
            f0 f0Var = new f0(l0.D(new b(cVar, null)), new ed.l(2, null));
            cn0.c cVar2 = new cn0.c(new bn0.a(mediaMuxer2, jVar), i14);
            this.f62602s = mediaMuxer2;
            this.f62601r = 1;
            if (f0Var.collect(cVar2, this) == aVar) {
                return aVar;
            }
            mediaMuxer = mediaMuxer2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaMuxer = (MediaMuxer) this.f62602s;
            ue.c.H(obj);
        }
        mediaMuxer.release();
        return Unit.f80348a;
    }
}
