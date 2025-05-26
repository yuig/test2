package ow;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public long f97802r;

    /* renamed from: s, reason: collision with root package name */
    public int f97803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0 f97804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p0 p0Var, bl2.c cVar) {
        super(2, cVar);
        this.f97804t = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f97804t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long j13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f97803s;
        p0 p0Var = this.f97804t;
        if (i13 == 0) {
            ue.c.H(obj);
            ((pb0.g) p0Var.f97868j).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            boolean z13 = ((xw.b) p0Var.f97859a).f136115d;
            this.f97802r = currentTimeMillis;
            this.f97803s = 1;
            yw.f fVar = (yw.f) p0Var.f97862d;
            fVar.getClass();
            obj = kotlin.jvm.internal.j.M(this, fVar.f140260b, new yw.b(fVar, z13, null));
            if (obj == aVar) {
                return aVar;
            }
            j13 = currentTimeMillis;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = this.f97802r;
            ue.c.H(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof xz.b) {
            ((pb0.g) p0Var.f97868j).getClass();
            long currentTimeMillis2 = System.currentTimeMillis() - j13;
            p0Var.f97874p = (String) ((xz.b) networkResponse).f136205a;
            pw.c cVar = (pw.c) p0Var.f97861c;
            cVar.getClass();
            cVar.g("[JS DOWNLOAD] Success duration: " + currentTimeMillis2);
            ((sw.b) cVar.f101492a).c(rw.a.JS_DOWNLOAD, null, Long.valueOf(currentTimeMillis2));
        } else if (networkResponse instanceof xz.a) {
            ((pb0.g) p0Var.f97868j).getClass();
            ((pw.c) p0Var.f97861c).l(System.currentTimeMillis() - j13, ((xz.a) networkResponse).a());
        }
        return Unit.f80348a;
    }
}
