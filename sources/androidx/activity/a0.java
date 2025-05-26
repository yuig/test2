package androidx.activity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g1;
import androidx.lifecycle.u1;
import androidx.recyclerview.widget.c3;
import androidx.work.Worker;
import b3.u0;
import com.pinterest.activity.PinterestActivity;
import com.pinterest.ui.tabs.TabBarPlaceholderLoadingLayout;
import i1.x1;
import i2.c1;
import i2.d1;
import i2.h2;
import i2.o2;
import i2.p1;
import i2.y1;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;
import m1.g2;
import q3.n1;
import s3.q0;
import s3.q1;
import s3.s0;
import s3.t0;
import s3.v0;
import t3.f2;
import t3.l1;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15871i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f15872j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, int i13) {
        super(0);
        this.f15871i = i13;
        this.f15872j = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5invoke() {
        ao2.m x13;
        boolean z13;
        Object[] objArr;
        a0 a0Var = this;
        char c13 = 7;
        int i13 = 0;
        boolean z14 = true;
        switch (a0Var.f15871i) {
            case 0:
                ((i0) a0Var.f15872j).b();
                return;
            case 1:
                ((j1.o) a0Var.f15872j).f74173f = false;
                return;
            case 2:
                g2 g2Var = (g2) a0Var.f15872j;
                g2Var.B.f85522a = new j1.a0(new x1((n4.b) com.bumptech.glide.c.w(g2Var, f2.f115983f)));
                return;
            case 3:
            case 5:
            case 8:
            case 9:
            default:
                ((l1) a0Var.f15872j).f116070b = null;
                return;
            case 4:
                o2 o2Var = (o2) a0Var.f15872j;
                synchronized (o2Var.f71209b) {
                    x13 = o2Var.x();
                    if (((h2) o2Var.f71225r.getValue()).compareTo(h2.ShuttingDown) <= 0) {
                        throw u2.c("Recomposer shutdown; frame clock awaiter will never resume", o2Var.f71211d);
                    }
                }
                if (x13 != null) {
                    xk2.q qVar = xk2.s.f135225b;
                    x13.resumeWith(Unit.f80348a);
                    return;
                }
                return;
            case 6:
                break;
            case 7:
                h3.j0 j0Var = (h3.j0) a0Var.f15872j;
                if (j0Var.f66711k == j0Var.f66708h.h()) {
                    j0Var.f66708h.i(j0Var.f66708h.h() + 1);
                    return;
                }
                return;
            case 10:
                q3.l0 a13 = ((n1) a0Var.f15872j).a();
                s3.k0 k0Var = a13.f102230a;
                if (a13.f102243n != k0Var.q().size()) {
                    Iterator it = a13.f102235f.entrySet().iterator();
                    while (it.hasNext()) {
                        ((q3.c0) ((Map.Entry) it.next()).getValue()).f102175d = true;
                    }
                    if (k0Var.f110838z.f110970d) {
                        return;
                    }
                    s3.k0.Y(k0Var, false, 7);
                    return;
                }
                return;
            case 11:
                v0 v0Var = ((s3.k0) a0Var.f15872j).f110838z;
                v0Var.f110984r.f110952w = true;
                q0 q0Var = v0Var.f110985s;
                if (q0Var != null) {
                    q0Var.f110891t = true;
                    return;
                }
                return;
            case 12:
                t0 t0Var = (t0) a0Var.f15872j;
                v0 v0Var2 = t0Var.H;
                v0Var2.f110977k = 0;
                k2.e y13 = v0Var2.f110967a.y();
                int i14 = y13.f78184c;
                if (i14 > 0) {
                    Object[] objArr2 = y13.f78182a;
                    int i15 = 0;
                    do {
                        t0 t0Var2 = ((s3.k0) objArr2[i15]).f110838z.f110984r;
                        t0Var2.f110936g = t0Var2.f110937h;
                        t0Var2.f110937h = Integer.MAX_VALUE;
                        t0Var2.f110949t = false;
                        if (t0Var2.f110940k == s3.i0.InLayoutBlock) {
                            t0Var2.f110940k = s3.i0.NotUsed;
                        }
                        i15++;
                    } while (i15 < i14);
                }
                t0Var.Z(s0.f110916j);
                t0Var.F().E0().d();
                s3.k0 k0Var2 = t0Var.H.f110967a;
                k2.e y14 = k0Var2.y();
                int i16 = y14.f78184c;
                if (i16 > 0) {
                    Object[] objArr3 = y14.f78182a;
                    do {
                        s3.k0 k0Var3 = (s3.k0) objArr3[i13];
                        if (k0Var3.f110838z.f110984r.f110936g != k0Var3.w()) {
                            k0Var2.O();
                            k0Var2.B();
                            if (k0Var3.w() == Integer.MAX_VALUE) {
                                k0Var3.f110838z.f110984r.A0();
                            }
                        }
                        i13++;
                    } while (i13 < i16);
                }
                t0Var.Z(s0.f110917k);
                return;
            case 13:
                v0 v0Var3 = (v0) a0Var.f15872j;
                v0Var3.b().Q(v0Var3.f110986t);
                return;
            case 14:
                q1 q1Var = ((q1) a0Var.f15872j).f110901o;
                if (q1Var != null) {
                    q1Var.d1();
                    return;
                }
                return;
            case 15:
                Function1 function1 = (Function1) a0Var.f15872j;
                u0 u0Var = q1.G;
                function1.invoke(u0Var);
                u0Var.f21374u = u0Var.f21368o.a(u0Var.f21371r, u0Var.f21373t, u0Var.f21372s);
                return;
        }
        while (true) {
            s2.w wVar = (s2.w) a0Var.f15872j;
            synchronized (wVar.f110702f) {
                try {
                    if (!wVar.f110699c) {
                        try {
                            wVar.f110699c = z14;
                            try {
                                k2.e eVar = wVar.f110702f;
                                int i17 = eVar.f78184c;
                                if (i17 > 0) {
                                    Object[] objArr4 = eVar.f78182a;
                                    int i18 = i13;
                                    while (true) {
                                        s2.v vVar = (s2.v) objArr4[i18];
                                        g1.g0 g0Var = vVar.f110691g;
                                        Object[] objArr5 = g0Var.f63286b;
                                        long[] jArr = g0Var.f63285a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i19 = i13;
                                            while (true) {
                                                long j13 = jArr[i19];
                                                objArr = objArr4;
                                                if ((((~j13) << c13) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i23 = 8;
                                                    int i24 = 8 - ((~(i19 - length)) >>> 31);
                                                    for (int i25 = 0; i25 < i24; i25++) {
                                                        if ((j13 & 255) < 128) {
                                                            vVar.f110685a.invoke(objArr5[(i19 << 3) + i25]);
                                                            i23 = 8;
                                                        }
                                                        j13 >>= i23;
                                                    }
                                                    if (i24 != i23) {
                                                    }
                                                }
                                                if (i19 != length) {
                                                    i19++;
                                                    c13 = 7;
                                                    objArr4 = objArr;
                                                }
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        g0Var.f();
                                        i18++;
                                        if (i18 >= i17) {
                                            z13 = 0;
                                        } else {
                                            c13 = 7;
                                            objArr4 = objArr;
                                            i13 = 0;
                                        }
                                    }
                                } else {
                                    z13 = i13;
                                }
                                wVar.f110699c = z13;
                            } catch (Throwable th3) {
                                wVar.f110699c = false;
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    Unit unit = Unit.f80348a;
                    a0Var = this;
                    if (!s2.w.a((s2.w) a0Var.f15872j)) {
                        return;
                    }
                    c13 = 7;
                    i13 = 0;
                    z14 = true;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [wc.k] */
    /* JADX WARN: Type inference failed for: r8v2, types: [i2.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object[]] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pa.h sQLiteOpenHelper;
        int i13 = this.f15871i;
        switch (i13) {
            case 0:
                m5invoke();
                return Unit.f80348a;
            case 1:
                m5invoke();
                return Unit.f80348a;
            case 2:
                m5invoke();
                return Unit.f80348a;
            case 3:
                y1 y1Var = (y1) this.f15872j;
                g1.c0 c0Var = new g1.c0(y1Var.f71370a.size());
                int size = y1Var.f71370a.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ?? r83 = (d1) y1Var.f71370a.get(i14);
                    Object obj = r83.f71090b;
                    int i15 = r83.f71089a;
                    Object c1Var = obj != null ? new c1(Integer.valueOf(i15), r83.f71090b) : Integer.valueOf(i15);
                    int f13 = c0Var.f(c1Var);
                    boolean z13 = f13 < 0;
                    Object obj2 = z13 ? null : c0Var.f63240c[f13];
                    if (obj2 != null) {
                        if ((obj2 instanceof List) && (!(obj2 instanceof ll2.a) || (obj2 instanceof ll2.c))) {
                            List t13 = dl2.b.t(obj2);
                            t13.add(r83);
                            r83 = t13;
                        } else {
                            r83 = kotlin.collections.f0.l(obj2, r83);
                        }
                    }
                    if (z13) {
                        int i16 = ~f13;
                        c0Var.f63239b[i16] = c1Var;
                        c0Var.f63240c[i16] = r83;
                    } else {
                        c0Var.f63240c[f13] = r83;
                    }
                }
                return new p1(c0Var);
            case 4:
                m5invoke();
                return Unit.f80348a;
            case 5:
                r2.c cVar = (r2.c) this.f15872j;
                r2.p pVar = cVar.f106035a;
                Object obj3 = cVar.f106038d;
                if (obj3 != null) {
                    return pVar.a(cVar, obj3);
                }
                throw new IllegalArgumentException("Value should be initialized".toString());
            case 6:
                m5invoke();
                return Unit.f80348a;
            case 7:
                m5invoke();
                return Unit.f80348a;
            case 8:
                Object obj4 = this.f15872j;
                switch (i13) {
                    case 8:
                        return ((m3.d) obj4).f85728c;
                    default:
                        return ((m3.g) obj4).M0();
                }
            case 9:
                Object obj5 = this.f15872j;
                switch (i13) {
                    case 8:
                        return ((m3.d) obj5).f85728c;
                    default:
                        return ((m3.g) obj5).M0();
                }
            case 10:
                m5invoke();
                return Unit.f80348a;
            case 11:
                m5invoke();
                return Unit.f80348a;
            case 12:
                m5invoke();
                return Unit.f80348a;
            case 13:
                m5invoke();
                return Unit.f80348a;
            case 14:
                m5invoke();
                return Unit.f80348a;
            case 15:
                m5invoke();
                return Unit.f80348a;
            case 16:
                m5invoke();
                return Unit.f80348a;
            case 17:
                Object systemService = ((h4.q) this.f15872j).f67605a.getContext().getSystemService("input_method");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 18:
                return new BaseInputConnection(((h4.k0) this.f15872j).f67572a, false);
            case 19:
                return (Integer) kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new l5.e((l5.i) this.f15872j, null));
            case 20:
                View inflate = View.inflate(((n5.q) this.f15872j).f89244a, n5.f.splash_screen_view, null);
                if (inflate != null) {
                    return (ViewGroup) inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            case 21:
                File file = (File) ((a6.j0) this.f15872j).f855a.invoke();
                String it = file.getAbsolutePath();
                synchronized (a6.j0.f854k) {
                    LinkedHashSet linkedHashSet = a6.j0.f853j;
                    if (true ^ linkedHashSet.contains(it)) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        linkedHashSet.add(it);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return file;
            case 22:
                return g1.c((u1) this.f15872j);
            case 23:
                return ((c3) this.f15872j).d();
            case 24:
                pa.i iVar = (pa.i) this.f15872j;
                if (iVar.f99366b != null && iVar.f99368d) {
                    Context context = iVar.f99365a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                    sQLiteOpenHelper = new pa.h(iVar.f99365a, new File(noBackupFilesDir, iVar.f99366b).getAbsolutePath(), new h1.b((Object) null, 24), iVar.f99367c, iVar.f99369e);
                } else {
                    sQLiteOpenHelper = new pa.h(iVar.f99365a, iVar.f99366b, new h1.b((Object) null, 24), iVar.f99367c, iVar.f99369e);
                }
                boolean z14 = iVar.f99371g;
                Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
                sQLiteOpenHelper.setWriteAheadLoggingEnabled(z14);
                return sQLiteOpenHelper;
            case 25:
                return ((Worker) this.f15872j).i();
            case 26:
                return new pb.c[((do2.i[]) this.f15872j).length];
            case 27:
                xc.e eVar = new xc.e();
                wc.i cache = new wc.i(((vb0.i) this.f15872j).f125465a, 172800000L);
                Intrinsics.checkNotNullParameter(cache, "cache");
                xc.e eVar2 = eVar;
                while (true) {
                    ?? r43 = eVar2.f129092a;
                    if (r43 == 0) {
                        eVar2.f129092a = cache;
                        return eVar;
                    }
                    eVar2 = r43;
                }
            case 28:
                lh0.n1 n1Var = ((PinterestActivity) this.f15872j).f34813f;
                if (n1Var != null) {
                    z3 z3Var = a4.f83298b;
                    lh0.g1 g1Var = (lh0.g1) n1Var.f83439a;
                    return Boolean.valueOf(g1Var.o("android_exp_unauth_service_entry_direct_logs", "enabled", z3Var) || g1Var.l("android_exp_unauth_service_entry_direct_logs"));
                }
                Intrinsics.r("experiments");
                throw null;
            default:
                return (TabBarPlaceholderLoadingLayout) ((ir.c) this.f15872j).f73450a.findViewById(m60.t0.home_feed_tabs_placeholder_loading_layout);
        }
    }
}
