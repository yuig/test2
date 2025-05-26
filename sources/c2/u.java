package c2;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25269i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f25270j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, int i13) {
        super(0);
        this.f25269i = i13;
        this.f25270j = wVar;
    }

    public final Float b() {
        int i13 = this.f25269i;
        w wVar = this.f25270j;
        switch (i13) {
            case 0:
                float c13 = wVar.d().c(wVar.f25331g.getValue());
                float c14 = wVar.d().c(wVar.f25333i.getValue()) - c13;
                float abs = Math.abs(c14);
                float f13 = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float f14 = (wVar.f() - c13) / c14;
                    if (f14 < 1.0E-6f) {
                        f13 = 0.0f;
                    } else if (f14 <= 0.999999f) {
                        f13 = f14;
                    }
                }
                return Float.valueOf(f13);
            default:
                return Float.valueOf(wVar.f());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object b13;
        int i13 = this.f25269i;
        w wVar = this.f25270j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return wVar.d();
            case 2:
                return new Pair(wVar.d(), wVar.f25332h.getValue());
            case 3:
                Object value = wVar.f25336l.getValue();
                if (value != null) {
                    return value;
                }
                float h10 = wVar.f25334j.h();
                boolean isNaN = Float.isNaN(h10);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = wVar.f25331g;
                if (isNaN) {
                    return parcelableSnapshotMutableState.getValue();
                }
                Object value2 = parcelableSnapshotMutableState.getValue();
                a3 d2 = wVar.d();
                float c13 = d2.c(value2);
                if (c13 != h10 && !Float.isNaN(c13) && (c13 >= h10 ? (b13 = d2.b(h10, false)) != null : (b13 = d2.b(h10, true)) != null)) {
                    value2 = b13;
                }
                return value2;
            case 4:
                Object value3 = wVar.f25336l.getValue();
                if (value3 != null) {
                    return value3;
                }
                float h13 = wVar.f25334j.h();
                boolean isNaN2 = Float.isNaN(h13);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = wVar.f25331g;
                return !isNaN2 ? wVar.c(h13, 0.0f, parcelableSnapshotMutableState2.getValue()) : parcelableSnapshotMutableState2.getValue();
            case 5:
                return (Boolean) wVar.f25331g.getValue();
            default:
                return b();
        }
    }
}
