package mk;

import a7.g0;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.k0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jk.s;
import jk.u;
import kk.m;
import oi.o6;
import oi.u6;

/* loaded from: classes3.dex */
public final class a implements jk.b {

    /* renamed from: o, reason: collision with root package name */
    public static final long f87284o = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f87285p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f87286a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f87287b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87288c;

    /* renamed from: d, reason: collision with root package name */
    public final m f87289d;

    /* renamed from: e, reason: collision with root package name */
    public final m.a f87290e;

    /* renamed from: f, reason: collision with root package name */
    public final u6 f87291f;

    /* renamed from: g, reason: collision with root package name */
    public final u6 f87292g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f87293h;

    /* renamed from: i, reason: collision with root package name */
    public final s f87294i;

    /* renamed from: j, reason: collision with root package name */
    public final File f87295j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f87296k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f87297l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f87298m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f87299n;

    public a(Context context, File file, u uVar, m mVar) {
        ThreadPoolExecutor m03 = tb.f.m0();
        m.a aVar = new m.a(context);
        this.f87286a = new Handler(Looper.getMainLooper());
        this.f87296k = new AtomicReference();
        this.f87297l = Collections.synchronizedSet(new HashSet());
        this.f87298m = Collections.synchronizedSet(new HashSet());
        this.f87299n = new AtomicBoolean(false);
        this.f87287b = context;
        this.f87295j = file;
        this.f87288c = uVar;
        this.f87289d = mVar;
        this.f87293h = m03;
        this.f87290e = aVar;
        this.f87292g = new u6(22);
        this.f87291f = new u6(22);
        this.f87294i = s.INSTANCE;
    }

    @Override // jk.b
    public final void a(c91.b bVar) {
        u6 u6Var = this.f87292g;
        synchronized (u6Var) {
            ((Set) u6Var.f95225b).add(bVar);
        }
    }

    @Override // jk.b
    public final void b(jk.c cVar) {
        u6 u6Var = this.f87292g;
        synchronized (u6Var) {
            ((Set) u6Var.f95225b).remove(cVar);
        }
    }

    @Override // jk.b
    public final Task c(List list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // jk.b
    public final Set d() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f87288c.c());
        hashSet.addAll(this.f87297l);
        return hashSet;
    }

    @Override // jk.b
    public final boolean e(jk.d dVar, Activity activity) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0168, code lost:
    
        if (r3.contains(r13) == false) goto L48;
     */
    @Override // jk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task f(qq2.c r26) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.a.f(qq2.c):com.google.android.gms.tasks.Task");
    }

    public final Task g(int i13) {
        i(new hc.m(i13, 0));
        return Tasks.forException(new SplitInstallException(i13));
    }

    public final k0 h() {
        Context context = this.f87287b;
        try {
            k0 a13 = this.f87288c.a(context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).applicationInfo.metaData);
            if (a13 != null) {
                return a13;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e13) {
            throw new IllegalStateException("App is not found in PackageManager", e13);
        }
    }

    public final synchronized jk.d i(f fVar) {
        jk.d dVar = (jk.d) this.f87296k.get();
        jk.d j13 = fVar.j(dVar);
        AtomicReference atomicReference = this.f87296k;
        while (!atomicReference.compareAndSet(dVar, j13)) {
            if (atomicReference.get() != dVar && atomicReference.get() != dVar) {
                return null;
            }
        }
        return j13;
    }

    public final boolean j(int i13, int i14, Integer num, Long l13, Long l14, List list, ArrayList arrayList) {
        g0 g0Var = new g0();
        g0Var.f1022c = num;
        g0Var.f1020a = i13;
        g0Var.f1021b = i14;
        g0Var.f1023d = l13;
        g0Var.f1024e = l14;
        g0Var.f1025f = list;
        g0Var.f1026g = arrayList;
        jk.d i15 = i(g0Var);
        if (i15 == null) {
            return false;
        }
        this.f87286a.post(new o6(this, i15, 5));
        return true;
    }
}
