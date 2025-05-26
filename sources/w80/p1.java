package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes5.dex */
public final class p1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128364r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f128365s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(i2.q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f128365s = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p1(this.f128365s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128364r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f128364r = 1;
            if (lb.l0.S(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f128365s.setValue(Boolean.FALSE);
        return Unit.f80348a;
    }
}
