package nl1;

import a7.i0;
import android.view.View;
import hc2.m;
import java.lang.ref.WeakReference;
import k8.q;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91277c;

    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        this.f91275a = i13;
        this.f91276b = obj;
        this.f91277c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f91275a;
        Object obj = this.f91277c;
        Object obj2 = this.f91276b;
        switch (i13) {
            case 0:
                WeakReference viewWeakReference = (WeakReference) obj2;
                d this$0 = (d) obj;
                int i14 = d.W;
                Intrinsics.checkNotNullParameter(viewWeakReference, "$viewWeakReference");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View view = (View) viewWeakReference.get();
                if (view != null || (view = this$0.k7()) != null) {
                    view.performAccessibilityAction(64, null);
                    view.sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 1:
                m this_apply = (m) obj2;
                q trackSelector = (q) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(trackSelector, "$trackSelector");
                dc2.g gVar = (dc2.g) this_apply;
                if (((l0) gVar.f54407a).L() == 3) {
                    i0 i15 = ((a7.h) gVar.f54407a).i();
                    if (Intrinsics.d(i15 != null ? i15.f1072a : null, gVar.f54409c)) {
                        dl2.b.W2(trackSelector, false);
                        break;
                    }
                }
                break;
            default:
                ((NetworkChangeNotifierAutoDetect) obj2).lambda$runOnThread$0((Runnable) obj);
                break;
        }
    }
}
