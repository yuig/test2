package kh2;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.results.view.StaticSearchBarView;
import com.pinterest.feature.settings.account.view.AccountConversionView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import so.n5;
import so.v3;

/* loaded from: classes4.dex */
public abstract class m0 {

    /* renamed from: a */
    public static int f79614a = 3;

    /* renamed from: b */
    public static String f79615b;

    public static final u50.i0 A(TypedArray typedArray, int i13) {
        String string = typedArray.getString(i13);
        if (string == null) {
            return null;
        }
        return ep.b.x(string, "string", string);
    }

    public static void A0(q71.a1 a1Var, lh0.j3 j3Var) {
        a1Var.f102693a1 = j3Var;
    }

    public static final String B(String... strArr) {
        String str;
        int length = strArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                str = null;
                break;
            }
            str = strArr[i13];
            if (true ^ (str == null || str.length() == 0)) {
                break;
            }
            i13++;
        }
        return str == null ? "" : str;
    }

    public static void B0(q71.a1 a1Var, x02.l2 l2Var) {
        a1Var.U0 = l2Var;
    }

    public static void C(bb1.l lVar, cr1.a aVar) {
        lVar.f22522k0 = aVar;
    }

    public static void C0(ye1.v vVar, ku1.l lVar) {
        vVar.f138900c = lVar;
    }

    public static void D(q71.a1 a1Var, vy.m mVar) {
        a1Var.X0 = mVar;
    }

    public static void D0(ow0.c cVar, k22.m mVar) {
        cVar.f97923f0 = mVar;
    }

    public static void E(yq1.z zVar, vy.m mVar) {
        zVar.f140087c0 = mVar;
    }

    public static void E0(q71.a1 a1Var, k22.m mVar) {
        a1Var.T0 = mVar;
    }

    public static void F(yq1.z zVar, lb2.q qVar) {
        zVar.f140088d0 = qVar;
    }

    public static boolean F0(MotionEvent motionEvent, int i13) {
        return (motionEvent.getSource() & i13) == i13;
    }

    public static void G(yq1.z zVar, com.pinterest.identity.authentication.a aVar) {
        zVar.f140090f0 = aVar;
    }

    public static boolean G0(int i13, String str) {
        return f79614a <= i13 || Log.isLoggable(str, i13);
    }

    public static void H(m31.e eVar, g70.h hVar) {
        eVar.f85774p0 = hVar;
    }

    public static final boolean H0(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new Date().getTime() - file.lastModified() < TimeUnit.DAYS.toMillis(1L);
    }

    public static void I(q71.a1 a1Var, g70.h hVar) {
        a1Var.f102694b1 = hVar;
    }

    public static final boolean I0(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "element.className");
                if (kotlin.text.z.p(className, "com.facebook", false)) {
                    String className2 = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                    if (!kotlin.text.z.p(className2, "com.facebook.appevents.codeless", false)) {
                        String className3 = stackTraceElement.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className3, "element.className");
                        if (!kotlin.text.z.p(className3, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    if (kotlin.text.z.p(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        if (kotlin.text.z.p(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            if (!kotlin.text.z.p(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void J(yx1.j jVar, g70.h hVar) {
        jVar.f140366p0 = hVar;
    }

    public static void J0(nl1.d dVar) {
        String simpleName = dVar != null ? dVar.getClass().getSimpleName() : null;
        if (simpleName == null) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.h("CoreFragment NULL for: " + dVar);
            return;
        }
        if (Intrinsics.d(f79615b, simpleName)) {
            return;
        }
        f79615b = simpleName;
        HashSet hashSet2 = tb0.h.f117076w;
        tb0.g.f117075a.h("CoreFragment: ".concat(simpleName));
    }

    public static void K(m31.e eVar, x02.x0 x0Var) {
        eVar.f85771m0 = x0Var;
    }

    public static void K0(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void L(yx1.j jVar, a11.d dVar) {
        jVar.f140361k0 = dVar;
    }

    public static final float L0(ww1.a aVar, double d2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i13 = kw1.f.f81044a[aVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                d2 *= 100;
            } else if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (float) d2;
    }

    public static void M(p11.l lVar, so.q1 q1Var) {
        lVar.f98659j0 = q1Var;
    }

    public static final JSONObject M0(String str) {
        File y13 = y();
        if (y13 != null && str != null) {
            try {
                return new JSONObject(df.j1.u1(new FileInputStream(new File(y13, str))));
            } catch (Exception unused) {
                q(str);
            }
        }
        return null;
    }

    public static void N(s52.n nVar, hf0.b bVar) {
        nVar.Q0 = bVar;
    }

    public static final void N0(String str, JSONArray reports, le.x xVar) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject j03 = df.j1.j0();
            if (j03 != null) {
                Iterator<String> keys = j03.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, j03.get(next));
                }
            }
            String str2 = le.a0.f83002j;
            wc.b.B(null, t3.s1.d(new Object[]{le.v.b()}, 1, "%s/instruments", "java.lang.String.format(format, *args)"), jSONObject, xVar).e();
        } catch (JSONException unused) {
        }
    }

    public static void O(w41.n0 n0Var, zf0.f fVar) {
        n0Var.L0 = fVar;
    }

    public static final void O0(ViewGroup viewGroup, float f13, boolean z13) {
        GestaltStaticSearchBar gestaltStaticSearchBar;
        View findViewById;
        if (!z13) {
            StaticSearchBarView staticSearchBarView = viewGroup instanceof StaticSearchBarView ? (StaticSearchBarView) viewGroup : null;
            if (staticSearchBarView != null) {
                LinearLayout linearLayout = staticSearchBarView.f47753a;
                if (linearLayout == null) {
                    Intrinsics.r("searchContainer");
                    throw null;
                }
                linearLayout.getBackground().setAlpha(ql2.s.g(ml2.c.c(255 * f13), 0, 255));
            }
            gestaltStaticSearchBar = viewGroup instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup : null;
            if (gestaltStaticSearchBar != null) {
                gestaltStaticSearchBar.d0(new p1.v0(12, f13));
                return;
            }
            return;
        }
        StaticSearchBarView staticSearchBarView2 = viewGroup instanceof StaticSearchBarView ? (StaticSearchBarView) viewGroup : null;
        if (staticSearchBarView2 != null) {
            LinearLayout linearLayout2 = staticSearchBarView2.f47753a;
            if (linearLayout2 == null) {
                Intrinsics.r("searchContainer");
                throw null;
            }
            Drawable background = linearLayout2.getBackground();
            Intrinsics.checkNotNullExpressionValue(background, "getBackground(...)");
            ObjectAnimator.ofPropertyValuesHolder(background, PropertyValuesHolder.ofInt("alpha", background.getAlpha(), ql2.s.g(ml2.c.c(255 * f13), 0, 255))).setDuration(500L).start();
        }
        gestaltStaticSearchBar = viewGroup instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup : null;
        if (gestaltStaticSearchBar == null || (findViewById = viewGroup.findViewById(cn1.f0.gestalt_search_field)) == null || findViewById.getBackground() == null) {
            return;
        }
        int alpha = findViewById.getBackground().getAlpha();
        Drawable background2 = findViewById.getBackground();
        Intrinsics.checkNotNullExpressionValue(background2, "getBackground(...)");
        int g13 = ql2.s.g(ml2.c.c(255 * f13), 0, 255);
        d61.g gVar = new d61.g(gestaltStaticSearchBar, findViewById, alpha, f13);
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(background2, PropertyValuesHolder.ofInt("alpha", background2.getAlpha(), g13)).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        c3.h(duration, gVar);
        duration.start();
    }

    public static void P(ow0.c cVar, rg0.s sVar) {
        cVar.f97922e0 = sVar;
    }

    public static final void P0(ye2.m mVar, ViewGroup searchBar, boolean z13, boolean z14) {
        StaticSearchBarView staticSearchBarView;
        Intrinsics.checkNotNullParameter(searchBar, "searchBar");
        if (!z13) {
            O0(searchBar, 1.0f, z14);
            return;
        }
        if (mVar == null || !pk.a0.q0(mVar)) {
            O0(searchBar, 0.8f, z14);
            staticSearchBarView = searchBar instanceof StaticSearchBarView ? (StaticSearchBarView) searchBar : null;
            if (staticSearchBarView != null) {
                staticSearchBarView.b(eo1.b.color_gray_roboflow_550);
                return;
            }
            return;
        }
        O0(searchBar, 0.6f, z14);
        staticSearchBarView = searchBar instanceof StaticSearchBarView ? (StaticSearchBarView) searchBar : null;
        if (staticSearchBarView != null) {
            staticSearchBarView.b(eo1.b.color_gray_roboflow_300);
        }
    }

    public static void Q(yx1.j jVar, rg0.s sVar) {
        jVar.f140363m0 = sVar;
    }

    public static u2.q Q0(u2.q qVar, float f13, b3.x0 x0Var, int i13) {
        boolean z13;
        if ((i13 & 4) != 0) {
            z13 = Float.compare(f13, (float) 0) > 0;
        } else {
            z13 = false;
        }
        long j13 = b3.e0.f21313a;
        return (Float.compare(f13, (float) 0) > 0 || z13) ? qVar.j(new ShadowGraphicsLayerElement(f13, x0Var, z13, j13, j13)) : qVar;
    }

    public static void R(w41.n0 n0Var, lh0.u2 u2Var) {
        n0Var.O0 = u2Var;
    }

    public static final rl1.a R0(wy0 wy0Var, yk1.v viewResources, boolean z13) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        boolean z14 = z13 && dl2.b.W1(wy0Var) && !wy0Var.O3().booleanValue();
        return new rl1.a(wy0Var.q2(), dl2.b.o1(wy0Var) ? "" : dl2.b.t0(wy0Var), dl2.b.M0(wy0Var), m2.M0(viewResources, dl2.b.A0(wy0Var), z14), z14);
    }

    public static void S(yq1.z zVar, lh0.y1 y1Var) {
        zVar.f140091g0 = y1Var;
    }

    public static final nm1.l S0(TypedArray typedArray) {
        nm1.l gVar;
        int i13 = nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsType;
        nm1.a aVar = nm1.a.EMPTY;
        int i14 = typedArray.getInt(i13, -1);
        if (i14 >= 0) {
            aVar = nm1.a.values()[i14];
        }
        int i15 = nm1.e1.f91422c[aVar.ordinal()];
        if (i15 == 1) {
            return nm1.f.f91423a;
        }
        if (i15 == 2) {
            gVar = new nm1.g(new nm1.n(A(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsIconContentDescription), rm1.r.a(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsIcon, GestaltHeaderBar.f49373f)));
        } else if (i15 == 3) {
            int i16 = nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsStartIcon;
            rm1.q qVar = GestaltHeaderBar.f49373f;
            gVar = new nm1.e(new nm1.n(A(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsStartIconContentDescription), rm1.r.a(typedArray, i16, qVar)), new nm1.n(A(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsEndIconContentDescription), rm1.r.a(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsEndIcon, qVar)));
        } else {
            if (i15 != 4) {
                if (i15 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                int i17 = typedArray.getInt(nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsAvatarColorIndex, -1);
                if (i17 > -1) {
                    String string = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsAvatarName);
                    if (string == null) {
                        string = "";
                    }
                    String string2 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsAvatarImageURL);
                    return new nm1.i(i17, string2 != null ? string2 : "", string);
                }
                String string3 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsAvatarUserID);
                if (string3 == null) {
                    string3 = "0";
                }
                String string4 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsAvatarName);
                if (string4 == null) {
                    string4 = "";
                }
                String string5 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsAvatarImageURL);
                return new nm1.j(string3, string5 != null ? string5 : "", string4);
            }
            String string6 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarEndActionsTextButtonText);
            gVar = new nm1.h(string6 != null ? bs1.c.p2(string6) : GestaltHeaderBar.f49374g);
        }
        return gVar;
    }

    public static void T(yq1.z zVar, il1.a aVar) {
        zVar.f140089e0 = aVar;
    }

    public static final nm1.l T0(TypedArray typedArray) {
        nm1.l gVar;
        int i13 = nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsType;
        nm1.a aVar = nm1.a.EMPTY;
        int i14 = typedArray.getInt(i13, -1);
        if (i14 >= 0) {
            aVar = nm1.a.values()[i14];
        }
        int i15 = nm1.e1.f91422c[aVar.ordinal()];
        if (i15 == 1) {
            return nm1.f.f91423a;
        }
        if (i15 == 2) {
            gVar = new nm1.g(new nm1.n(A(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsIconContentDescription), rm1.r.a(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsIcon, GestaltHeaderBar.f49373f)));
        } else if (i15 == 3) {
            int i16 = nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsStartIcon;
            rm1.q qVar = GestaltHeaderBar.f49373f;
            gVar = new nm1.e(new nm1.n(A(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsStartIconContentDescription), rm1.r.a(typedArray, i16, qVar)), new nm1.n(A(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsEndIconContentDescription), rm1.r.a(typedArray, nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsEndIcon, qVar)));
        } else {
            if (i15 != 4) {
                if (i15 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                int i17 = typedArray.getInt(nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsAvatarColorIndex, -1);
                if (i17 > -1) {
                    String string = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsAvatarName);
                    if (string == null) {
                        string = "";
                    }
                    String string2 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsAvatarImageURL);
                    return new nm1.i(i17, string2 != null ? string2 : "", string);
                }
                String string3 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsAvatarUserID);
                if (string3 == null) {
                    string3 = "0";
                }
                String string4 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsAvatarName);
                if (string4 == null) {
                    string4 = "";
                }
                String string5 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsAvatarImageURL);
                return new nm1.j(string3, string5 != null ? string5 : "", string4);
            }
            String string6 = typedArray.getString(nm1.i1.GestaltHeaderBar_gestalt_headerBarStartActionsTextButtonText);
            gVar = new nm1.h(string6 != null ? bs1.c.p2(string6) : GestaltHeaderBar.f49374g);
        }
        return gVar;
    }

    public static void U(w41.n0 n0Var, n5 n5Var) {
        n0Var.M0 = n5Var;
    }

    public static final void U0(GestaltAvatar gestaltAvatar, bp1.g userTuple) {
        boolean W1;
        String A0;
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
        Intrinsics.checkNotNullParameter(userTuple, "userTuple");
        Intrinsics.checkNotNullParameter(userTuple, "<this>");
        bp1.c cVar = userTuple.f23662a;
        if (cVar instanceof bp1.d) {
            W1 = f0.h.e0(((bp1.d) cVar).f23653b);
        } else {
            if (!(cVar instanceof bp1.e)) {
                throw new NoWhenBranchMatchedException();
            }
            W1 = dl2.b.W1(((bp1.e) cVar).f23654b);
        }
        boolean z13 = W1 || userTuple.f23663b;
        yk1.a aVar = new yk1.a(gestaltAvatar.getResources(), gestaltAvatar.getContext().getTheme());
        Intrinsics.checkNotNullParameter(userTuple, "<this>");
        if (cVar instanceof bp1.d) {
            z40.d0 d0Var = ((bp1.d) cVar).f23653b;
            Intrinsics.checkNotNullParameter(d0Var, "<this>");
            A0 = d0Var.f();
            String l13 = d0Var.l();
            String p13 = d0Var.p();
            String g13 = d0Var.g();
            if (A0 == null || kotlin.text.z.j(A0)) {
                A0 = (l13 == null || kotlin.text.z.j(l13)) ? (p13 == null || kotlin.text.z.j(p13)) ? (g13 == null || kotlin.text.z.j(g13)) ? "" : g13 : p13 : l13;
            }
        } else {
            if (!(cVar instanceof bp1.e)) {
                throw new NoWhenBranchMatchedException();
            }
            A0 = dl2.b.A0(((bp1.e) cVar).f23654b);
        }
        gestaltAvatar.H2(new fn1.k(userTuple, ia2.a.f72008a, m2.M0(aVar, A0, z13), 16));
    }

    public static void V(s52.n nVar) {
        nVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void V0(GestaltAvatar gestaltAvatar, wy0 user) {
        bp1.g gVar;
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(user, "user");
        if (user instanceof z40.d0) {
            gVar = new bp1.g(new bp1.d((z40.d0) user));
        } else {
            if (!(user instanceof wy0)) {
                throw new IllegalArgumentException("User type not allowed " + user);
            }
            gVar = new bp1.g(new bp1.e(user));
        }
        U0(gestaltAvatar, gVar);
    }

    public static void W(w41.n0 n0Var, qb0.a aVar) {
        n0Var.N0 = aVar;
    }

    public static final boolean W0(Function0 block, String str) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            boolean booleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static void X(yq1.z zVar, so.e0 e0Var) {
        zVar.f140092h0 = e0Var;
    }

    public static void X0(String str, String str2) {
        if (G0(5, str)) {
            Log.w(str, str2);
        }
    }

    public static void Y(m31.e eVar, nx.b0 b0Var) {
        eVar.f85773o0 = b0Var;
    }

    public static void Y0(String str, String str2, Throwable th3) {
        if (G0(5, str)) {
            Log.w(str, str2, th3);
        }
    }

    public static void Z(p11.l lVar, so.r1 r1Var) {
        lVar.f98661l0 = r1Var;
    }

    public static final void Z0(String str, String str2) {
        File y13 = y();
        if (y13 == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(y13, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 ??, still in use, count: 1, list:
          (r1v5 ?? I:java.lang.Object) from 0x0174: INVOKE (r0v1 ?? I:i2.s), (r1v5 ?? I:java.lang.Object) VIRTUAL call: i2.s.g0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 ??, still in use, count: 1, list:
          (r1v5 ?? I:java.lang.Object) from 0x0174: INVOKE (r0v1 ?? I:i2.s), (r1v5 ?? I:java.lang.Object) VIRTUAL call: i2.s.g0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:310)
        */

    public static void a0(m31.e eVar, x02.i2 i2Var) {
        eVar.f85769k0 = i2Var;
    }

    public static Object a1(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(a.a.p(a.a.w("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    public static final void b(ba.n nVar, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(294589392);
        if ((((i13 & 14) == 0 ? (sVar.h(nVar) ? 4 : 2) | i13 : i13) & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            r2.i X = n.X(sVar);
            i2.q1 z13 = bs1.c.z(nVar.b().f141227e, sVar);
            Object obj = (Collection) ((List) z13.getValue());
            sVar.X(467378629);
            boolean booleanValue = ((Boolean) sVar.m(t3.v2.f116235a)).booleanValue();
            sVar.X(1157296644);
            boolean h10 = sVar.h(obj);
            Object J2 = sVar.J();
            Object obj2 = i2.n.f71185a;
            Object obj3 = J2;
            if (h10 || J2 == obj2) {
                s2.t tVar = new s2.t();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    z9.k kVar = (z9.k) obj4;
                    if (booleanValue || kVar.f141217h.f18588d.isAtLeast(androidx.lifecycle.r.STARTED)) {
                        arrayList.add(obj4);
                    }
                }
                tVar.addAll(arrayList);
                sVar.g0(tVar);
                obj3 = tVar;
            }
            boolean z14 = false;
            sVar.r(false);
            s2.t tVar2 = (s2.t) obj3;
            sVar.r(false);
            c(tVar2, (List) z13.getValue(), sVar, 64);
            i2.q1 z15 = bs1.c.z(nVar.b().f141228f, sVar);
            sVar.X(-492369756);
            Object J3 = sVar.J();
            if (J3 == obj2) {
                J3 = new s2.t();
                sVar.g0(J3);
            }
            sVar.r(false);
            s2.t tVar3 = (s2.t) J3;
            sVar.X(875188318);
            ListIterator listIterator = tVar2.listIterator();
            while (true) {
                s2.y yVar = (s2.y) listIterator;
                if (!yVar.hasNext()) {
                    break;
                }
                z9.k kVar2 = (z9.k) yVar.next();
                z9.z zVar = kVar2.f141211b;
                Intrinsics.g(zVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                ba.m mVar = (ba.m) zVar;
                a(new k1.v0(18, nVar, kVar2), mVar.f22282k, q2.i.b(sVar, 1129586364, new ba.j(kVar2, X, tVar3, nVar, mVar, 0)), sVar, 384, 0);
                X = X;
                z14 = false;
            }
            sVar.r(z14);
            Set set = (Set) z15.getValue();
            sVar.X(1618982084);
            boolean h13 = sVar.h(z15) | sVar.h(nVar) | sVar.h(tVar3);
            Object J4 = sVar.J();
            if (h13 || J4 == obj2) {
                J4 = new ba.k(z15, nVar, tVar3, null);
                sVar.g0(J4);
            }
            sVar.r(false);
            i2.u.d(set, tVar3, (Function2) J4, sVar);
        }
        i2.f2 t13 = sVar.t();
        if (t13 == null) {
            return;
        }
        t13.f71113d = new j1.t0(nVar, i13, 8);
    }

    public static void b0(q71.a1 a1Var, x02.i2 i2Var) {
        a1Var.V0 = i2Var;
    }

    public static void b1(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static final void c(List list, Collection collection, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1537894851);
        boolean booleanValue = ((Boolean) sVar.m(t3.v2.f116235a)).booleanValue();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z9.k kVar = (z9.k) it.next();
            i2.u.b(kVar.f141217h, new s1.w(kVar, booleanValue, list, 2), sVar);
        }
        i2.f2 t13 = sVar.t();
        if (t13 == null) {
            return;
        }
        t13.f71113d = new k1.z(list, collection, i13, 8);
    }

    public static void c0(q71.a1 a1Var, ip1.b bVar) {
        a1Var.Y0 = bVar;
    }

    public static byte[] d(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 * 2;
            int digit = Character.digit(str.charAt(i14), 16);
            int digit2 = Character.digit(str.charAt(i14 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i13] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static void d0(ow0.c cVar, lb0.q qVar) {
        cVar.f97925h0 = qVar;
    }

    public static final void e(u2.q qVar, Function2 function2, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1177876616);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            q4.f fVar = q4.f.f102323b;
            int i17 = ((i15 << 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | ((i15 >> 3) & 14) | 384;
            int i18 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            int i19 = ((i17 << 6) & 896) | 6;
            if (!(sVar.f71265a instanceof i2.f)) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, fVar, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
                ep.b.y(i18, sVar, i18, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            function2.invoke(sVar, Integer.valueOf((i19 >> 6) & 14));
            sVar.r(true);
        }
        u2.q qVar2 = qVar;
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b2.n0(qVar2, function2, i13, i14, 2);
        }
    }

    public static void e0(yx1.j jVar, so.h1 h1Var) {
        jVar.f140360j0 = h1Var;
    }

    public static final r72.j0 f(r72.j0 j0Var, Map settings) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (settings.isEmpty()) {
            return j0Var;
        }
        PointF pointF = null;
        PointF pointF2 = null;
        if (j0Var instanceof r72.g) {
            r72.g gVar = (r72.g) j0Var;
            if (gVar instanceof r72.b) {
                r72.b bVar = (r72.b) gVar;
                Float w13 = w("opacity", settings);
                float floatValue = w13 != null ? w13.floatValue() : bVar.f106440b;
                bVar.getClass();
                return new r72.b(floatValue);
            }
            if (!(gVar instanceof r72.c)) {
                return gVar;
            }
            r72.w0 w0Var = (r72.w0) settings.get("direction");
            r72.s0 s0Var = w0Var instanceof r72.t0 ? ((r72.t0) w0Var).f106659b : null;
            r72.c cVar = (r72.c) gVar;
            float f18 = s0Var != null ? s0Var.f106645a : cVar.f106446b;
            float f19 = s0Var != null ? s0Var.f106646b : cVar.f106447c;
            float f23 = s0Var != null ? s0Var.f106647c : cVar.f106448d;
            float f24 = s0Var != null ? s0Var.f106648d : cVar.f106449e;
            cVar.getClass();
            return new r72.c(f18, f19, f23, f24);
        }
        if (!(j0Var instanceof r72.i0)) {
            if (j0Var instanceof r72.n) {
                r72.n nVar = (r72.n) j0Var;
                if (nVar instanceof r72.l) {
                    r72.u0 z13 = z("direction", settings);
                    PointF pointF3 = z13 != null ? new PointF(z13.f106666a + 0.5f, z13.f106667b + 0.5f) : null;
                    r72.l lVar = (r72.l) nVar;
                    Float w14 = w("opacity", settings);
                    float floatValue2 = w14 != null ? w14.floatValue() : lVar.f106528b;
                    Float w15 = w("radius", settings);
                    return new r72.l(floatValue2, w15 != null ? w15.floatValue() : lVar.f106529c, pointF3 != null ? pointF3.x : lVar.f106530d, pointF3 != null ? pointF3.y : lVar.f106531e, lVar.f106532f);
                }
                if (!(nVar instanceof r72.j)) {
                    return nVar;
                }
                r72.j jVar = (r72.j) nVar;
                Float w16 = w("radius", settings);
                if (w16 != null) {
                    Set set = y72.b.f138018a;
                    f13 = (((w16.floatValue() - 0.01f) / 0.29000002f) * 5.8f) + 0.2f;
                } else {
                    f13 = jVar.f106500b;
                }
                r72.w0 w0Var2 = (r72.w0) settings.get("color");
                Integer valueOf = w0Var2 instanceof r72.n0 ? Integer.valueOf(((r72.n0) w0Var2).f106579b) : null;
                return new r72.j(f13, valueOf != null ? valueOf.intValue() : jVar.f106501c, jVar.f106502d);
            }
            if (!(j0Var instanceof r72.s)) {
                throw new NoWhenBranchMatchedException();
            }
            r72.s sVar = (r72.s) j0Var;
            if (!(sVar instanceof r72.o)) {
                return sVar;
            }
            r72.o oVar = (r72.o) sVar;
            Float w17 = w("strength", settings);
            float floatValue3 = w17 != null ? w17.floatValue() : oVar.f106584c;
            Float w18 = w("exposure", settings);
            float floatValue4 = w18 != null ? w18.floatValue() : oVar.f106585d;
            Float w19 = w("contrast", settings);
            float floatValue5 = w19 != null ? w19.floatValue() : oVar.f106586e;
            Float w23 = w("saturation", settings);
            float floatValue6 = w23 != null ? w23.floatValue() : oVar.f106587f;
            Float w24 = w("hue", settings);
            float floatValue7 = w24 != null ? w24.floatValue() : oVar.f106588g;
            Float w25 = w("temperature", settings);
            float floatValue8 = w25 != null ? w25.floatValue() : oVar.f106589h;
            Float w26 = w("tint", settings);
            float floatValue9 = w26 != null ? w26.floatValue() : oVar.f106590i;
            Boolean v13 = v("invert", settings);
            boolean booleanValue = v13 != null ? v13.booleanValue() : oVar.f106591j;
            Float w27 = w("shadows", settings);
            float floatValue10 = w27 != null ? w27.floatValue() : oVar.f106592k;
            Float w28 = w("highlights", settings);
            float floatValue11 = w28 != null ? w28.floatValue() : oVar.f106593l;
            String type = oVar.f106583b;
            Intrinsics.checkNotNullParameter(type, "type");
            return new r72.o(type, floatValue3, floatValue4, floatValue5, floatValue6, floatValue7, floatValue8, floatValue9, booleanValue, floatValue10, floatValue11);
        }
        r72.i0 i0Var = (r72.i0) j0Var;
        if (i0Var instanceof r72.h0) {
            r72.u0 point = z("pivot", settings);
            if (point != null) {
                Set set2 = y72.b.f138018a;
                Intrinsics.checkNotNullParameter(point, "point");
                float f25 = 1;
                float f26 = 2;
                pointF = new PointF((point.f106666a + f25) / f26, (point.f106667b + f25) / f26);
            }
            r72.h0 h0Var = (r72.h0) i0Var;
            Float w29 = w("speed", settings);
            float floatValue12 = w29 != null ? w29.floatValue() : h0Var.f106491b;
            if (w("angle", settings) != null) {
                Set set3 = y72.b.f138018a;
                f17 = (float) (((r1.floatValue() * 3.141592653589793d) / 2) / RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
            } else {
                f17 = h0Var.f106492c;
            }
            float f27 = pointF != null ? pointF.x : h0Var.f106493d;
            float f28 = pointF != null ? pointF.y : h0Var.f106494e;
            h0Var.getClass();
            return new r72.h0(floatValue12, f17, f27, f28);
        }
        if (i0Var instanceof r72.g0) {
            r72.g0 g0Var = (r72.g0) i0Var;
            Float w33 = w("speed", settings);
            float floatValue13 = w33 != null ? w33.floatValue() : g0Var.f106478b;
            g0Var.getClass();
            return new r72.g0(floatValue13);
        }
        if (i0Var instanceof r72.x) {
            r72.x xVar = (r72.x) i0Var;
            Float w34 = w("speed", settings);
            float floatValue14 = w34 != null ? w34.floatValue() : xVar.f106702b;
            xVar.getClass();
            return new r72.x(floatValue14);
        }
        if (i0Var instanceof r72.c0) {
            r72.c0 c0Var = (r72.c0) i0Var;
            Float w35 = w("speed", settings);
            float floatValue15 = w35 != null ? w35.floatValue() : c0Var.f106450b;
            c0Var.getClass();
            return new r72.c0(floatValue15);
        }
        if (i0Var instanceof r72.d0) {
            r72.d0 d0Var = (r72.d0) i0Var;
            Float w36 = w("speed", settings);
            float floatValue16 = w36 != null ? w36.floatValue() : d0Var.f106454b;
            Boolean v14 = v("horizontal", settings);
            boolean booleanValue2 = v14 != null ? v14.booleanValue() : d0Var.f106455c;
            d0Var.getClass();
            return new r72.d0(floatValue16, booleanValue2);
        }
        if (i0Var instanceof r72.b0) {
            r72.b0 b0Var = (r72.b0) i0Var;
            Float w37 = w("speed", settings);
            float floatValue17 = w37 != null ? w37.floatValue() : b0Var.f106441b;
            b0Var.getClass();
            return new r72.b0(floatValue17);
        }
        if (i0Var instanceof r72.f0) {
            r72.f0 f0Var = (r72.f0) i0Var;
            Float w38 = w("speed", settings);
            float floatValue18 = w38 != null ? w38.floatValue() : f0Var.f106467b;
            f0Var.getClass();
            return new r72.f0(floatValue18);
        }
        if (i0Var instanceof r72.a0) {
            r72.a0 a0Var = (r72.a0) i0Var;
            Float w39 = w("speed", settings);
            float floatValue19 = w39 != null ? w39.floatValue() : a0Var.f106433b;
            Boolean v15 = v("clockwise", settings);
            boolean booleanValue3 = v15 != null ? v15.booleanValue() : a0Var.f106434c;
            a0Var.getClass();
            return new r72.a0(floatValue19, booleanValue3);
        }
        if (i0Var instanceof r72.e0) {
            r72.e0 e0Var = (r72.e0) i0Var;
            Float w43 = w("speed", settings);
            float floatValue20 = w43 != null ? w43.floatValue() : e0Var.f106462b;
            e0Var.getClass();
            return new r72.e0(floatValue20);
        }
        if (i0Var instanceof r72.w) {
            r72.w wVar = (r72.w) i0Var;
            Float w44 = w("speed", settings);
            float floatValue21 = w44 != null ? w44.floatValue() : wVar.f106700b;
            wVar.getClass();
            return new r72.w(floatValue21);
        }
        if (i0Var instanceof r72.t) {
            r72.u0 point2 = z("direction", settings);
            if (point2 != null) {
                Set set4 = y72.b.f138018a;
                Intrinsics.checkNotNullParameter(point2, "point");
                float f29 = 1;
                float f33 = 2;
                pointF2 = new PointF((point2.f106666a + f29) / f33, (point2.f106667b + f29) / f33);
            }
            r72.t tVar = (r72.t) i0Var;
            Float w45 = w("speed", settings);
            float floatValue22 = w45 != null ? w45.floatValue() : tVar.f106651b;
            Float w46 = w("scale", settings);
            float floatValue23 = w46 != null ? w46.floatValue() : tVar.f106652c;
            float f34 = pointF2 != null ? pointF2.x : tVar.f106653d;
            float f35 = pointF2 != null ? pointF2.y : tVar.f106654e;
            Float w47 = w("hSpacing", settings);
            if (w47 != null) {
                Set set5 = y72.b.f138018a;
                f15 = w47.floatValue() / 2;
            } else {
                f15 = tVar.f106655f;
            }
            float f36 = f15;
            Float w48 = w("vSpacing", settings);
            if (w48 != null) {
                Set set6 = y72.b.f138018a;
                f16 = w48.floatValue() / 2;
            } else {
                f16 = tVar.f106656g;
            }
            float f37 = f16;
            Boolean v16 = v("mirror", settings);
            boolean booleanValue4 = v16 != null ? v16.booleanValue() : tVar.f106657h;
            tVar.getClass();
            return new r72.t(floatValue22, floatValue23, f34, f35, f36, f37, booleanValue4);
        }
        if (!(i0Var instanceof r72.y)) {
            if (!(i0Var instanceof r72.v)) {
                if (Intrinsics.d(i0Var, r72.u.f106665b) || Intrinsics.d(i0Var, r72.z.f106727b)) {
                    return i0Var;
                }
                throw new NoWhenBranchMatchedException();
            }
            r72.u0 z14 = z("center", settings);
            r72.v vVar = (r72.v) i0Var;
            Float w49 = w("speed", settings);
            float floatValue24 = w49 != null ? w49.floatValue() : vVar.f106688b;
            Float w53 = w("strength", settings);
            float floatValue25 = w53 != null ? w53.floatValue() : vVar.f106689c;
            float f38 = z14 != null ? z14.f106666a : vVar.f106690d;
            float f39 = z14 != null ? z14.f106667b : vVar.f106691e;
            Boolean v17 = v("inverted", settings);
            boolean booleanValue5 = v17 != null ? v17.booleanValue() : vVar.f106692f;
            Boolean v18 = v("radial", settings);
            boolean booleanValue6 = v18 != null ? v18.booleanValue() : vVar.f106693g;
            vVar.getClass();
            return new r72.v(floatValue24, floatValue25, f38, f39, booleanValue5, booleanValue6);
        }
        r72.y yVar = (r72.y) i0Var;
        Float w54 = w("speed", settings);
        float floatValue26 = w54 != null ? w54.floatValue() : yVar.f106709b;
        Boolean v19 = v("animateColor", settings);
        boolean booleanValue7 = v19 != null ? v19.booleanValue() : yVar.f106710c;
        Float w55 = w("intensity", settings);
        float floatValue27 = w55 != null ? w55.floatValue() : yVar.f106711d;
        Float w56 = w("lineWidth", settings);
        float floatValue28 = w56 != null ? w56.floatValue() : yVar.f106711d;
        Float w57 = w("colorDistortion", settings);
        if (w57 != null) {
            Set set7 = y72.b.f138018a;
            float floatValue29 = w57.floatValue();
            x72.b bVar2 = x72.b.f134124d;
            if (bVar2 == null) {
                Intrinsics.r("current");
                throw null;
            }
            Intrinsics.checkNotNullParameter(bVar2, "<this>");
            if (bVar2.f134125a != x72.e.LEGACY) {
                floatValue29 = 0.5f - floatValue29;
            }
            f14 = floatValue29;
        } else {
            f14 = yVar.f106713f;
        }
        Float w58 = w("melt", settings);
        float floatValue30 = w58 != null ? w58.floatValue() : yVar.f106714g;
        yVar.getClass();
        return new r72.y(floatValue26, booleanValue7, floatValue27, floatValue28, f14, floatValue30);
    }

    public static void f0(bb1.l lVar, uk1.e eVar) {
        lVar.f22521j0 = eVar;
    }

    public static final void g(GestaltPreviewTextView gestaltPreviewTextView, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltPreviewTextView, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        un1.m mVar = new un1.m(gestaltPreviewTextView.k());
        init.invoke(mVar);
        gestaltPreviewTextView.i(new an1.i(mVar, 15));
    }

    public static void g0(m31.e eVar, uk1.e eVar2) {
        eVar.f85768j0 = eVar2;
    }

    public static final CursorAnchorInfo h(CursorAnchorInfo.Builder builder, h4.f0 f0Var, h4.y yVar, b4.m0 m0Var, Matrix matrix, a3.d dVar, a3.d dVar2, boolean z13, boolean z14, boolean z15, boolean z16) {
        builder.reset();
        builder.setMatrix(matrix);
        long j13 = f0Var.f67560b;
        int e13 = b4.p0.e(j13);
        builder.setSelectionRange(e13, b4.p0.d(j13));
        if (z13 && e13 >= 0) {
            int b13 = yVar.b(e13);
            a3.d c13 = m0Var.c(b13);
            float f13 = ql2.s.f(c13.f484a, 0.0f, (int) (m0Var.f21617c >> 32));
            boolean l13 = l(dVar, f13, c13.f485b);
            boolean l14 = l(dVar, f13, c13.f487d);
            boolean z17 = m0Var.a(b13) == m4.h.Rtl;
            int i13 = (l13 || l14) ? 1 : 0;
            if (!l13 || !l14) {
                i13 |= 2;
            }
            if (z17) {
                i13 |= 4;
            }
            float f14 = c13.f485b;
            float f15 = c13.f487d;
            builder.setInsertionMarkerLocation(f13, f14, f15, f15, i13);
        }
        if (z14) {
            b4.p0 p0Var = f0Var.f67561c;
            int e14 = p0Var != null ? b4.p0.e(p0Var.f21641a) : -1;
            int d2 = p0Var != null ? b4.p0.d(p0Var.f21641a) : -1;
            if (e14 >= 0 && e14 < d2) {
                builder.setComposingText(e14, f0Var.f67559a.f21571a.subSequence(e14, d2));
                int b14 = yVar.b(e14);
                int b15 = yVar.b(d2);
                float[] fArr = new float[(b15 - b14) * 4];
                m0Var.f21616b.a(b7.c.h(b14, b15), fArr);
                for (int i14 = e14; i14 < d2; i14++) {
                    int b16 = yVar.b(i14);
                    int i15 = (b16 - b14) * 4;
                    float f16 = fArr[i15];
                    float f17 = fArr[i15 + 1];
                    float f18 = fArr[i15 + 2];
                    float f19 = fArr[i15 + 3];
                    int i16 = (dVar.f486c <= f16 || f18 <= dVar.f484a || dVar.f487d <= f17 || f19 <= dVar.f485b) ? 0 : 1;
                    if (!l(dVar, f16, f17) || !l(dVar, f18, f19)) {
                        i16 |= 2;
                    }
                    builder.addCharacterBounds(i14, f16, f17, f18, f19, m0Var.a(b16) == m4.h.Rtl ? i16 | 4 : i16);
                }
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 33 && z15) {
            h4.b.a(builder, dVar2);
        }
        if (i17 >= 34 && z16) {
            h4.c.a(builder, m0Var, dVar);
        }
        return builder.build();
    }

    public static void h0(p11.l lVar, uk1.e eVar) {
        lVar.f98660k0 = eVar;
    }

    public static IntStream i(Spannable spannable) {
        return spannable.chars();
    }

    public static void i0(pc1.d dVar, uk1.e eVar) {
        dVar.f99622z0 = eVar;
    }

    public static final void j(Context context, HashSet imagesToKeep) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagesToKeep, "imagesToKeep");
        File[] listFiles = context.getDir("story_pin_adjusted_images", 0).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!imagesToKeep.contains(file.getPath()) && !H0(file)) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (kotlin.text.z.p(name, "sp_image_adjusted_", false)) {
                        file.delete();
                    }
                }
            }
        }
    }

    public static void j0(q01.p pVar, uk1.e eVar) {
        pVar.f101829z0 = eVar;
    }

    public static IntStream k(Spannable spannable) {
        return spannable.codePoints();
    }

    public static void k0(q71.a1 a1Var, uk1.e eVar) {
        a1Var.W0 = eVar;
    }

    public static final boolean l(a3.d dVar, float f13, float f14) {
        return f13 <= dVar.f486c && dVar.f484a <= f13 && f14 <= dVar.f487d && dVar.f485b <= f14;
    }

    public static void l0(yx1.j jVar, uk1.e eVar) {
        jVar.f140362l0 = eVar;
    }

    public static final GestaltAvatar m(Context context, rl1.r size, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(size, "size");
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context, (AttributeSet) null);
        gestaltAvatar.H2(new qf1.f0(z13, size, 14));
        return gestaltAvatar;
    }

    public static void m0(yx1.j jVar, gw1.f fVar) {
        jVar.f140365o0 = fVar;
    }

    public static final ViewGroup n(fo1.a toolbar, Context context, lh0.f3 searchLibraryExperiments, Function0 onVoiceSearchIconViewed, RecyclerView recyclerView, gm1.a gestaltStaticSearchBarEventHandler, com.pinterest.feature.search.results.view.n0 searchBarListener) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchLibraryExperiments, "searchLibraryExperiments");
        Intrinsics.checkNotNullParameter(onVoiceSearchIconViewed, "onVoiceSearchIconViewed");
        Intrinsics.checkNotNullParameter(gestaltStaticSearchBarEventHandler, "gestaltStaticSearchBarEventHandler");
        Intrinsics.checkNotNullParameter(searchBarListener, "searchBarListener");
        Resources resources = context.getResources();
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.setLayoutParams(new FrameLayout.LayoutParams(-1, resources.getDimensionPixelSize(m60.r0.search_toolbar_height)));
        gestaltToolbarImpl.H();
        gestaltToolbarImpl.C();
        byte b13 = 0;
        gestaltToolbarImpl.setBackground(null);
        if (dl2.b.T1(context)) {
            GestaltStaticSearchBar gestaltStaticSearchBar = new GestaltStaticSearchBar(6, context, (AttributeSet) (b13 == true ? 1 : 0));
            gestaltToolbarImpl.d(gestaltStaticSearchBar);
            ViewGroup.LayoutParams layoutParams = gestaltStaticSearchBar.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                int dimensionPixelOffset = resources.getDimensionPixelOffset(m60.r0.margin_half);
                int dimensionPixelOffset2 = resources.getDimensionPixelOffset(eo1.c.sema_space_150);
                layoutParams2.topMargin = dimensionPixelOffset2;
                layoutParams2.bottomMargin = dimensionPixelOffset2;
                layoutParams2.setMarginStart(dimensionPixelOffset);
                layoutParams2.setMarginEnd(dimensionPixelOffset);
            }
            oe.f.n(gestaltStaticSearchBar, new rx0.f(searchLibraryExperiments, context, onVoiceSearchIconViewed, 13));
            if (gestaltStaticSearchBar.f49532f != null) {
                q5.v0.o(gestaltStaticSearchBar, new d61.f(recyclerView, 0));
            }
            gestaltStaticSearchBar.k0(gestaltStaticSearchBarEventHandler);
            return gestaltStaticSearchBar;
        }
        StaticSearchBarView staticSearchBarView = new StaticSearchBarView(context);
        gestaltToolbarImpl.d(staticSearchBarView);
        ViewGroup.LayoutParams layoutParams3 = staticSearchBarView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(eo1.c.sema_space_200);
            layoutParams4.bottomMargin = dimensionPixelOffset3;
            layoutParams4.setMarginStart(dimensionPixelOffset3);
            layoutParams4.setMarginEnd(dimensionPixelOffset3);
        }
        int i13 = i42.c.search_view_hint;
        GestaltText gestaltText = staticSearchBarView.f47755c;
        if (gestaltText == null) {
            Intrinsics.r("searchTextView");
            throw null;
        }
        gestaltText.i(new zx0.d(i13, 14));
        ImageView imageView = staticSearchBarView.f47756d;
        if (imageView == null) {
            Intrinsics.r("lensIcon");
            throw null;
        }
        int i14 = 1;
        bs1.c.R1(imageView, true);
        ImageView imageView2 = staticSearchBarView.f47754b;
        if (imageView2 == null) {
            Intrinsics.r("searchIcon");
            throw null;
        }
        bs1.c.R1(imageView2, true);
        ImageView imageView3 = staticSearchBarView.f47754b;
        if (imageView3 == null) {
            Intrinsics.r("searchIcon");
            throw null;
        }
        boolean z13 = !bs1.c.o1(imageView3);
        GestaltText gestaltText2 = staticSearchBarView.f47755c;
        if (gestaltText2 == null) {
            Intrinsics.r("searchTextView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams5 = gestaltText2.getLayoutParams();
        Intrinsics.g(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        com.bumptech.glide.c.b1((ViewGroup.MarginLayoutParams) layoutParams5, staticSearchBarView.getResources().getDimensionPixelOffset(z13 ? eo1.c.space_300 : eo1.c.space_200), 0, 0, 0, 14);
        ImageView imageView4 = staticSearchBarView.f47756d;
        if (imageView4 == null) {
            Intrinsics.r("lensIcon");
            throw null;
        }
        q5.v0.o(imageView4, new d61.f(recyclerView, i14));
        staticSearchBarView.f47758f = searchBarListener;
        return staticSearchBarView;
    }

    public static void n0(yx1.j jVar, gw1.f fVar) {
        jVar.f140364n0 = fVar;
    }

    public static ViewGroup o(fo1.a aVar, Context context, lh0.f3 f3Var, RecyclerView recyclerView, rq.n3 n3Var) {
        return n(aVar, context, f3Var, ns.q.f91953i, recyclerView, n3Var, new gi2.b());
    }

    public static void o0(m31.e eVar, com.pinterest.feature.pin.r rVar) {
        eVar.f85772n0 = rVar;
    }

    public static void p(String str, String str2) {
        if (G0(3, str)) {
            Log.d(str, str2);
        }
    }

    public static void p0(w41.n0 n0Var, lh0.f3 f3Var) {
        n0Var.P0 = f3Var;
    }

    public static final void q(String str) {
        File y13 = y();
        if (y13 == null || str == null) {
            return;
        }
        new File(y13, str).delete();
    }

    public static void q0(q71.a1 a1Var, j22.b bVar) {
        a1Var.S0 = bVar;
    }

    public static boolean r(Method method, rl2.d clazz) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Class clazz2 = lb.l0.t0(clazz);
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz2, "clazz");
        return method.getReturnType().equals(clazz2);
    }

    public static void r0(pc1.d dVar, x10.d dVar2) {
        dVar.A0 = dVar2;
    }

    public static void s(String str, String str2) {
        if (G0(6, str)) {
            Log.e(str, str2);
        }
    }

    public static void s0(pc1.d dVar, lh0.m3 m3Var) {
        dVar.G0 = m3Var;
    }

    public static void t(String str, String str2, Throwable th3) {
        if (G0(6, str)) {
            Log.e(str, str2, th3);
        }
    }

    public static void t0(wd1.b bVar, v3 v3Var) {
        bVar.f129231h1 = v3Var;
    }

    public static final boolean u(int i13, int i14) {
        return i13 == i14;
    }

    public static void u0(ny0.v vVar, androidx.recyclerview.widget.n3 n3Var) {
        vVar.L0 = n3Var;
    }

    public static final Boolean v(String str, Map map) {
        r72.w0 w0Var = (r72.w0) map.get(str);
        if (w0Var instanceof r72.m0) {
            return Boolean.valueOf(((r72.m0) w0Var).f106549b);
        }
        return null;
    }

    public static void v0(AccountConversionView accountConversionView, androidx.appcompat.widget.x xVar) {
        accountConversionView.f48120c = xVar;
    }

    public static final Float w(String str, Map map) {
        r72.w0 w0Var = (r72.w0) map.get(str);
        if (w0Var instanceof r72.o0) {
            return Float.valueOf(((r72.o0) w0Var).f106595b);
        }
        if (w0Var instanceof r72.p0) {
            return Float.valueOf(((r72.p0) w0Var).f106610b);
        }
        return null;
    }

    public static void w0(bb1.l lVar, i92.k kVar) {
        lVar.f22523l0 = kVar;
    }

    public static final f0.h x(ww1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i13 = kw1.f.f81044a[aVar.ordinal()];
        if (i13 == 1) {
            return new fy1.e(fy1.d.BIG_NUMBERS, 2);
        }
        if (i13 == 2) {
            return new fy1.e(fy1.d.PERCENTAGE, 2);
        }
        if (i13 == 3) {
            return new fy1.c();
        }
        if (i13 == 4) {
            return new fy1.f();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void x0(m31.e eVar, i92.k kVar) {
        eVar.f85770l0 = kVar;
    }

    public static final File y() {
        File file = new File(le.v.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static void y0(pc1.d dVar, i92.k kVar) {
        dVar.B0 = kVar;
    }

    public static final r72.u0 z(String str, Map map) {
        r72.w0 w0Var = (r72.w0) map.get(str);
        if (w0Var instanceof r72.v0) {
            return ((r72.v0) w0Var).f106695b;
        }
        return null;
    }

    public static void z0(q71.a1 a1Var, i92.k kVar) {
        a1Var.Z0 = kVar;
    }
}
