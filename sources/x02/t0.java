package x02;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131490a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(gl1.d dVar, int i13) {
        super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
        this.f131490a = i13;
        if (i13 == 1) {
            super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
            return;
        }
        if (i13 == 2) {
            super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
            return;
        }
        if (i13 == 3) {
            super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
        } else if (i13 != 4) {
        } else {
            super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
        }
    }

    public final uj2.q h(uj2.q p03) {
        switch (this.f131490a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
        }
        return ((gl1.d) this.receiver).b(p03);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131490a) {
        }
        return h((uj2.q) obj);
    }
}
