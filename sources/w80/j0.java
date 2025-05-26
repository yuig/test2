package w80;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import i2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128310i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f128311j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f128312k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s80.j f128313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f128314m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Function1 function1, u2.q qVar, s80.j jVar, float f13) {
        super(3);
        this.f128311j = function1;
        this.f128312k = qVar;
        this.f128313l = jVar;
        this.f128314m = f13;
    }

    public final void b(i1.m0 AnimatedVisibility, i2.o oVar) {
        u2.i iVar = u2.b.f120013a;
        am.d dVar = i2.n.f71185a;
        int i13 = this.f128310i;
        s80.j jVar = this.f128313l;
        float f13 = this.f128314m;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                i2.s sVar = (i2.s) oVar;
                Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
                Object J2 = sVar.J();
                if (J2 == dVar) {
                    i2.e0 e0Var = new i2.e0(i2.u.k(kotlin.coroutines.j.f80412a, sVar));
                    sVar.g0(e0Var);
                    J2 = e0Var;
                }
                ao2.j0 j0Var = ((i2.e0) J2).f71100a;
                sVar.W(-1014837477);
                Object J3 = sVar.J();
                if (J3 == dVar) {
                    J3 = new IdeaPinHandDrawingView(context);
                    sVar.g0(J3);
                }
                IdeaPinHandDrawingView ideaPinHandDrawingView = (IdeaPinHandDrawingView) J3;
                sVar.r(false);
                FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
                q3.p0 e13 = p1.q.e(iVar, false);
                int i14 = sVar.P;
                z1 o13 = sVar.o();
                u2.q X = ao2.m0.X(sVar, fillElement);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                if (sVar.O) {
                    sVar.n(iVar2);
                } else {
                    sVar.j0();
                }
                tb.f.f0(sVar, e13, s3.j.f110801e);
                tb.f.f0(sVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i14))) {
                    ep.b.y(i14, sVar, i14, hVar);
                }
                tb.f.f0(sVar, X, s3.j.f110799c);
                androidx.compose.ui.viewinterop.a.a(new h0(ideaPinHandDrawingView, f13, 0), this.f128312k, null, sVar, 0, 4);
                androidx.compose.ui.viewinterop.a.a(new sv.y(ideaPinHandDrawingView, j0Var, this.f128311j, 7), null, new i0(jVar, 0), sVar, 0, 2);
                sVar.r(true);
                return;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                i2.s sVar2 = (i2.s) oVar;
                Context context2 = (Context) sVar2.m(AndroidCompositionLocals_androidKt.f17455b);
                Object J4 = sVar2.J();
                if (J4 == dVar) {
                    i2.e0 e0Var2 = new i2.e0(i2.u.k(kotlin.coroutines.j.f80412a, sVar2));
                    sVar2.g0(e0Var2);
                    J4 = e0Var2;
                }
                ao2.j0 j0Var2 = ((i2.e0) J4).f71100a;
                sVar2.W(-696500718);
                Object J5 = sVar2.J();
                if (J5 == dVar) {
                    J5 = new IdeaPinHandDrawingView(context2);
                    sVar2.g0(J5);
                }
                IdeaPinHandDrawingView ideaPinHandDrawingView2 = (IdeaPinHandDrawingView) J5;
                Object d2 = jq.b.d(sVar2, false, -696498175);
                if (d2 == dVar) {
                    Function1 function1 = this.f128311j;
                    d2 = el.a.w(context2, ideaPinHandDrawingView2, false, j0Var2, function1, new com.facebook.login.o(function1));
                    sVar2.g0(d2);
                }
                IdeaPinHandDrawingEditor ideaPinHandDrawingEditor = (IdeaPinHandDrawingEditor) d2;
                sVar2.r(false);
                FillElement fillElement2 = androidx.compose.foundation.layout.e.f17184c;
                q3.p0 e14 = p1.q.e(iVar, false);
                int i15 = sVar2.P;
                z1 o14 = sVar2.o();
                u2.q X2 = ao2.m0.X(sVar2, fillElement2);
                s3.k.Qo.getClass();
                s3.i iVar3 = s3.j.f110798b;
                if (!(sVar2.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar3);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(sVar2, e14, s3.j.f110801e);
                tb.f.f0(sVar2, o14, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar2, i15, hVar2);
                }
                tb.f.f0(sVar2, X2, s3.j.f110799c);
                androidx.compose.ui.viewinterop.a.a(new h0(ideaPinHandDrawingView2, f13, 1), this.f128312k, null, sVar2, 0, 4);
                b7.c.c(!jVar.f111596e.f111806b, null, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(-285110856, new k1.n1(8, ideaPinHandDrawingEditor, jVar), sVar2), sVar2, 200064, 18);
                sVar2.r(true);
                return;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f128310i) {
            case 0:
                ((Number) obj3).intValue();
                b((i1.m0) obj, (i2.o) obj2);
                break;
            default:
                ((Number) obj3).intValue();
                b((i1.m0) obj, (i2.o) obj2);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(u2.q qVar, float f13, Function1 function1, s80.j jVar) {
        super(3);
        this.f128312k = qVar;
        this.f128314m = f13;
        this.f128311j = function1;
        this.f128313l = jVar;
    }
}
