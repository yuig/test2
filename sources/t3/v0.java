package t3;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 extends q5.b {
    public static final g1.t N;
    public g1.u A;
    public final g1.v B;
    public final g1.s C;
    public final g1.s D;
    public final String E;
    public final String F;
    public final j4.m G;
    public final g1.u H;
    public p3 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f116210J;
    public final androidx.activity.d K;
    public final ArrayList L;
    public final r0 M;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f116211d;

    /* renamed from: e, reason: collision with root package name */
    public int f116212e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f116213f;

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f116214g;

    /* renamed from: h, reason: collision with root package name */
    public final long f116215h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f116216i;

    /* renamed from: j, reason: collision with root package name */
    public final f0 f116217j;

    /* renamed from: k, reason: collision with root package name */
    public List f116218k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f116219l;

    /* renamed from: m, reason: collision with root package name */
    public final j0 f116220m;

    /* renamed from: n, reason: collision with root package name */
    public int f116221n;

    /* renamed from: o, reason: collision with root package name */
    public r5.e f116222o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f116223p;

    /* renamed from: q, reason: collision with root package name */
    public final g1.u f116224q;

    /* renamed from: r, reason: collision with root package name */
    public final g1.u f116225r;

    /* renamed from: s, reason: collision with root package name */
    public final g1.p0 f116226s;

    /* renamed from: t, reason: collision with root package name */
    public final g1.p0 f116227t;

    /* renamed from: u, reason: collision with root package name */
    public int f116228u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f116229v;

    /* renamed from: w, reason: collision with root package name */
    public final g1.h f116230w;

    /* renamed from: x, reason: collision with root package name */
    public final co2.m f116231x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f116232y;

    /* renamed from: z, reason: collision with root package name */
    public l0 f116233z;

    static {
        int i13;
        int[] elements = {u2.s.accessibility_custom_action_0, u2.s.accessibility_custom_action_1, u2.s.accessibility_custom_action_2, u2.s.accessibility_custom_action_3, u2.s.accessibility_custom_action_4, u2.s.accessibility_custom_action_5, u2.s.accessibility_custom_action_6, u2.s.accessibility_custom_action_7, u2.s.accessibility_custom_action_8, u2.s.accessibility_custom_action_9, u2.s.accessibility_custom_action_10, u2.s.accessibility_custom_action_11, u2.s.accessibility_custom_action_12, u2.s.accessibility_custom_action_13, u2.s.accessibility_custom_action_14, u2.s.accessibility_custom_action_15, u2.s.accessibility_custom_action_16, u2.s.accessibility_custom_action_17, u2.s.accessibility_custom_action_18, u2.s.accessibility_custom_action_19, u2.s.accessibility_custom_action_20, u2.s.accessibility_custom_action_21, u2.s.accessibility_custom_action_22, u2.s.accessibility_custom_action_23, u2.s.accessibility_custom_action_24, u2.s.accessibility_custom_action_25, u2.s.accessibility_custom_action_26, u2.s.accessibility_custom_action_27, u2.s.accessibility_custom_action_28, u2.s.accessibility_custom_action_29, u2.s.accessibility_custom_action_30, u2.s.accessibility_custom_action_31};
        int i14 = g1.l.f63282a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        g1.t tVar = new g1.t(32);
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i15 = tVar.f63324b;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i15 < 0 || i15 > (i13 = tVar.f63324b)) {
            StringBuilder s13 = a.a.s("Index ", i15, " must be in 0..");
            s13.append(tVar.f63324b);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        tVar.c(i13 + 32);
        int[] iArr = tVar.f63323a;
        int i16 = tVar.f63324b;
        if (i15 != i16) {
            kotlin.collections.z.g(i15 + 32, i15, i16, iArr, iArr);
        }
        kotlin.collections.z.k(elements, iArr, i15, 0, 12);
        tVar.f63324b += 32;
        N = tVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [t3.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [t3.f0] */
    public v0(c0 c0Var) {
        this.f116211d = c0Var;
        int i13 = 0;
        this.f116213f = new r0(this, i13);
        Object systemService = c0Var.getContext().getSystemService("accessibility");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f116214g = accessibilityManager;
        this.f116215h = 100L;
        this.f116216i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: t3.e0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z13) {
                v0 v0Var = v0.this;
                v0Var.f116218k = z13 ? v0Var.f116214g.getEnabledAccessibilityServiceList(-1) : kotlin.collections.q0.f80391a;
            }
        };
        this.f116217j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: t3.f0
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z13) {
                v0 v0Var = v0.this;
                v0Var.f116218k = v0Var.f116214g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f116218k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f116219l = new Handler(Looper.getMainLooper());
        this.f116220m = new j0(this);
        this.f116221n = Integer.MIN_VALUE;
        this.f116224q = new g1.u();
        this.f116225r = new g1.u();
        this.f116226s = new g1.p0(0);
        this.f116227t = new g1.p0(0);
        this.f116228u = -1;
        this.f116230w = new g1.h(0);
        this.f116231x = lb.l0.b(1, null, 6);
        this.f116232y = true;
        g1.u uVar = g1.m.f63284a;
        Intrinsics.g(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A = uVar;
        this.B = new g1.v();
        this.C = new g1.s();
        this.D = new g1.s();
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.G = new j4.m();
        this.H = new g1.u();
        z3.q a13 = c0Var.f115889k.a();
        Intrinsics.g(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.I = new p3(a13, uVar);
        c0Var.addOnAttachStateChangeListener(new g0(this, i13));
        this.K = new androidx.activity.d(this, 4);
        this.L = new ArrayList();
        this.M = new r0(this, 1);
    }

    public static b4.g B(z3.q qVar) {
        b4.g gVar = (b4.g) bs1.c.M0(qVar.f140714d, z3.t.f140756y);
        List list = (List) bs1.c.M0(qVar.f140714d, z3.t.f140753v);
        return gVar == null ? list != null ? (b4.g) CollectionsKt.firstOrNull(list) : null : gVar;
    }

    public static String C(z3.q qVar) {
        b4.g gVar;
        if (qVar == null) {
            return null;
        }
        z3.x xVar = z3.t.f140733b;
        z3.j jVar = qVar.f140714d;
        if (jVar.f140700a.containsKey(xVar)) {
            return kh2.g0.o((List) jVar.c(xVar), ",");
        }
        z3.x xVar2 = z3.t.f140756y;
        LinkedHashMap linkedHashMap = jVar.f140700a;
        if (linkedHashMap.containsKey(xVar2)) {
            b4.g gVar2 = (b4.g) bs1.c.M0(jVar, xVar2);
            if (gVar2 != null) {
                return gVar2.f21571a;
            }
            return null;
        }
        Object obj = linkedHashMap.get(z3.t.f140753v);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        if (list == null || (gVar = (b4.g) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return gVar.f21571a;
    }

    public static final boolean G(z3.h hVar, float f13) {
        Function0 function0 = hVar.f140671a;
        return (f13 < 0.0f && ((Number) function0.invoke()).floatValue() > 0.0f) || (f13 > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) hVar.f140672b.invoke()).floatValue());
    }

    public static final boolean H(z3.h hVar) {
        Function0 function0 = hVar.f140671a;
        float floatValue = ((Number) function0.invoke()).floatValue();
        boolean z13 = hVar.f140673c;
        return (floatValue > 0.0f && !z13) || (((Number) function0.invoke()).floatValue() < ((Number) hVar.f140672b.invoke()).floatValue() && z13);
    }

    public static final boolean I(z3.h hVar) {
        Function0 function0 = hVar.f140671a;
        float floatValue = ((Number) function0.invoke()).floatValue();
        float floatValue2 = ((Number) hVar.f140672b.invoke()).floatValue();
        boolean z13 = hVar.f140673c;
        return (floatValue < floatValue2 && !z13) || (((Number) function0.invoke()).floatValue() > 0.0f && z13);
    }

    public static /* synthetic */ void N(v0 v0Var, int i13, int i14, Integer num, int i15) {
        if ((i15 & 4) != 0) {
            num = null;
        }
        v0Var.M(i13, i14, num, null);
    }

    public static CharSequence V(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i13 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i13 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i13);
                Intrinsics.g(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static boolean z(z3.q qVar) {
        a4.a aVar = (a4.a) bs1.c.M0(qVar.f140714d, z3.t.C);
        z3.x xVar = z3.t.f140751t;
        z3.j jVar = qVar.f140714d;
        z3.g gVar = (z3.g) bs1.c.M0(jVar, xVar);
        boolean z13 = true;
        boolean z14 = aVar != null;
        Object obj = jVar.f140700a.get(z3.t.B);
        if (obj == null) {
            obj = null;
        }
        if (((Boolean) obj) == null) {
            return z14;
        }
        if (gVar != null && z3.g.a(gVar.f140670a, 4)) {
            z13 = z14;
        }
        return z13;
    }

    public final String A(z3.q qVar) {
        Object M0 = bs1.c.M0(qVar.f140714d, z3.t.f140734c);
        z3.x xVar = z3.t.C;
        z3.j jVar = qVar.f140714d;
        a4.a aVar = (a4.a) bs1.c.M0(jVar, xVar);
        z3.x xVar2 = z3.t.f140751t;
        LinkedHashMap linkedHashMap = jVar.f140700a;
        Object obj = linkedHashMap.get(xVar2);
        if (obj == null) {
            obj = null;
        }
        z3.g gVar = (z3.g) obj;
        c0 c0Var = this.f116211d;
        if (aVar != null) {
            int i13 = o0.f116106a[aVar.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3 && M0 == null) {
                        M0 = c0Var.getContext().getResources().getString(u2.t.indeterminate);
                    }
                } else if (gVar != null && z3.g.a(gVar.b(), 2) && M0 == null) {
                    M0 = c0Var.getContext().getResources().getString(u2.t.state_off);
                }
            } else if (gVar != null && z3.g.a(gVar.b(), 2) && M0 == null) {
                M0 = c0Var.getContext().getResources().getString(u2.t.state_on);
            }
        }
        Object obj2 = linkedHashMap.get(z3.t.B);
        if (obj2 == null) {
            obj2 = null;
        }
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((gVar == null || !z3.g.a(gVar.b(), 4)) && M0 == null) {
                M0 = booleanValue ? c0Var.getContext().getResources().getString(u2.t.selected) : c0Var.getContext().getResources().getString(u2.t.not_selected);
            }
        }
        Object obj3 = linkedHashMap.get(z3.t.f140735d);
        z3.f fVar = (z3.f) (obj3 != null ? obj3 : null);
        if (fVar != null) {
            if (fVar != z3.f.f140666d) {
                if (M0 == null) {
                    ql2.h b13 = fVar.b();
                    float a13 = ((Number) b13.d()).floatValue() - ((Number) b13.c()).floatValue() == 0.0f ? 0.0f : (fVar.a() - ((Number) b13.c()).floatValue()) / (((Number) b13.d()).floatValue() - ((Number) b13.c()).floatValue());
                    if (a13 < 0.0f) {
                        a13 = 0.0f;
                    }
                    if (a13 > 1.0f) {
                        a13 = 1.0f;
                    }
                    M0 = c0Var.getContext().getResources().getString(u2.t.template_percent, Integer.valueOf(a13 == 0.0f ? 0 : a13 == 1.0f ? 100 : ql2.s.g(Math.round(a13 * 100), 1, 99)));
                }
            } else if (M0 == null) {
                M0 = c0Var.getContext().getResources().getString(u2.t.in_progress);
            }
        }
        if (linkedHashMap.containsKey(z3.t.f140756y)) {
            M0 = r(qVar);
        }
        return (String) M0;
    }

    public final boolean D() {
        return this.f116214g.isEnabled() && (this.f116218k.isEmpty() ^ true);
    }

    public final boolean E(z3.q qVar) {
        List list = (List) bs1.c.M0(qVar.f140714d, z3.t.f140733b);
        boolean z13 = ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) == null && B(qVar) == null && A(qVar) == null && !z(qVar)) ? false : true;
        if (qVar.f140714d.f140701b) {
            return true;
        }
        if (!qVar.f140715e && qVar.l().isEmpty()) {
            if (ao2.m0.v(qVar.f140713c, z3.o.f140707j) == null && z13) {
                return true;
            }
        }
        return false;
    }

    public final void F(s3.k0 k0Var) {
        if (this.f116230w.add(k0Var)) {
            this.f116231x.g(Unit.f80348a);
        }
    }

    public final int J(int i13) {
        if (i13 == this.f116211d.f115889k.a().f140717g) {
            return -1;
        }
        return i13;
    }

    public final void K(z3.q qVar, p3 p3Var) {
        int[] iArr = g1.n.f63289a;
        g1.v vVar = new g1.v();
        List i13 = z3.q.i(qVar, true, 4);
        int size = i13.size();
        int i14 = 0;
        while (true) {
            s3.k0 k0Var = qVar.f140713c;
            if (i14 >= size) {
                g1.v vVar2 = p3Var.f116160b;
                int[] iArr2 = vVar2.f63332b;
                long[] jArr = vVar2.f63331a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j13 = jArr[i15];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j13 & 255) < 128 && !vVar.c(iArr2[(i15 << 3) + i17])) {
                                    F(k0Var);
                                    return;
                                }
                                j13 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            }
                        }
                        if (i15 == length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                List i18 = z3.q.i(qVar, true, 4);
                int size2 = i18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    z3.q qVar2 = (z3.q) i18.get(i19);
                    if (w().b(qVar2.f140717g)) {
                        Object h10 = this.H.h(qVar2.f140717g);
                        Intrinsics.f(h10);
                        K(qVar2, (p3) h10);
                    }
                }
                return;
            }
            z3.q qVar3 = (z3.q) i13.get(i14);
            if (w().b(qVar3.f140717g)) {
                g1.v vVar3 = p3Var.f116160b;
                int i23 = qVar3.f140717g;
                if (!vVar3.c(i23)) {
                    F(k0Var);
                    return;
                }
                vVar.a(i23);
            }
            i14++;
        }
    }

    public final boolean L(AccessibilityEvent accessibilityEvent) {
        if (!D()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f116223p = true;
        }
        try {
            return ((Boolean) this.f116213f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f116223p = false;
        }
    }

    public final boolean M(int i13, int i14, Integer num, List list) {
        if (i13 == Integer.MIN_VALUE || !D()) {
            return false;
        }
        AccessibilityEvent q13 = q(i13, i14);
        if (num != null) {
            q13.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            q13.setContentDescription(kh2.g0.o(list, ","));
        }
        Trace.beginSection("sendEvent");
        try {
            return L(q13);
        } finally {
            Trace.endSection();
        }
    }

    public final void O(int i13, int i14, String str) {
        AccessibilityEvent q13 = q(J(i13), 32);
        q13.setContentChangeTypes(i14);
        if (str != null) {
            q13.getText().add(str);
        }
        L(q13);
    }

    public final void P(int i13) {
        l0 l0Var = this.f116233z;
        if (l0Var != null) {
            if (i13 != l0Var.d().f140717g) {
                return;
            }
            if (SystemClock.uptimeMillis() - l0Var.f() <= 1000) {
                AccessibilityEvent q13 = q(J(l0Var.d().f140717g), 131072);
                q13.setFromIndex(l0Var.b());
                q13.setToIndex(l0Var.e());
                q13.setAction(l0Var.a());
                q13.setMovementGranularity(l0Var.c());
                q13.getText().add(C(l0Var.d()));
                L(q13);
            }
        }
        this.f116233z = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x00c8, code lost:
    
        if (r5 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05c4, code lost:
    
        if (r21 != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0584, code lost:
    
        if (r3 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0589, code lost:
    
        if (r3 == null) goto L222;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(g1.u r40) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v0.Q(g1.u):void");
    }

    public final void R(s3.k0 k0Var, g1.v vVar) {
        z3.j p13;
        s3.k0 u13;
        if (k0Var.G() && !this.f116211d.k().f116251b.containsKey(k0Var)) {
            if (!k0Var.f110837y.d(8)) {
                k0Var = ao2.m0.u(k0Var, w.f116246l);
            }
            if (k0Var == null || (p13 = k0Var.p()) == null) {
                return;
            }
            if (!p13.f140701b && (u13 = ao2.m0.u(k0Var, w.f116245k)) != null) {
                k0Var = u13;
            }
            int i13 = k0Var.f110814b;
            if (vVar.a(i13)) {
                N(this, J(i13), 2048, 1, 8);
            }
        }
    }

    public final void S(s3.k0 k0Var) {
        if (k0Var.G() && !this.f116211d.k().f116251b.containsKey(k0Var)) {
            int i13 = k0Var.f110814b;
            z3.h hVar = (z3.h) this.f116224q.h(i13);
            z3.h hVar2 = (z3.h) this.f116225r.h(i13);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent q13 = q(i13, 4096);
            if (hVar != null) {
                q13.setScrollX((int) ((Number) hVar.f140671a.invoke()).floatValue());
                q13.setMaxScrollX((int) ((Number) hVar.f140672b.invoke()).floatValue());
            }
            if (hVar2 != null) {
                q13.setScrollY((int) ((Number) hVar2.f140671a.invoke()).floatValue());
                q13.setMaxScrollY((int) ((Number) hVar2.f140672b.invoke()).floatValue());
            }
            L(q13);
        }
    }

    public final boolean T(z3.q qVar, int i13, int i14, boolean z13) {
        String C;
        z3.x xVar = z3.i.f140681h;
        z3.j jVar = qVar.f140714d;
        if (jVar.f140700a.containsKey(xVar) && ao2.m0.d(qVar)) {
            kl2.l lVar = (kl2.l) ((z3.a) jVar.c(xVar)).f140659b;
            if (lVar != null) {
                return ((Boolean) lVar.invoke(Integer.valueOf(i13), Integer.valueOf(i14), Boolean.valueOf(z13))).booleanValue();
            }
            return false;
        }
        if ((i13 == i14 && i14 == this.f116228u) || (C = C(qVar)) == null) {
            return false;
        }
        if (i13 < 0 || i13 != i14 || i14 > C.length()) {
            i13 = -1;
        }
        this.f116228u = i13;
        boolean z14 = C.length() > 0;
        int i15 = qVar.f140717g;
        L(s(J(i15), z14 ? Integer.valueOf(this.f116228u) : null, z14 ? Integer.valueOf(this.f116228u) : null, z14 ? Integer.valueOf(C.length()) : null, C));
        P(i15);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0 A[LOOP:1: B:8:0x0030->B:26:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[EDGE_INSN: B:27:0x00d4->B:34:0x00d4 BREAK  A[LOOP:1: B:8:0x0030->B:26:0x00d0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList U(java.util.ArrayList r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v0.U(java.util.ArrayList, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015b, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v0.W():void");
    }

    @Override // q5.b
    public final androidx.recyclerview.widget.y1 b(View view) {
        return this.f116220m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i13, r5.e eVar, String str, Bundle bundle) {
        z3.q qVar;
        RectF rectF;
        q3 q3Var = (q3) w().h(i13);
        if (q3Var == null || (qVar = q3Var.f116173a) == null) {
            return;
        }
        String C = C(qVar);
        boolean d2 = Intrinsics.d(str, this.E);
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f106231a;
        if (d2) {
            int g13 = this.C.g(i13);
            if (g13 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, g13);
                return;
            }
            return;
        }
        if (Intrinsics.d(str, this.F)) {
            int g14 = this.D.g(i13);
            if (g14 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, g14);
                return;
            }
            return;
        }
        z3.x xVar = z3.i.f140674a;
        z3.j jVar = qVar.f140714d;
        s3.q1 q1Var = null;
        if (!jVar.f140700a.containsKey(xVar) || bundle == null || !Intrinsics.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            z3.x xVar2 = z3.t.f140752u;
            LinkedHashMap linkedHashMap = jVar.f140700a;
            if (!linkedHashMap.containsKey(xVar2) || bundle == null || !Intrinsics.d(str, "androidx.compose.ui.semantics.testTag")) {
                if (Intrinsics.d(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, qVar.f140717g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(xVar2);
                String str2 = (String) (obj == null ? null : obj);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i15 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i15 > 0 && i14 >= 0) {
            if (i14 < (C != null ? C.length() : Integer.MAX_VALUE)) {
                b4.m0 c13 = r3.c(jVar);
                if (c13 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = i14 + i16;
                    if (i17 >= c13.d().c().f21571a.length()) {
                        arrayList.add(q1Var);
                    } else {
                        a3.d b13 = c13.b(i17);
                        s3.q1 c14 = qVar.c();
                        long j13 = 0;
                        if (c14 != null) {
                            if (!c14.X0().f120054m) {
                                c14 = q1Var;
                            }
                            if (c14 != null) {
                                j13 = c14.c0(0L);
                            }
                        }
                        a3.d h10 = b13.h(j13);
                        a3.d f13 = qVar.f();
                        a3.d e13 = h10.f(f13) ? h10.e(f13) : q1Var;
                        if (e13 != 0) {
                            long d13 = com.bumptech.glide.c.d(e13.f484a, e13.f485b);
                            c0 c0Var = this.f116211d;
                            long t13 = c0Var.t(d13);
                            long t14 = c0Var.t(com.bumptech.glide.c.d(e13.f486c, e13.f487d));
                            rectF = new RectF(a3.c.d(t13), a3.c.e(t13), a3.c.d(t14), a3.c.e(t14));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i16++;
                    q1Var = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect m(q3 q3Var) {
        Rect rect = q3Var.f116174b;
        long d2 = com.bumptech.glide.c.d(rect.left, rect.top);
        c0 c0Var = this.f116211d;
        long t13 = c0Var.t(d2);
        long t14 = c0Var.t(com.bumptech.glide.c.d(rect.right, rect.bottom));
        return new Rect((int) Math.floor(a3.c.d(t13)), (int) Math.floor(a3.c.e(t13)), (int) Math.ceil(a3.c.d(t14)), (int) Math.ceil(a3.c.e(t14)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:14:0x0059, B:19:0x006c, B:21:0x0074, B:24:0x007f, B:26:0x0084, B:28:0x0093, B:30:0x009a, B:31:0x00a3, B:40:0x0042), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(bl2.c r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v0.n(bl2.c):java.lang.Object");
    }

    public final boolean o(int i13, long j13, boolean z13) {
        z3.x xVar;
        int i14;
        z3.h hVar;
        long j14 = j13;
        int i15 = 0;
        if (!Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        g1.u w13 = w();
        if (!a3.c.b(j14, y2.h.f136670b) && a3.c.f(j13)) {
            if (z13) {
                xVar = z3.t.f140748q;
            } else {
                if (z13) {
                    throw new NoWhenBranchMatchedException();
                }
                xVar = z3.t.f140747p;
            }
            Object[] objArr = w13.f63327c;
            long[] jArr = w13.f63325a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i16 = 0;
                boolean z14 = false;
                while (true) {
                    long j15 = jArr[i16];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = i15;
                        while (i19 < i18) {
                            if ((j15 & 255) < 128) {
                                q3 q3Var = (q3) objArr[(i16 << 3) + i19];
                                if (kh2.n3.O0(q3Var.f116174b).a(j14) && (hVar = (z3.h) bs1.c.M0(q3Var.f116173a.f140714d, xVar)) != null) {
                                    boolean z15 = hVar.f140673c;
                                    int i23 = z15 ? -i13 : i13;
                                    Function0 function0 = hVar.f140671a;
                                    if ((i13 != 0 || !z15) && i23 >= 0 ? ((Number) function0.invoke()).floatValue() < ((Number) hVar.f140672b.invoke()).floatValue() : ((Number) function0.invoke()).floatValue() > 0.0f) {
                                        z14 = true;
                                    }
                                }
                                i14 = 8;
                            } else {
                                i14 = i17;
                            }
                            j15 >>= i14;
                            i19++;
                            i17 = i14;
                            j14 = j13;
                        }
                        if (i18 != i17) {
                            break;
                        }
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16++;
                    j14 = j13;
                    i15 = 0;
                }
                return z14;
            }
        }
        return false;
    }

    public final void p() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (D()) {
                K(this.f116211d.f115889k.a(), this.I);
            }
            Unit unit = Unit.f80348a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                Q(w());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    W();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final AccessibilityEvent q(int i13, int i14) {
        q3 q3Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i14);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        c0 c0Var = this.f116211d;
        obtain.setPackageName(c0Var.getContext().getPackageName());
        obtain.setSource(c0Var, i13);
        if (D() && (q3Var = (q3) w().h(i13)) != null) {
            obtain.setPassword(q3Var.f116173a.f140714d.f140700a.containsKey(z3.t.D));
        }
        return obtain;
    }

    public final String r(z3.q qVar) {
        z3.j j13 = new z3.q(qVar.f140711a, true, qVar.f140713c, qVar.f140714d).j();
        Collection collection = (Collection) bs1.c.M0(j13, z3.t.f140733b);
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        z3.x xVar = z3.t.f140753v;
        LinkedHashMap linkedHashMap = j13.f140700a;
        Object obj = linkedHashMap.get(xVar);
        if (obj == null) {
            obj = null;
        }
        Collection collection2 = (Collection) obj;
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        Object obj2 = linkedHashMap.get(z3.t.f140756y);
        if (obj2 == null) {
            obj2 = null;
        }
        CharSequence charSequence = (CharSequence) obj2;
        if (charSequence == null || charSequence.length() == 0) {
            return this.f116211d.getContext().getResources().getString(u2.t.state_empty);
        }
        return null;
    }

    public final AccessibilityEvent s(int i13, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent q13 = q(i13, 8192);
        if (num != null) {
            q13.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            q13.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            q13.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            q13.getText().add(charSequence);
        }
        return q13;
    }

    public final void t(z3.q qVar, ArrayList arrayList, g1.u uVar) {
        boolean e13 = ao2.m0.e(qVar);
        Object obj = qVar.f140714d.f140700a.get(z3.t.f140744m);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i13 = qVar.f140717g;
        if ((booleanValue || E(qVar)) && w().c(i13)) {
            arrayList.add(qVar);
        }
        if (booleanValue) {
            uVar.l(i13, U(CollectionsKt.H0(z3.q.i(qVar, false, 7)), e13));
            return;
        }
        List i14 = z3.q.i(qVar, false, 7);
        int size = i14.size();
        for (int i15 = 0; i15 < size; i15++) {
            t((z3.q) i14.get(i15), arrayList, uVar);
        }
    }

    public final int u(z3.q qVar) {
        z3.x xVar = z3.t.f140733b;
        z3.j jVar = qVar.f140714d;
        if (!jVar.f140700a.containsKey(xVar)) {
            z3.x xVar2 = z3.t.f140757z;
            if (jVar.f140700a.containsKey(xVar2)) {
                return (int) (4294967295L & ((b4.p0) jVar.c(xVar2)).f21641a);
            }
        }
        return this.f116228u;
    }

    public final int v(z3.q qVar) {
        z3.x xVar = z3.t.f140733b;
        z3.j jVar = qVar.f140714d;
        if (!jVar.f140700a.containsKey(xVar)) {
            z3.x xVar2 = z3.t.f140757z;
            if (jVar.f140700a.containsKey(xVar2)) {
                return (int) (((b4.p0) jVar.c(xVar2)).f21641a >> 32);
            }
        }
        return this.f116228u;
    }

    public final g1.u w() {
        if (this.f116232y) {
            this.f116232y = false;
            this.A = r3.a(this.f116211d.f115889k);
            if (D()) {
                g1.s sVar = this.C;
                sVar.b();
                g1.s sVar2 = this.D;
                sVar2.b();
                q3 q3Var = (q3) w().h(-1);
                z3.q qVar = q3Var != null ? q3Var.f116173a : null;
                Intrinsics.f(qVar);
                ArrayList U = U(kotlin.collections.f0.l(qVar), ao2.m0.e(qVar));
                int i13 = kotlin.collections.f0.i(U);
                int i14 = 1;
                if (1 <= i13) {
                    while (true) {
                        int i15 = ((z3.q) U.get(i14 - 1)).f140717g;
                        int i16 = ((z3.q) U.get(i14)).f140717g;
                        sVar.j(i15, i16);
                        sVar2.j(i16, i15);
                        if (i14 == i13) {
                            break;
                        }
                        i14++;
                    }
                }
            }
        }
        return this.A;
    }

    public final String x() {
        return this.F;
    }

    public final String y() {
        return this.E;
    }
}
