package ads_mobile_sdk;

import a.g0;
import a.p9;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class gh2 {

    /* renamed from: a, reason: collision with root package name */
    public final yy2 f5570a;

    /* renamed from: b, reason: collision with root package name */
    public final p9 f5571b;

    /* renamed from: c, reason: collision with root package name */
    public final a.p3 f5572c;

    /* renamed from: d, reason: collision with root package name */
    public final File f5573d;

    /* renamed from: e, reason: collision with root package name */
    public final bt2 f5574e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f5575f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f5576g = new AtomicReference("3.-1");

    public gh2(yy2 yy2Var, p9 p9Var, a.p3 p3Var, bt2 bt2Var, ExecutorService executorService, File file) {
        this.f5570a = yy2Var;
        this.f5571b = p9Var;
        this.f5572c = p3Var;
        this.f5574e = bt2Var;
        this.f5573d = file;
        this.f5575f = executorService;
    }

    public static /* synthetic */ x12 a(Throwable th3) {
        return null;
    }

    public final com.google.common.util.concurrent.c0 b(Context context, String str, View view, Activity activity) {
        return dl2.b.M2(this.f5575f, new a.x3(this, context, str, view, activity, 1));
    }

    public final String c(Context context, String str, View view, Activity activity) {
        String a13;
        k71 a14 = this.f5570a.a();
        if (a14 == null) {
            this.f5574e.b(xb0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return "";
        }
        synchronized (a14) {
            try {
                l90 l90Var = (l90) a14.f7146b;
                bn2 bn2Var = l90Var.f7736b;
                bn2Var.getClass();
                HashMap hashMap = new HashMap();
                Iterator it = bn2Var.f3538a.iterator();
                while (it.hasNext()) {
                    ((a.n6) it.next()).b(hashMap);
                }
                l90Var.a(hashMap);
                hashMap.put("f", "c");
                hashMap.put("ctx", context);
                hashMap.put("cs", str);
                hashMap.put("aid", null);
                hashMap.put("view", view);
                hashMap.put("act", activity);
                byte[] a15 = a14.a(hashMap);
                if (a14.f7148d) {
                    hashMap.clear();
                }
                a13 = k71.a(a15);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return a13;
    }

    public final String d(Context context, String str, View view, Activity activity) {
        String a13;
        k71 a14 = this.f5570a.a();
        if (a14 == null) {
            this.f5574e.b(xb0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return "";
        }
        synchronized (a14) {
            try {
                l90 l90Var = (l90) a14.f7146b;
                bn2 bn2Var = l90Var.f7736b;
                Context context2 = l90Var.f7735a;
                bn2Var.getClass();
                HashMap hashMap = new HashMap();
                Iterator it = bn2Var.f3538a.iterator();
                while (it.hasNext()) {
                    ((a.n6) it.next()).a(hashMap, context2, null);
                }
                l90Var.a(hashMap);
                hashMap.put("f", "v");
                hashMap.put("ctx", context);
                hashMap.put("aid", null);
                hashMap.put("view", view);
                hashMap.put("act", activity);
                byte[] a15 = a14.a(hashMap);
                if (a14.f7148d) {
                    hashMap.clear();
                }
                a13 = k71.a(a15);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return a13;
    }

    public final com.google.common.util.concurrent.c0 a(Context context, String str, View view, Activity activity) {
        return dl2.b.M2(this.f5575f, new a.x3(this, context, str, view, activity, 0));
    }

    public final String b(Context context) {
        String a13;
        k71 a14 = this.f5570a.a();
        if (a14 == null) {
            this.f5574e.b(xb0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return "";
        }
        synchronized (a14) {
            try {
                l90 l90Var = (l90) a14.f7146b;
                bn2 bn2Var = l90Var.f7736b;
                bn2Var.getClass();
                HashMap hashMap = new HashMap();
                Iterator it = bn2Var.f3538a.iterator();
                while (it.hasNext()) {
                    ((a.n6) it.next()).a(hashMap);
                }
                l90Var.a(hashMap);
                hashMap.put("f", "q");
                hashMap.put("ctx", context);
                hashMap.put("aid", null);
                byte[] a15 = a14.a(hashMap);
                if (a14.f7148d) {
                    hashMap.clear();
                }
                a13 = k71.a(a15);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return a13;
    }

    public final com.google.common.util.concurrent.c0 a(Context context) {
        return dl2.b.M2(this.f5575f, new g0(2, this, context));
    }

    public final com.google.common.util.concurrent.t a() {
        com.google.common.util.concurrent.t z13 = com.google.common.util.concurrent.t.z(((qn2) this.f5571b).a());
        a.y3 y3Var = new a.y3(0);
        com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
        z13.getClass();
        return com.google.common.util.concurrent.g.A(com.google.common.util.concurrent.a.A(z13, Throwable.class, y3Var, rVar), new a.z3(this, 0), this.f5575f);
    }

    public final /* synthetic */ Void a(x12 x12Var) {
        b(x12Var);
        return null;
    }

    public final void a(q12 q12Var, x12 x12Var) {
        yy2 yy2Var = this.f5570a;
        yy2Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            yy2Var.a(yy2Var.a(q12Var));
            ((x71) ((x3) yy2Var.f14472c).f13404a).a(3000, System.currentTimeMillis() - currentTimeMillis, null, null);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(Boolean.TRUE);
            taskCompletionSource.getTask();
            this.f5576g.set("2." + x12Var.t().u());
        } catch (xy2 e13) {
            yy2Var.f14472c.a(e13.f13896a, System.currentTimeMillis() - currentTimeMillis, e13);
            throw new ih2(2);
        } catch (Exception e14) {
            yy2Var.f14472c.a(4010, System.currentTimeMillis() - currentTimeMillis, e14);
            throw new ih2(2);
        }
    }

    public final void b(x12 x12Var) {
        j90 j90Var = (j90) this.f5572c;
        if (x12Var != null) {
            j90Var.getClass();
            if (!x12Var.equals(x12.s())) {
                if (x12Var.r() == j90Var.f6732a.get()) {
                    File file = ((xc0) ((qn2) this.f5571b).f10189c.get()).f13601a;
                    if (Build.VERSION.SDK_INT >= 34) {
                        file.setReadOnly();
                    }
                    q12 q12Var = new q12(x12Var.t(), file, ((qn2) this.f5571b).f10188b.f13601a, this.f5573d);
                    bt2 bt2Var = this.f5574e;
                    xb0 xb0Var = xb0.EVENT_ID_DG_ENGINE_INIT_VM_LOAD;
                    a.a4 a4Var = new a.a4(this, q12Var, x12Var, 0);
                    try {
                        new bs2(xb0Var, bt2Var.f3596b, bt2Var.f3595a).b();
                        a4Var.run();
                        return;
                    } finally {
                    }
                } else {
                    j90Var.f6733b.b(xb0.EVENT_ID_DG_VALIDATOR_INIT_METADATA_ARCH_MISMATCH);
                    this.f5574e.b(xb0.EVENT_ID_DG_ENGINE_INIT_SKIP_INVALID_METADATA);
                    throw new ih2(1);
                }
            }
        }
        j90Var.f6733b.b(xb0.EVENT_ID_DG_VALIDATOR_INIT_METADATA_NOT_FOUND);
        this.f5574e.b(xb0.EVENT_ID_DG_ENGINE_INIT_SKIP_INVALID_METADATA);
        throw new ih2(1);
    }
}
