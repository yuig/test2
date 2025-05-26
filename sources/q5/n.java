package q5;

import android.util.Log;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements androidx.lifecycle.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102484c;

    public /* synthetic */ n(int i13, Object obj, Object obj2) {
        this.f102482a = i13;
        this.f102483b = obj;
        this.f102484c = obj2;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z owner, androidx.lifecycle.q event) {
        int i13 = this.f102482a;
        Object obj = this.f102484c;
        Object obj2 = this.f102483b;
        switch (i13) {
            case 0:
                p pVar = (p) obj2;
                q qVar = (q) obj;
                pVar.getClass();
                if (event == androidx.lifecycle.q.ON_DESTROY) {
                    pVar.b(qVar);
                    break;
                }
                break;
            default:
                ca.k this$0 = (ca.k) obj2;
                z9.k entry = (z9.k) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(entry, "$entry");
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.q.ON_RESUME && ((List) this$0.b().f141227e.f55726a.getValue()).contains(entry)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching RESUMED");
                    }
                    this$0.b().b(entry);
                }
                if (event == androidx.lifecycle.q.ON_DESTROY) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
                    }
                    this$0.b().b(entry);
                    break;
                }
                break;
        }
    }
}
