package ads_mobile_sdk;

import a.y8;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hq2 {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f6051a;

    public hq2(y8 y8Var) {
        this.f6051a = y8Var;
    }

    public final /* synthetic */ sk a() {
        sj0 a13 = this.f6051a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (sk) a13;
    }

    public final void b(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        y8 y8Var = this.f6051a;
        y8Var.b();
        sk skVar = (sk) y8Var.f10110b;
        skVar.getClass();
        i13 = skVar.bitField0_;
        skVar.bitField0_ = i13 | 2;
        skVar.buyerGeneratedRequestData_ = value;
    }

    public final void a(int i13) {
        int i14;
        y8 y8Var = this.f6051a;
        y8Var.b();
        sk skVar = (sk) y8Var.f10110b;
        i14 = skVar.bitField0_;
        skVar.bitField0_ = i14 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        skVar.adapterBehaviorBitmap_ = i13;
    }

    public final void b(rk value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        y8 y8Var = this.f6051a;
        y8Var.b();
        sk skVar = (sk) y8Var.f10110b;
        skVar.getClass();
        skVar.sdkVersion_ = value;
        i13 = skVar.bitField0_;
        skVar.bitField0_ = i13 | 4;
    }

    public final void a(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        y8 y8Var = this.f6051a;
        y8Var.b();
        sk skVar = (sk) y8Var.f10110b;
        skVar.getClass();
        value.getClass();
        i13 = skVar.bitField0_;
        skVar.bitField0_ = i13 | 1;
        skVar.adapterClassName_ = value;
    }

    public final void a(rk value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        y8 y8Var = this.f6051a;
        y8Var.b();
        sk skVar = (sk) y8Var.f10110b;
        skVar.getClass();
        skVar.adapterVersion_ = value;
        i13 = skVar.bitField0_;
        skVar.bitField0_ = i13 | 8;
    }

    public final void a(pk value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        y8 y8Var = this.f6051a;
        y8Var.b();
        sk skVar = (sk) y8Var.f10110b;
        skVar.getClass();
        skVar.error_ = value;
        i13 = skVar.bitField0_;
        skVar.bitField0_ = i13 | 32;
    }

    public final void a(long j13) {
        int i13;
        y8 y8Var = this.f6051a;
        y8Var.b();
        sk skVar = (sk) y8Var.f10110b;
        i13 = skVar.bitField0_;
        skVar.bitField0_ = i13 | 64;
        skVar.latencyMs_ = j13;
    }
}
