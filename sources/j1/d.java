package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f74026a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f74027b;

    /* renamed from: c, reason: collision with root package name */
    public final o f74028c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74029d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74030e;

    /* renamed from: f, reason: collision with root package name */
    public final k1 f74031f;

    /* renamed from: g, reason: collision with root package name */
    public final t f74032g;

    /* renamed from: h, reason: collision with root package name */
    public final t f74033h;

    /* renamed from: i, reason: collision with root package name */
    public final t f74034i;

    /* renamed from: j, reason: collision with root package name */
    public final t f74035j;

    public /* synthetic */ d(Object obj, p2 p2Var, Object obj2, int i13) {
        this(obj, p2Var, (i13 & 4) != 0 ? null : obj2);
    }

    public static final Object a(d dVar, Object obj) {
        t tVar = dVar.f74032g;
        t tVar2 = dVar.f74034i;
        boolean d2 = Intrinsics.d(tVar2, tVar);
        t tVar3 = dVar.f74035j;
        if (d2 && Intrinsics.d(tVar3, dVar.f74033h)) {
            return obj;
        }
        p2 p2Var = dVar.f74026a;
        t tVar4 = (t) p2Var.f74197a.invoke(obj);
        int b13 = tVar4.b();
        boolean z13 = false;
        for (int i13 = 0; i13 < b13; i13++) {
            if (tVar4.a(i13) < tVar2.a(i13) || tVar4.a(i13) > tVar3.a(i13)) {
                tVar4.e(i13, ql2.s.f(tVar4.a(i13), tVar2.a(i13), tVar3.a(i13)));
                z13 = true;
            }
        }
        return z13 ? p2Var.f74198b.invoke(tVar4) : obj;
    }

    public static final void b(d dVar) {
        o oVar = dVar.f74028c;
        oVar.f74170c.d();
        oVar.f74171d = Long.MIN_VALUE;
        dVar.f74029d.setValue(Boolean.FALSE);
    }

    public static Object c(d dVar, Object obj, n nVar, bl2.c cVar) {
        Object invoke = dVar.f74026a.f74198b.invoke(dVar.f74028c.f74170c);
        Object d2 = dVar.d();
        p2 p2Var = dVar.f74026a;
        return k1.a(dVar.f74031f, new b(dVar, invoke, new w1(nVar, p2Var, d2, obj, (t) p2Var.f74197a.invoke(invoke)), dVar.f74028c.f74171d, null, null), cVar);
    }

    public final Object d() {
        return this.f74028c.f74169b.getValue();
    }

    public final Object e(Object obj, bl2.c cVar) {
        Object a13 = k1.a(this.f74031f, new c(this, obj, null), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    public d(Object obj, p2 p2Var, Object obj2) {
        t tVar;
        t tVar2;
        this.f74026a = p2Var;
        this.f74027b = obj2;
        o oVar = new o(p2Var, obj, null, 60);
        this.f74028c = oVar;
        Boolean bool = Boolean.FALSE;
        y3 y3Var = y3.f71400a;
        this.f74029d = bs1.c.u1(bool, y3Var);
        this.f74030e = bs1.c.u1(obj, y3Var);
        this.f74031f = new k1();
        t tVar3 = oVar.f74170c;
        boolean z13 = tVar3 instanceof p;
        if (z13) {
            tVar = e.f74047e;
        } else if (tVar3 instanceof q) {
            tVar = e.f74048f;
        } else {
            tVar = tVar3 instanceof r ? e.f74049g : e.f74050h;
        }
        this.f74032g = tVar;
        if (z13) {
            tVar2 = e.f74043a;
        } else if (tVar3 instanceof q) {
            tVar2 = e.f74044b;
        } else {
            tVar2 = tVar3 instanceof r ? e.f74045c : e.f74046d;
        }
        this.f74033h = tVar2;
        this.f74034i = tVar;
        this.f74035j = tVar2;
    }
}
