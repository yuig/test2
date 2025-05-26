package sb1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f112251j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f112252k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f112253l = new k(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112254i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f112254i = i13;
    }

    public final b b(b it) {
        switch (this.f112254i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, true);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f112254i) {
            case 0:
                on1.b it = (on1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((b) obj);
    }
}
