package cb2;

import ao2.j0;
import com.pinterest.ui.menu.KotSpringLinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes4.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27353r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ KotSpringLinearLayout f27354s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(KotSpringLinearLayout kotSpringLinearLayout, bl2.c cVar) {
        super(2, cVar);
        this.f27354s = kotSpringLinearLayout;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f27354s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27353r;
        if (i13 == 0) {
            ue.c.H(obj);
            zn2.b.f142311b.getClass();
            Intrinsics.checkNotNullParameter("16ms", "value");
            try {
                long j13 = dl2.b.j("16ms", false);
                int i14 = KotSpringLinearLayout.f52625h;
                KotSpringLinearLayout kotSpringLinearLayout = this.f27354s;
                kotSpringLinearLayout.getClass();
                do2.i y13 = l0.y(new pb.k(new q(0L, j13, null)), 1);
                y1.b bVar = new y1.b(kotSpringLinearLayout, 19);
                this.f27353r = 1;
                if (y13.collect(bVar, this) == aVar) {
                    return aVar;
                }
            } catch (IllegalArgumentException e13) {
                throw new IllegalArgumentException("Invalid duration string format: '16ms'.", e13);
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
