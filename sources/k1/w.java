package k1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f78060i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b3.s f78061j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f78062k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f78063l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f78064m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f78065n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f78066o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d3.l f78067p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z13, b3.s sVar, long j13, float f13, float f14, long j14, long j15, d3.l lVar) {
        super(1);
        this.f78060i = z13;
        this.f78061j = sVar;
        this.f78062k = j13;
        this.f78063l = f13;
        this.f78064m = f14;
        this.f78065n = j14;
        this.f78066o = j15;
        this.f78067p = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s3.m0 m0Var = (s3.m0) ((d3.e) obj);
        m0Var.a();
        if (this.f78060i) {
            d3.h.w(m0Var, this.f78061j, 0L, 0L, this.f78062k, null, RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP);
        } else {
            long j13 = this.f78062k;
            float b13 = a3.a.b(j13);
            float f13 = this.f78063l;
            if (b13 < f13) {
                float f14 = this.f78064m;
                d3.c cVar = m0Var.f110840a;
                float d2 = a3.f.d(cVar.g());
                float f15 = this.f78064m;
                float f16 = d2 - f15;
                float b14 = a3.f.b(cVar.g()) - f15;
                b3.s sVar = this.f78061j;
                long j14 = this.f78062k;
                d3.b bVar = cVar.f53652b;
                long e13 = bVar.e();
                bVar.a().j();
                try {
                    bVar.f53648a.f53655a.a().e(f14, f14, f16, b14, 0);
                    d3.h.w(m0Var, sVar, 0L, 0L, j14, null, RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP);
                } finally {
                    ep.b.z(bVar, e13);
                }
            } else {
                d3.h.w(m0Var, this.f78061j, this.f78065n, this.f78066o, androidx.compose.foundation.a.i(j13, f13), this.f78067p, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION);
            }
        }
        return Unit.f80348a;
    }
}
