package fn0;

import android.media.MediaFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62612i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f62613j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(0);
        this.f62612i = i13;
        this.f62613j = eVar;
    }

    public final Integer b() {
        int i13 = this.f62612i;
        e eVar = this.f62613j;
        switch (i13) {
            case 1:
                MediaFormat a13 = eVar.a();
                Intrinsics.checkNotNullParameter(a13, "<this>");
                return Integer.valueOf(a13.containsKey("frame-rate") ? a13.getInteger("frame-rate") : -1);
            default:
                MediaFormat a14 = eVar.a();
                Intrinsics.checkNotNullParameter(a14, "<this>");
                return Integer.valueOf(a14.containsKey("max-input-size") ? a14.getInteger("max-input-size") : 4147200);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f62612i) {
            case 0:
                MediaFormat a13 = this.f62613j.a();
                Intrinsics.checkNotNullParameter(a13, "<this>");
                break;
        }
        return b();
    }
}
