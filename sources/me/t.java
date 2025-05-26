package me;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f87022a;

    public t(HashMap appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap hashMap = new HashMap();
        this.f87022a = hashMap;
        hashMap.putAll(appEventMap);
    }

    private final Object writeReplace() {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            return new s(this.f87022a);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final void a(b accessTokenAppIdPair, List appEvents) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            HashMap hashMap = this.f87022a;
            if (!hashMap.containsKey(accessTokenAppIdPair)) {
                hashMap.put(accessTokenAppIdPair, CollectionsKt.H0(appEvents));
                return;
            }
            List list = (List) hashMap.get(accessTokenAppIdPair);
            if (list == null) {
                return;
            }
            list.addAll(appEvents);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public t() {
        this.f87022a = new HashMap();
    }
}
