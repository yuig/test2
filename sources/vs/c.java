package vs;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends androidx.recyclerview.widget.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f126473b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f126474c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f126475d;

    public c(int i13, List oldList, List newList) {
        this.f126473b = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            this.f126474c = oldList;
            this.f126475d = newList;
            return;
        }
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            this.f126474c = oldList;
            this.f126475d = newList;
            return;
        }
        if (i13 != 3) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            this.f126474c = oldList;
            this.f126475d = newList;
            return;
        }
        Intrinsics.checkNotNullParameter(oldList, "oldItems");
        Intrinsics.checkNotNullParameter(newList, "newItems");
        this.f126474c = oldList;
        this.f126475d = newList;
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean a(int i13, int i14) {
        int i15 = this.f126473b;
        Object obj = this.f126475d;
        Object obj2 = this.f126474c;
        switch (i15) {
            case 0:
                Pair pair = (Pair) CollectionsKt.U(i13, (List) obj2);
                String str = pair != null ? (String) pair.f80346a : null;
                Pair pair2 = (Pair) CollectionsKt.U(i14, (List) obj);
                return Intrinsics.d(str, pair2 != null ? (String) pair2.f80346a : null);
            case 1:
                return Intrinsics.d(((m21.a) ((List) obj2).get(i13)).c(), ((m21.a) ((List) obj).get(i14)).c());
            case 2:
                return ((pu0.r) ((List) obj2).get(i13)).e() == ((pu0.r) ((List) obj).get(i14)).e();
            case 3:
                zd1.g gVar = (zd1.g) CollectionsKt.U(i13, (List) obj2);
                zd1.g gVar2 = (zd1.g) CollectionsKt.U(i14, (List) obj);
                return Intrinsics.d(gVar != null ? gVar.f141716g : null, gVar2 != null ? gVar2.f141716g : null);
            default:
                return Intrinsics.d(CollectionsKt.F0(((h42.a) obj2).f67640a).get(i13), CollectionsKt.F0(((h42.a) obj).f67640a).get(i14));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (((com.pinterest.api.model.dk) ((pu0.p) r4).f101409k.getSpec()).getType() == ((com.pinterest.api.model.dk) ((pu0.p) r5).f101409k.getSpec()).getType()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (((pu0.q) r4).f101415k == ((pu0.q) r5).f101415k) goto L22;
     */
    @Override // androidx.recyclerview.widget.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f126473b
            java.lang.Object r1 = r3.f126475d
            java.lang.Object r2 = r3.f126474c
            switch(r0) {
                case 0: goto L97;
                case 1: goto L7e;
                case 2: goto L2e;
                case 3: goto Le;
                default: goto L9;
            }
        L9:
            boolean r4 = r3.a(r4, r5)
            return r4
        Le:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = kotlin.collections.CollectionsKt.U(r4, r2)
            zd1.g r4 = (zd1.g) r4
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = kotlin.collections.CollectionsKt.U(r5, r1)
            zd1.g r5 = (zd1.g) r5
            r0 = 0
            java.lang.Class<zd1.g> r1 = zd1.g.class
            if (r4 == 0) goto L25
            r4 = r1
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 == 0) goto L29
            r0 = r1
        L29:
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r0)
            return r4
        L2e:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r2.get(r4)
            pu0.r r4 = (pu0.r) r4
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r1.get(r5)
            pu0.r r5 = (pu0.r) r5
            boolean r0 = r4 instanceof pu0.p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6a
            boolean r0 = r5 instanceof pu0.p
            if (r0 == 0) goto L6a
            pu0.p r4 = (pu0.p) r4
            pu0.p r5 = (pu0.p) r5
            pu0.a r4 = r4.f101409k
            com.pinterest.api.model.ek r4 = r4.getSpec()
            com.pinterest.api.model.dk r4 = (com.pinterest.api.model.dk) r4
            com.pinterest.api.model.fk r4 = r4.getType()
            pu0.a r5 = r5.f101409k
            com.pinterest.api.model.ek r5 = r5.getSpec()
            com.pinterest.api.model.dk r5 = (com.pinterest.api.model.dk) r5
            com.pinterest.api.model.fk r5 = r5.getType()
            if (r4 != r5) goto L67
            goto L68
        L67:
            r1 = r2
        L68:
            r2 = r1
            goto L7d
        L6a:
            boolean r0 = r4 instanceof pu0.q
            if (r0 == 0) goto L7d
            boolean r0 = r5 instanceof pu0.q
            if (r0 == 0) goto L7d
            pu0.q r4 = (pu0.q) r4
            pu0.q r5 = (pu0.q) r5
            pu0.b r4 = r4.f101415k
            pu0.b r5 = r5.f101415k
            if (r4 != r5) goto L67
            goto L68
        L7d:
            return r2
        L7e:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r2.get(r4)
            java.lang.Class r4 = r4.getClass()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r1.get(r5)
            java.lang.Class r5 = r5.getClass()
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            return r4
        L97:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = kotlin.collections.CollectionsKt.U(r4, r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = kotlin.collections.CollectionsKt.U(r5, r1)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.c.c(int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.a0
    public final int h() {
        int i13 = this.f126473b;
        Object obj = this.f126475d;
        switch (i13) {
            case 0:
                return ((List) obj).size();
            case 1:
                return ((List) obj).size();
            case 2:
                return ((List) obj).size();
            case 3:
                return ((List) obj).size();
            default:
                return ((h42.a) obj).f67640a.size();
        }
    }

    @Override // androidx.recyclerview.widget.a0
    public final int i() {
        int i13 = this.f126473b;
        Object obj = this.f126474c;
        switch (i13) {
            case 0:
                return ((List) obj).size();
            case 1:
                return ((List) obj).size();
            case 2:
                return ((List) obj).size();
            case 3:
                return ((List) obj).size();
            default:
                return ((h42.a) obj).f67640a.size();
        }
    }

    public c(h42.a oldDisplayState, h42.a newDisplayState) {
        this.f126473b = 4;
        Intrinsics.checkNotNullParameter(oldDisplayState, "oldDisplayState");
        Intrinsics.checkNotNullParameter(newDisplayState, "newDisplayState");
        this.f126474c = oldDisplayState;
        this.f126475d = newDisplayState;
    }
}
