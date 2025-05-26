package ec2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f58439j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f58440k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58441i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f58441i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f58441i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return new om1.c(q.ARROW_COUNTER_CLOCKWISE, null, om1.f.DEFAULT_ALWAYS_LIGHT, null, null, false, 0, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new om1.c(q.ANDROID_SHARE, null, om1.f.DEFAULT_ALWAYS_LIGHT, null, null, false, 0, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f58441i) {
        }
        return b((om1.c) obj);
    }
}
