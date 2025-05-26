package br1;

import am2.w0;
import dl1.l0;
import dl1.m0;
import dl1.n0;
import dl1.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jk2.j1;
import kh2.g2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23759i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f23760j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f23761k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i13, Object obj, Object obj2) {
        super(1);
        this.f23759i = i13;
        this.f23760j = obj;
        this.f23761k = obj2;
    }

    public final am2.g b(ym2.g name) {
        int i13 = this.f23759i;
        Object obj = this.f23761k;
        Object obj2 = this.f23760j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(name, "name");
                mm2.o oVar = (mm2.o) obj2;
                boolean contains = ((Set) oVar.f87715r.invoke()).contains(name);
                am2.g gVar = oVar.f87711n;
                if (contains) {
                    rg.a aVar = (rg.a) obj;
                    fm2.b bVar = ((lm2.a) aVar.f107929a).f83932b;
                    ym2.b f13 = fn2.d.f(gVar);
                    Intrinsics.f(f13);
                    ym2.b d2 = f13.d(name);
                    Intrinsics.checkNotNullExpressionValue(d2, "createNestedClassId(...)");
                    gm2.q a13 = bVar.a(new im2.q(d2, oVar.f87712o, 2));
                    if (a13 == null) {
                        return null;
                    }
                    mm2.i classDescriptor = new mm2.i(aVar, gVar, a13, null);
                    ((im2.r) ((lm2.a) aVar.f107929a).f83949s).getClass();
                    Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
                    return classDescriptor;
                }
                if (((Set) oVar.f87716s.invoke()).contains(name)) {
                    rg.a aVar2 = (rg.a) obj;
                    yk2.b bVar2 = new yk2.b();
                    ((gn2.a) ((lm2.a) aVar2.f107929a).f83954x).c(aVar2, gVar, name, bVar2);
                    yk2.b a14 = kotlin.collections.e0.a(bVar2);
                    int b13 = a14.b();
                    if (b13 == 0) {
                        return null;
                    }
                    if (b13 == 1) {
                        return (am2.g) CollectionsKt.s0(a14);
                    }
                    throw new IllegalStateException(("Multiple classes with same name are generated: " + a14).toString());
                }
                gm2.w wVar = (gm2.w) ((Map) oVar.f87717t.invoke()).get(name);
                if (wVar == null) {
                    return null;
                }
                rg.a aVar3 = (rg.a) obj;
                on2.u c13 = aVar3.c();
                g2 g2Var = new g2(oVar, 16);
                on2.q qVar = (on2.q) c13;
                qVar.getClass();
                return dm2.v.u0(aVar3.c(), oVar.f87711n, name, new on2.l(qVar, g2Var), dl2.b.v2(aVar3, wVar), ((fm2.f) ((lm2.a) aVar3.f107929a).f83940j).b(wVar));
            default:
                Intrinsics.checkNotNullParameter(name, "name");
                com.google.firebase.messaging.q qVar2 = (com.google.firebase.messaging.q) obj2;
                tm2.v vVar = (tm2.v) ((Map) qVar2.f33803a).get(name);
                if (vVar == null) {
                    return null;
                }
                nn2.j jVar = (nn2.j) obj;
                return dm2.v.u0(jVar.f91601l.d(), jVar, name, (on2.s) qVar2.f33805c, new nn2.a(jVar.f91601l.d(), new xh2.a(3, jVar, vVar)), w0.f15602a);
        }
    }

    public final void e(Boolean bool) {
        dl1.s a13;
        String uid;
        int i13 = this.f23759i;
        int i14 = 3;
        Object obj = this.f23761k;
        Object obj2 = this.f23760j;
        switch (i13) {
            case 2:
                ((gl1.d) obj2).k(new t3.a0(3, (Function0) obj));
                break;
            default:
                List models = (List) obj;
                dl1.l lVar = (dl1.l) ((dl1.t) ((bf2.b) ((se2.a) obj2)).get());
                lVar.getClass();
                Intrinsics.checkNotNullParameter(models, "models");
                Intrinsics.checkNotNullParameter(models, "models");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : models) {
                    dl1.s sVar = (dl1.s) obj3;
                    if (lVar.f55272e.b(sVar) && (uid = sVar.getUid()) != null && !kotlin.text.z.j(uid)) {
                        arrayList.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dl1.s sVar2 = (dl1.s) it.next();
                    String uid2 = sVar2.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    dl1.s sVar3 = (dl1.s) linkedHashMap.get(sVar2.getUid());
                    if (sVar3 != null && (a13 = lVar.f55273f.a(sVar3, sVar2)) != null) {
                        sVar2 = a13;
                    }
                    linkedHashMap.put(uid2, sVar2);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add((dl1.s) ((Map.Entry) it2.next()).getValue());
                }
                int i15 = 8;
                int i16 = 2;
                fk2.g i17 = new fk2.f0(new jk2.x(new j1(new jk2.x(new j1(new pn.c(1, new jk2.e(uj2.q.w(arrayList2).i(new com.google.firebase.messaging.a0(new dl1.h(lVar.f55271d, 8), i15)), new ck2.f(new LinkedHashMap()), new u20.c(3, new m0(lVar, 1))), new dl1.b0(i16, new n0(lVar, arrayList2, i16))), new dl1.b0(i14, new l0(lVar, 3)), 0), new dl1.b0(7, new l0(lVar, 4)), i16), new dl1.b0(4, new l0(lVar, 5)), 0), new dl1.b0(i15, new l0(lVar, 6)), i16), new Pair(new ArrayList(), new ArrayList()), new u20.c(4, o0.f55260i)).k(new dl1.b0(5, new n0(lVar, arrayList, i14))).i();
                Intrinsics.checkNotNullExpressionValue(i17, "ignoreElement(...)");
                i17.i(new vy.c(8), new or1.j(21, d12.c.f53623l));
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e8, code lost:
    
        if (((im2.b) r7.f120539e) != im2.b.TYPE_PARAMETER_BOUNDS) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d2  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: br1.a0.invoke(java.lang.Object):java.lang.Object");
    }
}
