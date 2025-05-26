package di2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55076i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f55077j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f55078k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, long j13, int i13) {
        super(0);
        this.f55076i = i13;
        this.f55077j = jVar;
        this.f55078k = j13;
    }

    public final yh2.c b() {
        int i13 = this.f55076i;
        long j13 = this.f55078k;
        j jVar = this.f55077j;
        switch (i13) {
            case 0:
                return jVar.f55089a.d(jVar.f55101m, j13, true);
            case 1:
                ci2.d dVar = jVar.f55089a;
                dVar.getClass();
                return dVar.f27768a.b(new ci2.b(false, th2.i.MANUAL, this.f55078k, th2.h.FOREGROUND));
            default:
                return jVar.f55089a.d(bi2.f.BACKGROUND, j13, false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f55076i) {
        }
        return b();
    }
}
