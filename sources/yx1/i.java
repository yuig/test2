package yx1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140358i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f140359j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(1);
        this.f140358i = i13;
        this.f140359j = jVar;
    }

    public final void b(ww1.c it) {
        int i13 = this.f140358i;
        j jVar = this.f140359j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                d dVar = jVar.D0;
                if (dVar != null) {
                    ((p) dVar).s3(it);
                    return;
                } else {
                    Intrinsics.r("listener");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                d dVar2 = jVar.D0;
                if (dVar2 != null) {
                    ((p) dVar2).s3(it);
                    return;
                } else {
                    Intrinsics.r("listener");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f140358i) {
            case 0:
                b((ww1.c) obj);
                break;
            default:
                b((ww1.c) obj);
                break;
        }
        return Unit.f80348a;
    }
}
