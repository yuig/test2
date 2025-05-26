package tb;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatTextView;
import ja.d0;
import ja.f0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import pd.k0;

/* loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.data.d, kk.o, dk2.h {

    /* renamed from: a, reason: collision with root package name */
    public Object f116963a;

    /* renamed from: b, reason: collision with root package name */
    public Object f116964b;

    public e(int i13) {
        if (i13 == 6) {
            this.f116963a = new he.k(1000L);
            this.f116964b = ie.d.a(10, new rd.j(this, 1));
            return;
        }
        if (i13 != 9) {
            if (i13 != 15) {
                this.f116963a = new ByteArrayOutputStream(BitmapUtils.BITMAP_TO_JPEG_SIZE);
                this.f116964b = new DataOutputStream((ByteArrayOutputStream) this.f116963a);
                return;
            }
            this.f116963a = new AtomicReference();
            this.f116964b = new AtomicReference();
            lk2.a aVar = new lk2.a();
            ((AtomicReference) this.f116964b).lazySet(aVar);
        }
    }

    public static String n(Context context) {
        try {
            return context.getResources().getResourcePackageName(ih.h.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final com.google.android.gms.common.api.e a() {
        if (((com.facebook.login.z) this.f116963a) == null) {
            this.f116963a = new com.facebook.login.z(1);
        }
        if (((Looper) this.f116964b) == null) {
            this.f116964b = Looper.getMainLooper();
        }
        return new com.google.android.gms.common.api.e((com.facebook.login.z) this.f116963a, (Looper) this.f116964b);
    }

    public final byte[] b(a9.a aVar) {
        ((ByteArrayOutputStream) this.f116963a).reset();
        try {
            DataOutputStream dataOutputStream = (DataOutputStream) this.f116964b;
            dataOutputStream.writeBytes(aVar.f1560a);
            dataOutputStream.writeByte(0);
            String str = aVar.f1561b;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = (DataOutputStream) this.f116964b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            ((DataOutputStream) this.f116964b).writeLong(aVar.f1562c);
            ((DataOutputStream) this.f116964b).writeLong(aVar.f1563d);
            ((DataOutputStream) this.f116964b).write(aVar.f1564e);
            ((DataOutputStream) this.f116964b).flush();
            return ((ByteArrayOutputStream) this.f116963a).toByteArray();
        } catch (IOException e13) {
            throw new RuntimeException(e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.cct.CctBackendFactory c(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e.c(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // dk2.i
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Exception exc) {
        k0 k0Var = (k0) this.f116964b;
        td.b0 b0Var = (td.b0) this.f116963a;
        td.b0 b0Var2 = k0Var.f99707f;
        if (b0Var2 == null || b0Var2 != b0Var) {
            return;
        }
        k0 k0Var2 = (k0) this.f116964b;
        td.b0 b0Var3 = (td.b0) this.f116963a;
        pd.g gVar = k0Var2.f99703b;
        pd.f fVar = k0Var2.f99708g;
        com.bumptech.glide.load.data.e eVar = b0Var3.f117374c;
        gVar.a(fVar, exc, eVar, eVar.c());
    }

    public final Long e(String str) {
        f0 d2 = f0.d(1, "SELECT long_value FROM Preference where `key`=?");
        d2.c1(1, str);
        ((d0) this.f116963a).b();
        Cursor m03 = d7.b.m0((d0) this.f116963a, d2, false);
        try {
            Long l13 = null;
            if (m03.moveToFirst() && !m03.isNull(0)) {
                l13 = Long.valueOf(m03.getLong(0));
            }
            return l13;
        } finally {
            m03.close();
            d2.e();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        k0 k0Var = (k0) this.f116964b;
        td.b0 b0Var = (td.b0) this.f116963a;
        td.b0 b0Var2 = k0Var.f99707f;
        if (b0Var2 == null || b0Var2 != b0Var) {
            return;
        }
        k0 k0Var2 = (k0) this.f116964b;
        td.b0 b0Var3 = (td.b0) this.f116963a;
        pd.r rVar = k0Var2.f99702a.f99687p;
        if (obj != null && rVar.a(b0Var3.f117374c.c())) {
            k0Var2.f99706e = obj;
            k0Var2.f99703b.d();
        } else {
            pd.g gVar = k0Var2.f99703b;
            nd.h hVar = b0Var3.f117372a;
            com.bumptech.glide.load.data.e eVar = b0Var3.f117374c;
            gVar.c(hVar, obj, eVar, eVar.c(), k0Var2.f99708g);
        }
    }

    public final String g(nd.h hVar) {
        String str;
        synchronized (((he.k) this.f116963a)) {
            str = (String) ((he.k) this.f116963a).a(hVar);
        }
        if (str == null) {
            Object b13 = ((p5.d) this.f116964b).b();
            d7.b.p(b13, "Argument must not be null");
            rd.l lVar = (rd.l) b13;
            try {
                hVar.a(lVar.f107511a);
                byte[] digest = lVar.f107511a.digest();
                char[] cArr = he.n.f68960b;
                synchronized (cArr) {
                    for (int i13 = 0; i13 < digest.length; i13++) {
                        byte b14 = digest[i13];
                        int i14 = i13 * 2;
                        char[] cArr2 = he.n.f68959a;
                        cArr[i14] = cArr2[(b14 & 255) >>> 4];
                        cArr[i14 + 1] = cArr2[b14 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((p5.d) this.f116964b).a(lVar);
            }
        }
        synchronized (((he.k) this.f116963a)) {
            ((he.k) this.f116963a).d(hVar, str);
        }
        return str;
    }

    public final void h(d dVar) {
        ((d0) this.f116963a).b();
        ((d0) this.f116963a).c();
        try {
            ((ja.i) this.f116964b).n(dVar);
            ((d0) this.f116963a).r();
        } finally {
            ((d0) this.f116963a).m();
        }
    }

    public final byte[] i(int i13) {
        Object obj = this.f116964b;
        return ((qd.i) obj) == null ? new byte[i13] : (byte[]) ((qd.i) obj).c(i13, byte[].class);
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return ((lk2.a) ((AtomicReference) this.f116964b).get()) == ((lk2.a) ((AtomicReference) this.f116963a).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0129, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11 != null ? r11.k() : null, r12.k()) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(rn1.e r11, rn1.e r12, gm1.a r13) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e.j(rn1.e, rn1.e, gm1.a):void");
    }

    public final am2.g k(pm2.g javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        gm2.q javaClass2 = (gm2.q) javaClass;
        ym2.c c13 = javaClass2.c();
        if (c13 != null && pm2.s.SOURCE == null) {
            ((re2.f) ((jm2.j) this.f116964b)).getClass();
            return null;
        }
        Class<?> declaringClass = javaClass2.f65786a.getDeclaringClass();
        gm2.q qVar = declaringClass != null ? new gm2.q(declaringClass) : null;
        if (qVar != null) {
            am2.g k13 = k(qVar);
            in2.n I = k13 != null ? k13.I() : null;
            am2.j e13 = I != null ? I.e(javaClass2.e(), hm2.e.FROM_JAVA_LOADER) : null;
            if (e13 instanceof am2.g) {
                return (am2.g) e13;
            }
            return null;
        }
        if (c13 == null) {
            return null;
        }
        lm2.e eVar = (lm2.e) this.f116963a;
        ym2.c e14 = c13.e();
        Intrinsics.checkNotNullExpressionValue(e14, "parent(...)");
        mm2.r rVar = (mm2.r) CollectionsKt.firstOrNull(eVar.c(e14));
        if (rVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(javaClass2, "jClass");
        mm2.w wVar = rVar.f87726j.f87657d;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(javaClass2, "javaClass");
        return wVar.w(javaClass2.e(), javaClass2);
    }

    public final BitmapDrawable l(rm1.d dVar, Context context) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int b13 = dVar.f108695a.b(context);
        int N = kg.t.N(dVar);
        Drawable f03 = bs1.c.f0((AppCompatTextView) this.f116963a, b13, null, null, 6);
        f03.setTint(dl2.b.y0((AppCompatTextView) this.f116963a, dVar.f108696b.getColorAttrRes()));
        Resources resources = ((AppCompatTextView) this.f116963a).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return d7.b.p0(f03, resources, dl2.b.G0((AppCompatTextView) this.f116963a, N), dl2.b.G0((AppCompatTextView) this.f116963a, N));
    }

    public final void m(boolean z13, boolean z14) {
        if (z13 && ((WifiManager.WifiLock) this.f116964b) == null) {
            WifiManager wifiManager = (WifiManager) ((Context) this.f116963a).getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                d7.u.g("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f116964b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        Object obj = this.f116964b;
        if (((WifiManager.WifiLock) obj) == null) {
            return;
        }
        if (z13 && z14) {
            ((WifiManager.WifiLock) obj).acquire();
        } else {
            ((WifiManager.WifiLock) obj).release();
        }
    }

    @Override // dk2.i
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        lk2.a aVar = new lk2.a();
        aVar.f83650a = obj;
        ((lk2.a) ((AtomicReference) this.f116963a).getAndSet(aVar)).lazySet(aVar);
        return true;
    }

    @Override // dk2.i
    public final Object poll() {
        lk2.a aVar;
        lk2.a aVar2 = (lk2.a) ((AtomicReference) this.f116964b).get();
        lk2.a aVar3 = (lk2.a) aVar2.get();
        if (aVar3 != null) {
            Object obj = aVar3.f83650a;
            aVar3.f83650a = null;
            ((AtomicReference) this.f116964b).lazySet(aVar3);
            return obj;
        }
        if (aVar2 == ((lk2.a) ((AtomicReference) this.f116963a).get())) {
            return null;
        }
        do {
            aVar = (lk2.a) aVar2.get();
        } while (aVar == null);
        Object obj2 = aVar.f83650a;
        aVar.f83650a = null;
        ((AtomicReference) this.f116964b).lazySet(aVar);
        return obj2;
    }

    @Override // kk.o
    public final Object zza() {
        jk.q qVar = (jk.q) ((kk.o) this.f116964b).zza();
        if (qVar != null) {
            return qVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public e(AppCompatTextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.f116963a = textView;
    }

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f116963a = obj;
        this.f116964b = obj2;
    }

    public e(Animation animation) {
        this.f116963a = animation;
        this.f116964b = null;
    }

    public e(Animator animator) {
        this.f116963a = null;
        this.f116964b = animator;
    }
}
