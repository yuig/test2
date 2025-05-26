package b82;

import android.animation.AnimatorSet;
import ao2.j0;
import com.pinterest.shuffles.scene.composer.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f22183r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f22184s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f22184s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f22184s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f22183r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f22183r = 1;
            if (l0.S(600L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        t tVar = this.f22184s.f22216x;
        tVar.e();
        AnimatorSet animatorSet = tVar.f52153d;
        if (animatorSet != null) {
            animatorSet.start();
        }
        return Unit.f80348a;
    }
}
