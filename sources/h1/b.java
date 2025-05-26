package h1;

import android.app.Activity;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.TextView;
import android.window.SplashScreenView;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.n1;
import androidx.datastore.preferences.protobuf.q;
import androidx.profileinstaller.ProfileInstallReceiver;
import bk.f;
import c3.e;
import d7.n0;
import d7.u;
import g1.p;
import ih.g;
import j8.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m7.s;
import n3.d0;
import n3.r;
import n3.t;
import o7.h;
import o7.h0;
import pd.o;
import pd.w;
import pd.x;
import pd.z;
import q5.a0;
import q5.p1;
import q5.q1;
import q5.r1;
import t3.c0;
import w7.c;

/* loaded from: classes.dex */
public class b implements c, d, ha.d, ie.a {

    /* renamed from: a */
    public final /* synthetic */ int f66448a;

    /* renamed from: b */
    public Object f66449b;

    public b(int i13) {
        this.f66448a = i13;
        if (i13 == 3) {
            this.f66449b = new float[64];
            return;
        }
        Object obj = null;
        if (i13 == 4) {
            this.f66449b = new p(obj);
            return;
        }
        int i14 = 9;
        if (i13 == 9) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
                this.f66449b = new r1();
                return;
            } else if (i15 >= 29) {
                this.f66449b = new q1();
                return;
            } else {
                this.f66449b = new p1();
                return;
            }
        }
        if (i13 == 15) {
            int i16 = n0.f53866a;
            if (i16 >= 35) {
                this.f66449b = new s();
                return;
            } else if (i16 >= 23) {
                this.f66449b = new f0();
                return;
            } else {
                this.f66449b = null;
                return;
            }
        }
        if (i13 == 19) {
            this.f66449b = new e(i14);
            return;
        }
        if (i13 == 26) {
            this.f66449b = new ReentrantReadWriteLock();
            return;
        }
        if (i13 == 21) {
            this.f66449b = new f();
        } else if (i13 != 22) {
            this.f66449b = new b3.d();
        } else {
            this.f66449b = new CopyOnWriteArrayList();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x015e, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(h1.b r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b.f(h1.b, java.lang.String):java.util.ArrayList");
    }

    public final void A(int i13, int i14) {
        ((q) this.f66449b).j0(i13, (i14 >> 31) ^ (i14 << 1));
    }

    public final void B(int i13, long j13) {
        ((q) this.f66449b).l0(i13, (j13 >> 63) ^ (j13 << 1));
    }

    public final void C(int i13, int i14) {
        ((q) this.f66449b).j0(i13, i14);
    }

    public final void D(int i13, long j13) {
        ((q) this.f66449b).l0(i13, j13);
    }

    public final void a(final int i13, final long j13, final long j14) {
        Iterator it = ((CopyOnWriteArrayList) this.f66449b).iterator();
        while (it.hasNext()) {
            final l8.c cVar = (l8.c) it.next();
            if (!cVar.f82005c) {
                cVar.f82003a.post(new Runnable() { // from class: l8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.f82004b.c(i13, j13, j14);
                    }
                });
            }
        }
    }

    public final b3.d b() {
        return (b3.d) this.f66449b;
    }

    @Override // ha.d
    public final void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // ie.a
    public final Object create() {
        switch (this.f66448a) {
            case 28:
                e5.d dVar = (e5.d) this.f66449b;
                return new o((g) dVar.f57216c, (p5.d) dVar.f57217d);
            default:
                pd.s sVar = (pd.s) this.f66449b;
                return new w((sd.d) sVar.f99747a, (sd.d) sVar.f99748b, (sd.d) sVar.f99749c, (sd.d) sVar.f99750d, (x) sVar.f99751e, (z) sVar.f99752f, (p5.d) sVar.f99753g);
        }
    }

    public final Set d() {
        Set entrySet = ((LinkedHashMap) this.f66449b).entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "map.entries");
        return entrySet;
    }

    public final void e(Exception exc) {
        u.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        qq2.c cVar = ((h0) this.f66449b).F0;
        Handler handler = (Handler) cVar.f104883b;
        if (handler != null) {
            handler.post(new h(cVar, exc, 1));
        }
    }

    public final n3.e g(n3.s sVar, d0 d0Var) {
        boolean z13;
        long j13;
        long j14;
        List list;
        int i13;
        List list2 = sVar.f89123a;
        p pVar = new p(list2.size());
        int size = list2.size();
        int i14 = 0;
        while (i14 < size) {
            t tVar = (t) list2.get(i14);
            r rVar = (r) ((p) this.f66449b).c(tVar.f89125a);
            if (rVar == null) {
                j14 = tVar.f89126b;
                j13 = tVar.f89128d;
                z13 = false;
            } else {
                long G = ((c0) d0Var).G(rVar.f89121b);
                long j15 = rVar.f89120a;
                z13 = rVar.f89122c;
                j13 = G;
                j14 = j15;
            }
            long j16 = tVar.f89134j;
            long j17 = tVar.f89135k;
            long j18 = tVar.f89125a;
            pVar.j(j18, new n3.q(j18, tVar.f89126b, tVar.f89128d, tVar.f89129e, tVar.f89130f, j14, j13, z13, tVar.f89131g, tVar.f89133i, j16, j17));
            long j19 = tVar.f89125a;
            boolean z14 = tVar.f89129e;
            if (z14) {
                i13 = i14;
                list = list2;
                ((p) this.f66449b).j(j19, new r(tVar.f89126b, tVar.f89127c, z14));
            } else {
                list = list2;
                i13 = i14;
                ((p) this.f66449b).k(j19);
            }
            i14 = i13 + 1;
            list2 = list;
        }
        return new n3.e(pVar, sVar);
    }

    public final Object h(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return ((LinkedHashMap) this.f66449b).put(key, value);
    }

    @Override // ha.d
    public final void i(int i13, Object obj) {
        String str;
        switch (i13) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i13 == 6 || i13 == 7 || i13 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f66449b).setResultCode(i13);
    }

    public final Object j(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((LinkedHashMap) this.f66449b).remove(key);
    }

    public final void k(l8.d dVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f66449b).iterator();
        while (it.hasNext()) {
            l8.c cVar = (l8.c) it.next();
            if (cVar.f82004b == dVar) {
                cVar.f82005c = true;
                ((CopyOnWriteArrayList) this.f66449b).remove(cVar);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r6 >= 26) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r6 >= 34) goto L98;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(androidx.media3.common.b r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f18765o
            r1 = 0
            if (r0 == 0) goto L84
            boolean r0 = a7.o0.o(r0)
            if (r0 != 0) goto Ld
            goto L84
        Ld:
            int r0 = d7.n0.f53866a
            java.lang.String r6 = r6.f18765o
            r6.getClass()
            int r0 = r6.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r1
        L6b:
            int r6 = d7.n0.f53866a
            switch(r4) {
                case 0: goto L76;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L70;
            }
        L70:
            goto L7f
        L71:
            r0 = 26
            if (r6 < r0) goto L7f
            goto L7a
        L76:
            r0 = 34
            if (r6 < r0) goto L7f
        L7a:
            int r6 = m7.h.f(r2, r1, r1, r1)
            goto L83
        L7f:
            int r6 = m7.h.f(r3, r1, r1, r1)
        L83:
            return r6
        L84:
            int r6 = m7.h.f(r1, r1, r1, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b.l(androidx.media3.common.b):int");
    }

    public final Object m(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f66449b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i13 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i14 = 0; i14 < readHoldCount; i14++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return block.invoke();
        } finally {
            while (i13 < readHoldCount) {
                readLock.lock();
                i13++;
            }
            writeLock.unlock();
        }
    }

    public final void n(int i13, boolean z13) {
        ((q) this.f66449b).K(i13, z13);
    }

    public final void o(int i13, i iVar) {
        ((q) this.f66449b).O(i13, iVar);
    }

    public final void p(int i13, double d2) {
        q qVar = (q) this.f66449b;
        qVar.getClass();
        qVar.U(i13, Double.doubleToRawLongBits(d2));
    }

    public final void q(int i13, int i14) {
        ((q) this.f66449b).X(i13, i14);
    }

    public final void r(int i13, int i14) {
        ((q) this.f66449b).S(i13, i14);
    }

    public final void s(int i13, long j13) {
        ((q) this.f66449b).U(i13, j13);
    }

    public final void t(int i13, float f13) {
        q qVar = (q) this.f66449b;
        qVar.getClass();
        qVar.S(i13, Float.floatToRawIntBits(f13));
    }

    public final void u(int i13, n1 n1Var, Object obj) {
        q qVar = (q) this.f66449b;
        qVar.i0(i13, 3);
        n1Var.i((androidx.datastore.preferences.protobuf.b) obj, qVar.f18131c);
        qVar.i0(i13, 4);
    }

    public final void v(int i13, int i14) {
        ((q) this.f66449b).X(i13, i14);
    }

    public final void w(int i13, long j13) {
        ((q) this.f66449b).l0(i13, j13);
    }

    public final void x(int i13, n1 n1Var, Object obj) {
        ((q) this.f66449b).a0(i13, (androidx.datastore.preferences.protobuf.b) obj, n1Var);
    }

    public final void y(int i13, int i14) {
        ((q) this.f66449b).S(i13, i14);
    }

    public final void z(int i13, long j13) {
        ((q) this.f66449b).U(i13, j13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(a7.f fVar, int i13) {
        this(fVar);
        this.f66448a = 14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(SplashScreenView platformView, Activity ctx) {
        this(ctx);
        this.f66448a = 6;
        Intrinsics.checkNotNullParameter(platformView, "platformView");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        n5.p pVar = (n5.p) ((n5.q) this.f66449b);
        pVar.getClass();
        Intrinsics.checkNotNullParameter(platformView, "<set-?>");
        pVar.f89243c = platformView;
    }

    public /* synthetic */ b(Object obj, int i13) {
        this.f66448a = i13;
        this.f66449b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(h0 h0Var) {
        this(h0Var, 18);
        this.f66448a = 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(x7.p pVar) {
        this(pVar, 20);
        this.f66448a = 20;
    }

    public b() {
        this.f66448a = 0;
        this.f66449b = new LinkedHashMap(0, 0.75f, true);
    }

    public b(Activity activity) {
        n5.q qVar;
        this.f66448a = 6;
        Intrinsics.checkNotNullParameter(activity, "ctx");
        if (Build.VERSION.SDK_INT >= 31) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            qVar = new n5.p(activity);
        } else {
            qVar = new n5.q(activity);
        }
        qVar.a();
        this.f66449b = qVar;
    }

    public b(a7.f fVar) {
        this.f66448a = 14;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(fVar.f988a).setFlags(fVar.f989b).setUsage(fVar.f990c);
        int i13 = n0.f53866a;
        if (i13 >= 29) {
            usage.setAllowedCapturePolicy(fVar.f991d);
        }
        if (i13 >= 32) {
            usage.setSpatializationBehavior(fVar.f992e);
        }
        this.f66449b = usage.build();
    }

    public b(View view) {
        this.f66448a = 8;
        if (Build.VERSION.SDK_INT >= 30) {
            q5.c0 c0Var = new q5.c0(view);
            c0Var.f102411d = view;
            this.f66449b = c0Var;
            return;
        }
        this.f66449b = new a0(view);
    }

    public b(q qVar) {
        this.f66448a = 10;
        j0.a(qVar, "output");
        this.f66449b = qVar;
        qVar.f18131c = this;
    }

    public b(WindowInsetsController windowInsetsController) {
        this.f66448a = 8;
        q5.c0 c0Var = new q5.c0(null);
        c0Var.f102412e = windowInsetsController;
        this.f66449b = c0Var;
    }

    public b(TextView textView) {
        this.f66448a = 13;
        com.bumptech.glide.d.s(textView, "textView cannot be null");
        this.f66449b = new j6.i(textView);
    }
}
