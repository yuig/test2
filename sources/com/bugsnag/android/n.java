package com.bugsnag.android;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f29351b;

    public /* synthetic */ n(g2 g2Var, int i13) {
        this.f29350a = i13;
        this.f29351b = g2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f29350a;
        o oVar = this.f29351b;
        switch (i13) {
            case 0:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = new HashMap();
                hashMap.put("hasConnection", bool);
                hashMap.put("networkState", (String) obj2);
                oVar.a(BreadcrumbType.STATE, "Connectivity changed", hashMap);
                if (bool.booleanValue()) {
                    oVar.f29380n.k();
                    oVar.f29381o.b();
                    break;
                }
                break;
            case 1:
                oVar.b(BreadcrumbType.STATE, (String) obj, (Map) obj2);
                break;
            case 2:
                String str = (String) obj2;
                oVar.a(BreadcrumbType.STATE, "Orientation changed", a.a.x("from", (String) obj, "to", str));
                q qVar = oVar.f29386t;
                if (!qVar.getObservers$bugsnag_android_core_release().isEmpty()) {
                    h3 h3Var = new h3(str);
                    Iterator<T> it = qVar.getObservers$bugsnag_android_core_release().iterator();
                    while (it.hasNext()) {
                        ((hd.m) it.next()).onStateChange(h3Var);
                    }
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj2;
                oVar.f29379m.f29676a = Boolean.TRUE.equals((Boolean) obj);
                w1 w1Var = oVar.f29379m;
                if (!Intrinsics.d(w1Var.f29677b, num)) {
                    w1Var.f29677b = num;
                    oVar.a(BreadcrumbType.STATE, "Trim Memory", Collections.singletonMap("trimLevel", w1Var.b()));
                }
                w1Var.a();
                break;
        }
        return null;
    }
}
