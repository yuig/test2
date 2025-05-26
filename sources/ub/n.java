package ub;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import ao2.j0;
import java.util.UUID;
import kb.a0;
import kb.b0;
import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.a1;
import lb.b1;

/* loaded from: classes3.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f121677r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f121678s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ tb.s f121679t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kb.s f121680u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f121681v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a0 a0Var, tb.s sVar, kb.s sVar2, Context context, bl2.c cVar) {
        super(2, cVar);
        this.f121678s = a0Var;
        this.f121679t = sVar;
        this.f121680u = sVar2;
        this.f121681v = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f121678s, this.f121679t, this.f121680u, this.f121681v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f121677r;
        a0 a0Var = this.f121678s;
        if (i13 == 0) {
            ue.c.H(obj);
            r4.l d2 = a0Var.d();
            Intrinsics.checkNotNullExpressionValue(d2, "worker.getForegroundInfoAsync()");
            this.f121677r = 1;
            obj = b1.a(d2, a0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    ue.c.H(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        final kb.r rVar = (kb.r) obj;
        tb.s sVar = this.f121679t;
        if (rVar == null) {
            throw new IllegalStateException(a.a.p(new StringBuilder("Worker was marked important ("), sVar.f117018c, ") but did not provide ForegroundInfo"));
        }
        String str = o.f121682a;
        b0.e().a(str, "Updating notification for " + sVar.f117018c);
        final UUID uuid = a0Var.f78963b.f19997a;
        final q qVar = (q) this.f121680u;
        j jVar = qVar.f121687a.f125444a;
        final Context context = this.f121681v;
        r4.l I = tb.f.I(jVar, "setForegroundAsync", new Function0() { // from class: ub.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                q qVar2 = q.this;
                UUID uuid2 = uuid;
                kb.r rVar2 = rVar;
                Context context2 = context;
                qVar2.getClass();
                String uuid3 = uuid2.toString();
                tb.s j13 = qVar2.f121689c.j(uuid3);
                if (j13 == null || j13.f117017b.isFinished()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                lb.o oVar = (lb.o) qVar2.f121688b;
                synchronized (oVar.f82647k) {
                    try {
                        b0.e().f(lb.o.f82636l, "Moving WorkSpec (" + uuid3 + ") to the foreground");
                        a1 a1Var = (a1) oVar.f82643g.remove(uuid3);
                        if (a1Var != null) {
                            if (oVar.f82637a == null) {
                                PowerManager.WakeLock a13 = l.a(oVar.f82638b, "ProcessorForegroundLck");
                                oVar.f82637a = a13;
                                a13.acquire();
                            }
                            oVar.f82642f.put(uuid3, a1Var);
                            Intent a14 = sb.c.a(oVar.f82638b, b7.c.q(a1Var.f82558a), rVar2);
                            Context context3 = oVar.f82638b;
                            Object obj2 = d5.a.f53679a;
                            context3.startForegroundService(a14);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                tb.j q13 = b7.c.q(j13);
                String str2 = sb.c.f112225j;
                Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", rVar2.f79025a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", rVar2.f79026b);
                intent.putExtra("KEY_NOTIFICATION", rVar2.f79027c);
                intent.putExtra("KEY_WORKSPEC_ID", q13.f116981a);
                intent.putExtra("KEY_GENERATION", q13.f116982b);
                context2.startService(intent);
                return null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(I, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
        this.f121677r = 2;
        obj = j1.O(I, this);
        return obj == aVar ? aVar : obj;
    }
}
