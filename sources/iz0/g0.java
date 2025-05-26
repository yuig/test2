package iz0;

import android.app.Application;
import ao2.j0;
import com.pinterest.boardAutoCollages.i0;
import com.pinterest.boardAutoCollages.k0;
import com.pinterest.boardAutoCollages.l0;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;
import o82.j3;
import o82.s0;

/* loaded from: classes5.dex */
public final class g0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final s20.a f73910c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f73911d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f73912e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f73913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Application application, j0 scope, s20.a pearService, w60.d navigationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        this.f73910c = pearService;
        this.f73911d = navigationSEP;
        kv0.p pVar = new kv0.p(4);
        k0 k0Var = new k0(23);
        int i13 = 10;
        bt0.u uVar = new bt0.u(i13);
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        kv0.p.b(pVar, k0Var, uVar, new o82.h(new jz0.d(pearService, 0)), false, new l0(9), null, null, null, h0.HEADER.id(), null, 744);
        k0 k0Var2 = new k0(26);
        int i14 = 11;
        bt0.u uVar2 = new bt0.u(i14);
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        kv0.p.b(pVar, k0Var2, uVar2, new o82.h(new jz0.d(pearService, 1)), true, new l0(i13), null, null, null, h0.BODY.id(), null, 736);
        kv0.p.b(pVar, new k0(27), new bt0.u(12), new j3(kotlin.collections.e0.b(new f0())), true, new l0(i14), null, null, null, h0.SURVEY.id(), null, 736);
        int i15 = 7;
        kv0.p.b(pVar, new k0(28), new bt0.u(i15), new j3(kotlin.collections.e0.b(new d0())), true, new l0(6), null, null, null, h0.FOOTER.id(), null, 736);
        int i16 = 8;
        kv0.p.b(pVar, new k0(24), new bt0.u(i16), new j3(kotlin.collections.e0.b(new e0())), true, new l0(i15), null, null, null, h0.PIN_FEED_HEADER.id(), null, 736);
        kv0.p.b(pVar, new k0(25), new bt0.u(9), new s0(new i90.i(pearService)), true, new l0(i16), null, null, null, h0.PIN_FEED.id(), null, 736);
        g01.a d2 = pVar.d();
        this.f73912e = d2;
        l82.a0 a0Var = new l82.a0(scope);
        i0 stateTransformer = new i0((o82.i0) d2.f63224a, 2);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f73913f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f73913f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f73913f.e();
    }

    public final void h(String quizId, String answerString, String outputKey) {
        Intrinsics.checkNotNullParameter(quizId, "quizId");
        Intrinsics.checkNotNullParameter(answerString, "answerString");
        Intrinsics.checkNotNullParameter(outputKey, "outputKey");
        int i13 = 2;
        l82.y.i(this.f73913f, new c0(quizId, answerString, outputKey, new o82.j0(kotlin.collections.f0.j(new i2(new jz0.a(quizId, answerString, outputKey), i13), new i2(new jz0.a(quizId, answerString, outputKey), i13), new i2(new jz0.g(quizId, outputKey), i13), new i2(new b0(), i13), new i2(new b0(), i13), new i2(new jz0.g(quizId, outputKey), i13)))), false, new dx0.d(this, 17), 2);
    }
}
