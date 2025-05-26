package ads_mobile_sdk;

import a.f2;
import a.pd;
import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class qc0 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f10026a;

    /* renamed from: b, reason: collision with root package name */
    public final a.n5 f10027b;

    /* renamed from: c, reason: collision with root package name */
    public final a.n5 f10028c;

    /* renamed from: d, reason: collision with root package name */
    public final bn2 f10029d;

    /* renamed from: e, reason: collision with root package name */
    public final a.n5 f10030e;

    /* renamed from: f, reason: collision with root package name */
    public final a.v7 f10031f;

    /* renamed from: g, reason: collision with root package name */
    public final i4 f10032g;

    public qc0(ExecutorService executorService, a.n5 n5Var, a.n5 n5Var2, bn2 bn2Var, a.n5 n5Var3, a.o8 o8Var, i4 i4Var) {
        this.f10026a = executorService;
        this.f10027b = n5Var;
        this.f10028c = n5Var2;
        this.f10029d = bn2Var;
        this.f10030e = n5Var3;
        this.f10031f = o8Var;
        this.f10032g = i4Var;
    }

    @Override // a.f2
    public final void a(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((ob1) this.f10030e.get()).a((MotionEvent) inputEvent);
        }
    }

    @Override // a.f2
    public final com.google.common.util.concurrent.c0 b(Context context, String str, View view, Activity activity) {
        bn2 bn2Var = this.f10029d;
        bn2Var.getClass();
        HashMap hashMap = new HashMap();
        Iterator it = bn2Var.f3538a.iterator();
        while (it.hasNext()) {
            ((a.n6) it.next()).b(hashMap);
        }
        ((ob1) this.f10030e.get()).a(hashMap);
        r00 r00Var = (r00) this.f10031f.get();
        r00Var.getClass();
        context.getClass();
        r00Var.f10403c = context;
        r00Var.f10404d = view;
        r00Var.f10405e = activity;
        r00Var.f10406f = str;
        r00Var.f10407g = hashMap;
        r00Var.f10409i = zm2.CLICK;
        pd u13 = wb.u();
        u13.getClass();
        r00Var.f10408h = u13;
        return ((cj2) r00Var.a().A.get()).b();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0048: INVOKE (r3 I:ads_mobile_sdk.bs2) VIRTUAL call: ads_mobile_sdk.bs2.a():void A[Catch: all -> 0x0046, MD:():void (m), TRY_ENTER], block:B:21:0x0048 */
    public final Void c() {
        bs2 a13;
        ((a) this.f10028c.get()).a();
        bb1 bb1Var = (bb1) ((a.m) this.f10027b.get());
        synchronized (bb1Var) {
            try {
                bt2 bt2Var = bb1Var.f2817e;
                bs2 bs2Var = new bs2(xb0.EVENT_ID_FALLBACK_INIT_METHOD_PROVIDER, bt2Var.f3596b, bt2Var.f3595a);
                try {
                    bs2Var.b();
                    bb1Var.a();
                    bb1Var.c();
                    bb1Var.d();
                    bb1Var.f2822j = true;
                } catch (al2 e13) {
                    bs2Var.a(e13);
                } catch (Throwable th3) {
                    bs2Var.a(th3);
                    throw th3;
                }
                bs2Var.a();
            } catch (Throwable th4) {
                a13.a();
                throw th4;
            }
        }
        return null;
    }

    @Override // a.f2
    public final com.google.common.util.concurrent.c0 a(Context context) {
        r00 r00Var = (r00) this.f10031f.get();
        r00Var.getClass();
        context.getClass();
        r00Var.f10403c = context;
        bn2 bn2Var = this.f10029d;
        bn2Var.getClass();
        HashMap hashMap = new HashMap();
        Iterator it = bn2Var.f3538a.iterator();
        while (it.hasNext()) {
            ((a.n6) it.next()).a(hashMap);
        }
        r00Var.f10407g = hashMap;
        pd u13 = wb.u();
        u13.getClass();
        r00Var.f10408h = u13;
        r00Var.f10409i = zm2.QUERY;
        return ((cj2) r00Var.a().A.get()).b();
    }

    @Override // a.f2
    public final com.google.common.util.concurrent.c0 a(Context context, String str, View view, Activity activity) {
        r00 r00Var = (r00) this.f10031f.get();
        r00Var.getClass();
        context.getClass();
        r00Var.f10403c = context;
        r00Var.f10404d = view;
        r00Var.f10405e = activity;
        if (!this.f10032g.y()) {
            str = "";
        }
        r00Var.f10406f = str;
        bn2 bn2Var = this.f10029d;
        bn2Var.getClass();
        HashMap hashMap = new HashMap();
        Iterator it = bn2Var.f3538a.iterator();
        while (it.hasNext()) {
            ((a.n6) it.next()).a(hashMap, context, view);
        }
        r00Var.f10407g = hashMap;
        pd u13 = wb.u();
        u13.getClass();
        r00Var.f10408h = u13;
        r00Var.f10409i = zm2.VIEW;
        return ((cj2) r00Var.a().A.get()).b();
    }

    @Override // a.f2
    public final String b() {
        return "0.751115858";
    }

    @Override // a.f2
    public final com.google.common.util.concurrent.c0 a() {
        return dl2.b.M2(this.f10026a, new a.k1(this, 1));
    }
}
