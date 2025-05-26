package uq0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import uj2.b0;
import uj2.q;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gl1.d dVar, int i13) {
        super(1, dVar, gl1.d.class, "observe", "observe(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
        this.f123044a = i13;
        if (i13 != 1) {
        } else {
            super(1, dVar, gl1.d.class, "subscribeIo", "subscribeIo(Lio/reactivex/Single;)Lio/reactivex/Single;", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123044a) {
            case 0:
                q p03 = (q) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((gl1.d) this.receiver).b(p03);
            default:
                b0 p04 = (b0) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                return ((gl1.d) this.receiver).l(p04);
        }
    }
}
