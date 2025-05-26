package by1;

import ay1.b0;
import ay1.n;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import dl2.j;
import do2.j0;
import fd.q;
import java.util.Date;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes4.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24147r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f24148s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f30 f24149t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f24150u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f24151v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f30 f30Var, r rVar, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f24149t = f30Var;
        this.f24150u = iVar;
        this.f24151v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = this.f24150u;
        g gVar = new g(this.f24149t, this.f24151v, iVar, cVar);
        gVar.f24148s = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24147r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.j jVar = (do2.j) this.f24148s;
            f30 f30Var = this.f24149t;
            f3 z33 = f30Var.z3();
            Map G = z33 != null ? z33.G() : null;
            if (G == null) {
                G = z0.d();
            }
            boolean z13 = !G.isEmpty();
            i iVar = this.f24150u;
            if (z13) {
                cy1.e eVar = new cy1.e(f30Var, iVar.f24159g);
                this.f24147r = 1;
                if (jVar.emit(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                Date date = iVar.f24159g;
                if (date != null) {
                    cy1.e eVar2 = new cy1.e(f30Var, date);
                    this.f24147r = 2;
                    if (jVar.emit(eVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    boolean booleanValue = f30Var.e5().booleanValue();
                    r rVar = this.f24151v;
                    if (booleanValue) {
                        boolean[] zArr = f30Var.f37485h3;
                        if (zArr.length <= 177 || !zArr[177] || f30Var.i6() == null) {
                            cy1.e eVar3 = new cy1.e(f30Var, iVar.f24159g);
                            this.f24147r = 5;
                            if (jVar.emit(eVar3, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            String i63 = f30Var.i6();
                            if (i63 == null) {
                                i63 = "";
                            }
                            j0 j0Var = new j0(kotlin.jvm.internal.j.a(iVar.f24156d.T(i63)), new kx1.b(this.f24151v, jVar, this.f24149t, this.f24150u, null));
                            q qVar = new q(rVar, jVar, f30Var);
                            this.f24147r = 4;
                            if (j0Var.collect(qVar, this) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        Date U3 = f30Var.U3();
                        if (U3 == null) {
                            U3 = f30Var.G6();
                        }
                        rVar.a(new n(new b0(U3)));
                        cy1.e eVar4 = new cy1.e(f30Var, f30Var.U3());
                        this.f24147r = 3;
                        if (jVar.emit(eVar4, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
        } else {
            if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
