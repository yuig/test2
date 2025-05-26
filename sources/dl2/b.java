package dl2;

import a.cb;
import ac2.s0;
import am2.c0;
import am2.d0;
import am2.i0;
import am2.m;
import am2.n0;
import am2.w0;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao2.j0;
import ao2.m2;
import ao2.o1;
import ao2.o2;
import ao2.v0;
import ao2.w2;
import bk1.a2;
import co2.y;
import com.google.common.util.concurrent.m0;
import com.pinterest.activity.PinterestActivity;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h01;
import com.pinterest.api.model.ke0;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.v2;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wt;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import df.j1;
import dm2.r0;
import dm2.t0;
import dm2.u0;
import ek1.r1;
import ey.j3;
import gk1.x0;
import h32.a4;
import h32.d4;
import h32.f1;
import hk1.t;
import hs1.w;
import hs1.x;
import i1.a1;
import i2.f2;
import im2.k0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import kl2.k;
import kl2.l;
import kl2.o;
import kl2.p;
import kl2.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lb.l0;
import lh0.g2;
import lh0.k4;
import lh0.z3;
import ni1.n2;
import ni1.y2;
import nm.a0;
import nm.q;
import nm.u;
import nt.k2;
import okhttp3.Headers;
import pk.f3;
import pk.g3;
import pk.h3;
import pn2.b0;
import pn2.b1;
import pn2.c1;
import pn2.d1;
import pn2.h0;
import pn2.i1;
import pn2.q1;
import pn2.t1;
import pn2.v;
import pn2.v1;
import pn2.w1;
import ql2.s;
import s3.n1;
import tm2.g1;
import wa2.g0;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a */
    public static n2 f55292a = null;

    /* renamed from: b */
    public static boolean f55293b = true;

    /* renamed from: c */
    public static boolean f55294c;

    /* renamed from: d */
    public static Thread f55295d;

    public static int A(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 |= ((Number) it.next()).intValue();
        }
        return i13;
    }

    public static final String A0(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        String Z2 = wy0Var.Z2();
        String U2 = wy0Var.U2();
        String P3 = wy0Var.P3();
        String z43 = wy0Var.z4();
        return (Z2 == null || z.j(Z2)) ? (U2 == null || z.j(U2)) ? (P3 == null || z.j(P3)) ? (z43 == null || z.j(z43)) ? "" : z43 : P3 : U2 : Z2;
    }

    public static final boolean A1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        g92.d f13 = f1(context);
        Intrinsics.checkNotNullParameter(f13, "<this>");
        return f13 == g92.d.CALICO || f13 == g92.d.CALICO_0_0_1_BETA_7;
    }

    public static final void A2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        lm1.b FONT_BOLD = te0.i.f117497d;
        Intrinsics.checkNotNullExpressionValue(FONT_BOLD, "FONT_BOLD");
        B2(textView, FONT_BOLD);
    }

    public static final Long B(long j13) {
        return new Long(j13);
    }

    public static final ArrayList B0(wy0 wy0Var) {
        RandomAccess randomAccess;
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Map F2 = wy0Var.F2();
        if (F2 == null || F2.isEmpty()) {
            randomAccess = q0.f80391a;
        } else {
            ArrayList l03 = l0("345x", F2);
            boolean z13 = !l03.isEmpty();
            randomAccess = l03;
            if (!z13) {
                randomAccess = l0("200x", F2);
            }
        }
        arrayList.addAll((Collection) randomAccess);
        arrayList.addAll(Z0(wy0Var));
        return arrayList;
    }

    public static final boolean B1(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Boolean A2 = wy0Var.A2();
        Intrinsics.checkNotNullExpressionValue(A2, "getConnectedToFacebook(...)");
        if (A2.booleanValue()) {
            Boolean T2 = wy0Var.T2();
            Intrinsics.checkNotNullExpressionValue(T2, "getFacebookPublishStreamEnabled(...)");
            if (T2.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void B2(TextView textView, lm1.b font) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(font, "font");
        te0.b bVar = new te0.b(textView);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTypeface(te0.g.a(context, font, bVar, 8));
    }

    public static final LinkedHashSet C(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i13 = 0; i13 < readInt; i13++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new kb.f(readBoolean, uri));
                    }
                    Unit unit = Unit.f80348a;
                    J(objectInputStream, null);
                } finally {
                }
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            Unit unit2 = Unit.f80348a;
            J(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    public static final s92.c C0(x xVar, Headers headers) {
        int i13 = xVar == null ? -1 : w.f70080a[xVar.ordinal()];
        if (i13 == 1) {
            return s92.c.LOCAL_MEMORY;
        }
        if (i13 == 2) {
            return s92.c.LOCAL_DISK;
        }
        if (i13 != 3) {
            return s92.c.UNKNOWN;
        }
        String c13 = headers != null ? headers.c("x-pinterest-cache") : null;
        return (c13 == null || z.j(c13)) ? s92.c.CDN_CACHE_MISS : z.h(c13, "HIT", false) ? s92.c.CDN_CACHE_HIT : s92.c.CDN_CACHE_MISS;
    }

    public static final boolean C1(a2 a2Var) {
        Intrinsics.checkNotNullParameter(a2Var, "<this>");
        String str = (String) a2Var.Y.get("android_dco_cpd");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static final void C2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        lm1.b FONT_NORMAL = te0.i.f117496c;
        Intrinsics.checkNotNullExpressionValue(FONT_NORMAL, "FONT_NORMAL");
        B2(textView, FONT_NORMAL);
    }

    public static final float D(bb2.f fixedHeightScaleType, int i13, int i14, float f13, float f14) {
        Intrinsics.checkNotNullParameter(fixedHeightScaleType, "fixedHeightScaleType");
        float f15 = f13 / i13;
        float f16 = f14 / i14;
        int i15 = bb2.d.f22602a[fixedHeightScaleType.ordinal()];
        if (i15 == 1) {
            return Math.min(f15, f16);
        }
        if (i15 == 2) {
            return Math.max(f15, f16);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float D0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public static final boolean D1(r1 r1Var) {
        Intrinsics.checkNotNullParameter(r1Var, "<this>");
        String str = (String) r1Var.f59339a0.get("android_dco_cpd");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static final boolean D2(f30 f30Var, g0 shoppingGridConfigModel, boolean z13, int i13) {
        v2 s13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(shoppingGridConfigModel, "shoppingGridConfigModel");
        if (shoppingGridConfigModel.f128722d || z13) {
            Set set = b40.f35967a;
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            Integer K = b40.K(i13, f30Var);
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            se0 M = b40.M(i13, f30Var);
            String str = null;
            if (M != null && (s13 = M.s()) != null) {
                str = s13.h();
            }
            if (str != null && b40.L(i13, f30Var) > 0.0f && K != null && K.intValue() > 0 && !H2(f30Var, shoppingGridConfigModel.f128729k) && !J2(f30Var, shoppingGridConfigModel.f128730l)) {
                return true;
            }
        }
        return false;
    }

    public static final void E(j0 j0Var, CancellationException cancellationException) {
        o1 o1Var = (o1) j0Var.getCoroutineContext().get(ao2.g0.f20154b);
        if (o1Var != null) {
            o1Var.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + j0Var).toString());
        }
    }

    public static final float E0(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return D0(context, i13);
    }

    public static final boolean E1(fk1.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String str = (String) wVar.f62402w.get("android_dco_cpd");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static final boolean E2(f30 f30Var, g0 shoppingGridConfigModel, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(shoppingGridConfigModel, "shoppingGridConfigModel");
        if (shoppingGridConfigModel.f128737s) {
            return false;
        }
        if (shoppingGridConfigModel.f128722d || z13) {
            if (!b40.m0(f30Var) || H2(f30Var, shoppingGridConfigModel.f128729k) || J2(f30Var, shoppingGridConfigModel.f128730l)) {
                return false;
            }
        } else {
            if (!z14) {
                return false;
            }
            Set set = b40.f35967a;
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            Integer V = b40.V(f30Var);
            if (b40.U(f30Var) == null || b40.W(f30Var) <= 0.0f || V == null || V.intValue() <= 0 || H2(f30Var, shoppingGridConfigModel.f128729k) || J2(f30Var, shoppingGridConfigModel.f128730l)) {
                return false;
            }
        }
        return true;
    }

    public static void F(vl2.g gVar, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (l0.o0(gVar) == args.length) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Callable expects ");
        sb3.append(l0.o0(gVar));
        sb3.append(" arguments, but ");
        throw new IllegalArgumentException(a.a.n(sb3, args.length, " were provided."));
    }

    public static final int F0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ml2.c.c(D0(context, i13));
    }

    public static final boolean F1(x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        String str = (String) x0Var.M.get("android_dco_cpd");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static final boolean F2(f30 f30Var, g0 shoppingGridConfigModel, boolean z13) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(shoppingGridConfigModel, "shoppingGridConfigModel");
        return (!shoppingGridConfigModel.f128723e || z13 || H2(f30Var, shoppingGridConfigModel.f128729k) || J2(f30Var, shoppingGridConfigModel.f128730l)) ? false : true;
    }

    public static void G(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static final int G0(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return ml2.c.c(E0(view, i13));
    }

    public static final boolean G1(y2 y2Var) {
        Intrinsics.checkNotNullParameter(y2Var, "<this>");
        String str = (String) y2Var.T.get("android_dco_cpd");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static final boolean G2(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Boolean s43 = wy0Var.s4();
        Intrinsics.checkNotNullExpressionValue(s43, "getShouldShowMessaging(...)");
        return s43.booleanValue();
    }

    public static void H(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Object H0(Future future) {
        if (future.isDone()) {
            return com.bumptech.glide.c.c0(future);
        }
        throw new IllegalStateException(bs1.c.q1("Future was expected to be done: %s", future));
    }

    public static final boolean H1(am2.j0 j0Var, ym2.c fqName) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return j0Var instanceof n0 ? ((n0) j0Var).b(fqName) : k2(j0Var, fqName).isEmpty();
    }

    public static final boolean H2(f30 f30Var, boolean z13) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean Z4 = f30Var.Z4();
        Intrinsics.checkNotNullExpressionValue(Z4, "getIsOosProduct(...)");
        return Z4.booleanValue() && z13;
    }

    public static void I(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final String I0(Set experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        u uVar = new u();
        q qVar = new q();
        Iterator it = experiments.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            u uVar2 = new u();
            uVar2.u("key", str);
            qVar.t(uVar2);
        }
        uVar.r("experiments", qVar);
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return sVar;
    }

    public static boolean I1(am2.x xVar) {
        if (xVar == null) {
            a(29);
            throw null;
        }
        if (xVar.c() == am2.c.SYNTHESIZED) {
            m g13 = xVar.g();
            int i13 = bn2.e.f23579a;
            if (bn2.e.p(g13, am2.h.ENUM_CLASS)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean I2(f30 f30Var, g0 g0Var, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (z14 || !z13) {
            return false;
        }
        if (!b40.I0(f30Var)) {
            if (g0Var == null) {
                return false;
            }
            if (!H2(f30Var, g0Var.f128729k) && !J2(f30Var, g0Var.f128730l)) {
                return false;
            }
        }
        return true;
    }

    public static final void J(Closeable closeable, Throwable th3) {
        if (closeable != null) {
            if (th3 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th4) {
                xk2.f.a(th3, th4);
            }
        }
    }

    public static a0 J0(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return a0.ALLOW;
        }
        ep.b.A(it.next());
        throw null;
    }

    public static final boolean J1(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        return b0Var.z0() instanceof v;
    }

    public static final boolean J2(f30 f30Var, boolean z13) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean g53 = f30Var.g5();
        Intrinsics.checkNotNullExpressionValue(g53, "getIsStaleProduct(...)");
        return g53.booleanValue() && z13;
    }

    public static final void K(am2.j0 j0Var, ym2.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        if (j0Var instanceof n0) {
            ((n0) j0Var).a(fqName, packageFragments);
        } else {
            packageFragments.addAll(j0Var.c(fqName));
        }
    }

    public static final float K0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue.getFloat();
    }

    public static boolean K1(int i13, Object obj) {
        int i14;
        if (!(obj instanceof xk2.g)) {
            return false;
        }
        if (obj instanceof n) {
            i14 = ((n) obj).getArity();
        } else if (obj instanceof Function0) {
            i14 = 0;
        } else if (obj instanceof Function1) {
            i14 = 1;
        } else if (obj instanceof Function2) {
            i14 = 2;
        } else if (obj instanceof l) {
            i14 = 3;
        } else if (obj instanceof kl2.m) {
            i14 = 4;
        } else if (obj instanceof kl2.n) {
            i14 = 5;
        } else if (obj instanceof o) {
            i14 = 6;
        } else if (obj instanceof p) {
            i14 = 7;
        } else if (obj instanceof kl2.q) {
            i14 = 8;
        } else if (obj instanceof r) {
            i14 = 9;
        } else if (obj instanceof kl2.a) {
            i14 = 10;
        } else if (obj instanceof kl2.b) {
            i14 = 11;
        } else {
            boolean z13 = obj instanceof ul2.g;
            i14 = z13 ? 12 : obj instanceof kl2.c ? 13 : obj instanceof kl2.d ? 14 : obj instanceof kl2.e ? 15 : obj instanceof kl2.f ? 16 : obj instanceof kl2.g ? 17 : obj instanceof kl2.h ? 18 : obj instanceof kl2.i ? 19 : obj instanceof kl2.j ? 20 : obj instanceof k ? 21 : z13 ? 22 : -1;
        }
        return i14 == i13;
    }

    public static final List K2(ArrayList arrayList) {
        int i13;
        int i14;
        nc2.i iVar;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        List w03 = CollectionsKt.w0(arrayList);
        if (w03.size() < 3) {
            return w03;
        }
        List list = w03;
        boolean z13 = list instanceof Collection;
        Object obj = null;
        if (z13 && list.isEmpty()) {
            i13 = 0;
        } else {
            Iterator it = list.iterator();
            i13 = 0;
            while (it.hasNext()) {
                if (((s0) it.next()).f2056d.f2077e == nc2.i.HEVC && (i13 = i13 + 1) < 0) {
                    f0.o();
                    throw null;
                }
            }
        }
        if (z13 && list.isEmpty()) {
            i14 = 0;
        } else {
            Iterator it2 = list.iterator();
            i14 = 0;
            while (it2.hasNext()) {
                if (((s0) it2.next()).f2056d.f2077e == nc2.i.AVC && (i14 = i14 + 1) < 0) {
                    f0.o();
                    throw null;
                }
            }
        }
        if (i13 == 1 && i14 > 1) {
            iVar = nc2.i.HEVC;
        } else {
            if (i14 != 1 || i13 <= 1) {
                return w03;
            }
            iVar = nc2.i.AVC;
        }
        ArrayList H0 = CollectionsKt.H0(w03);
        Iterator it3 = H0.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((s0) next).f2056d.f2077e == iVar) {
                obj = next;
                break;
            }
        }
        s0 s0Var = (s0) obj;
        if (s0Var == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        H0.remove(s0Var);
        H0.add(0, s0Var);
        return H0;
    }

    public static final bm2.i L(bm2.i first, bm2.i second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new bm2.j(new bm2.i[]{first, second});
    }

    public static final List L0(TypedArray typedArray, int i13) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        int i14 = typedArray.getInt(i13, 0);
        if (i14 == 0) {
            return null;
        }
        return (List) z0.g(new Pair(1, e0.b(1)), new Pair(2, e0.b(2)), new Pair(3, e0.b(3)), new Pair(4, e0.b(4)), new Pair(5, e0.b(5)), new Pair(6, e0.b(6)), new Pair(7, e0.b(7)), new Pair(268435458, f0.j(2, 268435456)), new Pair(268435459, f0.j(3, 268435456)), new Pair(268435460, f0.j(4, 268435456)), new Pair(268435461, f0.j(5, 268435456)), new Pair(268435462, f0.j(6, 268435456))).get(Integer.valueOf(i14));
    }

    public static final boolean L1(wy0 wy0Var) {
        List W3;
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        if (wy0Var.H3()) {
            Boolean G3 = wy0Var.G3();
            Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
            if (G3.booleanValue()) {
                boolean[] zArr = wy0Var.V1;
                if (zArr.length > 104 && zArr[104] && (W3 = wy0Var.W3()) != null && !W3.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int L2(kb.s0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (tb.b0.f116955a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Uri M(Uri uri) {
        String lastPathSegment;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!j1.f1(uri)) {
            return uri;
        }
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        boolean z13 = false;
        if (uri.getQuery() == null && uri.getFragment() == null && (lastPathSegment = uri.getLastPathSegment()) != null && !StringsKt.E(lastPathSegment, ".", false) && !z.h(uri2, "/", false)) {
            z13 = true;
        }
        Uri.Builder authority = new Uri.Builder().scheme("pinterest").authority("browser");
        if (z13) {
            uri2 = a.a.C(uri2, "/");
        }
        Uri build = authority.appendQueryParameter("address_url", uri2).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final String M0(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        String U2 = wy0Var.U2();
        String Z2 = wy0Var.Z2();
        String z43 = wy0Var.z4();
        String R0 = R0(U2);
        if (R0 == null && (R0 = R0(Z2)) == null && (R0 = R0(z43)) == null) {
            R0 = "";
        }
        return R2(R0);
    }

    public static final boolean M1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return N1(f30Var, hf0.b.q(), hf0.b.m(), gp1.h.f65936i);
    }

    public static m0 M2(ExecutorService executorService, Callable callable) {
        m0 m0Var = new m0(callable);
        executorService.execute(m0Var);
        return m0Var;
    }

    public static final wy0 N(wy0 wy0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        vy0 H4 = wy0Var.H4();
        H4.H(Boolean.valueOf(z13));
        H4.e0(Boolean.valueOf(z13));
        wy0 a13 = H4.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final List N0(TypedArray typedArray, int i13) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        int i14 = typedArray.getInt(i13, 0);
        if (i14 == 0) {
            return null;
        }
        return (List) z0.g(new Pair(1, f0.j(1, 0)), new Pair(17, f0.j(16, 1)), new Pair(33, f0.j(32, 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS), f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN), 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED), f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM), 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER), f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION), 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS), f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL), 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN), f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN), 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY), f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY), 1)), new Pair(97, f0.j(96, 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER), f0.j(160, 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL), f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), 1)), new Pair(3, e0.b(3)), new Pair(8194, f0.j(8192, 2)), new Pair(2, f0.j(2, 0)), new Pair(4, f0.j(4, 0)), new Pair(20, f0.j(4, 16)), new Pair(36, f0.j(4, 32)), new Pair(32769, f0.j(32768, 1)), new Pair(65537, f0.j(65536, 1)), new Pair(16385, f0.j(16384, 1)), new Pair(8193, f0.j(8192, 1)), new Pair(4097, f0.j(4096, 1)), new Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM), f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION), 32, 1)), new Pair(163841, f0.j(32768, 131072, 1)), new Pair(147457, f0.j(16384, 131072, 1)), new Pair(196609, f0.j(65536, 131072, 1)), new Pair(65713, f0.j(65536, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN), 1)), new Pair(180225, f0.j(32768, 16384, 131072, 1)), new Pair(131217, f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM), 131072, 1))).get(Integer.valueOf(i14));
    }

    public static final boolean N1(f30 f30Var, boolean z13, boolean z14, Function0 isMaxVideoAdsOnTabletEnabledAndActivate) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(isMaxVideoAdsOnTabletEnabledAndActivate, "isMaxVideoAdsOnTabletEnabledAndActivate");
        if (z14) {
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            Intrinsics.checkNotNullParameter(isMaxVideoAdsOnTabletEnabledAndActivate, "isMaxVideoAdsOnTabletEnabledAndActivate");
            Boolean Q5 = f30Var.Q5();
            Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
            if (Q5.booleanValue() && z13 && ((Boolean) isMaxVideoAdsOnTabletEnabledAndActivate.invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static void N2(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(a.a.D(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.m(b.class.getName(), classCastException);
        throw classCastException;
    }

    public static final Object O(Function2 function2, bl2.c frame) {
        ho2.u uVar = new ho2.u(frame, frame.getContext());
        Object i13 = com.bumptech.glide.c.i1(uVar, uVar, function2);
        if (i13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return i13;
    }

    public static final int O0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue.data;
    }

    public static final boolean O1(wy0 wy0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Date H2 = wy0Var.H2();
        if (H2 == null || ff0.j.f62104b) {
            return false;
        }
        return System.currentTimeMillis() - vb0.g.a(H2, z13 ? 35 : 28).getTime() < 0;
    }

    public static final long O2(double d2, zn2.d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double a13 = zn2.e.a(d2, unit, zn2.d.NANOSECONDS);
        if (!(!Double.isNaN(a13))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long d13 = ml2.c.d(a13);
        return new ql2.q(-4611686018426999999L, 4611686018426999999L).e(d13) ? i0(d13) : h0(ml2.c.d(zn2.e.a(d2, unit, zn2.d.MILLISECONDS)));
    }

    public static t0 P(am2.b bVar, b0 b0Var, ym2.g gVar, bm2.i iVar, int i13) {
        if (bVar == null) {
            a(32);
            throw null;
        }
        if (iVar == null) {
            a(33);
            throw null;
        }
        if (b0Var == null) {
            return null;
        }
        return new t0(bVar, new jn2.b(bVar, b0Var, gVar), iVar, ym2.h.a(i13));
    }

    public static final boolean P0(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        return (wy0Var.M3().booleanValue() || wy0Var.G3().booleanValue()) ? false : true;
    }

    public static boolean P1(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final long P2(int i13, zn2.d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(zn2.d.SECONDS) <= 0 ? i0(zn2.e.c(i13, unit, zn2.d.NANOSECONDS)) : Q2(i13, unit);
    }

    public static r0 Q(am2.r0 r0Var, bm2.i iVar) {
        if (r0Var != null) {
            return W(r0Var, iVar, true, r0Var.b());
        }
        a(13);
        throw null;
    }

    public static final String Q0(am2.d callableMemberDescriptor) {
        am2.d l13;
        ym2.g gVar;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        am2.d T0 = xl2.l.B(callableMemberDescriptor) ? T0(callableMemberDescriptor) : null;
        if (T0 == null || (l13 = fn2.d.l(T0)) == null) {
            return null;
        }
        if (l13 instanceof am2.r0) {
            Intrinsics.checkNotNullParameter(l13, "<this>");
            xl2.l.B(l13);
            am2.d b13 = fn2.d.b(fn2.d.l(l13), im2.j.f72748i);
            if (b13 == null || (gVar = (ym2.g) im2.i.f72744a.get(fn2.d.g(b13))) == null) {
                return null;
            }
            return gVar.b();
        }
        if (!(l13 instanceof u0)) {
            return null;
        }
        int i13 = im2.e.f72718m;
        u0 functionDescriptor = (u0) l13;
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        LinkedHashMap linkedHashMap = im2.r0.f72774j;
        String t13 = com.bumptech.glide.c.t(functionDescriptor);
        ym2.g gVar2 = t13 == null ? null : (ym2.g) linkedHashMap.get(t13);
        if (gVar2 != null) {
            return gVar2.b();
        }
        return null;
    }

    public static final boolean Q1() {
        Context context = kb0.a.f79058b;
        return j1.Y0(m60.f0.X());
    }

    public static final long Q2(long j13, zn2.d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        zn2.d dVar = zn2.d.NANOSECONDS;
        long c13 = zn2.e.c(4611686018426999999L, dVar, unit);
        return new ql2.q(-c13, c13).e(j13) ? i0(zn2.e.c(j13, unit, dVar)) : g0(s.i(zn2.e.b(j13, unit, zn2.d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static dm2.s0 R(am2.r0 r0Var, bm2.i iVar) {
        bm2.g gVar = bm2.h.f23540a;
        if (r0Var == null) {
            a(0);
            throw null;
        }
        w0 b13 = r0Var.b();
        if (b13 != null) {
            return Y(r0Var, iVar, gVar, true, r0Var.getVisibility(), b13);
        }
        a(6);
        throw null;
    }

    public static final String R0(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final boolean R1(wy0 wy0Var) {
        Date b13;
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        ke0 l43 = wy0Var.l4();
        if (l43 == null || (b13 = l43.b()) == null || ff0.j.f62104b) {
            return false;
        }
        return System.currentTimeMillis() < vb0.g.a(b13, 28).getTime();
    }

    public static final String R2(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0) {
            return "";
        }
        String substring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = substring.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static dm2.q0 S(am2.g gVar) {
        if (gVar == null) {
            a(26);
            throw null;
        }
        d0 moduleDescriptor = bn2.e.d(gVar);
        fi.b bVar = bn2.s.f23597a;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        am2.g c03 = l0.c0(moduleDescriptor, ym2.j.f139509u);
        if (c03 == null) {
            return null;
        }
        bm2.g gVar2 = bm2.h.f23540a;
        c0 c0Var = c0.FINAL;
        am2.r rVar = am2.s.f15577e;
        ym2.g gVar3 = xl2.r.f135322b;
        am2.c cVar = am2.c.SYNTHESIZED;
        dm2.q0 v03 = dm2.q0.v0(gVar, c0Var, rVar, false, gVar3, cVar, gVar.b());
        r0 r0Var = new r0(v03, gVar2, c0Var, rVar, false, false, false, cVar, null, gVar.b());
        v03.y0(r0Var, null, null, null);
        pn2.u0.f100848b.getClass();
        pn2.u0 attributes = pn2.u0.f100849c;
        b1 constructor = c03.e();
        List arguments = Collections.singletonList(new i1(gVar.j()));
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        v03.B0(pn2.g.q(attributes, constructor, arguments, false), Collections.emptyList(), null, null, Collections.emptyList());
        r0Var.w0(v03.getReturnType());
        return v03;
    }

    public static final bc2.q S0(f30 f30Var, Integer num) {
        Map g13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        b01 M6 = f30Var.M6();
        if (M6 == null || (g13 = M6.g()) == null || g13.isEmpty()) {
            return null;
        }
        return q0(g13, num, j1.z0(f30Var));
    }

    public static final boolean S1(wy0 wy0Var, String str) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        String uid = wy0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        if (!z.j(uid)) {
            if (!z.j(str == null ? "" : str)) {
                return Intrinsics.d(wy0Var.getUid(), str);
            }
        }
        return false;
    }

    public static final vd0.c S2(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        vd0.c cVar = new vd0.c();
        cVar.t("id", wy0Var.getUid());
        cVar.t("email", wy0Var.N2());
        cVar.t("full_name", wy0Var.Z2());
        cVar.t("image_small_url", wy0Var.m3());
        cVar.t("image_medium_url", wy0Var.l3());
        cVar.t("image_large_url", wy0Var.k3());
        cVar.t("image_xlarge_url", wy0Var.n3());
        cVar.s("is_partner", wy0Var.G3());
        cVar.t("username", wy0Var.z4());
        List u23 = wy0Var.u2();
        u uVar = cVar.f125623a;
        if (u23 != null) {
            uVar.r("businesses", j1.p1(vd0.c.f125622b.k(u23)).f());
        }
        List W3 = wy0Var.W3();
        if (W3 != null) {
            uVar.r("owners", j1.p1(vd0.c.f125622b.k(W3)).f());
        }
        return cVar;
    }

    public static u0 T(am2.g gVar) {
        if (gVar == null) {
            a(24);
            throw null;
        }
        bm2.g gVar2 = bm2.h.f23540a;
        u0 E0 = u0.E0(gVar, xl2.r.f135323c, am2.c.SYNTHESIZED, gVar.b());
        return E0.y0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new dm2.b1(E0, null, 0, gVar2, ym2.g.e("value"), fn2.d.e(gVar).v(), false, false, false, null, gVar.b())), gVar.j(), c0.FINAL, am2.s.f15577e);
    }

    public static final am2.d T0(am2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!im2.r0.f72775k.contains(dVar.getName()) && !im2.i.f72747d.contains(fn2.d.l(dVar).getName())) {
            return null;
        }
        if ((dVar instanceof am2.r0) || (dVar instanceof am2.q0)) {
            return fn2.d.b(dVar, k0.f72749i);
        }
        if (dVar instanceof u0) {
            return fn2.d.b(dVar, im2.l0.f72751i);
        }
        return null;
    }

    public static final boolean T1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return j1.c1(f1(context));
    }

    public static final ln1.e T2(yk1.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar == yk1.i.LOADING ? ln1.e.LOADING : ln1.e.LOADED;
    }

    public static u0 U(am2.g gVar) {
        if (gVar == null) {
            a(22);
            throw null;
        }
        return u0.E0(gVar, xl2.r.f135321a, am2.c.SYNTHESIZED, gVar.b()).y0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), fn2.d.e(gVar).g(gVar.j(), w1.INVARIANT), c0.FINAL, am2.s.f15577e);
    }

    public static final am2.d U0(am2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        am2.d T0 = T0(dVar);
        if (T0 != null) {
            return T0;
        }
        int i13 = im2.h.f72741m;
        ym2.g name = dVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (im2.h.b(name)) {
            return fn2.d.b(dVar, im2.m0.f72753i);
        }
        return null;
    }

    public static final boolean U1(Context context) {
        ComponentName componentName;
        Intent intent;
        ComponentName componentName2;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        ComponentName componentName3;
        ComponentName componentName4;
        Intrinsics.checkNotNullParameter(context, "context");
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.RecentTaskInfo recentTaskInfo = null;
        if (activityManager != null) {
            try {
                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                if (appTasks != null && appTasks.size() > 0 && appTasks.get(0) != null) {
                    recentTaskInfo = appTasks.get(0).getTaskInfo();
                }
            } catch (Exception unused) {
                return false;
            }
        }
        if (recentTaskInfo != null) {
            componentName3 = recentTaskInfo.baseActivity;
            if (componentName3 != null && vb0.j.f125484s == null) {
                componentName4 = recentTaskInfo.baseActivity;
                vb0.j.f125484s = componentName4.getClassName();
            }
        }
        if (recentTaskInfo == null) {
            return false;
        }
        componentName = recentTaskInfo.origActivity;
        if (componentName == null) {
            return false;
        }
        intent = recentTaskInfo.baseIntent;
        if (intent == null) {
            return false;
        }
        componentName2 = recentTaskInfo.origActivity;
        if (!pk.a0.N(componentName2.getClassName(), PinterestActivity.class.getName())) {
            return false;
        }
        intent2 = recentTaskInfo.baseIntent;
        if (!pk.a0.N(intent2.getAction(), "android.intent.action.MAIN")) {
            return false;
        }
        intent3 = recentTaskInfo.baseIntent;
        if (intent3.getCategories() == null) {
            return false;
        }
        intent4 = recentTaskInfo.baseIntent;
        return intent4.getCategories().contains("android.intent.category.LAUNCHER") && recentTaskInfo.id != -1;
    }

    public static final ub.g U2(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new ub.g(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i13 = 0; i13 < readInt; i13++) {
                    iArr[i13] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i14 = 0; i14 < readInt2; i14++) {
                    iArr2[i14] = objectInputStream.readInt();
                }
                ub.g F = c0.d.F(iArr2, iArr);
                J(objectInputStream, null);
                J(byteArrayInputStream, null);
                return F;
            } finally {
            }
        } finally {
        }
    }

    public static t0 V(am2.b bVar, b0 b0Var, bm2.i iVar) {
        if (bVar == null) {
            a(30);
            throw null;
        }
        if (b0Var == null) {
            return null;
        }
        return new t0(bVar, new jn2.c(bVar, b0Var), iVar);
    }

    public static final ArrayList V0(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Map d43 = wy0Var.d4();
        if (d43 == null || d43.isEmpty()) {
            return null;
        }
        ArrayList l03 = l0("345x", d43);
        return l03.isEmpty() ^ true ? l03 : l0("200x", d43);
    }

    public static final boolean V1(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        return W1(wy0Var) || cb.y(wy0Var, "getIsVerifiedMerchant(...)");
    }

    public static final void V2(float f13, float f14, int i13, int i14, Matrix matrix, float f15) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float f16 = i13 * f15;
        float f17 = i14 * f15;
        float f18 = 0.0f;
        float f19 = f16 < f13 ? (f13 - f16) / 2.0f : f16 > f13 ? -((f16 - f13) / 2.0f) : 0.0f;
        if (f17 < f14) {
            f18 = (f14 - f17) / 2.0f;
        } else if (f17 > f14) {
            f18 = -((f17 - f14) / 2.0f);
        }
        matrix.postTranslate(f19, f18);
    }

    public static r0 W(am2.r0 r0Var, bm2.i iVar, boolean z13, w0 w0Var) {
        if (r0Var == null) {
            a(17);
            throw null;
        }
        if (iVar == null) {
            a(18);
            throw null;
        }
        if (w0Var != null) {
            return new r0(r0Var, iVar, r0Var.l(), r0Var.getVisibility(), z13, false, false, am2.c.DECLARATION, null, w0Var);
        }
        a(19);
        throw null;
    }

    public static final bb2.b W0(bb2.c processingParams) {
        Intrinsics.checkNotNullParameter(processingParams, "processingParams");
        int i13 = processingParams.f22594b;
        if (i13 < 1) {
            i13 = 1;
        }
        float f13 = i13;
        int i14 = processingParams.f22593a;
        if (i14 < 1) {
            i14 = 1;
        }
        float f14 = i14;
        float f15 = processingParams.f22595c;
        float f16 = processingParams.f22597e * f15;
        float f17 = f15 * processingParams.f22598f;
        float f18 = processingParams.f22596d;
        float f19 = processingParams.f22599g * f18;
        float f23 = f18 * processingParams.f22600h;
        float f24 = f17 / f14;
        float f25 = f23 / f13;
        int i15 = bb2.d.f22603b[processingParams.f22601i.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f24 = f25;
        }
        return new bb2.b(s.f(f14 * f24, f16, f17), s.f(f13 * f24, f19, f23));
    }

    public static final boolean W1(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        tz0 B4 = wy0Var.B4();
        if (B4 != null) {
            return Intrinsics.d(B4.e(), Boolean.TRUE);
        }
        return false;
    }

    public static final void W2(k8.q qVar, boolean z13) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        k8.j a13 = qVar.a();
        a13.getClass();
        k8.i iVar = new k8.i(a13);
        Intrinsics.checkNotNullExpressionValue(iVar, "buildUponParameters(...)");
        if (z13) {
            iVar.d(false);
        } else {
            iVar.d(true);
        }
        qVar.i(new k8.j(iVar));
    }

    public static final c1 X(am2.g from, dm2.b to3) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to3, "to");
        from.k().size();
        to3.k().size();
        m60.f0 f0Var = d1.f100781b;
        List k13 = from.k();
        Intrinsics.checkNotNullExpressionValue(k13, "getDeclaredTypeParameters(...)");
        List list = k13;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((am2.c1) it.next()).e());
        }
        List k14 = to3.k();
        Intrinsics.checkNotNullExpressionValue(k14, "getDeclaredTypeParameters(...)");
        List list2 = k14;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            h0 j13 = ((am2.c1) it2.next()).j();
            Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
            arrayList2.add(kotlin.jvm.internal.j.c(j13));
        }
        return m60.f0.a0(f0Var, z0.m(CollectionsKt.N0(arrayList, arrayList2)));
    }

    public static final String X0(f30 f30Var) {
        wt s13;
        List d2;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        we0 we0Var = (we0) CollectionsKt.firstOrNull(b40.Z(f30Var));
        if (we0Var == null || (s13 = we0Var.s()) == null || (d2 = s13.d()) == null) {
            return null;
        }
        return (String) d2.get(0);
    }

    public static final void X1(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        int i13 = 0;
        ((lb0.b) lb0.n.a()).e("PREF_DEBUG_FORCE_ALLOW_ORIENTATION_CHANGE", false);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (!hf0.b.m()) {
            i13 = (rotation == 1 || rotation == 2) ? 9 : 1;
        } else if (rotation != 0 && rotation != 1) {
            i13 = 8;
        }
        w2(activity, i13);
    }

    public static final void X2(GestaltSpinner gestaltSpinner, ln1.e loadingState) {
        Intrinsics.checkNotNullParameter(gestaltSpinner, "<this>");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        kh2.s0.w(gestaltSpinner, new k2(loadingState, 3));
    }

    public static dm2.s0 Y(am2.r0 r0Var, bm2.i iVar, bm2.i iVar2, boolean z13, am2.q qVar, w0 w0Var) {
        if (r0Var == null) {
            a(7);
            throw null;
        }
        if (iVar == null) {
            a(8);
            throw null;
        }
        if (iVar2 == null) {
            a(9);
            throw null;
        }
        if (qVar == null) {
            a(10);
            throw null;
        }
        if (w0Var == null) {
            a(11);
            throw null;
        }
        dm2.s0 s0Var = new dm2.s0(r0Var, iVar, r0Var.l(), qVar, z13, false, false, am2.c.DECLARATION, null, w0Var);
        s0Var.x0(dm2.s0.v0(s0Var, r0Var.getType(), iVar2));
        return s0Var;
    }

    public static final String Y0(f30 f30Var) {
        String d03;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String b13 = po1.c.b(f30Var);
        return (b13 == null || (d03 = StringsKt.d0(DecimalFormatSymbols.getInstance().getMonetaryDecimalSeparator(), b13, b13)) == null) ? "" : d03;
    }

    public static final void Y1(Context context) {
        if (context != null && bs1.c.c1(context) && hf0.b.q()) {
            X1(bs1.c.k0(context));
        }
    }

    public static final h0 Y2(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        v1 z03 = b0Var.z0();
        if (z03 instanceof v) {
            return ((v) z03).f100851c;
        }
        if (z03 instanceof h0) {
            return (h0) z03;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean Z(r1 r1Var) {
        Intrinsics.checkNotNullParameter(r1Var, "<this>");
        Intrinsics.checkNotNullParameter("enabled_promo_with_corner_badge", "keyWord");
        String str = (String) r1Var.f59339a0.get("ads_deal_indicator");
        if (str != null) {
            return (z.p(str, "enabled", false) || z.p(str, "employee", false)) && StringsKt.E(str, "enabled_promo_with_corner_badge", false);
        }
        return false;
    }

    public static final List Z0(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Map j43 = wy0Var.j4();
        if (j43 == null || j43.isEmpty()) {
            return q0.f80391a;
        }
        ArrayList l03 = l0("345x", j43);
        return l03.isEmpty() ^ true ? l03 : l0("200x", j43);
    }

    public static final void Z1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (bs1.c.c1(context)) {
            w2(bs1.c.k0(context), 1);
        }
    }

    public static void Z2(h32.g0 g0Var, h32.u0 u0Var, f1 f1Var) {
        String T = j1.T("Action: %s Element: %s Component: %s", f1Var != null ? f1Var.toString() : "", u0Var != null ? u0Var.toString() : "", g0Var != null ? g0Var.toString() : "");
        try {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.h(T);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 12 || i13 == 23 || i13 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 12 || i13 == 23 || i13 == 25) ? 2 : 3];
        switch (i13) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i13 == 12) {
            objArr[1] = "createSetter";
        } else if (i13 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i13 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i13) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 12 && i13 != 23 && i13 != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static final boolean a0(fk1.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter("enabled_promo_with_corner_badge", "keyWord");
        String str = (String) wVar.f62402w.get("ads_deal_indicator");
        if (str != null) {
            return (z.p(str, "enabled", false) || z.p(str, "employee", false)) && StringsKt.E(str, "enabled_promo_with_corner_badge", false);
        }
        return false;
    }

    public static final int a1(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue.resourceId;
    }

    public static final void a2(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (hf0.b.q()) {
            return;
        }
        w2(activity, 1);
    }

    public static void a3(d4 d4Var, a4 a4Var) {
        String T = j1.T("View LOADED: %s:%s", d4Var != null ? d4Var.toString() : "", a4Var != null ? a4Var.toString() : "");
        try {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.h(T);
        } catch (Exception unused) {
        }
    }

    public static final ho2.c b(CoroutineContext coroutineContext) {
        if (coroutineContext.get(ao2.g0.f20154b) == null) {
            coroutineContext = coroutineContext.plus(ao2.m0.b());
        }
        return new ho2.c(coroutineContext);
    }

    public static final boolean b0(x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter("enabled_promo_with_corner_badge", "keyWord");
        String str = (String) x0Var.M.get("ads_deal_indicator");
        if (str != null) {
            return (z.p(str, "enabled", false) || z.p(str, "employee", false)) && StringsKt.E(str, "enabled_promo_with_corner_badge", false);
        }
        return false;
    }

    public static final Integer b1(TypedArray typedArray, int i13) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Integer valueOf = Integer.valueOf(typedArray.getResourceId(i13, -1));
        if (valueOf.intValue() != -1) {
            return valueOf;
        }
        return null;
    }

    public static final h0 b2(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        v1 z03 = b0Var.z0();
        if (z03 instanceof v) {
            return ((v) z03).f100850b;
        }
        if (z03 instanceof h0) {
            return (h0) z03;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Object b3(d frame) {
        Object obj;
        CoroutineContext context = frame.getContext();
        ao2.m0.t(context);
        bl2.c b13 = cl2.h.b(frame);
        ho2.e eVar = b13 instanceof ho2.e ? (ho2.e) b13 : null;
        if (eVar == null) {
            obj = Unit.f80348a;
        } else {
            ao2.f0 f0Var = eVar.f69754d;
            if (f0Var.k(context)) {
                eVar.f69756f = Unit.f80348a;
                eVar.f20207c = 1;
                f0Var.h(context, eVar);
            } else {
                w2 w2Var = new w2(w2.f20230c);
                CoroutineContext plus = context.plus(w2Var);
                Unit unit = Unit.f80348a;
                eVar.f69756f = unit;
                eVar.f20207c = 1;
                f0Var.h(plus, eVar);
                if (w2Var.f20231b) {
                    fi.b bVar = ho2.f.f69758a;
                    ao2.f1 a13 = o2.a();
                    kotlin.collections.v vVar = a13.f20149e;
                    if (vVar != null && !vVar.isEmpty()) {
                        if (a13.J()) {
                            eVar.f69756f = unit;
                            eVar.f20207c = 1;
                            a13.w(eVar);
                            obj = cl2.a.COROUTINE_SUSPENDED;
                        } else {
                            a13.A(true);
                            try {
                                eVar.run();
                                do {
                                } while (a13.L());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.f80348a;
                }
            }
            obj = cl2.a.COROUTINE_SUSPENDED;
        }
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (obj == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return obj == aVar ? obj : Unit.f80348a;
    }

    public static final void c(rn1.a state, u2.q qVar, Function1 function1, Function1 function12, i2.o oVar, int i13, int i14) {
        Function1 function13;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(134985535);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = null;
        }
        if ((i14 & 8) != 0) {
            function12 = null;
        }
        sVar.W(-2108220766);
        if (function12 == null) {
            function13 = null;
        } else {
            sVar.W(-1211597479);
            boolean z13 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(function12)) || (i13 & 3072) == 2048;
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new al1.j(8, function12);
                sVar.g0(J2);
            }
            function13 = (Function1) J2;
            sVar.r(false);
        }
        sVar.r(false);
        d(state, qVar, function1, function13 != null ? new hm1.e(5, function13) : null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 4104 | (i13 & 896), 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((u50.o) state, qVar, (Object) function1, (Object) function12, i13, i14, 24);
        }
    }

    public static final boolean c0(y2 y2Var) {
        Intrinsics.checkNotNullParameter(y2Var, "<this>");
        Intrinsics.checkNotNullParameter("enabled_promo_with_corner_badge", "keyWord");
        String str = (String) y2Var.T.get("ads_deal_indicator");
        if (str != null) {
            return (z.p(str, "enabled", false) || z.p(str, "employee", false)) && StringsKt.E(str, "enabled_promo_with_corner_badge", false);
        }
        return false;
    }

    public static final String c1() {
        String languageTag = Locale.getDefault().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        return languageTag;
    }

    public static final am2.c c2(tm2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(ln2.p.f84131f, "<this>");
        int i13 = b0Var == null ? -1 : ln2.g0.f84082a[b0Var.ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? am2.c.DECLARATION : am2.c.SYNTHESIZED : am2.c.DELEGATION : am2.c.FAKE_OVERRIDE : am2.c.DECLARATION;
    }

    public static final void d(rn1.a state, u2.q qVar, Function1 function1, gm1.a aVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-609238146);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = null;
        }
        if ((i14 & 8) != 0) {
            aVar = null;
        }
        androidx.compose.ui.viewinterop.a.a(new k1.v2(((Number) sVar.m(fc0.k.f61712a)).intValue(), state, aVar), qVar, new a1(state, aVar, function1, 14), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((u50.o) state, qVar, (Object) function1, (Object) aVar, i13, i14, 25);
        }
    }

    public static String d1(f30 f30Var, Resources resources, Integer num, String str, int i13) {
        int i14 = m60.x0.free_shipping_with_price;
        if ((i13 & 4) != 0) {
            num = b40.u(f30Var);
        }
        if ((i13 & 8) != 0) {
            str = b40.t(f30Var);
        }
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            return resources.getString(m60.x0.free_shipping);
        }
        if (str != null) {
            return resources.getString(i14, str);
        }
        return null;
    }

    public static final int d2(kb.c0 networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i13 = tb.b0.f116957c[networkType.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && networkType == kb.c0.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i14;
    }

    public static final ho2.c e() {
        m2 b13 = ue.c.b();
        ko2.f fVar = v0.f20219a;
        return new ho2.c(kotlin.coroutines.g.d(ho2.q.f69782a, b13));
    }

    public static final sr e1(l30 l30Var) {
        Intrinsics.checkNotNullParameter(l30Var, "<this>");
        Map s13 = l30Var.s();
        if (s13 != null) {
            return (sr) s13.get("345x");
        }
        return null;
    }

    public static void e2(uj2.v vVar, AtomicInteger atomicInteger, pk2.c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            if (b13 != null) {
                vVar.onError(b13);
            } else {
                vVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(java.lang.String r15, u2.q r16, android.widget.ImageView.ScaleType r17, kotlin.jvm.functions.Function1 r18, i2.o r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.b.f(java.lang.String, u2.q, android.widget.ImageView$ScaleType, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static final am2.r f0(g1 g1Var) {
        Intrinsics.checkNotNullParameter(ln2.p.f84131f, "<this>");
        switch (g1Var == null ? -1 : ln2.g0.f84083b[g1Var.ordinal()]) {
            case 1:
                am2.r INTERNAL = am2.s.f15576d;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                am2.r PRIVATE = am2.s.f15573a;
                Intrinsics.checkNotNullExpressionValue(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                am2.r PRIVATE_TO_THIS = am2.s.f15574b;
                Intrinsics.checkNotNullExpressionValue(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                am2.r PROTECTED = am2.s.f15575c;
                Intrinsics.checkNotNullExpressionValue(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                am2.r PUBLIC = am2.s.f15577e;
                Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                am2.r LOCAL = am2.s.f15578f;
                Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
                return LOCAL;
            default:
                am2.r PRIVATE2 = am2.s.f15573a;
                Intrinsics.checkNotNullExpressionValue(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final g92.d f1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return j1.x0(theme);
    }

    public static void f2(xp2.b bVar, AtomicInteger atomicInteger, pk2.c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            if (b13 != null) {
                bVar.onError(b13);
            } else {
                bVar.a();
            }
        }
    }

    public static final void g(Bitmap bitmap, u2.q qVar, ImageView.ScaleType scaleType, Function1 function1, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(863581948);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if ((i14 & 8) != 0) {
            function1 = hc0.d.f68697i;
        }
        if (((Boolean) sVar.m(t3.v2.f116235a)).booleanValue()) {
            sVar.W(1855271197);
            p1.q.a(qVar, sVar, (i13 >> 3) & 14);
            sVar.r(false);
        } else {
            sVar.W(1855418943);
            sVar.W(-909977889);
            boolean z13 = true;
            boolean z14 = (((i13 & 896) ^ 384) > 256 && sVar.h(scaleType)) || (i13 & 384) == 256;
            if ((((i13 & 7168) ^ 3072) <= 2048 || !sVar.h(function1)) && (i13 & 3072) != 2048) {
                z13 = false;
            }
            boolean z15 = z14 | z13;
            Object J2 = sVar.J();
            if (z15 || J2 == i2.n.f71185a) {
                J2 = new t80.r(26, scaleType, function1);
                sVar.g0(J2);
            }
            sVar.r(false);
            androidx.compose.ui.viewinterop.a.a((Function1) J2, qVar, new ra0.l0(bitmap, 8), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
            sVar.r(false);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((Object) bitmap, qVar, (Object) scaleType, (Object) function1, i13, i14, 15);
        }
    }

    public static final long g0(long j13) {
        long j14 = (j13 << 1) + 1;
        zn2.a aVar = zn2.b.f142311b;
        int i13 = zn2.c.f142315a;
        return j14;
    }

    public static final String g1(wy0 wy0Var) {
        String uid = wy0Var != null ? wy0Var.getUid() : null;
        return uid == null ? "" : uid;
    }

    public static void g2(uj2.v vVar, Throwable th3, AtomicInteger atomicInteger, pk2.c cVar) {
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            l0.R0(th3);
        } else if (atomicInteger.getAndIncrement() == 0) {
            vVar.onError(pk2.h.b(cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(java.lang.String r16, u2.q r17, android.widget.ImageView.ScaleType r18, kotlin.jvm.functions.Function1 r19, i2.o r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.b.h(java.lang.String, u2.q, android.widget.ImageView$ScaleType, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static final long h0(long j13) {
        return new ql2.q(-4611686018426L, 4611686018426L).e(j13) ? i0(j13 * 1000000) : g0(s.i(j13, -4611686018427387903L, 4611686018427387903L));
    }

    public static final String h1(String... imageUrls) {
        String str;
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        int length = imageUrls.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                str = null;
                break;
            }
            str = imageUrls[i13];
            if (true ^ (str == null || str.length() == 0)) {
                break;
            }
            i13++;
        }
        return str == null ? "" : str;
    }

    public static void h2(xp2.b bVar, Throwable th3, AtomicInteger atomicInteger, pk2.c cVar) {
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            l0.R0(th3);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(pk2.h.b(cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final cl2.a i(do2.j r4, java.lang.Object r5, java.lang.Object r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof do2.v0
            if (r0 == 0) goto L13
            r0 = r7
            do2.v0 r0 = (do2.v0) r0
            int r1 = r0.f55978t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55978t = r1
            goto L18
        L13:
            do2.v0 r0 = new do2.v0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f55977s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55978t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.f55976r
            ue.c.H(r7)
            goto L3f
        L31:
            ue.c.H(r7)
            r0.f55976r = r6
            r0.f55978t = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.b.i(do2.j, java.lang.Object, java.lang.Object, bl2.c):cl2.a");
    }

    public static final long i0(long j13) {
        long j14 = j13 << 1;
        zn2.a aVar = zn2.b.f142311b;
        int i13 = zn2.c.f142315a;
        return j14;
    }

    public static final String i1(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        String R0 = R0(wy0Var.U2());
        if (R0 == null && (R0 = R0(wy0Var.Z2())) == null) {
            R0 = "";
        }
        return StringsKt.i0(R0).toString();
    }

    public static void i2(uj2.v vVar, Object obj, AtomicInteger atomicInteger, pk2.c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            vVar.c(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                cVar.getClass();
                Throwable b13 = pk2.h.b(cVar);
                if (b13 != null) {
                    vVar.onError(b13);
                } else {
                    vVar.a();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long j(java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.b.j(java.lang.String, boolean):long");
    }

    public static boolean j0(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static final String j1(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        String R0 = R0(wy0Var.Z2());
        if (R0 == null && (R0 = R0(wy0Var.U2())) == null && (R0 = R0(wy0Var.P3())) == null) {
            R0 = "";
        }
        return StringsKt.i0(R0).toString();
    }

    public static void j2(xp2.b bVar, Object obj, AtomicInteger atomicInteger, pk2.c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.c(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                cVar.getClass();
                Throwable b13 = pk2.h.b(cVar);
                if (b13 != null) {
                    bVar.onError(b13);
                } else {
                    bVar.a();
                }
            }
        }
    }

    public static final void k(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        n00.j.f88780a.a(bVar);
        n00.d0.f88769a.a(bVar);
        bVar.e("user.email");
        bVar.e("user.country");
        bVar.e("user.has_password");
        n60.o.w(bVar, "user.has_confirmed_email", "user.email_status", "user.connected_to_facebook", "user.connected_to_gplus");
        n60.o.w(bVar, "user.connected_to_instagram", "user.connected_to_etsy", "user.connected_to_youtube", "user.connected_to_line");
        n60.o.w(bVar, "user.personalize_from_offsite_browsing", "user.dsa_opted_out", "user.exclude_from_search", "user.personalize_from_offsite_browsing");
        n60.o.w(bVar, "user.ads_customize_from_conversion", "user.third_party_marketing_tracking_enabled", "user.ccpa_opted_out", "user.has_orders");
        bVar.e("partner.account_type");
        bVar.e("partner.contact_name");
        List j13 = f0.j("en_US", "en_GB", "de", "fr", "it", "es_ES", "es_MX", "es_AR", "es_419", "pt_BR");
        if (j13.contains(Locale.getDefault().toString()) || j13.contains(Locale.getDefault().getLanguage())) {
            bVar.e("user.pronouns");
        }
        n60.o.v(bVar, "partner.account_type", "user.birthday", "user.locale");
        g2 d2 = g2.f83370b.d();
        z3 z3Var = lh0.a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) d2.f83373a;
        if (g1Var.o("android_additional_languages", "enabled", z3Var) || g1Var.l("android_additional_languages")) {
            bVar.e("user.additional_locales");
        }
        if (g1Var.o("android_creator_hub_paid_partnership_onboarding", "enabled", z3Var) || g1Var.l("android_creator_hub_paid_partnership_onboarding")) {
            bVar.e("user.partnership_opt_in");
        }
        n60.o.w(bVar, "user.hide_birthdate_for_business", "user.is_regulated_by_aadc", "user.is_candidate_for_parental_control_passcode", "user.is_parental_control_passcode_enabled");
        n60.o.w(bVar, "user.parental_control_anonymized_email", "user.is_parental_control_passcode_verification_pending", "user.comments_disabled", "user.allow_mentions");
        n60.o.w(bVar, "user.opt_in_private_account", "user.allow_switch_between_private_and_public_profile", "user.search_privacy_enabled", "user.can_edit_search_privacy");
        bVar.e("user.teen_safety_options_url");
    }

    public static yk2.g k0(Activity activity, lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        yk2.g builder = new yk2.g();
        builder.put(rg0.o.CONTEXT_OS_NOTIFICATION_SETTINGS.getValue(), String.valueOf(tz1.b.c().f25804b.areNotificationsEnabled()));
        if (Build.VERSION.SDK_INT >= 33) {
            builder.put(rg0.o.CONTEXT_NOTIFICATIONS_PERMISSION_USER_SET.getValue(), String.valueOf(activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")));
            builder.put(rg0.o.CONTEXT_NOTIFICATIONS_PERMISSION_USER_FIXED.getValue(), String.valueOf(m60.f0.n0(activity, "android.permission.POST_NOTIFICATIONS", true, prefsManagerPersisted)));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.c();
    }

    public static final n10.d k1(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Boolean O3 = wy0Var.O3();
        Intrinsics.checkNotNullExpressionValue(O3, "getIsVerifiedMerchant(...)");
        if (O3.booleanValue()) {
            return n10.d.VERIFIED_MERCHANT;
        }
        if (W1(wy0Var)) {
            return n10.d.VERIFIED_USER;
        }
        Boolean I3 = wy0Var.I3();
        Intrinsics.checkNotNullExpressionValue(I3, "getIsPrimaryWebsiteVerified(...)");
        return I3.booleanValue() ? n10.d.VERIFIED_DOMAIN : n10.d.NOT_VERIFIED;
    }

    public static final ArrayList k2(am2.j0 j0Var, ym2.c fqName) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        K(j0Var, fqName, arrayList);
        return arrayList;
    }

    public static void l(x92.b bVar) {
        g2 d2 = g2.f83370b.d();
        j1.h(bVar);
        com.bumptech.glide.d.d(bVar);
        bVar.e("pin.rich_summary()");
        bVar.e("video.duration");
        bVar.e("board.type");
        bVar.e("board.owner()");
        bVar.h("board.images", "150x150");
        bVar.e("interest.is_followed");
        bVar.e("interest.follower_count");
        bVar.h("interest.images", "236x");
        bVar.e("user.follower_count");
        bVar.h("user.recent_pin_images", "345x");
        bVar.e("user.user_recommendation_reason");
        n60.o.w(bVar, "offermetadata.availability", "board.board_order_modified_at", "board.image_thumbnail_url", "board.layout");
        n60.o.w(bVar, "pin.attribution", "pin.title", "pin.tracked_link", "user.image_large_url");
        n60.o.v(bVar, "user.image_xlarge_url", "interest.id", "interest.name");
        z3 z3Var = lh0.a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) d2.f83373a;
        if (g1Var.o("android_ctx_remove_creator_attribution_in_grid", "enabled", z3Var) || g1Var.l("android_ctx_remove_creator_attribution_in_grid")) {
            n60.o.v(bVar, "pin.native_creator()", "user.verified_identity", "user.is_verified_merchant");
        }
    }

    public static final ArrayList l0(String str, Map map) {
        ArrayList arrayList = new ArrayList();
        Set entrySet = map.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : entrySet) {
            if (Intrinsics.d(((Map.Entry) obj).getKey(), str)) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((Map.Entry) it.next()).getValue();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                String j13 = ((sr) it2.next()).j();
                if (j13 != null) {
                    arrayList3.add(j13);
                }
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public static final bc2.o l1(h01 h01Var, String str) {
        String s13 = h01Var.s();
        if (s13 == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf((int) h01Var.k().doubleValue());
        Integer num = valueOf.intValue() != 0 ? valueOf : null;
        int doubleValue = (int) h01Var.r().doubleValue();
        int doubleValue2 = (int) h01Var.q().doubleValue();
        return new bc2.o(str, s13, num, (doubleValue == 0 || doubleValue2 == 0) ? null : new bc2.c(doubleValue, doubleValue2), h01Var.o());
    }

    public static final long l2(String str) {
        int length = str.length();
        int i13 = (length <= 0 || !StringsKt.F("+-", str.charAt(0))) ? 0 : 1;
        if (length - i13 > 16) {
            Iterable intRange = new IntRange(i13, StringsKt.I(str), 1);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                ql2.k it = intRange.iterator();
                while (it.f104109c) {
                    if (!new ql2.e('0', '9').e(str.charAt(it.b()))) {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (z.p(str, "+", false)) {
            str = kotlin.text.e0.y(1, str);
        }
        return Long.parseLong(str);
    }

    public static void m(x92.b bVar) {
        n60.o.w(bVar, "contact.user()", "user.image_xlarge_url", "contact.conversation()", "conversation.id");
        bVar.e("conversation.name");
        bVar.e("conversation.users()");
    }

    public static g3 m0(Set set, g7.m mVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof g3)) {
                set.getClass();
                return new g3(set, mVar);
            }
            g3 g3Var = (g3) set;
            return new g3((Set) g3Var.f100405a, kh2.a1.o(g3Var.f100406b, mVar));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof g3)) {
            set2.getClass();
            return new h3(set2, mVar);
        }
        g3 g3Var2 = (g3) set2;
        return new h3((SortedSet) g3Var2.f100405a, kh2.a1.o(g3Var2.f100406b, mVar));
    }

    public static final bc2.q m1(h01 h01Var, bc2.o oVar, Integer num, bc2.l lVar) {
        Map b13 = y0.b(new Pair(oVar.f22664a, oVar));
        long doubleValue = (long) h01Var.m().doubleValue();
        String p13 = h01Var.p();
        Map l13 = h01Var.l();
        if (l13 == null) {
            l13 = z0.d();
        }
        return new bc2.q(b13, oVar, doubleValue, p13, l13, new bc2.c((int) h01Var.t().doubleValue(), (int) h01Var.n().doubleValue()), num, lVar, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
    }

    public static final n1 m2(nx.d0 pinalytics, qa2.n nVar, Function0 viewCreator) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        return new n1(viewCreator, pinalytics, nVar, 3);
    }

    public static void n(com.google.common.util.concurrent.c0 c0Var, com.google.common.util.concurrent.w wVar, Executor executor) {
        c0Var.d(new lb.x(c0Var, wVar, 10), executor);
    }

    public static final rm2.f0 n0(rm2.b0 b0Var, ym2.b classId, xm2.g jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        rm2.a0 a13 = ((fm2.d) b0Var).a(classId, jvmMetadataVersion);
        if (a13 != null) {
            return a13.f108722e;
        }
        return null;
    }

    public static final bc2.q n1(float f13, String videoUrl, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        bc2.o oVar = new bc2.o("SINGLE_VIDEO_URL", videoUrl, null, null, null);
        return new bc2.q(y0.b(new Pair("SINGLE_VIDEO_URL", oVar)), oVar, 0L, str, null, new bc2.c(100, (int) (100 / f13)), null, z13 ? bc2.l.AD : bc2.l.ORGANIC, 336);
    }

    public static final Object n2(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void o(x92.b apiFieldsMap, g2 experiments) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        apiFieldsMap.e("pin.virtual_try_on_type");
        apiFieldsMap.e("pin.is_virtual_try_on");
        apiFieldsMap.e("pin.is_scene");
    }

    public static final ao2.f0 o0(Executor executor) {
        ao2.f0 f0Var;
        ao2.u0 u0Var = executor instanceof ao2.u0 ? (ao2.u0) executor : null;
        return (u0Var == null || (f0Var = u0Var.f20213a) == null) ? new ao2.i1(executor) : f0Var;
    }

    public static final boolean o1(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Boolean x33 = wy0Var.x3();
        Intrinsics.checkNotNullExpressionValue(x33, "getIsDefaultImage(...)");
        return x33.booleanValue() || StringsKt.E(s0(wy0Var), "default_", false);
    }

    public static y o2(j0 j0Var, int i13, Function2 function2, int i14) {
        kotlin.coroutines.j jVar = kotlin.coroutines.j.f80412a;
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        co2.a aVar = co2.a.SUSPEND;
        ao2.l0 l0Var = ao2.l0.DEFAULT;
        y yVar = new y(ao2.d0.c(j0Var, jVar), l0.b(i13, aVar, 4));
        l0Var.invoke(function2, yVar, yVar);
        return yVar;
    }

    public static final kk2.g p(kk2.m mVar, or1.d mode, or1.p modeHandler, or1.i authLoggingUtils) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeHandler, "modeHandler");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        int i13 = 2;
        kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(mVar, new or1.j(i13, new or1.k(authLoggingUtils, mode, modeHandler, 0)), 2), new or1.j(3, new or1.k(authLoggingUtils, mode, modeHandler, 1)), 3), new or1.j(4, new or1.k(authLoggingUtils, mode, modeHandler, i13)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }

    public static final byte[] p0(ub.g requestCompat) {
        Intrinsics.checkNotNullParameter(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) requestCompat.f121662a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] n03 = kh2.g3.n0(networkRequest);
                int[] a03 = kh2.g3.a0(networkRequest);
                objectOutputStream.writeInt(n03.length);
                for (int i13 : n03) {
                    objectOutputStream.writeInt(i13);
                }
                objectOutputStream.writeInt(a03.length);
                for (int i14 : a03) {
                    objectOutputStream.writeInt(i14);
                }
                Unit unit = Unit.f80348a;
                J(objectOutputStream, null);
                J(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0164, code lost:
    
        if (r2 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016b, code lost:
    
        return !xl2.l.B(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean p1(am2.g r12, am2.d r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.b.p1(am2.g, am2.d):boolean");
    }

    public static final void p2(hm2.d dVar, hm2.e from, am2.g scopeOwner, ym2.g name) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        if (dVar == hm2.c.f69586a) {
            return;
        }
        from.getLocation();
    }

    public static final kk2.g q(uj2.b0 b0Var, or1.d mode, or1.p modeHandler, or1.i authLoggingUtils) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeHandler, "modeHandler");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(b0Var, new zq1.c0(10, new or1.n(authLoggingUtils, mode, modeHandler, 0)), 2), new zq1.c0(11, new or1.n(authLoggingUtils, mode, modeHandler, 1)), 3), new zq1.c0(12, new or1.n(authLoggingUtils, mode, modeHandler, 2)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }

    public static final bc2.q q0(Map map, Integer num, bc2.l lVar) {
        bc2.o l13;
        for (String str : f0.j("V_DASH_HEVC", "V_HLSV3_MOBILE")) {
            h01 h01Var = (h01) map.get(str);
            if (h01Var != null && (l13 = l1(h01Var, str)) != null) {
                return m1(h01Var, l13, num, lVar);
            }
        }
        return null;
    }

    public static final boolean q1(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        int intValue = wy0Var.t2().intValue();
        Integer p43 = wy0Var.p4();
        Intrinsics.checkNotNullExpressionValue(p43, "getSecretBoardCount(...)");
        int intValue2 = p43.intValue() + intValue;
        Integer o23 = wy0Var.o2();
        Intrinsics.checkNotNullExpressionValue(o23, "getArchivedBoardCount(...)");
        int intValue3 = o23.intValue() + intValue2;
        Integer s33 = wy0Var.s3();
        Intrinsics.checkNotNullExpressionValue(s33, "getInvisibleBoardCount(...)");
        return intValue3 > s33.intValue();
    }

    public static final void q2(hm2.d dVar, hm2.e from, i0 scopeOwner, ym2.g name) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        String packageFqName = ((dm2.k0) scopeOwner).f55454e.b();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "asString(...)");
        String name2 = name.b();
        Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name2, "name");
        if (dVar == hm2.c.f69586a) {
            return;
        }
        from.getLocation();
    }

    public static final un2.a r(b0 type) {
        Object r23;
        w1 b13;
        un2.e eVar;
        Intrinsics.checkNotNullParameter(type, "type");
        if (J1(type)) {
            un2.a r13 = r(b2(type));
            un2.a r14 = r(Y2(type));
            return new un2.a(com.bumptech.glide.c.h0(pn2.g.i(b2((b0) r13.f122915a), Y2((b0) r14.f122915a)), type), com.bumptech.glide.c.h0(pn2.g.i(b2((b0) r13.f122916b), Y2((b0) r14.f122916b)), type));
        }
        b1 w03 = type.w0();
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type.w0() instanceof cn2.b) {
            Intrinsics.g(w03, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            pn2.g1 a13 = ((cn2.b) w03).a();
            b0 type2 = a13.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            b0 l13 = t1.l(type2, type.x0());
            Intrinsics.checkNotNullExpressionValue(l13, "makeNullableIfNeeded(...)");
            int i13 = un2.b.f122917a[a13.c().ordinal()];
            if (i13 == 2) {
                h0 p13 = kotlin.jvm.internal.j.m(type).p();
                Intrinsics.checkNotNullExpressionValue(p13, "getNullableAnyType(...)");
                return new un2.a(l13, p13);
            }
            if (i13 != 3) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + a13);
            }
            h0 o13 = kotlin.jvm.internal.j.m(type).o();
            Intrinsics.checkNotNullExpressionValue(o13, "getNothingType(...)");
            b0 l14 = t1.l(o13, type.x0());
            Intrinsics.checkNotNullExpressionValue(l14, "makeNullableIfNeeded(...)");
            return new un2.a(l14, l13);
        }
        if (type.u0().isEmpty() || type.u0().size() != w03.getParameters().size()) {
            return new un2.a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List u03 = type.u0();
        List parameters = w03.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        Iterator it = CollectionsKt.N0(u03, parameters).iterator();
        while (true) {
            boolean z13 = true;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((un2.e) it2.next()).getClass();
                        if (!qn2.d.f104496a.b(r3.f122920b, r3.f122921c)) {
                            break;
                        }
                    }
                }
                z13 = false;
                if (z13) {
                    r23 = kotlin.jvm.internal.j.m(type).o();
                    Intrinsics.checkNotNullExpressionValue(r23, "getNothingType(...)");
                } else {
                    r23 = r2(arrayList, type);
                }
                return new un2.a(r23, r2(arrayList2, type));
            }
            Pair pair = (Pair) it.next();
            pn2.g1 g1Var = (pn2.g1) pair.f80346a;
            am2.c1 c1Var = (am2.c1) pair.f80347b;
            Intrinsics.f(c1Var);
            w1 r15 = c1Var.r();
            if (r15 == null) {
                q1.a(35);
                throw null;
            }
            if (g1Var == null) {
                q1.a(36);
                throw null;
            }
            q1 q1Var = q1.f100833b;
            if (g1Var.b()) {
                b13 = w1.OUT_VARIANCE;
                if (b13 == null) {
                    q1.a(37);
                    throw null;
                }
            } else {
                b13 = q1.b(r15, g1Var.c());
            }
            int i14 = un2.b.f122917a[b13.ordinal()];
            if (i14 == 1) {
                b0 type3 = g1Var.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                b0 type4 = g1Var.getType();
                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                eVar = new un2.e(c1Var, type3, type4);
            } else if (i14 == 2) {
                b0 type5 = g1Var.getType();
                Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                h0 p14 = fn2.d.e(c1Var).p();
                Intrinsics.checkNotNullExpressionValue(p14, "getNullableAnyType(...)");
                eVar = new un2.e(c1Var, type5, p14);
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                h0 o14 = fn2.d.e(c1Var).o();
                Intrinsics.checkNotNullExpressionValue(o14, "getNothingType(...)");
                b0 type6 = g1Var.getType();
                Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                eVar = new un2.e(c1Var, o14, type6);
            }
            if (g1Var.b()) {
                arrayList.add(eVar);
                arrayList2.add(eVar);
            } else {
                un2.a r16 = r(eVar.f122920b);
                b0 b0Var = (b0) r16.f122915a;
                b0 b0Var2 = (b0) r16.f122916b;
                un2.a r17 = r(eVar.f122921c);
                b0 b0Var3 = (b0) r17.f122915a;
                b0 b0Var4 = (b0) r17.f122916b;
                am2.c1 c1Var2 = eVar.f122919a;
                un2.e eVar2 = new un2.e(c1Var2, b0Var2, b0Var3);
                un2.e eVar3 = new un2.e(c1Var2, b0Var, b0Var4);
                arrayList.add(eVar2);
                arrayList2.add(eVar3);
            }
        }
    }

    public static final bc2.q r0(String mediaUid, Map videoList, boolean z13, boolean z14, Integer num, bc2.l videoPinType, bc2.e mp4TrackSelector, bc2.m videoSurfaceType) {
        bc2.o b13;
        Integer num2;
        Intrinsics.checkNotNullParameter(mediaUid, "mediaUid");
        Intrinsics.checkNotNullParameter(videoPinType, "videoPinType");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(videoSurfaceType, "videoSurfaceType");
        if (videoList == null || videoList.isEmpty()) {
            return null;
        }
        Collection values = videoList.values();
        Intrinsics.checkNotNullParameter(values, "<this>");
        h01 h01Var = (h01) CollectionsKt.R(values);
        Intrinsics.checkNotNullParameter(videoList, "videoList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : videoList.entrySet()) {
            String str = (String) entry.getKey();
            bc2.o l13 = l1((h01) entry.getValue(), str);
            if (l13 != null) {
                linkedHashMap.put(str, l13);
            }
        }
        bc2.d input = new bc2.d(mediaUid, linkedHashMap, z13, z14, new bc2.c((int) h01Var.t().doubleValue(), (int) h01Var.n().doubleValue()), videoPinType, videoSurfaceType);
        nc2.e eVar = (nc2.e) mp4TrackSelector;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (!(!linkedHashMap.isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (linkedHashMap.size() == 1) {
            Collection values2 = linkedHashMap.values();
            Intrinsics.checkNotNullParameter(values2, "<this>");
            b13 = (bc2.o) CollectionsKt.R(values2);
            d7.b.H(mediaUid);
            String str2 = b13.f22664a;
        } else {
            bc2.o oVar = (bc2.o) linkedHashMap.get("V_HEVC_MP4_T1_V2");
            boolean z15 = (oVar != null ? oVar.f22666c : null) != null;
            if (z15 && eVar.d()) {
                LruCache lruCache = eVar.f90400e;
                bc2.o oVar2 = (bc2.o) lruCache.get(mediaUid);
                if (oVar2 != null) {
                    d7.b.H(mediaUid);
                    num2 = num;
                    b13 = oVar2;
                    return m1(h01Var, b13, num2, videoPinType);
                }
                if (videoSurfaceType == bc2.m.GRID && z13) {
                    k4 k4Var = eVar.f90398c;
                    k4Var.getClass();
                    Intrinsics.checkNotNullParameter("grid_t3", "keyWord");
                    lh0.z0.f83518a.getClass();
                    String h10 = ((lh0.g1) k4Var.f83410a).h("android_video_mp4_track_selector_unpin", lh0.y0.f83512b);
                    if (h10 != null && ((z.p(h10, "enabled", false) || z.p(h10, "employee", false)) && StringsKt.E(h10, "grid_t3", false))) {
                        bc2.o oVar3 = (bc2.o) linkedHashMap.get("V_HEVC_MP4_T3_V2");
                        b13 = oVar3 == null ? eVar.c(linkedHashMap) : oVar3;
                        lruCache.put(mediaUid, b13);
                    }
                }
                b13 = eVar.b(input, nc2.e.a(linkedHashMap), true);
                d7.b.H(mediaUid);
                String str3 = b13.f22664a;
                lruCache.put(mediaUid, b13);
            } else if (z14) {
                b13 = eVar.c(linkedHashMap);
                d7.b.H(mediaUid);
                String str4 = b13.f22664a;
            } else if (z15) {
                if (z13) {
                    bc2.o oVar4 = (bc2.o) linkedHashMap.get("V_HEVC_MP4_T3_V2");
                    b13 = oVar4 == null ? eVar.c(linkedHashMap) : oVar4;
                    d7.b.H(mediaUid);
                    String str5 = b13.f22664a;
                } else {
                    b13 = eVar.b(input, nc2.e.a(linkedHashMap), true);
                    d7.b.H(mediaUid);
                    String str6 = b13.f22664a;
                }
            } else if (z13) {
                bc2.o oVar5 = (bc2.o) linkedHashMap.get("V_HEVC_MP4_T1_V2");
                b13 = oVar5 == null ? eVar.c(linkedHashMap) : oVar5;
                d7.b.H(mediaUid);
                String str7 = b13.f22664a;
            } else {
                b13 = eVar.b(input, nc2.e.f90395f, false);
                d7.b.H(mediaUid);
                String str8 = b13.f22664a;
            }
        }
        num2 = num;
        return m1(h01Var, b13, num2, videoPinType);
    }

    public static int r1(Set set) {
        Iterator it = set.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i13 = ~(~(i13 + (next != null ? next.hashCode() : 0)));
        }
        return i13;
    }

    public static final b0 r2(ArrayList arrayList, b0 b0Var) {
        i1 i1Var;
        b0Var.u0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            un2.e eVar = (un2.e) it.next();
            eVar.getClass();
            qn2.o oVar = qn2.d.f104496a;
            b0 b0Var2 = eVar.f122920b;
            b0 b0Var3 = eVar.f122921c;
            oVar.b(b0Var2, b0Var3);
            if (!Intrinsics.d(b0Var2, b0Var3)) {
                am2.c1 c1Var = eVar.f122919a;
                w1 r13 = c1Var.r();
                w1 w1Var = w1.IN_VARIANCE;
                if (r13 != w1Var) {
                    if (xl2.l.G(b0Var2) && c1Var.r() != w1Var) {
                        w1 w1Var2 = w1.OUT_VARIANCE;
                        if (w1Var2 == c1Var.r()) {
                            w1Var2 = w1.INVARIANT;
                        }
                        i1Var = new i1(b0Var3, w1Var2);
                    } else {
                        if (b0Var3 == null) {
                            xl2.l.a(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN);
                            throw null;
                        }
                        if (xl2.l.y(b0Var3) && b0Var3.x0()) {
                            if (w1Var == c1Var.r()) {
                                w1Var = w1.INVARIANT;
                            }
                            i1Var = new i1(b0Var2, w1Var);
                        } else {
                            w1 w1Var3 = w1.OUT_VARIANCE;
                            if (w1Var3 == c1Var.r()) {
                                w1Var3 = w1.INVARIANT;
                            }
                            i1Var = new i1(b0Var3, w1Var3);
                        }
                    }
                    arrayList2.add(i1Var);
                }
            }
            i1Var = new i1(b0Var2);
            arrayList2.add(i1Var);
        }
        return l0.Y0(b0Var, arrayList2, null, 6);
    }

    public static Collection s(Collection collection) {
        if ((collection instanceof ll2.a) && !(collection instanceof ll2.b)) {
            N2(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e13) {
            Intrinsics.m(b.class.getName(), e13);
            throw e13;
        }
    }

    public static final String s0(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        return h1(wy0Var.n3(), wy0Var.k3(), wy0Var.l3(), wy0Var.m3());
    }

    public static final kb.a s1(int i13) {
        if (i13 == 0) {
            return kb.a.EXPONENTIAL;
        }
        if (i13 == 1) {
            return kb.a.LINEAR;
        }
        throw new IllegalArgumentException(a.a.e("Could not convert ", i13, " to BackoffPolicy"));
    }

    public static final void s2(Activity activity) {
        if (activity != null && bs1.c.c1(activity) && hf0.b.q()) {
            w2(activity, -1);
        }
    }

    public static List t(Object obj) {
        if ((obj instanceof ll2.a) && !(obj instanceof ll2.c)) {
            N2(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e13) {
            Intrinsics.m(b.class.getName(), e13);
            throw e13;
        }
    }

    public static final String t0(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        return h1(wy0Var.l3(), wy0Var.k3(), wy0Var.n3(), wy0Var.m3());
    }

    public static final kb.c0 t1(int i13) {
        if (i13 == 0) {
            return kb.c0.NOT_REQUIRED;
        }
        if (i13 == 1) {
            return kb.c0.CONNECTED;
        }
        if (i13 == 2) {
            return kb.c0.UNMETERED;
        }
        if (i13 == 3) {
            return kb.c0.NOT_ROAMING;
        }
        if (i13 == 4) {
            return kb.c0.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i13 != 5) {
            throw new IllegalArgumentException(a.a.e("Could not convert ", i13, " to NetworkType"));
        }
        return kb.c0.TEMPORARILY_UNMETERED;
    }

    public static final long t2(u50.i iVar, i2.o oVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        i2.s sVar = (i2.s) oVar;
        sVar.W(-1957571715);
        long c13 = androidx.compose.ui.graphics.a.c(((Number) iVar.a((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b))).intValue());
        sVar.r(false);
        return c13;
    }

    public static Map u(Object obj) {
        if ((obj instanceof ll2.a) && !(obj instanceof ll2.e)) {
            N2(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e13) {
            Intrinsics.m(b.class.getName(), e13);
            throw e13;
        }
    }

    public static final String u0(wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        return o1(wy0Var) ? "" : s0(wy0Var);
    }

    public static final kb.l0 u1(int i13) {
        if (i13 == 0) {
            return kb.l0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i13 == 1) {
            return kb.l0.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(a.a.e("Could not convert ", i13, " to OutOfQuotaPolicy"));
    }

    public static final Object u2(u50.a0 a0Var, i2.o oVar) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        i2.s sVar = (i2.s) oVar;
        sVar.W(404588179);
        Object a13 = a0Var.a((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b));
        sVar.r(false);
        return a13;
    }

    public static Set v(Object obj) {
        if ((obj instanceof ll2.a) && !(obj instanceof ll2.f)) {
            N2(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e13) {
            Intrinsics.m(b.class.getName(), e13);
            throw e13;
        }
    }

    public static boolean v0(int i13, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i13});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static final kb.s0 v1(int i13) {
        if (i13 == 0) {
            return kb.s0.ENQUEUED;
        }
        if (i13 == 1) {
            return kb.s0.RUNNING;
        }
        if (i13 == 2) {
            return kb.s0.SUCCEEDED;
        }
        if (i13 == 3) {
            return kb.s0.FAILED;
        }
        if (i13 == 4) {
            return kb.s0.BLOCKED;
        }
        if (i13 == 5) {
            return kb.s0.CANCELLED;
        }
        throw new IllegalArgumentException(a.a.e("Could not convert ", i13, " to State"));
    }

    public static final lm2.d v2(rg.a aVar, pm2.d annotationsOwner) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(annotationsOwner, "annotationsOwner");
        return new lm2.d(aVar, annotationsOwner, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w(co2.z r4, kotlin.jvm.functions.Function0 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof co2.x
            if (r0 == 0) goto L13
            r0 = r6
            co2.x r0 = (co2.x) r0
            int r1 = r0.f28358t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28358t = r1
            goto L18
        L13:
            co2.x r0 = new co2.x
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28357s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f28358t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.functions.Function0 r5 = r0.f28356r
            ue.c.H(r6)     // Catch: java.lang.Throwable -> L29
            goto L6e
        L29:
            r4 = move-exception
            goto L74
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ue.c.H(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            ao2.g0 r2 = ao2.g0.f20154b
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L78
            r0.getClass()     // Catch: java.lang.Throwable -> L29
            r0.f28356r = r5     // Catch: java.lang.Throwable -> L29
            r0.f28358t = r3     // Catch: java.lang.Throwable -> L29
            ao2.o r6 = new ao2.o     // Catch: java.lang.Throwable -> L29
            bl2.c r2 = cl2.h.b(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r2)     // Catch: java.lang.Throwable -> L29
            r6.v()     // Catch: java.lang.Throwable -> L29
            xl2.i r2 = new xl2.i     // Catch: java.lang.Throwable -> L29
            r3 = 5
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L29
            co2.y r4 = (co2.y) r4     // Catch: java.lang.Throwable -> L29
            r4.b(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L6b
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)     // Catch: java.lang.Throwable -> L29
        L6b:
            if (r4 != r1) goto L6e
            return r1
        L6e:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L74:
            r5.invoke()
            throw r4
        L78:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.b.w(co2.z, kotlin.jvm.functions.Function0, bl2.c):java.lang.Object");
    }

    public static final boolean w0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue.data != 0;
    }

    public static f3 w1(pk.o1 o1Var, pk.o1 o1Var2) {
        bf.b.p(o1Var, "set1");
        bf.b.p(o1Var2, "set2");
        return new f3(o1Var, o1Var2);
    }

    public static final void w2(Activity activity, int i13) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Resources.Theme theme = activity.getTheme();
        if (theme != null) {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent});
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            boolean z13 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            if (z13) {
                return;
            }
        }
        activity.setRequestedOrientation(i13);
    }

    public static final int x0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue.data;
    }

    public static final boolean x1(j0 j0Var) {
        o1 o1Var = (o1) j0Var.getCoroutineContext().get(ao2.g0.f20154b);
        if (o1Var != null) {
            return o1Var.isActive();
        }
        return true;
    }

    public static final int x2(wo2.b0 b0Var, int i13) {
        int i14;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        int[] iArr = b0Var.f130672f;
        int i15 = i13 + 1;
        int length = b0Var.f130671e.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i16 = length - 1;
        int i17 = 0;
        while (true) {
            if (i17 <= i16) {
                i14 = (i17 + i16) >>> 1;
                int i18 = iArr[i14];
                if (i18 >= i15) {
                    if (i18 <= i15) {
                        break;
                    }
                    i16 = i14 - 1;
                } else {
                    i17 = i14 + 1;
                }
            } else {
                i14 = (-i17) - 1;
                break;
            }
        }
        return i14 >= 0 ? i14 : ~i14;
    }

    public static void y(int i13, Object obj) {
        if (obj == null || K1(i13, obj)) {
            return;
        }
        N2(obj, "kotlin.jvm.functions.Function" + i13);
        throw null;
    }

    public static final int y0(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return x0(context, i13);
    }

    public static final boolean y1() {
        j3 j3Var = j3.f60510a;
        return j3.e() == h32.q0.SAMSUNG && ((lb0.b) lb0.n.f82724c.a()).e("PREF_FIRST_LAUNCH", true);
    }

    public static void y2(TextView textView) {
        int i13 = eo1.c.margin_quarter;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(i13);
        textView.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    public static final void z(GestaltIcon gestaltIcon, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltIcon, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        rm1.k kVar = new rm1.k((rm1.d) ((u50.o) gestaltIcon.f49406a.f33803a));
        init.invoke(kVar);
        gestaltIcon.g2(new t(kVar, 9));
    }

    public static final ColorStateList z0(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "<this>");
        ColorStateList valueOf = ColorStateList.valueOf(x0(context, i13));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    public static boolean z1(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final byte[] z2(Set triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    kb.f fVar = (kb.f) it.next();
                    objectOutputStream.writeUTF(fVar.a().toString());
                    objectOutputStream.writeBoolean(fVar.b());
                }
                Unit unit = Unit.f80348a;
                J(objectOutputStream, null);
                J(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public a7.n0 d0(y8.a aVar) {
        ByteBuffer byteBuffer = aVar.f78454e;
        byteBuffer.getClass();
        bf.b.i(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return e0(aVar, byteBuffer);
    }

    public abstract a7.n0 e0(y8.a aVar, ByteBuffer byteBuffer);
}
