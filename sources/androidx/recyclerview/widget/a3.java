package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCell;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes.dex */
public class a3 extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19318d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final View f19319e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19320f;

    public a3(LegoPinGridCell legoPinGridCell, qa2.d dVar) {
        this.f19319e = legoPinGridCell;
        this.f19320f = dVar;
    }

    @Override // q5.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        l2 l2Var;
        switch (this.f19318d) {
            case 0:
                super.c(view, accessibilityEvent);
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) this.f19319e;
                    if (recyclerView.f19256u && !recyclerView.D && !recyclerView.f19224e.i() && (l2Var = ((RecyclerView) view).f19242n) != null) {
                        l2Var.o0(accessibilityEvent);
                        break;
                    }
                }
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // q5.b
    public void d(View host, r5.e info2) {
        l2 l2Var;
        boolean z13;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        AccessibilityNodeInfo accessibilityNodeInfo = info2.f106231a;
        int i13 = this.f19318d;
        KeyEvent.Callback callback = this.f19319e;
        switch (i13) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                RecyclerView recyclerView = (RecyclerView) callback;
                if (recyclerView.f19256u && !recyclerView.D && !recyclerView.f19224e.i() && (l2Var = ((RecyclerView) callback).f19242n) != null) {
                    RecyclerView recyclerView2 = l2Var.f19494b;
                    l2Var.p0(recyclerView2.f19220c, recyclerView2.f19231h0, info2);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info2, "info");
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                if (callback instanceof qa2.h0) {
                    Object systemService = host.getContext().getSystemService("accessibility");
                    Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                    AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && accessibilityManager.getEnabledAccessibilityServiceList(1).size() > 0) {
                        f30 S = com.bumptech.glide.d.S((qa2.b) callback);
                        z13 = df.j1.U0(S != null ? S.C3() : null);
                    } else {
                        z13 = false;
                    }
                    WeakReference weakReference = new WeakReference(info2);
                    yk1.a aVar = new yk1.a(host.getResources(), host.getContext().getTheme());
                    f30 S2 = com.bumptech.glide.d.S((qa2.b) callback);
                    lh0.r2 r2Var = ((qa2.d) this.f19320f).f103247a;
                    r2Var.getClass();
                    z3 z3Var = a4.f83298b;
                    lh0.g1 g1Var = (lh0.g1) r2Var.f83469a;
                    com.bumptech.glide.c.Y(aVar, S2, false, z13, g1Var.o("android_lift_content_desc", "enabled", z3Var) || g1Var.l("android_lift_content_desc"), new e82.l(weakReference, 2), 4);
                    break;
                }
                break;
        }
    }

    @Override // q5.b
    public final boolean g(View host, int i13, Bundle bundle) {
        l2 l2Var;
        switch (this.f19318d) {
            case 0:
                if (super.g(host, i13, bundle)) {
                    return true;
                }
                View view = this.f19319e;
                RecyclerView recyclerView = (RecyclerView) view;
                if (!recyclerView.f19256u || recyclerView.D || recyclerView.f19224e.i() || (l2Var = ((RecyclerView) view).f19242n) == null) {
                    return false;
                }
                RecyclerView recyclerView2 = l2Var.f19494b;
                return l2Var.C0(recyclerView2.f19220c, recyclerView2.f19231h0, i13, bundle);
            default:
                Intrinsics.checkNotNullParameter(host, "host");
                super.g(host, i13, bundle);
                return false;
        }
    }

    public a3(RecyclerView recyclerView) {
        this.f19319e = recyclerView;
        z2 z2Var = (z2) this.f19320f;
        if (z2Var != null) {
            this.f19320f = z2Var;
        } else {
            this.f19320f = new z2(this);
        }
    }
}
