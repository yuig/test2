package ua;

import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.transition.Transition;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121267a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f121268b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f121269c;

    public j(int i13, Object obj, Object obj2) {
        this.f121267a = i13;
        this.f121269c = obj;
        this.f121268b = obj2;
    }

    @Override // ua.r0, ua.o0
    public final void a() {
        switch (this.f121267a) {
            case 0:
                ((v) this.f121269c).setVisibility(4);
                break;
        }
    }

    @Override // ua.r0, ua.o0
    public final void d() {
        switch (this.f121267a) {
            case 0:
                ((v) this.f121269c).setVisibility(0);
                break;
        }
    }

    @Override // ua.o0
    public final void f(Transition transition) {
        switch (this.f121267a) {
            case 0:
                transition.I(this);
                View view = (View) this.f121268b;
                if (Build.VERSION.SDK_INT == 28) {
                    if (!t5.e.f116427h) {
                        try {
                            t5.e.r();
                            Method declaredMethod = t5.e.f116422c.getDeclaredMethod("removeGhost", View.class);
                            t5.e.f116426g = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e13) {
                            Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e13);
                        }
                        t5.e.f116427h = true;
                    }
                    Method method = t5.e.f116426g;
                    if (method != null) {
                        try {
                            method.invoke(null, view);
                        } catch (IllegalAccessException unused) {
                        } catch (InvocationTargetException e14) {
                            throw new RuntimeException(e14.getCause());
                        }
                    }
                } else {
                    int i13 = y.f121370g;
                    y yVar = (y) view.getTag(e0.ghost_view);
                    if (yVar != null) {
                        int i14 = yVar.f121374d - 1;
                        yVar.f121374d = i14;
                        if (i14 <= 0) {
                            ((x) yVar.getParent()).removeView(yVar);
                        }
                    }
                }
                ((View) this.f121268b).setTag(e0.transition_transform, null);
                ((View) this.f121268b).setTag(e0.parent_matrix, null);
                return;
            case 1:
                ((ArrayList) ((g1.g) this.f121268b).get(((s0) this.f121269c).f121356b)).remove(transition);
                transition.I(this);
                return;
            default:
                ((Transition) this.f121268b).L();
                transition.I(this);
                return;
        }
    }

    public j(View view, v vVar) {
        this.f121267a = 0;
        this.f121268b = view;
        this.f121269c = vVar;
    }
}
