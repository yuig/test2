package yv1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140218i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q42.f f140219j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q42.f fVar, int i13) {
        super(1);
        this.f140218i = i13;
        this.f140219j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140218i;
        q42.f fVar = this.f140219j;
        switch (i13) {
            case 0:
                en1.d it = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return en1.d.e(it, null, null, bs1.c.h2(fVar.name()), false, null, null, false, 0, 503);
            default:
                jb2.b it2 = (jb2.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return jb2.b.e(it2, null, null, false, 0.0f, bs1.c.h2(fVar.name()), false, null, 0, 479);
        }
    }
}
