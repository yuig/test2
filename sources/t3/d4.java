package t3;

import android.util.Log;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class d4 implements androidx.lifecycle.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f115941b;

    public /* synthetic */ d4(Object obj, int i13) {
        this.f115940a = i13;
        this.f115941b = obj;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z source, androidx.lifecycle.q event) {
        int i13 = this.f115940a;
        Object obj = this.f115941b;
        switch (i13) {
            case 0:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj;
                if (event == androidx.lifecycle.q.ON_DESTROY) {
                    abstractComposeView.g();
                    break;
                }
                break;
            case 1:
                z9.p this$0 = (z9.p) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(source, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                this$0.f141271r = event.getTargetState();
                if (this$0.f141256c != null) {
                    Iterator<E> it = this$0.f141260g.iterator();
                    while (it.hasNext()) {
                        z9.k kVar = (z9.k) it.next();
                        kVar.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        kVar.f141213d = event.getTargetState();
                        kVar.c();
                    }
                    break;
                }
                break;
            default:
                ca.k this$02 = (ca.k) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.q.ON_DESTROY) {
                    Fragment fragment = (Fragment) source;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) this$02.b().f141228f.f55726a.getValue()) {
                        if (Intrinsics.d(((z9.k) obj3).f141215f, fragment.getTag())) {
                            obj2 = obj3;
                        }
                    }
                    z9.k kVar2 = (z9.k) obj2;
                    if (kVar2 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + kVar2 + " due to fragment " + source + " lifecycle reaching DESTROYED");
                        }
                        this$02.b().b(kVar2);
                        break;
                    }
                }
                break;
        }
    }
}
