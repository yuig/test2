package vm0;

import android.animation.Animator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import rq.o0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f126205a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f126206b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f126207c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f126208d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f126209e;

    public c(a animationSpec, String name) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f126205a = animationSpec;
        this.f126208d = new LinkedHashSet();
        this.f126209e = new LinkedHashSet();
    }

    public static void a(c cVar, View view, boolean z13, long j13, int i13) {
        if ((i13 & 4) != 0) {
            j13 = 0;
        }
        b onAnimationStart = b.f126202j;
        b onAnimationEnd = b.f126203k;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAnimationStart, "onAnimationStart");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        if (z13 && (!cVar.f126208d.isEmpty())) {
            return;
        }
        if (z13 || !(!cVar.f126209e.isEmpty())) {
            a aVar = cVar.f126205a;
            view.animate().setStartDelay(j13).setDuration(aVar.f126200c).translationY(z13 ? aVar.f126198a : aVar.f126199b).setListener(new hk.b(onAnimationStart, onAnimationEnd, z13, cVar)).start();
        }
    }

    public static void b(LinkedHashSet linkedHashSet) {
        ArrayList Q = CollectionsKt.Q(CollectionsKt.F0(linkedHashSet));
        ArrayList arrayList = new ArrayList();
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Animator) next).isRunning()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).cancel();
        }
        linkedHashSet.clear();
    }

    public final void c() {
        d();
        b(this.f126208d);
        b(this.f126209e);
    }

    public final void d() {
        o0 o0Var = this.f126207c;
        if (o0Var != null) {
            RecyclerView recyclerView = this.f126206b;
            if (recyclerView != null) {
                recyclerView.w2(o0Var);
            }
            this.f126207c = null;
        }
        this.f126206b = null;
    }

    public final void e(RecyclerView scrollable, View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(scrollable, "scrollable");
        d();
        o0 o0Var = new o0(2, this, target);
        scrollable.o(o0Var);
        this.f126206b = scrollable;
        this.f126207c = o0Var;
    }
}
