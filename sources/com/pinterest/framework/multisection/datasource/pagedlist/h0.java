package com.pinterest.framework.multisection.datasource.pagedlist;

import a.cb;
import a.k1;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import ao2.v0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ow;
import com.pinterest.api.model.pw;
import com.pinterest.api.model.qw;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.repository.TypedId;
import df.j1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g1;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import so.oa;
import x02.y1;
import x02.z1;

/* loaded from: classes5.dex */
public abstract class h0 implements x {
    public boolean A;
    public boolean B;
    public boolean C;
    public final xk2.v D;

    /* renamed from: a, reason: collision with root package name */
    public final String f49111a;

    /* renamed from: b, reason: collision with root package name */
    public final xt1.c f49112b;

    /* renamed from: c, reason: collision with root package name */
    public com.pinterest.hairball.network.e f49113c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f49114d;

    /* renamed from: e, reason: collision with root package name */
    public final lk1.a f49115e;

    /* renamed from: f, reason: collision with root package name */
    public final ow f49116f;

    /* renamed from: g, reason: collision with root package name */
    public final x12.a f49117g;

    /* renamed from: h, reason: collision with root package name */
    public final xt1.d f49118h;

    /* renamed from: i, reason: collision with root package name */
    public final long f49119i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f49120j;

    /* renamed from: k, reason: collision with root package name */
    public qz.f0 f49121k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f49122l;

    /* renamed from: m, reason: collision with root package name */
    public xj2.c f49123m;

    /* renamed from: n, reason: collision with root package name */
    public ao2.x f49124n;

    /* renamed from: o, reason: collision with root package name */
    public final xj2.b f49125o;

    /* renamed from: p, reason: collision with root package name */
    public final ho2.c f49126p;

    /* renamed from: q, reason: collision with root package name */
    public List f49127q;

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.r f49128r;

    /* renamed from: s, reason: collision with root package name */
    public final uk2.f f49129s;

    /* renamed from: t, reason: collision with root package name */
    public String f49130t;

    /* renamed from: u, reason: collision with root package name */
    public final rr0.a f49131u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f49132v;

    /* renamed from: w, reason: collision with root package name */
    public final xj2.b f49133w;

    /* renamed from: x, reason: collision with root package name */
    public final wt1.f0 f49134x;

    /* renamed from: y, reason: collision with root package name */
    public final long f49135y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f49136z;

    public h0(String remoteUrl, ke0.a[] modelDeserializers, com.pinterest.hairball.network.e eVar, rr0.a aVar, z1 cache, lk1.a aVar2, x12.a pagedListService, xt1.d dVar, long j13, int i13) {
        xt1.a modelUpdatesSourceProvider = xt1.a.f135918a;
        eVar = (i13 & 8) != 0 ? null : eVar;
        aVar = (i13 & 16) != 0 ? null : aVar;
        cache = (i13 & 32) != 0 ? new z1() : cache;
        aVar2 = (i13 & 64) != 0 ? null : aVar2;
        ow modelStorage = new ow();
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            Context context = kb0.a.f79058b;
            pagedListService = (x12.a) ((oa) ((x12.b) j1.b0(x12.b.class, m60.f0.W()))).f113927t7.get();
        }
        dVar = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : dVar;
        j13 = (i13 & 1024) != 0 ? 0L : j13;
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(modelDeserializers, "modelDeserializers");
        Intrinsics.checkNotNullParameter(modelUpdatesSourceProvider, "modelUpdatesSourceProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        this.f49111a = remoteUrl;
        this.f49112b = modelUpdatesSourceProvider;
        this.f49113c = eVar;
        this.f49114d = cache;
        this.f49115e = aVar2;
        this.f49116f = modelStorage;
        this.f49117g = pagedListService;
        this.f49118h = dVar;
        this.f49119i = j13;
        this.f49120j = new LinkedHashMap();
        this.f49122l = new ArrayDeque();
        xj2.e eVar2 = new xj2.e(ck2.i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar2, "empty(...)");
        this.f49123m = eVar2;
        this.f49124n = ue.c.b();
        this.f49125o = new xj2.b();
        ko2.f fVar = v0.f20219a;
        this.f49126p = dl2.b.b(kotlin.coroutines.g.d(((bo2.e) ho2.q.f69782a).f23612f, ue.c.b()));
        this.f49127q = kotlin.collections.q0.f80391a;
        this.f49128r = new j0();
        this.f49129s = cb.r("create(...)");
        this.f49132v = new LinkedHashMap();
        this.f49133w = new xj2.b();
        this.f49135y = 1800000L;
        this.f49136z = true;
        this.D = xk2.m.b(new yj1.d(this, 4));
        for (ke0.a aVar3 : modelDeserializers) {
            this.f49132v.put(aVar3.f79285a, aVar3);
        }
        this.f49131u = aVar == null ? new rr0.b() : aVar;
        this.f49134x = new wt1.f0(this);
    }

    public final void B(com.pinterest.hairball.network.a requestBuilder, Function1 onSuccess, Function1 onError, Function1 function1) {
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (requestBuilder instanceof com.pinterest.hairball.network.c) {
            xj2.c cVar = (xj2.c) ((com.pinterest.hairball.network.c) requestBuilder).execute(new wk1.l(18, onSuccess), new wk1.l(19, onError));
            if (function1 != null) {
                function1.invoke(cVar);
                return;
            }
            return;
        }
        throw new IllegalAccessError("Cannot use the extension function with " + kotlin.jvm.internal.k0.f80436a.b(getClass()));
    }

    public dl1.s B2(int i13) {
        return getItem(i13);
    }

    public boolean C() {
        return false;
    }

    public boolean D() {
        return false;
    }

    public gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return null;
    }

    public String F() {
        StringBuilder sb3 = new StringBuilder(this.f49111a);
        qz.f0 N = N();
        if (N != null) {
            sb3.append("?");
            sb3.append(N.toString());
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public final int G() {
        Iterator it = this.f49127q.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((dl1.s) it.next()) instanceof f30) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public final Map H() {
        return this.f49120j;
    }

    @Override // nr0.a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public dl1.s getItem(int i13) {
        return (dl1.s) CollectionsKt.U(i13, this.f49127q);
    }

    @Override // nr0.a
    public final void I0(int i13, nx.r0 provide) {
        Intrinsics.checkNotNullParameter(provide, "provide");
        this.f49134x.I0(i13, provide);
    }

    public final qw J(int i13) {
        Map map;
        if (i13 < 0 || i13 >= this.f49127q.size()) {
            throw new IndexOutOfBoundsException(i13 + " is not in the bounded range for model sizes.");
        }
        pw pwVar = qw.Companion;
        Class<?> cls = this.f49127q.get(i13).getClass();
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        rl2.d type = l0Var.b(cls);
        pwVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        map = qw.lookupByClass;
        qw qwVar = (qw) map.get(type);
        if (qwVar != null) {
            return qwVar;
        }
        throw new IllegalStateException("Register " + l0Var.b(this.f49127q.get(i13).getClass()) + " into ModelType");
    }

    public boolean K() {
        return this.f49136z;
    }

    @Override // sq0.e0
    public final uj2.q K1() {
        d51.a aVar = new d51.a(29, a.f49077t);
        uk2.f fVar = this.f49129s;
        fVar.getClass();
        int i13 = 2;
        jk2.x xVar = new jk2.x(new jk2.x(fVar, aVar, i13).t(new h(1, new p01.c(this, 5))), new b22.f(0, new p01.c(this, 6)), i13);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        return xVar;
    }

    public s92.i L() {
        return null;
    }

    public com.pinterest.hairball.network.e M(kotlin.jvm.internal.r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        com.pinterest.hairball.network.e eVar = this.f49113c;
        if (eVar != null) {
            return eVar;
        }
        s92.i L = L();
        RetrofitPagedRemoteRequest retrofitPagedRemoteRequest = new RetrofitPagedRemoteRequest(this.f49132v, this.f49116f, null, this.f49115e, this.f49117g, this.f49118h, L, this.f49120j, null, RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER, null);
        this.f49113c = retrofitPagedRemoteRequest;
        return retrofitPagedRemoteRequest;
    }

    public qz.f0 N() {
        return this.f49121k;
    }

    public boolean O() {
        return this instanceof com.pinterest.feature.pin.closeup.datasource.l;
    }

    public final void P(int i13, dl1.s item) {
        Intrinsics.checkNotNullParameter(item, "item");
        vb0.j.f125466a.S(i13 >= 0 && i13 <= this.f49127q.size(), i13 + " is out of range", new Object[0]);
        Q(i13, kotlin.collections.e0.b(item));
    }

    public final void Q(int i13, List itemsToInsert) {
        Intrinsics.checkNotNullParameter(itemsToInsert, "itemsToInsert");
        vb0.j.f125466a.S(i13 >= 0 && i13 <= this.f49127q.size(), i13 + " is out of range", new Object[0]);
        V(new z(itemsToInsert, i13));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void R(boolean r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.framework.multisection.datasource.pagedlist.h0.R(boolean):void");
    }

    @Override // yq0.a0
    public final yk1.m S(int i13) {
        return this.f49134x.S(i13);
    }

    public void T(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        int i13 = 0;
        for (Object obj : this.f49127q) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            if (Intrinsics.d(model.getUid(), ((dl1.s) obj).getUid())) {
                u1(i13, model);
            }
            i13 = i14;
        }
    }

    public final void U() {
        ArrayDeque arrayDeque = this.f49122l;
        if (arrayDeque.isEmpty()) {
            return;
        }
        Object first = arrayDeque.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "getFirst(...)");
        f0 f0Var = (f0) first;
        if (f0Var instanceof e0) {
            int size = this.f49127q.size();
            e0 e0Var = (e0) f0Var;
            int i13 = e0Var.f49096b;
            if (i13 < 0 || i13 >= size) {
                arrayDeque.removeFirst();
                return;
            }
            ArrayList H0 = CollectionsKt.H0(this.f49127q);
            dl1.s sVar = e0Var.f49097c;
            int i14 = e0Var.f49096b;
            H0.set(i14, sVar);
            x(H0, f0Var.f49102a, e0Var.f49098d ? g1.b(Integer.valueOf(i14)) : s0.f80394a, new r81.h(f0Var, 3));
            return;
        }
        int i15 = 4;
        if (f0Var instanceof d0) {
            List F0 = CollectionsKt.F0(((d0) f0Var).f49094b);
            x(F0, f0Var.f49102a, s0.f80394a, new fk1.u(F0, i15));
            return;
        }
        boolean z13 = true;
        boolean z14 = true;
        if (f0Var instanceof a0) {
            ArrayList H02 = CollectionsKt.H0(this.f49127q);
            a0 a0Var = (a0) f0Var;
            dl1.s sVar2 = (dl1.s) H02.remove(a0Var.f49082b);
            H02.add(a0Var.f49083c, sVar2);
            x(H02, f0Var.f49102a, s0.f80394a, new r81.i(sVar2, f0Var, z14 ? 1 : 0));
            return;
        }
        if (f0Var instanceof y) {
            int size2 = this.f49127q.size();
            ArrayList H03 = CollectionsKt.H0(this.f49127q);
            H03.addAll(size2, ((y) f0Var).f49200b);
            x(H03, f0Var.f49102a, s0.f80394a, new r81.j(f0Var, size2, z13 ? 1 : 0));
            return;
        }
        if (f0Var instanceof z) {
            int size3 = this.f49127q.size();
            z zVar = (z) f0Var;
            int i16 = zVar.f49202c;
            vb0.j.f125466a.S(i16 >= 0 && i16 <= size3, "Insert index is out of range", new Object[0]);
            int size4 = this.f49127q.size();
            int i17 = zVar.f49202c;
            if (i17 < 0 || i17 > size4) {
                arrayDeque.removeFirst();
                return;
            }
            ArrayList H04 = CollectionsKt.H0(this.f49127q);
            H04.addAll(i17, zVar.f49201b);
            x(H04, f0Var.f49102a, s0.f80394a, new r81.h(f0Var, i15));
            return;
        }
        int i18 = 5;
        if (f0Var instanceof b0) {
            ArrayList H05 = CollectionsKt.H0(this.f49127q);
            b0 b0Var = (b0) f0Var;
            H05.subList(b0Var.f49086b, b0Var.f49087c).clear();
            x(H05, f0Var.f49102a, s0.f80394a, new r81.h(f0Var, i18));
            return;
        }
        if (f0Var instanceof c0) {
            List list = this.f49127q;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.d(((c0) f0Var).f49089b, ((dl1.s) obj).getUid())) {
                    arrayList.add(obj);
                }
            }
            x(arrayList, f0Var.f49102a, s0.f80394a, new fk1.u(arrayList, i18));
        }
    }

    public final void V(f0 f0Var) {
        ArrayDeque arrayDeque = this.f49122l;
        arrayDeque.addLast(f0Var);
        if (arrayDeque.size() == 1) {
            U();
        }
    }

    public final void W(int i13, wt1.f viewBinderInstance, Function2 modelConverter) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        Intrinsics.checkNotNullParameter(modelConverter, "modelConverter");
        this.f49134x.o(i13, new xk1.d(1, viewBinderInstance, modelConverter));
    }

    public void X(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        V(new c0(modelId));
    }

    @Override // vq0.f
    public final Set X1() {
        return this.f49134x.f131112c;
    }

    public final void Y(int i13, int i14) {
        boolean z13 = i13 >= 0 && i13 < this.f49127q.size();
        m60.f0 f0Var = vb0.j.f125466a;
        f0Var.S(z13, a.a.e("startIndex:", i13, " is out of range"), new Object[0]);
        f0Var.S(i14 >= 0 && i14 <= this.f49127q.size(), a.a.e("endIndex:", i14, " is out of range"), new Object[0]);
        V(new b0(i13, i14));
    }

    public void Z() {
        this.f49122l.clear();
        this.f49123m.dispose();
        this.f49124n.cancel((CancellationException) null);
        this.A = false;
        boolean z13 = this.f49128r instanceof l0;
        uk2.f fVar = this.f49129s;
        if (z13) {
            fVar.c(new wt1.w());
            return;
        }
        z();
        a0(kotlin.collections.q0.f80391a);
        this.f49128r = new j0();
        fVar.c(new wt1.v());
    }

    @Override // sq0.e0
    public int a() {
        return this.f49127q.size();
    }

    public final void a0(List itemsToSet) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        b0(itemsToSet, true);
    }

    @Override // wt1.c
    public void b(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Parcelable[] parcelableArray = bundle.getParcelableArray("TYPED_IDS-" + F());
        if (parcelableArray != null) {
            String bookmark = bundle.getString("BOOKMARK-" + F());
            if (bookmark == null) {
                bookmark = "";
            }
            ArrayList arrayList = new ArrayList();
            int length = parcelableArray.length;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                Parcelable parcelable = parcelableArray[i14];
                TypedId typedId = parcelable instanceof TypedId ? (TypedId) parcelable : null;
                if (typedId != null) {
                    arrayList.add(typedId);
                }
                i14++;
            }
            TypedId[] it = (TypedId[]) arrayList.toArray(new TypedId[0]);
            Intrinsics.checkNotNullParameter(bookmark, "bookmark");
            Intrinsics.checkNotNullParameter(it, "it");
            this.f49128r = new l0(bookmark, it);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<String> stringArrayList = bundle.getStringArrayList("MODEL_TYPES-" + F());
            if (stringArrayList != null) {
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("SEQUENCE_IDS-" + F());
                if (integerArrayList != null && stringArrayList.size() == integerArrayList.size()) {
                    for (Object obj : stringArrayList) {
                        int i15 = i13 + 1;
                        if (i13 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        String str = (String) obj;
                        Intrinsics.f(str);
                        Integer num = integerArrayList.get(i13);
                        Intrinsics.checkNotNullExpressionValue(num, "get(...)");
                        linkedHashMap.put(str, num);
                        i13 = i15;
                    }
                }
            }
            c0(linkedHashMap);
        }
    }

    public void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        V(new d0(itemsToSet, z13));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.x, nr0.a
    public final void c(int[] ids, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f49134x.c(ids, viewBinderInstance);
    }

    public final void c0(Map modelUpdatesSequenceIds) {
        Intrinsics.checkNotNullParameter(modelUpdatesSequenceIds, "modelUpdatesSequenceIds");
        xj2.b bVar = this.f49133w;
        bVar.d();
        for (String str : this.f49132v.keySet()) {
            dl1.l a13 = ((xt1.a) this.f49112b).a(str);
            if (a13 != null) {
                Integer num = (Integer) modelUpdatesSequenceIds.get(str);
                bVar.a(a13.E(num != null ? num.intValue() : a13.t()).F(new wk1.l(22, new p01.c(this, 7)), new wk1.l(23, a.f49078u), ck2.i.f27923c, ck2.i.f27924d));
            }
        }
        u(bVar);
    }

    @Override // vq0.f
    public final void clear() {
        Z();
    }

    @Override // qr0.d
    public final List d() {
        return CollectionsKt.F0(this.f49127q);
    }

    @Override // vq0.e
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final void u1(int i13, dl1.s item) {
        Intrinsics.checkNotNullParameter(item, "item");
        vb0.j.f125466a.S(i13 >= 0 && i13 < this.f49127q.size(), i13 + " is out of range", new Object[0]);
        V(new e0(i13, item, 12));
    }

    @Override // nr0.a
    public final boolean d2(int i13) {
        return i13 >= 0 && i13 < this.f49127q.size();
    }

    @Override // qr0.d
    public String g() {
        return this.f49111a;
    }

    @Override // vq0.f
    public void i2() {
        z();
        this.f49128r = new m0();
        n();
    }

    @Override // vq0.f
    public final void j1() {
        if (t0()) {
            n();
        }
    }

    @Override // qr0.d
    public final String k() {
        return this.f49130t;
    }

    @Override // wt1.c
    public void l(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (K()) {
            List list = this.f49127q;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((dl1.s) obj).getUid() != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != this.f49127q.size()) {
                List list2 = this.f49127q;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((dl1.s) obj2).getUid() == null) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((dl1.s) it.next()).getClass().getSimpleName());
                }
                Set J0 = CollectionsKt.J0(arrayList3);
                String b13 = kotlin.text.t.b("\n                    PagedListInvalidModelsError. Some models don't have UIDs. They won't be saved to the bundle\n                    pagedListType: " + getClass().getSimpleName() + "\n                    invalidModels: " + CollectionsKt.Z(J0, null, null, null, 0, null, null, 63) + "\n                ");
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(new IllegalStateException("PagedListInvalidModelsError. Some models don't have UIDs. They won't be saved to the bundle"), b13, tb0.p.PLATFORM);
            }
            if (!arrayList.isEmpty()) {
                TypedId[] typedIdArr = new TypedId[arrayList.size()];
                Iterator it2 = arrayList.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    String uid = ((dl1.s) next).getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    typedIdArr[i13] = new TypedId(uid, J(i13));
                    i13 = i14;
                }
                bundle.putParcelableArray(a.a.j("TYPED_IDS-", F()), typedIdArr);
                kotlin.jvm.internal.r rVar = this.f49128r;
                if (rVar instanceof k0) {
                    bundle.putString(a.a.j("BOOKMARK-", F()), ((k0) rVar).f49144f);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<Integer> arrayList5 = new ArrayList<>();
                for (String str : this.f49132v.keySet()) {
                    dl1.l a13 = ((xt1.a) this.f49112b).a(str);
                    if (a13 != null) {
                        arrayList4.add(str);
                        arrayList5.add(Integer.valueOf(a13.t()));
                    }
                }
                bundle.putStringArrayList("MODEL_TYPES-" + F(), arrayList4);
                bundle.putIntegerArrayList("SEQUENCE_IDS-" + F(), arrayList5);
            }
        }
    }

    @Override // wt1.d0
    public final uj2.q m() {
        return this.f49129s;
    }

    @Override // wt1.b
    public void n() {
        uj2.b0 bVar;
        if (i()) {
            if (K() && C() && !this.B && (this.f49128r instanceof j0)) {
                this.B = true;
                String remoteURL = F();
                z1 z1Var = this.f49114d;
                z1Var.getClass();
                Intrinsics.checkNotNullParameter(remoteURL, "remoteURL");
                if (kotlin.text.z.j(remoteURL)) {
                    bVar = uj2.b0.g(new IllegalArgumentException("Missing remoteURL"));
                    Intrinsics.checkNotNullExpressionValue(bVar, "error(...)");
                } else {
                    String a13 = z1.a(remoteURL);
                    kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
                    Object obj = z1Var.f131549a.get(a13);
                    j0Var.f80434a = obj;
                    if (obj == null || ((mc.a) obj).f86882d < System.currentTimeMillis()) {
                        bVar = new kk2.b(new uv0.a(16, a13, z1Var), 0);
                        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
                    } else {
                        kk2.c cVar = new kk2.c(new k1(j0Var, 24), 0);
                        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
                        bVar = cVar;
                    }
                }
                y1 y1Var = (y1) bVar.d();
                if (!Intrinsics.d(y1Var, y1.f131537d)) {
                    TypedId[] typedIdArr = y1Var.f131538a;
                    if (true ^ (typedIdArr.length == 0)) {
                        String str = y1Var.f131539b;
                        if (str == null) {
                            str = "";
                        }
                        this.f49128r = new l0(str, typedIdArr);
                    }
                }
            }
            R(false);
        }
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        boolean z13 = i13 >= 0 && i13 < this.f49127q.size();
        m60.f0 f0Var = vb0.j.f125466a;
        f0Var.S(z13, a.a.e("fromPosition:", i13, " is out of range"), new Object[0]);
        f0Var.S(i14 >= 0 && i14 < this.f49127q.size(), a.a.e("toPosition:", i14, " is out of range"), new Object[0]);
        V(new a0(i13, i14));
    }

    @Override // nr0.a, vq0.f
    public final void o(int i13, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f49134x.o(i13, viewBinderInstance);
    }

    public void onUnbind() {
        this.f49122l.clear();
        this.f49123m.dispose();
        this.f49125o.d();
        this.f49124n.cancel((CancellationException) null);
        dl2.b.E(this.f49126p, null);
        this.A = false;
    }

    @Override // yq0.a0
    public final void p(int i13, yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49134x.p(i13, view);
    }

    @Override // qr0.d
    public final String r() {
        kotlin.jvm.internal.r rVar = this.f49128r;
        return rVar instanceof k0 ? ((k0) rVar).f49144f : rVar instanceof l0 ? ((l0) rVar).f49148f : "";
    }

    @Override // vq0.e
    public final void removeItem(int i13) {
        vb0.j.f125466a.S(i13 >= 0 && i13 < this.f49127q.size(), i13 + " is out of range", new Object[0]);
        Y(i13, i13 + 1);
    }

    @Override // wk1.e
    public final boolean s() {
        return this.C;
    }

    @Override // wk1.e
    public final void t() {
        if (this.C) {
            this.C = false;
            this.f49129s.c(new wt1.z());
        }
    }

    @Override // vq0.f
    public final boolean t0() {
        if (this.A) {
            return true;
        }
        if (!i() || this.C) {
            return false;
        }
        kotlin.jvm.internal.r rVar = this.f49128r;
        if ((rVar instanceof j0) || (rVar instanceof m0)) {
            return true;
        }
        if (rVar instanceof k0) {
            return ((k0) rVar).f49144f.length() > 0;
        }
        if (rVar instanceof l0) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void u(xj2.c disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.f49125o.a(disposable);
    }

    @Override // vq0.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void j2(dl1.s item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List itemsToAppend = kotlin.collections.e0.b(item);
        Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
        w(itemsToAppend, true);
    }

    public void w(List itemsToAppend, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
        V(new y(itemsToAppend, z13));
    }

    public final void x(List list, boolean z13, Set set, Function1 function1) {
        uj2.b0 cVar = new kk2.c(new r81.b(this.f49127q, list, set, 1), 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            cVar = cVar.l(wj2.c.a());
        }
        xj2.c o13 = cVar.o(new wk1.l(20, new k1.b0(this, list, z13, function1, 19)), new wk1.l(21, new p01.c(this, 2)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        u(o13);
    }

    @Override // wk1.e
    public final void y() {
        if (this.C) {
            return;
        }
        this.f49129s.c(new wt1.j());
        this.C = true;
    }

    public final void z() {
        uj2.b gVar;
        String remoteURL = F();
        z1 z1Var = this.f49114d;
        z1Var.getClass();
        Intrinsics.checkNotNullParameter(remoteURL, "remoteURL");
        if (kotlin.text.z.j(remoteURL)) {
            gVar = uj2.b.g(new IllegalArgumentException("Missing remoteURL"));
            Intrinsics.checkNotNullExpressionValue(gVar, "error(...)");
        } else {
            gVar = new fk2.g(new qb1.a(8, z1.a(remoteURL), z1Var), 1);
            Intrinsics.checkNotNullExpressionValue(gVar, "fromAction(...)");
        }
        ek2.e eVar = new ek2.e(1);
        gVar.j(eVar);
        eVar.c();
    }
}
