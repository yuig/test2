package t3;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AbstractComposeView;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116002b;

    public /* synthetic */ g0(Object obj, int i13) {
        this.f116001a = i13;
        this.f116002b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i13 = this.f116001a;
        Object obj = this.f116002b;
        switch (i13) {
            case 0:
                v0 v0Var = (v0) obj;
                AccessibilityManager accessibilityManager2 = v0Var.f116214g;
                accessibilityManager2.addAccessibilityStateChangeListener(v0Var.f116216i);
                accessibilityManager2.addTouchExplorationStateChangeListener(v0Var.f116217j);
                break;
            case 1:
            case 2:
                break;
            default:
                com.google.android.material.textfield.n nVar = (com.google.android.material.textfield.n) obj;
                int i14 = com.google.android.material.textfield.n.f33250u;
                if (nVar.f33269s != null && (accessibilityManager = nVar.f33268r) != null) {
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    if (nVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new r5.c(nVar.f33269s));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i13 = this.f116001a;
        Object obj = this.f116002b;
        switch (i13) {
            case 0:
                v0 v0Var = (v0) obj;
                v0Var.f116219l.removeCallbacks(v0Var.K);
                AccessibilityManager accessibilityManager2 = v0Var.f116214g;
                accessibilityManager2.removeAccessibilityStateChangeListener(v0Var.f116216i);
                accessibilityManager2.removeTouchExplorationStateChangeListener(v0Var.f116217j);
                break;
            case 1:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj;
                int i14 = x5.a.f133834a;
                Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
                for (Object obj2 : kh2.j1.d0(abstractComposeView)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        Intrinsics.checkNotNullParameter(view2, "<this>");
                        Object tag = view2.getTag(x5.a.f133835b);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null && bool.booleanValue()) {
                            break;
                        }
                    }
                }
                abstractComposeView.g();
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((ao2.o1) obj).cancel((CancellationException) null);
                break;
            default:
                com.google.android.material.textfield.n nVar = (com.google.android.material.textfield.n) obj;
                int i15 = com.google.android.material.textfield.n.f33250u;
                r5.b bVar = nVar.f33269s;
                if (bVar != null && (accessibilityManager = nVar.f33268r) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new r5.c(bVar));
                    break;
                }
                break;
        }
    }
}
