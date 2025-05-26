package b7;

import a.cb;
import android.R;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Color;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.lifecycle.v1;
import androidx.lifecycle.z;
import b4.p0;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.n0;
import e5.k;
import i1.j0;
import i1.k0;
import i1.n1;
import i1.o1;
import i1.w0;
import i2.f2;
import i2.n;
import i2.o;
import i2.q1;
import i2.s;
import i2.y3;
import j1.g2;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Objects;
import kl2.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import rm2.c0;
import rm2.d0;
import rm2.e0;
import t3.s1;
import u2.q;
import yn2.x;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public static AudioManager f22027a;

    /* renamed from: b */
    public static Boolean f22028b;

    /* renamed from: c */
    public static Boolean f22029c;

    /* renamed from: d */
    public static Boolean f22030d;

    /* renamed from: e */
    public static Boolean f22031e;

    /* renamed from: f */
    public static UiModeManager f22032f;

    public static boolean A(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 != null) {
            return t33.k0().intValue() == gb0.f.AMAZON_HANDSHAKE.getValue();
        }
        return false;
    }

    public static boolean B(int i13) {
        return i13 != 0 && f5.c.e(i13) > 0.5d;
    }

    public static boolean C(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static boolean D(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f22028b == null) {
            f22028b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f22028b.booleanValue();
    }

    public static boolean E(Context context) {
        D(context);
        if (f22029c == null) {
            f22029c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f22029c.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static int F(int i13, float f13, int i14) {
        return f5.c.g(f5.c.j(i14, Math.round(Color.alpha(i14) * f13)), i13);
    }

    public static void H(Class klass, e0 visitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.f(annotation);
            Class t03 = l0.t0(l0.m0(annotation));
            c0 b13 = visitor.b(gm2.d.a(t03), new fm2.a(annotation));
            if (b13 != null) {
                K(b13, annotation, t03);
            }
        }
        visitor.a();
    }

    public static MappedByteBuffer I(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final ParcelableSnapshotMutableFloatState J(float f13) {
        int i13 = i2.c.f71081b;
        return new ParcelableSnapshotMutableFloatState(f13);
    }

    public static void K(c0 c0Var, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                Intrinsics.f(invoke);
                ym2.g e13 = ym2.g.e(method.getName());
                Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
                Class<?> cls2 = invoke.getClass();
                if (Intrinsics.d(cls2, Class.class)) {
                    c0Var.d(e13, j((Class) invoke));
                } else if (fm2.e.f62580a.contains(cls2)) {
                    c0Var.c(invoke, e13);
                } else {
                    List list = gm2.d.f65761a;
                    Intrinsics.checkNotNullParameter(cls2, "<this>");
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        Intrinsics.f(cls2);
                        ym2.b a13 = gm2.d.a(cls2);
                        ym2.g e14 = ym2.g.e(((Enum) invoke).name());
                        Intrinsics.checkNotNullExpressionValue(e14, "identifier(...)");
                        c0Var.b(e13, a13, e14);
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                        Class cls3 = (Class) kotlin.collections.c0.R(interfaces);
                        Intrinsics.f(cls3);
                        c0 f13 = c0Var.f(gm2.d.a(cls3), e13);
                        if (f13 != null) {
                            K(f13, (Annotation) invoke, cls3);
                        }
                    } else {
                        if (!cls2.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                        }
                        d0 e15 = c0Var.e(e13);
                        if (e15 != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                ym2.b a14 = gm2.d.a(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    ym2.g e16 = ym2.g.e(((Enum) obj).name());
                                    Intrinsics.checkNotNullExpressionValue(e16, "identifier(...)");
                                    e15.c(a14, e16);
                                }
                            } else if (Intrinsics.d(componentType, Class.class)) {
                                for (Object obj2 : (Object[]) invoke) {
                                    Intrinsics.g(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    e15.d(j((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) invoke) {
                                    c0 b13 = e15.b(gm2.d.a(componentType));
                                    if (b13 != null) {
                                        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        K(b13, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) invoke) {
                                    e15.e(obj4);
                                }
                            }
                            e15.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        c0Var.a();
    }

    public static String M(StringBuilder sb3, int i13, int i14) {
        int i15;
        int i16;
        if (i13 >= i14) {
            return sb3.toString();
        }
        if (sb3.charAt(i13) == '/') {
            i13++;
        }
        int i17 = i13;
        int i18 = i17;
        while (i17 <= i14) {
            if (i17 == i14) {
                i15 = i17;
            } else if (sb3.charAt(i17) == '/') {
                i15 = i17 + 1;
            } else {
                i17++;
            }
            int i19 = i18 + 1;
            if (i17 == i19 && sb3.charAt(i18) == '.') {
                sb3.delete(i18, i15);
                i14 -= i15 - i18;
            } else {
                if (i17 == i18 + 2 && sb3.charAt(i18) == '.' && sb3.charAt(i19) == '.') {
                    i16 = sb3.lastIndexOf("/", i18 - 2) + 1;
                    int i23 = i16 > i13 ? i16 : i13;
                    sb3.delete(i23, i15);
                    i14 -= i15 - i23;
                } else {
                    i16 = i17 + 1;
                }
                i18 = i16;
            }
            i17 = i18;
        }
        return sb3.toString();
    }

    public static String N(String str, String str2) {
        StringBuilder sb3 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] z13 = z(str2);
        if (z13[0] != -1) {
            sb3.append(str2);
            M(sb3, z13[1], z13[2]);
            return sb3.toString();
        }
        int[] z14 = z(str);
        if (z13[3] == 0) {
            sb3.append((CharSequence) str, 0, z14[3]);
            sb3.append(str2);
            return sb3.toString();
        }
        if (z13[2] == 0) {
            sb3.append((CharSequence) str, 0, z14[2]);
            sb3.append(str2);
            return sb3.toString();
        }
        int i13 = z13[1];
        if (i13 != 0) {
            int i14 = z14[0] + 1;
            sb3.append((CharSequence) str, 0, i14);
            sb3.append(str2);
            return M(sb3, z13[1] + i14, i14 + z13[2]);
        }
        if (str2.charAt(i13) == '/') {
            sb3.append((CharSequence) str, 0, z14[1]);
            sb3.append(str2);
            int i15 = z14[1];
            return M(sb3, i15, z13[2] + i15);
        }
        int i16 = z14[0] + 2;
        int i17 = z14[1];
        if (i16 >= i17 || i17 != z14[2]) {
            int lastIndexOf = str.lastIndexOf(47, z14[2] - 1);
            int i18 = lastIndexOf == -1 ? z14[1] : lastIndexOf + 1;
            sb3.append((CharSequence) str, 0, i18);
            sb3.append(str2);
            return M(sb3, z14[1], i18 + z13[2]);
        }
        sb3.append((CharSequence) str, 0, i17);
        sb3.append('/');
        sb3.append(str2);
        int i19 = z14[1];
        return M(sb3, i19, z13[2] + i19 + 1);
    }

    public static Uri O(String str, String str2) {
        return Uri.parse(N(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object P(k1.t2 r5, float r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof m1.k1
            if (r0 == 0) goto L13
            r0 = r7
            m1.k1 r0 = (m1.k1) r0
            int r1 = r0.f85414t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85414t = r1
            goto L18
        L13:
            m1.k1 r0 = new m1.k1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f85413s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85414t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.g0 r5 = r0.f85412r
            ue.c.H(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r7)
            kotlin.jvm.internal.g0 r7 = new kotlin.jvm.internal.g0
            r7.<init>()
            m1.l1 r2 = new m1.l1
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.f85412r = r7
            r0.f85414t = r3
            k1.v1 r6 = k1.v1.Default
            java.lang.Object r5 = r5.b(r6, r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = r7
        L4d:
            float r5 = r5.f80425a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.P(k1.t2, float, bl2.c):java.lang.Object");
    }

    public static final void Q(View view, z zVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(t6.a.view_tree_lifecycle_owner, zVar);
    }

    public static final w0 R(g2 g2Var, Function1 function1, Object obj, o oVar) {
        w0 w0Var;
        s sVar = (s) oVar;
        sVar.U(-902048200, g2Var);
        if (g2Var.g()) {
            sVar.W(2101296683);
            sVar.r(false);
            w0Var = ((Boolean) function1.invoke(obj)).booleanValue() ? w0.Visible : ((Boolean) function1.invoke(g2Var.c())).booleanValue() ? w0.PostExit : w0.PreEnter;
        } else {
            sVar.W(2101530516);
            Object J2 = sVar.J();
            if (J2 == n.f71185a) {
                J2 = bs1.c.u1(Boolean.FALSE, y3.f71400a);
                sVar.g0(J2);
            }
            q1 q1Var = (q1) J2;
            if (((Boolean) function1.invoke(g2Var.c())).booleanValue()) {
                q1Var.setValue(Boolean.TRUE);
            }
            w0Var = ((Boolean) function1.invoke(obj)).booleanValue() ? w0.Visible : ((Boolean) q1Var.getValue()).booleanValue() ? w0.PostExit : w0.PreEnter;
            sVar.r(false);
        }
        sVar.r(false);
        return w0Var;
    }

    public static int S(Context context, int i13) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i13});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(j1.g2 r18, kotlin.jvm.functions.Function1 r19, u2.q r20, i1.n1 r21, i1.o1 r22, kotlin.jvm.functions.Function2 r23, kl2.l r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.a(j1.g2, kotlin.jvm.functions.Function1, u2.q, i1.n1, i1.o1, kotlin.jvm.functions.Function2, kl2.l, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(j1.g1 r16, u2.q r17, i1.n1 r18, i1.o1 r19, java.lang.String r20, kl2.l r21, i2.o r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.b(j1.g1, u2.q, i1.n1, i1.o1, java.lang.String, kl2.l, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(boolean r16, u2.q r17, i1.n1 r18, i1.o1 r19, java.lang.String r20, kl2.l r21, i2.o r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.c(boolean, u2.q, i1.n1, i1.o1, java.lang.String, kl2.l, i2.o, int, int):void");
    }

    public static final void d(g2 g2Var, Function1 function1, q qVar, n1 n1Var, o1 o1Var, l lVar, o oVar, int i13) {
        int i14;
        s sVar = (s) oVar;
        sVar.Y(429978603);
        if ((i13 & 6) == 0) {
            i14 = (sVar.h(g2Var) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.h(qVar) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.h(n1Var) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar.h(o1Var) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i14 |= sVar.j(lVar) ? 131072 : 65536;
        }
        if ((74899 & i14) == 74898 && sVar.z()) {
            sVar.Q();
        } else {
            int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
            int i16 = i14 & 14;
            boolean z13 = (i15 == 32) | (i16 == 4);
            Object J2 = sVar.J();
            if (z13 || J2 == n.f71185a) {
                J2 = new j0(function1, g2Var);
                sVar.g0(J2);
            }
            a(g2Var, function1, androidx.compose.ui.layout.b.f(qVar, (l) J2), n1Var, o1Var, k0.f70807i, lVar, sVar, i16 | 196608 | i15 | (i14 & 7168) | (57344 & i14) | ((i14 << 6) & 29360128), 64);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i1.l0(g2Var, function1, qVar, n1Var, o1Var, lVar, i13, 0);
        }
    }

    public static final long e(float f13, float f14) {
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    public static float f(float f13) {
        return f13 <= 0.04045f ? f13 / 12.92f : (float) Math.pow((f13 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float g(float f13) {
        return f13 <= 0.0031308f ? f13 * 12.92f : (float) ((Math.pow(f13, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final long h(int i13, int i14) {
        if (i13 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i13 + ", end: " + i14 + ']').toString());
        }
        if (i14 >= 0) {
            long j13 = (i14 & 4294967295L) | (i13 << 32);
            int i15 = p0.f21640c;
            return j13;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i13 + ", end: " + i14 + ']').toString());
    }

    public static void i(AudioManager audioManager, b bVar) {
        if (n0.f53866a < 26) {
            audioManager.abandonAudioFocus(bVar.f22022b);
            return;
        }
        AudioFocusRequest audioFocusRequest = bVar.f22026f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static dn2.f j(Class cls) {
        int i13 = 0;
        while (cls.isArray()) {
            i13++;
            cls = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            ym2.b a13 = gm2.d.a(cls);
            String str = zl2.d.f142106a;
            ym2.c fqName = a13.b();
            Intrinsics.checkNotNullExpressionValue(fqName, "asSingleFqName(...)");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            ym2.b bVar = (ym2.b) zl2.d.f142113h.get(fqName.i());
            if (bVar != null) {
                a13 = bVar;
            }
            return new dn2.f(a13, i13);
        }
        if (Intrinsics.d(cls, Void.TYPE)) {
            ym2.b j13 = ym2.b.j(xl2.q.f135298d.g());
            Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
            return new dn2.f(j13, i13);
        }
        xl2.o primitiveType = gn2.c.get(cls.getName()).getPrimitiveType();
        Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
        if (i13 > 0) {
            ym2.b j14 = ym2.b.j(primitiveType.getArrayTypeFqName());
            Intrinsics.checkNotNullExpressionValue(j14, "topLevel(...)");
            return new dn2.f(j14, i13 - 1);
        }
        ym2.b j15 = ym2.b.j(primitiveType.getTypeFqName());
        Intrinsics.checkNotNullExpressionValue(j15, "topLevel(...)");
        return new dn2.f(j15, i13);
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final long l(int i13, long j13) {
        int i14 = p0.f21640c;
        int i15 = (int) (j13 >> 32);
        int g13 = ql2.s.g(i15, 0, i13);
        int i16 = (int) (4294967295L & j13);
        int g14 = ql2.s.g(i16, 0, i13);
        return (g13 == i15 && g14 == i16) ? j13 : h(g13, g14);
    }

    public static int m(int i13, int i14) {
        return f5.c.j(i13, (Color.alpha(i13) * i14) / 255);
    }

    public static boolean n(File file, Resources resources, int i13) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i13);
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        try {
            boolean o13 = o(file, inputStream);
            k(inputStream);
            return o13;
        } catch (Throwable th4) {
            th = th4;
            k(inputStream);
            throw th;
        }
    }

    public static boolean o(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            k(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (IOException e13) {
                    e = e13;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }

    public static int p(int i13, float f13, int i14) {
        if (i13 == i14 || f13 <= 0.0f) {
            return i13;
        }
        if (f13 >= 1.0f) {
            return i14;
        }
        float f14 = ((i13 >> 24) & 255) / 255.0f;
        float f15 = ((i14 >> 24) & 255) / 255.0f;
        float f16 = f(((i13 >> 16) & 255) / 255.0f);
        float f17 = f(((i13 >> 8) & 255) / 255.0f);
        float f18 = f((i13 & 255) / 255.0f);
        float f19 = f(((i14 >> 16) & 255) / 255.0f);
        float f23 = f(((i14 >> 8) & 255) / 255.0f);
        float f24 = f((i14 & 255) / 255.0f);
        float a13 = ep.b.a(f15, f14, f13, f14);
        float a14 = ep.b.a(f19, f16, f13, f16);
        float a15 = ep.b.a(f23, f17, f13, f17);
        float a16 = ep.b.a(f24, f18, f13, f18);
        float g13 = g(a14) * 255.0f;
        float g14 = g(a15) * 255.0f;
        return Math.round(g(a16) * 255.0f) | (Math.round(g13) << 16) | (Math.round(a13 * 255.0f) << 24) | (Math.round(g14) << 8);
    }

    public static final tb.j q(tb.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return new tb.j(sVar.f117016a, sVar.f117035t);
    }

    public static final z r(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (z) yn2.c0.l(yn2.c0.q(x.e(view, v1.f18705j), v1.f18706k));
    }

    public static synchronized AudioManager s(Context context) {
        synchronized (c.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f22027a = null;
                }
                AudioManager audioManager = f22027a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    a7.o oVar = new a7.o(1);
                    d7.b.K().execute(new k(2, applicationContext, oVar));
                    oVar.d();
                    AudioManager audioManager2 = f22027a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f22027a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static int t(Context context, int i13, int i14) {
        Integer num;
        int i15;
        TypedValue W0 = com.bumptech.glide.c.W0(context, i13);
        if (W0 != null) {
            int i16 = W0.resourceId;
            if (i16 != 0) {
                Object obj = d5.a.f53679a;
                i15 = context.getColor(i16);
            } else {
                i15 = W0.data;
            }
            num = Integer.valueOf(i15);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i14;
    }

    public static int u(View view, int i13) {
        Context context = view.getContext();
        TypedValue Y0 = com.bumptech.glide.c.Y0(i13, view.getContext(), view.getClass().getCanonicalName());
        int i14 = Y0.resourceId;
        if (i14 == 0) {
            return Y0.data;
        }
        Object obj = d5.a.f53679a;
        return context.getColor(i14);
    }

    public static final int v(Cursor c13, String name) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c13.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c13.getColumnIndex("`" + name + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int w(Cursor c13, String name) {
        String str;
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int v13 = v(c13, name);
        if (v13 >= 0) {
            return v13;
        }
        try {
            String[] columnNames = c13.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str = kotlin.collections.c0.M(columnNames, null, null, null, 0, null, null, 63);
        } catch (Exception e13) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e13);
            str = "unknown";
        }
        throw new IllegalArgumentException(s1.c("column '", name, "' does not exist. Available columns: ", str));
    }

    public static String x(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !com.bumptech.glide.c.z(scheme, scheme2)) : scheme2 == null) {
            if (Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int min = Math.min(pathSegments.size(), pathSegments2.size());
                int i13 = 0;
                for (int i14 = 0; i14 < min && pathSegments.get(i14).equals(pathSegments2.get(i14)); i14++) {
                    i13++;
                }
                StringBuilder sb3 = new StringBuilder();
                for (int i15 = i13; i15 < pathSegments.size(); i15++) {
                    sb3.append("../");
                }
                while (i13 < pathSegments2.size()) {
                    sb3.append(pathSegments2.get(i13));
                    if (i13 < pathSegments2.size() - 1) {
                        sb3.append("/");
                    }
                    i13++;
                }
                return sb3.toString();
            }
        }
        return uri2.toString();
    }

    public static File y(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i13 = 0; i13 < 100; i13++) {
            File file = new File(cacheDir, cb.i(str, i13));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int[] z(String str) {
        int i13;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i14 = indexOf4 + 2;
        if (i14 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i14) == '/') {
            i13 = str.indexOf(47, indexOf4 + 3);
            if (i13 == -1 || i13 > indexOf2) {
                i13 = indexOf2;
            }
        } else {
            i13 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i13;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public abstract pc.q G();

    public abstract pc.q L();
}
