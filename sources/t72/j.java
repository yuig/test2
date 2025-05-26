package t72;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import so2.w;
import zm2.d0;

/* loaded from: classes4.dex */
public final class j implements dp2.a, gp2.e, hp2.b, up2.a {

    /* renamed from: a */
    public final /* synthetic */ int f116662a;

    /* renamed from: b */
    public Object f116663b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j() {
        this(8);
        this.f116662a = 8;
    }

    public static void g(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (j jVar : tq2.a.f119027b) {
            Object[] copyOf = Arrays.copyOf(args, args.length);
            jVar.getClass();
            g(copyOf);
        }
    }

    public static String h(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    public static void j(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (j jVar : tq2.a.f119027b) {
            Object[] copyOf = Arrays.copyOf(args, args.length);
            jVar.getClass();
            j(copyOf);
        }
    }

    public static void l(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (j jVar : tq2.a.f119027b) {
            Object[] copyOf = Arrays.copyOf(args, args.length);
            jVar.getClass();
            l(copyOf);
        }
    }

    public static String p(up2.b bVar) {
        j jVar = new j(14);
        bVar.a(jVar);
        return jVar.toString();
    }

    public static void q(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (j jVar : tq2.a.f119027b) {
            Object[] copyOf = Arrays.copyOf(args, args.length);
            jVar.getClass();
            q(copyOf);
        }
    }

    public static void r(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (j jVar : tq2.a.f119027b) {
            Object[] copyOf = Arrays.copyOf(args, args.length);
            jVar.getClass();
            r(copyOf);
        }
    }

    @Override // gp2.e
    public final void a(int i13, Runnable runnable) {
        ((gp2.h) ((gp2.f[]) this.f116663b)[i13]).d(runnable);
    }

    @Override // hp2.b
    public final FileChannel b() {
        if (((ParcelFileDescriptor) this.f116663b).getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) this.f116663b).getChannel();
        }
        ((ParcelFileDescriptor) this.f116663b).close();
        throw new IllegalArgumentException("Not a file: " + ((ParcelFileDescriptor) this.f116663b));
    }

    @Override // gp2.e
    public final boolean c() {
        return false;
    }

    public final void d(char c13) {
        try {
            ((Appendable) this.f116663b).append(c13);
        } catch (IOException e13) {
            throw new RuntimeException("Could not write description", e13);
        }
    }

    public final void e(String str) {
        try {
            ((Appendable) this.f116663b).append(str);
        } catch (IOException e13) {
            throw new RuntimeException("Could not write description", e13);
        }
    }

    public final j f(up2.b bVar) {
        bVar.a(this);
        return this;
    }

    public final void i(zm2.g gVar) {
        if (!gVar.i()) {
            if (!(gVar instanceof d0)) {
                String valueOf = String.valueOf(gVar.getClass());
                throw new IllegalArgumentException(a.a.p(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
            d0 d0Var = (d0) gVar;
            i(d0Var.f142186c);
            i(d0Var.f142187d);
            return;
        }
        int size = gVar.size();
        int[] iArr = d0.f142184h;
        int binarySearch = Arrays.binarySearch(iArr, size);
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int i13 = iArr[binarySearch + 1];
        if (((Stack) this.f116663b).isEmpty() || ((zm2.g) ((Stack) this.f116663b).peek()).size() >= i13) {
            ((Stack) this.f116663b).push(gVar);
            return;
        }
        int i14 = iArr[binarySearch];
        zm2.g gVar2 = (zm2.g) ((Stack) this.f116663b).pop();
        while (!((Stack) this.f116663b).isEmpty() && ((zm2.g) ((Stack) this.f116663b).peek()).size() < i14) {
            gVar2 = new d0((zm2.g) ((Stack) this.f116663b).pop(), gVar2);
        }
        d0 d0Var2 = new d0(gVar2, gVar);
        while (!((Stack) this.f116663b).isEmpty()) {
            int[] iArr2 = d0.f142184h;
            int binarySearch2 = Arrays.binarySearch(iArr2, d0Var2.f142185b);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((zm2.g) ((Stack) this.f116663b).peek()).size() >= iArr2[binarySearch2 + 1]) {
                break;
            } else {
                d0Var2 = new d0((zm2.g) ((Stack) this.f116663b).pop(), d0Var2);
            }
        }
        ((Stack) this.f116663b).push(d0Var2);
    }

    public final String k(String str) {
        try {
            return new URL(((HttpURLConnection) this.f116663b).getURL().getProtocol(), ((HttpURLConnection) this.f116663b).getURL().getHost(), ((HttpURLConnection) this.f116663b).getURL().getPort(), str + "?" + ((HttpURLConnection) this.f116663b).getURL().getQuery()).toString();
        } catch (MalformedURLException unused) {
            return ((HttpURLConnection) this.f116663b).getURL().toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(r72.u1 r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t72.n
            if (r0 == 0) goto L13
            r0 = r7
            t72.n r0 = (t72.n) r0
            int r1 = r0.f116673t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116673t = r1
            goto L18
        L13:
            t72.n r0 = new t72.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f116671r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f116673t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L27
            goto L4d
        L27:
            r6 = move-exception
            goto L55
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ue.c.H(r7)
            java.lang.Object r7 = r5.f116663b     // Catch: java.lang.Throwable -> L27
            s72.c r7 = (s72.c) r7     // Catch: java.lang.Throwable -> L27
            r0.f116673t = r3     // Catch: java.lang.Throwable -> L27
            j72.s r7 = (j72.s) r7     // Catch: java.lang.Throwable -> L27
            n72.a r2 = r7.f74910c     // Catch: java.lang.Throwable -> L27
            ao2.f0 r2 = r2.f89706b     // Catch: java.lang.Throwable -> L27
            j72.l r3 = new j72.l     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r3.<init>(r7, r6, r4)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = kotlin.jvm.internal.j.M(r0, r2, r3)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r72.b1 r7 = (r72.b1) r7     // Catch: java.lang.Throwable -> L27
            n72.j r6 = new n72.j     // Catch: java.lang.Throwable -> L27
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L27
            goto L63
        L55:
            n72.i r7 = new n72.i
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L5f
            java.lang.String r0 = ""
        L5f:
            r7.<init>(r0, r6)
            r6 = r7
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.j.m(r72.u1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.String r6, r72.a r7, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof t72.i
            if (r0 == 0) goto L13
            r0 = r8
            t72.i r0 = (t72.i) r0
            int r1 = r0.f116661t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116661t = r1
            goto L18
        L13:
            t72.i r0 = new t72.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f116659r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f116661t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ue.c.H(r8)     // Catch: java.lang.Throwable -> L27
            goto L4b
        L27:
            r6 = move-exception
            goto L53
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ue.c.H(r8)
            java.lang.Object r8 = r5.f116663b     // Catch: java.lang.Throwable -> L27
            i72.i r8 = (i72.i) r8     // Catch: java.lang.Throwable -> L27
            r0.f116661t = r3     // Catch: java.lang.Throwable -> L27
            n72.a r2 = r8.f71701b     // Catch: java.lang.Throwable -> L27
            ao2.f0 r2 = r2.f89706b     // Catch: java.lang.Throwable -> L27
            i72.h r3 = new i72.h     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r3.<init>(r7, r8, r6, r4)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = kotlin.jvm.internal.j.M(r0, r2, r3)     // Catch: java.lang.Throwable -> L27
            if (r8 != r1) goto L4b
            return r1
        L4b:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L27
            n72.j r6 = new n72.j     // Catch: java.lang.Throwable -> L27
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L27
            goto L61
        L53:
            n72.i r7 = new n72.i
            java.lang.String r8 = r6.getMessage()
            if (r8 != 0) goto L5d
            java.lang.String r8 = ""
        L5d:
            r7.<init>(r8, r6)
            r6 = r7
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.j.n(java.lang.String, r72.a, bl2.c):java.lang.Object");
    }

    public final void o(char c13) {
        if (c13 == '\t') {
            e("\\t");
            return;
        }
        if (c13 == '\n') {
            e("\\n");
            return;
        }
        if (c13 == '\r') {
            e("\\r");
        } else if (c13 != '\"') {
            d(c13);
        } else {
            e("\\\"");
        }
    }

    public final String toString() {
        switch (this.f116662a) {
            case 14:
                return ((Appendable) this.f116663b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(int i13) {
        this(new StringBuilder());
        this.f116662a = i13;
        if (i13 == 8) {
            this.f116663b = new Stack();
            return;
        }
        if (i13 != 11) {
            if (i13 == 14) {
                return;
            } else if (i13 != 16) {
                this.f116663b = new ae2.g();
                return;
            } else {
                this.f116663b = new ThreadLocal();
                return;
            }
        }
        this.f116663b = new gp2.f[6];
        for (int i14 = 0; i14 < 6; i14++) {
            gp2.f[] fVarArr = (gp2.f[]) this.f116663b;
            gp2.h hVar = new gp2.h(i14, 0, "TaskRunnerImpl");
            gp2.h.a();
            fVarArr[i14] = hVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj) {
        this(16);
        this.f116662a = 16;
    }

    public /* synthetic */ j(Object obj, int i13) {
        this.f116662a = i13;
        this.f116663b = obj;
    }

    public /* synthetic */ j(pk2.f fVar) {
        this.f116662a = 5;
    }

    public j(i72.i shuffleAssetRepository) {
        this.f116662a = 0;
        Intrinsics.checkNotNullParameter(shuffleAssetRepository, "shuffleAssetRepository");
        this.f116663b = shuffleAssetRepository;
    }

    public j(s72.c shuffleItemAssetRepository) {
        this.f116662a = 1;
        Intrinsics.checkNotNullParameter(shuffleItemAssetRepository, "shuffleItemAssetRepository");
        this.f116663b = shuffleItemAssetRepository;
    }

    public j(e12.e myUserService) {
        this.f116662a = 2;
        Intrinsics.checkNotNullParameter(myUserService, "myUserService");
        this.f116663b = myUserService;
    }

    public j(StringBuilder sb3) {
        this.f116662a = 14;
        this.f116663b = sb3;
    }

    public j(w block) {
        this.f116662a = 7;
        Intrinsics.checkNotNullParameter(block, "block");
        this.f116663b = block;
    }
}
