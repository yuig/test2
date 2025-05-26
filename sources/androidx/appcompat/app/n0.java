package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.j3;
import androidx.appcompat.widget.k3;
import androidx.appcompat.widget.l3;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import q5.a2;

/* loaded from: classes.dex */
public final class n0 extends t implements n.m, LayoutInflater.Factory2 {

    /* renamed from: h0 */
    public static final g1.o0 f16079h0 = new g1.o0(0);

    /* renamed from: i0 */
    public static final int[] f16080i0 = {R.attr.windowBackground};

    /* renamed from: j0 */
    public static final boolean f16081j0 = !"robolectric".equals(Build.FINGERPRINT);
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J */
    public boolean f16082J;
    public boolean K;
    public m0[] L;
    public m0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public h0 W;
    public h0 X;
    public boolean Y;
    public int Z;

    /* renamed from: b0 */
    public boolean f16084b0;

    /* renamed from: c0 */
    public Rect f16085c0;

    /* renamed from: d0 */
    public Rect f16086d0;

    /* renamed from: e0 */
    public s0 f16087e0;

    /* renamed from: f0 */
    public OnBackInvokedDispatcher f16088f0;

    /* renamed from: g0 */
    public OnBackInvokedCallback f16089g0;

    /* renamed from: j */
    public final Object f16090j;

    /* renamed from: k */
    public final Context f16091k;

    /* renamed from: l */
    public Window f16092l;

    /* renamed from: m */
    public g0 f16093m;

    /* renamed from: n */
    public final o f16094n;

    /* renamed from: o */
    public a f16095o;

    /* renamed from: p */
    public m.l f16096p;

    /* renamed from: q */
    public CharSequence f16097q;

    /* renamed from: r */
    public androidx.appcompat.widget.y0 f16098r;

    /* renamed from: s */
    public x f16099s;

    /* renamed from: t */
    public x f16100t;

    /* renamed from: u */
    public m.c f16101u;

    /* renamed from: v */
    public ActionBarContextView f16102v;

    /* renamed from: w */
    public PopupWindow f16103w;

    /* renamed from: x */
    public z f16104x;

    /* renamed from: z */
    public boolean f16106z;

    /* renamed from: y */
    public q5.d1 f16105y = null;

    /* renamed from: a0 */
    public final v f16083a0 = new v(this, 0);

    public n0(Context context, Window window, o oVar, Object obj) {
        n Q;
        this.S = -100;
        this.f16091k = context;
        this.f16094n = oVar;
        this.f16090j = obj;
        if ((obj instanceof Dialog) && (Q = Q()) != null) {
            this.S = Q.getDelegate().b();
        }
        if (this.S == -100) {
            g1.o0 o0Var = f16079h0;
            Integer num = (Integer) o0Var.get(obj.getClass().getName());
            if (num != null) {
                this.S = num.intValue();
                o0Var.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            s(window);
        }
        androidx.appcompat.widget.y.d();
    }

    public static Configuration D(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration.diff(configuration2) == 0) {
            return configuration3;
        }
        float f13 = configuration.fontScale;
        float f14 = configuration2.fontScale;
        if (f13 != f14) {
            configuration3.fontScale = f14;
        }
        int i13 = configuration.mcc;
        int i14 = configuration2.mcc;
        if (i13 != i14) {
            configuration3.mcc = i14;
        }
        int i15 = configuration.mnc;
        int i16 = configuration2.mnc;
        if (i15 != i16) {
            configuration3.mnc = i16;
        }
        c0.a(configuration, configuration2, configuration3);
        int i17 = configuration.touchscreen;
        int i18 = configuration2.touchscreen;
        if (i17 != i18) {
            configuration3.touchscreen = i18;
        }
        int i19 = configuration.keyboard;
        int i23 = configuration2.keyboard;
        if (i19 != i23) {
            configuration3.keyboard = i23;
        }
        int i24 = configuration.keyboardHidden;
        int i25 = configuration2.keyboardHidden;
        if (i24 != i25) {
            configuration3.keyboardHidden = i25;
        }
        int i26 = configuration.navigation;
        int i27 = configuration2.navigation;
        if (i26 != i27) {
            configuration3.navigation = i27;
        }
        int i28 = configuration.navigationHidden;
        int i29 = configuration2.navigationHidden;
        if (i28 != i29) {
            configuration3.navigationHidden = i29;
        }
        int i33 = configuration.orientation;
        int i34 = configuration2.orientation;
        if (i33 != i34) {
            configuration3.orientation = i34;
        }
        int i35 = configuration.screenLayout & 15;
        int i36 = configuration2.screenLayout & 15;
        if (i35 != i36) {
            configuration3.screenLayout |= i36;
        }
        int i37 = configuration.screenLayout & RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY;
        int i38 = configuration2.screenLayout & RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY;
        if (i37 != i38) {
            configuration3.screenLayout |= i38;
        }
        int i39 = configuration.screenLayout & 48;
        int i43 = configuration2.screenLayout & 48;
        if (i39 != i43) {
            configuration3.screenLayout |= i43;
        }
        int i44 = configuration.screenLayout & 768;
        int i45 = configuration2.screenLayout & 768;
        if (i44 != i45) {
            configuration3.screenLayout |= i45;
        }
        kh2.d.t(configuration, configuration2, configuration3);
        int i46 = configuration.uiMode & 15;
        int i47 = configuration2.uiMode & 15;
        if (i46 != i47) {
            configuration3.uiMode |= i47;
        }
        int i48 = configuration.uiMode & 48;
        int i49 = configuration2.uiMode & 48;
        if (i48 != i49) {
            configuration3.uiMode |= i49;
        }
        int i53 = configuration.screenWidthDp;
        int i54 = configuration2.screenWidthDp;
        if (i53 != i54) {
            configuration3.screenWidthDp = i54;
        }
        int i55 = configuration.screenHeightDp;
        int i56 = configuration2.screenHeightDp;
        if (i55 != i56) {
            configuration3.screenHeightDp = i56;
        }
        int i57 = configuration.smallestScreenWidthDp;
        int i58 = configuration2.smallestScreenWidthDp;
        if (i57 != i58) {
            configuration3.smallestScreenWidthDp = i58;
        }
        int i59 = configuration.densityDpi;
        int i63 = configuration2.densityDpi;
        if (i59 != i63) {
            configuration3.densityDpi = i63;
        }
        return configuration3;
    }

    public static j5.h t(Context context) {
        j5.h hVar;
        j5.h hVar2;
        if (Build.VERSION.SDK_INT >= 33 || (hVar = t.f16130c) == null) {
            return null;
        }
        j5.h b13 = c0.b(context.getApplicationContext().getResources().getConfiguration());
        if (hVar.d()) {
            hVar2 = j5.h.f74679b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i13 = 0;
            while (i13 < b13.e() + hVar.e()) {
                Locale b14 = i13 < hVar.e() ? hVar.b(i13) : b13.b(i13 - hVar.e());
                if (b14 != null) {
                    linkedHashSet.add(b14);
                }
                i13++;
            }
            hVar2 = new j5.h(new j5.j(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return hVar2.d() ? b13 : hVar2;
    }

    public static Configuration y(Context context, int i13, j5.h hVar, Configuration configuration, boolean z13) {
        int i14 = i13 != 1 ? i13 != 2 ? z13 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i14 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            c0.d(configuration2, hVar);
        }
        return configuration2;
    }

    public final void A(int i13) {
        m0 G = G(i13);
        if (G.f16070h != null) {
            Bundle bundle = new Bundle();
            G.f16070h.v(bundle);
            if (bundle.size() > 0) {
                G.f16078p = bundle;
            }
            G.f16070h.B();
            G.f16070h.clear();
        }
        G.f16077o = true;
        G.f16076n = true;
        if ((i13 == 108 || i13 == 0) && this.f16098r != null) {
            m0 G2 = G(0);
            G2.f16073k = false;
            O(G2, null);
        }
    }

    public final void B() {
        ViewGroup viewGroup;
        if (this.f16106z) {
            return;
        }
        int[] iArr = i.j.AppCompatTheme;
        Context context = this.f16091k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(i.j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(i.j.AppCompatTheme_windowNoTitle, false)) {
            j(1);
        } else if (obtainStyledAttributes.getBoolean(i.j.AppCompatTheme_windowActionBar, false)) {
            j(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
        }
        if (obtainStyledAttributes.getBoolean(i.j.AppCompatTheme_windowActionBarOverlay, false)) {
            j(RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
        }
        if (obtainStyledAttributes.getBoolean(i.j.AppCompatTheme_windowActionModeOverlay, false)) {
            j(10);
        }
        this.I = obtainStyledAttributes.getBoolean(i.j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        C();
        this.f16092l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f16082J) {
            viewGroup = this.H ? (ViewGroup) from.inflate(i.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(i.g.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) from.inflate(i.g.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new m.e(context, typedValue.resourceId) : context).inflate(i.g.abc_screen_toolbar, (ViewGroup) null);
            androidx.appcompat.widget.y0 y0Var = (androidx.appcompat.widget.y0) viewGroup.findViewById(i.f.decor_content_parent);
            this.f16098r = y0Var;
            ((ActionBarOverlayLayout) y0Var).q(H());
            if (this.G) {
                ((ActionBarOverlayLayout) this.f16098r).g(RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
            }
            if (this.D) {
                ((ActionBarOverlayLayout) this.f16098r).g(2);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.f16098r).g(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb3 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb3.append(this.F);
            sb3.append(", windowActionBarOverlay: ");
            sb3.append(this.G);
            sb3.append(", android:windowIsFloating: ");
            sb3.append(this.I);
            sb3.append(", windowActionModeOverlay: ");
            sb3.append(this.H);
            sb3.append(", windowNoTitle: ");
            throw new IllegalArgumentException(a.a.r(sb3, this.f16082J, " }"));
        }
        w wVar = new w(this);
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.m0.n(viewGroup, wVar);
        if (this.f16098r == null) {
            this.B = (TextView) viewGroup.findViewById(i.f.title);
        }
        boolean z13 = l3.f16639a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e13) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e13);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e14) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e14);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(i.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f16092l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f16092l.setContentView(viewGroup);
        contentFrameLayout.f16356h = new w(this);
        this.A = viewGroup;
        Object obj = this.f16090j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f16097q;
        if (!TextUtils.isEmpty(title)) {
            androidx.appcompat.widget.y0 y0Var2 = this.f16098r;
            if (y0Var2 != null) {
                ((ActionBarOverlayLayout) y0Var2).r(title);
            } else {
                a aVar = this.f16095o;
                if (aVar != null) {
                    aVar.n(title);
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.f16092l.getDecorView();
        contentFrameLayout2.f16355g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i.j.AppCompatTheme);
        int i13 = i.j.AppCompatTheme_windowMinWidthMajor;
        if (contentFrameLayout2.f16349a == null) {
            contentFrameLayout2.f16349a = new TypedValue();
        }
        obtainStyledAttributes2.getValue(i13, contentFrameLayout2.f16349a);
        int i14 = i.j.AppCompatTheme_windowMinWidthMinor;
        if (contentFrameLayout2.f16350b == null) {
            contentFrameLayout2.f16350b = new TypedValue();
        }
        obtainStyledAttributes2.getValue(i14, contentFrameLayout2.f16350b);
        if (obtainStyledAttributes2.hasValue(i.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes2.getValue(i.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.c());
        }
        if (obtainStyledAttributes2.hasValue(i.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes2.getValue(i.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.d());
        }
        if (obtainStyledAttributes2.hasValue(i.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes2.getValue(i.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.a());
        }
        if (obtainStyledAttributes2.hasValue(i.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes2.getValue(i.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.b());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f16106z = true;
        m0 G = G(0);
        if (this.Q || G.f16070h != null) {
            return;
        }
        J(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
    }

    public final void C() {
        if (this.f16092l == null) {
            Object obj = this.f16090j;
            if (obj instanceof Activity) {
                s(((Activity) obj).getWindow());
            }
        }
        if (this.f16092l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final j0 E(Context context) {
        if (this.X == null) {
            this.X = new h0(this, context);
        }
        return this.X;
    }

    public final j0 F(Context context) {
        if (this.W == null) {
            this.W = new h0(this, d.r(context));
        }
        return this.W;
    }

    public final m0 G(int i13) {
        m0[] m0VarArr = this.L;
        if (m0VarArr == null || m0VarArr.length <= i13) {
            m0[] m0VarArr2 = new m0[i13 + 1];
            if (m0VarArr != null) {
                System.arraycopy(m0VarArr, 0, m0VarArr2, 0, m0VarArr.length);
            }
            this.L = m0VarArr2;
            m0VarArr = m0VarArr2;
        }
        m0 m0Var = m0VarArr[i13];
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0();
        m0Var2.f16063a = i13;
        m0Var2.f16076n = false;
        m0VarArr[i13] = m0Var2;
        return m0Var2;
    }

    public final Window.Callback H() {
        return this.f16092l.getCallback();
    }

    public final void I() {
        B();
        if (this.F && this.f16095o == null) {
            Object obj = this.f16090j;
            if (obj instanceof Activity) {
                this.f16095o = new d1((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.f16095o = new d1((Dialog) obj);
            }
            a aVar = this.f16095o;
            if (aVar != null) {
                aVar.l(this.f16084b0);
            }
        }
    }

    public final void J(int i13) {
        this.Z = (1 << i13) | this.Z;
        if (this.Y) {
            return;
        }
        View decorView = this.f16092l.getDecorView();
        WeakHashMap weakHashMap = q5.v0.f102521a;
        decorView.postOnAnimation(this.f16083a0);
        this.Y = true;
    }

    public final int K(Context context, int i13) {
        if (i13 == -100) {
            return -1;
        }
        if (i13 != -1) {
            if (i13 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return F(context).o();
            }
            if (i13 != 1 && i13 != 2) {
                if (i13 == 3) {
                    return E(context).o();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i13;
    }

    public final boolean L() {
        boolean z13 = this.N;
        this.N = false;
        m0 G = G(0);
        if (G.f16075m) {
            if (!z13) {
                x(G, true);
            }
            return true;
        }
        m.c cVar = this.f16101u;
        if (cVar != null) {
            cVar.a();
            return true;
        }
        I();
        a aVar = this.f16095o;
        return aVar != null && aVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0131, code lost:
    
        if (r3 != null) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(androidx.appcompat.app.m0 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.n0.M(androidx.appcompat.app.m0, android.view.KeyEvent):void");
    }

    public final boolean N(m0 m0Var, int i13, KeyEvent keyEvent) {
        n.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((m0Var.f16073k || O(m0Var, keyEvent)) && (oVar = m0Var.f16070h) != null) {
            return oVar.performShortcut(i13, keyEvent, 1);
        }
        return false;
    }

    public final boolean O(m0 m0Var, KeyEvent keyEvent) {
        androidx.appcompat.widget.y0 y0Var;
        androidx.appcompat.widget.y0 y0Var2;
        Resources.Theme theme;
        androidx.appcompat.widget.y0 y0Var3;
        androidx.appcompat.widget.y0 y0Var4;
        if (this.Q) {
            return false;
        }
        if (m0Var.f16073k) {
            return true;
        }
        m0 m0Var2 = this.M;
        if (m0Var2 != null && m0Var2 != m0Var) {
            x(m0Var2, false);
        }
        Window.Callback callback = this.f16092l.getCallback();
        int i13 = m0Var.f16063a;
        if (callback != null) {
            m0Var.f16069g = callback.onCreatePanelView(i13);
        }
        boolean z13 = i13 == 0 || i13 == 108;
        if (z13 && (y0Var4 = this.f16098r) != null) {
            ((ActionBarOverlayLayout) y0Var4).p();
        }
        if (m0Var.f16069g == null && (!z13 || !(this.f16095o instanceof y0))) {
            n.o oVar = m0Var.f16070h;
            if (oVar == null || m0Var.f16077o) {
                if (oVar == null) {
                    Context context = this.f16091k;
                    if ((i13 == 0 || i13 == 108) && this.f16098r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(i.a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(i.a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(i.a.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            m.e eVar = new m.e(context, 0);
                            eVar.getTheme().setTo(theme);
                            context = eVar;
                        }
                    }
                    n.o oVar2 = new n.o(context);
                    oVar2.x(this);
                    n.o oVar3 = m0Var.f16070h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.s(m0Var.f16071i);
                        }
                        m0Var.f16070h = oVar2;
                        n.k kVar = m0Var.f16071i;
                        if (kVar != null) {
                            oVar2.b(kVar);
                        }
                    }
                    if (m0Var.f16070h == null) {
                        return false;
                    }
                }
                if (z13 && (y0Var2 = this.f16098r) != null) {
                    if (this.f16099s == null) {
                        this.f16099s = new x(this, 2);
                    }
                    ((ActionBarOverlayLayout) y0Var2).o(m0Var.f16070h, this.f16099s);
                }
                m0Var.f16070h.B();
                if (!callback.onCreatePanelMenu(i13, m0Var.f16070h)) {
                    n.o oVar4 = m0Var.f16070h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.s(m0Var.f16071i);
                        }
                        m0Var.f16070h = null;
                    }
                    if (z13 && (y0Var = this.f16098r) != null) {
                        ((ActionBarOverlayLayout) y0Var).o(null, this.f16099s);
                    }
                    return false;
                }
                m0Var.f16077o = false;
            }
            m0Var.f16070h.B();
            Bundle bundle = m0Var.f16078p;
            if (bundle != null) {
                m0Var.f16070h.t(bundle);
                m0Var.f16078p = null;
            }
            if (!callback.onPreparePanel(0, m0Var.f16069g, m0Var.f16070h)) {
                if (z13 && (y0Var3 = this.f16098r) != null) {
                    ((ActionBarOverlayLayout) y0Var3).o(null, this.f16099s);
                }
                m0Var.f16070h.A();
                return false;
            }
            m0Var.f16070h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            m0Var.f16070h.A();
        }
        m0Var.f16073k = true;
        m0Var.f16074l = false;
        this.M = m0Var;
        return true;
    }

    public final void P() {
        if (this.f16106z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final n Q() {
        for (Context context = this.f16091k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof n) {
                return (n) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void R() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z13 = false;
            if (this.f16088f0 != null && (G(0).f16075m || this.f16101u != null)) {
                z13 = true;
            }
            if (z13 && this.f16089g0 == null) {
                this.f16089g0 = f0.b(this.f16088f0, this);
            } else {
                if (z13 || (onBackInvokedCallback = this.f16089g0) == null) {
                    return;
                }
                f0.c(this.f16088f0, onBackInvokedCallback);
                this.f16089g0 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(int i13, j5.h hVar, boolean z13) {
        Context context = this.f16091k;
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i13 | (resources.getConfiguration().uiMode & (-49));
        if (hVar != null) {
            c0.d(configuration, hVar);
        }
        resources.updateConfiguration(configuration, null);
        int i14 = this.T;
        if (i14 != 0) {
            context.setTheme(i14);
            context.getTheme().applyStyle(this.T, true);
        }
        if (z13) {
            Object obj = this.f16090j;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.z) {
                    if (((androidx.lifecycle.b0) ((androidx.lifecycle.z) activity).getLifecycle()).f18588d.isAtLeast(androidx.lifecycle.r.CREATED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else {
                    if (!this.P || this.Q) {
                        return;
                    }
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    public final int T(Rect rect, a2 a2Var) {
        boolean z13;
        boolean z14;
        int color;
        int e13 = a2Var != null ? a2Var.e() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f16102v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z13 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16102v.getLayoutParams();
            if (this.f16102v.isShown()) {
                if (this.f16085c0 == null) {
                    this.f16085c0 = new Rect();
                    this.f16086d0 = new Rect();
                }
                Rect rect2 = this.f16085c0;
                Rect rect3 = this.f16086d0;
                if (a2Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(a2Var.c(), a2Var.e(), a2Var.d(), a2Var.b());
                }
                ViewGroup viewGroup = this.A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z15 = l3.f16639a;
                    k3.a(viewGroup, rect2, rect3);
                } else {
                    if (!l3.f16639a) {
                        l3.f16639a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            l3.f16640b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                l3.f16640b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = l3.f16640b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect2, rect3);
                        } catch (Exception e14) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e14);
                        }
                    }
                }
                int i13 = rect2.top;
                int i14 = rect2.left;
                int i15 = rect2.right;
                ViewGroup viewGroup2 = this.A;
                WeakHashMap weakHashMap = q5.v0.f102521a;
                a2 a13 = q5.n0.a(viewGroup2);
                int c13 = a13 == null ? 0 : a13.c();
                int d2 = a13 == null ? 0 : a13.d();
                if (marginLayoutParams.topMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15) {
                    z14 = false;
                } else {
                    marginLayoutParams.topMargin = i13;
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = i15;
                    z14 = true;
                }
                Context context = this.f16091k;
                if (i13 <= 0 || this.C != null) {
                    View view = this.C;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != c13 || marginLayoutParams2.rightMargin != d2) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = c13;
                            marginLayoutParams2.rightMargin = d2;
                            this.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(context);
                    this.C = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c13;
                    layoutParams.rightMargin = d2;
                    this.A.addView(this.C, -1, layoutParams);
                }
                View view3 = this.C;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    View view4 = this.C;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        int i18 = i.c.abc_decor_view_status_guard_light;
                        Object obj = d5.a.f53679a;
                        color = context.getColor(i18);
                    } else {
                        int i19 = i.c.abc_decor_view_status_guard;
                        Object obj2 = d5.a.f53679a;
                        color = context.getColor(i19);
                    }
                    view4.setBackgroundColor(color);
                }
                if (!this.H && r5) {
                    e13 = 0;
                }
                z13 = r5;
                r5 = z14;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z13 = false;
            } else {
                z13 = false;
                r5 = false;
            }
            if (r5) {
                this.f16102v.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.C;
        if (view5 != null) {
            view5.setVisibility(z13 ? 0 : 8);
        }
        return e13;
    }

    @Override // androidx.appcompat.app.t
    public final boolean a() {
        return r(true, true);
    }

    @Override // androidx.appcompat.app.t
    public final int b() {
        return this.S;
    }

    @Override // androidx.appcompat.app.t
    public final void c() {
        LayoutInflater from = LayoutInflater.from(this.f16091k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof n0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.t
    public final void d() {
        if (this.f16095o != null) {
            I();
            if (this.f16095o.f()) {
                return;
            }
            J(0);
        }
    }

    @Override // androidx.appcompat.app.t
    public final void f(Bundle bundle) {
        String str;
        this.O = true;
        r(false, true);
        C();
        Object obj = this.f16090j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = ao2.m0.I(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e13) {
                    throw new IllegalArgumentException(e13);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                a aVar = this.f16095o;
                if (aVar == null) {
                    this.f16084b0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (t.f16135h) {
                t.i(this);
                t.f16134g.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.f16091k.getResources().getConfiguration());
        this.P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16090j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.t.f16135h
            monitor-enter(r0)
            androidx.appcompat.app.t.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f16092l
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.v r1 = r3.f16083a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.Q = r0
            int r0 = r3.S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f16090j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            g1.o0 r0 = androidx.appcompat.app.n0.f16079h0
            java.lang.Object r1 = r3.f16090j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            g1.o0 r0 = androidx.appcompat.app.n0.f16079h0
            java.lang.Object r1 = r3.f16090j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.a r0 = r3.f16095o
            if (r0 == 0) goto L63
            r0.h()
        L63:
            androidx.appcompat.app.h0 r0 = r3.W
            if (r0 == 0) goto L6a
            r0.m()
        L6a:
            androidx.appcompat.app.h0 r0 = r3.X
            if (r0 == 0) goto L71
            r0.m()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.n0.g():void");
    }

    @Override // n.m
    public final boolean h(n.o oVar, MenuItem menuItem) {
        m0 m0Var;
        Window.Callback callback = this.f16092l.getCallback();
        if (callback != null && !this.Q) {
            n.o l13 = oVar.l();
            m0[] m0VarArr = this.L;
            int length = m0VarArr != null ? m0VarArr.length : 0;
            int i13 = 0;
            while (true) {
                if (i13 < length) {
                    m0Var = m0VarArr[i13];
                    if (m0Var != null && m0Var.f16070h == l13) {
                        break;
                    }
                    i13++;
                } else {
                    m0Var = null;
                    break;
                }
            }
            if (m0Var != null) {
                return callback.onMenuItemSelected(m0Var.f16063a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.t
    public final boolean j(int i13) {
        if (i13 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i13 = 108;
        } else if (i13 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i13 = 109;
        }
        if (this.f16082J && i13 == 108) {
            return false;
        }
        if (this.F && i13 == 1) {
            this.F = false;
        }
        if (i13 == 1) {
            P();
            this.f16082J = true;
            return true;
        }
        if (i13 == 2) {
            P();
            this.D = true;
            return true;
        }
        if (i13 == 5) {
            P();
            this.E = true;
            return true;
        }
        if (i13 == 10) {
            P();
            this.H = true;
            return true;
        }
        if (i13 == 108) {
            P();
            this.F = true;
            return true;
        }
        if (i13 != 109) {
            return this.f16092l.requestFeature(i13);
        }
        P();
        this.G = true;
        return true;
    }

    @Override // androidx.appcompat.app.t
    public final void k(int i13) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f16091k).inflate(i13, viewGroup);
        this.f16093m.a(this.f16092l.getCallback());
    }

    @Override // androidx.appcompat.app.t
    public final void l(View view) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f16093m.a(this.f16092l.getCallback());
    }

    @Override // androidx.appcompat.app.t
    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f16093m.a(this.f16092l.getCallback());
    }

    @Override // androidx.appcompat.app.t
    public final void o(CharSequence charSequence) {
        this.f16097q = charSequence;
        androidx.appcompat.widget.y0 y0Var = this.f16098r;
        if (y0Var != null) {
            ((ActionBarOverlayLayout) y0Var).r(charSequence);
            return;
        }
        a aVar = this.f16095o;
        if (aVar != null) {
            aVar.n(charSequence);
            return;
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        char c13;
        View appCompatRatingBar;
        if (this.f16087e0 == null) {
            int[] iArr = i.j.AppCompatTheme;
            Context context2 = this.f16091k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(i.j.AppCompatTheme_viewInflaterClass);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f16087e0 = new s0();
            } else {
                try {
                    this.f16087e0 = (s0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th3) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th3);
                    this.f16087e0 = new s0();
                }
            }
        }
        s0 s0Var = this.f16087e0;
        int i13 = j3.f16617a;
        s0Var.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.j.View, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(i.j.View_theme, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context eVar = (resourceId == 0 || ((context instanceof m.e) && ((m.e) context).f85184a == resourceId)) ? context : new m.e(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c13 = 0;
                    break;
                }
                c13 = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c13 = 1;
                    break;
                }
                c13 = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c13 = 2;
                    break;
                }
                c13 = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c13 = 3;
                    break;
                }
                c13 = 65535;
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c13 = 4;
                    break;
                }
                c13 = 65535;
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c13 = 5;
                    break;
                }
                c13 = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c13 = 6;
                    break;
                }
                c13 = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c13 = 7;
                    break;
                }
                c13 = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c13 = '\b';
                    break;
                }
                c13 = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c13 = '\t';
                    break;
                }
                c13 = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c13 = '\n';
                    break;
                }
                c13 = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c13 = 11;
                    break;
                }
                c13 = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c13 = '\f';
                    break;
                }
                c13 = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c13 = '\r';
                    break;
                }
                c13 = 65535;
                break;
            default:
                c13 = 65535;
                break;
        }
        View view2 = null;
        switch (c13) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(eVar, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(eVar, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(eVar, attributeSet);
                break;
            case 3:
                appCompatRatingBar = s0Var.e(eVar, attributeSet);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(eVar, attributeSet);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(eVar, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(eVar, attributeSet);
                break;
            case 7:
                appCompatRatingBar = s0Var.d(eVar, attributeSet);
                break;
            case '\b':
                appCompatRatingBar = new AppCompatToggleButton(eVar, attributeSet);
                break;
            case '\t':
                appCompatRatingBar = new AppCompatImageView(eVar, attributeSet);
                break;
            case '\n':
                appCompatRatingBar = s0Var.a(eVar, attributeSet);
                break;
            case 11:
                appCompatRatingBar = s0Var.c(eVar, attributeSet);
                break;
            case '\f':
                appCompatRatingBar = new AppCompatEditText(eVar, attributeSet);
                break;
            case '\r':
                appCompatRatingBar = s0Var.b(eVar, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != eVar) {
            Object[] objArr = s0Var.f16127a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = eVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i14 = 0;
                    while (true) {
                        String[] strArr = s0.f16125g;
                        if (i14 < 3) {
                            View f13 = s0Var.f(eVar, str, strArr[i14]);
                            if (f13 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f13;
                            } else {
                                i14++;
                            }
                        }
                    }
                } else {
                    View f14 = s0Var.f(eVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f14;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if ((context3 instanceof ContextWrapper) && appCompatRatingBar.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, s0.f16121c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    appCompatRatingBar.setOnClickListener(new r0(appCompatRatingBar, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = eVar.obtainStyledAttributes(attributeSet, s0.f16122d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z13 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    new q5.h0(b5.c.tag_accessibility_heading, 3).g(appCompatRatingBar, Boolean.valueOf(z13));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = eVar.obtainStyledAttributes(attributeSet, s0.f16123e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    q5.v0.p(appCompatRatingBar, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = eVar.obtainStyledAttributes(attributeSet, s0.f16124f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    q5.v0.s(appCompatRatingBar, obtainStyledAttributes6.getBoolean(0, false));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return appCompatRatingBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    @Override // androidx.appcompat.app.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m.c p(m.b r9) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.n0.p(m.b):m.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.n0.r(boolean, boolean):boolean");
    }

    public final void s(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f16092l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof g0) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        g0 g0Var = new g0(this, callback);
        this.f16093m = g0Var;
        window.setCallback(g0Var);
        x92.b M = x92.b.M(this.f16091k, null, f16080i0);
        Drawable y13 = M.y(0);
        if (y13 != null) {
            window.setBackgroundDrawable(y13);
        }
        M.O();
        this.f16092l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f16088f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f16089g0) != null) {
            f0.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f16089g0 = null;
        }
        Object obj = this.f16090j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f16088f0 = f0.a(activity);
                R();
            }
        }
        this.f16088f0 = null;
        R();
    }

    public final void u(int i13, m0 m0Var, n.o oVar) {
        if (oVar == null) {
            if (m0Var == null && i13 >= 0) {
                m0[] m0VarArr = this.L;
                if (i13 < m0VarArr.length) {
                    m0Var = m0VarArr[i13];
                }
            }
            if (m0Var != null) {
                oVar = m0Var.f16070h;
            }
        }
        if ((m0Var == null || m0Var.f16075m) && !this.Q) {
            g0 g0Var = this.f16093m;
            Window.Callback callback = this.f16092l.getCallback();
            g0Var.getClass();
            try {
                g0Var.f16020e = true;
                callback.onPanelClosed(i13, oVar);
            } finally {
                g0Var.f16020e = false;
            }
        }
    }

    public final void v(n.o oVar) {
        if (this.K) {
            return;
        }
        this.K = true;
        ((ActionBarOverlayLayout) this.f16098r).c();
        Window.Callback callback = this.f16092l.getCallback();
        if (callback != null && !this.Q) {
            callback.onPanelClosed(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, oVar);
        }
        this.K = false;
    }

    @Override // n.m
    public final void w(n.o oVar) {
        androidx.appcompat.widget.y0 y0Var = this.f16098r;
        if (y0Var == null || !((ActionBarOverlayLayout) y0Var).b() || (ViewConfiguration.get(this.f16091k).hasPermanentMenuKey() && !((ActionBarOverlayLayout) this.f16098r).h())) {
            m0 G = G(0);
            G.f16076n = true;
            x(G, false);
            M(G, null);
            return;
        }
        Window.Callback callback = this.f16092l.getCallback();
        if (((ActionBarOverlayLayout) this.f16098r).j()) {
            ((ActionBarOverlayLayout) this.f16098r).e();
            if (this.Q) {
                return;
            }
            callback.onPanelClosed(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, G(0).f16070h);
            return;
        }
        if (callback == null || this.Q) {
            return;
        }
        if (this.Y && (1 & this.Z) != 0) {
            View decorView = this.f16092l.getDecorView();
            v vVar = this.f16083a0;
            decorView.removeCallbacks(vVar);
            vVar.run();
        }
        m0 G2 = G(0);
        n.o oVar2 = G2.f16070h;
        if (oVar2 == null || G2.f16077o || !callback.onPreparePanel(0, G2.f16069g, oVar2)) {
            return;
        }
        callback.onMenuOpened(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, G2.f16070h);
        ((ActionBarOverlayLayout) this.f16098r).u();
    }

    public final void x(m0 m0Var, boolean z13) {
        k0 k0Var;
        androidx.appcompat.widget.y0 y0Var;
        if (z13 && m0Var.f16063a == 0 && (y0Var = this.f16098r) != null && ((ActionBarOverlayLayout) y0Var).j()) {
            v(m0Var.f16070h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f16091k.getSystemService("window");
        if (windowManager != null && m0Var.f16075m && (k0Var = m0Var.f16067e) != null) {
            windowManager.removeView(k0Var);
            if (z13) {
                u(m0Var.f16063a, m0Var, null);
            }
        }
        m0Var.f16073k = false;
        m0Var.f16074l = false;
        m0Var.f16075m = false;
        m0Var.f16068f = null;
        m0Var.f16076n = true;
        if (this.M == m0Var) {
            this.M = null;
        }
        if (m0Var.f16063a == 0) {
            R();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.n0.z(android.view.KeyEvent):boolean");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
