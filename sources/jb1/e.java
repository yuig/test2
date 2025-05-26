package jb1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75332i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f75333j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(b bVar, int i13) {
        super(1);
        this.f75332i = i13;
        this.f75333j = bVar;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f75332i;
        b bVar = this.f75333j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(bVar.f75325a), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(bVar.f75326b), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75332i) {
            case 0:
                return b((ao1.b) obj);
            case 1:
                return b((ao1.b) obj);
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f75333j.f75327c, null, null, null, null, null, null, 0, null, 1021);
        }
    }
}
