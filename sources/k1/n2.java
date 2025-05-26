package k1;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77946i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f77947j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f77948k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f77949l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f77950m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f77951n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(f30 f30Var, boolean z13, boolean z14, boolean z15, i81.b bVar) {
        super(1);
        this.f77946i = 1;
        this.f77950m = f30Var;
        this.f77947j = z13;
        this.f77948k = z14;
        this.f77949l = z15;
        this.f77951n = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ql1.d variant;
        int i13 = this.f77946i;
        Object obj2 = this.f77951n;
        Object obj3 = this.f77950m;
        switch (i13) {
            case 1:
                pq.b it = (pq.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, (f30) obj3, qq.e.IMAGE_SEARCH, null, false, false, this.f77947j, this.f77948k, this.f77949l, (i81.b) obj2, false, false, 1564);
            default:
                ql1.j bind = (ql1.j) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                if (this.f77947j) {
                    Intrinsics.checkNotNullParameter("pinnerName", "string");
                    variant = new ql1.c(new u50.f0("pinnerName"), this.f77948k);
                } else {
                    Intrinsics.checkNotNullParameter("pinnerName", "string");
                    u50.f0 f0Var = new u50.f0("pinnerName");
                    ql1.f fVar = (ql1.f) obj3;
                    boolean z13 = this.f77949l;
                    variant = new ql1.b(f0Var, fVar, z13, z13 ? (String) obj2 : null);
                }
                bind.getClass();
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind.f104089a = variant;
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(boolean z13, boolean z14, ql1.f fVar, boolean z15) {
        super(1);
        this.f77946i = 2;
        this.f77947j = z13;
        this.f77948k = z14;
        this.f77950m = fVar;
        this.f77949l = z15;
        this.f77951n = "https://i.pinimg.com/150x150_RS/35/7b/f5/357bf5667759044421fcd3ccc977f6e1.jpg";
    }
}
