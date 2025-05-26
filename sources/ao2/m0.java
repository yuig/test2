package ao2;

import a.cb;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import com.pinterest.xrenderer.RustBridge$Renderer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public abstract class m0 {

    /* renamed from: a */
    public static Boolean f20171a;

    /* renamed from: b */
    public static boolean f20172b;

    /* renamed from: c */
    public static boolean f20173c;

    /* renamed from: d */
    public static boolean f20174d;

    public static final ArrayList A(rl2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ul2.y yVar = (ul2.y) ((ul2.c0) dVar).f122503c.getValue();
        yVar.getClass();
        rl2.u uVar = ul2.y.f122632l[13];
        Object invoke = yVar.f122640j.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Collection) invoke) {
            ul2.t tVar = (ul2.t) obj;
            if ((!(tVar.n().D() != null)) && (tVar instanceof rl2.t)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ColorStateList B(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!N(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i13 = typedValue.type;
        if (i13 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i13 >= 28 && i13 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = e5.c.f57213a;
        try {
            return e5.c.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e13) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e13);
            return null;
        }
    }

    public static e5.d C(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i13) {
        e5.d dVar;
        if (N(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i13, typedValue);
            int i14 = typedValue.type;
            if (i14 >= 28 && i14 <= 31) {
                return new e5.d((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                dVar = e5.d.c(typedArray.getResourceId(i13, 0), theme, typedArray.getResources());
            } catch (Exception e13) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e13);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new e5.d((Shader) null, (ColorStateList) null, 0);
    }

    public static int D(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i13, int i14) {
        return !N(xmlPullParser, str) ? i14 : typedArray.getInt(i13, i14);
    }

    public static String E(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i13) {
        if (N(xmlPullParser, str)) {
            return typedArray.getString(i13);
        }
        return null;
    }

    public static final s3.g2 F(s3.k0 k0Var) {
        u2.p pVar = k0Var.f110837y.f110808e;
        Object obj = null;
        if ((pVar.f120045d & 8) != 0) {
            loop0: while (true) {
                if (pVar == null) {
                    break;
                }
                if ((pVar.f120044c & 8) != 0) {
                    u2.p pVar2 = pVar;
                    k2.e eVar = null;
                    while (pVar2 != null) {
                        if (pVar2 instanceof s3.g2) {
                            if (((s3.g2) pVar2).x0()) {
                                obj = pVar2;
                                break loop0;
                            }
                        } else if ((pVar2.f120044c & 8) != 0 && (pVar2 instanceof s3.n)) {
                            int i13 = 0;
                            for (u2.p pVar3 = ((s3.n) pVar2).f110843o; pVar3 != null; pVar3 = pVar3.f120047f) {
                                if ((pVar3.f120044c & 8) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        pVar2 = pVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new k2.e(new u2.p[16]);
                                        }
                                        if (pVar2 != null) {
                                            eVar.b(pVar2);
                                            pVar2 = null;
                                        }
                                        eVar.b(pVar3);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        pVar2 = com.bumptech.glide.c.g(eVar);
                    }
                }
                if ((pVar.f120045d & 8) == 0) {
                    break;
                }
                pVar = pVar.f120047f;
            }
        }
        return (s3.g2) obj;
    }

    public static Intent G(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String I = I(activity, activity.getComponentName());
            if (I == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, I);
            try {
                return I(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + I + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static Intent H(Context context, ComponentName componentName) {
        String I = I(context, componentName);
        if (I == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), I);
        return I(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String I(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final boolean J() {
        return f20173c;
    }

    public static final boolean K() {
        return f20174d;
    }

    public static final am2.j L(am2.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        am2.m g13 = mVar.g();
        if (g13 == null || (mVar instanceof am2.i0)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(g13, "<this>");
        if (!(g13.g() instanceof am2.i0)) {
            return L(g13);
        }
        if (g13 instanceof am2.j) {
            return (am2.j) g13;
        }
        return null;
    }

    public static kd2.i M() {
        kd2.i iVar = kd2.i.f79272h;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("XRendererApp must be initialized first.".toString());
    }

    public static boolean N(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean O(me2.c gpuBackend) {
        Intrinsics.checkNotNullParameter(gpuBackend, "gpuBackend");
        kd2.i M = M();
        Intrinsics.checkNotNullParameter(gpuBackend, "gpuBackend");
        synchronized (M.f79275c) {
            me2.c.Companion.getClass();
            if (!me2.b.a(gpuBackend)) {
                return false;
            }
            if (M.f79276d == 0) {
                ((kd2.e) M.a()).b(new c72.o(gpuBackend, 29), "XRenderer");
                M.f79276d = RustBridge$Renderer.f52861a.init(gpuBackend.getValue(), true);
            }
            return true;
        }
    }

    public static final float[] P(float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[3];
        float f15 = fArr[6];
        float f16 = fArr[1];
        float f17 = fArr[4];
        float f18 = fArr[7];
        float f19 = fArr[2];
        float f23 = fArr[5];
        float f24 = fArr[8];
        float f25 = (f17 * f24) - (f18 * f23);
        float f26 = (f18 * f19) - (f16 * f24);
        float f27 = (f16 * f23) - (f17 * f19);
        float f28 = (f15 * f27) + (f14 * f26) + (f13 * f25);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f25 / f28;
        fArr2[1] = f26 / f28;
        fArr2[2] = f27 / f28;
        fArr2[3] = cb.a(f14, f24, f15 * f23, f28);
        fArr2[4] = cb.a(f15, f19, f24 * f13, f28);
        fArr2[5] = cb.a(f13, f23, f19 * f14, f28);
        fArr2[6] = cb.a(f15, f17, f14 * f18, f28);
        fArr2[7] = cb.a(f13, f18, f15 * f16, f28);
        fArr2[8] = cb.a(f14, f16, f13 * f17, f28);
        return fArr2;
    }

    public static String Q(vn2.e eVar, am2.x functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        if (eVar.a(functionDescriptor)) {
            return null;
        }
        return eVar.getDescription();
    }

    public static final x0 R(o1 o1Var, boolean z13, r1 r1Var) {
        return o1Var instanceof a2 ? ((a2) o1Var).O(z13, r1Var) : o1Var.invokeOnCompletion(r1Var.i(), z13, new q1(1, r1Var, r1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean S(CoroutineContext coroutineContext) {
        o1 o1Var = (o1) coroutineContext.get(g0.f20154b);
        if (o1Var != null) {
            return o1Var.isActive();
        }
        return true;
    }

    public static final boolean T(AssertionError assertionError) {
        String message;
        Logger logger = wo2.u.f130736a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !StringsKt.E(message, "getsockname failed", false)) ? false : true;
    }

    public static final boolean U(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        pn2.v1 z03 = b0Var.z0();
        return (z03 instanceof rn2.j) || ((z03 instanceof pn2.v) && (((pn2.v) z03).D0() instanceof rn2.j));
    }

    public static q8.m V(g7.f fVar, int i13, q7.m mVar) {
        q7.j jVar = mVar.f102663g;
        pk.c1 c1Var = mVar.f102658b;
        if (jVar == null) {
            return null;
        }
        androidx.media3.common.b bVar = mVar.f102657a;
        String str = bVar.f18764n;
        g4.u uVar = l9.j.Jo;
        h8.e eVar = new h8.e((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new j9.i(32, uVar) : new h9.d(2, uVar), i13, bVar);
        try {
            q7.j n13 = mVar.n();
            bf.b.n(n13);
            q7.j m13 = mVar.m();
            if (m13 != null) {
                q7.j a13 = n13.a(m13, ((q7.b) c1Var.get(0)).f102600a);
                if (a13 == null) {
                    new h8.o(fVar, j(mVar, ((q7.b) c1Var.get(0)).f102600a, n13, 0), mVar.f102657a, 0, null, eVar).h();
                } else {
                    m13 = a13;
                }
                new h8.o(fVar, j(mVar, ((q7.b) c1Var.get(0)).f102600a, m13, 0), mVar.f102657a, 0, null, eVar).h();
            }
            eVar.d();
            return eVar.a();
        } catch (Throwable th3) {
            eVar.d();
            throw th3;
        }
    }

    public static final u2.q W(i2.o oVar, u2.q qVar) {
        if (qVar.c(u2.m.f120040i)) {
            return qVar;
        }
        i2.s sVar = (i2.s) oVar;
        sVar.X(1219399079);
        u2.q qVar2 = (u2.q) qVar.b(u2.n.f120041b, new p1.p1(sVar, 6));
        sVar.r(false);
        return qVar2;
    }

    public static final u2.q X(i2.o oVar, u2.q qVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(439770924);
        u2.q W = W(sVar, qVar);
        sVar.r(false);
        return W;
    }

    public static Typeface Y(Configuration configuration, Typeface typeface) {
        int i13;
        int i14;
        int weight;
        int i15;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i13 = configuration.fontWeightAdjustment;
        if (i13 == Integer.MAX_VALUE) {
            return null;
        }
        i14 = configuration.fontWeightAdjustment;
        if (i14 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i15 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, com.bumptech.glide.c.q(i15 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static ok.g0 Z(ok.g0 g0Var) {
        return ((g0Var instanceof ok.i0) || (g0Var instanceof ok.h0)) ? g0Var : g0Var instanceof Serializable ? new ok.h0(g0Var) : new ok.i0(g0Var);
    }

    public static n4.c a() {
        return new n4.c(1.0f, 1.0f);
    }

    public static final float[] a0(float[] fArr, float[] fArr2) {
        float f13 = fArr[0];
        float f14 = fArr2[0];
        float f15 = fArr[3];
        float f16 = fArr2[1];
        float f17 = fArr[6];
        float f18 = fArr2[2];
        float f19 = (f17 * f18) + (f15 * f16) + (f13 * f14);
        float f23 = fArr[1];
        float f24 = fArr[4];
        float f25 = fArr[7];
        float f26 = (f25 * f18) + (f24 * f16) + (f23 * f14);
        float f27 = fArr[2];
        float f28 = fArr[5];
        float f29 = fArr[8];
        float f33 = (f18 * f29) + (f16 * f28) + (f14 * f27);
        float f34 = fArr2[3];
        float f35 = fArr2[4];
        float f36 = fArr2[5];
        float f37 = (f17 * f36) + (f15 * f35) + (f13 * f34);
        float f38 = (f25 * f36) + (f24 * f35) + (f23 * f34);
        float f39 = (f36 * f29) + (f35 * f28) + (f34 * f27);
        float f41 = fArr2[6];
        float f43 = fArr2[7];
        float f44 = (f15 * f43) + (f13 * f41);
        float f45 = fArr2[8];
        return new float[]{f19, f26, f33, f37, f38, f39, (f17 * f45) + f44, (f25 * f45) + (f24 * f43) + (f23 * f41), (f29 * f45) + (f28 * f43) + (f27 * f41)};
    }

    public static p1 b() {
        return new p1(null);
    }

    public static final float[] b0(float[] fArr, float[] fArr2) {
        float f13 = fArr[0];
        float f14 = fArr2[0] * f13;
        float f15 = fArr[1];
        float f16 = fArr2[1] * f15;
        float f17 = fArr[2];
        return new float[]{f14, f16, fArr2[2] * f17, fArr2[3] * f13, fArr2[4] * f15, fArr2[5] * f17, f13 * fArr2[6], f15 * fArr2[7], f17 * fArr2[8]};
    }

    public static final z3.q c(s3.k0 k0Var, boolean z13) {
        u2.p pVar = k0Var.f110837y.f110808e;
        s3.m mVar = null;
        if ((pVar.f120045d & 8) != 0) {
            loop0: while (true) {
                if (pVar == null) {
                    break;
                }
                if ((pVar.f120044c & 8) != 0) {
                    u2.p pVar2 = pVar;
                    k2.e eVar = null;
                    while (pVar2 != null) {
                        if (pVar2 instanceof s3.g2) {
                            mVar = pVar2;
                            break loop0;
                        }
                        if ((pVar2.f120044c & 8) != 0 && (pVar2 instanceof s3.n)) {
                            int i13 = 0;
                            for (u2.p pVar3 = ((s3.n) pVar2).f110843o; pVar3 != null; pVar3 = pVar3.f120047f) {
                                if ((pVar3.f120044c & 8) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        pVar2 = pVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new k2.e(new u2.p[16]);
                                        }
                                        if (pVar2 != null) {
                                            eVar.b(pVar2);
                                            pVar2 = null;
                                        }
                                        eVar.b(pVar3);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        pVar2 = com.bumptech.glide.c.g(eVar);
                    }
                }
                if ((pVar.f120045d & 8) == 0) {
                    break;
                }
                pVar = pVar.f120047f;
            }
        }
        Intrinsics.f(mVar);
        u2.p pVar4 = ((u2.p) ((s3.g2) mVar)).f120042a;
        z3.j p13 = k0Var.p();
        Intrinsics.f(p13);
        return new z3.q(pVar4, z13, k0Var, p13);
    }

    public static final void c0(float[] fArr, float[] fArr2) {
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float f15 = fArr2[2];
        fArr2[0] = (fArr[6] * f15) + (fArr[3] * f14) + (fArr[0] * f13);
        fArr2[1] = (fArr[7] * f15) + (fArr[4] * f14) + (fArr[1] * f13);
        fArr2[2] = (fArr[8] * f15) + (fArr[5] * f14) + (fArr[2] * f13);
    }

    public static final boolean d(z3.q qVar) {
        z3.j j13 = qVar.j();
        return !j13.f140700a.containsKey(z3.t.f140741j);
    }

    public static TypedArray d0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final boolean e(z3.q qVar) {
        return qVar.f140713c.f110831s == n4.k.Rtl;
    }

    public static final String e0(tc.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar.V1(kotlin.collections.e0.b("__typename")) != 0) {
            throw new IllegalStateException("__typename not found".toString());
        }
        String Y0 = fVar.Y0();
        if (Y0 != null) {
            return Y0;
        }
        throw new IllegalStateException("__typename is null".toString());
    }

    public static c3.d f(c3.d dVar) {
        c3.u uVar = c3.l.f25522b;
        c3.a aVar = c3.b.f25481b;
        if (!c3.c.a(dVar.f25489b, c3.c.f25483a)) {
            return dVar;
        }
        c3.s sVar = (c3.s) dVar;
        c3.u uVar2 = sVar.f25539d;
        if (o(uVar2, uVar)) {
            return dVar;
        }
        float[] a13 = uVar.a();
        return new c3.s(sVar.f25488a, sVar.f25543h, uVar, a0(n(aVar.f25482a, uVar2.a(), a13), sVar.f25544i), sVar.f25546k, sVar.f25549n, sVar.f25540e, sVar.f25541f, sVar.f25542g, -1);
    }

    public static final Object f0(androidx.lifecycle.z zVar, androidx.lifecycle.r rVar, Function2 function2, bl2.c cVar) {
        Object O;
        androidx.lifecycle.s lifecycle = zVar.getLifecycle();
        if (rVar == androidx.lifecycle.r.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (((androidx.lifecycle.b0) lifecycle).f18588d == androidx.lifecycle.r.DESTROYED) {
            O = Unit.f80348a;
        } else {
            O = dl2.b.O(new androidx.lifecycle.x0(lifecycle, rVar, function2, null), cVar);
            if (O != cl2.a.COROUTINE_SUSPENDED) {
                O = Unit.f80348a;
            }
        }
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    public static final Object g(pq2.i iVar, bl2.c frame) {
        o oVar = new o(1, cl2.h.b(frame));
        oVar.v();
        oVar.e(new e82.l(iVar, 29));
        iVar.x1(new pq2.y(oVar));
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    public static final am2.g g0(am2.d0 d0Var, ym2.c fqName, hm2.e lookupLocation) {
        am2.j jVar;
        in2.n I;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        ym2.c e13 = fqName.e();
        Intrinsics.checkNotNullExpressionValue(e13, "parent(...)");
        in2.j jVar2 = ((dm2.c0) d0Var.H(e13)).f55405g;
        ym2.g f13 = fqName.f();
        Intrinsics.checkNotNullExpressionValue(f13, "shortName(...)");
        am2.j e14 = jVar2.e(f13, lookupLocation);
        am2.g gVar = e14 instanceof am2.g ? (am2.g) e14 : null;
        if (gVar != null) {
            return gVar;
        }
        ym2.c e15 = fqName.e();
        Intrinsics.checkNotNullExpressionValue(e15, "parent(...)");
        am2.g g03 = g0(d0Var, e15, lookupLocation);
        if (g03 == null || (I = g03.I()) == null) {
            jVar = null;
        } else {
            ym2.g f14 = fqName.f();
            Intrinsics.checkNotNullExpressionValue(f14, "shortName(...)");
            jVar = I.e(f14, lookupLocation);
        }
        if (jVar instanceof am2.g) {
            return (am2.g) jVar;
        }
        return null;
    }

    public static final wo2.x h(wo2.c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return new wo2.x(c0Var);
    }

    public static final Object h0(Set set, Enum r23, Enum r33, Object obj, boolean z13) {
        Set J0;
        if (!z13) {
            if (obj != null && (J0 = CollectionsKt.J0(kotlin.collections.i1.j(set, obj))) != null) {
                set = J0;
            }
            return CollectionsKt.t0(set);
        }
        Enum r13 = set.contains(r23) ? r23 : set.contains(r33) ? r33 : null;
        if (Intrinsics.d(r13, r23) && Intrinsics.d(obj, r33)) {
            return null;
        }
        return obj == null ? r13 : obj;
    }

    public static final wo2.y i(wo2.e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        return new wo2.y(e0Var);
    }

    public static final wo2.c i0(OutputStream outputStream) {
        Logger logger = wo2.u.f130736a;
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new wo2.c(outputStream, new wo2.i0());
    }

    public static g7.i j(q7.m mVar, String str, q7.j jVar, int i13) {
        g7.h hVar = new g7.h();
        hVar.f63776a = b7.c.O(str, jVar.f102651c);
        hVar.f63781f = jVar.f102649a;
        hVar.f63782g = jVar.f102650b;
        String k13 = mVar.k();
        if (k13 == null) {
            k13 = jVar.b(((q7.b) mVar.f102658b.get(0)).f102600a).toString();
        }
        hVar.d(k13);
        hVar.b(i13);
        hVar.c();
        return hVar.a();
    }

    public static final wo2.c j0(Socket socket) {
        Logger logger = wo2.u.f130736a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        wo2.d0 d0Var = new wo2.d0(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        wo2.c sink = new wo2.c(outputStream, d0Var);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new wo2.c(d0Var, sink);
    }

    public static final Object k(o1 o1Var, bl2.c cVar) {
        o1Var.cancel((CancellationException) null);
        Object join = o1Var.join(cVar);
        return join == cl2.a.COROUTINE_SUSPENDED ? join : Unit.f80348a;
    }

    public static wo2.c k0(File file) {
        Logger logger = wo2.u.f130736a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return i0(new FileOutputStream(file, false));
    }

    public static void l(CoroutineContext coroutineContext) {
        Sequence children;
        o1 o1Var = (o1) coroutineContext.get(g0.f20154b);
        if (o1Var == null || (children = o1Var.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).cancel((CancellationException) null);
        }
    }

    public static final wo2.d l0(InputStream inputStream) {
        Logger logger = wo2.u.f130736a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new wo2.d(inputStream, new wo2.i0());
    }

    public static final void m(int i13) {
        if (i13 < 1) {
            throw new IllegalArgumentException(a.a.d("Expected positive parallelism level, but got ", i13).toString());
        }
    }

    public static final wo2.d m0(Socket socket) {
        Logger logger = wo2.u.f130736a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        wo2.d0 d0Var = new wo2.d0(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        wo2.d source = new wo2.d(inputStream, d0Var);
        Intrinsics.checkNotNullParameter(source, "source");
        return new wo2.d(d0Var, source);
    }

    public static final float[] n(float[] fArr, float[] fArr2, float[] fArr3) {
        c0(fArr, fArr2);
        c0(fArr, fArr3);
        return a0(P(fArr), b0(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final cl2.a n0(java.lang.Throwable r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof pq2.b0
            if (r0 == 0) goto L13
            r0 = r6
            pq2.b0 r0 = (pq2.b0) r0
            int r1 = r0.f100994s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100994s = r1
            goto L18
        L13:
            pq2.b0 r0 = new pq2.b0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f100993r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f100994s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            ue.c.H(r6)
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L34:
            ue.c.H(r6)
            r0.getClass()
            r0.f100994s = r3
            ko2.f r6 = ao2.v0.f20219a
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            oi.o6 r3 = new oi.o6
            r4 = 25
            r3.<init>(r0, r5, r4)
            r6.g(r2, r3)
            java.lang.String r5 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ao2.m0.n0(java.lang.Throwable, bl2.c):cl2.a");
    }

    public static final boolean o(c3.u uVar, c3.u uVar2) {
        if (uVar == uVar2) {
            return true;
        }
        return Math.abs(uVar.f25560a - uVar2.f25560a) < 0.001f && Math.abs(uVar.f25561b - uVar2.f25561b) < 0.001f;
    }

    public static final void o0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final u2.q p(u2.q qVar, Function1 function1, kl2.l lVar) {
        return qVar.j(new u2.l(function1, lVar));
    }

    public static final void p0(String str) {
        throw new IllegalStateException(str);
    }

    public static final c3.i q(c3.d dVar, c3.d dVar2, int i13) {
        if (dVar == dVar2) {
            return new c3.g(dVar, dVar, 1);
        }
        long j13 = c3.c.f25483a;
        return (c3.c.a(dVar.f25489b, j13) && c3.c.a(dVar2.f25489b, j13)) ? new c3.h((c3.s) dVar, (c3.s) dVar2, i13) : new c3.i(dVar, dVar2, i13);
    }

    public static final String q0(bl2.c cVar) {
        Object m13;
        if (cVar instanceof ho2.e) {
            return ((ho2.e) cVar).toString();
        }
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = cVar + '@' + y(cVar);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (xk2.s.a(m13) != null) {
            m13 = cVar.getClass().getName() + '@' + y(cVar);
        }
        return (String) m13;
    }

    public static byte[] r(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static final am2.q r0(am2.u1 u1Var) {
        Intrinsics.checkNotNullParameter(u1Var, "<this>");
        if (u1Var == null) {
            im2.u.a(4);
            throw null;
        }
        am2.q qVar = (am2.q) im2.u.f72783d.get(u1Var);
        if (qVar == null) {
            qVar = am2.s.g(u1Var);
        }
        Intrinsics.checkNotNullExpressionValue(qVar, "toDescriptorVisibility(...)");
        return qVar;
    }

    public static String s(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final void t(CoroutineContext coroutineContext) {
        o1 o1Var = (o1) coroutineContext.get(g0.f20154b);
        if (o1Var != null && !o1Var.isActive()) {
            throw o1Var.getCancellationException();
        }
    }

    public static final s3.k0 u(s3.k0 k0Var, t3.w wVar) {
        for (s3.k0 v13 = k0Var.v(); v13 != null; v13 = v13.v()) {
            if (((Boolean) wVar.invoke(v13)).booleanValue()) {
                return v13;
            }
        }
        return null;
    }

    public static final s3.k0 v(s3.k0 k0Var, Function1 function1) {
        for (s3.k0 v13 = k0Var.v(); v13 != null; v13 = v13.v()) {
            if (((Boolean) function1.invoke(v13)).booleanValue()) {
                return v13;
            }
        }
        return null;
    }

    public static final Object w(zm2.q qVar, zm2.s extension) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (qVar.k(extension)) {
            return qVar.j(extension);
        }
        return null;
    }

    public static final Object x(zm2.q qVar, zm2.s extension, int i13) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        qVar.o(extension);
        zm2.m mVar = qVar.f142245a;
        mVar.getClass();
        zm2.r rVar = extension.f142254d;
        if (!rVar.f142249d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        zm2.e0 e0Var = mVar.f142238a;
        Object obj = e0Var.get(rVar);
        if (i13 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        qVar.o(extension);
        if (!rVar.f142249d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = e0Var.get(rVar);
        if (obj2 != null) {
            return extension.a(((List) obj2).get(i13));
        }
        throw new IndexOutOfBoundsException();
    }

    public static final String y(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final o1 z(CoroutineContext coroutineContext) {
        o1 o1Var = (o1) coroutineContext.get(g0.f20154b);
        if (o1Var != null) {
            return o1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }
}
