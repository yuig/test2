package m60;

import com.pinterest.api.model.wy0;
import jk2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import so.oa;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f85918i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f85919j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, boolean z13) {
        super(1);
        this.f85918i = mVar;
        this.f85919j = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
        Intrinsics.checkNotNullParameter(builder, "builder");
        m mVar = this.f85918i;
        g10.a aVar = (g10.a) ((su1.o) mVar.B.getValue());
        aVar.getClass();
        Intrinsics.checkNotNullParameter(builder, "builder");
        b60.d dVar = (b60.d) aVar.f63360b;
        wy0 f13 = dVar.f();
        uk2.f fVar = dVar.f22014d;
        fVar.getClass();
        a1 a1Var = new a1(fVar);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        aVar.f63359a.getClass();
        String id3 = f13 == null ? "" : f13.getId();
        if (id3.isEmpty()) {
            id3 = null;
        }
        su1.a aVar2 = new su1.a(vb0.b.f125448a.a(), id3);
        a1Var.F(new f00.a(1, "\u0000", aVar2), new ir.i(4), ck2.i.f27923c, ck2.i.f27924d);
        builder.a(aVar2);
        ((g10.b) ((su1.i) mVar.C.getValue())).getClass();
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!this.f85919j) {
            if (mVar.j().h()) {
                vu1.z zVar = (vu1.z) ((bf2.b) mVar.i().d()).get();
                zVar.a();
                builder.a(zVar);
            } else if (((tu1.g0) ((bf2.b) mVar.i().c()).get()).c()) {
                m.g(mVar, builder);
            }
            if (!((tu1.i) ((bf2.b) mVar.i().b()).get()).b() && ((oa) mVar.i().f()).d3().w()) {
                builder.a(mVar.l().a());
            }
        }
        return Unit.f80348a;
    }
}
