package kh2;

import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79477i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ sg2.a f79478j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f79479k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b1 f79480l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(sg2.a aVar, i iVar, b1 b1Var, int i13) {
        super(0);
        this.f79477i = i13;
        this.f79478j = aVar;
        this.f79479k = iVar;
        this.f79480l = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79477i;
        of2.a aVar = null;
        sg2.a aVar2 = this.f79478j;
        b1 b1Var = this.f79480l;
        i iVar = this.f79479k;
        switch (i13) {
            case 0:
                if (((sg2.b) aVar2).f112877b.f117602c.isAnrCaptureEnabled()) {
                    of2.b a13 = iVar.a();
                    if (a13 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    aVar = new of2.a(a13, ((d1) b1Var).f79455a);
                }
                return aVar;
            case 1:
                if (!((sg2.b) aVar2).f112877b.f117602c.isAnrCaptureEnabled()) {
                    return null;
                }
                c0 c0Var = iVar.f79520d;
                rl2.u[] uVarArr = i.f79516i;
                Looper looper = (Looper) c0Var.a(iVar, uVarArr[2]);
                Intrinsics.checkNotNullExpressionValue(looper, "looper");
                d1 d1Var = (d1) b1Var;
                lh2.b bVar = d1Var.f79456b;
                pf2.d dVar = (pf2.d) iVar.f79524h.a(iVar, uVarArr[6]);
                pf2.f fVar = (pf2.f) iVar.f79521e.a(iVar, uVarArr[3]);
                return new of2.h(this.f79478j, looper, bVar, dVar, iVar.f79517a, fVar, d1Var.f79455a);
            case 2:
                og2.a aVar3 = ((d1) b1Var).f79455a;
                c0 c0Var2 = iVar.f79521e;
                rl2.u[] uVarArr2 = i.f79516i;
                pf2.f fVar2 = (pf2.f) c0Var2.a(iVar, uVarArr2[3]);
                Thread thread = ((Looper) iVar.f79520d.a(iVar, uVarArr2[2])).getThread();
                Intrinsics.checkNotNullExpressionValue(thread, "looper.thread");
                return new pf2.a(aVar2, aVar3, fVar2, thread);
            default:
                ki2.a aVar4 = iVar.f79517a;
                d1 d1Var2 = (d1) b1Var;
                og2.a aVar5 = d1Var2.f79455a;
                rl2.u[] uVarArr3 = i.f79516i;
                return new pf2.d(this.f79478j, aVar4, aVar5, (pf2.f) iVar.f79521e.a(iVar, uVarArr3[3]), (pf2.e) iVar.f79522f.a(iVar, uVarArr3[4]), (pf2.a) iVar.f79523g.a(iVar, uVarArr3[5]), d1Var2.f79456b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(sg2.a aVar, b1 b1Var, i iVar) {
        super(0);
        this.f79477i = 2;
        this.f79478j = aVar;
        this.f79480l = b1Var;
        this.f79479k = iVar;
    }
}
