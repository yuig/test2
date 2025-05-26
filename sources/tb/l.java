package tb;

import am2.d0;
import am2.i1;
import am2.w0;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.identity.core.error.UnauthException;
import dm2.c1;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import jk2.a1;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import pn2.h0;
import rm2.i0;
import t3.s1;
import zq1.c0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final /* synthetic */ int f116985a;

    /* renamed from: b */
    public Object f116986b;

    /* renamed from: c */
    public Object f116987c;

    public l(int i13) {
        this.f116985a = i13;
        switch (i13) {
            case 6:
                this.f116986b = new qd.f(null);
                this.f116987c = new HashMap();
                break;
            case 7:
            case 11:
            default:
                this.f116986b = new HashMap();
                this.f116987c = new ArrayList();
                break;
            case 8:
                this.f116986b = new AtomicReference();
                this.f116987c = new g1.g(0);
                break;
            case 9:
                this.f116987c = new HashMap();
                break;
            case 10:
                this.f116986b = Collections.synchronizedMap(new WeakHashMap());
                this.f116987c = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 12:
                this.f116986b = null;
                this.f116987c = vk.w.f126066d;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.l a(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            tb.l r2 = new tb.l     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 13
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.l.a(android.content.Context):tb.l");
    }

    public final void A() {
        try {
            ((FileLock) this.f116987c).release();
            ((FileChannel) this.f116986b).close();
        } catch (IOException e13) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e13);
        }
    }

    public final Object B() {
        qd.f fVar = ((qd.f) this.f116986b).f103541d;
        while (true) {
            if (fVar.equals((qd.f) this.f116986b)) {
                return null;
            }
            ArrayList arrayList = fVar.f103539b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? fVar.f103539b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            qd.f fVar2 = fVar.f103541d;
            fVar2.f103540c = fVar.f103540c;
            fVar.f103540c.f103541d = fVar2;
            Map map = (Map) this.f116987c;
            Object obj = fVar.f103538a;
            map.remove(obj);
            ((qd.l) obj).a();
            fVar = fVar.f103541d;
        }
    }

    public final dn2.g C(pn2.b0 type, tm2.e value, vm2.f nameResolver) {
        dn2.g eVar;
        Intrinsics.checkNotNullParameter(type, "expectedType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        boolean k13 = s1.k(vm2.e.N, value.f118218m, "get(...)");
        tm2.d dVar = value.f118208c;
        switch (dVar == null ? -1 : ln2.f.f84077a[dVar.ordinal()]) {
            case 1:
                byte b13 = (byte) value.f118209d;
                return k13 ? new dn2.z(b13) : new dn2.d(b13);
            case 2:
                eVar = new dn2.e((char) value.f118209d);
                break;
            case 3:
                short s13 = (short) value.f118209d;
                return k13 ? new dn2.z(s13) : new dn2.w(s13);
            case 4:
                int i13 = (int) value.f118209d;
                return k13 ? new dn2.z(i13) : new dn2.k(i13);
            case 5:
                long j13 = value.f118209d;
                return k13 ? new dn2.z(j13) : new dn2.u(j13);
            case 6:
                eVar = new dn2.c(value.f118210e);
                break;
            case 7:
                eVar = new dn2.c(value.f118211f);
                break;
            case 8:
                eVar = new dn2.c(value.f118209d != 0);
                break;
            case 9:
                eVar = new dn2.x(nameResolver.c(value.f118212g));
                break;
            case 10:
                eVar = new dn2.t(bs1.c.s0(nameResolver, value.f118213h), value.f118217l);
                break;
            case 11:
                eVar = new dn2.i(bs1.c.s0(nameResolver, value.f118213h), bs1.c.L0(nameResolver, value.f118214i));
                break;
            case 12:
                tm2.h hVar = value.f118215j;
                Intrinsics.checkNotNullExpressionValue(hVar, "getAnnotation(...)");
                bm2.d value2 = e(hVar, nameResolver);
                Intrinsics.checkNotNullParameter(value2, "value");
                eVar = new dn2.a((Object) value2);
                break;
            case 13:
                List list = value.f118216k;
                Intrinsics.checkNotNullExpressionValue(list, "getArrayElementList(...)");
                List<tm2.e> list2 = list;
                ArrayList value3 = new ArrayList(g0.q(list2, 10));
                for (tm2.e eVar2 : list2) {
                    h0 e13 = ((d0) this.f116986b).f().e();
                    Intrinsics.checkNotNullExpressionValue(e13, "getAnyType(...)");
                    Intrinsics.f(eVar2);
                    value3.add(C(e13, eVar2, nameResolver));
                }
                Intrinsics.checkNotNullParameter(value3, "value");
                Intrinsics.checkNotNullParameter(type, "type");
                return new dn2.y(value3, type);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.f118208c + " (expected " + type + ')').toString());
        }
        return eVar;
    }

    public final void D(int i13) {
        if (i13 != 16 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
        }
        this.f116986b = Integer.valueOf(i13);
    }

    public final fk2.x E(nr1.a credential, mr1.c activityProvider, a1 resultsFeed) {
        uj2.b g13;
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "nextActivityResult");
        nr1.e eVar = (nr1.e) this.f116987c;
        or1.i authLoggingUtils = (or1.i) this.f116986b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        qr1.l lVar = qr1.l.f105012b;
        int i13 = 1;
        int i14 = 0;
        int i15 = 4;
        if (eVar.f91888a.o(lVar)) {
            Intrinsics.checkNotNullParameter(credential, "credential");
            Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
            Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
            Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
            lr1.i iVar = eVar.f91889b;
            g13 = new fk2.c(4, (iVar.f84608a.c(null, true, 0) ? fk2.m.f62459a : iVar.f84608a.c(null, false, 0) ? uj2.b.g(new UnauthException.ThirdParty.GoogleOneTap.PlayServicesOutdatedError()) : uj2.b.g(new UnauthException.ThirdParty.GoogleOneTap.PlayServicesNotAvailableError())).c(activityProvider.I5()).k(new jr1.a(8, nr1.d.f91895i)), new jr1.a(9, new fn1.k(eVar, credential, activityProvider, i15)));
            Intrinsics.checkNotNullExpressionValue(g13, "flatMapCompletable(...)");
        } else {
            g13 = uj2.b.g(new UnauthException.AuthServiceNotAvailableError(lVar));
        }
        fk2.l h10 = g13.h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        or1.f mode = or1.f.STORE;
        or1.i authLoggingUtils2 = (or1.i) this.f116986b;
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(authLoggingUtils2, "authLoggingUtils");
        fk2.x f13 = new fk2.x(h10, new c0(13, new or1.m(authLoggingUtils2, mode, i14)), ck2.i.f27924d, ck2.i.f27923c).e(new qb1.a(i15, authLoggingUtils2, mode)).f(new c0(14, new or1.m(authLoggingUtils2, mode, i13)));
        Intrinsics.checkNotNullExpressionValue(f13, "doOnError(...)");
        return f13;
    }

    public final void F(Status status, boolean z13) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f116986b)) {
            hashMap = new HashMap((Map) this.f116986b);
        }
        synchronized (((Map) this.f116987c)) {
            hashMap2 = new HashMap((Map) this.f116987c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z13 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).A0(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z13 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    public final vk.x b() {
        Integer num = (Integer) this.f116986b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((vk.w) this.f116987c) != null) {
            return new vk.x(num.intValue(), (vk.w) this.f116987c);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void c(Object obj, String str) {
        Map map = (Map) this.f116986b;
        obj.getClass();
        map.put(str, obj);
        ((List) this.f116987c).remove(str);
    }

    public final boolean d(int i13) {
        return ((a7.p) this.f116986b).f1162a.get(i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Pair] */
    public final bm2.d e(tm2.h proto, vm2.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        am2.g e03 = l0.e0((d0) this.f116986b, bs1.c.s0(nameResolver, proto.f118280c), (com.google.firebase.messaging.q) this.f116987c);
        Map d2 = z0.d();
        if (proto.f118281d.size() != 0 && !rn2.m.g(e03)) {
            int i13 = bn2.e.f23579a;
            if (bn2.e.p(e03, am2.h.ANNOTATION_CLASS)) {
                Collection n13 = e03.n();
                Intrinsics.checkNotNullExpressionValue(n13, "getConstructors(...)");
                am2.p pVar = (am2.f) CollectionsKt.t0(n13);
                if (pVar != null) {
                    List x13 = ((dm2.z) pVar).x();
                    Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
                    List list = x13;
                    int a13 = y0.a(g0.q(list, 10));
                    if (a13 < 16) {
                        a13 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
                    for (Object obj : list) {
                        linkedHashMap.put(((dm2.o) ((i1) obj)).getName(), obj);
                    }
                    List<tm2.f> list2 = proto.f118281d;
                    Intrinsics.checkNotNullExpressionValue(list2, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (tm2.f fVar : list2) {
                        Intrinsics.f(fVar);
                        am2.p pVar2 = (i1) linkedHashMap.get(bs1.c.L0(nameResolver, fVar.f118248c));
                        if (pVar2 != null) {
                            ym2.g L0 = bs1.c.L0(nameResolver, fVar.f118248c);
                            pn2.b0 type = ((c1) pVar2).getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            tm2.e eVar = fVar.f118249d;
                            Intrinsics.checkNotNullExpressionValue(eVar, "getValue(...)");
                            dn2.g C = C(type, eVar, nameResolver);
                            r5 = t(C, type, eVar) ? C : null;
                            if (r5 == null) {
                                r5 = i0.a("Unexpected argument value: actual type " + eVar.f118208c + " != expected type " + type);
                            }
                            r5 = new Pair(L0, r5);
                        }
                        if (r5 != null) {
                            arrayList.add(r5);
                        }
                    }
                    d2 = z0.m(arrayList);
                }
            }
        }
        return new bm2.d(e03.j(), d2, w0.f15602a);
    }

    public final void f(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void g(boolean z13) {
        androidx.fragment.app.w0 w0Var = (androidx.fragment.app.w0) this.f116987c;
        Context context = w0Var.f18470v.f18325b;
        Fragment fragment = w0Var.f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void h(Fragment fragment, Bundle bundle, boolean z13) {
        Fragment fragment2 = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f18462n.h(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.j0(fragment);
            }
        }
    }

    public final void i(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void j(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void k(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void l(boolean z13) {
        androidx.fragment.app.w0 w0Var = (androidx.fragment.app.w0) this.f116987c;
        Context context = w0Var.f18470v.f18325b;
        Fragment fragment = w0Var.f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void m(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void n(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void o(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void p(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void q(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final void r(Fragment fragment, View view, Bundle bundle, boolean z13) {
        Fragment fragment2 = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f18462n.r(fragment, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.k0((androidx.fragment.app.w0) this.f116987c, fragment, view);
            }
        }
    }

    public final void s(boolean z13) {
        Fragment fragment = ((androidx.fragment.app.w0) this.f116987c).f18472x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f18462n.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f116986b).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (!z13 || j0Var.f18358b) {
                j0Var.f18357a.getClass();
            }
        }
    }

    public final boolean t(dn2.g gVar, pn2.b0 b0Var, tm2.e eVar) {
        tm2.d dVar = eVar.f118208c;
        int i13 = dVar == null ? -1 : ln2.f.f84077a[dVar.ordinal()];
        if (i13 != 10) {
            if (i13 != 13) {
                return Intrinsics.d(gVar.a((d0) this.f116986b), b0Var);
            }
            if (gVar instanceof dn2.b) {
                dn2.b bVar = (dn2.b) gVar;
                if (((List) bVar.f55623a).size() == eVar.f118216k.size()) {
                    pn2.b0 f13 = ((d0) this.f116986b).f().f(b0Var);
                    Intrinsics.checkNotNullExpressionValue(f13, "getArrayElementType(...)");
                    Iterable h10 = f0.h((Collection) bVar.f55623a);
                    if (!(h10 instanceof Collection) || !((Collection) h10).isEmpty()) {
                        ql2.k it = h10.iterator();
                        while (it.f104109c) {
                            int b13 = it.b();
                            dn2.g gVar2 = (dn2.g) ((List) bVar.f55623a).get(b13);
                            tm2.e eVar2 = (tm2.e) eVar.f118216k.get(b13);
                            Intrinsics.checkNotNullExpressionValue(eVar2, "getArrayElement(...)");
                            if (!t(gVar2, f13, eVar2)) {
                                return false;
                            }
                        }
                    }
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        am2.j b14 = b0Var.w0().b();
        am2.g gVar3 = b14 instanceof am2.g ? (am2.g) b14 : null;
        if (gVar3 != null) {
            ym2.g gVar4 = xl2.l.f135279e;
            if (!xl2.l.b(gVar3, xl2.q.P)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        switch (this.f116985a) {
            case 6:
                StringBuilder sb3 = new StringBuilder("GroupedLinkedMap( ");
                qd.f fVar = ((qd.f) this.f116986b).f103540c;
                boolean z13 = false;
                while (!fVar.equals((qd.f) this.f116986b)) {
                    sb3.append('{');
                    sb3.append(fVar.f103538a);
                    sb3.append(':');
                    ArrayList arrayList = fVar.f103539b;
                    sb3.append(arrayList != null ? arrayList.size() : 0);
                    sb3.append("}, ");
                    fVar = fVar.f103540c;
                    z13 = true;
                }
                if (z13) {
                    sb3.delete(sb3.length() - 2, sb3.length());
                }
                sb3.append(" )");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public final Object u(qd.l lVar) {
        qd.f fVar = (qd.f) ((Map) this.f116987c).get(lVar);
        if (fVar == null) {
            fVar = new qd.f(lVar);
            ((Map) this.f116987c).put(lVar, fVar);
        } else {
            lVar.a();
        }
        qd.f fVar2 = fVar.f103541d;
        fVar2.f103540c = fVar.f103540c;
        fVar.f103540c.f103541d = fVar2;
        qd.f fVar3 = (qd.f) this.f116986b;
        fVar.f103541d = fVar3;
        qd.f fVar4 = fVar3.f103540c;
        fVar.f103540c = fVar4;
        fVar4.f103541d = fVar;
        fVar.f103541d.f103540c = fVar;
        ArrayList arrayList = fVar.f103539b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return fVar.f103539b.remove(size - 1);
        }
        return null;
    }

    public final n7.b v(int i13) {
        n7.b bVar = (n7.b) ((SparseArray) this.f116987c).get(i13);
        bVar.getClass();
        return bVar;
    }

    public final boolean w() {
        return x() || y();
    }

    public final boolean x() {
        lh0.m mVar = (lh0.m) this.f116987c;
        mVar.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) mVar.f83420a;
        return g1Var.o("android_network_metrics_v5", "enabled", z3Var) || g1Var.l("android_network_metrics_v5");
    }

    public final boolean y() {
        return ((lb0.b) ((lb0.o) this.f116986b)).e("PREF_PRINT_OKHTTP_REQUESTS_LOGCAT", false);
    }

    public final void z(qd.l lVar, Object obj) {
        qd.f fVar = (qd.f) ((Map) this.f116987c).get(lVar);
        if (fVar == null) {
            fVar = new qd.f(lVar);
            fVar.f103540c = fVar;
            fVar.f103541d = fVar;
            qd.f fVar2 = (qd.f) this.f116986b;
            fVar.f103541d = fVar2.f103541d;
            fVar.f103540c = fVar2;
            fVar2.f103541d = fVar;
            fVar.f103541d.f103540c = fVar;
            ((Map) this.f116987c).put(lVar, fVar);
        } else {
            lVar.a();
        }
        if (fVar.f103539b == null) {
            fVar.f103539b = new ArrayList();
        }
        fVar.f103539b.add(obj);
    }

    public /* synthetic */ l(int i13, Object obj, Object obj2) {
        this.f116985a = i13;
        this.f116986b = obj;
        this.f116987c = obj2;
    }

    public l(ja.d0 database, int i13) {
        this.f116985a = i13;
        if (i13 != 4) {
            this.f116986b = database;
            this.f116987c = new b(this, database, 3);
            return;
        }
        Intrinsics.checkNotNullParameter(database, "database");
        this.f116986b = database;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f116987c = newSetFromMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj) {
        this(12);
        this.f116985a = 12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(x92.b bVar) {
        this(new td.i0(bVar));
        this.f116985a = 7;
    }

    public /* synthetic */ l() {
        this.f116985a = 11;
        this.f116986b = new ArrayList();
        this.f116987c = new ArrayList();
    }

    public l(lb0.o persistedPreferences, lh0.m experiments) {
        this.f116985a = 15;
        Intrinsics.checkNotNullParameter(persistedPreferences, "persistedPreferences");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f116986b = persistedPreferences;
        this.f116987c = experiments;
    }

    public l(or1.i authLoggingUtils, nr1.e googleCredentialKeychain) {
        this.f116985a = 16;
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        Intrinsics.checkNotNullParameter(googleCredentialKeychain, "googleCredentialKeychain");
        this.f116986b = authLoggingUtils;
        this.f116987c = googleCredentialKeychain;
    }

    public l(td.i0 i0Var) {
        this.f116985a = 7;
        this.f116987c = new ja.c0(5);
        this.f116986b = i0Var;
    }

    public l(d0 module, com.google.firebase.messaging.q notFoundClasses) {
        this.f116985a = 18;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f116986b = module;
        this.f116987c = notFoundClasses;
    }

    public l(androidx.fragment.app.w0 w0Var) {
        this.f116985a = 1;
        this.f116986b = new CopyOnWriteArrayList();
        this.f116987c = w0Var;
    }

    public l(a7.p pVar, SparseArray sparseArray) {
        this.f116985a = 3;
        this.f116986b = pVar;
        SparseBooleanArray sparseBooleanArray = pVar.f1162a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i13 = 0; i13 < sparseBooleanArray.size(); i13++) {
            int a13 = pVar.a(i13);
            n7.b bVar = (n7.b) sparseArray.get(a13);
            bVar.getClass();
            sparseArray2.append(a13, bVar);
        }
        this.f116987c = sparseArray2;
    }
}
