package ac;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1814i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f1815j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i13) {
        super(0);
        this.f1814i = i13;
        this.f1815j = jVar;
    }

    public final Float b() {
        int i13 = this.f1814i;
        j jVar = this.f1815j;
        switch (i13) {
            case 0:
                float f13 = 0.0f;
                if (((com.airbnb.lottie.h) jVar.f1829i.getValue()) != null) {
                    float floatValue = ((Number) jVar.f1826f.getValue()).floatValue();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = jVar.f1825e;
                    if (floatValue < 0.0f) {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(parcelableSnapshotMutableState.getValue());
                    } else {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(parcelableSnapshotMutableState.getValue());
                        f13 = 1.0f;
                    }
                }
                return Float.valueOf(f13);
            default:
                boolean booleanValue = ((Boolean) jVar.f1824d.getValue()).booleanValue();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = jVar.f1826f;
                return Float.valueOf((booleanValue && jVar.e() % 2 == 0) ? -((Number) parcelableSnapshotMutableState2.getValue()).floatValue() : ((Number) parcelableSnapshotMutableState2.getValue()).floatValue());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1814i) {
            case 0:
                return b();
            case 1:
                return b();
            default:
                j jVar = this.f1815j;
                return Boolean.valueOf(jVar.e() == ((Number) jVar.f1823c.getValue()).intValue() && ((Number) jVar.f1831k.getValue()).floatValue() == jVar.d());
        }
    }
}
