package xh0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134973i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f134974j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i13) {
        super(1);
        this.f134973i = i13;
        this.f134974j = gVar;
    }

    public final em1.d b(em1.d it) {
        int i13 = this.f134973i;
        g gVar = this.f134974j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, gVar.f134961u ? em1.b.CHECKED : em1.b.UNCHECKED, null, null, bs1.c.h2(gVar.f134977x), null, null, 0, null, false, 0, 1014);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, gVar.f134961u ? em1.b.CHECKED : em1.b.UNCHECKED, null, null, null, null, null, 0, null, false, 0, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f134973i) {
        }
        return b((em1.d) obj);
    }
}
