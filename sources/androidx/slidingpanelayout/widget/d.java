package androidx.slidingpanelayout.widget;

import android.app.Activity;
import ao2.j0;
import ao2.v0;
import dl2.j;
import do2.i;
import eb.m;
import eb.n;
import eb.o;
import ho2.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes3.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f19791r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m.h f19792s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f19793t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m.h hVar, Activity activity, bl2.c cVar) {
        super(2, cVar);
        this.f19792s = hVar;
        this.f19793t = activity;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f19792s, this.f19793t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f19791r;
        if (i13 == 0) {
            ue.c.H(obj);
            m.h hVar = this.f19792s;
            o oVar = (o) ((m) hVar.f85197b);
            oVar.getClass();
            Activity activity = this.f19793t;
            Intrinsics.checkNotNullParameter(activity, "activity");
            do2.c D = l0.D(new n(oVar, activity, null));
            ko2.f fVar = v0.f20219a;
            i V = l0.V(new c(l0.j0(D, q.f69782a), hVar, 0));
            a aVar2 = new a(hVar);
            this.f19791r = 1;
            if (V.collect(aVar2, this) == aVar) {
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
