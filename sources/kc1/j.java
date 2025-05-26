package kc1;

import android.app.Application;
import ao2.j0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.notifications.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import o82.i0;
import w41.q1;
import xs0.f0;

/* loaded from: classes5.dex */
public final class j extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final k22.m f79159c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f79160d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f79161e;

    /* renamed from: f, reason: collision with root package name */
    public final g01.a f79162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k22.m userService, b60.b activeUserManager, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f79159c = userService;
        this.f79160d = activeUserManager;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(7), new bt0.u(24), new o82.h(new androidx.appcompat.widget.q(this, 5)), false, null, null, null, null, "PronounChips", null, 760);
        g01.a d2 = pVar.d();
        this.f79162f = d2;
        l82.a0 a0Var = new l82.a0(scope);
        f0 stateTransformer = new f0((i0) d2.f63224a, 1);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f79161e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f79161e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f79161e.e();
    }

    public final void h(List list) {
        if (list == null) {
            wy0 f13 = ((b60.d) this.f79160d).f();
            list = f13 != null ? f13.h4() : null;
            if (list == null) {
                list = q0.f80391a;
            }
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ic1.y((String) it.next()));
        }
        Set J0 = CollectionsKt.J0(arrayList);
        l82.y.i(this.f79161e, new u(J0, J0, new o82.j0()), false, new y0(this, 29), 2);
    }
}
