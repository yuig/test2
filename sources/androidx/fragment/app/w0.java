package androidx.fragment.app;

import a.cb;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class w0 {
    public final l0 B;
    public g.d C;
    public g.d D;
    public g.d E;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f18448J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public z0 O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18450b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f18452d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f18453e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.i0 f18455g;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f18461m;

    /* renamed from: p, reason: collision with root package name */
    public final k0 f18464p;

    /* renamed from: q, reason: collision with root package name */
    public final k0 f18465q;

    /* renamed from: r, reason: collision with root package name */
    public final k0 f18466r;

    /* renamed from: s, reason: collision with root package name */
    public final k0 f18467s;

    /* renamed from: v, reason: collision with root package name */
    public g0 f18470v;

    /* renamed from: w, reason: collision with root package name */
    public d0 f18471w;

    /* renamed from: x, reason: collision with root package name */
    public Fragment f18472x;

    /* renamed from: y, reason: collision with root package name */
    public Fragment f18473y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18449a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final e1 f18451c = new e1();

    /* renamed from: f, reason: collision with root package name */
    public final i0 f18454f = new i0(this);

    /* renamed from: h, reason: collision with root package name */
    public final m0 f18456h = new m0(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f18457i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f18458j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f18459k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f18460l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final tb.l f18462n = new tb.l(this);

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f18463o = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final n0 f18468t = new n0(this);

    /* renamed from: u, reason: collision with root package name */
    public int f18469u = -1;

    /* renamed from: z, reason: collision with root package name */
    public f0 f18474z = null;
    public final o0 A = new o0(this);
    public ArrayDeque F = new ArrayDeque();
    public final l P = new l(this, 2);

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.k0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.k0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.k0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.k0] */
    public w0() {
        final int i13 = 0;
        this.f18464p = new p5.a(this) { // from class: androidx.fragment.app.k0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w0 f18367b;

            {
                this.f18367b = this;
            }

            @Override // p5.a
            public final void accept(Object obj) {
                int i14 = i13;
                w0 w0Var = this.f18367b;
                switch (i14) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (w0Var.O()) {
                            w0Var.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (w0Var.O() && num.intValue() == 80) {
                            w0Var.o(false);
                            break;
                        }
                        break;
                    case 2:
                        c5.n nVar = (c5.n) obj;
                        if (w0Var.O()) {
                            w0Var.p(nVar.f25823a, false);
                            break;
                        }
                        break;
                    default:
                        c5.h0 h0Var = (c5.h0) obj;
                        if (w0Var.O()) {
                            w0Var.u(h0Var.f25806a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 1;
        this.f18465q = new p5.a(this) { // from class: androidx.fragment.app.k0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w0 f18367b;

            {
                this.f18367b = this;
            }

            @Override // p5.a
            public final void accept(Object obj) {
                int i142 = i14;
                w0 w0Var = this.f18367b;
                switch (i142) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (w0Var.O()) {
                            w0Var.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (w0Var.O() && num.intValue() == 80) {
                            w0Var.o(false);
                            break;
                        }
                        break;
                    case 2:
                        c5.n nVar = (c5.n) obj;
                        if (w0Var.O()) {
                            w0Var.p(nVar.f25823a, false);
                            break;
                        }
                        break;
                    default:
                        c5.h0 h0Var = (c5.h0) obj;
                        if (w0Var.O()) {
                            w0Var.u(h0Var.f25806a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 2;
        this.f18466r = new p5.a(this) { // from class: androidx.fragment.app.k0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w0 f18367b;

            {
                this.f18367b = this;
            }

            @Override // p5.a
            public final void accept(Object obj) {
                int i142 = i15;
                w0 w0Var = this.f18367b;
                switch (i142) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (w0Var.O()) {
                            w0Var.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (w0Var.O() && num.intValue() == 80) {
                            w0Var.o(false);
                            break;
                        }
                        break;
                    case 2:
                        c5.n nVar = (c5.n) obj;
                        if (w0Var.O()) {
                            w0Var.p(nVar.f25823a, false);
                            break;
                        }
                        break;
                    default:
                        c5.h0 h0Var = (c5.h0) obj;
                        if (w0Var.O()) {
                            w0Var.u(h0Var.f25806a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 3;
        this.f18467s = new p5.a(this) { // from class: androidx.fragment.app.k0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w0 f18367b;

            {
                this.f18367b = this;
            }

            @Override // p5.a
            public final void accept(Object obj) {
                int i142 = i16;
                w0 w0Var = this.f18367b;
                switch (i142) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (w0Var.O()) {
                            w0Var.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (w0Var.O() && num.intValue() == 80) {
                            w0Var.o(false);
                            break;
                        }
                        break;
                    case 2:
                        c5.n nVar = (c5.n) obj;
                        if (w0Var.O()) {
                            w0Var.p(nVar.f25823a, false);
                            break;
                        }
                        break;
                    default:
                        c5.h0 h0Var = (c5.h0) obj;
                        if (w0Var.O()) {
                            w0Var.u(h0Var.f25806a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.B = new l0(this, i16);
    }

    public static HashSet H(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i13 = 0; i13 < aVar.f18266a.size(); i13++) {
            Fragment fragment = ((g1) aVar.f18266a.get(i13)).f18329b;
            if (fragment != null && aVar.f18272g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean N(Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            Iterator it = fragment.mChildFragmentManager.f18451c.e().iterator();
            boolean z13 = false;
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    z13 = N(fragment2);
                }
                if (z13) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean P(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        w0 w0Var = fragment.mFragmentManager;
        return fragment.equals(w0Var.f18473y) && P(w0Var.f18472x);
    }

    public static void j0(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final boolean A(boolean z13) {
        z(z13);
        boolean z14 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.f18449a) {
                if (this.f18449a.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f18449a.size();
                    boolean z15 = false;
                    for (int i13 = 0; i13 < size; i13++) {
                        z15 |= ((t0) this.f18449a.get(i13)).a(arrayList, arrayList2);
                    }
                    if (!z15) {
                        break;
                    }
                    this.f18450b = true;
                    try {
                        Z(this.L, this.M);
                        g();
                        z14 = true;
                    } catch (Throwable th3) {
                        g();
                        throw th3;
                    }
                } finally {
                    this.f18449a.clear();
                    this.f18470v.f18326c.removeCallbacks(this.P);
                }
            }
        }
        l0();
        if (this.K) {
            this.K = false;
            Iterator it = this.f18451c.d().iterator();
            while (it.hasNext()) {
                d1 d1Var = (d1) it.next();
                Fragment fragment = d1Var.f18305c;
                if (fragment.mDeferStart) {
                    if (this.f18450b) {
                        this.K = true;
                    } else {
                        fragment.mDeferStart = false;
                        d1Var.l();
                    }
                }
            }
        }
        this.f18451c.f18315b.values().removeAll(Collections.singleton(null));
        return z14;
    }

    public final void B(t0 t0Var, boolean z13) {
        if (z13 && (this.f18470v == null || this.f18448J)) {
            return;
        }
        z(z13);
        if (t0Var.a(this.L, this.M)) {
            this.f18450b = true;
            try {
                Z(this.L, this.M);
            } finally {
                g();
            }
        }
        l0();
        boolean z14 = this.K;
        e1 e1Var = this.f18451c;
        if (z14) {
            this.K = false;
            Iterator it = e1Var.d().iterator();
            while (it.hasNext()) {
                d1 d1Var = (d1) it.next();
                Fragment fragment = d1Var.f18305c;
                if (fragment.mDeferStart) {
                    if (this.f18450b) {
                        this.K = true;
                    } else {
                        fragment.mDeferStart = false;
                        d1Var.l();
                    }
                }
            }
        }
        e1Var.f18315b.values().removeAll(Collections.singleton(null));
    }

    public final void C(ArrayList arrayList, ArrayList arrayList2, int i13, int i14) {
        ViewGroup viewGroup;
        ArrayList arrayList3;
        e1 e1Var;
        e1 e1Var2;
        e1 e1Var3;
        int i15;
        int i16;
        ArrayList arrayList4 = arrayList2;
        boolean z13 = ((a) arrayList.get(i13)).f18281p;
        ArrayList arrayList5 = this.N;
        if (arrayList5 == null) {
            this.N = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.N;
        e1 e1Var4 = this.f18451c;
        arrayList6.addAll(e1Var4.f());
        Fragment fragment = this.f18473y;
        int i17 = i13;
        boolean z14 = false;
        while (true) {
            int i18 = 1;
            if (i17 >= i14) {
                break;
            }
            a aVar = (a) arrayList.get(i17);
            if (((Boolean) arrayList4.get(i17)).booleanValue()) {
                e1Var2 = e1Var4;
                fragment = aVar.p(this.N, fragment);
            } else {
                ArrayList arrayList7 = this.N;
                int i19 = 0;
                while (i19 < aVar.f18266a.size()) {
                    g1 g1Var = (g1) aVar.f18266a.get(i19);
                    int i23 = g1Var.f18328a;
                    if (i23 == i18) {
                        e1Var3 = e1Var4;
                        i15 = i18;
                    } else if (i23 != 2) {
                        if (i23 == 3 || i23 == 6) {
                            arrayList7.remove(g1Var.f18329b);
                            Fragment fragment2 = g1Var.f18329b;
                            if (fragment2 == fragment) {
                                aVar.f18266a.add(i19, new g1(fragment2, 9));
                                i19++;
                                e1Var3 = e1Var4;
                                i15 = 1;
                                fragment = null;
                                i19 += i15;
                                i18 = i15;
                                e1Var4 = e1Var3;
                            }
                        } else if (i23 == 7) {
                            e1Var3 = e1Var4;
                            i15 = 1;
                        } else if (i23 == 8) {
                            aVar.f18266a.add(i19, new g1(9, fragment));
                            g1Var.f18330c = true;
                            i19++;
                            fragment = g1Var.f18329b;
                        }
                        e1Var3 = e1Var4;
                        i15 = 1;
                        i19 += i15;
                        i18 = i15;
                        e1Var4 = e1Var3;
                    } else {
                        Fragment fragment3 = g1Var.f18329b;
                        int i24 = fragment3.mContainerId;
                        int size = arrayList7.size() - 1;
                        boolean z15 = false;
                        while (size >= 0) {
                            Fragment fragment4 = (Fragment) arrayList7.get(size);
                            e1 e1Var5 = e1Var4;
                            if (fragment4.mContainerId != i24) {
                                i16 = i24;
                            } else if (fragment4 == fragment3) {
                                i16 = i24;
                                z15 = true;
                            } else {
                                if (fragment4 == fragment) {
                                    i16 = i24;
                                    aVar.f18266a.add(i19, new g1(9, fragment4));
                                    i19++;
                                    fragment = null;
                                } else {
                                    i16 = i24;
                                }
                                g1 g1Var2 = new g1(3, fragment4);
                                g1Var2.f18331d = g1Var.f18331d;
                                g1Var2.f18333f = g1Var.f18333f;
                                g1Var2.f18332e = g1Var.f18332e;
                                g1Var2.f18334g = g1Var.f18334g;
                                aVar.f18266a.add(i19, g1Var2);
                                arrayList7.remove(fragment4);
                                i19++;
                            }
                            size--;
                            e1Var4 = e1Var5;
                            i24 = i16;
                        }
                        e1Var3 = e1Var4;
                        if (z15) {
                            aVar.f18266a.remove(i19);
                            i19--;
                            i15 = 1;
                            i19 += i15;
                            i18 = i15;
                            e1Var4 = e1Var3;
                        } else {
                            i15 = 1;
                            g1Var.f18328a = 1;
                            g1Var.f18330c = true;
                            arrayList7.add(fragment3);
                            i19 += i15;
                            i18 = i15;
                            e1Var4 = e1Var3;
                        }
                    }
                    arrayList7.add(g1Var.f18329b);
                    i19 += i15;
                    i18 = i15;
                    e1Var4 = e1Var3;
                }
                e1Var2 = e1Var4;
            }
            z14 = z14 || aVar.f18272g;
            i17++;
            arrayList4 = arrayList2;
            e1Var4 = e1Var2;
        }
        e1 e1Var6 = e1Var4;
        this.N.clear();
        if (!z13 && this.f18469u >= 1) {
            for (int i25 = i13; i25 < i14; i25++) {
                Iterator it = ((a) arrayList.get(i25)).f18266a.iterator();
                while (it.hasNext()) {
                    Fragment fragment5 = ((g1) it.next()).f18329b;
                    if (fragment5 == null || fragment5.mFragmentManager == null) {
                        e1Var = e1Var6;
                    } else {
                        e1Var = e1Var6;
                        e1Var.h(i(fragment5));
                    }
                    e1Var6 = e1Var;
                }
            }
        }
        for (int i26 = i13; i26 < i14; i26++) {
            a aVar2 = (a) arrayList.get(i26);
            if (((Boolean) arrayList2.get(i26)).booleanValue()) {
                aVar2.d(-1);
                aVar2.j();
            } else {
                aVar2.d(1);
                int size2 = aVar2.f18266a.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    g1 g1Var3 = (g1) aVar2.f18266a.get(i27);
                    Fragment fragment6 = g1Var3.f18329b;
                    if (fragment6 != null) {
                        fragment6.mBeingSaved = aVar2.f18285t;
                        fragment6.setPopDirection(false);
                        fragment6.setNextTransition(aVar2.f18271f);
                        fragment6.setSharedElementNames(aVar2.f18279n, aVar2.f18280o);
                    }
                    int i28 = g1Var3.f18328a;
                    w0 w0Var = aVar2.f18282q;
                    switch (i28) {
                        case 1:
                            fragment6.setAnimations(g1Var3.f18331d, g1Var3.f18332e, g1Var3.f18333f, g1Var3.f18334g);
                            w0Var.f0(fragment6, false);
                            w0Var.b(fragment6);
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + g1Var3.f18328a);
                        case 3:
                            fragment6.setAnimations(g1Var3.f18331d, g1Var3.f18332e, g1Var3.f18333f, g1Var3.f18334g);
                            w0Var.Y(fragment6);
                        case 4:
                            fragment6.setAnimations(g1Var3.f18331d, g1Var3.f18332e, g1Var3.f18333f, g1Var3.f18334g);
                            w0Var.L(fragment6);
                        case 5:
                            fragment6.setAnimations(g1Var3.f18331d, g1Var3.f18332e, g1Var3.f18333f, g1Var3.f18334g);
                            w0Var.f0(fragment6, false);
                            j0(fragment6);
                        case 6:
                            fragment6.setAnimations(g1Var3.f18331d, g1Var3.f18332e, g1Var3.f18333f, g1Var3.f18334g);
                            w0Var.j(fragment6);
                        case 7:
                            fragment6.setAnimations(g1Var3.f18331d, g1Var3.f18332e, g1Var3.f18333f, g1Var3.f18334g);
                            w0Var.f0(fragment6, false);
                            w0Var.f(fragment6);
                        case 8:
                            w0Var.h0(fragment6);
                        case 9:
                            w0Var.h0(null);
                        case 10:
                            w0Var.g0(fragment6, g1Var3.f18336i);
                    }
                }
            }
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i14 - 1)).booleanValue();
        if (z14 && (arrayList3 = this.f18461m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(H((a) it2.next()));
            }
            Iterator it3 = this.f18461m.iterator();
            while (it3.hasNext()) {
                ca.i iVar = (ca.i) it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    iVar.b((Fragment) it4.next(), booleanValue);
                }
            }
            Iterator it5 = this.f18461m.iterator();
            while (it5.hasNext()) {
                ca.i iVar2 = (ca.i) it5.next();
                Iterator it6 = linkedHashSet.iterator();
                while (it6.hasNext()) {
                    iVar2.a((Fragment) it6.next(), booleanValue);
                }
            }
        }
        for (int i29 = i13; i29 < i14; i29++) {
            a aVar3 = (a) arrayList.get(i29);
            if (booleanValue) {
                for (int size3 = aVar3.f18266a.size() - 1; size3 >= 0; size3--) {
                    Fragment fragment7 = ((g1) aVar3.f18266a.get(size3)).f18329b;
                    if (fragment7 != null) {
                        i(fragment7).l();
                    }
                }
            } else {
                Iterator it7 = aVar3.f18266a.iterator();
                while (it7.hasNext()) {
                    Fragment fragment8 = ((g1) it7.next()).f18329b;
                    if (fragment8 != null) {
                        i(fragment8).l();
                    }
                }
            }
        }
        R(this.f18469u, true);
        HashSet hashSet = new HashSet();
        for (int i33 = i13; i33 < i14; i33++) {
            Iterator it8 = ((a) arrayList.get(i33)).f18266a.iterator();
            while (it8.hasNext()) {
                Fragment fragment9 = ((g1) it8.next()).f18329b;
                if (fragment9 != null && (viewGroup = fragment9.mContainer) != null) {
                    hashSet.add(k.m(viewGroup, this));
                }
            }
        }
        Iterator it9 = hashSet.iterator();
        while (it9.hasNext()) {
            k kVar = (k) it9.next();
            kVar.f18364d = booleanValue;
            kVar.n();
            kVar.i();
        }
        for (int i34 = i13; i34 < i14; i34++) {
            a aVar4 = (a) arrayList.get(i34);
            if (((Boolean) arrayList2.get(i34)).booleanValue() && aVar4.f18284s >= 0) {
                aVar4.f18284s = -1;
            }
            aVar4.getClass();
        }
        if (z14) {
            a0();
        }
    }

    public final int D(String str, int i13, boolean z13) {
        ArrayList arrayList = this.f18452d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i13 < 0) {
            if (z13) {
                return 0;
            }
            return this.f18452d.size() - 1;
        }
        int size = this.f18452d.size() - 1;
        while (size >= 0) {
            a aVar = (a) this.f18452d.get(size);
            if ((str != null && str.equals(aVar.f18274i)) || (i13 >= 0 && i13 == aVar.f18284s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z13) {
            if (size == this.f18452d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            a aVar2 = (a) this.f18452d.get(size - 1);
            if ((str == null || !str.equals(aVar2.f18274i)) && (i13 < 0 || i13 != aVar2.f18284s)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public final Fragment E(int i13) {
        e1 e1Var = this.f18451c;
        ArrayList arrayList = e1Var.f18314a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i13) {
                return fragment;
            }
        }
        for (d1 d1Var : e1Var.f18315b.values()) {
            if (d1Var != null) {
                Fragment fragment2 = d1Var.f18305c;
                if (fragment2.mFragmentId == i13) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment F(String str) {
        e1 e1Var = this.f18451c;
        if (str != null) {
            ArrayList arrayList = e1Var.f18314a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (d1 d1Var : e1Var.f18315b.values()) {
                if (d1Var != null) {
                    Fragment fragment2 = d1Var.f18305c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            e1Var.getClass();
        }
        return null;
    }

    public final void G() {
        Iterator it = h().iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.f18365e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                kVar.f18365e = false;
                kVar.i();
            }
        }
    }

    public final ViewGroup I(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f18471w.c()) {
            View b13 = this.f18471w.b(fragment.mContainerId);
            if (b13 instanceof ViewGroup) {
                return (ViewGroup) b13;
            }
        }
        return null;
    }

    public final f0 J() {
        f0 f0Var = this.f18474z;
        if (f0Var != null) {
            return f0Var;
        }
        Fragment fragment = this.f18472x;
        return fragment != null ? fragment.mFragmentManager.J() : this.A;
    }

    public final l0 K() {
        Fragment fragment = this.f18472x;
        return fragment != null ? fragment.mFragmentManager.K() : this.B;
    }

    public final void L(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        i0(fragment);
    }

    public final void M(Fragment fragment) {
        if (fragment.mAdded && N(fragment)) {
            this.G = true;
        }
    }

    public final boolean O() {
        Fragment fragment = this.f18472x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f18472x.getParentFragmentManager().O();
    }

    public final boolean Q() {
        return this.H || this.I;
    }

    public final void R(int i13, boolean z13) {
        HashMap hashMap;
        g0 g0Var;
        if (this.f18470v == null && i13 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z13 || i13 != this.f18469u) {
            this.f18469u = i13;
            e1 e1Var = this.f18451c;
            Iterator it = e1Var.f18314a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = e1Var.f18315b;
                if (!hasNext) {
                    break;
                }
                d1 d1Var = (d1) hashMap.get(((Fragment) it.next()).mWho);
                if (d1Var != null) {
                    d1Var.l();
                }
            }
            for (d1 d1Var2 : hashMap.values()) {
                if (d1Var2 != null) {
                    d1Var2.l();
                    Fragment fragment = d1Var2.f18305c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !e1Var.f18316c.containsKey(fragment.mWho)) {
                            e1Var.j(fragment.mWho, d1Var2.o());
                        }
                        e1Var.i(d1Var2);
                    }
                }
            }
            Iterator it2 = e1Var.d().iterator();
            while (it2.hasNext()) {
                d1 d1Var3 = (d1) it2.next();
                Fragment fragment2 = d1Var3.f18305c;
                if (fragment2.mDeferStart) {
                    if (this.f18450b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        d1Var3.l();
                    }
                }
            }
            if (this.G && (g0Var = this.f18470v) != null && this.f18469u == 7) {
                g0Var.d();
                this.G = false;
            }
        }
    }

    public final void S() {
        if (this.f18470v == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f18507g = false;
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void T(int i13, boolean z13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("Bad id: ", i13));
        }
        y(new u0(this, null, i13, 1), z13);
    }

    public final boolean U() {
        return V(-1, 0);
    }

    public final boolean V(int i13, int i14) {
        A(false);
        z(true);
        Fragment fragment = this.f18473y;
        if (fragment != null && i13 < 0 && fragment.getChildFragmentManager().V(-1, 0)) {
            return true;
        }
        boolean W = W(this.L, this.M, null, i13, i14);
        if (W) {
            this.f18450b = true;
            try {
                Z(this.L, this.M);
            } finally {
                g();
            }
        }
        l0();
        boolean z13 = this.K;
        e1 e1Var = this.f18451c;
        if (z13) {
            this.K = false;
            Iterator it = e1Var.d().iterator();
            while (it.hasNext()) {
                d1 d1Var = (d1) it.next();
                Fragment fragment2 = d1Var.f18305c;
                if (fragment2.mDeferStart) {
                    if (this.f18450b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        d1Var.l();
                    }
                }
            }
        }
        e1Var.f18315b.values().removeAll(Collections.singleton(null));
        return W;
    }

    public final boolean W(ArrayList arrayList, ArrayList arrayList2, String str, int i13, int i14) {
        int D = D(str, i13, (i14 & 1) != 0);
        if (D < 0) {
            return false;
        }
        for (int size = this.f18452d.size() - 1; size >= D; size--) {
            arrayList.add((a) this.f18452d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void X(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            k0(new IllegalStateException(cb.k("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void Y(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z13 = !fragment.isInBackStack();
        if (!fragment.mDetached || z13) {
            e1 e1Var = this.f18451c;
            synchronized (e1Var.f18314a) {
                e1Var.f18314a.remove(fragment);
            }
            fragment.mAdded = false;
            if (N(fragment)) {
                this.G = true;
            }
            fragment.mRemoving = true;
            i0(fragment);
        }
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            if (!((a) arrayList.get(i13)).f18281p) {
                if (i14 != i13) {
                    C(arrayList, arrayList2, i14, i13);
                }
                i14 = i13 + 1;
                if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                    while (i14 < size && ((Boolean) arrayList2.get(i14)).booleanValue() && !((a) arrayList.get(i14)).f18281p) {
                        i14++;
                    }
                }
                C(arrayList, arrayList2, i13, i14);
                i13 = i14 - 1;
            }
            i13++;
        }
        if (i14 != size) {
            C(arrayList, arrayList2, i14, size);
        }
    }

    public final void a(a aVar) {
        if (this.f18452d == null) {
            this.f18452d = new ArrayList();
        }
        this.f18452d.add(aVar);
    }

    public final void a0() {
        if (this.f18461m != null) {
            for (int i13 = 0; i13 < this.f18461m.size(); i13++) {
                ((ca.i) this.f18461m.get(i13)).getClass();
            }
        }
    }

    public final d1 b(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            m6.c.d(fragment, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        d1 i13 = i(fragment);
        fragment.mFragmentManager = this;
        e1 e1Var = this.f18451c;
        e1Var.h(i13);
        if (!fragment.mDetached) {
            e1Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (N(fragment)) {
                this.G = true;
            }
        }
        return i13;
    }

    public final void b0(Bundle bundle) {
        tb.l lVar;
        d1 d1Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f18470v.f18325b.getClassLoader());
                this.f18459k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f18470v.f18325b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        e1 e1Var = this.f18451c;
        HashMap hashMap2 = e1Var.f18316c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable(AnimatedTarget.PROPERTY_STATE);
        if (fragmentManagerState == null) {
            return;
        }
        HashMap hashMap3 = e1Var.f18315b;
        hashMap3.clear();
        Iterator it = fragmentManagerState.f18240a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            lVar = this.f18462n;
            if (!hasNext) {
                break;
            }
            Bundle j13 = e1Var.j((String) it.next(), null);
            if (j13 != null) {
                Fragment fragment = (Fragment) this.O.f18502b.get(((FragmentState) j13.getParcelable(AnimatedTarget.PROPERTY_STATE)).f18249b);
                if (fragment != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    d1Var = new d1(lVar, e1Var, fragment, j13);
                } else {
                    d1Var = new d1(this.f18462n, this.f18451c, this.f18470v.f18325b.getClassLoader(), J(), j13);
                }
                Fragment fragment2 = d1Var.f18305c;
                fragment2.mSavedFragmentState = j13;
                fragment2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                d1Var.m(this.f18470v.f18325b.getClassLoader());
                e1Var.h(d1Var);
                d1Var.f18307e = this.f18469u;
            }
        }
        z0 z0Var = this.O;
        z0Var.getClass();
        Iterator it2 = new ArrayList(z0Var.f18502b.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f18240a);
                }
                this.O.l(fragment3);
                fragment3.mFragmentManager = this;
                d1 d1Var2 = new d1(lVar, e1Var, fragment3);
                d1Var2.f18307e = 1;
                d1Var2.l();
                fragment3.mRemoving = true;
                d1Var2.l();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f18241b;
        e1Var.f18314a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b13 = e1Var.b(str3);
                if (b13 == null) {
                    throw new IllegalStateException(a.a.k("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b13);
                }
                e1Var.a(b13);
            }
        }
        if (fragmentManagerState.f18242c != null) {
            this.f18452d = new ArrayList(fragmentManagerState.f18242c.length);
            int i13 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f18242c;
                if (i13 >= backStackRecordStateArr.length) {
                    break;
                }
                a b14 = backStackRecordStateArr[i13].b(this);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder s13 = a.a.s("restoreAllState: back stack #", i13, " (index ");
                    s13.append(b14.f18284s);
                    s13.append("): ");
                    s13.append(b14);
                    Log.v("FragmentManager", s13.toString());
                    PrintWriter printWriter = new PrintWriter(new r1());
                    b14.i("  ", printWriter, false);
                    printWriter.close();
                }
                this.f18452d.add(b14);
                i13++;
            }
        } else {
            this.f18452d = null;
        }
        this.f18457i.set(fragmentManagerState.f18243d);
        String str4 = fragmentManagerState.f18244e;
        if (str4 != null) {
            Fragment b15 = e1Var.b(str4);
            this.f18473y = b15;
            t(b15);
        }
        ArrayList arrayList2 = fragmentManagerState.f18245f;
        if (arrayList2 != null) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                this.f18458j.put((String) arrayList2.get(i14), (BackStackState) fragmentManagerState.f18246g.get(i14));
            }
        }
        this.F = new ArrayDeque(fragmentManagerState.f18247h);
    }

    public final void c(Fragment fragment) {
        this.O.h(fragment);
    }

    public final Bundle c0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        int size;
        Bundle bundle = new Bundle();
        G();
        Iterator it = h().iterator();
        while (it.hasNext()) {
            ((k) it.next()).l();
        }
        A(true);
        this.H = true;
        this.O.f18507g = true;
        e1 e1Var = this.f18451c;
        e1Var.getClass();
        HashMap hashMap = e1Var.f18315b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (d1 d1Var : hashMap.values()) {
            if (d1Var != null) {
                Fragment fragment = d1Var.f18305c;
                e1Var.j(fragment.mWho, d1Var.o());
                arrayList2.add(fragment.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.f18451c.f18316c;
        if (!hashMap2.isEmpty()) {
            e1 e1Var2 = this.f18451c;
            synchronized (e1Var2.f18314a) {
                try {
                    backStackRecordStateArr = null;
                    if (e1Var2.f18314a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(e1Var2.f18314a.size());
                        Iterator it2 = e1Var2.f18314a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment2 = (Fragment) it2.next();
                            arrayList.add(fragment2.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f18452d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i13 = 0; i13 < size; i13++) {
                    backStackRecordStateArr[i13] = new BackStackRecordState((a) this.f18452d.get(i13));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder s13 = a.a.s("saveAllState: adding back stack #", i13, ": ");
                        s13.append(this.f18452d.get(i13));
                        Log.v("FragmentManager", s13.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f18240a = arrayList2;
            fragmentManagerState.f18241b = arrayList;
            fragmentManagerState.f18242c = backStackRecordStateArr;
            fragmentManagerState.f18243d = this.f18457i.get();
            Fragment fragment3 = this.f18473y;
            if (fragment3 != null) {
                fragmentManagerState.f18244e = fragment3.mWho;
            }
            fragmentManagerState.f18245f.addAll(this.f18458j.keySet());
            fragmentManagerState.f18246g.addAll(this.f18458j.values());
            fragmentManagerState.f18247h = new ArrayList(this.F);
            bundle.putParcelable(AnimatedTarget.PROPERTY_STATE, fragmentManagerState);
            for (String str : this.f18459k.keySet()) {
                bundle.putBundle(a.a.j("result_", str), (Bundle) this.f18459k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(a.a.j("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final int d() {
        return this.f18457i.getAndIncrement();
    }

    public final Fragment.SavedState d0(Fragment fragment) {
        d1 d1Var = (d1) this.f18451c.f18315b.get(fragment.mWho);
        if (d1Var != null) {
            Fragment fragment2 = d1Var.f18305c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(d1Var.o());
                }
                return null;
            }
        }
        k0(new IllegalStateException(cb.k("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(g0 g0Var, d0 d0Var, Fragment fragment) {
        if (this.f18470v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f18470v = g0Var;
        this.f18471w = d0Var;
        this.f18472x = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18463o;
        if (fragment != null) {
            copyOnWriteArrayList.add(new q0(fragment));
        } else if (g0Var instanceof a1) {
            copyOnWriteArrayList.add((a1) g0Var);
        }
        if (this.f18472x != null) {
            l0();
        }
        if (g0Var instanceof androidx.activity.k0) {
            androidx.activity.k0 k0Var = (androidx.activity.k0) g0Var;
            androidx.activity.i0 onBackPressedDispatcher = k0Var.getOnBackPressedDispatcher();
            this.f18455g = onBackPressedDispatcher;
            androidx.lifecycle.z zVar = k0Var;
            if (fragment != null) {
                zVar = fragment;
            }
            onBackPressedDispatcher.a(zVar, this.f18456h);
        }
        int i13 = 0;
        if (fragment != null) {
            z0 z0Var = fragment.mFragmentManager.O;
            HashMap hashMap = z0Var.f18503c;
            z0 z0Var2 = (z0) hashMap.get(fragment.mWho);
            if (z0Var2 == null) {
                z0Var2 = new z0(z0Var.f18505e);
                hashMap.put(fragment.mWho, z0Var2);
            }
            this.O = z0Var2;
        } else if (g0Var instanceof androidx.lifecycle.u1) {
            androidx.lifecycle.t1 store = ((androidx.lifecycle.u1) g0Var).getViewModelStore();
            Intrinsics.checkNotNullParameter(store, "store");
            y0 factory = z0.f18501h;
            Intrinsics.checkNotNullParameter(factory, "factory");
            u6.a defaultCreationExtras = u6.a.f120754b;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            x92.b bVar = new x92.b(store, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(z0.class, "modelClass");
            rl2.d modelClass = lb.l0.w0(z0.class);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "<this>");
            String e13 = modelClass.e();
            if (e13 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
            }
            this.O = (z0) bVar.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass);
        } else {
            this.O = new z0(false);
        }
        this.O.f18507g = Q();
        this.f18451c.f18317d = this.O;
        Object obj = this.f18470v;
        if ((obj instanceof ma.i) && fragment == null) {
            ma.g savedStateRegistry = ((ma.i) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new androidx.activity.f(this, 3));
            Bundle a13 = savedStateRegistry.a("android:support:fragments");
            if (a13 != null) {
                b0(a13);
            }
        }
        Object obj2 = this.f18470v;
        if (obj2 instanceof g.h) {
            g.g activityResultRegistry = ((g.h) obj2).getActivityResultRegistry();
            String j13 = a.a.j("FragmentManager:", fragment != null ? a.a.p(new StringBuilder(), fragment.mWho, ":") : "");
            this.C = activityResultRegistry.e(a.a.C(j13, "StartActivityForResult"), new h.g(), new l0(this, 1));
            this.D = activityResultRegistry.e(a.a.C(j13, "StartIntentSenderForResult"), new r0(), new l0(this, 2));
            this.E = activityResultRegistry.e(a.a.C(j13, "RequestPermissions"), new h.f(), new l0(this, i13));
        }
        Object obj3 = this.f18470v;
        if (obj3 instanceof d5.c) {
            ((d5.c) obj3).addOnConfigurationChangedListener(this.f18464p);
        }
        Object obj4 = this.f18470v;
        if (obj4 instanceof d5.d) {
            ((d5.d) obj4).addOnTrimMemoryListener(this.f18465q);
        }
        Object obj5 = this.f18470v;
        if (obj5 instanceof c5.f0) {
            ((c5.f0) obj5).addOnMultiWindowModeChangedListener(this.f18466r);
        }
        Object obj6 = this.f18470v;
        if (obj6 instanceof c5.g0) {
            ((c5.g0) obj6).addOnPictureInPictureModeChangedListener(this.f18467s);
        }
        Object obj7 = this.f18470v;
        if ((obj7 instanceof q5.l) && fragment == null) {
            ((q5.l) obj7).addMenuProvider(this.f18468t);
        }
    }

    public final void e0() {
        synchronized (this.f18449a) {
            try {
                if (this.f18449a.size() == 1) {
                    this.f18470v.f18326c.removeCallbacks(this.P);
                    this.f18470v.f18326c.post(this.P);
                    l0();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void f(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f18451c.a(fragment);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (N(fragment)) {
                this.G = true;
            }
        }
    }

    public final void f0(Fragment fragment, boolean z13) {
        ViewGroup I = I(fragment);
        if (I == null || !(I instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) I).b(!z13);
    }

    public final void g() {
        this.f18450b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void g0(Fragment fragment, androidx.lifecycle.r rVar) {
        if (fragment.equals(this.f18451c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = rVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final HashSet h() {
        k kVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f18451c.d().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((d1) it.next()).f18305c.mContainer;
            if (container != null) {
                l0 factory = K();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(l6.b.special_effects_controller_view_tag);
                if (tag instanceof k) {
                    kVar = (k) tag;
                } else {
                    factory.getClass();
                    kVar = new k(container);
                    Intrinsics.checkNotNullExpressionValue(kVar, "factory.createController(container)");
                    container.setTag(l6.b.special_effects_controller_view_tag, kVar);
                }
                hashSet.add(kVar);
            }
        }
        return hashSet;
    }

    public final void h0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f18451c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f18473y;
        this.f18473y = fragment;
        t(fragment2);
        t(this.f18473y);
    }

    public final d1 i(Fragment fragment) {
        String str = fragment.mWho;
        e1 e1Var = this.f18451c;
        d1 d1Var = (d1) e1Var.f18315b.get(str);
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(this.f18462n, e1Var, fragment);
        d1Var2.m(this.f18470v.f18325b.getClassLoader());
        d1Var2.f18307e = this.f18469u;
        return d1Var2;
    }

    public final void i0(Fragment fragment) {
        ViewGroup I = I(fragment);
        if (I != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (I.getTag(l6.b.visible_removing_fragment_view_tag) == null) {
                    I.setTag(l6.b.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) I.getTag(l6.b.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void j(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            e1 e1Var = this.f18451c;
            synchronized (e1Var.f18314a) {
                e1Var.f18314a.remove(fragment);
            }
            fragment.mAdded = false;
            if (N(fragment)) {
                this.G = true;
            }
            i0(fragment);
        }
    }

    public final void k(boolean z13, Configuration configuration) {
        if (z13 && (this.f18470v instanceof d5.c)) {
            k0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z13) {
                    fragment.mChildFragmentManager.k(true, configuration);
                }
            }
        }
    }

    public final void k0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new r1());
        g0 g0Var = this.f18470v;
        if (g0Var == null) {
            try {
                x("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e13) {
                Log.e("FragmentManager", "Failed dumping state", e13);
                throw runtimeException;
            }
        }
        try {
            FragmentActivity.this.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e14) {
            Log.e("FragmentManager", "Failed dumping state", e14);
            throw runtimeException;
        }
    }

    public final boolean l(MenuItem menuItem) {
        if (this.f18469u < 1) {
            return false;
        }
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void l0() {
        synchronized (this.f18449a) {
            try {
                if (!this.f18449a.isEmpty()) {
                    this.f18456h.setEnabled(true);
                    return;
                }
                m0 m0Var = this.f18456h;
                ArrayList arrayList = this.f18452d;
                m0Var.setEnabled(arrayList != null && arrayList.size() > 0 && P(this.f18472x));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean m(Menu menu, MenuInflater menuInflater) {
        if (this.f18469u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z13 = false;
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z13 = true;
            }
        }
        if (this.f18453e != null) {
            for (int i13 = 0; i13 < this.f18453e.size(); i13++) {
                Fragment fragment2 = (Fragment) this.f18453e.get(i13);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f18453e = arrayList;
        return z13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r0 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r6 = this;
            r0 = 1
            r6.f18448J = r0
            r6.A(r0)
            java.util.HashSet r1 = r6.h()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.k r2 = (androidx.fragment.app.k) r2
            r2.l()
            goto Le
        L1e:
            androidx.fragment.app.g0 r1 = r6.f18470v
            boolean r2 = r1 instanceof androidx.lifecycle.u1
            androidx.fragment.app.e1 r3 = r6.f18451c
            if (r2 == 0) goto L2b
            androidx.fragment.app.z0 r0 = r3.f18317d
            boolean r0 = r0.f18506f
            goto L38
        L2b:
            android.content.Context r1 = r1.f18325b
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L3a
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L38:
            if (r0 == 0) goto L69
        L3a:
            java.util.Map r0 = r6.f18458j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.BackStackState r1 = (androidx.fragment.app.BackStackState) r1
            java.util.List r1 = r1.f18230a
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.z0 r4 = r3.f18317d
            r5 = 0
            r4.j(r2, r5)
            goto L56
        L69:
            r0 = -1
            r6.w(r0)
            androidx.fragment.app.g0 r0 = r6.f18470v
            boolean r1 = r0 instanceof d5.d
            if (r1 == 0) goto L7a
            d5.d r0 = (d5.d) r0
            androidx.fragment.app.k0 r1 = r6.f18465q
            r0.removeOnTrimMemoryListener(r1)
        L7a:
            androidx.fragment.app.g0 r0 = r6.f18470v
            boolean r1 = r0 instanceof d5.c
            if (r1 == 0) goto L87
            d5.c r0 = (d5.c) r0
            androidx.fragment.app.k0 r1 = r6.f18464p
            r0.removeOnConfigurationChangedListener(r1)
        L87:
            androidx.fragment.app.g0 r0 = r6.f18470v
            boolean r1 = r0 instanceof c5.f0
            if (r1 == 0) goto L94
            c5.f0 r0 = (c5.f0) r0
            androidx.fragment.app.k0 r1 = r6.f18466r
            r0.removeOnMultiWindowModeChangedListener(r1)
        L94:
            androidx.fragment.app.g0 r0 = r6.f18470v
            boolean r1 = r0 instanceof c5.g0
            if (r1 == 0) goto La1
            c5.g0 r0 = (c5.g0) r0
            androidx.fragment.app.k0 r1 = r6.f18467s
            r0.removeOnPictureInPictureModeChangedListener(r1)
        La1:
            androidx.fragment.app.g0 r0 = r6.f18470v
            boolean r1 = r0 instanceof q5.l
            if (r1 == 0) goto Lb2
            androidx.fragment.app.Fragment r1 = r6.f18472x
            if (r1 != 0) goto Lb2
            q5.l r0 = (q5.l) r0
            androidx.fragment.app.n0 r1 = r6.f18468t
            r0.removeMenuProvider(r1)
        Lb2:
            r0 = 0
            r6.f18470v = r0
            r6.f18471w = r0
            r6.f18472x = r0
            androidx.activity.i0 r1 = r6.f18455g
            if (r1 == 0) goto Lc4
            androidx.fragment.app.m0 r1 = r6.f18456h
            r1.remove()
            r6.f18455g = r0
        Lc4:
            g.d r0 = r6.C
            if (r0 == 0) goto Ld5
            r0.b()
            g.d r0 = r6.D
            r0.b()
            g.d r0 = r6.E
            r0.b()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w0.n():void");
    }

    public final void o(boolean z13) {
        if (z13 && (this.f18470v instanceof d5.d)) {
            k0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z13) {
                    fragment.mChildFragmentManager.o(true);
                }
            }
        }
    }

    public final void p(boolean z13, boolean z14) {
        if (z14 && (this.f18470v instanceof c5.f0)) {
            k0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z13);
                if (z14) {
                    fragment.mChildFragmentManager.p(z13, true);
                }
            }
        }
    }

    public final void q() {
        Iterator it = this.f18451c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.q();
            }
        }
    }

    public final boolean r(MenuItem menuItem) {
        if (this.f18469u < 1) {
            return false;
        }
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void s(Menu menu) {
        if (this.f18469u < 1) {
            return;
        }
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void t(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f18451c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        sb3.append("FragmentManager{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" in ");
        Fragment fragment = this.f18472x;
        if (fragment != null) {
            sb3.append(fragment.getClass().getSimpleName());
            sb3.append("{");
            sb3.append(Integer.toHexString(System.identityHashCode(this.f18472x)));
            sb3.append("}");
        } else {
            g0 g0Var = this.f18470v;
            if (g0Var != null) {
                sb3.append(g0Var.getClass().getSimpleName());
                sb3.append("{");
                sb3.append(Integer.toHexString(System.identityHashCode(this.f18470v)));
                sb3.append("}");
            } else {
                sb3.append("null");
            }
        }
        sb3.append("}}");
        return sb3.toString();
    }

    public final void u(boolean z13, boolean z14) {
        if (z14 && (this.f18470v instanceof c5.g0)) {
            k0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z13);
                if (z14) {
                    fragment.mChildFragmentManager.u(z13, true);
                }
            }
        }
    }

    public final boolean v(Menu menu) {
        boolean z13 = false;
        if (this.f18469u < 1) {
            return false;
        }
        for (Fragment fragment : this.f18451c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z13 = true;
            }
        }
        return z13;
    }

    public final void w(int i13) {
        try {
            this.f18450b = true;
            for (d1 d1Var : this.f18451c.f18315b.values()) {
                if (d1Var != null) {
                    d1Var.f18307e = i13;
                }
            }
            R(i13, false);
            Iterator it = h().iterator();
            while (it.hasNext()) {
                ((k) it.next()).l();
            }
            this.f18450b = false;
            A(true);
        } catch (Throwable th3) {
            this.f18450b = false;
            throw th3;
        }
    }

    public final void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String C = a.a.C(str, "    ");
        e1 e1Var = this.f18451c;
        e1Var.getClass();
        String str2 = str + "    ";
        HashMap hashMap = e1Var.f18315b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (d1 d1Var : hashMap.values()) {
                printWriter.print(str);
                if (d1Var != null) {
                    Fragment fragment = d1Var.f18305c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = e1Var.f18314a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i13 = 0; i13 < size3; i13++) {
                Fragment fragment2 = (Fragment) arrayList.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f18453e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i14 = 0; i14 < size2; i14++) {
                Fragment fragment3 = (Fragment) this.f18453e.get(i14);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i14);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.f18452d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i15 = 0; i15 < size; i15++) {
                a aVar = (a) this.f18452d.get(i15);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i15);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.i(C, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f18457i.get());
        synchronized (this.f18449a) {
            try {
                int size4 = this.f18449a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i16 = 0; i16 < size4; i16++) {
                        Object obj = (t0) this.f18449a.get(i16);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i16);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f18470v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f18471w);
        if (this.f18472x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f18472x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f18469u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f18448J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void y(t0 t0Var, boolean z13) {
        if (!z13) {
            if (this.f18470v == null) {
                if (!this.f18448J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f18449a) {
            try {
                if (this.f18470v == null) {
                    if (!z13) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f18449a.add(t0Var);
                    e0();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void z(boolean z13) {
        if (this.f18450b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f18470v == null) {
            if (!this.f18448J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f18470v.f18326c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z13 && Q()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
