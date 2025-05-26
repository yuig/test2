package ao2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20135b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final p0[] f20136a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(p0[] p0VarArr) {
        this.f20136a = p0VarArr;
        this.notCompletedCount$volatile = p0VarArr.length;
    }

    public final Object a(bl2.c frame) {
        o oVar = new o(1, cl2.h.b(frame));
        oVar.v();
        p0[] p0VarArr = this.f20136a;
        int length = p0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i13 = 0; i13 < length; i13++) {
            p0 p0Var = p0VarArr[i13];
            p0Var.start();
            c cVar = new c(this, oVar);
            cVar.f20125f = m0.R(p0Var, true, cVar);
            Unit unit = Unit.f80348a;
            cVarArr[i13] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i14 = 0; i14 < length; i14++) {
            c cVar2 = cVarArr[i14];
            cVar2.getClass();
            c.f20123h.set(cVar2, dVar);
        }
        if (oVar.isCompleted()) {
            dVar.a();
        } else {
            lb.l0.E0(oVar, dVar);
        }
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }
}
