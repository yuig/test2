package t3;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f116161r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2.o2 f116162s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f116163t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(i2.o2 o2Var, View view, bl2.c cVar) {
        super(2, cVar);
        this.f116162s = o2Var;
        this.f116163t = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p4(this.f116162s, this.f116163t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p4) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f116161r;
        i2.o2 o2Var = this.f116162s;
        View view = this.f116163t;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                this.f116161r = 1;
                Object g03 = lb.l0.g0(o2Var.f71225r, new i2.i2(2, null), this);
                if (g03 != obj2) {
                    g03 = Unit.f80348a;
                }
                if (g03 == obj2) {
                    return obj2;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            return Unit.f80348a;
        } finally {
            if (z4.b(view) == o2Var) {
                view.setTag(u2.s.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
