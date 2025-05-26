package sa0;

import android.net.Uri;
import android.util.Size;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f112166r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f112167s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f112168t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f112169u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f112170v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, j jVar, u50.r rVar, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f112167s = oVar;
        this.f112168t = jVar;
        this.f112169u = rVar;
        this.f112170v = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f112167s, this.f112168t, this.f112169u, this.f112170v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f112166r;
        if (i13 == 0) {
            ue.c.H(obj);
            l lVar = (l) this.f112167s;
            b0 b0Var = lVar.f112178a;
            boolean z13 = b0Var instanceof a0;
            u50.r rVar = this.f112169u;
            j jVar = this.f112168t;
            if (z13) {
                do2.j0 j0Var = new do2.j0(ve.h.x(jVar.f112176b, ((a0) b0Var).f112159a), new z80.n(3, rVar, null));
                k1.j0 j0Var2 = new k1.j0(this.f112169u, this.f112168t, this.f112170v, this.f112167s, 3);
                this.f112166r = 1;
                if (j0Var.collect(j0Var2, this) == aVar) {
                    return aVar;
                }
            } else if (b0Var instanceof z) {
                z zVar = (z) b0Var;
                Intrinsics.checkNotNullParameter(zVar, "<this>");
                p pVar = p.f112182d;
                int width = zVar.f112202b.getWidth();
                Size size = zVar.f112202b;
                rVar.a(new d(new p(width, size.getHeight())));
                u62.t tVar = jVar.f112175a;
                Uri parse = Uri.parse(zVar.f112201a);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                u62.t.g(tVar, this.f112170v, new u62.a(parse, size), lVar.f112179b, null, 8);
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
