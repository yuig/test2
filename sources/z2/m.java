package z2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f140630j = new m(2);

    /* renamed from: k, reason: collision with root package name */
    public static final m f140631k = new m(3);

    /* renamed from: l, reason: collision with root package name */
    public static final m f140632l = new m(4);

    /* renamed from: m, reason: collision with root package name */
    public static final m f140633m = new m(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140634i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(1);
        this.f140634i = i13;
    }

    public final s b(int i13) {
        switch (this.f140634i) {
        }
        return s.f140648b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140634i;
        switch (i13) {
            case 0:
                return b(((c) obj).f140608a);
            case 1:
                return b(((c) obj).f140608a);
            case 2:
                return b(((c) obj).f140608a);
            case 3:
                return b(((c) obj).f140608a);
            case 4:
                z zVar = (z) obj;
                switch (i13) {
                    case 4:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.E(zVar));
                    default:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.E(zVar));
                }
            default:
                z zVar2 = (z) obj;
                switch (i13) {
                    case 4:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.E(zVar2));
                    default:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.E(zVar2));
                }
        }
    }
}
