package j1;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t3.s3;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74305i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74306j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f74307k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i13, Object obj, Object obj2) {
        super(1);
        this.f74305i = i13;
        this.f74306j = obj;
        this.f74307k = obj2;
    }

    public final i2.s0 b() {
        int i13 = this.f74305i;
        Object obj = this.f74307k;
        Object obj2 = this.f74306j;
        switch (i13) {
            case 0:
                u0 u0Var = (u0) obj2;
                o0 o0Var = (o0) obj;
                u0Var.f74245a.b(o0Var);
                u0Var.f74246b.setValue(Boolean.TRUE);
                return new w0(0, u0Var, o0Var);
            case 1:
                g2 g2Var = (g2) obj2;
                b2 b2Var = (b2) obj;
                g2Var.f74083i.add(b2Var);
                return new w0(1, g2Var, b2Var);
            case 7:
                androidx.compose.foundation.lazy.layout.v0 v0Var = (androidx.compose.foundation.lazy.layout.v0) obj2;
                v0Var.f17312c.remove(obj);
                return new w0(2, v0Var, obj);
            case 14:
                return new w0(3, (i2.q1) obj2, (o1.l) obj);
            default:
                q4.w wVar = (q4.w) obj2;
                wVar.f102374n = (q4.y) obj;
                wVar.s();
                return new q4.i();
        }
    }

    public final void e(d3.e eVar) {
        int i13 = this.f74305i;
        Object obj = this.f74307k;
        Object obj2 = this.f74306j;
        switch (i13) {
            case 2:
                s3.m0 m0Var = (s3.m0) eVar;
                m0Var.a();
                d3.h.k0(m0Var, ((b3.j0) obj2).f21333a, (b3.s) obj, 0.0f, null, 60);
                break;
            default:
                s3.m0 m0Var2 = (s3.m0) eVar;
                m0Var2.a();
                d3.h.k0(m0Var2, (b3.o0) obj2, (b3.s) obj, 0.0f, null, 60);
                break;
        }
    }

    public final void f(Throwable th3) {
        InputConnection inputConnection;
        Throwable th4 = null;
        switch (this.f74305i) {
            case 4:
                ((o1.l) this.f74306j).b((o1.j) this.f74307k);
                return;
            case 18:
                i2.e1 e1Var = (i2.e1) this.f74306j;
                Object obj = e1Var.f71101a;
                ao2.m mVar = (ao2.m) this.f74307k;
                synchronized (obj) {
                    e1Var.f71102b.remove(mVar);
                    Unit unit = Unit.f80348a;
                }
                return;
            case 19:
                i2.o2 o2Var = (i2.o2) this.f74306j;
                Object obj2 = o2Var.f71209b;
                Throwable th5 = (Throwable) this.f74307k;
                synchronized (obj2) {
                    if (th5 != null) {
                        if (th3 != null) {
                            try {
                                if (!(true ^ (th3 instanceof CancellationException))) {
                                    th3 = null;
                                }
                                if (th3 != null) {
                                    xk2.f.a(th5, th3);
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        th4 = th5;
                    }
                    o2Var.f71211d = th4;
                    o2Var.f71225r.i(i2.h2.ShutDown);
                    Unit unit2 = Unit.f80348a;
                }
                return;
            case 23:
                t3.t2 t2Var = (t3.t2) this.f74306j;
                synchronized (t2Var.f116197c) {
                    try {
                        t2Var.f116199e = true;
                        k2.e eVar = t2Var.f116198d;
                        int i13 = eVar.f78184c;
                        if (i13 > 0) {
                            Object[] objArr = eVar.f78182a;
                            int i14 = 0;
                            do {
                                h4.t tVar = (h4.t) ((WeakReference) objArr[i14]).get();
                                if (tVar != null && (inputConnection = tVar.f67611b) != null) {
                                    tVar.a(inputConnection);
                                    tVar.f67611b = null;
                                }
                                i14++;
                            } while (i14 < i13);
                        }
                        t2Var.f116198d.h();
                        Unit unit3 = Unit.f80348a;
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                ((t3.k1) this.f74307k).f116051b.f67562a.b();
                return;
            default:
                ((t3.r1) this.f74306j).f116179a.removeFrameCallback((Choreographer.FrameCallback) this.f74307k);
                return;
        }
    }

    public final void h(q3.b1 b1Var) {
        int i13 = this.f74305i;
        Object obj = this.f74307k;
        int i14 = 0;
        Object obj2 = this.f74306j;
        switch (i13) {
            case 12:
                ArrayList l13 = w1.g1.l((List) obj2, (Function0) ((w1.n1) obj).f127412b);
                if (l13 != null) {
                    int size = l13.size();
                    while (i14 < size) {
                        Pair pair = (Pair) l13.get(i14);
                        q3.c1 c1Var = (q3.c1) pair.f80346a;
                        Function0 function0 = (Function0) pair.f80347b;
                        q3.b1.e(b1Var, c1Var, function0 != null ? ((n4.h) function0.invoke()).f89180a : 0L);
                        i14++;
                    }
                    break;
                }
                break;
            default:
                List list = (List) obj2;
                if (list != null) {
                    int size2 = list.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        Pair pair2 = (Pair) list.get(i15);
                        q3.b1.e(b1Var, (q3.c1) pair2.f80346a, ((n4.h) pair2.f80347b).f89180a);
                    }
                }
                List list2 = (List) obj;
                if (list2 != null) {
                    int size3 = list2.size();
                    while (i14 < size3) {
                        Pair pair3 = (Pair) list2.get(i14);
                        q3.c1 c1Var2 = (q3.c1) pair3.f80346a;
                        Function0 function02 = (Function0) pair3.f80347b;
                        q3.b1.e(b1Var, c1Var2, function02 != null ? ((n4.h) function02.invoke()).f89180a : 0L);
                        i14++;
                    }
                    break;
                }
                break;
        }
    }

    public final Boolean i(KeyEvent keyEvent) {
        int i13 = this.f74305i;
        boolean z13 = true;
        Object obj = this.f74307k;
        Object obj2 = this.f74306j;
        switch (i13) {
            case 11:
                if (((w1.l1) obj2).a() == w1.w0.Selection && keyEvent.getKeyCode() == 4 && pp2.a.p(l3.c.N(keyEvent), 1)) {
                    ((b2.t0) obj).g(null);
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && pp2.a.p(l3.c.N(keyEvent), 2) && keyEvent.getSource() != 257) {
                    if (w1.g1.k(19, keyEvent)) {
                        z13 = ((androidx.compose.ui.focus.b) ((z2.j) obj2)).e(5);
                    } else if (w1.g1.k(20, keyEvent)) {
                        z13 = ((androidx.compose.ui.focus.b) ((z2.j) obj2)).e(6);
                    } else if (w1.g1.k(21, keyEvent)) {
                        z13 = ((androidx.compose.ui.focus.b) ((z2.j) obj2)).e(3);
                    } else if (w1.g1.k(22, keyEvent)) {
                        z13 = ((androidx.compose.ui.focus.b) ((z2.j) obj2)).e(4);
                    } else if (w1.g1.k(23, keyEvent)) {
                        s3 s3Var = ((w1.l1) obj).f127357c;
                        if (s3Var != null) {
                            ((t3.h2) s3Var).b();
                        }
                    }
                    return Boolean.valueOf(z13);
                }
                z13 = false;
                return Boolean.valueOf(z13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.x0.invoke(java.lang.Object):java.lang.Object");
    }
}
