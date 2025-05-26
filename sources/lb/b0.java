package lb;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends so.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f82573k = kb.b0.h("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    public final j0 f82574b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82575c;

    /* renamed from: d, reason: collision with root package name */
    public final kb.q f82576d;

    /* renamed from: e, reason: collision with root package name */
    public final List f82577e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f82578f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f82579g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final List f82580h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82581i;

    /* renamed from: j, reason: collision with root package name */
    public bk.f f82582j;

    public b0(j0 j0Var, String str, kb.q qVar, List list, List list2) {
        this.f82574b = j0Var;
        this.f82575c = str;
        this.f82576d = qVar;
        this.f82577e = list;
        this.f82580h = list2;
        this.f82578f = new ArrayList(list.size());
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f82579g.addAll(((b0) it.next()).f82579g);
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (qVar == kb.q.REPLACE && ((kb.y0) list.get(i13)).f79055b.f117036u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String uuid = ((kb.y0) list.get(i13)).f79054a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.f82578f.add(uuid);
            this.f82579g.add(uuid);
        }
    }

    public static boolean l(b0 b0Var, HashSet hashSet) {
        hashSet.addAll(b0Var.f82578f);
        HashSet n13 = n(b0Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (n13.contains((String) it.next())) {
                return true;
            }
        }
        List list = b0Var.f82580h;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (l((b0) it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(b0Var.f82578f);
        return false;
    }

    public static HashSet n(b0 b0Var) {
        HashSet hashSet = new HashSet();
        List list = b0Var.f82580h;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((b0) it.next()).f82578f);
            }
        }
        return hashSet;
    }

    @Override // so.a
    public final kb.i0 b() {
        if (this.f82581i) {
            kb.b0.e().i(f82573k, "Already enqueued work ids (" + TextUtils.join(", ", this.f82578f) + ")");
        } else {
            j0 j0Var = this.f82574b;
            this.f82582j = tb.f.T(j0Var.f82606c.f78982m, "EnqueueRunnable_" + this.f82576d.name(), j0Var.f82608e.f125444a, new androidx.activity.e(this, 1));
        }
        return this.f82582j;
    }

    @Override // so.a
    public final b0 j(List list) {
        if (list.isEmpty()) {
            return this;
        }
        return new b0(this.f82574b, this.f82575c, kb.q.KEEP, list, Collections.singletonList(this));
    }

    public final boolean m() {
        return this.f82581i;
    }
}
