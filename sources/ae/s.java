package ae;

import a7.o0;
import am2.c1;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.x;
import d7.n0;
import ja.c0;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import ok.g0;
import pn2.b1;

/* loaded from: classes.dex */
public final class s implements x7.k, qn2.c {

    /* renamed from: e, reason: collision with root package name */
    public static volatile s f15030e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15031a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15032b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15033c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15034d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(final int r4) {
        /*
            r3 = this;
            r0 = 1
            r3.f15031a = r0
            x7.b r1 = new x7.b
            r2 = 0
            r1.<init>()
            x7.b r2 = new x7.b
            r2.<init>()
            r3.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.s.<init>(int):void");
    }

    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + k3.L("r8-abstract-class");
    }

    public static s e(Context context) {
        if (f15030e == null) {
            synchronized (s.class) {
                try {
                    if (f15030e == null) {
                        f15030e = new s(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f15030e;
    }

    @Override // qn2.c
    public final boolean a(b1 c13, b1 c23) {
        boolean z13 = this.f15032b;
        am2.b a13 = (am2.b) this.f15033c;
        am2.b b13 = (am2.b) this.f15034d;
        Intrinsics.checkNotNullParameter(a13, "$a");
        Intrinsics.checkNotNullParameter(b13, "$b");
        Intrinsics.checkNotNullParameter(c13, "c1");
        Intrinsics.checkNotNullParameter(c23, "c2");
        if (Intrinsics.d(c13, c23)) {
            return true;
        }
        am2.j b14 = c13.b();
        am2.j b15 = c23.b();
        if ((b14 instanceof c1) && (b15 instanceof c1)) {
            return bn2.c.f23578a.b((c1) b14, (c1) b15, z13, new jq1.l(3, a13, b13));
        }
        return false;
    }

    public final boolean c(de.c cVar) {
        boolean z13 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f15034d).remove(cVar);
        if (!((Set) this.f15033c).remove(cVar) && !remove) {
            z13 = false;
        }
        if (z13) {
            cVar.clear();
        }
        return z13;
    }

    @Override // x7.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final x7.c i(x xVar) {
        MediaCodec mediaCodec;
        x7.m eVar;
        int i13;
        x7.c cVar;
        Object obj;
        String str = ((x7.n) xVar.f16708a).f134049a;
        x7.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                try {
                    if (this.f15032b) {
                        androidx.media3.common.b bVar = (androidx.media3.common.b) xVar.f16710c;
                        int i14 = n0.f53866a;
                        if (i14 >= 34 && (i14 >= 35 || o0.q(bVar.f18765o))) {
                            eVar = new t5.e(mediaCodec, 10);
                            i13 = 4;
                            cVar = new x7.c(mediaCodec, (HandlerThread) ((g0) this.f15033c).get(), eVar, (x7.j) xVar.f16713f);
                            Trace.endSection();
                            obj = xVar.f16711d;
                            if (((Surface) obj) == null && ((x7.n) xVar.f16708a).f134058j && n0.f53866a >= 35) {
                                i13 |= 8;
                            }
                            x7.c.q(cVar, (MediaFormat) xVar.f16709b, (Surface) obj, (MediaCrypto) xVar.f16712e, i13);
                            return cVar;
                        }
                    }
                    Trace.endSection();
                    obj = xVar.f16711d;
                    if (((Surface) obj) == null) {
                        i13 |= 8;
                    }
                    x7.c.q(cVar, (MediaFormat) xVar.f16709b, (Surface) obj, (MediaCrypto) xVar.f16712e, i13);
                    return cVar;
                } catch (Exception e13) {
                    e = e13;
                    cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.a();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
                eVar = new x7.e(mediaCodec, (HandlerThread) ((g0) this.f15034d).get());
                i13 = 0;
                cVar = new x7.c(mediaCodec, (HandlerThread) ((g0) this.f15033c).get(), eVar, (x7.j) xVar.f16713f);
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Exception e15) {
            e = e15;
            mediaCodec = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pm.p f(com.google.gson.reflect.TypeToken r10) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.s.f(com.google.gson.reflect.TypeToken):pm.p");
    }

    public final void g() {
        if (this.f15032b || ((Set) this.f15034d).isEmpty()) {
            return;
        }
        m7.c cVar = (m7.c) ((p) this.f15033c);
        boolean z13 = false;
        cVar.f86115b = ((ConnectivityManager) ((he.h) cVar.f86117d).get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) ((he.h) cVar.f86117d).get()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) cVar.f86118e);
            z13 = true;
        } catch (RuntimeException e13) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e13);
            }
        }
        this.f15032b = z13;
    }

    public final void h() {
        if (this.f15032b && ((Set) this.f15034d).isEmpty()) {
            m7.c cVar = (m7.c) ((p) this.f15033c);
            ((ConnectivityManager) ((he.h) cVar.f86117d).get()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) cVar.f86118e);
            this.f15032b = false;
        }
    }

    public final pc.b j() {
        pc.b bVar = new pc.b();
        bVar.f99512a = (c0) this.f15033c;
        bVar.f99513b = (Set) this.f15034d;
        bVar.f99514c = Boolean.valueOf(this.f15032b);
        return bVar;
    }

    public final void k() {
        Iterator it = he.n.e((Set) this.f15034d).iterator();
        while (it.hasNext()) {
            de.c cVar = (de.c) it.next();
            if (!cVar.i() && !cVar.h()) {
                cVar.clear();
                if (this.f15032b) {
                    ((Set) this.f15033c).add(cVar);
                } else {
                    cVar.j();
                }
            }
        }
    }

    public final void l() {
        this.f15032b = false;
        Iterator it = he.n.e((Set) this.f15034d).iterator();
        while (it.hasNext()) {
            de.c cVar = (de.c) it.next();
            if (!cVar.i() && !cVar.isRunning()) {
                cVar.j();
            }
        }
        ((Set) this.f15033c).clear();
    }

    public final String toString() {
        switch (this.f15031a) {
            case 3:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(super.toString());
                sb3.append("{numRequests=");
                sb3.append(((Set) this.f15034d).size());
                sb3.append(", isPaused=");
                return a.a.r(sb3, this.f15032b, "}");
            case 4:
                return ((Map) this.f15033c).toString();
            default:
                return super.toString();
        }
    }

    public s(am2.b bVar, am2.b bVar2, boolean z13) {
        this.f15031a = 5;
        this.f15032b = z13;
        this.f15033c = bVar;
        this.f15034d = bVar2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(c0 c0Var, Set set, boolean z13, int i13) {
        this(c0Var, set, z13);
        this.f15031a = 2;
    }

    public s(c0 c0Var, Set set, boolean z13) {
        this.f15031a = 2;
        this.f15033c = c0Var;
        this.f15034d = set;
        this.f15032b = z13;
    }

    public s() {
        this.f15031a = 3;
        this.f15034d = Collections.newSetFromMap(new WeakHashMap());
        this.f15033c = new HashSet();
    }

    public s(Map map, boolean z13, List list) {
        this.f15031a = 4;
        this.f15033c = map;
        this.f15032b = z13;
        this.f15034d = list;
    }

    public s(Context context) {
        this.f15031a = 0;
        this.f15034d = new HashSet();
        this.f15033c = new m7.c(new ih.g(new k(this, context)), new o(this));
    }

    public s(g0 g0Var, g0 g0Var2) {
        this.f15031a = 1;
        this.f15033c = g0Var;
        this.f15034d = g0Var2;
        this.f15032b = false;
    }
}
