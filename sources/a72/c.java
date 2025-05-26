package a72;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1263i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1264j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1265k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ hd2.b f1266l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, int i14, hd2.b bVar, int i15) {
        super(1);
        this.f1263i = i15;
        this.f1264j = i13;
        this.f1265k = i14;
        this.f1266l = bVar;
    }

    public final void b(b72.a postTranslate) {
        int i13 = this.f1263i;
        hd2.b bVar = this.f1266l;
        int i14 = this.f1265k;
        int i15 = this.f1264j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(postTranslate, "$this$postTranslate");
                postTranslate.c(1.0f / i15, 1.0f / i14, new b(bVar, 0));
                break;
            default:
                Intrinsics.checkNotNullParameter(postTranslate, "$this$postTranslate");
                postTranslate.c(1.0f / i15, 1.0f / i14, new b(bVar, 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1263i) {
            case 0:
                b((b72.a) obj);
                break;
            default:
                b((b72.a) obj);
                break;
        }
        return Unit.f80348a;
    }
}
