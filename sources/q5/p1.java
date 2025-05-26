package q5;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class p1 extends s1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f102495e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f102496f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f102497g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f102498h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f102499c;

    /* renamed from: d, reason: collision with root package name */
    public f5.e f102500d;

    public p1() {
        this.f102499c = i();
    }

    private static WindowInsets i() {
        if (!f102496f) {
            try {
                f102495e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e13);
            }
            f102496f = true;
        }
        Field field = f102495e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e14) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e14);
            }
        }
        if (!f102498h) {
            try {
                f102497g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e15) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e15);
            }
            f102498h = true;
        }
        Constructor constructor = f102497g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e16) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e16);
            }
        }
        return null;
    }

    @Override // q5.s1
    @NonNull
    public a2 b() {
        a();
        a2 i13 = a2.i(null, this.f102499c);
        f5.e[] eVarArr = this.f102503b;
        y1 y1Var = i13.f102400a;
        y1Var.p(eVarArr);
        y1Var.r(this.f102500d);
        return i13;
    }

    @Override // q5.s1
    public void e(f5.e eVar) {
        this.f102500d = eVar;
    }

    @Override // q5.s1
    public void g(@NonNull f5.e eVar) {
        WindowInsets windowInsets = this.f102499c;
        if (windowInsets != null) {
            this.f102499c = windowInsets.replaceSystemWindowInsets(eVar.f61081a, eVar.f61082b, eVar.f61083c, eVar.f61084d);
        }
    }

    public p1(@NonNull a2 a2Var) {
        super(a2Var);
        this.f102499c = a2Var.h();
    }
}
