package jq1;

import android.util.Size;
import android.view.View;
import androidx.appcompat.widget.c2;
import ao2.j0;
import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.shuffles.scene.composer.q;
import com.pinterest.shuffles.scene.composer.u;
import dl1.t;
import et1.u0;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import ht1.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kh2.r;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l62.n0;
import m60.w;
import m62.w0;
import o82.k3;
import r02.e0;
import ro2.d0;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i */
    public final /* synthetic */ int f77462i;

    /* renamed from: j */
    public final /* synthetic */ Object f77463j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i13) {
        super(2);
        this.f77462i = i13;
        this.f77463j = obj;
    }

    public final u b(Size size, j0 scope) {
        int i13 = this.f77462i;
        Object obj = this.f77463j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(scope, "scope");
                n0 n0Var = (n0) obj;
                u uVar = new u(n0Var.f81672f, scope, size);
                q qVar = n0Var.f81677k;
                if (qVar == null) {
                    Intrinsics.r("stickerFactoryInstance");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                uVar.f52036a = qVar;
                return uVar;
            default:
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(scope, "scope");
                a82.b bVar = (a82.b) obj;
                u uVar2 = new u(bVar.f1525a, scope, size);
                uVar2.e(bVar.f1529e);
                return uVar2;
        }
    }

    public final void e(Object node, String name) {
        int i13 = this.f77462i;
        Object obj = this.f77463j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(node, "node");
                Function2 function2 = (Function2) obj;
                function2.invoke(name, node);
                et1.e eVar = node instanceof et1.e ? (et1.e) node : null;
                if (eVar != null) {
                    eVar.j(function2);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(name, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(node, "node");
                ((u0) ((gt1.c) obj).b()).c(node);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(name, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(node, "node");
                ((LinkedList) obj).add(node);
                break;
            default:
                Intrinsics.checkNotNullParameter(name, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(node, "subNode");
                ((u0) ((b0) obj).f70156h).c(node);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f77462i;
        Object obj3 = this.f77463j;
        switch (i13) {
            case 0:
                wy0 wy0Var = (wy0) obj;
                wy0 wy0Var2 = (wy0) obj2;
                c cVar = (c) obj3;
                iq1.c cVar2 = cVar.f77469n0;
                if (cVar2 == null) {
                    Intrinsics.r("presenter");
                    throw null;
                }
                boolean z13 = wy0Var != null;
                t tVar = cVar2.f73420a;
                if (z13) {
                    wy0 wy0Var3 = cVar2.f73424e;
                    if (wy0Var3 != null) {
                        f30 f30Var = cVar2.f73423d;
                        if (f30Var == null) {
                            Intrinsics.r("pin");
                            throw null;
                        }
                        wy0 creator = c0.d.d2(wy0Var3) ? dl2.b.N(wy0Var3, false) : dl2.b.N(wy0Var3, true);
                        Intrinsics.checkNotNullParameter(f30Var, "<this>");
                        Intrinsics.checkNotNullParameter(creator, "creator");
                        if (b40.n(f30Var) != null || bs1.c.O0(f30Var) != null) {
                            f30Var = c0.d.X2(f30Var, creator);
                        }
                        ((dl1.l) tVar).W(f30Var);
                    }
                } else {
                    wy0 wy0Var4 = cVar2.f73425f;
                    if (wy0Var4 != null) {
                        f30 f30Var2 = cVar2.f73423d;
                        if (f30Var2 == null) {
                            Intrinsics.r("pin");
                            throw null;
                        }
                        wy0 user = c0.d.d2(wy0Var4) ? dl2.b.N(wy0Var4, false) : dl2.b.N(wy0Var4, true);
                        Intrinsics.checkNotNullParameter(f30Var2, "<this>");
                        Intrinsics.checkNotNullParameter(user, "user");
                        wy0 a63 = f30Var2.a6();
                        if (Intrinsics.d(a63 != null ? a63.getF39332b() : null, user.getF39332b())) {
                            e30 R6 = f30Var2.R6();
                            wy0 wy0Var5 = R6.f37117l2;
                            R6.f37117l2 = wy0Var5 != null ? wy0Var5.G4(user) : null;
                            boolean[] zArr = R6.f37101h3;
                            if (zArr.length > 167) {
                                zArr[167] = true;
                            }
                            f30Var2 = R6.a();
                            Intrinsics.checkNotNullExpressionValue(f30Var2, "build(...)");
                        }
                        ((dl1.l) tVar).W(f30Var2);
                    }
                }
                if (wy0Var == null) {
                    wy0Var = wy0Var2;
                }
                if (wy0Var != null) {
                    w f73 = cVar.f7();
                    Navigation navigation = cVar.I;
                    String f49940b = navigation != null ? navigation.getF49940b() : null;
                    f73.d(new lf1.d(f49940b != null ? f49940b : "", wy0Var));
                }
                return Unit.f80348a;
            case 1:
                e(obj2, (String) obj);
                return Unit.f80348a;
            case 2:
                e(obj2, (String) obj);
                return Unit.f80348a;
            case 3:
                e(obj2, (String) obj);
                return Unit.f80348a;
            case 4:
                e(obj2, (String) obj);
                return Unit.f80348a;
            case 5:
                yw1.d dVar = (yw1.d) obj3;
                return Integer.valueOf(Intrinsics.i(dVar.f140322d.indexOf(((jw1.a) obj).f77663a), dVar.f140322d.indexOf(((jw1.a) obj2).f77663a)));
            case 6:
                String str = (String) obj2;
                e0 e0Var = (e0) obj3;
                int i14 = e0.P0;
                e0Var.c9(true);
                s02.n b93 = e0Var.b9();
                String valueOf = String.valueOf((String) obj);
                wy0 f13 = ((b60.d) e0Var.getActiveUserManager()).f();
                kh2.j.x2(b93, new p02.h(valueOf, f13 != null ? f13.getF39332b() : null, e0Var.d9(), str, new i0(d4.REPORTS_AND_VIOLATION_CENTER, e0Var.d9() ? a4.RVC_YOUR_ACCOUNT_TAB : a4.RVC_YOUR_REPORTS_TAB, null, g0.RVC_ENFORCEMENT_ACTION_ROW, null, h32.u0.RVC_VIEW_STATEMENT_OF_REASONS_LINK)));
                return Unit.f80348a;
            case 7:
                r52.a pinItem = (r52.a) obj;
                Intrinsics.checkNotNullParameter(pinItem, "pinItem");
                String f39332b = pinItem.f106256a.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                String E6 = pinItem.f106256a.E6();
                return new k3(((s52.s) obj3).f111203c.f143069f, f39332b, E6 != null ? E6 : "");
            case 8:
                return b((Size) obj, (j0) obj2);
            case 9:
                float floatValue = ((Number) obj2).floatValue();
                Intrinsics.checkNotNullParameter((View) obj, "<anonymous parameter 0>");
                ((Function1) ((c2) obj3).f16535f).invoke(new w0(floatValue));
                return Unit.f80348a;
            case 10:
                String k13 = (String) obj;
                ro2.n v13 = (ro2.n) obj2;
                Intrinsics.checkNotNullParameter(k13, "k");
                Intrinsics.checkNotNullParameter(v13, "v");
                ((d0) obj3).a(k13, v13);
                return Unit.f80348a;
            case 11:
                return b((Size) obj, (j0) obj2);
            default:
                List contactRequestFeed = (List) obj;
                BoardInviteFeed boardInvites = (BoardInviteFeed) obj2;
                Intrinsics.checkNotNullParameter(contactRequestFeed, "contactRequestFeed");
                Intrinsics.checkNotNullParameter(boardInvites, "boardInvites");
                ArrayList arrayList = new ArrayList();
                int size = contactRequestFeed.size();
                int size2 = boardInvites.q().size();
                if (size > 0 || size2 > 0) {
                    arrayList.add(new pb2.n(size + size2 > 1));
                    qb2.d dVar2 = (qb2.d) obj3;
                    dVar2.f103424m.clear();
                    ArrayList arrayList2 = dVar2.f103424m;
                    List list = contactRequestFeed;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list) {
                        if (!r.W0((z40.f) obj4)) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new pb2.c((z40.f) it.next()));
                    }
                    arrayList2.addAll(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list) {
                        if (r.W0((z40.f) obj5)) {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(arrayList5, 10));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(new pb2.b((z40.f) it2.next()));
                    }
                    arrayList2.addAll(arrayList6);
                    List q13 = boardInvites.q();
                    Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
                    List<k8> list2 = q13;
                    ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                    for (k8 k8Var : list2) {
                        Intrinsics.f(k8Var);
                        arrayList7.add(new pb2.a(k8Var));
                    }
                    arrayList2.addAll(arrayList7);
                    arrayList.addAll(CollectionsKt.y0(arrayList2, 1));
                }
                return arrayList;
        }
    }
}
