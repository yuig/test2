package g70;

import ao2.j0;
import com.pinterest.navigation.Navigation;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m60.x0;

/* loaded from: classes5.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f63870r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f63871s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f63872t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f63873u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f63874v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f63875w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f63876x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, String str, b bVar, Function1 function1, Function1 function12, bl2.c cVar) {
        super(2, cVar);
        this.f63872t = hVar;
        this.f63873u = str;
        this.f63874v = bVar;
        this.f63875w = function1;
        this.f63876x = function12;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f63872t, this.f63873u, this.f63874v, this.f63875w, this.f63876x, cVar);
        fVar.f63871s = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f63870r;
        h hVar = this.f63872t;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f63871s = (j0) this.f63871s;
            this.f63870r = 1;
            obj = h.a(hVar, this.f63873u, this.f63874v, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Navigation navigation = (Navigation) obj;
        if (navigation != null) {
            this.f63875w.invoke(navigation);
            this.f63876x.invoke(navigation);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            hVar.f63882d.h(x0.generic_error);
        }
        return Unit.f80348a;
    }
}
