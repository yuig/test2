package nx1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yl1.i;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f92503j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f92504k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f92505l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92506i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f92506i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f92506i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, i.b(), null, null, null, 0, null, 1007);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, i.c(), null, null, null, 0, null, 1007);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f92506i) {
            case 0:
                ox1.a it = (ox1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((yl1.b) obj);
    }
}
