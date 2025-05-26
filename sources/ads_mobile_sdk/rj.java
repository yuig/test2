package ads_mobile_sdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rj {

    /* renamed from: a, reason: collision with root package name */
    public final a.x8 f10658a;

    public rj(a.x8 x8Var) {
        this.f10658a = x8Var;
    }

    public final /* synthetic */ pj a() {
        sj0 a13 = this.f10658a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (pj) a13;
    }

    public final void b(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        a.x8 x8Var = this.f10658a;
        x8Var.b();
        pj pjVar = (pj) x8Var.f10110b;
        pjVar.getClass();
        value.getClass();
        i13 = pjVar.bitField0_;
        pjVar.bitField0_ = i13 | 8;
        pjVar.platform_ = value;
    }

    public final void a(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.x8 x8Var = this.f10658a;
        x8Var.b();
        pj pjVar = (pj) x8Var.f10110b;
        w81Var = pjVar.serverParameters_;
        if (!w81Var.f12897a) {
            pjVar.serverParameters_ = w81Var.b();
        }
        w81Var2 = pjVar.serverParameters_;
        w81Var2.putAll(map);
    }

    public final void b(boolean z13) {
        int i13;
        a.x8 x8Var = this.f10658a;
        x8Var.b();
        pj pjVar = (pj) x8Var.f10110b;
        i13 = pjVar.bitField0_;
        pjVar.bitField0_ = i13 | 2;
        pjVar.shouldGatherSignals_ = z13;
    }

    public final void a(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        a.x8 x8Var = this.f10658a;
        x8Var.b();
        pj pjVar = (pj) x8Var.f10110b;
        pjVar.getClass();
        value.getClass();
        i13 = pjVar.bitField0_;
        pjVar.bitField0_ = i13 | 1;
        pjVar.adapterClassName_ = value;
    }

    public final ca0 b() {
        w81 w81Var;
        w81Var = ((pj) this.f10658a.f10110b).serverParameters_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getServerParametersMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final void a(boolean z13) {
        int i13;
        a.x8 x8Var = this.f10658a;
        x8Var.b();
        pj pjVar = (pj) x8Var.f10110b;
        i13 = pjVar.bitField0_;
        pjVar.bitField0_ = i13 | 4;
        pjVar.shouldCollectSignalsOnFullApp_ = z13;
    }
}
