package ew1;

import kg.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60343i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f60344j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(t tVar, int i13) {
        super(1);
        this.f60343i = i13;
        this.f60344j = tVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f60343i;
        t tVar = this.f60344j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(((i) tVar).f60357g), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(((i) tVar).f60355e), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f60343i) {
        }
        return b((yl1.b) obj);
    }
}
