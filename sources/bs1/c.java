package bs1;

import a.cb;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.w2;
import ao2.m0;
import ao2.q2;
import ao2.y0;
import bm2.i;
import com.airbnb.lottie.h;
import com.bumptech.glide.d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.wz;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.NavigationImpl;
import do2.r2;
import h32.c2;
import h32.d4;
import h32.h2;
import h32.k0;
import h32.y1;
import hc.p;
import hc.t;
import hc.z;
import i2.i1;
import i2.j2;
import i2.j3;
import i2.k3;
import i2.m3;
import i2.n;
import i2.o;
import i2.o0;
import i2.p3;
import i2.q0;
import i2.q1;
import i2.q3;
import i2.r3;
import i2.u;
import i2.y3;
import ic.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import jc.g;
import k1.a2;
import k1.b2;
import k1.d2;
import k1.e2;
import k1.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.TimeoutCancellationException;
import lb.l0;
import m1.c1;
import m1.f1;
import n4.k;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import nx.j1;
import pk.a0;
import pn2.t0;
import pn2.u0;
import ql2.s;
import s1.r;
import so.c6;
import t3.f2;
import u50.i0;
import u50.j0;
import u50.l;
import vm2.f;
import wd.y;
import xk2.m;
import xk2.q;
import xk2.v;
import z3.j;
import z3.x;

/* loaded from: classes2.dex */
public abstract class c {
    public static final int A(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object obj = d5.a.f53679a;
        return context.getColor(i13);
    }

    public static final int A0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        return w0(b.b(f30Var, a13));
    }

    public static dc.a A1(e eVar, h hVar) {
        return new dc.a(t.a(eVar, hVar, 1.0f, p.f68670a, false), 1);
    }

    public static void A2(Parcel parcel, int i13, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int M2 = M2(parcel, i13);
        parcel.writeBundle(bundle);
        N2(parcel, M2);
    }

    public static final int B(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return A(context, i13);
    }

    public static final String B0(f30 f30Var) {
        sr srVar;
        if (f30Var != null) {
            as1.b a13 = as1.b.a();
            Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
            srVar = b.b(f30Var, a13);
        } else {
            srVar = null;
        }
        return D0(srVar);
    }

    public static dc.a B1(e eVar, h hVar) {
        return new dc.a(t.a(eVar, hVar, g.c(), z.f68687a, true), 2);
    }

    public static void B2(Parcel parcel, int i13, byte[] bArr, boolean z13) {
        if (bArr == null) {
            if (z13) {
                O2(parcel, i13, 0);
            }
        } else {
            int M2 = M2(parcel, i13);
            parcel.writeByteArray(bArr);
            N2(parcel, M2);
        }
    }

    public static final int C(Fragment fragment, int i13) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return A(requireContext, i13);
    }

    public static final int C0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        return E0(b.b(f30Var, a13));
    }

    public static final l C1(i0 i0Var, i0 other) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new l(f0.j(i0Var, other));
    }

    public static void C2(Parcel parcel, int i13, Double d2) {
        if (d2 == null) {
            return;
        }
        O2(parcel, i13, 8);
        parcel.writeDouble(d2.doubleValue());
    }

    public static int D(w2 w2Var, l1 l1Var, View view, View view2, l2 l2Var, boolean z13) {
        if (l2Var.E() == 0 || w2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z13) {
            return Math.abs(l2.Z(view) - l2.Z(view2)) + 1;
        }
        return Math.min(l1Var.l(), l1Var.b(view2) - l1Var.e(view));
    }

    public static final String D0(sr srVar) {
        if (srVar != null) {
            return srVar.j();
        }
        return null;
    }

    public static final boolean D1() {
        return hf0.b.q();
    }

    public static void D2(Parcel parcel, int i13, Float f13) {
        if (f13 == null) {
            return;
        }
        O2(parcel, i13, 4);
        parcel.writeFloat(f13.floatValue());
    }

    public static int E(w2 w2Var, l1 l1Var, View view, View view2, l2 l2Var, boolean z13, boolean z14) {
        if (l2Var.E() == 0 || w2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z14 ? Math.max(0, (w2Var.b() - Math.max(l2.Z(view), l2.Z(view2))) - 1) : Math.max(0, Math.min(l2.Z(view), l2.Z(view2)));
        if (z13) {
            return Math.round((max * (Math.abs(l1Var.b(view2) - l1Var.e(view)) / (Math.abs(l2.Z(view) - l2.Z(view2)) + 1))) + (l1Var.k() - l1Var.e(view)));
        }
        return max;
    }

    public static final int E0(sr srVar) {
        if (srVar != null) {
            return (int) srVar.k().doubleValue();
        }
        return 0;
    }

    public static final void E1(HashMap hashMap, HashMap auxData) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        for (Map.Entry entry : auxData.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                hashMap.put(entry.getKey(), str);
            }
        }
    }

    public static void E2(Parcel parcel, int i13, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int M2 = M2(parcel, i13);
        parcel.writeStrongBinder(iBinder);
        N2(parcel, M2);
    }

    public static int F(w2 w2Var, l1 l1Var, View view, View view2, l2 l2Var, boolean z13) {
        if (l2Var.E() == 0 || w2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z13) {
            return w2Var.b();
        }
        return (int) (((l1Var.b(view2) - l1Var.e(view)) / (Math.abs(l2.Z(view) - l2.Z(view2)) + 1)) * w2Var.b());
    }

    public static final int F0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static final void F1(HashMap hashMap, Pair... pairs) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            String str = (String) pair.f80347b;
            if (str != null) {
                hashMap.put(pair.f80346a, str);
            }
        }
    }

    public static void F2(Parcel parcel, int i13, Integer num) {
        if (num == null) {
            return;
        }
        O2(parcel, i13, 4);
        parcel.writeInt(num.intValue());
    }

    public static final long G(long j13, long j14) {
        return l0.d(s.g((int) (j14 >> 32), n4.a.j(j13), n4.a.h(j13)), s.g((int) (j14 & 4294967295L), n4.a.i(j13), n4.a.g(j13)));
    }

    public static final int G0(View view) {
        if (view == null || j1(view)) {
            return 0;
        }
        return F0(view);
    }

    public static final void G1(String key, String str, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str != null) {
        }
    }

    public static void G2(Parcel parcel, int i13, Long l13) {
        if (l13 == null) {
            return;
        }
        O2(parcel, i13, 8);
        parcel.writeLong(l13.longValue());
    }

    public static final long H(long j13, long j14) {
        return a(s.g(n4.a.j(j14), n4.a.j(j13), n4.a.h(j13)), s.g(n4.a.h(j14), n4.a.j(j13), n4.a.h(j13)), s.g(n4.a.i(j14), n4.a.i(j13), n4.a.g(j13)), s.g(n4.a.g(j14), n4.a.i(j13), n4.a.g(j13)));
    }

    public static final int H0(View view) {
        int i13 = 0;
        if (view == null) {
            return 0;
        }
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams.isMarginRelative()) {
                i13 = marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
            } else {
                i13 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
        }
        return measuredWidth + i13;
    }

    public static final int H1(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return dl2.b.F0(context, i13);
    }

    public static void H2(Parcel parcel, int i13, Parcelable parcelable, int i14, boolean z13) {
        if (parcelable == null) {
            if (z13) {
                O2(parcel, i13, 0);
            }
        } else {
            int M2 = M2(parcel, i13);
            parcelable.writeToParcel(parcel, i14);
            N2(parcel, M2);
        }
    }

    public static final int I(int i13, long j13) {
        return s.g(i13, n4.a.i(j13), n4.a.g(j13));
    }

    public static final int I0(View view) {
        if (view == null || j1(view)) {
            return 0;
        }
        return H0(view);
    }

    public static final byte[] I1(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        K(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static void I2(Parcel parcel, int i13, String str, boolean z13) {
        if (str == null) {
            if (z13) {
                O2(parcel, i13, 0);
            }
        } else {
            int M2 = M2(parcel, i13);
            parcel.writeString(str);
            N2(parcel, M2);
        }
    }

    public static final int J(int i13, long j13) {
        return s.g(i13, n4.a.j(j13), n4.a.h(j13));
    }

    public static Bundle J0(Context context) {
        ServiceInfo serviceInfo;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "android.net.http.MetaDataHolder"), 787072);
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        return serviceInfo != null ? serviceInfo.metaData : new Bundle();
    }

    public static final Object J1(Object obj) {
        if (obj instanceof ao2.z) {
            q qVar = xk2.s.f135225b;
            return ue.c.m(((ao2.z) obj).f20242a);
        }
        q qVar2 = xk2.s.f135225b;
        return obj;
    }

    public static void J2(Parcel parcel, int i13, List list) {
        if (list == null) {
            return;
        }
        int M2 = M2(parcel, i13);
        parcel.writeStringList(list);
        N2(parcel, M2);
    }

    public static final long K(InputStream inputStream, OutputStream out, int i13) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i13];
        int read = inputStream.read(bArr);
        long j13 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j13 += read;
            read = inputStream.read(bArr);
        }
        return j13;
    }

    public static final i1 K0(CoroutineContext coroutineContext) {
        i1 i1Var = (i1) coroutineContext.get(n.f71186b);
        if (i1Var != null) {
            return i1Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final q1 K1(Object obj, o oVar) {
        i2.s sVar = (i2.s) oVar;
        Object J2 = sVar.J();
        if (J2 == n.f71185a) {
            J2 = u1(obj, y3.f71400a);
            sVar.g0(J2);
        }
        q1 q1Var = (q1) J2;
        q1Var.setValue(obj);
        return q1Var;
    }

    public static void K2(Parcel parcel, int i13, Parcelable[] parcelableArr, int i14) {
        if (parcelableArr == null) {
            return;
        }
        int M2 = M2(parcel, i13);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i14);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        N2(parcel, M2);
    }

    public static final ym2.g L0(f fVar, int i13) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        ym2.g d2 = ym2.g.d(fVar.c(i13));
        Intrinsics.checkNotNullExpressionValue(d2, "guessByFirstCharacter(...)");
        return d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final pn2.u0 L1(pn2.u0 r6, bm2.i r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r1 = "newAnnotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            bm2.i r1 = pn2.n.a(r6)
            if (r1 != r7) goto L11
            return r6
        L11:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            rl2.u[] r0 = pn2.n.f100820a
            r1 = 0
            r0 = r0[r1]
            vb0.i r1 = pn2.n.f100821b
            java.lang.Object r0 = r1.e(r6, r0)
            pn2.m r0 = (pn2.m) r0
            java.lang.String r1 = "attribute"
            if (r0 == 0) goto L6e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L30
        L2e:
            r0 = r6
            goto L6a
        L30:
            vn2.a r2 = r6.f126314a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L3b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r2.next()
            r5 = r4
            pn2.r0 r5 = (pn2.r0) r5
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r0)
            r5 = r5 ^ 1
            if (r5 == 0) goto L3b
            r3.add(r4)
            goto L3b
        L54:
            int r0 = r3.size()
            vn2.a r2 = r6.f126314a
            int r2 = r2.b()
            if (r0 != r2) goto L61
            goto L2e
        L61:
            pn2.t0 r0 = pn2.u0.f100848b
            r0.getClass()
            pn2.u0 r0 = pn2.t0.a(r3)
        L6a:
            if (r0 != 0) goto L6d
            goto L6e
        L6d:
            r6 = r0
        L6e:
            java.util.Iterator r0 = r7.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7f
            return r6
        L7f:
            pn2.m r0 = new pn2.m
            r0.<init>(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.jvm.internal.l0 r7 = kotlin.jvm.internal.k0.f80436a
            java.lang.Class<pn2.m> r1 = pn2.m.class
            rl2.d r7 = r7.b(r1)
            pn2.t0 r1 = pn2.u0.f100848b
            r1.getClass()
            java.lang.String r2 = "kClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r7 = r7.e()
            kotlin.jvm.internal.Intrinsics.f(r7)
            int r7 = r1.b(r7)
            vn2.a r1 = r6.f126314a
            java.lang.Object r7 = r1.get(r7)
            if (r7 == 0) goto Lb0
            goto Lce
        Lb0:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto Lc0
            pn2.u0 r6 = new pn2.u0
            java.util.List r7 = kotlin.collections.e0.b(r0)
            r6.<init>(r7)
            goto Lce
        Lc0:
            java.util.List r6 = kotlin.collections.CollectionsKt.F0(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.ArrayList r6 = kotlin.collections.CollectionsKt.m0(r0, r6)
            pn2.u0 r6 = pn2.t0.a(r6)
        Lce:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bs1.c.L1(pn2.u0, bm2.i):pn2.u0");
    }

    public static void L2(Parcel parcel, int i13, List list, boolean z13) {
        if (list == null) {
            if (z13) {
                O2(parcel, i13, 0);
                return;
            }
            return;
        }
        int M2 = M2(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            Parcelable parcelable = (Parcelable) list.get(i14);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        N2(parcel, M2);
    }

    public static final rg.a M(rg.a aVar, i additionalAnnotations) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? aVar : new rg.a((lm2.a) aVar.f107929a, (lm2.h) aVar.f107930b, m.a(xk2.n.NONE, new j2(24, aVar, additionalAnnotations)));
    }

    public static final Object M0(j jVar, x xVar) {
        Object obj = jVar.f140700a.get(xVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final void M1(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.sendAccessibilityEvent(8);
        view.requestFocus();
    }

    public static int M2(Parcel parcel, int i13) {
        parcel.writeInt(i13 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final long N(int i13, int i14, int i15, int i16) {
        int i17 = i16 == Integer.MAX_VALUE ? i15 : i16;
        int t13 = t(i17);
        int i18 = i14 == Integer.MAX_VALUE ? i13 : i14;
        int t14 = t(i18);
        if (t13 + t14 > 31) {
            throw new IllegalArgumentException(cb.j("Can't represent a width of ", i18, " and height of ", i17, " in Constraints"));
        }
        int i19 = i14 + 1;
        int i23 = i19 & (~(i19 >> 31));
        int i24 = i16 + 1;
        int i25 = i24 & (~(i24 >> 31));
        int i26 = 0;
        if (t14 != 13) {
            if (t14 == 18) {
                i26 = 3;
            } else if (t14 == 15) {
                i26 = 1;
            } else if (t14 == 16) {
                i26 = 2;
            }
        }
        int i27 = (((i26 & 2) >> 1) * 3) + ((i26 & 1) << 1);
        return (i23 << 33) | i26 | (i13 << 2) | (i15 << (i27 + 15)) | (i25 << (i27 + 46));
    }

    public static int N0(qd.i iVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, iVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            try {
                int a13 = ((nd.f) list.get(i13)).a(inputStream, iVar);
                if (a13 != -1) {
                    return a13;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static final d4 N1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d4 d4Var = d4.UNKNOWN_VIEW;
        try {
            ComponentCallbacks2 k03 = k0(context);
            if (!(k03 instanceof j1)) {
                return d4Var;
            }
            d4 d2 = ((j1) k03).d();
            return d2 != null ? d2 : d4Var;
        } catch (Exception unused) {
            return d4Var;
        }
    }

    public static void N2(Parcel parcel, int i13) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i13 - 4);
        parcel.writeInt(dataPosition - i13);
        parcel.setDataPosition(dataPosition);
    }

    public static final tq0.b[] O(d0 pinalytics, c6 pinImpressionLoggerFactory) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinImpressionLoggerFactory, "pinImpressionLoggerFactory");
        return new tq0.b[]{pinImpressionLoggerFactory.a(pinalytics, h2.GRID_CELL), new tq0.l(clock, pinalytics), new tq0.a(clock, pinalytics)};
    }

    public static final wy0 O0(f30 f30Var) {
        if (f30Var == null) {
            return null;
        }
        Boolean e53 = f30Var.e5();
        Intrinsics.checkNotNullExpressionValue(e53, "getIsRepin(...)");
        return e53.booleanValue() ? f30Var.C5() : f30Var.I5();
    }

    public static final u2.q O1(u2.q qVar, m1.h2 h2Var, f1 f1Var, boolean z13, boolean z14, c1 c1Var, o1.l lVar, r rVar, o oVar, int i13) {
        e2 e2Var;
        r rVar2 = (i13 & 64) != 0 ? null : rVar;
        i2.s sVar = (i2.s) oVar;
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        b2 b2Var = (b2) sVar.m(d2.f77851a);
        if (b2Var != null) {
            sVar.W(1586021609);
            boolean h10 = sVar.h(context) | sVar.h(b2Var);
            Object J2 = sVar.J();
            if (h10 || J2 == n.f71185a) {
                J2 = new k1.n(context, b2Var);
                sVar.g0(J2);
            }
            sVar.r(false);
            e2Var = (k1.n) J2;
        } else {
            sVar.W(1586120933);
            sVar.r(false);
            e2Var = a2.f77809b;
        }
        float f13 = g0.f77865a;
        f1 f1Var2 = f1.Vertical;
        u2.q j13 = qVar.j(f1Var == f1Var2 ? g0.f77867c : g0.f77866b).j(e2Var.b());
        boolean z15 = !z14;
        if (((k) sVar.m(f2.f115989l)) == k.Rtl && f1Var != f1Var2) {
            z15 = z14;
        }
        return androidx.compose.foundation.gestures.a.b(j13, h2Var, f1Var, e2Var, z13, z15, c1Var, lVar, rVar2);
    }

    public static void O2(Parcel parcel, int i13, int i14) {
        parcel.writeInt(i13 | (i14 << 16));
    }

    public static final File P(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), Intrinsics.n(fileName, "datastore/"));
    }

    public static final String P0(f30 f30Var) {
        wy0 J6;
        String Z2;
        if (f30Var == null) {
            return null;
        }
        String E = b40.E(f30Var);
        String Y = b40.Y(f30Var);
        if (E != null && E.length() != 0) {
            return E;
        }
        if (Y != null && Y.length() != 0) {
            return Y;
        }
        String h43 = f30Var.h4();
        if (h43 != null && h43.length() != 0) {
            if (!Intrinsics.d(f30Var.h4(), "Uploaded by user")) {
                return f30Var.h4();
            }
            wy0 O0 = O0(f30Var);
            if (O0 != null && (Z2 = O0.Z2()) != null) {
                return Z2;
            }
            Context context = kb0.a.f79058b;
            return m60.f0.j0().getString(wy1.f.link_module_title_uploaded);
        }
        Boolean e53 = f30Var.e5();
        Intrinsics.checkNotNullExpressionValue(e53, "getIsRepin(...)");
        if (!e53.booleanValue()) {
            return null;
        }
        wy0 J62 = f30Var.J6();
        String Z22 = J62 != null ? J62.Z2() : null;
        if (Z22 == null || Z22.length() == 0 || (J6 = f30Var.J6()) == null) {
            return null;
        }
        return J6.Z2();
    }

    public static void P1(MediaFormat mediaFormat, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            mediaFormat.setByteBuffer(a.a.d("csd-", i13), ByteBuffer.wrap((byte[]) list.get(i13)));
        }
    }

    public static final k2.e Q() {
        r3 r3Var = k3.f71151b;
        k2.e eVar = (k2.e) r3Var.a();
        if (eVar != null) {
            return eVar;
        }
        k2.e eVar2 = new k2.e(new q0[0]);
        r3Var.b(eVar2);
        return eVar2;
    }

    public static final Rect Q0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i13 = iArr[1];
        rect.top = i13;
        rect.bottom = view.getHeight() + i13;
        int i14 = iArr[0];
        rect.left = i14;
        rect.right = view.getWidth() + i14;
        return rect;
    }

    public static void Q1(y1 builder, f30 pin, String str, long j13, int i13, int i14, int i15, String str2, Integer num, boolean z13, boolean z14, boolean z15, String str3, k0 k0Var, h32.f fVar, x32.b bVar, String str4, Short sh3, h32.e eVar, Boolean bool, int i16) {
        Integer num2 = (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : num;
        boolean z16 = (i16 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z13;
        boolean z17 = (i16 & 1024) != 0 ? false : z14;
        boolean z18 = (i16 & 2048) != 0 ? false : z15;
        String str5 = (i16 & 4096) != 0 ? null : str3;
        x32.b bVar2 = (32768 & i16) != 0 ? null : bVar;
        String str6 = (65536 & i16) != 0 ? null : str4;
        h32.e eVar2 = (262144 & i16) != 0 ? null : eVar;
        Boolean bool2 = (i16 & 524288) != 0 ? null : bool;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean z19 = builder.a().f67482c == null;
        builder.f67435c = pin.getF39332b();
        builder.f67467y = b40.i0(pin);
        builder.f67445h = Short.valueOf((short) i15);
        builder.f67463u = pin.d5();
        builder.f67438d0 = pin.b5();
        builder.F = Boolean.valueOf(d1(pin));
        Boolean bool3 = bool2;
        builder.f67468z = Double.valueOf(i14);
        builder.A = Double.valueOf(i13);
        x32.b bVar3 = bVar2;
        String str7 = str6;
        builder.B = Double.valueOf(hf0.b.f69003c - hf0.b.f());
        builder.C = Double.valueOf(hf0.b.f69002b);
        builder.f67455m = pin.z4();
        builder.f67430J = str2;
        builder.X = str5;
        builder.f67443g = num2 != null ? Short.valueOf((short) num2.intValue()) : null;
        if (str != null) {
            builder.f67451k = Double.valueOf(j13);
            builder.f67453l = str;
            builder.f67456n = Boolean.valueOf(z16);
        } else {
            builder.f67453l = b40.Q0(pin) ? a2(pin) : p0(pin);
        }
        if (b40.X0(pin)) {
            builder.f67467y = b40.i0(pin);
            builder.f67465w = Boolean.TRUE;
        }
        if (z19) {
            ArrayList arrayList = new ArrayList(b40.a0(pin));
            if (z17) {
                arrayList.add(Integer.valueOf(h32.e2.HAS_CHIPS.getValue()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                h32.e2.Companion.getClass();
                h32.e2 a13 = c2.a(intValue);
                if (a13 != null) {
                    arrayList2.add(a13);
                }
            }
            builder.f67458p = arrayList2;
        }
        if (z18) {
            builder.D = Double.valueOf(b40.W(pin));
            builder.E = b40.X(pin);
        }
        if (k0Var != null) {
            builder.Z = k0Var;
        }
        if (eVar2 != null) {
            builder.f67452k0 = eVar2;
        }
        if (fVar != null) {
            builder.f67440e0 = fVar;
        }
        if (bVar3 != null) {
            builder.f67442f0 = bVar3;
        }
        if (str7 != null) {
            builder.f67446h0 = str7;
        }
        if (sh3 != null) {
            builder.f67448i0 = sh3;
        }
        builder.f67450j0 = bool3;
    }

    public static final o0 R(j3 j3Var, Function0 function0) {
        r3 r3Var = k3.f71150a;
        return new o0(j3Var, function0);
    }

    public static final Rect R0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        int i13 = iArr[1];
        rect.top = i13;
        rect.bottom = view.getHeight() + i13;
        int i14 = iArr[0];
        rect.left = i14;
        rect.right = view.getWidth() + i14;
        return rect;
    }

    public static final void R1(View view, boolean z13) {
        if (z13) {
            U1(view);
        } else {
            X0(view);
        }
    }

    public static final o0 S(Function0 function0) {
        r3 r3Var = k3.f71150a;
        return new o0(null, function0);
    }

    public static final Float S0(float f13, Float f14) {
        if (f14 != null) {
            return Float.valueOf(f13 / f14.floatValue());
        }
        return null;
    }

    public static final Object S1(q2 q2Var, Function2 function2) {
        Object zVar;
        Object R;
        m0.R(q2Var, true, new y0(l0.s0(q2Var.f69787d.getContext()).a(q2Var.f20195e, q2Var, q2Var.f20108c), 0));
        try {
            if (function2 instanceof dl2.a) {
                dl2.b.y(2, function2);
                zVar = function2.invoke(q2Var, q2Var);
            } else {
                zVar = cl2.h.c(function2, q2Var, q2Var);
            }
        } catch (Throwable th3) {
            zVar = new ao2.z(false, th3);
        }
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (zVar == aVar || (R = q2Var.R(zVar)) == ao2.b2.f20117b) {
            return aVar;
        }
        if (R instanceof ao2.z) {
            Throwable th4 = ((ao2.z) R).f20242a;
            if (!(th4 instanceof TimeoutCancellationException)) {
                throw th4;
            }
            if (((TimeoutCancellationException) th4).f80508a != q2Var) {
                throw th4;
            }
            if (zVar instanceof ao2.z) {
                throw ((ao2.z) zVar).f20242a;
            }
        } else {
            zVar = ao2.b2.b(R);
        }
        return zVar;
    }

    public static float T(int i13) {
        Context context = kb0.a.f79058b;
        return m60.f0.X().getResources().getDimension(i13);
    }

    public static final vn1.c T0(f30 f30Var, String title, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        if (z13) {
            Boolean N5 = f30Var.N5();
            Intrinsics.checkNotNullExpressionValue(N5, "getPromotedIsAutoAssembled(...)");
            if (N5.booleanValue()) {
                return vn1.c.ERROR;
            }
        }
        return (z14 && b40.a1(f30Var, z15)) ? vn1.c.ERROR : z16 ? vn1.c.LIGHT : vn1.c.DEFAULT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r6 == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final mi1.b T1(mi1.a r6, lh0.r2 r7) {
        /*
            java.lang.String r0 = "pinType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            if (r7 == 0) goto L85
            java.lang.String r1 = "enabled_indicator_and_affiliate_removal"
            boolean r1 = r7.P(r1)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L49
            java.lang.String r1 = "employees"
            boolean r1 = r7.P(r1)
            if (r1 == 0) goto L1c
            goto L49
        L1c:
            int[] r1 = mi1.c.f87215a
            int r5 = r6.ordinal()
            r1 = r1[r5]
            if (r1 == r4) goto L3e
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.String r1 = "enabled_affiliate_text_removal"
            boolean r1 = r7.P(r1)
            goto L44
        L31:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L37:
            java.lang.String r1 = "enabled_shuffles_indicator_removal"
            boolean r1 = r7.P(r1)
            goto L44
        L3e:
            java.lang.String r1 = "enabled_gif_indicator_removal"
            boolean r1 = r7.P(r1)
        L44:
            if (r1 == 0) goto L47
            goto L49
        L47:
            r1 = r0
            goto L4a
        L49:
            r1 = r4
        L4a:
            java.lang.String r5 = "control_indicator_and_affiliate_removal"
            boolean r5 = r7.O(r5)
            if (r5 != 0) goto L7e
            if (r1 != 0) goto L7e
            int[] r5 = mi1.c.f87215a
            int r6 = r6.ordinal()
            r6 = r5[r6]
            if (r6 == r4) goto L76
            if (r6 == r3) goto L6f
            if (r6 != r2) goto L69
            java.lang.String r6 = "control_affiliate_text_removal"
            boolean r6 = r7.O(r6)
            goto L7c
        L69:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L6f:
            java.lang.String r6 = "control_shuffles_indicator_removal"
            boolean r6 = r7.O(r6)
            goto L7c
        L76:
            java.lang.String r6 = "control_gif_indicator_removal"
            boolean r6 = r7.O(r6)
        L7c:
            if (r6 == 0) goto L7f
        L7e:
            r0 = r4
        L7f:
            mi1.b r6 = new mi1.b
            r6.<init>(r1, r0)
            return r6
        L85:
            mi1.b r6 = new mi1.b
            r6.<init>(r0, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bs1.c.T1(mi1.a, lh0.r2):mi1.b");
    }

    public static final int U(int i13, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return resources.getDimensionPixelOffset(i13);
    }

    public static ImageHeaderParser$ImageType U0(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            try {
                ImageHeaderParser$ImageType b13 = ((nd.f) list.get(i13)).b(byteBuffer);
                he.c.c(byteBuffer);
                if (b13 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return b13;
                }
            } catch (Throwable th3) {
                he.c.c(byteBuffer);
                throw th3;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final void U1(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public static final int V(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return U(i13, resources);
    }

    public static ImageHeaderParser$ImageType V0(qd.i iVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, iVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            try {
                ImageHeaderParser$ImageType d2 = ((nd.f) list.get(i13)).d(inputStream);
                inputStream.reset();
                if (d2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return d2;
                }
            } catch (Throwable th3) {
                inputStream.reset();
                throw th3;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final void V1(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isFocused()) {
            view.post(new q5.z(view, 3));
        }
    }

    public static final int W(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return V(context, i13);
    }

    public static int W0(long j13) {
        return (int) (j13 ^ (j13 >>> 32));
    }

    public static final void W1(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getViewTreeObserver().addOnWindowFocusChangeListener(new ye0.a(view));
    }

    public static final int X(Fragment fragment, int i13) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return V(requireContext, i13);
    }

    public static final void X0(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public static int X1(int i13) {
        return (int) (Integer.rotateLeft((int) (i13 * (-862048943)), 15) * 461845907);
    }

    public static final int Y(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDimensionPixelOffset(i13);
    }

    public static final int Y0(g1.h hVar, Object obj, int i13) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i14 = hVar.f63269c;
        if (i14 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        try {
            int a13 = h1.a.a(hVar.f63269c, i13, hVar.f63267a);
            if (a13 < 0 || Intrinsics.d(obj, hVar.f63268b[a13])) {
                return a13;
            }
            int i15 = a13 + 1;
            while (i15 < i14 && hVar.f63267a[i15] == i13) {
                if (Intrinsics.d(obj, hVar.f63268b[i15])) {
                    return i15;
                }
                i15++;
            }
            for (int i16 = a13 - 1; i16 >= 0 && hVar.f63267a[i16] == i13; i16--) {
                if (Intrinsics.d(obj, hVar.f63268b[i16])) {
                    return i16;
                }
            }
            return ~i15;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int Y1(Object obj) {
        return X1(obj == null ? 0 : obj.hashCode());
    }

    public static final int Z(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Y(context, i13);
    }

    public static final int Z0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getInteger(i13);
    }

    public static final pb.k Z1(Function0 function0) {
        return new pb.k(new q3(function0, null));
    }

    public static final long a(int i13, int i14, int i15, int i16) {
        boolean z13 = false;
        if (!(i14 >= i13)) {
            kh2.n.i0("maxWidth(" + i14 + ") must be >= than minWidth(" + i13 + ')');
            throw null;
        }
        if (!(i16 >= i15)) {
            kh2.n.i0("maxHeight(" + i16 + ") must be >= than minHeight(" + i15 + ')');
            throw null;
        }
        if (i13 >= 0 && i15 >= 0) {
            z13 = true;
        }
        if (z13) {
            return N(i13, i14, i15, i16);
        }
        kh2.n.i0("minWidth(" + i13 + ") and minHeight(" + i15 + ") must be >= 0");
        throw null;
    }

    public static int a0(int i13) {
        Context context = kb0.a.f79058b;
        return m60.f0.X().getResources().getDimensionPixelSize(i13);
    }

    public static final int a1(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Z0(context, i13);
    }

    public static final String a2(f30 f30Var) {
        List t13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        dl0 v63 = f30Var.v6();
        if (v63 == null || (t13 = v63.s()) == null) {
            dl0 v64 = f30Var.v6();
            t13 = v64 != null ? v64.t() : null;
            if (t13 == null) {
                return null;
            }
        }
        uo0 uo0Var = (uo0) CollectionsKt.U(0, t13);
        as1.b a13 = as1.b.a();
        if (uo0Var == null) {
            return null;
        }
        String b13 = a13.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getDisplayLargeImageWidth(...)");
        String e13 = a13.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getFallbackLargeImageResolution(...)");
        return d.M(uo0Var, b13, e13);
    }

    public static /* synthetic */ long b(int i13, int i14, int i15) {
        if ((i15 & 2) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        if ((i15 & 8) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        return a(0, i13, 0, i14);
    }

    public static final int b0(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getResources().getDimensionPixelSize(i13);
    }

    public static final void b1(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    public static String b2(int i13) {
        Context context = kb0.a.f79058b;
        return m60.f0.X().getResources().getString(i13);
    }

    public static final long c(float f13, float f14) {
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    public static final Drawable c0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable h03 = h0(context, i13);
        if (h03 != null) {
            return h03;
        }
        throw new IllegalStateException(a.a.e("No drawable for resource id ", i13, ".").toString());
    }

    public static final boolean c1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            k0(context);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static final String c2(int i13, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        String string = resources.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final void d(int i13, List list) {
        int size = list.size();
        if (i13 < 0 || i13 >= size) {
            throw new IndexOutOfBoundsException(cb.j("Index ", i13, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final Drawable d0(Resources resources, int i13, Integer num, Integer num2, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Drawable drawable = resources.getDrawable(i13, theme);
        if (num != null) {
            drawable.setTint(resources.getColor(num.intValue(), theme));
        }
        if (num2 != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(num2.intValue());
            Intrinsics.f(drawable);
            drawable = d7.b.p0(drawable, resources, dimensionPixelSize, dimensionPixelSize);
        }
        Intrinsics.checkNotNullExpressionValue(drawable, "let(...)");
        return drawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0.booleanValue() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d1(com.pinterest.api.model.f30 r2) {
        /*
            boolean r0 = com.pinterest.api.model.b40.q0(r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "getIsPromoted(...)"
            boolean r0 = n60.o.B(r2, r0)
            if (r0 != 0) goto L26
            java.lang.Boolean r0 = r2.F4()
            java.lang.String r1 = "getIsDownstreamPromotion(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1e
            goto L26
        L1e:
            boolean r2 = com.pinterest.api.model.b40.q0(r2)
            if (r2 == 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bs1.c.d1(com.pinterest.api.model.f30):boolean");
    }

    public static final String d2(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = context.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final void e(int i13, int i14, List list) {
        int size = list.size();
        if (i13 > i14) {
            throw new IllegalArgumentException(cb.j("Indices are out of order. fromIndex (", i13, ") is greater than toIndex (", i14, ")."));
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(a.a.e("fromIndex (", i13, ") is less than 0."));
        }
        if (i14 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i14 + ") is more than than the list size (" + size + ')');
    }

    public static final Drawable e0(Fragment fragment, int i13, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Resources resources = fragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Resources.Theme theme = fragment.requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return d0(resources, i13, num, num2, theme);
    }

    public static final boolean e1(i0 i0Var, Context context) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return i0Var.a(context).length() == 0;
    }

    public static final String e2(Context context, int i13, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = context.getString(i13, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final String f(Method method) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb3.append(c0.M(parameterTypes, "", "(", ")", 0, null, ul2.b.f122493o, 24));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb3.append(gm2.d.b(returnType));
        return sb3.toString();
    }

    public static Drawable f0(View view, int i13, Integer num, Integer num2, int i14) {
        if ((i14 & 2) != 0) {
            num = null;
        }
        if ((i14 & 4) != 0) {
            num2 = null;
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Resources.Theme theme = view.getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return d0(resources, i13, num, num2, theme);
    }

    public static final boolean f1(f30 pin) {
        if (pin == null || !b40.I0(pin)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(pin, "pin");
        return wz.a.IN_STOCK == po1.c.a(pin);
    }

    public static final String f2(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        String string = view.getContext().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final int g(int i13) {
        if (i13 < 8191) {
            return 262142;
        }
        if (i13 < 32767) {
            return 65534;
        }
        if (i13 < 65535) {
            return 32766;
        }
        if (i13 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(a.a.e("Can't represent a size of ", i13, " in Constraints"));
    }

    public static /* synthetic */ Drawable g0(Fragment fragment, int i13, Integer num, int i14) {
        if ((i14 & 4) != 0) {
            num = null;
        }
        return e0(fragment, i13, null, num);
    }

    public static final boolean g1(v7 oldBoard, v7 newBoard) {
        Intrinsics.checkNotNullParameter(oldBoard, "oldBoard");
        Intrinsics.checkNotNullParameter(newBoard, "newBoard");
        Intrinsics.checkNotNullParameter(oldBoard, "oldBoard");
        Intrinsics.checkNotNullParameter(newBoard, "newBoard");
        if (oldBoard.H0()) {
            Boolean G0 = oldBoard.G0();
            Intrinsics.checkNotNullExpressionValue(G0, "getCollaboratedByMe(...)");
            if (G0.booleanValue() && newBoard.H0()) {
                Boolean G02 = newBoard.G0();
                Intrinsics.checkNotNullExpressionValue(G02, "getCollaboratedByMe(...)");
                if (G02.booleanValue() && oldBoard.M0() && oldBoard.O0() && !newBoard.M0() && !newBoard.O0()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String g2(View view, int i13, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = view.getContext().getString(i13, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static void h(x92.b bVar) {
        a0.b(bVar);
        bVar.e("board.has_custom_cover");
        bVar.e("board.image_cover_url");
        bVar.e("board.collaborated_by_me");
        bVar.e("board.is_collaborative");
        n60.o.w(bVar, "board.followed_by_me", "board.privacy", "board.owner()", "board.pin_count");
        bVar.e("board.board_order_modified_at");
        bVar.h("board.images", "90x90");
    }

    public static final Drawable h0(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (i13 == 0) {
            return null;
        }
        Object obj = d5.a.f53679a;
        return context.getDrawable(i13);
    }

    public static final boolean h1(f30 f30Var) {
        String j03;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String D = com.bumptech.glide.c.D(f30Var);
        return (Intrinsics.d(D, y0(f30Var)) || Intrinsics.d(D, B0(f30Var))) && ((j03 = b40.j0(f30Var)) == null || j03.length() == 0);
    }

    public static final u50.f0 h2(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return new u50.f0(string);
    }

    public static final void i(NavigationImpl navigation, PinFeed pinFeed, int i13, String str, String str2, int i14, ArrayList arrayList, String str3, TrackingParamKeyBuilder trackingParamKeyBuilder, Boolean bool) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(trackingParamKeyBuilder, "trackingParamKeyBuilder");
        if (pinFeed != null) {
            navigation.y0(pinFeed, "com.pinterest.EXTRA_FEED");
            vb0.j.f125466a.S(pinFeed.n() > i13, "pinPosition is invalid", new Object[0]);
        }
        navigation.z(i13, "com.pinterest.EXTRA_PIN_POSITION");
        navigation.m0("com.pinterest.EXTRA_SOURCE_QUERY", str);
        navigation.m0("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", str2);
        navigation.m0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE", str3);
        navigation.z(i14, "com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE_DEPTH");
        navigation.w0(trackingParamKeyBuilder, "com.pinterest.TRACKING_PARAMETER_BUILDER");
        if (arrayList != null && !arrayList.isEmpty()) {
            navigation.d("com.pinterest.EXTRA_CONTEXT_PIN_IDS", arrayList);
        }
        navigation.Y1("com.pinterest.EXTRA_CLOSEUP_IS_PIN_HIDE_SUPPORTED", bool != null ? bool.booleanValue() : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0054, B:19:0x0069, B:21:0x0071, B:32:0x0046, B:34:0x0050), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i0(do2.j r6, co2.b0 r7, boolean r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof do2.m
            if (r0 == 0) goto L13
            r0 = r9
            do2.m r0 = (do2.m) r0
            int r1 = r0.f55854w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55854w = r1
            goto L18
        L13:
            do2.m r0 = new do2.m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f55853v
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55854w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f55852u
            co2.e r6 = r0.f55851t
            co2.b0 r7 = r0.f55850s
            do2.j r2 = r0.f55849r
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L54
        L34:
            r6 = move-exception
            goto L8f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f55852u
            co2.e r6 = r0.f55851t
            co2.b0 r7 = r0.f55850s
            do2.j r2 = r0.f55849r
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L34
            goto L69
        L4a:
            ue.c.H(r9)
            lb.l0.a0(r6)
            co2.e r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L54:
            r0.f55849r = r6     // Catch: java.lang.Throwable -> L34
            r0.f55850s = r7     // Catch: java.lang.Throwable -> L34
            r0.f55851t = r9     // Catch: java.lang.Throwable -> L34
            r0.f55852u = r8     // Catch: java.lang.Throwable -> L34
            r0.f55854w = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.d(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L86
            java.lang.Object r9 = r6.e()     // Catch: java.lang.Throwable -> L34
            r0.f55849r = r2     // Catch: java.lang.Throwable -> L34
            r0.f55850s = r7     // Catch: java.lang.Throwable -> L34
            r0.f55851t = r6     // Catch: java.lang.Throwable -> L34
            r0.f55852u = r8     // Catch: java.lang.Throwable -> L34
            r0.f55854w = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
            return r1
        L86:
            if (r8 == 0) goto L8c
            r6 = 0
            com.bumptech.glide.c.o(r7, r6)
        L8c:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L8f:
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r9 = move-exception
            if (r8 == 0) goto L96
            com.bumptech.glide.c.o(r7, r6)
        L96:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bs1.c.i0(do2.j, co2.b0, boolean, bl2.c):java.lang.Object");
    }

    public static final boolean i1(i0 i0Var, Context context) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return i0Var.a(context).length() > 0;
    }

    public static final j0 i2(int i13, int i14, String... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new j0(i13, i14, c0.b0(formatArgs));
    }

    public static final void j(NavigationImpl navigation, PinFeed pinFeed, int i13, String str, String str2, int i14, ArrayList arrayList, String str3, d0 pinalytics, Boolean bool) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        TrackingParamKeyBuilder trackingParamKeyBuilder = new TrackingParamKeyBuilder();
        h32.i0 p13 = pinalytics.p();
        d4 d4Var = p13 != null ? p13.f67081a : null;
        if (d4Var == null) {
            vb0.j.f125466a.F("Null ViewType found when instantiating TrackingParamKeyBuilder. Context(ViewType = null, ViewParameterType = " + (p13 != null ? p13.f67082b : null) + ", ComponentType = " + (p13 != null ? p13.f67084d : null) + ", ElementType = " + (p13 != null ? p13.f67086f : null) + ")", tb0.p.UNSPECIFIED, new Object[0]);
            d4Var = d4.UNKNOWN_VIEW;
        }
        trackingParamKeyBuilder.f35481a = d4Var;
        trackingParamKeyBuilder.f35482b = p13 != null ? p13.f67082b : null;
        trackingParamKeyBuilder.f35483c = pinalytics.getUniqueScreenKey();
        i(navigation, pinFeed, i13, str, str2, i14, arrayList, str3, trackingParamKeyBuilder, bool);
    }

    public static final gm2.e j0(Annotation[] annotationArr, ym2.c fqName) {
        Annotation annotation;
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        int length = annotationArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i13];
            if (Intrinsics.d(gm2.d.a(l0.t0(l0.m0(annotation))).b(), fqName)) {
                break;
            }
            i13++;
        }
        if (annotation != null) {
            return new gm2.e(annotation);
        }
        return null;
    }

    public static final boolean j1(View view) {
        return !o1(view);
    }

    public static final u50.k0 j2(String[] formatArgs, int i13) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        ArrayList arrayList = new ArrayList(formatArgs.length);
        for (String str : formatArgs) {
            arrayList.add(new u50.f0(str));
        }
        return new u50.k0(i13, arrayList);
    }

    public static final void k(g1.h hVar, int i13) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int[] iArr = new int[i13];
        hVar.getClass();
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        hVar.f63267a = iArr;
        Object[] objArr = new Object[i13];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        hVar.f63268b = objArr;
    }

    public static final Activity k0(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getBaseContext(...)");
        }
        throw new IllegalArgumentException("Cannot derive Activity from the Context " + context);
    }

    public static boolean k1(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final Drawable k2(Context context, int i13, int i14) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable != null) {
            return sh.f.d(i14 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i14), context, drawable);
        }
        return null;
    }

    public static final boolean l(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final Activity l0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            return m0(view);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static final boolean l1(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final Drawable l2(View view, int i13, int i14) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return k2(context, i13, i14);
    }

    public static final mr1.b m(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new mr1.b(activity);
    }

    public static final Activity m0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return k0(context);
    }

    public static final boolean m1(f30 pin, es.a adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        if (pin == null || ((es.c) adFormats).M(pin) || b40.r0(pin)) {
            return false;
        }
        mv.a[] adTypes = {mv.a.AD_ONTAP, mv.a.AD_DEEPLINK, mv.a.AD_APPINSTALL};
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(adTypes, "adTypes");
        if (pin.d5().booleanValue()) {
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = mv.b.f88319a[adTypes[i13].ordinal()];
                if (i14 == 1) {
                    if (df.j1.J0(pin)) {
                        return false;
                    }
                } else if (i14 == 2) {
                    String M5 = pin.M5();
                    if (M5 != null && M5.length() != 0) {
                        return false;
                    }
                } else {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (n60.o.B(pin, "getIsPromoted(...)")) {
                        Boolean R4 = pin.R4();
                        Intrinsics.checkNotNullExpressionValue(R4, "getIsEligibleForWebCloseup(...)");
                        if (R4.booleanValue()) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return true;
    }

    public static final Pair m2(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static final HashMap n(HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        HashMap hashMap = new HashMap();
        E1(hashMap, auxData);
        return hashMap;
    }

    public static final ArrayList n0(Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new gm2.e(annotation));
        }
        return arrayList;
    }

    public static final boolean n1(long j13, long j14) {
        int j15 = n4.a.j(j13);
        int h10 = n4.a.h(j13);
        int i13 = (int) (j14 >> 32);
        if (j15 <= i13 && i13 <= h10) {
            int i14 = n4.a.i(j13);
            int g13 = n4.a.g(j13);
            int i15 = (int) (j14 & 4294967295L);
            if (i14 <= i15 && i15 <= g13) {
                return true;
            }
        }
        return false;
    }

    public static final u0 n2(i annotations) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            u0.f100848b.getClass();
            return u0.f100849c;
        }
        t0 t0Var = u0.f100848b;
        List b13 = e0.b(new pn2.m(annotations));
        t0Var.getClass();
        return t0.a(b13);
    }

    public static final HashMap o(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap hashMap = new HashMap();
        F1(hashMap, (Pair[]) Arrays.copyOf(pairs, pairs.length));
        return hashMap;
    }

    public static final String o0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String y03 = y0(f30Var);
        return y03 == null ? B0(f30Var) : y03;
    }

    public static final boolean o1(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static final nx.q o2(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return new nx.q(hashMap);
    }

    public static final nx.d p(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        nx.d dVar = new nx.d();
        z0.l(dVar, pairs);
        return dVar;
    }

    public static final String p0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String B0 = B0(f30Var);
        return B0 == null ? y0(f30Var) : B0;
    }

    public static final void p1(View view, int i13, int i14) {
        if (view == null || j1(view)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i15 = i13 + marginLayoutParams.leftMargin;
        int i16 = i14 + marginLayoutParams.topMargin;
        view.layout(i15, i16, view.getMeasuredWidth() + i15, view.getMeasuredHeight() + i16);
    }

    public static final u50.f0 p2(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new u50.f0(charSequence);
    }

    public static final wa2.i q(boolean z13) {
        boolean z14;
        if (z13) {
            v vVar = zf0.f.f141903e;
            vb0.e.e().getClass();
            if (zf0.f.h()) {
                z14 = true;
                return new wa2.i(0, -537407578, -1, 1023, null, true, true, true, true, false, true, true, false, z13, false, z14, false, false, false, false, false, false, false, false, false);
            }
        }
        z14 = false;
        return new wa2.i(0, -537407578, -1, 1023, null, true, true, true, true, false, true, true, false, z13, false, z14, false, false, false, false, false, false, false, false, false);
    }

    public static final h32.c1 q0(f30 f30Var, ur.a ads) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        if (f30Var == null) {
            return null;
        }
        ur.b bVar = (ur.b) ads;
        k0 c13 = es.h.c(bVar.f123060c, f30Var);
        h32.f fVar = ((es.c) bVar.f123058a).j0(f30Var) ? new h32.f() : null;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        k0 k0Var = c13 != null ? c13 : null;
        h32.f fVar2 = fVar != null ? fVar : null;
        Short o13 = ((es.v) bVar.f123060c).o(f30Var);
        return new h32.c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, k0Var, null, null, fVar2, null, null, null, null, o13 != null ? Short.valueOf(o13.shortValue()) : null, null, null);
    }

    public static String q1(String str, Object... objArr) {
        int indexOf;
        String sb3;
        int i13 = 0;
        for (int i14 = 0; i14 < objArr.length; i14++) {
            Object obj = objArr[i14];
            if (obj == null) {
                sb3 = "null";
            } else {
                try {
                    sb3 = obj.toString();
                } catch (Exception e13) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e13);
                    StringBuilder o13 = cb.o("<", str2, " threw ");
                    o13.append(e13.getClass().getName());
                    o13.append(">");
                    sb3 = o13.toString();
                }
            }
            objArr[i14] = sb3;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + str.length());
        int i15 = 0;
        while (i13 < objArr.length && (indexOf = str.indexOf("%s", i15)) != -1) {
            sb4.append((CharSequence) str, i15, indexOf);
            sb4.append(objArr[i13]);
            i15 = indexOf + 2;
            i13++;
        }
        sb4.append((CharSequence) str, i15, str.length());
        if (i13 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb4.append(", ");
                sb4.append(objArr[i16]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static final String q2(int i13, String description) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(description, "description");
        String substring = description.substring(0, i13);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        int length = substring.length() - 1;
        if (length >= 0) {
            while (true) {
                int i14 = length - 1;
                if (!StringsKt.F(" .,", substring.charAt(length))) {
                    charSequence = substring.subSequence(0, length + 1);
                    break;
                }
                if (i14 < 0) {
                    break;
                }
                length = i14;
            }
        }
        charSequence = "";
        return a.a.C(charSequence.toString(), "…");
    }

    public static /* synthetic */ wa2.i r() {
        v vVar = zf0.f.f141903e;
        vb0.e.e().getClass();
        return q(zf0.f.h());
    }

    public static final long r0(long j13) {
        if (j13 != y2.h.f136670b) {
            return com.bumptech.glide.c.d(Float.intBitsToFloat((int) (j13 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j13 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final void r1(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        h32.i0 p13 = pinalytics.p();
        if (p13 != null) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.k("NullPinInPinGridCell", f0.l(new android.util.Pair("LoggingContext", p13.toString())));
        }
    }

    public static boolean r2(xp2.a aVar, xp2.b bVar, ak2.f fVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) aVar).call();
            if (call == null) {
                ok2.d.complete(bVar);
                return true;
            }
            try {
                Object apply = fVar.apply(call);
                ck2.i.b(apply, "The mapper returned a null Publisher");
                xp2.a aVar2 = (xp2.a) apply;
                if (aVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) aVar2).call();
                        if (call2 == null) {
                            ok2.d.complete(bVar);
                            return true;
                        }
                        bVar.d(new ok2.e(call2, bVar));
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        ok2.d.error(th3, bVar);
                        return true;
                    }
                } else {
                    aVar2.b(bVar);
                }
                return true;
            } catch (Throwable th4) {
                bp1.h.H(th4);
                ok2.d.error(th4, bVar);
                return true;
            }
        } catch (Throwable th5) {
            bp1.h.H(th5);
            ok2.d.error(th5, bVar);
            return true;
        }
    }

    public static final void s(GestaltButton gestaltButton, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltButton, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        yl1.l lVar = new yl1.l(gestaltButton.h());
        init.invoke(lVar);
        gestaltButton.d(new hk1.t(lVar, 7));
    }

    public static final ym2.b s0(f fVar, int i13) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        ym2.b e13 = ym2.b.e(fVar.b(i13), fVar.a(i13));
        Intrinsics.checkNotNullExpressionValue(e13, "fromString(...)");
        return e13;
    }

    public static void s1(View view, int i13, int i14, Function1 function1, int i15) {
        if ((i15 & 1) != 0) {
            i13 = -2;
        }
        if ((i15 & 2) != 0) {
            i14 = -2;
        }
        if ((i15 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        if (function1 != null) {
            function1.invoke(layoutParams);
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void s2(View view, CharSequence... text) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        try {
            Object systemService = view.getContext().getSystemService("accessibility");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(64);
                obtain.setClassName(view.getClass().getName());
                obtain.setPackageName(view.getContext().getPackageName());
                obtain.setEventType(16384);
                ArrayList arrayList = new ArrayList();
                for (CharSequence charSequence : text) {
                    if (charSequence != null && charSequence.length() > 0) {
                        arrayList.add(charSequence);
                    }
                }
                obtain.getText().addAll(arrayList);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public static final int t(int i13) {
        if (i13 < 8191) {
            return 13;
        }
        if (i13 < 32767) {
            return 15;
        }
        if (i13 < 65535) {
            return 16;
        }
        return i13 < 262143 ? 18 : 255;
    }

    public static void t1(MediaFormat mediaFormat, String str, int i13) {
        if (i13 != -1) {
            mediaFormat.setInteger(str, i13);
        }
    }

    public static final void t2(tn1.c cVar, vn1.c color, vn1.b alignment) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        cVar.a(new bk1.y1(new tn1.e(vn1.g.BODY_100, vn1.g.UI_100), cVar, new tn1.d(tn1.c.f118618j, tn1.c.f118617i), color, alignment, 1));
    }

    public static void u(tn1.c cVar, vn1.c cVar2, int i13) {
        if ((i13 & 1) != 0) {
            cVar2 = tn1.c.f118612d.b();
        }
        vn1.c color = cVar2;
        vn1.b alignment = tn1.c.f118615g;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        vn1.g gVar = vn1.g.BODY_100;
        cVar.a(new bk1.y1(new tn1.e(gVar, gVar), cVar, new tn1.d(tn1.c.f118618j, tn1.c.f118617i), color, alignment, 1));
    }

    public static final Typeface u0(Context context, lm1.g themeFont) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(themeFont, "themeFont");
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        try {
            if (df.j1.c1(df.j1.w0(zm1.a.font_type, theme))) {
                typeface = e5.n.a(context, themeFont.getFont(g92.d.VR));
                Intrinsics.f(typeface);
            } else {
                typeface = te0.g.a(context, themeFont.getGestaltFont(), null, 12);
            }
        } catch (Resources.NotFoundException unused) {
            switch (lm1.a.f83924a[themeFont.ordinal()]) {
                case 1:
                case 2:
                    typeface = Typeface.DEFAULT;
                    break;
                case 3:
                case 4:
                    typeface = Typeface.DEFAULT;
                    break;
                case 5:
                case 6:
                    typeface = Typeface.DEFAULT_BOLD;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Intrinsics.f(typeface);
        }
        return typeface;
    }

    public static final ParcelableSnapshotMutableState u1(Object obj, j3 j3Var) {
        int i13 = i2.c.f71081b;
        return new ParcelableSnapshotMutableState(obj, j3Var);
    }

    public static void u2(tn1.c cVar, vn1.c cVar2, vn1.b bVar, int i13) {
        if ((i13 & 1) != 0) {
            cVar2 = tn1.c.f118612d.b();
        }
        if ((i13 & 2) != 0) {
            bVar = tn1.c.f118615g;
        }
        t2(cVar, cVar2, bVar);
    }

    public static void v(int i13, Object[] objArr) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (objArr[i14] == null) {
                throw new NullPointerException(a.a.d("at index ", i14));
            }
        }
    }

    public static final float v0(f30 f30Var) {
        Set entrySet;
        Map.Entry entry;
        if (f30Var == null) {
            return 1.0f;
        }
        Map A4 = f30Var.A4();
        if (((A4 == null || (entrySet = A4.entrySet()) == null || (entry = (Map.Entry) CollectionsKt.T(entrySet)) == null) ? null : (sr) entry.getValue()) != null) {
            return E0(r1) / w0(r1);
        }
        return 1.0f;
    }

    public static String v1(String str) {
        return str == null ? "" : str;
    }

    public static final void v2(tn1.c cVar, vn1.c color, vn1.b alignment) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        cVar.a(new bk1.y1(new tn1.e(vn1.g.BODY_400, vn1.g.UI_300), cVar, new tn1.d(tn1.c.f118618j, tn1.c.f118617i), color, alignment, 1));
    }

    public static void w(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static final int w0(sr srVar) {
        if (srVar != null) {
            return (int) srVar.h().doubleValue();
        }
        return 0;
    }

    public static final long w1(int i13, int i14, long j13) {
        int j14 = n4.a.j(j13) + i13;
        if (j14 < 0) {
            j14 = 0;
        }
        int h10 = n4.a.h(j13);
        if (h10 != Integer.MAX_VALUE && (h10 = h10 + i13) < 0) {
            h10 = 0;
        }
        int i15 = n4.a.i(j13) + i14;
        if (i15 < 0) {
            i15 = 0;
        }
        int g13 = n4.a.g(j13);
        if (g13 != Integer.MAX_VALUE) {
            int i16 = g13 + i14;
            g13 = i16 >= 0 ? i16 : 0;
        }
        return a(j14, h10, i15, g13);
    }

    public static final Object w2(long j13, Function2 function2, bl2.c frame) {
        if (j13 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object S1 = S1(new q2(j13, frame), function2);
        if (S1 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return S1;
    }

    public static rg.a x(rg.a aVar, am2.i containingDeclaration, pm2.q qVar, int i13) {
        if ((i13 & 2) != 0) {
            qVar = null;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return new rg.a((lm2.a) aVar.f107929a, qVar != null ? new lm2.f(aVar, containingDeclaration, qVar, 0) : (lm2.h) aVar.f107930b, m.a(xk2.n.NONE, new j2(23, aVar, containingDeclaration)));
    }

    public static final int x0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        return w0(b.a(f30Var, a13));
    }

    public static BigDecimal x1(String str) {
        w(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static final Object x2(long j13, Function2 function2, bl2.c cVar) {
        return w2(l0.w1(j13), function2, cVar);
    }

    public static final q1 y(do2.i iVar, Object obj, CoroutineContext coroutineContext, o oVar, int i13, int i14) {
        if ((i14 & 2) != 0) {
            coroutineContext = kotlin.coroutines.j.f80412a;
        }
        i2.s sVar = (i2.s) oVar;
        boolean j13 = sVar.j(coroutineContext) | sVar.j(iVar);
        Object J2 = sVar.J();
        am.d dVar = n.f71185a;
        if (j13 || J2 == dVar) {
            J2 = new p3(coroutineContext, iVar, null);
            sVar.g0(J2);
        }
        Function2 function2 = (Function2) J2;
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = u1(obj, y3.f71400a);
            sVar.g0(J3);
        }
        q1 q1Var = (q1) J3;
        boolean j14 = sVar.j(function2);
        Object J4 = sVar.J();
        if (j14 || J4 == dVar) {
            J4 = new m3(function2, q1Var, null);
            sVar.g0(J4);
        }
        u.d(iVar, coroutineContext, (Function2) J4, sVar);
        return q1Var;
    }

    public static final String y0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        return D0(b.a(f30Var, a13));
    }

    public static dc.a y1(e eVar, h hVar) {
        return new dc.a(t.a(eVar, hVar, 1.0f, hc.f.f68641a, false), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y2(long r7, kotlin.jvm.functions.Function2 r9, bl2.c r10) {
        /*
            boolean r0 = r10 instanceof ao2.r2
            if (r0 == 0) goto L13
            r0 = r10
            ao2.r2 r0 = (ao2.r2) r0
            int r1 = r0.f20202u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20202u = r1
            goto L18
        L13:
            ao2.r2 r0 = new ao2.r2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20201t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f20202u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            kotlin.jvm.internal.j0 r7 = r0.f20200s
            kotlin.jvm.functions.Function2 r8 = r0.f20199r
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            ue.c.H(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L2e
            goto L6a
        L2e:
            r8 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            ue.c.H(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L42
            return r3
        L42:
            kotlin.jvm.internal.j0 r10 = new kotlin.jvm.internal.j0
            r10.<init>()
            r0.f20199r = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r0.f20200s = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r0.f20202u = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            ao2.q2 r2 = new ao2.q2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r10.f80434a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            java.lang.Object r7 = S1(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            if (r7 != r1) goto L66
            java.lang.String r8 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L62
            goto L66
        L60:
            r8 = r7
            goto L64
        L62:
            r7 = move-exception
            goto L60
        L64:
            r7 = r10
            goto L6d
        L66:
            if (r7 != r1) goto L69
            return r1
        L69:
            r10 = r7
        L6a:
            return r10
        L6b:
            r8 = move-exception
            goto L64
        L6d:
            ao2.o1 r9 = r8.f80508a
            java.lang.Object r7 = r7.f80434a
            if (r9 != r7) goto L74
            return r3
        L74:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bs1.c.y2(long, kotlin.jvm.functions.Function2, bl2.c):java.lang.Object");
    }

    public static final q1 z(r2 r2Var, o oVar) {
        return y(r2Var, r2Var.getValue(), kotlin.coroutines.j.f80412a, oVar, 8, 0);
    }

    public static final int z0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        return E0(b.a(f30Var, a13));
    }

    public static dc.b z1(ic.d dVar, h hVar, boolean z13) {
        return new dc.b(t.a(dVar, hVar, z13 ? g.c() : 1.0f, hc.j.f68657a, false), 1);
    }

    public static final void z2(tc.g gVar, Object obj) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (obj == null) {
            gVar.a2();
            return;
        }
        if (obj instanceof Map) {
            gVar.s();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                gVar.M0(String.valueOf(key));
                z2(gVar, value);
            }
            gVar.v();
            return;
        }
        if (obj instanceof List) {
            gVar.u();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                z2(gVar, it.next());
            }
            gVar.t();
            return;
        }
        if (obj instanceof Boolean) {
            gVar.h0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            gVar.D(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            gVar.C(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            gVar.H(((Number) obj).doubleValue());
            return;
        }
        if (!(obj instanceof tc.d)) {
            if (obj instanceof String) {
                gVar.n1((String) obj);
                return;
            }
            throw new IllegalStateException(("Cannot write " + obj + " to Json").toString());
        }
        gVar.y((tc.d) obj);
    }

    public abstract void t0(float f13, float f14, bk.z zVar);
}
