package po1;

import es.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.e0;
import u50.p0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100892i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f100893j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f100894k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f100895l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(p0 p0Var, int i13, String str, int i14) {
        super(1);
        this.f100892i = i14;
        this.f100893j = p0Var;
        this.f100894k = i13;
        this.f100895l = str;
    }

    public final void b(e0 strikethrough) {
        int i13 = this.f100894k;
        p0 p0Var = this.f100893j;
        int i14 = this.f100892i;
        String str = this.f100895l;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(strikethrough, "$this$strikethrough");
                p0.a(p0Var, i13, new k(p0Var, str, 3));
                break;
            default:
                Intrinsics.checkNotNullParameter(strikethrough, "$this$strikethrough");
                p0.a(p0Var, i13, new k(p0Var, str, 6));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f100892i) {
            case 0:
                b((e0) obj);
                break;
            default:
                b((e0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
