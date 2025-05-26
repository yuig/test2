package qg2;

import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCall;
import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCalls;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import pg2.r;
import pg2.s;
import pg2.t;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f103879a;

    public m(PendingApiCalls pendingApiCalls) {
        Intrinsics.checkNotNullParameter(pendingApiCalls, "pendingApiCalls");
        this.f103879a = new ConcurrentHashMap(pendingApiCalls.f72961a);
    }

    public static boolean c(List list, s sVar) {
        return (list.isEmpty() ^ true) && !t.a(sVar).f100151b;
    }

    public final void a(PendingApiCall pendingApiCall) {
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(pendingApiCall, "pendingApiCall");
        String url = pendingApiCall.f72953a.f72930h.f72939a;
        Intrinsics.checkNotNullParameter(url, "url");
        s a13 = new r(new URL(url)).a();
        ConcurrentHashMap concurrentHashMap = this.f103879a;
        Object obj = concurrentHashMap.get(a13);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a13, (obj = new ArrayList()))) != null) {
            obj = putIfAbsent;
        }
        List pendingApiCallsForEndpoint = (List) obj;
        Intrinsics.checkNotNullExpressionValue(pendingApiCallsForEndpoint, "pendingApiCallsForEndpoint");
        synchronized (pendingApiCallsForEndpoint) {
            try {
                int size = pendingApiCallsForEndpoint.size();
                int i13 = l.f103878a[a13.ordinal()];
                if (size >= (i13 != 1 ? i13 != 2 ? 50 : 100 : 10)) {
                    k0.A(pendingApiCallsForEndpoint);
                }
                pendingApiCallsForEndpoint.add(pendingApiCall);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean b() {
        Set entrySet = this.f103879a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "pendingApiCallsMap.entries");
        Set<Map.Entry> set = entrySet;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : set) {
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            if (c((List) value, (s) key)) {
                return true;
            }
        }
        return false;
    }

    public final PendingApiCall d() {
        Object next;
        Long l13;
        Long l14;
        ConcurrentHashMap concurrentHashMap = this.f103879a;
        s sVar = s.SESSIONS;
        List list = (List) concurrentHashMap.get(sVar);
        if (list != null) {
            synchronized (list) {
                if (c(list, sVar)) {
                    return (PendingApiCall) k0.A(list);
                }
                Unit unit = Unit.f80348a;
            }
        }
        Set entrySet = this.f103879a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "pendingApiCallsMap\n            .entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            if (c((List) value, (s) key)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        PendingApiCall pendingApiCall = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Object value2 = ((Map.Entry) next).getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "it.value");
                PendingApiCall pendingApiCall2 = (PendingApiCall) CollectionsKt.firstOrNull((List) value2);
                long longValue = (pendingApiCall2 == null || (l14 = pendingApiCall2.f72955c) == null) ? Long.MAX_VALUE : l14.longValue();
                do {
                    Object next2 = it.next();
                    Object value3 = ((Map.Entry) next2).getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "it.value");
                    PendingApiCall pendingApiCall3 = (PendingApiCall) CollectionsKt.firstOrNull((List) value3);
                    long longValue2 = (pendingApiCall3 == null || (l13 = pendingApiCall3.f72955c) == null) ? Long.MAX_VALUE : l13.longValue();
                    if (longValue > longValue2) {
                        next = next2;
                        longValue = longValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        List list2 = entry2 != null ? (List) entry2.getValue() : null;
        if (list2 != null) {
            synchronized (list2) {
                pendingApiCall = (PendingApiCall) k0.A(list2);
            }
        }
        return pendingApiCall;
    }
}
