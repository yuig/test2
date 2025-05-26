package n7;

import a7.c1;
import ao2.o1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pk.t2;
import pk.v2;
import pk.x0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements d7.r, d7.i, k8.n, r4.j, uj2.s, uj2.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f89540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f89542d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i13) {
        this.f89539a = i13;
        this.f89540b = obj;
        this.f89541c = obj2;
        this.f89542d = obj3;
    }

    @Override // r4.j
    public final Object C(r4.i completer) {
        CoroutineContext coroutineContext = (CoroutineContext) this.f89540b;
        ao2.l0 l0Var = (ao2.l0) this.f89541c;
        Function2 function2 = (Function2) this.f89542d;
        Intrinsics.checkNotNullParameter(completer, "completer");
        completer.a(new androidx.activity.d((o1) coroutineContext.get(ao2.g0.f20154b), 13), kb.o.INSTANCE);
        return kotlin.jvm.internal.j.z(dl2.b.b(coroutineContext), null, l0Var, new kb.v(function2, completer, null), 1);
    }

    @Override // d7.i
    public final void accept(Object obj) {
        g8.h0 h0Var = (g8.h0) this.f89540b;
        ((g8.i0) obj).d(h0Var.f64276a, h0Var.f64277b, (g8.v) this.f89541c, (g8.a0) this.f89542d);
    }

    @Override // k8.n
    public final v2 e(int i13, c1 c1Var, int[] iArr) {
        k8.j jVar = (k8.j) this.f89540b;
        String str = (String) this.f89541c;
        String str2 = (String) this.f89542d;
        t2 t2Var = k8.q.f78564j;
        x0 n13 = pk.c1.n();
        for (int i14 = 0; i14 < c1Var.f964a; i14++) {
            n13.e(new k8.m(i13, c1Var, i14, jVar, iArr[i14], str, str2));
        }
        return n13.i();
    }

    @Override // uj2.e0
    public final void g(kk2.a emitter) {
        ir1.e this$0 = (ir1.e) this.f89540b;
        u5.l credentialManager = (u5.l) this.f89541c;
        u5.y request = (u5.y) this.f89542d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(credentialManager, "$credentialManager");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        j1.a activityAction = new j1.a(this$0, emitter, credentialManager, request, 4);
        this$0.getClass();
        Intrinsics.checkNotNullParameter(activityAction, "activityAction");
        this$0.f84602b.H3(activityAction);
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f89539a;
        Object obj2 = this.f89541c;
        b bVar = (b) this.f89540b;
        switch (i13) {
            case 0:
                ((c) obj).G(bVar, (g8.v) obj2, (g8.a0) this.f89542d);
                break;
            default:
                ((c) obj).I(bVar, (androidx.media3.common.b) obj2);
                break;
        }
    }

    @Override // uj2.s
    public final void o(fk2.f emitter) {
        vd0.c response = (vd0.c) this.f89540b;
        nl.b sideEffect = (nl.b) this.f89541c;
        ug0.i this$0 = (ug0.i) this.f89542d;
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(sideEffect, "$sideEffect");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Intrinsics.checkNotNullParameter(response, "<this>");
        vd0.c m13 = response.m("data");
        if (m13 == null || ((pm.l) m13.f125623a.f91366a.entrySet()).size() <= 0) {
            emitter.b();
            return;
        }
        if (sideEffect instanceof tg0.d) {
            emitter.c(response);
        } else if (sideEffect instanceof tg0.c) {
            synchronized (this$0.i()) {
                try {
                    if (((tg0.c) sideEffect).f117576b) {
                        ((dh0.d) this$0.i()).a();
                    }
                    ((dh0.d) this$0.i()).d(m13, ((tg0.c) sideEffect).f117577c);
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            emitter.c(response);
        }
        emitter.b();
    }
}
