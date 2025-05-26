package ia2;

import bp1.d;
import bp1.e;
import bp1.g;
import bp1.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import z40.d0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f72008a = new a();

    public a() {
        super(1, h.class, "getBestMediumAvatarImageUrl", "getBestMediumAvatarImageUrl(Lcom/pinterest/hairball/graphql/tuples/UserTuple;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g p03 = (g) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p03, "<this>");
        bp1.c cVar = p03.f23662a;
        if (cVar instanceof d) {
            d0 d0Var = ((d) cVar).f23653b;
            Intrinsics.checkNotNullParameter(d0Var, "<this>");
            return dl2.b.h1(d0Var.b(), d0Var.e(), d0Var.m(), d0Var.k());
        }
        if (cVar instanceof e) {
            return dl2.b.t0(((e) cVar).f23654b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
