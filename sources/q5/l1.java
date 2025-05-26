package q5;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.internal.measurement.q4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class l1 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final androidx.constraintlayout.widget.x f102474a;

    /* renamed from: b */
    public List f102475b;

    /* renamed from: c */
    public ArrayList f102476c;

    /* renamed from: d */
    public final HashMap f102477d;

    public l1(androidx.constraintlayout.widget.x xVar) {
        super(xVar.f17870a);
        this.f102477d = new HashMap();
        this.f102474a = xVar;
    }

    public final o1 a(WindowInsetsAnimation windowInsetsAnimation) {
        o1 o1Var = (o1) this.f102477d.get(windowInsetsAnimation);
        if (o1Var == null) {
            o1Var = new o1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                o1Var.f102491a = new m1(windowInsetsAnimation);
            }
            this.f102477d.put(windowInsetsAnimation, o1Var);
        }
        return o1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        androidx.constraintlayout.widget.x xVar = this.f102474a;
        a(windowInsetsAnimation);
        ((View) xVar.f17874e).setTranslationY(0.0f);
        this.f102477d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        androidx.constraintlayout.widget.x xVar = this.f102474a;
        a(windowInsetsAnimation);
        View view = (View) xVar.f17874e;
        int[] iArr = xVar.f17875f;
        view.getLocationOnScreen(iArr);
        xVar.f17871b = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f102476c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f102476c = arrayList2;
            this.f102475b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l13 = k1.l(list.get(size));
            o1 a13 = a(l13);
            fraction = l13.getFraction();
            a13.f102491a.d(fraction);
            this.f102476c.add(a13);
        }
        androidx.constraintlayout.widget.x xVar = this.f102474a;
        a2 i13 = a2.i(null, windowInsets);
        xVar.a(i13, this.f102475b);
        return i13.h();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        androidx.constraintlayout.widget.x xVar = this.f102474a;
        a(windowInsetsAnimation);
        q4 q4Var = new q4(bounds);
        xVar.b(q4Var);
        return m1.e(q4Var);
    }
}
