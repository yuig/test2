package jd0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fd0.h f75488j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(fd0.h hVar, int i13) {
        super(1);
        this.f75487i = i13;
        this.f75488j = hVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f75487i;
        fd0.h hVar = this.f75488j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], hVar.f61851a), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], hVar.f61852b), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f75487i) {
        }
        return b((rn1.a) obj);
    }
}
