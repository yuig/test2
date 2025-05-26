package ua;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public Transition f121355a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f121356b;

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e3 A[EDGE_INSN: B:117:0x01e3->B:118:0x01e3 BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.s0.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f121356b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = t0.f121360c;
        ViewGroup viewGroup2 = this.f121356b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) t0.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).K(viewGroup2);
            }
        }
        this.f121355a.o(true);
    }
}
