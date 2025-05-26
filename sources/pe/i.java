package pe;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Environment;
import android.util.Size;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import bi1.p;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.bj;
import com.pinterest.api.model.d00;
import com.pinterest.api.model.dj;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.h00;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.jj;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.l00;
import com.pinterest.api.model.m5;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xi;
import com.pinterest.api.model.zi;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.following.view.lego.CreatorFollowButton;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.tag.GestaltTag;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.scene.composer.z;
import com.pinterest.ui.components.users.LegoUserRep;
import com.pinterest.unauth.controller.SSOActivity;
import df.j1;
import dl1.s;
import h32.f1;
import h32.i0;
import h32.u0;
import h61.n;
import i2.f2;
import i2.o;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lb0.r;
import lh0.g2;
import lh0.j3;
import lh0.k2;
import lh0.l4;
import lh0.p3;
import lh0.y1;
import m60.f0;
import net.quikkly.android.utils.BitmapUtils;
import ni1.d0;
import ni1.t2;
import pc.k0;
import pc.q0;
import pc.r0;
import q71.g0;
import qa2.k1;
import qm0.m2;
import r72.a2;
import r72.c1;
import r72.g1;
import r72.i1;
import r72.n1;
import r72.u1;
import r72.x0;
import r72.y0;
import r72.z1;
import rl1.b0;
import rq.a0;
import so.m9;
import so.n5;
import so.n9;
import so.p0;
import so.p9;
import so.q3;
import so.r8;
import so.t1;
import t3.s1;
import vo.u;
import vy.m;
import x02.i2;
import x40.r5;
import xe1.e0;
import xe1.v;
import xe1.w;
import xe1.x;
import yb1.t;
import z32.d3;
import z32.e1;
import z32.h1;
import z32.m0;
import z32.r2;
import z32.s0;
import zp.j0;

/* loaded from: classes3.dex */
public abstract class i implements pc.a {
    public static final String A(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.d("PERSISTENT_SKIN_TONE_PER_SESSION", null);
    }

    public static void A0(g0 g0Var, uk1.e eVar) {
        g0Var.U0 = eVar;
    }

    public static final String B(br.c itemType, boolean z13) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        switch (com.pinterest.feature.search.c.f47622a[itemType.ordinal()]) {
            case 1:
            case 2:
                return "rs";
            case 3:
                return "trending";
            case 4:
                return "rec";
            case 5:
                return "cc_autocomplete";
            case 6:
                return "ac_shopping";
            default:
                return z13 ? "cc_autocomplete_append" : "autocomplete";
        }
    }

    public static void B0(xa1.f fVar, uk1.e eVar) {
        fVar.f134451z0 = eVar;
    }

    public static final s C(String str, List boards) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator it = boards.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((s) next).getUid(), str)) {
                obj = next;
                break;
            }
        }
        return (s) obj;
    }

    public static void C0(t tVar, uk1.e eVar) {
        tVar.B0 = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final c71.b0 D(com.pinterest.navigation.Navigation r54) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.i.D(com.pinterest.navigation.Navigation):c71.b0");
    }

    public static void D0(b31.g gVar, t1 t1Var) {
        gVar.f21439k0 = t1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final h61.h E(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (uri.getPathSegments().size() < 2) {
            return h61.h.PINS;
        }
        String str = uri.getPathSegments().get(1);
        if (str != null) {
            switch (str.hashCode()) {
                case -1383797171:
                    if (str.equals("boards")) {
                        return h61.h.BOARDS;
                    }
                    break;
                case -816678056:
                    if (str.equals("videos")) {
                        return h61.h.VIDEOS;
                    }
                    break;
                case 111578632:
                    if (str.equals("users")) {
                        return h61.h.USERS;
                    }
                    break;
                case 1783129469:
                    if (str.equals("buyable_pins")) {
                        return h61.h.PRODUCTS;
                    }
                    break;
            }
        }
        return uri.getBooleanQueryParameter("commerce_only", false) ? h61.h.PRODUCTS : h61.h.PINS;
    }

    public static void E0(p pVar, k11.p pVar2) {
        pVar.f22872e0 = pVar2;
    }

    public static final h61.h F(br.c itemType, n nVar) {
        h61.h hVar;
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        int i13 = com.pinterest.feature.search.c.f47622a[itemType.ordinal()];
        if (i13 == 2 || i13 == 7) {
            return h61.h.MY_PINS;
        }
        if (nVar != null) {
            int i14 = com.pinterest.feature.search.c.f47623b[nVar.ordinal()];
            if (i14 == 1) {
                hVar = h61.h.PINS;
            } else if (i14 == 2) {
                hVar = h61.h.PRODUCTS;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar = h61.h.USERS;
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return h61.h.PINS;
    }

    public static void F0(g0 g0Var, j22.b bVar) {
        g0Var.T0 = bVar;
    }

    public static final h61.h G(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "<this>");
        Object i03 = navigation.i0("com.pinterest.EXTRA_SEARCH_MODE");
        if (Intrinsics.d(i03 instanceof String ? (String) i03 : null, "VALUE_SEARCH_LIBRARY")) {
            return h61.h.MY_PINS;
        }
        String v03 = navigation.v0("com.pinterest.EXTRA_SEARCH_TYPE");
        h61.h.Companion.getClass();
        return h61.f.b(v03);
    }

    public static void G0(g0 g0Var, gp1.l lVar) {
        g0Var.X0 = lVar;
    }

    public static final String H(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.d("PREF_SKIN_TONE_SELECTION", null);
    }

    public static void H0(g0 g0Var) {
        g0Var.S0 = x92.c.f134368a;
    }

    public static final f01.a I(h20 h20Var) {
        f01.a aVar;
        Intrinsics.checkNotNullParameter(h20Var, "<this>");
        f01.a[] values = f01.a.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i13];
            if (Intrinsics.d(aVar.getInsightType(), h20Var.G())) {
                break;
            }
            i13++;
        }
        return aVar == null ? f01.a.RELATED_PINS : aVar;
    }

    public static void I0(t tVar, x10.d dVar) {
        tVar.C0 = dVar;
    }

    public static final Object J(Function0 block, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(block, "block");
        while (GLES20.glGetError() != 0) {
        }
        Object invoke = block.invoke();
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return invoke;
        }
        String gluErrorString = GLU.gluErrorString(glGetError);
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = Intrinsics.d(stackTrace[3].getMethodName(), "glCatch$default") ? stackTrace[4] : stackTrace[3];
        String str = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + " at\n" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber();
        StringBuilder w13 = a.a.w("GLES error", description.length() == 0 ? "" : s1.b(" in '", description, '\''), ": '", gluErrorString, "'. Stacktrace: ");
        w13.append(str);
        throw new Exception(w13.toString());
    }

    public static void J0(SSOActivity sSOActivity, u uVar) {
        sSOActivity.f52739e = uVar;
    }

    public static final void K(GestaltAvatar gestaltAvatar) {
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
        gestaltAvatar.H2(b0.f108525j);
    }

    public static void K0(t tVar, i92.k kVar) {
        tVar.A0 = kVar;
    }

    public static final e0 L(s0 storyCornerRadius, e1 size) {
        Intrinsics.checkNotNullParameter(storyCornerRadius, "storyCornerRadius");
        Intrinsics.checkNotNullParameter(size, "size");
        int i13 = w.f134821j[storyCornerRadius.ordinal()];
        if (i13 == 1) {
            return new e0(v.T, v.Y);
        }
        if (i13 == 2) {
            return new e0(v.S, v.X);
        }
        if (i13 == 3) {
            return size == e1.LARGE ? new e0(v.Q, v.X) : new e0(v.S, v.X);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void L0(g0 g0Var, j3 j3Var) {
        g0Var.Y0 = j3Var;
    }

    public static final int M(int i13, int i14) {
        float f13;
        float f14;
        if (i13 == 0) {
            return (int) (i14 * 0.1f);
        }
        if (i13 == 1) {
            f13 = i14;
            f14 = 1.2f;
        } else {
            if (i13 != 2) {
                return 0;
            }
            f13 = i14;
            f14 = 0.6f;
        }
        return i13 * ((int) (f13 * f14));
    }

    public static void M0(t tVar, kc2.b bVar) {
        tVar.D0 = bVar;
    }

    public static void N(com.pinterest.identity.account.h hVar, lb2.d dVar) {
        hVar.f49783l0 = dVar;
    }

    public static void N0(j91.l lVar, i92.k kVar) {
        lVar.f75143j = kVar;
    }

    public static void O(com.pinterest.identity.account.h hVar, mr1.a aVar) {
        hVar.f49782k0 = aVar;
    }

    public static final boolean O0(f30 f30Var) {
        f3 z33;
        Boolean K = (f30Var == null || (z33 = f30Var.z3()) == null) ? null : z33.K();
        if (K == null) {
            return false;
        }
        return K.booleanValue();
    }

    public static void P(od1.t tVar, m mVar) {
        tVar.N0 = mVar;
    }

    public static final boolean P0(b60.b bVar, Function0 isExpansionEnabled, h61.h searchType, boolean z13) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(isExpansionEnabled, "isExpansionEnabled");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        if (searchType != h61.h.ARTICLE_FEED && !z13) {
            wy0 f13 = ((b60.d) bVar).f();
            if (Intrinsics.d(f13 != null ? f13.G2() : null, "US") || ((Boolean) isExpansionEnabled.invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static void Q(g0 g0Var, m mVar) {
        g0Var.V0 = mVar;
    }

    public static final boolean Q0(g00 g00Var) {
        Intrinsics.checkNotNullParameter(g00Var, "<this>");
        o00 v13 = g00Var.v();
        if (v13 != null) {
            return Intrinsics.d(v13.v(), Boolean.TRUE);
        }
        return false;
    }

    public static void R(cy0.h hVar, oc.c cVar) {
        hVar.f53433n0 = cVar;
    }

    public static final void R0(g.b registerForResult) {
        Intrinsics.checkNotNullParameter(registerForResult, "registerForResult");
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("application/pdf");
        registerForResult.a(intent);
    }

    public static void S(r02.e0 e0Var, m60.e eVar) {
        e0Var.N0 = eVar;
    }

    public static final zy.e0 S0(i0 context, h32.g0 component, u0 element) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(element, "element");
        return new zy.e0(new zy.a(com.bumptech.glide.d.z0(context, new nx.i0(element, component, 4)), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN));
    }

    public static void T(p pVar, e02.a aVar) {
        pVar.f22873f0 = aVar;
    }

    public static final Double T0(m5 m5Var) {
        boolean[] zArr = m5Var.f40004f;
        if (zArr.length <= 0 || !zArr[0]) {
            return null;
        }
        return m5Var.f();
    }

    public static void U(t tVar, h20.a aVar) {
        tVar.f138581z0 = aVar;
    }

    public static final Integer U0(m5 m5Var) {
        if (m5Var != null) {
            boolean[] zArr = m5Var.f40004f;
            if (zArr.length > 4 && zArr[4]) {
                return Integer.valueOf((int) m5Var.j().doubleValue());
            }
        }
        return null;
    }

    public static void V(cy0.h hVar, r8 r8Var) {
        hVar.f53435p0 = r8Var;
    }

    public static jr1.f V0(mr1.c cVar, uj2.q qVar, String str, m9 m9Var, n9 n9Var, p9 p9Var, f30.b bVar) {
        return new jr1.f(cVar, qVar, str, m9Var, n9Var, p9Var, bVar);
    }

    public static void W(cy0.h hVar, p0 p0Var) {
        hVar.f53434o0 = p0Var;
    }

    public static final void W0(Context context, File file, String str, m60.e eVar, g.b bVar) {
        Uri c13 = FileProvider.c(0, context, context.getPackageName() + ".provider").c(file);
        Uri B = kg.p.B(context, file, eVar);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1073741825);
        intent.putExtra("android.intent.extra.STREAM", B);
        intent.setDataAndType(c13, str);
        Intent createChooser = Intent.createChooser(intent, "Open File");
        Intrinsics.checkNotNullExpressionValue(createChooser, "createChooser(...)");
        try {
            bVar.a(createChooser);
        } catch (Exception unused) {
        }
    }

    public static void X(nq1.e eVar, hf0.c cVar) {
        eVar.f91823l0 = cVar;
    }

    public static final void X0(String fileType, String fileContent, Context context, m60.e applicationInfoProvider, g.b launcher) {
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(fileContent, "fileContent");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        String filename = new SimpleDateFormat("yyyyMMddhms").format(new Date());
        Intrinsics.checkNotNullExpressionValue(filename, "format(...)");
        Intrinsics.checkNotNullParameter(filename, "filename");
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(a.a.l(file.getAbsolutePath(), "/", filename, ".pdf"));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] decode = Base64.getDecoder().decode(fileContent);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                fileOutputStream.write(decode);
                Unit unit = Unit.f80348a;
                dl2.b.J(fileOutputStream, null);
                W0(context, file2, fileType, applicationInfoProvider, launcher);
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public static void Y(com.pinterest.identity.account.h hVar, y1 y1Var) {
        hVar.f49785n0 = y1Var;
    }

    public static void Y0(nl1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        FragmentActivity E4 = dVar.E4();
        if (E4 != null) {
            E4.getWindow().addFlags(1024);
            dl2.b.X1(E4);
        }
    }

    public static void Z(t tVar, p3 p3Var) {
        tVar.E0 = p3Var;
    }

    public static boolean Z0() {
        return hf0.b.q() || hf0.b.m();
    }

    public static final void a(un1.c state, u2.q qVar, Function1 function1, o oVar, int i13, int i14) {
        Function1 function12;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1665248779);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = null;
        }
        sVar.W(-565079447);
        if (function1 == null) {
            function12 = null;
        } else {
            sVar.W(442667680);
            boolean z13 = (((i13 & 896) ^ 384) > 256 && sVar.h(function1)) || (i13 & 384) == 256;
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new al1.j(6, function1);
                sVar.g0(J2);
            }
            function12 = (Function1) J2;
            sVar.r(false);
        }
        sVar.r(false);
        b(state, qVar, function12 != null ? new hm1.e(3, function12) : null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 520, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 16, qVar, state, function1);
        }
    }

    public static void a0(p pVar, il1.a aVar) {
        pVar.f22874g0 = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a1(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -465859815: goto L23;
                case 395374455: goto L1a;
                case 1054986220: goto L11;
                case 2114479072: goto L8;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            java.lang.String r0 = "shopping_module_pdp"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L2b
        L11:
            java.lang.String r0 = "product_tagged_shopping_module_upsell"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2b
            goto L2d
        L1a:
            java.lang.String r0 = "shopping_module_closeup"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L2b
        L23:
            java.lang.String r0 = "stela_shop_pdp"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
        L2b:
            r1 = 0
            goto L2e
        L2d:
            r1 = 1
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.i.a1(java.lang.String):boolean");
    }

    public static final void b(un1.c state, u2.q qVar, gm1.a aVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(75748556);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        androidx.compose.ui.viewinterop.a.a(new a0(((Number) sVar.m(fc0.k.f61712a)).intValue(), state, aVar, 21), qVar, new com.pinterest.framework.screens.q(22, aVar, state), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 17, qVar, state, aVar);
        }
    }

    public static void b0(j91.l lVar, no1.e eVar) {
        lVar.f75142i = eVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b1(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -465859815: goto L23;
                case 395374455: goto L1a;
                case 1054986220: goto L11;
                case 2114479072: goto L8;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            java.lang.String r0 = "shopping_module_pdp"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L2b
        L11:
            java.lang.String r0 = "product_tagged_shopping_module_upsell"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2b
            goto L2d
        L1a:
            java.lang.String r0 = "shopping_module_closeup"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L2b
        L23:
            java.lang.String r0 = "stela_shop_pdp"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
        L2b:
            r1 = 0
            goto L2e
        L2d:
            r1 = 1
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.i.b1(java.lang.String):boolean");
    }

    public static final g1 c(z1 z1Var, String str) {
        return new g1(str, z1Var.a().f106517e, z1Var.a().f106515c, z1Var.c(), z1Var.d(), z1Var.a().f106523k, z1Var.a().f106524l, z1Var.e());
    }

    public static void c0(com.pinterest.identity.account.h hVar, androidx.appcompat.app.n nVar) {
        hVar.f49781j0 = nVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c1(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 1
            switch(r0) {
                case -1325842777: goto L6e;
                case -465859815: goto L65;
                case 2693849: goto L5c;
                case 157514928: goto L53;
                case 395374455: goto L4a;
                case 680782075: goto L41;
                case 999488942: goto L38;
                case 1054986220: goto L2f;
                case 1147077250: goto L26;
                case 1452443084: goto L1d;
                case 1715032975: goto L14;
                case 2114479072: goto La;
                default: goto L8;
            }
        L8:
            goto L76
        La:
            java.lang.String r0 = "shopping_module_pdp"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L14:
            java.lang.String r0 = "shop_the_board"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L1d:
            java.lang.String r0 = "unified_visual_feed_product_upsell"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L26:
            java.lang.String r0 = "product_category_based"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L2f:
            java.lang.String r0 = "product_tagged_shopping_module_upsell"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L38:
            java.lang.String r0 = "boards_more_ideas_feed_upsell_list_cards"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L41:
            java.lang.String r0 = "recently_viewed"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L4a:
            java.lang.String r0 = "shopping_module_closeup"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L53:
            java.lang.String r0 = "recently_saved"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L5c:
            java.lang.String r0 = "best_selling_recommended_brand"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L65:
            java.lang.String r0 = "stela_shop_pdp"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto L76
        L6e:
            java.lang.String r0 = "on_sale"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
        L76:
            r1 = 0
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.i.c1(java.lang.String):boolean");
    }

    public static void d0(kd1.k kVar, f0 f0Var) {
        kVar.L0 = f0Var;
    }

    public static final re1.v d1(h1 h1Var, r2 r2Var) {
        re1.v vVar;
        int i13 = h1Var == null ? -1 : w.f134817f[h1Var.ordinal()];
        vn1.b bVar = null;
        byte b13 = 0;
        byte b14 = 0;
        if (i13 == 1) {
            return new re1.v(g1(r2Var), (vn1.e) (b13 == true ? 1 : 0), 5);
        }
        if (i13 == 2) {
            vVar = new re1.v(vn1.c.SUBTLE, g1(r2Var), vn1.e.BOLD);
        } else {
            if (i13 != 3) {
                return new re1.v(bVar, (vn1.e) (b14 == true ? 1 : 0), 7);
            }
            vVar = new re1.v(vn1.c.SUBTLE, g1(r2Var), vn1.h.f126279e);
        }
        return vVar;
    }

    public static final void e(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        pk.a0.c(apiFieldsMap);
        com.bumptech.glide.d.e(apiFieldsMap);
        pk.a0.b(apiFieldsMap);
        apiFieldsMap.e("pin.is_eligible_for_web_closeup");
        apiFieldsMap.e("pin.ad_destination_url");
        apiFieldsMap.e("pin.image_signature");
        j1.g(apiFieldsMap);
        g2 d2 = g2.f83370b.d();
        k3.t(apiFieldsMap);
        apiFieldsMap.h("pin.images", "236x");
        n60.o.A(apiFieldsMap, "pin.images", "736x", "pin.shopping_flags", "user.image_medium_url");
        n60.o.w(apiFieldsMap, "pin.dominant_color", "pin.rich_summary()", "pin.embed", "pin.promoter()");
        n60.o.w(apiFieldsMap, "pin.is_promoted", "pin.promoted_is_removable", "pin.promoted_is_max_video", "pin.is_downstream_promotion");
        n60.o.w(apiFieldsMap, "pin.is_cpc_ad", "pin.promoted_android_deep_link", "pin.recommendation_reason", "pin.board()");
        n60.o.w(apiFieldsMap, "pin.pinned_to_board", "pin.pinner()", "pin.source_interest()", "pin.is_video");
        n60.o.w(apiFieldsMap, "pin.ad_match_reason", "pin.done_by_me", "pin.dark_profile_link", "pin.closeup_description");
        n60.o.w(apiFieldsMap, "pin.domain", "user.explicitly_followed_by_me", "board.followed_by_me", "pin.is_repin");
        apiFieldsMap.e("pin.is_native");
        apiFieldsMap.e("pin.native_creator()");
        apiFieldsMap.e("pin.tracking_params");
        d7.b.i(apiFieldsMap);
        apiFieldsMap.e("pin.image_crop");
        apiFieldsMap.e("user.is_verified_merchant");
        dl2.b.o(apiFieldsMap, d2);
        apiFieldsMap.e("pin.is_full_width");
    }

    public static void e0(com.pinterest.identity.account.h hVar, mo1.d dVar) {
        hVar.f49784m0 = dVar;
    }

    public static final ArrayList e1(p41.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f1(dVar.f98851a);
    }

    public static void f0(r02.e0 e0Var, mo1.d dVar) {
        e0Var.M0 = dVar;
    }

    public static final ArrayList f1(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((p41.c) it.next()).f98850a);
        }
        return arrayList;
    }

    public static final void g(GestaltDivider gestaltDivider, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltDivider, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        jm1.f fVar = new jm1.f(gestaltDivider.b());
        init.invoke(fVar);
        gestaltDivider.a(new ql1.k(fVar, 18));
    }

    public static void g0(xa1.f fVar, vb0.l lVar) {
        fVar.A0 = lVar;
    }

    public static final vn1.b g1(r2 r2Var) {
        int i13 = r2Var == null ? -1 : w.f134818g[r2Var.ordinal()];
        return (i13 == 1 || i13 == 2) ? vn1.b.START : i13 != 3 ? vn1.b.START : vn1.b.CENTER;
    }

    public static final void h(GestaltTag gestaltTag, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltTag, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        qn1.g gVar = new qn1.g(gestaltTag.i());
        init.invoke(gVar);
        an1.i nextState = new an1.i(gVar, 13);
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    public static void h0(od1.t tVar, n5 n5Var) {
        tVar.L0 = n5Var;
    }

    public static re1.f h1(vh vhVar, yk1.v viewResources, xo0.o bubbleImpressionLogger, xe1.t params, boolean z13, Integer num, Integer num2, String trafficSource, boolean z14, boolean z15, boolean z16, int i13) {
        float f13;
        d3 d3Var;
        xi c13;
        xi c14;
        xi c15;
        Integer layoutRows;
        xi c16;
        xi c17;
        d3 d3Var2;
        xi c18;
        xi c19;
        xi c23;
        jj q13;
        Integer rows;
        xi c24;
        hf0.b device = new hf0.b();
        boolean z17 = (i13 & 16) != 0 ? false : z13;
        Float f14 = null;
        Integer num3 = (i13 & 32) != 0 ? null : num;
        Integer num4 = (i13 & 64) != 0 ? null : num2;
        boolean z18 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z14;
        boolean z19 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z15;
        boolean z23 = (i13 & 1024) != 0 ? false : z16;
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        kh khVar = vhVar.f42858p;
        zi contentVisibleItems = (khVar == null || (c24 = khVar.c()) == null) ? null : c24.getContentVisibleItems();
        Intrinsics.checkNotNullParameter(device, "device");
        Float tabletLandscape = contentVisibleItems != null ? (hf0.b.q() && hf0.b.m()) ? contentVisibleItems.getTabletLandscape() : (hf0.b.q() && hf0.b.o()) ? contentVisibleItems.getTabletPortrait() : contentVisibleItems.getMobile() : null;
        if (tabletLandscape != null) {
            f13 = tabletLandscape.floatValue();
        } else {
            Intrinsics.checkNotNullParameter(device, "device");
            f13 = (hf0.b.q() && hf0.b.m()) ? 4.5f : (hf0.b.q() && hf0.b.o()) ? 3.5f : 2.5f;
        }
        float f15 = f13;
        m0 m0Var = vhVar.f42868z;
        m0 m0Var2 = m0.CAROUSEL;
        oe1.b bVar = params.f134760a;
        if (m0Var == m0Var2) {
            kh khVar2 = vhVar.f42858p;
            int intValue = (khVar2 == null || (q13 = khVar2.q()) == null || (rows = q13.getRows()) == null) ? 1 : rows.intValue();
            int i14 = intValue;
            ue1.l Z0 = l3.c.Z0(vhVar, viewResources, bubbleImpressionLogger, intValue == 1 ? 6 : 20, null, f15, params, false, false, false, z17, device, trafficSource, 960);
            if (Z0 == null) {
                return null;
            }
            String uid = vhVar.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            HashMap hashMap = bVar.f94255b;
            kh khVar3 = vhVar.f42858p;
            if (khVar3 == null || (c23 = khVar3.c()) == null || (d3Var2 = c23.l()) == null) {
                d3Var2 = d3.DEFAULT;
            }
            d3 d3Var3 = d3Var2;
            kh khVar4 = vhVar.f42858p;
            Long videoMaxPlaytimeMs = (khVar4 == null || (c19 = khVar4.c()) == null) ? null : c19.getVideoMaxPlaytimeMs();
            String q14 = vhVar.q();
            Intrinsics.checkNotNullExpressionValue(q14, "getStoryType(...)");
            boolean c110 = c1(q14);
            String q15 = vhVar.q();
            Intrinsics.checkNotNullExpressionValue(q15, "getStoryType(...)");
            boolean b13 = b1(q15);
            String q16 = vhVar.q();
            Intrinsics.checkNotNullExpressionValue(q16, "getStoryType(...)");
            boolean a13 = a1(q16);
            kh khVar5 = vhVar.f42858p;
            if (khVar5 != null && (c18 = khVar5.c()) != null) {
                f14 = c18.getItemWidthHeightRatio();
            }
            return new re1.f(uid, Z0, hashMap, null, i14, null, false, d3Var3, videoMaxPlaytimeMs, c110, b13, a13, params.f134772m, f14, false, 0, 0, trafficSource, 230496);
        }
        xi c25 = vhVar.f42858p.c();
        if (c25 == null) {
            return null;
        }
        Integer M = l3.c.M(c25.getGridLayout());
        int intValue2 = M != null ? M.intValue() : 6;
        int i15 = intValue2;
        ue1.l Z02 = l3.c.Z0(vhVar, viewResources, bubbleImpressionLogger, intValue2, c25.d(), f15, params, z18, z19, z23, z17, device, trafficSource, 64);
        if (Z02 == null) {
            return null;
        }
        kh khVar6 = vhVar.f42858p;
        boolean z24 = ((khVar6 == null || (c17 = khVar6.c()) == null) ? null : c17.b()) == z32.g0.SNAPPING;
        kh khVar7 = vhVar.f42858p;
        boolean z25 = ((khVar7 == null || (c16 = khVar7.c()) == null) ? null : c16.b()) == z32.g0.PAGING;
        boolean z26 = z25 || z24;
        double floor = z25 ? (float) Math.floor(f15) : 1.0d;
        int ceil = (int) Math.ceil(i15 / floor);
        String uid2 = vhVar.getUid();
        HashMap hashMap2 = bVar.f94255b;
        h32.g0 d2 = c25.d();
        dj gridLayout = c25.getGridLayout();
        int intValue3 = (gridLayout == null || (layoutRows = gridLayout.getLayoutRows()) == null) ? 1 : layoutRows.intValue();
        int i16 = eo1.a.item_spacing_none;
        u50.d start = new u50.d(i16);
        u50.d top = new u50.d(i16);
        u50.d end = new u50.d(i16);
        u50.d bottom = new u50.d(i16);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        if (num3 != null) {
            start = new u50.d(num3.intValue());
        }
        if (num4 != null) {
            end = new u50.d(num4.intValue());
        }
        re1.g gVar = new re1.g(start, end, 10);
        boolean z27 = vhVar.p0() && !z26;
        kh khVar8 = vhVar.f42858p;
        if (khVar8 == null || (c15 = khVar8.c()) == null || (d3Var = c15.l()) == null) {
            d3Var = d3.DEFAULT;
        }
        d3 d3Var4 = d3Var;
        kh khVar9 = vhVar.f42858p;
        Long videoMaxPlaytimeMs2 = (khVar9 == null || (c14 = khVar9.c()) == null) ? null : c14.getVideoMaxPlaytimeMs();
        String q17 = vhVar.q();
        Intrinsics.checkNotNullExpressionValue(q17, "getStoryType(...)");
        boolean c111 = c1(q17);
        String q18 = vhVar.q();
        Intrinsics.checkNotNullExpressionValue(q18, "getStoryType(...)");
        boolean b14 = b1(q18);
        String q19 = vhVar.q();
        Intrinsics.checkNotNullExpressionValue(q19, "getStoryType(...)");
        boolean a14 = a1(q19);
        boolean z28 = z26 || vhVar.p0();
        int i17 = (int) floor;
        kh khVar10 = vhVar.f42858p;
        if (khVar10 != null && (c13 = khVar10.c()) != null) {
            f14 = c13.getItemWidthHeightRatio();
        }
        Intrinsics.f(uid2);
        return new re1.f(uid2, Z02, hashMap2, d2, intValue3, gVar, z27, d3Var4, videoMaxPlaytimeMs2, c111, b14, a14, params.f134772m, f14, z28, i17, ceil, trafficSource, 1024);
    }

    public static final void i(GestaltSwitch gestaltSwitch, Function1 invokeAfterStateMutation) {
        Intrinsics.checkNotNullParameter(gestaltSwitch, "<this>");
        Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
        gestaltSwitch.K = new xs0.i(1, gestaltSwitch, invokeAfterStateMutation);
        gestaltSwitch.m();
    }

    public static void i0(p pVar, l4 l4Var) {
        pVar.f22875h0 = l4Var;
    }

    public static final re1.j i1(vh vhVar, xe1.t tVar, z32.a0 a0Var) {
        Function1 function1;
        xe1.u uVar;
        xe1.u uVar2;
        bj g13;
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        Function0 function0 = null;
        re1.e eVar = tVar != null ? tVar.f134762c : null;
        re1.e eVar2 = (eVar != null ? eVar.f107575c : null) == z32.l.FOOTER ? eVar : null;
        kh khVar = vhVar.f42858p;
        bj g14 = khVar != null ? khVar.g() : null;
        if (a0Var == null) {
            kh khVar2 = vhVar.f42858p;
            a0Var = (khVar2 == null || (g13 = khVar2.g()) == null) ? null : g13.b();
        }
        String uid = vhVar.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        re1.i iVar = new re1.i((g14 != null ? g14.a() : null) == s0.CLOSEUP_MODULE ? v.I : Intrinsics.d(vhVar.q(), "personal_boutique_navigation_header") ? v.G : l1(a0Var, true), l1(a0Var, false));
        if (tVar == null || (uVar2 = tVar.f134761b) == null || (function1 = uVar2.f134775c) == null) {
            function1 = x.f134822j;
        }
        if (tVar != null && (uVar = tVar.f134761b) != null) {
            function0 = uVar.f134780h;
        }
        return new re1.j(uid, g14, eVar2, iVar, l3.c.a1(vhVar, eVar2, function1, function0));
    }

    public static final void j(GestaltSwitchWithLabel gestaltSwitchWithLabel, Function1 invokeAfterStateMutation) {
        Intrinsics.checkNotNullParameter(gestaltSwitchWithLabel, "<this>");
        Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
        gestaltSwitchWithLabel.X(new la1.k(20, gestaltSwitchWithLabel, invokeAfterStateMutation));
    }

    public static void j0(od1.t tVar, k2 k2Var) {
        tVar.M0 = k2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0472  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r19v0, types: [re1.s] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v13, types: [re1.r] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final re1.r j1(com.pinterest.api.model.vh r45, xe1.t r46, boolean r47, boolean r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.i.j1(com.pinterest.api.model.vh, xe1.t, boolean, boolean, boolean):re1.r");
    }

    public static final void k(int i13, int i14) {
        if (i14 < 0) {
            throw new IllegalArgumentException(a.a.e("byteCount [", i14, "] cannot be negative").toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("bufferSize [", i13, "] cannot be negative").toString());
        }
        if (i14 > i13) {
            throw new BufferUnderflowException();
        }
    }

    public static void k0(qx1.c cVar, so.f1 f1Var) {
        cVar.f105335m0 = f1Var;
    }

    public static void k1(tc.g writer, pc.v customScalarAdapters, r5 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.f133158a instanceof q0) {
            writer.M0("board");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (q0) value.f133158a);
        }
        r0 r0Var = value.f133159b;
        if (r0Var instanceof q0) {
            writer.M0("exploreArticle");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (q0) r0Var);
        }
        r0 r0Var2 = value.f133160c;
        if (r0Var2 instanceof q0) {
            writer.M0("pin");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (q0) r0Var2);
        }
        r0 r0Var3 = value.f133161d;
        if (r0Var3 instanceof q0) {
            writer.M0("pins");
            pc.c.d(pc.c.b(pc.c.a(pc.c.f99524e))).a(writer, customScalarAdapters, (q0) r0Var3);
        }
        writer.M0("source");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133162e);
        r0 r0Var4 = value.f133163f;
        if (r0Var4 instanceof q0) {
            writer.M0("text");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (q0) r0Var4);
        }
        r0 r0Var5 = value.f133164g;
        if (r0Var5 instanceof q0) {
            writer.M0("todayArticle");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (q0) r0Var5);
        }
        r0 r0Var6 = value.f133165h;
        if (r0Var6 instanceof q0) {
            writer.M0("user");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (q0) r0Var6);
        }
        r0 r0Var7 = value.f133166i;
        if (r0Var7 instanceof q0) {
            writer.M0("userDidItData");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (q0) r0Var7);
        }
        writer.M0("userIds");
        k0 k0Var = pc.c.f99524e;
        pc.c.a(k0Var).b(writer, customScalarAdapters, value.f133167j);
        r0 r0Var8 = value.f133168k;
        if (r0Var8 instanceof q0) {
            writer.M0("emails");
            pc.c.d(pc.c.b(pc.c.a(k0Var))).a(writer, customScalarAdapters, (q0) r0Var8);
        }
        r0 r0Var9 = value.f133169l;
        if (r0Var9 instanceof q0) {
            writer.M0("clientTrackingParams");
            pc.c.d(k0Var).a(writer, customScalarAdapters, (q0) r0Var9);
        }
    }

    public static final void l(int i13, int i14, int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException(a.a.e("byteCount [", i15, "] cannot be negative").toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("bufferSize [", i13, "] cannot be negative").toString());
        }
        if (i14 < 0 || i14 + i15 > i13) {
            throw new BufferOverflowException();
        }
    }

    public static void l0(kd1.k kVar, d0 d0Var) {
        kVar.N0 = d0Var;
    }

    public static final int l1(z32.a0 a0Var, boolean z13) {
        int i13 = a0Var == null ? -1 : w.f134815d[a0Var.ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? v.E : v.f134781J : z13 ? v.C : v.E : v.F;
    }

    public static final String m(f30 f30Var, lh0.d experiments, es.h adsCommonDisplay) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        ArrayList t13 = ((es.v) adsCommonDisplay).t(f30Var, experiments);
        if (t13 != null) {
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(t13, 10));
            Iterator it = t13.iterator();
            while (it.hasNext()) {
                arrayList2.add(((f30) it.next()).getUid());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return CollectionsKt.Z(arrayList, ",", null, null, 0, null, null, 62);
        }
        return null;
    }

    public static void m0(kd1.k kVar, qa2.d dVar) {
        kVar.K0 = dVar;
    }

    public static final x21.h m1(d3 d3Var) {
        int i13 = d3Var == null ? -1 : w.f134819h[d3Var.ordinal()];
        if (i13 == 1) {
            return x21.h.SEQUENTIAL;
        }
        if (i13 == 2) {
            return x21.h.FIRST_VISIBLE;
        }
        if (i13 != 3) {
            return null;
        }
        return x21.h.ALL_VISIBLE;
    }

    public static final u1 n(CutoutModel cutoutModel) {
        String str;
        Intrinsics.checkNotNullParameter(cutoutModel, "<this>");
        int i13 = z.f52181a;
        float f13 = cutoutModel.f51931b;
        float f14 = cutoutModel.f51932c;
        int i14 = z.f52181a;
        Size n13 = ig1.b.n1(z.a(f13, f14, i14, Integer.MAX_VALUE));
        x0 a13 = x0.a(x0.f106703e, new y0(cutoutModel.f51930a, n13.getWidth(), n13.getHeight(), i14), null, 14);
        u1 u1Var = u1.f106668t;
        int i15 = a2.f106437b;
        String c03 = gi2.b.c0();
        i1 a14 = cutoutModel.f51936g.a();
        String value = cutoutModel.f51935f;
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            str = value;
        } else {
            str = null;
        }
        String value2 = cutoutModel.f51934e;
        if (value2 != null) {
            int i16 = c1.f106451a;
            Intrinsics.checkNotNullParameter(value2, "value");
        } else {
            int i17 = c1.f106451a;
            value2 = "-1";
        }
        String str2 = value2;
        String value3 = cutoutModel.f51937h;
        if (value3 != null) {
            int i18 = n1.f106581a;
            Intrinsics.checkNotNullParameter(value3, "value");
        } else {
            int i19 = n1.f106581a;
            value3 = "none";
        }
        return u1.f(u1Var, c03, null, 0.0d, 0.0d, null, a13, a14, str, str2, null, value3, null, null, 253470);
    }

    public static void n0(kd1.k kVar) {
        kVar.getClass();
    }

    public static final vn1.g n1(e1 e1Var) {
        int i13 = e1Var == null ? -1 : w.f134816e[e1Var.ordinal()];
        return i13 != 1 ? (i13 == 2 || i13 == 3) ? vn1.g.UI_400 : i13 != 4 ? i13 != 5 ? vn1.g.UI_400 : vn1.g.BODY_300 : vn1.g.HEADING_700 : vn1.g.HEADING_XL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.pinterest.ui.components.users.LegoUserRep o(android.content.Context r6, android.widget.LinearLayout.LayoutParams r7, com.pinterest.api.model.wy0 r8, boolean r9, oa2.l r10, yl1.b r11, boolean r12) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "user"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "userRepActionListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.pinterest.ui.components.users.LegoUserRep r0 = new com.pinterest.ui.components.users.LegoUserRep
            r0.<init>(r6)
            rl1.g r6 = rl1.n.f(r6)
            java.lang.String r1 = dl2.b.s0(r8)
            java.lang.String r2 = dl2.b.M0(r8)
            boolean r3 = dl2.b.W1(r8)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L31
            if (r9 != 0) goto L31
            r3 = r4
            goto L32
        L31:
            r3 = r5
        L32:
            rl1.g r6 = rl1.n.c(r6, r1, r2, r3)
            if (r9 == 0) goto L3b
            int r9 = sm1.b.ic_check_circle_gestalt
            goto L3c
        L3b:
            r9 = r5
        L3c:
            kh2.u2.T0(r0, r10)
            ze0.a r10 = ze0.a.List
            r0.y1(r10)
            r0.H0(r6)
            java.lang.String r6 = dl2.b.i1(r8)
            int r10 = eo1.b.color_blue_500
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1 = 8
            oa2.t.i4(r0, r6, r9, r10, r1)
            if (r12 == 0) goto La6
            java.lang.Integer r6 = r8.V2()
            java.lang.String r9 = "getFollowerCount(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
            int r6 = r6.intValue()
            if (r6 <= 0) goto La6
            android.content.res.Resources r6 = r0.getResources()
            int r10 = m60.w0.follower_count
            java.lang.Integer r12 = r8.V2()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r9)
            int r12 = r12.intValue()
            java.lang.Integer r8 = r8.V2()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            int r8 = r8.intValue()
            java.lang.String r8 = qb0.j.b(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r6 = r6.getQuantityString(r10, r12, r8)
            java.lang.String r8 = "getQuantityString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r0.P0(r6)
            vn1.g r6 = vn1.h.f126278d
            r0.T0(r6)
            r0.M1(r6)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r0.K1(r6)
            goto Lae
        La6:
            r0.t0(r5)
            vn1.g r6 = vn1.g.UI_400
            r0.M1(r6)
        Lae:
            if (r11 == 0) goto Lb1
            goto Lb2
        Lb1:
            r4 = r5
        Lb2:
            r0.r0(r4)
            if (r11 == 0) goto Lba
            r0.G0(r11)
        Lba:
            r0.setLayoutParams(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.i.o(android.content.Context, android.widget.LinearLayout$LayoutParams, com.pinterest.api.model.wy0, boolean, oa2.l, yl1.b, boolean):com.pinterest.ui.components.users.LegoUserRep");
    }

    public static void o0(kd1.k kVar, t2 t2Var) {
        kVar.M0 = t2Var;
    }

    public static final vn1.g o1(h1 h1Var) {
        int i13 = h1Var == null ? -1 : w.f134817f[h1Var.ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? vn1.g.BODY_100 : vn1.g.BODY_200 : vn1.g.HEADING_XL : vn1.g.BODY_100;
    }

    public static final LinearLayout p(Context context, re1.d merchantHeaderViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(merchantHeaderViewModel, "merchantHeaderViewModel");
        LegoUserRep o13 = o(context, new LinearLayout.LayoutParams(0, -2, 1.0f), merchantHeaderViewModel.f107568a, merchantHeaderViewModel.f107571d, merchantHeaderViewModel.f107569b, null, true);
        CreatorFollowButton creatorFollowButton = new CreatorFollowButton(context, rk1.f.Small, (nk1.g) null, (j0) null, 28);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        creatorFollowButton.setLayoutParams(layoutParams);
        creatorFollowButton.setVisibility(0);
        CreatorFollowButton.f(creatorFollowButton, merchantHeaderViewModel.f107568a);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.addView(o13);
        linearLayout.addView(creatorFollowButton);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    public static void p0(p pVar, i2 i2Var) {
        pVar.f22871d0 = i2Var;
    }

    public static void p1(nl1.d dVar, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        FragmentActivity E4 = dVar.E4();
        if (E4 != null) {
            E4.getWindow().clearFlags(1024);
            dl2.b.s2(E4);
            if (z13) {
                pk.a0.D(E4);
                return;
            }
            Window window = E4.getWindow();
            if (window != null) {
                Configuration configuration = E4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
                pk.a0.j1(window, configuration);
            }
        }
    }

    public static tf1.d q(int i13, tf1.a aVar, tf1.b bVar, boolean z13, int i14) {
        hf0.b deviceInfoProvider = new hf0.b();
        boolean z14 = false;
        int i15 = (i14 & 2) != 0 ? 0 : i13;
        tf1.a chromeViewModel = (i14 & 4) != 0 ? new tf1.a(z14, z14, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) : aVar;
        tf1.b pageProgression = (i14 & 8) != 0 ? qg1.e.f103828a : bVar;
        tf1.c pageTapAction = tf1.c.Gesture;
        boolean z15 = (i14 & 64) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(chromeViewModel, "chromeViewModel");
        Intrinsics.checkNotNullParameter(pageProgression, "pageProgression");
        Intrinsics.checkNotNullParameter(pageTapAction, "pageTapAction");
        return new tf1.d(hf0.b.f69002b, hf0.b.f69003c - hf0.b.f(), i15, chromeViewModel, pageProgression, pageTapAction, true, true, null, z15);
    }

    public static void q0(hc1.e eVar, nx.f0 f0Var) {
        eVar.f68713z0 = f0Var;
    }

    public static final void q1(PinterestLoadingLayout pinterestLoadingLayout) {
        Intrinsics.checkNotNullParameter(pinterestLoadingLayout, "<this>");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pinterestLoadingLayout.f44868a.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.topMargin = (int) (pinterestLoadingLayout.getResources().getDisplayMetrics().density * 1);
        if (layoutParams.width != -2 || layoutParams.height != -2) {
            throw new IllegalArgumentException("LoadingView should only have a width & height of WRAP_CONTENT");
        }
        pinterestLoadingLayout.f44868a.setLayoutParams(layoutParams);
    }

    public static final ArrayList r(p41.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f1(dVar.f98852b);
    }

    public static void r0(g0 g0Var, ip1.b bVar) {
        g0Var.W0 = bVar;
    }

    public static final void r1(i2 i2Var, f30 pin) {
        gb2.d aVar;
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        i2Var.W(pin);
        v7 G5 = pin.G5();
        String boardUid = G5 != null ? G5.getUid() : null;
        v7 G52 = pin.G5();
        String j13 = G52 != null ? G52.j1() : null;
        if (boardUid == null || j13 == null) {
            return;
        }
        ba j63 = pin.j6();
        if (j63 != null) {
            v7 u13 = j63.u();
            if (Intrinsics.d(u13 != null ? u13.getUid() : null, boardUid)) {
                j13 = j63.A();
            }
        }
        Intrinsics.f(j13);
        if (j63 != null) {
            v7 u14 = j63.u();
            if (Intrinsics.d(u14 != null ? u14.getUid() : null, boardUid)) {
                String uid = j63.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                aVar = new gb2.b(uid, boardUid);
                gb2.f fVar = gb2.f.f64747a;
                String uid2 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                gb2.f.c(new gb2.k(uid2, wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION, j13, aVar));
            }
        }
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        aVar = new gb2.a(boardUid);
        gb2.f fVar2 = gb2.f.f64747a;
        String uid22 = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid22, "getUid(...)");
        gb2.f.c(new gb2.k(uid22, wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION, j13, aVar));
    }

    public static k1 s(Context context, nx.d0 pinalytics, ao2.j0 scope, wa2.i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return new k1(context, pinalytics, f0.i0(pinFeatureConfig), scope);
    }

    public static void s0(od1.t tVar, q qVar) {
        tVar.O0 = qVar;
    }

    public static final void s1(i2 i2Var, String pinId, v7 board) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(board, "board");
        i2Var.Y(pinId, new ol0.t(9, board));
        gb2.f fVar = gb2.f.f64747a;
        wa2.a0 a0Var = wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION;
        String j13 = board.j1();
        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
        String uid = board.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        gb2.f.c(new gb2.k(pinId, a0Var, j13, new gb2.a(uid)));
    }

    public static final String t(br.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (com.pinterest.feature.search.c.f47622a[cVar.ordinal()]) {
            case 1:
            case 2:
                return "recent_query";
            case 3:
                return "trending";
            case 4:
                return "recommended";
            case 5:
            case 8:
            case 9:
                return "query";
            case 6:
                return "enriched_autocomplete";
            case 7:
            default:
                return null;
            case 10:
                return "user";
        }
    }

    public static void t0(cy0.h hVar, r rVar) {
        hVar.f53437r0 = rVar;
    }

    public static final void t1(i2 i2Var, String pinId, String userId, String profileName) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(profileName, "profileName");
        i2Var.Y(pinId, gb2.g.f64751i);
        gb2.f fVar = gb2.f.f64747a;
        gb2.f.c(new gb2.k(pinId, wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION, profileName, new gb2.c(userId)));
    }

    public static final String u(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.length > 24) {
            buffer = c0.S(buffer, ql2.s.q(0, 24));
        }
        String encodeToString = Base64.getEncoder().encodeToString(buffer);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public static void u0(hc1.e eVar, q3 q3Var) {
        eVar.A0 = q3Var;
    }

    public static final g00 u1(g00 g00Var, boolean z13) {
        o00 o00Var;
        Intrinsics.checkNotNullParameter(g00Var, "<this>");
        d00 z14 = g00Var.z();
        o00 v13 = g00Var.v();
        k00 k00Var = null;
        ArrayList arrayList = null;
        if (v13 != null) {
            l00 B = v13.B();
            B.g(Boolean.valueOf(z13));
            o00Var = B.a();
        } else {
            o00Var = null;
        }
        z14.c(o00Var);
        if (z13) {
            k00Var = g00Var.q();
        } else {
            k00 q13 = g00Var.q();
            if (q13 != null) {
                Intrinsics.checkNotNullParameter(q13, "<this>");
                List p13 = q13.p();
                int i13 = 0;
                if (p13 != null) {
                    List<g00> list = p13;
                    arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                    for (g00 g00Var2 : list) {
                        Intrinsics.f(g00Var2);
                        if (Q0(g00Var2)) {
                            g00Var2 = u1(g00Var2, false);
                        }
                        arrayList.add(g00Var2);
                    }
                }
                h00 h00Var = new h00(q13, i13);
                h00Var.f38213d = arrayList;
                boolean[] zArr = h00Var.f38224o;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
                k00Var = h00Var.a();
                Intrinsics.checkNotNullExpressionValue(k00Var, "build(...)");
            }
        }
        z14.b(k00Var);
        g00 a13 = z14.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final String v(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.d("PREF_BODY_TYPE_SELECTION", null);
    }

    public static void v0(nq1.e eVar, so.r rVar) {
        eVar.f91821j0 = rVar;
    }

    public static final void v1(GestaltAvatar gestaltAvatar, rl1.a viewModel) {
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        e0.t.g(gestaltAvatar, new ql1.k(viewModel, 2));
    }

    public static final Context w(x72.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Context context = jVar.k().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public static void w0(b31.g gVar, uk1.e eVar) {
        gVar.f21438j0 = eVar;
    }

    public static final void w1(GestaltAvatar gestaltAvatar, rl1.g viewModel) {
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        gestaltAvatar.H2(new com.pinterest.framework.screens.q(5, viewModel, gestaltAvatar));
    }

    public static m2 x() {
        return m2.f104307c;
    }

    public static void x0(cy0.h hVar, uk1.e eVar) {
        hVar.f53436q0 = eVar;
    }

    public static final NavigationImpl x1(f30 f30Var, wy0 wy0Var, r41.b aopOrigin) {
        String X3;
        Intrinsics.checkNotNullParameter(aopOrigin, "aopOrigin");
        NavigationImpl navigationImpl = null;
        if (wy0Var == null) {
            return null;
        }
        r41.k kVar = r41.k.f106176a;
        NavigationImpl a13 = r41.k.a(wy0Var);
        if (a13 != null) {
            nx.d0 a14 = sh.f.a();
            Intrinsics.checkNotNullExpressionValue(a14, "get(...)");
            f1 f1Var = f1.NAVIGATION;
            u0 u0Var = u0.ADS_ONLY_PROFILE_EXTERNAL;
            HashMap hashMap = new HashMap();
            hashMap.put("aop_origin", aopOrigin.name());
            Unit unit = Unit.f80348a;
            a14.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            return a13;
        }
        if (f30Var != null && (X3 = f30Var.X3()) != null && X3.length() > 0) {
            wy0 N = n60.o.B(f30Var, "getIsPromoted(...)") ? b40.N(f30Var) : f30Var.I5();
            if (N != null && Intrinsics.d(wy0Var.getUid(), N.getUid())) {
                ScreenLocation screenLocation = (ScreenLocation) com.pinterest.screens.j3.f51013a.getValue();
                String X32 = f30Var.X3();
                Intrinsics.f(X32);
                navigationImpl = Navigation.z0(screenLocation, X32);
            }
        }
        if (navigationImpl != null) {
            return navigationImpl;
        }
        String uid = wy0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        NavigationImpl c13 = r41.k.c(kVar, uid, aopOrigin, null, null, 28);
        if (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.TRUE)) {
            return c13;
        }
        c13.y0(f30Var.getUid(), "com.pinterest.EXTRA_PIN_ID");
        return c13;
    }

    public static final String y(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.d("PREF_HAIR_PATTERN_SELECTION", null);
    }

    public static void y0(k91.g gVar, uk1.e eVar) {
        gVar.f78830j0 = eVar;
    }

    public static GradientDrawable y1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bs1.c.A(context, d70.a.black900_50), bs1.c.A(context, eo1.b.black900_20), bs1.c.A(context, d70.a.black900_50)});
    }

    public static final String z(h20 h20Var) {
        Intrinsics.checkNotNullParameter(h20Var, "<this>");
        List C = h20Var.C();
        String str = null;
        if (C != null) {
            Iterator it = C.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f30 f30Var = (f30) it.next();
                Intrinsics.f(f30Var);
                String y03 = bs1.c.y0(f30Var);
                if (y03 != null) {
                    str = y03;
                    break;
                }
            }
        }
        return str == null ? "" : str;
    }

    public static void z0(nq1.e eVar, uk1.e eVar2) {
        eVar.f91822k0 = eVar2;
    }
}
