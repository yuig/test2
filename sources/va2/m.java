package va2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125412i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vn1.b f125413j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vn1.g f125414k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(vn1.b bVar, vn1.g gVar, int i13) {
        super(1);
        this.f125412i = i13;
        this.f125413j = bVar;
        this.f125414k = gVar;
    }

    public final tn1.b b(tn1.b it) {
        switch (this.f125412i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return tn1.b.a(it, null, this.f125413j, null, this.f125414k, 5);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f125412i) {
        }
        return b((tn1.b) obj);
    }
}
