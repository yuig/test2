package m1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f85593a;

    /* renamed from: b, reason: collision with root package name */
    public final t f85594b = new t(this);

    /* renamed from: c, reason: collision with root package name */
    public final k1.z1 f85595c = new k1.z1();

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f85596d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f85597e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f85598f;

    public u(Function1 function1) {
        this.f85593a = function1;
        Boolean bool = Boolean.FALSE;
        y3 y3Var = y3.f71400a;
        this.f85596d = bs1.c.u1(bool, y3Var);
        this.f85597e = bs1.c.u1(bool, y3Var);
        this.f85598f = bs1.c.u1(bool, y3Var);
    }

    @Override // m1.h2
    public final boolean a() {
        return ((Boolean) this.f85597e.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final Object b(k1.v1 v1Var, Function2 function2, bl2.c cVar) {
        Object O = dl2.b.O(new s(this, v1Var, function2, null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    @Override // m1.h2
    public final boolean c() {
        return ((Boolean) this.f85596d.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final float f(float f13) {
        return ((Number) this.f85593a.invoke(Float.valueOf(f13))).floatValue();
    }

    @Override // m1.h2
    public final boolean g() {
        return ((Boolean) this.f85598f.getValue()).booleanValue();
    }
}
