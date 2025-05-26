package d12;

import br1.a0;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.ow;
import com.pinterest.api.model.qw;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import dl1.l;
import dl1.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import or1.j;
import uj2.q;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final gw f53634a;

    /* renamed from: b, reason: collision with root package name */
    public final se2.a f53635b;

    /* renamed from: c, reason: collision with root package name */
    public final se2.a f53636c;

    /* renamed from: d, reason: collision with root package name */
    public final se2.a f53637d;

    /* renamed from: e, reason: collision with root package name */
    public final se2.a f53638e;

    /* renamed from: f, reason: collision with root package name */
    public final se2.a f53639f;

    /* renamed from: g, reason: collision with root package name */
    public final v f53640g;

    public h(gw modelHelper, se2.a boardRepository, se2.a boardSectionRepository, se2.a interestRepository, se2.a pinRepository, se2.a userRepository) {
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(interestRepository, "interestRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f53634a = modelHelper;
        this.f53635b = boardRepository;
        this.f53636c = boardSectionRepository;
        this.f53637d = interestRepository;
        this.f53638e = pinRepository;
        this.f53639f = userRepository;
        this.f53640g = m.b(e.f53627i);
    }

    public final List b(qw modelType, ArrayList uids) {
        Intrinsics.checkNotNullParameter(modelType, "modelType");
        Intrinsics.checkNotNullParameter(uids, "uids");
        int i13 = b.f53620a[modelType.ordinal()];
        t tVar = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? null : (t) ((bf2.b) this.f53636c).get() : (t) ((bf2.b) this.f53637d).get() : (t) ((bf2.b) this.f53639f).get() : (t) ((bf2.b) this.f53635b).get() : (t) ((bf2.b) this.f53638e).get();
        if (tVar != null || modelType != qw.STORY) {
            List list = tVar != null ? (List) ((l) tVar).N(uids).d() : null;
            return list == null ? q0.f80391a : list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = uids.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f53634a.getClass();
            vh vhVar = str == null ? null : (vh) ew.f37362f.get(str);
            if (vhVar != null) {
                arrayList.add(vhVar);
            }
        }
        return arrayList;
    }

    public final void c(ow modelStorage, gl1.d fallbackScheduler) {
        Map n13;
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        Intrinsics.checkNotNullParameter(fallbackScheduler, "fallbackScheduler");
        synchronized (modelStorage) {
            n13 = z0.n(modelStorage.f40825a);
            modelStorage.f40825a.clear();
        }
        for (Map.Entry entry : n13.entrySet()) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            if (Intrinsics.d(cls, v7.class)) {
                Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.Board>");
                e(dl2.b.t(list), this.f53635b);
            } else if (Intrinsics.d(cls, ba.class)) {
                Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.BoardSection>");
                e(dl2.b.t(list), this.f53636c);
            } else if (Intrinsics.d(cls, zs.class)) {
                Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.Interest>");
                e(dl2.b.t(list), this.f53637d);
            } else if (Intrinsics.d(cls, f30.class)) {
                Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.Pin>");
                e(dl2.b.t(list), this.f53638e);
            } else if (Intrinsics.d(cls, wy0.class)) {
                Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.User>");
                e(dl2.b.t(list), this.f53639f);
            } else if (Intrinsics.d(cls, vh.class)) {
                d(fallbackScheduler, new f(this, list));
            } else if (Intrinsics.d(cls, v10.class)) {
                d(fallbackScheduler, new g(this, list, 0));
            } else if (Intrinsics.d(cls, f3.class)) {
                d(fallbackScheduler, new f(list, this));
            } else if (Intrinsics.d(cls, mv.class)) {
                d(fallbackScheduler, new g(this, list, 1));
            }
        }
    }

    public final void d(gl1.d dVar, Function0 function0) {
        Object value = this.f53640g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((q) value).I(1L).F(new j(17, new a0(2, dVar, function0)), new j(18, c.f53622k), ck2.i.f27923c, ck2.i.f27924d);
    }

    public final void e(List list, se2.a aVar) {
        Object value = this.f53640g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((q) value).I(1L).F(new j(15, new a0(3, aVar, list)), new j(16, c.f53624m), ck2.i.f27923c, ck2.i.f27924d);
    }
}
