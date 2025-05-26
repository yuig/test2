package q5;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public a2 f102471a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f102472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f102473c;

    public l0(View view, v vVar) {
        this.f102472b = view;
        this.f102473c = vVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        a2 i13 = a2.i(view, windowInsets);
        int i14 = Build.VERSION.SDK_INT;
        v vVar = this.f102473c;
        if (i14 < 30) {
            m0.a(windowInsets, this.f102472b);
            if (i13.equals(this.f102471a)) {
                return vVar.k(view, i13).h();
            }
        }
        this.f102471a = i13;
        a2 k13 = vVar.k(view, i13);
        if (i14 >= 30) {
            return k13.h();
        }
        WeakHashMap weakHashMap = v0.f102521a;
        k0.c(view);
        return k13.h();
    }
}
