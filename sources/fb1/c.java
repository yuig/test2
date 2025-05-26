package fb1;

import ab1.o;
import com.pinterest.api.model.jz;
import com.pinterest.api.model.kz;
import com.pinterest.feature.settings.notifications.d;
import com.pinterest.feature.settings.notifications.y0;
import db1.j;
import dl1.s;
import ek2.f;
import fk2.l;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import rq.a0;
import sq0.c0;
import uk1.e;
import wk1.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class c extends q implements d {

    /* renamed from: a, reason: collision with root package name */
    public final r20.a f61609a;

    /* renamed from: b, reason: collision with root package name */
    public final kz f61610b;

    /* renamed from: c, reason: collision with root package name */
    public final j f61611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r20.a service, kz setting, uj2.q networkStateStream, e presenterPinalyticsFactory) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        this.f61609a = service;
        this.f61610b = setting;
        this.f61611c = new j(service, setting);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f61611c);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.settings.notifications.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((gb1.c) view).f64686x0 = this;
        ek2.j jVar = (ek2.j) getNetworkStateStream().o().F(new o(5, new y0(this, 2)), ck2.i.f27925e, ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(jVar, "forEach(...)");
        addDisposable(jVar);
    }

    public final void u3(String sectionKey, final String optionKey, final boolean z13) {
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(optionKey, "optionKey");
        j jVar = this.f61611c;
        Iterator it = CollectionsKt.F0(jVar.f135191h).iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            s sVar = (s) it.next();
            if ((sVar instanceof db1.e) && Intrinsics.d(((db1.e) sVar).f54291a.c(), sectionKey)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 < 0) {
            return;
        }
        Object U = CollectionsKt.U(i13, CollectionsKt.F0(jVar.f135191h));
        db1.e eVar = U instanceof db1.e ? (db1.e) U : null;
        if (eVar == null) {
            return;
        }
        String type = this.f61610b.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        l h10 = this.f61609a.f(type, sectionKey, optionKey, z13).l(tk2.e.f118017c).h(wj2.c.a());
        final jz jzVar = eVar.f54291a;
        final int i14 = i13;
        f i15 = h10.i(new ak2.a() { // from class: fb1.a
            @Override // ak2.a
            public final void run() {
                Object obj;
                c this$0 = c.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                jz updatingSetting = jzVar;
                Intrinsics.checkNotNullParameter(updatingSetting, "$updatingSetting");
                String optionKey2 = optionKey;
                Intrinsics.checkNotNullParameter(optionKey2, "$optionKey");
                this$0.getClass();
                jz.c h13 = updatingSetting.h();
                int i16 = h13 == null ? -1 : b.f61608a[h13.ordinal()];
                if (i16 == 1) {
                    List<jz.b> g13 = updatingSetting.g();
                    Intrinsics.checkNotNullExpressionValue(g13, "getOptions(...)");
                    for (jz.b bVar : g13) {
                        bVar.d(Intrinsics.d(bVar.a(), optionKey2));
                    }
                    return;
                }
                Object obj2 = null;
                Object obj3 = null;
                boolean z14 = z13;
                if (i16 == 2) {
                    List a13 = updatingSetting.a();
                    if (a13 != null) {
                        Iterator it2 = a13.iterator();
                        while (it2.hasNext()) {
                            List<jz.b> b13 = ((jz.a) it2.next()).b();
                            Intrinsics.checkNotNullExpressionValue(b13, "getValue(...)");
                            for (jz.b bVar2 : b13) {
                                if (bVar2.a() == optionKey2) {
                                    bVar2.d(z14);
                                }
                            }
                        }
                    }
                    List g14 = updatingSetting.g();
                    Intrinsics.checkNotNullExpressionValue(g14, "getOptions(...)");
                    Iterator it3 = g14.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        if (Intrinsics.d(((jz.b) next).a(), optionKey2)) {
                            obj2 = next;
                            break;
                        }
                    }
                    jz.b bVar3 = (jz.b) obj2;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.d(z14);
                    return;
                }
                if (i16 != 3) {
                    List g15 = updatingSetting.g();
                    Intrinsics.checkNotNullExpressionValue(g15, "getOptions(...)");
                    Iterator it4 = g15.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next2 = it4.next();
                        if (Intrinsics.d(((jz.b) next2).a(), optionKey2)) {
                            obj3 = next2;
                            break;
                        }
                    }
                    jz.b bVar4 = (jz.b) obj3;
                    if (bVar4 == null) {
                        return;
                    }
                    bVar4.d(z14);
                    return;
                }
                List g16 = updatingSetting.g();
                Intrinsics.checkNotNullExpressionValue(g16, "getOptions(...)");
                Iterator it5 = g16.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj = it5.next();
                        if (Intrinsics.d(((jz.b) obj).a(), optionKey2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                jz.b bVar5 = (jz.b) obj;
                if (bVar5 != null) {
                    bVar5.d(z14);
                }
                int i17 = i14 + 1;
                j jVar2 = this$0.f61611c;
                Object U2 = CollectionsKt.U(i17, CollectionsKt.F0(jVar2.f135191h));
                db1.e eVar2 = U2 instanceof db1.e ? (db1.e) U2 : null;
                if (eVar2 != null) {
                    boolean z15 = !eVar2.f54292b;
                    eVar2.f54292b = z15;
                    jz jzVar2 = eVar2.f54291a;
                    List g17 = jzVar2.g();
                    if (g17 != null) {
                        Iterator it6 = g17.iterator();
                        while (it6.hasNext()) {
                            ((jz.b) it6.next()).d(z15);
                        }
                    }
                    List a14 = jzVar2.a();
                    if (a14 != null) {
                        Iterator it7 = a14.iterator();
                        while (it7.hasNext()) {
                            List b14 = ((jz.a) it7.next()).b();
                            Intrinsics.checkNotNullExpressionValue(b14, "getValue(...)");
                            Iterator it8 = b14.iterator();
                            while (it8.hasNext()) {
                                ((jz.b) it8.next()).d(z15);
                            }
                        }
                    }
                    jVar2.u1(i17, eVar2);
                }
            }
        }, new o(6, new a0(this, i13, eVar, 10)));
        Intrinsics.checkNotNullExpressionValue(i15, "subscribe(...)");
        addDisposable(i15);
    }
}
