package lb;

import a.cb;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import ao2.p1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final tb.s f82558a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f82559b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82560c;

    /* renamed from: d, reason: collision with root package name */
    public final kb.a0 f82561d;

    /* renamed from: e, reason: collision with root package name */
    public final vb.b f82562e;

    /* renamed from: f, reason: collision with root package name */
    public final kb.d f82563f;

    /* renamed from: g, reason: collision with root package name */
    public final bk.f f82564g;

    /* renamed from: h, reason: collision with root package name */
    public final sb.a f82565h;

    /* renamed from: i, reason: collision with root package name */
    public final WorkDatabase f82566i;

    /* renamed from: j, reason: collision with root package name */
    public final tb.y f82567j;

    /* renamed from: k, reason: collision with root package name */
    public final tb.c f82568k;

    /* renamed from: l, reason: collision with root package name */
    public final List f82569l;

    /* renamed from: m, reason: collision with root package name */
    public final String f82570m;

    /* renamed from: n, reason: collision with root package name */
    public final p1 f82571n;

    public a1(p0 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        tb.s sVar = (tb.s) builder.f82657f;
        this.f82558a = sVar;
        this.f82559b = (Context) builder.f82658g;
        String str = sVar.f117016a;
        this.f82560c = str;
        this.f82561d = (kb.a0) builder.f82659h;
        this.f82562e = (vb.b) builder.f82654c;
        kb.d dVar = (kb.d) builder.f82653b;
        this.f82563f = dVar;
        this.f82564g = dVar.f78973d;
        this.f82565h = (sb.a) builder.f82655d;
        WorkDatabase workDatabase = (WorkDatabase) builder.f82656e;
        this.f82566i = workDatabase;
        this.f82567j = workDatabase.y();
        this.f82568k = workDatabase.t();
        List list = (List) builder.f82652a;
        this.f82569l = list;
        this.f82570m = a.a.p(cb.o("Work [ id=", str, ", tags={ "), CollectionsKt.Z(list, ",", null, null, 0, null, null, 62), " } ]");
        this.f82571n = ao2.m0.b();
    }

    public static final boolean a(a1 a1Var, int i13) {
        tb.y yVar = a1Var.f82567j;
        String str = a1Var.f82560c;
        kb.s0 i14 = yVar.i(str);
        if (i14 == null || i14.isFinished()) {
            String str2 = b1.f82583a;
            kb.b0.e().a(str2, "Status for " + str + " is " + i14 + " ; not doing any work");
            return false;
        }
        String str3 = b1.f82583a;
        kb.b0.e().a(str3, "Status for " + str + " is " + i14 + "; not doing any work and rescheduling for later execution");
        yVar.p(kb.s0.ENQUEUED, str);
        yVar.q(i13, str);
        yVar.l(-1L, str);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(lb.a1 r19, bl2.c r20) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.a1.b(lb.a1, bl2.c):java.lang.Object");
    }

    public final void c(int i13) {
        this.f82571n.cancel((CancellationException) new WorkerStoppedException(i13));
    }

    public final void d(int i13) {
        kb.s0 s0Var = kb.s0.ENQUEUED;
        tb.y yVar = this.f82567j;
        String str = this.f82560c;
        yVar.p(s0Var, str);
        this.f82564g.getClass();
        yVar.n(System.currentTimeMillis(), str);
        yVar.m(this.f82558a.f117037v, str);
        yVar.l(-1L, str);
        yVar.q(i13, str);
    }

    public final void e() {
        this.f82564g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        tb.y yVar = this.f82567j;
        String str = this.f82560c;
        yVar.n(currentTimeMillis, str);
        yVar.p(kb.s0.ENQUEUED, str);
        ja.d0 d0Var = yVar.f117050a;
        d0Var.b();
        tb.u uVar = yVar.f117060k;
        oa.i a13 = uVar.a();
        a13.c1(1, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
                uVar.j(a13);
                yVar.m(this.f82558a.f117037v, str);
                d0Var.b();
                tb.u uVar2 = yVar.f117056g;
                oa.i a14 = uVar2.a();
                a14.c1(1, str);
                try {
                    d0Var.c();
                    try {
                        a14.G();
                        d0Var.r();
                        uVar2.j(a14);
                        yVar.l(-1L, str);
                    } finally {
                    }
                } catch (Throwable th3) {
                    uVar2.j(a14);
                    throw th3;
                }
            } finally {
            }
        } catch (Throwable th4) {
            uVar.j(a13);
            throw th4;
        }
    }

    public final void f(kb.z result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String str = this.f82560c;
        ArrayList l13 = kotlin.collections.f0.l(str);
        while (true) {
            boolean z13 = !l13.isEmpty();
            tb.y yVar = this.f82567j;
            if (!z13) {
                kb.l lVar = ((kb.w) result).f79047a;
                Intrinsics.checkNotNullExpressionValue(lVar, "failure.outputData");
                yVar.m(this.f82558a.f117037v, str);
                yVar.o(lVar, str);
                return;
            }
            String str2 = (String) kotlin.collections.k0.B(l13);
            if (yVar.i(str2) != kb.s0.CANCELLED) {
                yVar.p(kb.s0.FAILED, str2);
            }
            l13.addAll(this.f82568k.e(str2));
        }
    }
}
