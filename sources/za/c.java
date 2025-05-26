package za;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.r;
import com.pinterest.framework.screens.m;
import com.pinterest.navigation.Navigation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import je.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements ku1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141453a;

    /* renamed from: b, reason: collision with root package name */
    public List f141454b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c() {
        this((Navigation) null);
        this.f141453a = 4;
    }

    public static void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
    }

    public final void a(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f141454b.add(navigation);
    }

    public final void b(o oVar) {
        if (this.f141454b == null) {
            this.f141454b = new ArrayList();
        }
        for (int i13 = 0; i13 < this.f141454b.size(); i13++) {
            if (((o) this.f141454b.get(i13)).f75716a.f75729b > oVar.f75716a.f75729b) {
                this.f141454b.add(i13, oVar);
                return;
            }
        }
        this.f141454b.add(oVar);
    }

    public final void c(c cVar) {
        if (cVar.f141454b == null) {
            return;
        }
        if (this.f141454b == null) {
            this.f141454b = new ArrayList(cVar.f141454b.size());
        }
        Iterator it = cVar.f141454b.iterator();
        while (it.hasNext()) {
            b((o) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList d(Fragment fragment, r maxLifecycleState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f141454b.iterator();
        while (it.hasNext()) {
            ((h42.i) ((i) it.next())).getClass();
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(maxLifecycleState, "maxLifecycleState");
            if (maxLifecycleState == r.RESUMED) {
                d7.b.d((m) fragment);
            }
            arrayList.add(new h42.g());
        }
        return arrayList;
    }

    public final List f() {
        return this.f141454b;
    }

    public final String toString() {
        switch (this.f141453a) {
            case 1:
                if (this.f141454b == null) {
                    return "";
                }
                StringBuilder sb3 = new StringBuilder();
                Iterator it = this.f141454b.iterator();
                while (it.hasNext()) {
                    sb3.append(((o) it.next()).toString());
                    sb3.append('\n');
                }
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int i13) {
        this();
        this.f141453a = i13;
        if (i13 == 1) {
            this.f141454b = null;
        } else if (i13 != 2) {
            if (i13 != 4) {
                this.f141454b = new CopyOnWriteArrayList();
            }
        }
    }

    public c(Navigation navigation) {
        this.f141453a = 4;
        ArrayList arrayList = new ArrayList();
        this.f141454b = arrayList;
        if (navigation != null) {
            arrayList.add(navigation);
        }
    }
}
