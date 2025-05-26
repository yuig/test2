package di2;

import e2.g0;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55079i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f55080j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, long j13, int i13) {
        super(1);
        this.f55079i = i13;
        this.f55080j = jVar;
    }

    public final Envelope b(yh2.c initial) {
        int i13 = this.f55079i;
        j jVar = this.f55080j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(initial, "initial");
                ci2.d dVar = jVar.f55089a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(initial, "initial");
                return dVar.f27768a.a(new g0(initial, k.NORMAL_END, dVar.f27771d, true, null));
            case 1:
                Intrinsics.checkNotNullParameter(initial, "initial");
                return jVar.f55089a.a(bi2.f.FOREGROUND, initial);
            default:
                Intrinsics.checkNotNullParameter(initial, "initial");
                return jVar.f55089a.a(bi2.f.BACKGROUND, initial);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f55079i) {
        }
        return b((yh2.c) obj);
    }
}
