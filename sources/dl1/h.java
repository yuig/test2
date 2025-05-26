package dl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gl1.d dVar, int i13) {
        super(1, dVar, gl1.d.class, "localTimeout", "localTimeout(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
        this.f55230a = i13;
        switch (i13) {
            case 1:
                super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
                break;
            case 2:
                super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
                break;
            case 3:
                super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
                break;
            case 4:
                super(1, dVar, gl1.d.class, "subscribeIo", "subscribeIo(Lio/reactivex/Single;)Lio/reactivex/Single;", 0);
                break;
            case 5:
                super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
                break;
            case 6:
                super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
                break;
            case 7:
                super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
                break;
            case 8:
                super(1, dVar, gl1.d.class, "subscribeDb", "subscribeDb(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
                break;
            default:
                break;
        }
    }

    public final uj2.q h(uj2.q p03) {
        switch (this.f55230a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).h(p03);
            case 1:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).b(p03);
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).b(p03);
            case 3:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).b(p03);
            case 4:
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).i(p03);
            case 5:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).b(p03);
            case 6:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).b(p03);
            case 7:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).b(p03);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55230a) {
            case 4:
                uj2.b0 p03 = (uj2.b0) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
        }
        return h((uj2.q) obj);
    }
}
