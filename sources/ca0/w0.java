package ca0;

import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r72.q1;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final w0 f27170j = new w0(0);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27171i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i13) {
        super(2);
        this.f27171i = i13;
    }

    public final void b(i2.o oVar, int i13) {
        g62.a aVar = g62.a.f63738a;
        u2.n nVar = u2.n.f120041b;
        switch (this.f27171i) {
            case 1:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                n0.f(bs1.c.h2("Publish as a Pin"), k3.b0(oVar), null, null, 0.0f, oVar, 8, 28);
                break;
            case 2:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                n0.d(androidx.compose.foundation.layout.e.m(nVar, 500), false, null, null, 0L, null, null, 0.0f, oVar, 6, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
                break;
            case 3:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                n0.e(u2.b.f120025m, kotlin.collections.q0.f80391a, q1.f106625d, new kp.n(0), aVar, androidx.compose.foundation.layout.b.n(nVar, 16), oVar, 197174, 0);
                break;
            case 4:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                n0.b(z0.AltText, null, null, null, null, oVar, 6, 30);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                Intrinsics.checkNotNullParameter("Publish as a Pin", "string");
                n0.a(new d(new u50.f0("Publish as a Pin"), kotlin.collections.q0.f80391a, null, true, 3068), new kp.n(1), aVar, new d1(), androidx.compose.foundation.layout.e.m(nVar, AdSize.WIDE_SKYSCRAPER_HEIGHT), oVar, 24584, 0);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27171i) {
            case 0:
                l82.e createLens = (l82.e) obj;
                l82.c0 subResult = (l82.c0) obj2;
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                createLens.f(new s90.i0(subResult, 9));
                createLens.h(new s90.i0(subResult, 10));
                d7.g.y(subResult, 20, createLens);
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
