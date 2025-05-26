package q5;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import kh2.k3;

/* loaded from: classes.dex */
public abstract class t1 extends y1 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f102504h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f102505i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f102506j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f102507k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f102508l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f102509c;

    /* renamed from: d, reason: collision with root package name */
    public f5.e[] f102510d;

    /* renamed from: e, reason: collision with root package name */
    public f5.e f102511e;

    /* renamed from: f, reason: collision with root package name */
    public a2 f102512f;

    /* renamed from: g, reason: collision with root package name */
    public f5.e f102513g;

    public t1(@NonNull a2 a2Var, @NonNull WindowInsets windowInsets) {
        super(a2Var);
        this.f102511e = null;
        this.f102509c = windowInsets;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private f5.e s(int i13, boolean z13) {
        f5.e eVar = f5.e.f61080e;
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if ((i13 & i14) != 0) {
                eVar = f5.e.a(eVar, t(i14, z13));
            }
        }
        return eVar;
    }

    private f5.e u() {
        a2 a2Var = this.f102512f;
        return a2Var != null ? a2Var.f102400a.h() : f5.e.f61080e;
    }

    private f5.e v(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f102504h) {
            x();
        }
        Method method = f102505i;
        if (method != null && f102506j != null && f102507k != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f102507k.get(f102508l.get(invoke));
                if (rect != null) {
                    return f5.e.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e13) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e13.getMessage(), e13);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void x() {
        try {
            f102505i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f102506j = cls;
            f102507k = cls.getDeclaredField("mVisibleInsets");
            f102508l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f102507k.setAccessible(true);
            f102508l.setAccessible(true);
        } catch (ReflectiveOperationException e13) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e13.getMessage(), e13);
        }
        f102504h = true;
    }

    @Override // q5.y1
    public void d(@NonNull View view) {
        f5.e v13 = v(view);
        if (v13 == null) {
            v13 = f5.e.f61080e;
        }
        y(v13);
    }

    @Override // q5.y1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f102513g, ((t1) obj).f102513g);
        }
        return false;
    }

    @Override // q5.y1
    @NonNull
    public f5.e f(int i13) {
        return s(i13, false);
    }

    @Override // q5.y1
    @NonNull
    public final f5.e j() {
        if (this.f102511e == null) {
            WindowInsets windowInsets = this.f102509c;
            this.f102511e = f5.e.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f102511e;
    }

    @Override // q5.y1
    @NonNull
    public a2 l(int i13, int i14, int i15, int i16) {
        a2 i17 = a2.i(null, this.f102509c);
        int i18 = Build.VERSION.SDK_INT;
        s1 r1Var = i18 >= 30 ? new r1(i17) : i18 >= 29 ? new q1(i17) : new p1(i17);
        r1Var.g(a2.f(j(), i13, i14, i15, i16));
        r1Var.e(a2.f(h(), i13, i14, i15, i16));
        return r1Var.b();
    }

    @Override // q5.y1
    public boolean n() {
        return this.f102509c.isRound();
    }

    @Override // q5.y1
    @SuppressLint({"WrongConstant"})
    public boolean o(int i13) {
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if ((i13 & i14) != 0 && !w(i14)) {
                return false;
            }
        }
        return true;
    }

    @Override // q5.y1
    public void p(f5.e[] eVarArr) {
        this.f102510d = eVarArr;
    }

    @Override // q5.y1
    public void q(a2 a2Var) {
        this.f102512f = a2Var;
    }

    @NonNull
    public f5.e t(int i13, boolean z13) {
        f5.e h10;
        int i14;
        if (i13 == 1) {
            return z13 ? f5.e.b(0, Math.max(u().f61082b, j().f61082b), 0, 0) : f5.e.b(0, j().f61082b, 0, 0);
        }
        if (i13 == 2) {
            if (z13) {
                f5.e u13 = u();
                f5.e h13 = h();
                return f5.e.b(Math.max(u13.f61081a, h13.f61081a), 0, Math.max(u13.f61083c, h13.f61083c), Math.max(u13.f61084d, h13.f61084d));
            }
            f5.e j13 = j();
            a2 a2Var = this.f102512f;
            h10 = a2Var != null ? a2Var.f102400a.h() : null;
            int i15 = j13.f61084d;
            if (h10 != null) {
                i15 = Math.min(i15, h10.f61084d);
            }
            return f5.e.b(j13.f61081a, 0, j13.f61083c, i15);
        }
        f5.e eVar = f5.e.f61080e;
        if (i13 != 8) {
            if (i13 == 16) {
                return i();
            }
            if (i13 == 32) {
                return g();
            }
            if (i13 == 64) {
                return k();
            }
            if (i13 != 128) {
                return eVar;
            }
            a2 a2Var2 = this.f102512f;
            i e13 = a2Var2 != null ? a2Var2.f102400a.e() : e();
            return e13 != null ? f5.e.b(e13.b(), e13.d(), e13.c(), e13.a()) : eVar;
        }
        f5.e[] eVarArr = this.f102510d;
        h10 = eVarArr != null ? eVarArr[k3.p0(8)] : null;
        if (h10 != null) {
            return h10;
        }
        f5.e j14 = j();
        f5.e u14 = u();
        int i16 = j14.f61084d;
        if (i16 > u14.f61084d) {
            return f5.e.b(0, 0, 0, i16);
        }
        f5.e eVar2 = this.f102513g;
        return (eVar2 == null || eVar2.equals(eVar) || (i14 = this.f102513g.f61084d) <= u14.f61084d) ? eVar : f5.e.b(0, 0, 0, i14);
    }

    public boolean w(int i13) {
        if (i13 != 1 && i13 != 2) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 8 && i13 != 128) {
                return true;
            }
        }
        return !t(i13, false).equals(f5.e.f61080e);
    }

    public void y(@NonNull f5.e eVar) {
        this.f102513g = eVar;
    }
}
