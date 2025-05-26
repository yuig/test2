package qo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ no2.b f104603j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ no2.b f104604k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(no2.b bVar, no2.b bVar2, int i13) {
        super(1);
        this.f104602i = i13;
        this.f104603j = bVar;
        this.f104604k = bVar2;
    }

    public final void b(oo2.a buildSerialDescriptor) {
        int i13 = this.f104602i;
        no2.b bVar = this.f104604k;
        no2.b bVar2 = this.f104603j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                oo2.a.a(buildSerialDescriptor, "key", bVar2.a());
                oo2.a.a(buildSerialDescriptor, "value", bVar.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                oo2.a.a(buildSerialDescriptor, "first", bVar2.a());
                oo2.a.a(buildSerialDescriptor, "second", bVar.a());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f104602i) {
            case 0:
                b((oo2.a) obj);
                break;
            default:
                b((oo2.a) obj);
                break;
        }
        return Unit.f80348a;
    }
}
