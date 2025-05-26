package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rn {

    /* renamed from: a, reason: collision with root package name */
    public final a.fc f10694a;

    public rn(a.fc fcVar) {
        this.f10694a = fcVar;
    }

    public final /* synthetic */ tx a() {
        sj0 a13 = this.f10694a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (tx) a13;
    }

    public final void a(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        a.fc fcVar = this.f10694a;
        fcVar.b();
        tx txVar = (tx) fcVar.f10110b;
        txVar.getClass();
        value.getClass();
        i13 = txVar.bitField0_;
        txVar.bitField0_ = i13 | 1;
        txVar.clientVersion_ = value;
    }

    public final void a(boolean z13) {
        int i13;
        a.fc fcVar = this.f10694a;
        fcVar.b();
        tx txVar = (tx) fcVar.f10110b;
        i13 = txVar.bitField0_;
        txVar.bitField0_ = i13 | 4;
        txVar.isInstantApps_ = z13;
    }
}
