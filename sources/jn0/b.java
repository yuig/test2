package jn0;

import an0.o;
import android.animation.AnimatorSet;
import ao2.j0;
import com.pinterest.feature.boardpreview.view.BaseBoardPreviewContainer;
import com.pinterest.shuffles.scene.composer.t;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77080r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BaseBoardPreviewContainer f77081s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ an0.g f77082t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BaseBoardPreviewContainer baseBoardPreviewContainer, an0.g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f77081s = baseBoardPreviewContainer;
        this.f77082t = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f77081s, this.f77082t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77080r;
        BaseBoardPreviewContainer baseBoardPreviewContainer = this.f77081s;
        if (i13 == 0) {
            ue.c.H(obj);
            o oVar = baseBoardPreviewContainer.f45338l;
            if (oVar != null) {
                oVar.X(this.f77082t);
            }
            this.f77080r = 1;
            if (l0.S(600L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        t tVar = baseBoardPreviewContainer.f45336j;
        if (tVar != null) {
            tVar.e();
            AnimatorSet animatorSet = tVar.f52153d;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
        t tVar2 = baseBoardPreviewContainer.f45337k;
        if (tVar2 != null) {
            tVar2.e();
            AnimatorSet animatorSet2 = tVar2.f52153d;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
        if (baseBoardPreviewContainer.f45339m) {
            baseBoardPreviewContainer.a();
        }
        return Unit.f80348a;
    }
}
