package lp2;

import a10.e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.appcompat.widget.c2;
import ck2.i;
import com.pinterest.api.model.h2;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.q11;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.contextualtypeahead.view.ContextualTypeaheadListView;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import jc0.v;
import k1.a1;
import kotlin.collections.q0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import lq0.b1;
import m60.w;
import n60.o;
import p50.q;
import pc.r0;
import rl2.g0;
import sk0.x;
import tb0.h;
import tb0.p;
import tc.g;
import x02.e1;
import x02.i2;
import x02.x2;
import x40.l0;
import xj2.c;
import xp0.d;

/* loaded from: classes4.dex */
public abstract class b implements pc.a {
    public static final void a(x92.b bVar) {
        o.C(bVar, "apiFieldsMap", "user.id", "user.type", "user.full_name");
        o.w(bVar, "user.username", "user.verified_identity", "user.is_verified_merchant", "user.follower_count");
        o.w(bVar, "user.image_medium_url", "user.image_large_url", "user.image_xlarge_url", "user.explicitly_followed_by_me");
        o.v(bVar, "user.blocked_by_me", "user.show_creator_profile", "user.user_recommendation_reason");
        bVar.h("user.recent_pin_images", "345x");
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static EdgeEffect c(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? k1.o.f77952a.a(context, null) : new a1(context);
    }

    public static yp0.b e(ArrayList disposables, d contextualTypeaheadListPresenter, ContextualTypeaheadListView contextualTypeaheadListView) {
        Intrinsics.checkNotNullParameter("", "typeaheadPrefix");
        Intrinsics.checkNotNullParameter("(^.*)", "typeaheadRegex");
        Intrinsics.checkNotNullParameter(disposables, "disposables");
        Intrinsics.checkNotNullParameter(contextualTypeaheadListPresenter, "contextualTypeaheadListPresenter");
        Intrinsics.checkNotNullParameter(contextualTypeaheadListView, "contextualTypeaheadListView");
        yp0.b bVar = new yp0.b("", "(^.*)");
        c F = bVar.a().F(new op0.a(3, new x(23, contextualTypeaheadListView, contextualTypeaheadListPresenter)), new op0.a(4, yp0.a.f139606j), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        disposables.add(F);
        c j13 = bVar.b().j(new op0.a(5, new xp0.c(contextualTypeaheadListPresenter, 2)), new op0.a(6, yp0.a.f139607k));
        Intrinsics.checkNotNullExpressionValue(j13, "subscribe(...)");
        disposables.add(j13);
        return bVar;
    }

    public static List g(ArrayList arrayList, List list) {
        Object obj;
        if (arrayList == null) {
            return q0.f80391a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            q11 q11Var = (q11) obj2;
            Double t13 = q11Var.t();
            Intrinsics.checkNotNullExpressionValue(t13, "getX(...)");
            double doubleValue = t13.doubleValue();
            Double u13 = q11Var.u();
            Intrinsics.checkNotNullExpressionValue(u13, "getY(...)");
            double doubleValue2 = u13.doubleValue();
            Double s13 = q11Var.s();
            Intrinsics.checkNotNullExpressionValue(s13, "getW(...)");
            double doubleValue3 = s13.doubleValue();
            Double o13 = q11Var.o();
            Intrinsics.checkNotNullExpressionValue(o13, "getH(...)");
            double doubleValue4 = o13.doubleValue();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (l(doubleValue, doubleValue2, doubleValue3, doubleValue4, (h2) obj)) {
                    break;
                }
            }
            if (((h2) obj) != null) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static float h(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return k1.o.f77952a.b(edgeEffect);
        }
        return 0.0f;
    }

    public static q11 i(List list, h2 category) {
        Intrinsics.checkNotNullParameter(category, "category");
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            q11 q11Var = (q11) next;
            Double t13 = q11Var.t();
            Intrinsics.checkNotNullExpressionValue(t13, "getX(...)");
            double doubleValue = t13.doubleValue();
            Double u13 = q11Var.u();
            Intrinsics.checkNotNullExpressionValue(u13, "getY(...)");
            double doubleValue2 = u13.doubleValue();
            Double s13 = q11Var.s();
            Intrinsics.checkNotNullExpressionValue(s13, "getW(...)");
            double doubleValue3 = s13.doubleValue();
            Double o13 = q11Var.o();
            Intrinsics.checkNotNullExpressionValue(o13, "getH(...)");
            if (l(doubleValue, doubleValue2, doubleValue3, o13.doubleValue(), category)) {
                obj = next;
                break;
            }
        }
        return (q11) obj;
    }

    public static int j(List list, h2 h2Var) {
        if (list == null || h2Var == null) {
            return 0;
        }
        q11 i13 = i(list, h2Var);
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(i13);
    }

    public static void k(h crashReporting, String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(message, "message");
        if (g0.p(exception)) {
            Throwable cause = exception.getCause();
            for (int i13 = 0; cause != null && i13 <= 4; i13++) {
                crashReporting.h("Caused By #" + i13 + ": " + cause);
                cause = Intrinsics.d(cause.getCause(), cause) ? null : cause.getCause();
            }
            exception = new Exception(a.a.j("'Caused By' was filtered, see breadcrumbs (error=", message));
        }
        crashReporting.q(exception, message, p.IDEA_PINS_CREATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean l(double r11, double r13, double r15, double r17, com.pinterest.api.model.h2 r19) {
        /*
            java.lang.Double r0 = r19.s()
            double r0 = r0.doubleValue()
            java.lang.Double r2 = r19.s()
            double r2 = r2.doubleValue()
            r4 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r2 = r2 * r4
            double r0 = r0 - r2
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L35
            java.lang.Double r0 = r19.s()
            double r6 = r0.doubleValue()
            java.lang.Double r0 = r19.s()
            double r8 = r0.doubleValue()
            double r8 = r8 * r4
            double r8 = r8 + r6
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 > 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = r1
        L36:
            java.lang.Double r3 = r19.t()
            double r6 = r3.doubleValue()
            java.lang.Double r3 = r19.t()
            double r8 = r3.doubleValue()
            double r8 = r8 * r4
            double r6 = r6 - r8
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 < 0) goto L64
            java.lang.Double r3 = r19.t()
            double r6 = r3.doubleValue()
            java.lang.Double r3 = r19.t()
            double r8 = r3.doubleValue()
            double r8 = r8 * r4
            double r8 = r8 + r6
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 > 0) goto L64
            r3 = r2
            goto L65
        L64:
            r3 = r1
        L65:
            java.lang.Double r6 = r19.r()
            double r6 = r6.doubleValue()
            java.lang.Double r8 = r19.r()
            double r8 = r8.doubleValue()
            double r8 = r8 * r4
            double r6 = r6 - r8
            int r6 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r6 < 0) goto L93
            java.lang.Double r6 = r19.r()
            double r6 = r6.doubleValue()
            java.lang.Double r8 = r19.r()
            double r8 = r8.doubleValue()
            double r8 = r8 * r4
            double r8 = r8 + r6
            int r6 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r6 > 0) goto L93
            r6 = r2
            goto L94
        L93:
            r6 = r1
        L94:
            java.lang.Double r7 = r19.n()
            double r7 = r7.doubleValue()
            java.lang.Double r9 = r19.n()
            double r9 = r9.doubleValue()
            double r9 = r9 * r4
            double r7 = r7 - r9
            int r7 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r7 < 0) goto Lc2
            java.lang.Double r7 = r19.n()
            double r7 = r7.doubleValue()
            java.lang.Double r9 = r19.n()
            double r9 = r9.doubleValue()
            double r9 = r9 * r4
            double r9 = r9 + r7
            int r4 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r4 > 0) goto Lc2
            r4 = r2
            goto Lc3
        Lc2:
            r4 = r1
        Lc3:
            if (r0 == 0) goto Lcc
            if (r3 == 0) goto Lcc
            if (r6 == 0) goto Lcc
            if (r4 == 0) goto Lcc
            r1 = r2
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lp2.b.l(double, double, double, double, com.pinterest.api.model.h2):boolean");
    }

    public static void m(EdgeEffect edgeEffect, int i13) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i13);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i13);
        }
    }

    public static float n(EdgeEffect edgeEffect, float f13, float f14) {
        if (Build.VERSION.SDK_INT >= 31) {
            return k1.o.f77952a.c(edgeEffect, f13, f14);
        }
        edgeEffect.onPull(f13, f14);
        return f13;
    }

    public static void o(EdgeEffect edgeEffect, float f13) {
        if (!(edgeEffect instanceof a1)) {
            edgeEffect.onRelease();
            return;
        }
        a1 a1Var = (a1) edgeEffect;
        float f14 = a1Var.f77807b + f13;
        a1Var.f77807b = f14;
        if (Math.abs(f14) > a1Var.f77806a) {
            a1Var.onRelease();
        }
    }

    public static void p(mv message, String str, wy0 activeUser, e1 conversationMessageRepository, x2 userRepository, i2 pinRepository, e02.a boardRouter, il1.a fragmentFactory, boolean z13, w eventManager, c2 sharesheetUtils, b1 b1Var) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        Intrinsics.checkNotNullParameter(conversationMessageRepository, "conversationMessageRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        if (message.G().booleanValue()) {
            return;
        }
        eventManager.d(new v(new cq0.a(message, str, activeUser, conversationMessageRepository, userRepository, pinRepository, boardRouter, fragmentFactory, aq0.d.REACTIONS_DISPLAY, false, z13, sharesheetUtils, eventManager, b1Var), false, 0L, 30));
    }

    public static void q(mv message, String str, wy0 activeUser, e1 conversationMessageRepository, x2 userRepository, i2 pinRepository, e02.a boardRouter, il1.a fragmentFactory, w eventManager, boolean z13, boolean z14, c2 sharesheetUtils, b1 b1Var) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        Intrinsics.checkNotNullParameter(conversationMessageRepository, "conversationMessageRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        if (message.G().booleanValue()) {
            return;
        }
        eventManager.d(new v(new cq0.a(message, str, activeUser, conversationMessageRepository, userRepository, pinRepository, boardRouter, fragmentFactory, aq0.d.SAVE_AND_SHARE, z13, z14, sharesheetUtils, eventManager, b1Var), false, 0L, 30));
    }

    public static byte[] r(ZipFile zipFile, ZipEntry zipEntry) {
        byte[] bArr;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            byte[] bArr2 = new byte[32];
            if (inputStream.read(bArr2, 0, 32) == 32) {
                if ((bArr2[0] & 255) == 100 && (bArr2[1] & 255) == 101 && (bArr2[2] & 255) == 120 && (bArr2[3] & 255) == 10 && (bArr2[7] & 255) == 0) {
                    bArr = z.m(bArr2, 12, 32);
                    dl2.b.J(inputStream, null);
                    return bArr;
                }
            }
            bArr = null;
            dl2.b.J(inputStream, null);
            return bArr;
        } finally {
        }
    }

    public static void s(g writer, pc.v customScalarAdapters, q value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pinRequestSize");
        pc.c.f99521b.d(writer, customScalarAdapters, Integer.valueOf(value.f98881a));
        r0 r0Var = value.f98882b;
        if (r0Var instanceof pc.q0) {
            writer.M0("widgetCountForStyle");
            pc.c.d(pc.c.f99526g).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
        r0 r0Var2 = value.f98883c;
        if (r0Var2 instanceof pc.q0) {
            writer.M0("widgetStyle");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var2);
        }
    }

    public static void t(g writer, pc.v customScalarAdapters, l0 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("conversationId");
        e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132686a);
        writer.M0("threadId");
        eVar.d(writer, customScalarAdapters, value.f132687b);
        r0 r0Var = value.f132688c;
        if (r0Var instanceof pc.q0) {
            writer.M0("message");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
        r0 r0Var2 = value.f132689d;
        if (r0Var2 instanceof pc.q0) {
            writer.M0("pinId");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var2);
        }
        writer.M0("source");
        eVar.d(writer, customScalarAdapters, value.f132690e);
        r0 r0Var3 = value.f132691f;
        if (r0Var3 instanceof pc.q0) {
            writer.M0("clientTrackingParams");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var3);
        }
    }

    public static byte[] u(ApplicationInfo applicationInfo) {
        byte[] r13;
        File file = new File(applicationInfo.sourceDir);
        if (!file.canRead()) {
            return null;
        }
        ZipFile zipFile = new ZipFile(file, 1);
        try {
            ZipEntry entry = zipFile.getEntry("classes.dex");
            if (entry == null) {
                dl2.b.J(zipFile, null);
                return null;
            }
            byte[] r14 = r(zipFile, entry);
            if (r14 == null) {
                dl2.b.J(zipFile, null);
                return null;
            }
            int i13 = 2;
            while (true) {
                ZipEntry entry2 = zipFile.getEntry("classes" + i13 + ".dex");
                if (entry2 == null || (r13 = r(zipFile, entry2)) == null) {
                    break;
                }
                int length = r14.length;
                int i14 = 0;
                while (i14 < length) {
                    int i15 = i14 + 1;
                    r14[i14] = (byte) (r14[i14] ^ r13[i14]);
                    i14 = i15;
                }
                i13++;
            }
            dl2.b.J(zipFile, null);
            return r14;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dl2.b.J(zipFile, th3);
                throw th4;
            }
        }
    }
}
