package za;

import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import g1.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public d f141459a;

    /* renamed from: b, reason: collision with root package name */
    public e f141460b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.e f141461c;

    /* renamed from: d, reason: collision with root package name */
    public ViewPager2 f141462d;

    /* renamed from: e, reason: collision with root package name */
    public long f141463e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f141464f;

    public f(j jVar) {
        this.f141464f = jVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public final void b(boolean z13) {
        int i13;
        Fragment fragment;
        j jVar = this.f141464f;
        if (!jVar.f141467e.Q() && this.f141462d.f19932l.f19961f == 0) {
            p pVar = jVar.f141468f;
            if (pVar.h() || jVar.e() == 0 || (i13 = this.f141462d.f19924d) >= jVar.e()) {
                return;
            }
            long f13 = jVar.f(i13);
            if ((f13 != this.f141463e || z13) && (fragment = (Fragment) pVar.c(f13)) != null && fragment.isAdded()) {
                this.f141463e = f13;
                w0 w0Var = jVar.f141467e;
                w0Var.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(w0Var);
                ArrayList arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i14 = 0; i14 < pVar.m(); i14++) {
                    long i15 = pVar.i(i14);
                    Fragment fragment3 = (Fragment) pVar.n(i14);
                    if (fragment3.isAdded()) {
                        if (i15 != this.f141463e) {
                            r rVar = r.STARTED;
                            aVar.n(fragment3, rVar);
                            arrayList.add(jVar.f141472j.d(fragment3, rVar));
                        } else {
                            fragment2 = fragment3;
                        }
                        fragment3.setMenuVisibility(i15 == this.f141463e);
                    }
                }
                if (fragment2 != null) {
                    r rVar2 = r.RESUMED;
                    aVar.n(fragment2, rVar2);
                    arrayList.add(jVar.f141472j.d(fragment2, rVar2));
                }
                if (aVar.f18266a.isEmpty()) {
                    return;
                }
                aVar.f();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    jVar.f141472j.getClass();
                    c.e(list);
                }
            }
        }
    }
}
