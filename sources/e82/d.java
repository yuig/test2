package e82;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57823i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f57824j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(1);
        this.f57823i = i13;
        this.f57824j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        Unit unit2;
        int i13 = this.f57823i;
        f fVar = this.f57824j;
        switch (i13) {
            case 0:
                vd0.a k13 = ((vd0.c) obj).k("data");
                Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
                if (k13.d() > 0) {
                    vd0.c b13 = k13.b(0);
                    if (b13 != null) {
                        fVar.f57834d = b13.o("id", "");
                        Boolean h10 = b13.h("is_ingestion_enabled", Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
                        fVar.f57837g = h10.booleanValue();
                        fVar.f57832b.getClass();
                        fVar.f57838h = false;
                        vd0.c m13 = b13.m("board");
                        if (m13 != null) {
                            fVar.f57835e = m13.d("id");
                            unit = Unit.f80348a;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            fVar.f57835e = null;
                        }
                        vd0.c m14 = b13.m("section");
                        if (m14 != null) {
                            fVar.f57836f = m14.d("id");
                            unit2 = Unit.f80348a;
                        } else {
                            unit2 = null;
                        }
                        if (unit2 == null) {
                            fVar.f57836f = null;
                        }
                        vd0.c m15 = b13.m("fallback_board");
                        if (m15 != null) {
                            fVar.f57841k = m15.o("name", "");
                            fVar.f57842l = m15.o("image_cover_url", "");
                            fVar.f57843m = m15.o("layout", "");
                        }
                    }
                } else {
                    fVar.f57834d = null;
                    fVar.f57835e = null;
                    fVar.f57836f = null;
                    fVar.f57837g = false;
                    fVar.f57838h = false;
                }
                uk2.f fVar2 = fVar.f57839i;
                String str = fVar.f57834d;
                fVar2.c(new g(!(str == null || str.length() == 0), fVar.f57837g, fVar.f57838h));
                break;
            default:
                fVar.f57840j.c((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
