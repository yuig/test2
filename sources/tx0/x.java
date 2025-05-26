package tx0;

import ba1.o0;
import com.pinterest.feature.settings.notifications.q0;
import com.pinterest.feature.settings.notifications.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import o82.h0;
import o82.j0;

/* loaded from: classes5.dex */
public final class x extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f119678b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.d f119679c;

    public x(l82.d listStateTransformer, int i13) {
        this.f119678b = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(listStateTransformer, "listStateTransformer");
                this.f119679c = listStateTransformer;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(listStateTransformer, "pinalyticsStateTransformer");
                this.f119679c = listStateTransformer;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(listStateTransformer, "multiSectionStateTransformer");
                this.f119679c = listStateTransformer;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(listStateTransformer, "multiSectionStateTransformer");
                this.f119679c = listStateTransformer;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(listStateTransformer, "multiSectionStateTransformer");
                this.f119679c = listStateTransformer;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(listStateTransformer, "multiSectionStateTransformer");
                this.f119679c = listStateTransformer;
                break;
            default:
                Intrinsics.checkNotNullParameter(listStateTransformer, "multiSectionStateTransformer");
                this.f119679c = listStateTransformer;
                break;
        }
    }

    @Override // l82.d
    public final c0 c(i0 i0Var) {
        int i13 = this.f119678b;
        l82.d dVar = this.f119679c;
        switch (i13) {
            case 0:
                y vmState = (y) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                c0 c13 = dVar.c(vmState.f119682c);
                c cVar = new c(false, new a(w12.a.None), (o82.a0) c13.f82212a);
                y b13 = y.b(vmState, false, null, (j0) c13.f82213b, 3);
                List j13 = f0.j(t.f119675a, u.f119676a);
                List list = c13.f82214c;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new v((h0) it.next()));
                }
                return new c0(cVar, b13, CollectionsKt.l0(arrayList, j13));
            case 1:
                o0 vmState2 = (o0) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                c0 c14 = dVar.c(vmState2.f22386a);
                ba1.j jVar = new ba1.j((o82.a0) c14.f82212a, null, false);
                o0 o0Var = new o0((j0) c14.f82213b, 6);
                ArrayList arrayList2 = new ArrayList();
                List list2 = c14.f82214c;
                ArrayList arrayList3 = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new ba1.h0((h0) it2.next()));
                }
                arrayList2.addAll(arrayList3);
                arrayList2.add(ba1.g0.f22368a);
                arrayList2.add(ba1.i0.f22372a);
                Unit unit = Unit.f80348a;
                return new c0(jVar, o0Var, arrayList2);
            case 2:
                ca1.u vmState3 = (ca1.u) i0Var;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                return new c0(new ca1.a(new zy.a0(), true, null, null, null, null), vmState3, f0.j(ca1.r.f27224a, ca1.q.f27223a));
            case 3:
                ma1.w vmState4 = (ma1.w) i0Var;
                Intrinsics.checkNotNullParameter(vmState4, "vmState");
                c0 c15 = dVar.c(vmState4.f86814a);
                l82.e d2 = l82.d.d(new ma1.d(), vmState4);
                d2.f(new x91.g0(c15, 1));
                d2.h(new x91.g0(c15, 2));
                List list3 = c15.f82214c;
                ArrayList arrayList4 = new ArrayList(g0.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(new ma1.t((h0) it3.next()));
                }
                d2.b(arrayList4);
                return d2.e();
            case 4:
                t0 vmState5 = (t0) i0Var;
                Intrinsics.checkNotNullParameter(vmState5, "vmState");
                c0 c16 = dVar.c(vmState5.f48268b);
                com.pinterest.feature.settings.notifications.k kVar = new com.pinterest.feature.settings.notifications.k(null, (o82.a0) c16.f82212a);
                List vmStates = ((j0) c16.f82213b).f93634a;
                Intrinsics.checkNotNullParameter(vmStates, "vmStates");
                t0 b14 = t0.b(vmState5, new j0(vmStates));
                List list4 = c16.f82214c;
                ArrayList arrayList5 = new ArrayList(g0.q(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(new q0((h0) it4.next()));
                }
                return new c0(kVar, b14, arrayList5);
            case 5:
                rb1.v vmState6 = (rb1.v) i0Var;
                Intrinsics.checkNotNullParameter(vmState6, "vmState");
                c0 c17 = dVar.c(vmState6.f107096a);
                rb1.v b15 = rb1.v.b(vmState6, (j0) c17.f82213b);
                rb1.b bVar = new rb1.b((o82.a0) c17.f82212a);
                List list5 = c17.f82214c;
                ArrayList arrayList6 = new ArrayList(g0.q(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(new rb1.q((h0) it5.next()));
                }
                return new c0(bVar, b15, arrayList6);
            default:
                p02.u vmState7 = (p02.u) i0Var;
                Intrinsics.checkNotNullParameter(vmState7, "vmState");
                c0 c18 = dVar.c(vmState7.f98463c);
                p02.g gVar = new p02.g(vmState7.f98461a, null, (o82.a0) c18.f82212a, null);
                p02.u b16 = p02.u.b(vmState7, (j0) c18.f82213b);
                ArrayList arrayList7 = new ArrayList();
                List list6 = c18.f82214c;
                ArrayList arrayList8 = new ArrayList(g0.q(list6, 10));
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(new p02.q((h0) it6.next(), vmState7.f98462b));
                }
                arrayList7.addAll(arrayList8);
                Unit unit2 = Unit.f80348a;
                return new c0(gVar, b16, arrayList7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0803, code lost:
    
        if (r0.booleanValue() != false) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x087e A[LOOP:11: B:232:0x0878->B:234:0x087e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0816  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r23, u50.o r24, l82.i0 r25, l82.e r26) {
        /*
            Method dump skipped, instructions count: 2690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.x.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
