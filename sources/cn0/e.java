package cn0;

import android.content.Context;
import android.util.Size;
import android.view.Surface;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f28053r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Surface f28054s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f28055t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Surface surface, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f28053r = iVar;
        this.f28054s = surface;
        this.f28055t = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f28053r, this.f28054s, this.f28055t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i iVar = this.f28053r;
        com.pinterest.shuffles.scene.composer.t tVar = iVar.f28070c;
        if (tVar == null) {
            Intrinsics.r("keyframeAnimator");
            throw null;
        }
        tVar.e();
        com.pinterest.shuffles.scene.composer.t tVar2 = iVar.f28071d;
        if (tVar2 != null) {
            tVar2.e();
        }
        Size size = iVar.f28074g;
        if (size == null) {
            Intrinsics.r("outputSize");
            throw null;
        }
        ie2.e eVar = new ie2.e(this.f28054s, size);
        Context context = iVar.f28068a;
        ke2.c cVar = iVar.f28069b;
        if (cVar != null) {
            this.f28055t.f80434a = new be2.b(context, eVar, cVar);
            return Unit.f80348a;
        }
        Intrinsics.r("scene");
        throw null;
    }
}
