package gu1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66138i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f66139j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(b bVar, int i13) {
        super(1);
        this.f66138i = i13;
        this.f66139j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f66138i;
        b bVar = this.f66139j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], bVar.f66134c), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                ln1.l bind = (ln1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(((hu1.c) bVar.f66135d).f70417a);
                return Unit.f80348a;
        }
    }
}
