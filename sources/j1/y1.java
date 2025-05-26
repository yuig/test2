package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f74324a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74325b = bs1.c.u1(null, y3.f71400a);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f74326c;

    public y1(g2 g2Var, p2 p2Var, String str) {
        this.f74326c = g2Var;
        this.f74324a = p2Var;
    }

    public final x1 a(Function1 function1, Function1 function12) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f74325b;
        x1 x1Var = (x1) parcelableSnapshotMutableState.getValue();
        g2 g2Var = this.f74326c;
        if (x1Var == null) {
            Object invoke = function12.invoke(g2Var.c());
            Object invoke2 = function12.invoke(g2Var.c());
            p2 p2Var = this.f74324a;
            t tVar = (t) p2Var.f74197a.invoke(invoke2);
            tVar.d();
            b2 b2Var = new b2(g2Var, invoke, tVar, p2Var);
            x1Var = new x1(this, b2Var, function1, function12);
            parcelableSnapshotMutableState.setValue(x1Var);
            g2Var.f74083i.add(b2Var);
        }
        x1Var.f74310c = function12;
        x1Var.f74309b = function1;
        x1Var.b(g2Var.f());
        return x1Var;
    }
}
