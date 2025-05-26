package ads_mobile_sdk;

import a.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pf {

    /* renamed from: a, reason: collision with root package name */
    public final a.c2 f9661a;

    public pf(a.c2 c2Var) {
        this.f9661a = c2Var;
    }

    public final /* synthetic */ gf a() {
        sj0 a13 = this.f9661a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (gf) a13;
    }

    public final void b(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        w81Var = gfVar.adUnitAndFormatToMediationConfigs_;
        if (!w81Var.f12897a) {
            gfVar.adUnitAndFormatToMediationConfigs_ = w81Var.b();
        }
        w81Var2 = gfVar.adUnitAndFormatToMediationConfigs_;
        w81Var2.putAll(map);
    }

    public final void c(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        w81Var = gfVar.adUnitAndFormatToRequestSignals_;
        if (!w81Var.f12897a) {
            gfVar.adUnitAndFormatToRequestSignals_ = w81Var.b();
        }
        w81Var2 = gfVar.adUnitAndFormatToRequestSignals_;
        w81Var2.putAll(map);
    }

    public final void d(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        w81Var = gfVar.adUnitPatterns_;
        if (!w81Var.f12897a) {
            gfVar.adUnitPatterns_ = w81Var.b();
        }
        w81Var2 = gfVar.adUnitPatterns_;
        w81Var2.putAll(map);
    }

    public final void e(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        w81Var = gfVar.adapterInitializationConfigs_;
        if (!w81Var.f12897a) {
            gfVar.adapterInitializationConfigs_ = w81Var.b();
        }
        w81Var2 = gfVar.adapterInitializationConfigs_;
        w81Var2.putAll(map);
    }

    public final void f(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        w81Var = gfVar.admobSignalAdapterConfigs_;
        if (!w81Var.f12897a) {
            gfVar.admobSignalAdapterConfigs_ = w81Var.b();
        }
        w81Var2 = gfVar.admobSignalAdapterConfigs_;
        w81Var2.putAll(map);
    }

    public final void g(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        w81Var = gfVar.signalAdapterConfigs_;
        if (!w81Var.f12897a) {
            gfVar.signalAdapterConfigs_ = w81Var.b();
        }
        w81Var2 = gfVar.signalAdapterConfigs_;
        w81Var2.putAll(map);
    }

    public final ba0 h() {
        a.k3 k3Var;
        k3Var = ((gf) this.f9661a.f10110b).loggingOnlyExperimentIds_;
        List unmodifiableList = Collections.unmodifiableList(k3Var);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getLoggingOnlyExperimentIdsList(...)");
        return new ba0(unmodifiableList);
    }

    public final ca0 i() {
        w81 w81Var;
        w81Var = ((gf) this.f9661a.f10110b).signalAdapterConfigs_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getSignalAdapterConfigsMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final void a(ba0 ba0Var, ArrayList values) {
        RandomAccess randomAccess;
        a.k3 k3Var;
        Intrinsics.checkNotNullParameter(ba0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        randomAccess = gfVar.loggingOnlyExperimentIds_;
        if (!((j) randomAccess).f6594a) {
            d81 d81Var = (d81) randomAccess;
            gfVar.loggingOnlyExperimentIds_ = d81Var.a(d81Var.f4201c * 2);
        }
        k3Var = gfVar.loggingOnlyExperimentIds_;
        z2.a(values, k3Var);
    }

    public final void b(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        gfVar.getClass();
        i13 = gfVar.bitField0_;
        gfVar.bitField0_ = i13 | 8;
        gfVar.commonSettingsJson_ = value;
    }

    public final ca0 c() {
        w81 w81Var;
        w81Var = ((gf) this.f9661a.f10110b).adUnitAndFormatToMediationConfigs_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getAdUnitAndFormatToMediationConfigsMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final ca0 d() {
        w81 w81Var;
        w81Var = ((gf) this.f9661a.f10110b).adUnitAndFormatToRequestSignals_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getAdUnitAndFormatToRequestSignalsMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final ca0 e() {
        w81 w81Var;
        w81Var = ((gf) this.f9661a.f10110b).adUnitPatterns_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getAdUnitPatternsMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final ca0 f() {
        w81 w81Var;
        w81Var = ((gf) this.f9661a.f10110b).adapterInitializationConfigs_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getAdapterInitializationConfigsMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final ca0 g() {
        w81 w81Var;
        w81Var = ((gf) this.f9661a.f10110b).admobSignalAdapterConfigs_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getAdmobSignalAdapterConfigsMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final void a(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        w81Var = gfVar.adManagerSignalAdapterConfigs_;
        if (!w81Var.f12897a) {
            gfVar.adManagerSignalAdapterConfigs_ = w81Var.b();
        }
        w81Var2 = gfVar.adManagerSignalAdapterConfigs_;
        w81Var2.putAll(map);
    }

    public final void b(long j13) {
        int i13;
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        i13 = gfVar.bitField0_;
        gfVar.bitField0_ = i13 | 4;
        gfVar.serverCacheTtlSecs_ = j13;
    }

    public final ca0 b() {
        w81 w81Var;
        w81Var = ((gf) this.f9661a.f10110b).adManagerSignalAdapterConfigs_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getAdManagerSignalAdapterConfigsMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final void a(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        gfVar.getClass();
        value.getClass();
        i13 = gfVar.bitField0_;
        gfVar.bitField0_ = i13 | 1;
        gfVar.appSettingsJson_ = value;
    }

    public final void a(long j13) {
        int i13;
        a.c2 c2Var = this.f9661a;
        c2Var.b();
        gf gfVar = (gf) c2Var.f10110b;
        i13 = gfVar.bitField0_;
        gfVar.bitField0_ = i13 | 2;
        gfVar.lastUpdateTimeMs_ = j13;
    }
}
