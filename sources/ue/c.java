package ue;

import a.cb;
import am2.c1;
import am2.i1;
import am2.w0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.work.WorkerParameters;
import ao2.m2;
import dm2.j0;
import im2.d0;
import ip2.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kb.z0;
import kh2.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.quikkly.android.utils.BitmapUtils;
import nn2.u;
import pk.a0;
import pk.b3;
import pk.o1;
import pn2.b0;
import pn2.b1;
import pn2.g1;
import pn2.h0;
import pn2.u0;
import pn2.w1;
import qn2.p;
import rm2.n0;
import rm2.o0;
import rm2.t;
import rm2.w;
import rm2.x;
import rm2.y;
import rm2.z;
import so.oa;
import xk2.r;
import xl2.o;
import xl2.s;

/* loaded from: classes.dex */
public abstract class c {
    public static q A(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                q g13 = q.g(fileInputStream);
                fileInputStream.close();
                return g13;
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            dp2.e.g("HttpFlagsLoader", "HTTP flags file `%s` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.", file.getPath());
            return null;
        } catch (IOException e13) {
            throw new RuntimeException("Unable to read HTTP flags file", e13);
        }
    }

    public static final Object B(b0 inlineClassType, o0 mode, kl2.l writeGenericType) {
        w d2;
        o0 o0Var;
        Object B;
        int i13;
        ym2.b bVar;
        x xVar;
        boolean z13;
        t typeFactory = t.f108789c;
        t typeMappingConfiguration = t.f108792f;
        Intrinsics.checkNotNullParameter(inlineClassType, "kotlinType");
        Intrinsics.checkNotNullParameter(typeFactory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        Intrinsics.checkNotNullParameter(inlineClassType, "kotlinType");
        if (kotlin.jvm.internal.j.x(inlineClassType)) {
            j0 j0Var = s.f135338a;
            Intrinsics.checkNotNullParameter(inlineClassType, "suspendFunType");
            kotlin.jvm.internal.j.x(inlineClassType);
            xl2.l m13 = kotlin.jvm.internal.j.m(inlineClassType);
            bm2.i annotations = inlineClassType.getAnnotations();
            b0 p13 = kotlin.jvm.internal.j.p(inlineClassType);
            List n13 = kotlin.jvm.internal.j.n(inlineClassType);
            List r13 = kotlin.jvm.internal.j.r(inlineClassType);
            ArrayList arrayList = new ArrayList(g0.q(r13, 10));
            Iterator it = r13.iterator();
            while (it.hasNext()) {
                arrayList.add(((g1) it.next()).getType());
            }
            u0.f100848b.getClass();
            u0 u0Var = u0.f100849c;
            b1 e13 = s.f135338a.e();
            Intrinsics.checkNotNullExpressionValue(e13, "getTypeConstructor(...)");
            Intrinsics.checkNotNullParameter(inlineClassType, "<this>");
            kotlin.jvm.internal.j.v(inlineClassType);
            b0 type = ((g1) CollectionsKt.b0(inlineClassType.u0())).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            ArrayList m03 = CollectionsKt.m0(pn2.g.q(u0Var, e13, e0.b(kotlin.jvm.internal.j.c(type)), false), arrayList);
            h0 p14 = kotlin.jvm.internal.j.m(inlineClassType).p();
            Intrinsics.checkNotNullExpressionValue(p14, "getNullableAnyType(...)");
            return B(kotlin.jvm.internal.j.h(m13, annotations, p13, n13, m03, p14, false).A0(inlineClassType.x0()), mode, writeGenericType);
        }
        p pVar = p.f104516a;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(inlineClassType, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        b1 W = pVar.W(inlineClassType);
        Object obj = null;
        if (a0.u0(W)) {
            o primitiveType = a0.b0(W);
            if (primitiveType != null) {
                Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
                switch (z.f108807a[primitiveType.ordinal()]) {
                    case 1:
                        xVar = y.f108799a;
                        break;
                    case 2:
                        xVar = y.f108800b;
                        break;
                    case 3:
                        xVar = y.f108801c;
                        break;
                    case 4:
                        xVar = y.f108802d;
                        break;
                    case 5:
                        xVar = y.f108803e;
                        break;
                    case 6:
                        xVar = y.f108804f;
                        break;
                    case 7:
                        xVar = y.f108805g;
                        break;
                    case 8:
                        xVar = y.f108806h;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (!a0.F0(inlineClassType)) {
                    Intrinsics.checkNotNullParameter(pVar, "<this>");
                    Intrinsics.checkNotNullParameter(inlineClassType, "type");
                    ym2.c ENHANCED_NULLABILITY_ANNOTATION = d0.f72716p;
                    Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (!a0.m0(inlineClassType, ENHANCED_NULLABILITY_ANNOTATION)) {
                        z13 = false;
                        obj = kotlin.jvm.internal.j.e(xVar, z13);
                    }
                }
                z13 = true;
                obj = kotlin.jvm.internal.j.e(xVar, z13);
            } else {
                o a03 = a0.a0(W);
                if (a03 != null) {
                    obj = t.c("[" + gn2.c.get(a03).getDesc());
                } else if (a0.N0(W)) {
                    ym2.e V = a0.V(W);
                    if (V != null) {
                        String str = zl2.d.f142106a;
                        bVar = zl2.d.g(V);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        if (!mode.f108775g) {
                            List list = zl2.d.f142119n;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.d(((zl2.c) it2.next()).f142103a, bVar)) {
                                        break;
                                    }
                                }
                            }
                        }
                        String f13 = gn2.b.b(bVar).f();
                        Intrinsics.checkNotNullExpressionValue(f13, "getInternalName(...)");
                        obj = t.d(f13);
                    }
                }
            }
        }
        if (obj != null) {
            Object e14 = kotlin.jvm.internal.j.e(obj, mode.f108769a);
            writeGenericType.invoke(inlineClassType, e14, mode);
            return e14;
        }
        b1 w03 = inlineClassType.w0();
        if (w03 instanceof pn2.a0) {
            pn2.a0 a0Var = (pn2.a0) w03;
            b0 b0Var = a0Var.f100760a;
            if (b0Var != null) {
                return B(kotlin.jvm.internal.j.F(b0Var), mode, writeGenericType);
            }
            LinkedHashSet types = a0Var.f100761b;
            Intrinsics.checkNotNullParameter(types, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.Z(types, null, null, null, 0, null, null, 63));
        }
        am2.j b13 = w03.b();
        if (b13 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + inlineClassType);
        }
        if (rn2.m.g(b13)) {
            w d13 = t.d("error/NonExistentClass");
            am2.g descriptor = (am2.g) b13;
            Intrinsics.checkNotNullParameter(inlineClassType, "kotlinType");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return d13;
        }
        boolean z14 = b13 instanceof am2.g;
        boolean z15 = mode.f108771c;
        if (z14 && xl2.l.z(inlineClassType)) {
            if (inlineClassType.u0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            g1 g1Var = (g1) inlineClassType.u0().get(0);
            b0 type2 = g1Var.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            if (g1Var.c() == w1.IN_VARIANCE) {
                B = t.d("java/lang/Object");
            } else {
                w1 effectiveVariance = g1Var.c();
                Intrinsics.checkNotNullExpressionValue(effectiveVariance, "getProjectionKind(...)");
                Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
                if (z15 || ((i13 = n0.f108763a[effectiveVariance.ordinal()]) == 1 ? (o0Var = mode.f108776h) == null : !(i13 == 2 ? (o0Var = mode.f108777i) != null : (o0Var = mode.f108774f) != null))) {
                    o0Var = mode;
                }
                B = B(type2, o0Var, writeGenericType);
            }
            return t.c("[" + t.k((y) B));
        }
        if (!z14) {
            if (b13 instanceof c1) {
                b0 q13 = kotlin.jvm.internal.j.q((c1) b13);
                if (inlineClassType.x0()) {
                    q13 = kotlin.jvm.internal.j.A(q13);
                }
                return B(q13, mode, wn2.c.f130595i);
            }
            if ((b13 instanceof am2.b1) && mode.f108778j) {
                return B(((u) ((am2.b1) b13)).u0(), mode, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + inlineClassType);
        }
        if (bn2.i.b(b13) && !mode.f108770b) {
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            Intrinsics.checkNotNullParameter(inlineClassType, "inlineClassType");
            b0 b0Var2 = (b0) j1.U(inlineClassType, new HashSet());
            if (b0Var2 != null) {
                return B(b0Var2, new o0(mode.f108769a, true, mode.f108771c, mode.f108772d, mode.f108773e, mode.f108774f, mode.f108775g, mode.f108776h, mode.f108777i, false, BitmapUtils.BITMAP_TO_JPEG_SIZE), writeGenericType);
            }
        }
        if (z15) {
            ym2.g gVar = xl2.l.f135279e;
            if (xl2.l.b((am2.g) b13, xl2.q.P)) {
                d2 = t.d("java/lang/Class");
                writeGenericType.invoke(inlineClassType, d2, mode);
                return d2;
            }
        }
        am2.g gVar2 = (am2.g) b13;
        am2.g classDescriptor = gVar2.o0();
        Intrinsics.checkNotNullExpressionValue(classDescriptor, "getOriginal(...)");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (gVar2.c() == am2.h.ENUM_ENTRY) {
            am2.m g13 = gVar2.g();
            Intrinsics.g(g13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            gVar2 = (am2.g) g13;
        }
        am2.g o03 = gVar2.o0();
        Intrinsics.checkNotNullExpressionValue(o03, "getOriginal(...)");
        d2 = t.d(j(o03, typeMappingConfiguration));
        writeGenericType.invoke(inlineClassType, d2, mode);
        return d2;
    }

    public static long E(long j13, long j14) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j14) + Long.numberOfLeadingZeros(j14) + Long.numberOfLeadingZeros(~j13) + Long.numberOfLeadingZeros(j13);
        if (numberOfLeadingZeros > 65) {
            return j13 * j14;
        }
        long j15 = ((j13 ^ j14) >>> 63) + Long.MAX_VALUE;
        if ((numberOfLeadingZeros < 64) || ((j14 == Long.MIN_VALUE) & (j13 < 0))) {
            return j15;
        }
        long j16 = j13 * j14;
        return (j13 == 0 || j16 / j13 == j14) ? j16 : j15;
    }

    public static final long F(String str, long j13, long j14, long j15) {
        String str2;
        int i13 = ho2.x.f69791a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j13;
        }
        Long h03 = StringsKt.h0(str2);
        if (h03 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = h03.longValue();
        if (j14 <= longValue && longValue <= j15) {
            return longValue;
        }
        StringBuilder sb3 = new StringBuilder("System property '");
        sb3.append(str);
        sb3.append("' should be in range ");
        sb3.append(j14);
        cb.v(sb3, "..", j15, ", but is '");
        sb3.append(longValue);
        sb3.append('\'');
        throw new IllegalStateException(sb3.toString().toString());
    }

    public static int G(String str, int i13, int i14, int i15, int i16) {
        if ((i16 & 4) != 0) {
            i14 = 1;
        }
        if ((i16 & 8) != 0) {
            i15 = Integer.MAX_VALUE;
        }
        return (int) F(str, i13, i14, i15);
    }

    public static final void H(Object obj) {
        if (obj instanceof r) {
            throw ((r) obj).f135224a;
        }
    }

    public static ao2.w a() {
        return new ao2.w(null);
    }

    public static m2 b() {
        return new m2(null);
    }

    public static final String c(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bytes.length;
        int i13 = 0;
        while (i13 < length) {
            byte b13 = bytes[i13];
            i13++;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b13)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final void f(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(a.a.f("index: ", i13, ", size: ", i14));
        }
    }

    public static final void g(int i13, int i14) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(a.a.f("index: ", i13, ", size: ", i14));
        }
    }

    public static final void h(int i13, int i14, int i15) {
        if (i13 < 0 || i14 > i15) {
            StringBuilder t13 = a.a.t("fromIndex: ", i13, ", toIndex: ", i14, ", size: ");
            t13.append(i15);
            throw new IndexOutOfBoundsException(t13.toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(a.a.f("fromIndex: ", i13, " > toIndex: ", i14));
        }
    }

    public static long i(long j13, long j14) {
        long j15 = j13 + j14;
        kotlin.jvm.internal.r.l(((j13 ^ j14) < 0) | ((j13 ^ j15) >= 0), j13, j14);
        return j15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r2.f139479b == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String j(am2.g r4, rm2.m0 r5) {
        /*
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r5
            rm2.t r0 = (rm2.t) r0
            r0.getClass()
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            am2.m r1 = r4.g()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ym2.g r2 = r4.getName()
            if (r2 == 0) goto L2b
            ym2.g r3 = ym2.i.f139482a
            boolean r3 = r2.f139479b
            if (r3 != 0) goto L2b
            goto L2d
        L2b:
            ym2.g r2 = ym2.i.f139484c
        L2d:
            java.lang.String r2 = r2.c()
            java.lang.String r3 = "getIdentifier(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r3 = r1 instanceof am2.i0
            if (r3 == 0) goto L6b
            am2.i0 r1 = (am2.i0) r1
            dm2.k0 r1 = (dm2.k0) r1
            ym2.c r4 = r1.f55454e
            boolean r5 = r4.d()
            if (r5 == 0) goto L47
            goto L6a
        L47:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = r4.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r0 = 46
            r1 = 47
            java.lang.String r4 = kotlin.text.z.m(r4, r0, r1)
            r5.append(r4)
            r5.append(r1)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L6a:
            return r2
        L6b:
            boolean r3 = r1 instanceof am2.g
            if (r3 == 0) goto L73
            r3 = r1
            am2.g r3 = (am2.g) r3
            goto L74
        L73:
            r3 = 0
        L74:
            if (r3 == 0) goto L92
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r4 = j(r3, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r4 = 36
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = r5.toString()
            return r4
        L92:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = " for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.c.j(am2.g, rm2.m0):java.lang.String");
    }

    public static final Collection k(Collection collection, Collection collection2) {
        Intrinsics.checkNotNullParameter(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final ArrayList l(ArrayList newValueParameterTypes, Collection oldValueParameters, am2.b newOwner) {
        Intrinsics.checkNotNullParameter(newValueParameterTypes, "newValueParameterTypes");
        Intrinsics.checkNotNullParameter(oldValueParameters, "oldValueParameters");
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        ArrayList N0 = CollectionsKt.N0(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(g0.q(N0, 10));
        for (Iterator it = N0.iterator(); it.hasNext(); it = it) {
            Pair pair = (Pair) it.next();
            b0 b0Var = (b0) pair.f80346a;
            Object obj = (i1) pair.f80347b;
            dm2.b1 b1Var = (dm2.b1) obj;
            int i13 = b1Var.f55394f;
            bm2.i annotations = ((bm2.b) obj).getAnnotations();
            ym2.g name = ((dm2.o) obj).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            boolean r03 = b1Var.r0();
            b0 f13 = b1Var.f55398j != null ? fn2.d.j(newOwner).f().f(b0Var) : null;
            w0 b13 = ((dm2.p) obj).b();
            Intrinsics.checkNotNullExpressionValue(b13, "getSource(...)");
            arrayList.add(new dm2.b1(newOwner, null, i13, annotations, name, b0Var, r03, b1Var.f55396h, b1Var.f55397i, f13, b13));
        }
        return arrayList;
    }

    public static final r m(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new r(exception);
    }

    public static final kb.a0 p(Context context, String str, WorkerParameters workerParameters) {
        String str2;
        String str3;
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(kb.a0.class);
            Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                val co…Parameters)\n            }");
                return (kb.a0) newInstance;
            } catch (Throwable th3) {
                kb.b0 e13 = kb.b0.e();
                str3 = z0.f79057a;
                e13.d(str3, "Could not instantiate " + str, th3);
                throw th3;
            }
        } catch (Throwable th4) {
            kb.b0 e14 = kb.b0.e();
            str2 = z0.f79057a;
            e14.d(str2, "Invalid class: " + str, th4);
            throw th4;
        }
    }

    public static long q(long j13, long j14, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j15 = j13 / j14;
        long j16 = j13 - (j14 * j15);
        if (j16 == 0) {
            return j15;
        }
        int i13 = ((int) ((j13 ^ j14) >> 63)) | 1;
        switch (rk.e.f108437a[roundingMode.ordinal()]) {
            case 1:
                kotlin.jvm.internal.r.n(j16 == 0);
                return j15;
            case 2:
                return j15;
            case 3:
                if (i13 >= 0) {
                    return j15;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return j15;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j16);
                long abs2 = abs - (Math.abs(j14) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j15) == 0)) {
                        return j15;
                    }
                } else if (abs2 <= 0) {
                    return j15;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j15 + i13;
    }

    public static long r(long j13, long j14) {
        kotlin.jvm.internal.r.m(j13, "a");
        kotlin.jvm.internal.r.m(j14, "b");
        if (j13 == 0) {
            return j14;
        }
        if (j14 == 0) {
            return j13;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
        long j15 = j13 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j14);
        long j16 = j14 >> numberOfTrailingZeros2;
        while (j15 != j16) {
            long j17 = j15 - j16;
            long j18 = (j17 >> 63) & j17;
            long j19 = (j17 - j18) - j18;
            j16 += j18;
            j15 = j19 >> Long.numberOfTrailingZeros(j19);
        }
        return j15 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static /* synthetic */ Collection s(in2.p pVar, in2.g gVar, int i13) {
        if ((i13 & 1) != 0) {
            gVar = in2.g.f72858l;
        }
        in2.n.f72875a.getClass();
        return pVar.g(gVar, in2.k.f72872i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        kotlin.jvm.internal.Intrinsics.g(r0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        r0 = (am2.g) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final mm2.i0 t(am2.g r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r1 = fn2.d.f62727a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            pn2.h0 r3 = r3.j()
            pn2.b1 r3 = r3.w0()
            java.util.Collection r3 = r3.c()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r3.next()
            pn2.b0 r0 = (pn2.b0) r0
            boolean r2 = xl2.l.y(r0)
            if (r2 != 0) goto L1a
            pn2.b1 r0 = r0.w0()
            am2.j r0 = r0.b()
            int r2 = bn2.e.f23579a
            am2.h r2 = am2.h.CLASS
            boolean r2 = bn2.e.p(r0, r2)
            if (r2 != 0) goto L47
            am2.h r2 = am2.h.ENUM_CLASS
            boolean r2 = bn2.e.p(r0, r2)
            if (r2 == 0) goto L1a
        L47:
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.Intrinsics.g(r0, r3)
            am2.g r0 = (am2.g) r0
            goto L50
        L4f:
            r0 = r1
        L50:
            if (r0 != 0) goto L53
            return r1
        L53:
            in2.n r3 = r0.b0()
            boolean r2 = r3 instanceof mm2.i0
            if (r2 == 0) goto L5e
            r1 = r3
            mm2.i0 r1 = (mm2.i0) r1
        L5e:
            if (r1 != 0) goto L64
            mm2.i0 r1 = t(r0)
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.c.t(am2.g):mm2.i0");
    }

    public static final int u(int i13, int i14, int i15) {
        if (i15 > 0) {
            if (i13 >= i14) {
                return i14;
            }
            int i16 = i14 % i15;
            if (i16 < 0) {
                i16 += i15;
            }
            int i17 = i13 % i15;
            if (i17 < 0) {
                i17 += i15;
            }
            int i18 = (i16 - i17) % i15;
            if (i18 < 0) {
                i18 += i15;
            }
            return i14 - i18;
        }
        if (i15 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i13 <= i14) {
            return i14;
        }
        int i19 = -i15;
        int i23 = i13 % i19;
        if (i23 < 0) {
            i23 += i19;
        }
        int i24 = i14 % i19;
        if (i24 < 0) {
            i24 += i19;
        }
        int i25 = (i23 - i24) % i19;
        if (i25 < 0) {
            i25 += i19;
        }
        return i14 + i25;
    }

    public static final View v(Activity activity) {
        if (p001if.a.b(c.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th3) {
            p001if.a.a(c.class, th3);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (kotlin.text.z.p(r0, "generic", false) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean w() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            boolean r4 = kotlin.text.z.p(r0, r2, r3)
            if (r4 != 0) goto L71
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = kotlin.text.z.p(r0, r1, r3)
            if (r0 != 0) goto L71
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "google_sdk"
            boolean r5 = kotlin.text.StringsKt.E(r0, r4, r3)
            if (r5 != 0) goto L71
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r5 = "Emulator"
            boolean r5 = kotlin.text.StringsKt.E(r0, r5, r3)
            if (r5 != 0) goto L71
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = kotlin.text.StringsKt.E(r0, r1, r3)
            if (r0 != 0) goto L71
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = kotlin.text.StringsKt.E(r0, r1, r3)
            if (r0 != 0) goto L71
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = kotlin.text.z.p(r0, r2, r3)
            if (r0 == 0) goto L69
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = kotlin.text.z.p(r0, r2, r3)
            if (r0 != 0) goto L71
        L69:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r4, r0)
            if (r0 == 0) goto L72
        L71:
            r3 = 1
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.c.w():boolean");
    }

    public static boolean x(Context context) {
        ((oa) ((ve2.a) me.o.b(context, ve2.a.class))).getClass();
        int i13 = o1.f100461c;
        b3 b3Var = b3.f100362j;
        d7.b.q(b3Var.f100367h <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (b3Var.isEmpty()) {
            return true;
        }
        return ((Boolean) b3Var.iterator().next()).booleanValue();
    }

    public static ul2.w1 y(Function0 function0) {
        if (function0 != null) {
            return new ul2.w1(null, function0);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static final wn2.f z(ArrayList scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        wn2.f fVar = new wn2.f();
        Iterator it = scopes.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            in2.n nVar = (in2.n) next;
            if (nVar != null && nVar != in2.m.f72874b) {
                fVar.add(next);
            }
        }
        return fVar;
    }

    public abstract void C(int i13);

    public abstract void D(Typeface typeface);

    public void d(final int i13) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e5.l
            @Override // java.lang.Runnable
            public final void run() {
                ue.c.this.C(i13);
            }
        });
    }

    public void e(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new e5.k(0, this, typeface));
    }

    public abstract kb.a0 n(Context context, String str, WorkerParameters workerParameters);

    public kb.a0 o(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        kb.a0 n13 = n(appContext, workerClassName, workerParameters);
        if (n13 == null) {
            n13 = p(appContext, workerClassName, workerParameters);
        }
        if (!n13.f78965d) {
            return n13;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
