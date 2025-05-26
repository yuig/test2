package em1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class n extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59636i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f59637j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13, b bVar) {
        super(1);
        this.f59636i = i13;
        this.f59637j = bVar;
    }

    public final d b(d it) {
        switch (this.f59636i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return d.e(it, this.f59637j, null, null, null, null, null, 0, null, false, 0, 1022);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f59636i) {
        }
        return b((d) obj);
    }
}
