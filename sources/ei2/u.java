package ei2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f59037a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f59038b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f59039c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public Function0 f59040d;

    public static void e(long j13, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (((k) sVar.f59032a).b()) {
                ((k) sVar.f59032a).s(null, Long.valueOf(j13));
            }
            e(j13, sVar.f59033b);
        }
    }

    public final void a(long j13) {
        List b13 = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b13) {
            xf2.y fixedAttribute = xf2.y.f134904d;
            k kVar = (k) ((q) obj);
            kVar.getClass();
            Intrinsics.checkNotNullParameter(fixedAttribute, "fixedAttribute");
            if (!Intrinsics.d(kVar.f59011m.get(fixedAttribute.f134851a.f134856b.f108404b), fixedAttribute.f134852b)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k) ((q) it.next())).s(ErrorCode.FAILURE, Long.valueOf(j13));
        }
    }

    public final List b() {
        List F0;
        synchronized (this.f59039c) {
            F0 = CollectionsKt.F0(this.f59037a.values());
        }
        return F0;
    }

    public final oi2.b c(String spanId) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return (oi2.b) kg.n.g(this.f59039c, spanId, new t(this, spanId, 0));
    }

    public final void d() {
        Function0 function0 = this.f59040d;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
