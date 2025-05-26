package u00;

import com.apollographql.apollo3.exception.CacheMissException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb.l0;
import pc.o0;
import pc.t0;

/* loaded from: classes.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119833i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Map f119834j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f119835k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Map map, k kVar, int i13) {
        super(1);
        this.f119833i = i13;
        this.f119834j = map;
        this.f119835k = kVar;
    }

    public final void b(wc.k cache) {
        d dVar;
        dl1.s a13;
        switch (this.f119833i) {
            case 0:
                Intrinsics.checkNotNullParameter(cache, "cache");
                Collection<wc.m> values = this.f119834j.values();
                k kVar = this.f119835k;
                for (wc.m mVar : values) {
                    Object obj = mVar.get("id");
                    String str = obj instanceof String ? (String) obj : null;
                    Object obj2 = mVar.get("__typename");
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null && str2 != null && (dVar = (d) kVar.f119854h.get(str2)) != null) {
                        synchronized (kVar) {
                            Set set = (Set) kVar.f119857k.get(dVar);
                            if (set != null) {
                                set.add(str);
                            }
                        }
                        kVar.f119858l.c(Boolean.TRUE);
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(cache, "cache");
                k kVar2 = this.f119835k;
                for (Map.Entry entry : this.f119834j.entrySet()) {
                    d dVar2 = (d) entry.getKey();
                    Set set2 = (Set) entry.getValue();
                    if (!(dVar2 instanceof d)) {
                        dVar2 = null;
                    }
                    if (dVar2 != null) {
                        ArrayList models = new ArrayList();
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            try {
                                dl1.s sVar = (dl1.s) dVar2.f119829c.B((t0) l0.U0((o0) dVar2.f119830d.invoke((String) it.next()), kVar2.f119850d, cache, kVar2.f119849c, wc.a.f129075b));
                                if (sVar != null) {
                                    models.add(sVar);
                                }
                            } catch (CacheMissException unused) {
                            } catch (NullPointerException e13) {
                                vb0.j.f125466a.I(e13, "There is a cache miss on a null value which should be populated. Please check your DSL and your .graphql file to ensure all fields are accounted for.", tb0.p.PLATFORM);
                            }
                        }
                        if (!models.isEmpty()) {
                            dl1.l lVar = (dl1.l) dVar2.f119827a;
                            lVar.getClass();
                            Intrinsics.checkNotNullParameter(models, "models");
                            Iterator it2 = models.iterator();
                            while (it2.hasNext()) {
                                dl1.s sVar2 = (dl1.s) it2.next();
                                if (lVar.f55247t.b(sVar2)) {
                                    String uid = sVar2.getUid();
                                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                                    dl1.s O = lVar.O(uid);
                                    if (O != null && (a13 = lVar.f55248u.a(O, sVar2)) != null) {
                                        sVar2 = a13;
                                    }
                                    String uid2 = sVar2.getUid();
                                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                    dl1.b bVar = new dl1.b(uid2);
                                    if (lVar.f55245r.a(bVar, dl1.a.WRITE)) {
                                        lVar.f55244q.c(bVar, sVar2);
                                    }
                                    lVar.w(bVar, sVar2, false);
                                }
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f119833i) {
            case 0:
                b((wc.k) obj);
                break;
            default:
                b((wc.k) obj);
                break;
        }
        return Unit.f80348a;
    }
}
