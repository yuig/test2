package x52;

import a.cb;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import ao2.j0;
import ao2.k2;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f133891a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f133892b;

    /* renamed from: c, reason: collision with root package name */
    public final w f133893c;

    /* renamed from: d, reason: collision with root package name */
    public final ny1.w f133894d;

    /* renamed from: e, reason: collision with root package name */
    public final uk2.f f133895e;

    /* renamed from: f, reason: collision with root package name */
    public xj2.b f133896f;

    /* renamed from: g, reason: collision with root package name */
    public an0.g f133897g;

    /* renamed from: h, reason: collision with root package name */
    public String f133898h;

    /* renamed from: i, reason: collision with root package name */
    public k2 f133899i;

    /* renamed from: j, reason: collision with root package name */
    public k2 f133900j;

    /* renamed from: k, reason: collision with root package name */
    public Function0 f133901k;

    /* renamed from: l, reason: collision with root package name */
    public final e f133902l;

    public n(Context context, j0 applicationScope, w eventManager, ny1.w permissionsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(permissionsManager, "permissionsManager");
        this.f133891a = context;
        this.f133892b = applicationScope;
        this.f133893c = eventManager;
        this.f133894d = permissionsManager;
        this.f133895e = cb.r("create(...)");
        this.f133896f = new xj2.b();
        this.f133902l = new e(this);
    }

    public static final void a(n nVar, Throwable th3, Function1 function1) {
        nVar.getClass();
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.PRODUCT;
        StringBuilder w13 = a.a.w("BoardSharePipeline, Manufacturer: ", str, ", model:", str2, ", product:");
        w13.append(str3);
        hVar.q(th3, w13.toString(), tb0.p.BOARD_INVITE);
        u.f85943a.d(new jc0.s());
        function1.invoke(th3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0084 -> B:10:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(x52.n r10, an0.g r11, bl2.c r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof x52.g
            if (r0 == 0) goto L16
            r0 = r12
            x52.g r0 = (x52.g) r0
            int r1 = r0.f133855z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f133855z = r1
            goto L1b
        L16:
            x52.g r0 = new x52.g
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f133853x
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f133855z
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            r72.z1 r10 = r0.f133852w
            java.util.Iterator r11 = r0.f133851v
            ke2.c r2 = r0.f133850u
            ke2.c r4 = r0.f133849t
            an0.k r5 = r0.f133848s
            an0.g r6 = r0.f133847r
            ue.c.H(r12)
            goto L88
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            ue.c.H(r12)
            an0.k r12 = new an0.k
            android.content.Context r10 = r10.f133891a
            r12.<init>(r10, r11)
            ke2.c r10 = new ke2.c
            r10.<init>()
            java.util.List r2 = r11.f15663k
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = r10
            r5 = r12
            r10 = r11
            r11 = r2
            r2 = r4
        L5a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L99
            java.lang.Object r12 = r11.next()
            r72.z1 r12 = (r72.z1) r12
            android.util.Size r6 = new android.util.Size
            int r7 = r10.f15656d
            int r8 = r10.f15657e
            r6.<init>(r7, r8)
            r0.f133847r = r10
            r0.f133848s = r5
            r0.f133849t = r4
            r0.f133850u = r2
            r0.f133851v = r11
            r0.f133852w = r12
            r0.f133855z = r3
            java.lang.Object r6 = kh2.k3.z1(r12, r6, r5, r0)
            if (r6 != r1) goto L84
            goto L9a
        L84:
            r9 = r6
            r6 = r10
            r10 = r12
            r12 = r9
        L88:
            ke2.d r12 = (ke2.d) r12
            android.util.SparseArray r7 = r12.f79321c
            r8 = 2147483647(0x7fffffff, float:NaN)
            r7.put(r8, r10)
            java.util.concurrent.CopyOnWriteArrayList r10 = r2.f79314f
            r10.add(r12)
            r10 = r6
            goto L5a
        L99:
            r1 = r4
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x52.n.b(x52.n, an0.g, bl2.c):java.lang.Object");
    }

    public final void c() {
        k2 k2Var = this.f133899i;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        k2 k2Var2 = this.f133900j;
        if (k2Var2 != null) {
            k2Var2.cancel((CancellationException) null);
        }
        File d2 = d();
        if (d2.exists()) {
            d2.delete();
        }
    }

    public final File d() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
        return new File(a.a.D(externalStoragePublicDirectory.getPath(), "/", this.f133898h));
    }
}
