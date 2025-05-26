package po1;

import es.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.p0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100896i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Integer f100897j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f100898k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Integer num, String str, int i13) {
        super(1);
        this.f100896i = i13;
        this.f100897j = num;
        this.f100898k = str;
    }

    public final void b(p0 styledString) {
        int i13 = this.f100896i;
        String str = this.f100898k;
        Integer num = this.f100897j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(styledString, "$this$styledString");
                p0.a(styledString, num.intValue(), new k(styledString, str, 4));
                break;
            default:
                Intrinsics.checkNotNullParameter(styledString, "$this$styledString");
                p0.a(styledString, num.intValue(), new k(styledString, str, 7));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f100896i) {
            case 0:
                b((p0) obj);
                break;
            default:
                b((p0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
