package hu1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes4.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f70420r;

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(2, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f70420r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f70420r = 1;
            if (l0.S(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, this) == aVar) {
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
