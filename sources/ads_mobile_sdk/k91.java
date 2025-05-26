package ads_mobile_sdk;

import a.h4;
import a.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k91 {

    /* renamed from: a, reason: collision with root package name */
    public final a.s3 f7172a;

    public k91(a.s3 s3Var) {
        this.f7172a = s3Var;
    }

    public final /* synthetic */ i91 a() {
        sj0 a13 = this.f7172a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (i91) a13;
    }

    public final ba0 b() {
        h4 h4Var;
        h4Var = ((i91) this.f7172a.f10110b).adapters_;
        List unmodifiableList = Collections.unmodifiableList(h4Var);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getAdaptersList(...)");
        return new ba0(unmodifiableList);
    }

    public final ca0 c() {
        w81 w81Var;
        w81Var = ((i91) this.f7172a.f10110b).data_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getDataMap(...)");
        return new ca0(unmodifiableMap);
    }

    public final void a(ba0 ba0Var, ArrayList values) {
        h4 h4Var;
        h4 h4Var2;
        Intrinsics.checkNotNullParameter(ba0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        a.s3 s3Var = this.f7172a;
        s3Var.b();
        i91 i91Var = (i91) s3Var.f10110b;
        h4Var = i91Var.adapters_;
        if (!((j) h4Var).f6594a) {
            i91Var.adapters_ = e0.t.a(h4Var);
        }
        h4Var2 = i91Var.adapters_;
        z2.a(values, h4Var2);
    }

    public final void a(ca0 ca0Var, LinkedHashMap map) {
        w81 w81Var;
        w81 w81Var2;
        Intrinsics.checkNotNullParameter(ca0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        a.s3 s3Var = this.f7172a;
        s3Var.b();
        i91 i91Var = (i91) s3Var.f10110b;
        w81Var = i91Var.data_;
        if (!w81Var.f12897a) {
            i91Var.data_ = w81Var.b();
        }
        w81Var2 = i91Var.data_;
        w81Var2.putAll(map);
    }
}
