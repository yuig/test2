package dx0;

import com.pinterest.feature.modules.shopTheLookFocus.shopTheLookCarousel.ShopTheLookCarouselContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56419r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ShopTheLookCarouselContainer f56420s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l82.i f56421t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShopTheLookCarouselContainer shopTheLookCarouselContainer, l82.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f56420s = shopTheLookCarouselContainer;
        this.f56421t = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f56420s, this.f56421t, cVar);
        bVar.f56419r = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r5 != false) goto L23;
     */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            ue.c.H(r11)
            java.lang.Object r11 = r10.f56419r
            dx0.f r11 = (dx0.f) r11
            com.pinterest.feature.modules.shopTheLookFocus.shopTheLookCarousel.ShopTheLookCarouselContainer r0 = r10.f56420s
            dx0.y r0 = r0.f46777e
            if (r0 == 0) goto Lae
            l82.i r1 = r10.f56421t
            u50.r r1 = r1.c()
            java.lang.String r2 = "displayState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.lang.String r2 = "eventIntake"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r0.f56476h = r1
            o82.y0 r1 = new o82.y0
            java.util.List r2 = r11.f56428b
            r3 = 6
            r4 = 0
            r5 = 0
            r1.<init>(r2, r4, r5, r3)
            o82.c3 r2 = r0.f56474f
            androidx.recyclerview.widget.w r1 = r2.A(r1)
            o82.b3 r2 = r0.f56472d
            r1.b(r2)
            dx0.d r1 = new dx0.d
            r3 = 1
            r1.<init>(r11, r3)
            com.pinterest.gestalt.text.GestaltText r6 = r0.f56473e
            r6.i(r1)
            boolean r1 = r11.f56431e
            if (r1 == 0) goto L61
            yq0.g0 r1 = new yq0.g0
            h32.g0 r6 = h32.g0.SHOP_YOUR_SAVES_STL
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r8 = "story_type"
            java.lang.String r9 = r11.f56430d
            bs1.c.G1(r8, r9, r7)
            nx.d0 r8 = r0.f56470b
            r1.<init>(r8, r6, r4, r7)
            r0.f56475g = r1
            androidx.recyclerview.widget.RecyclerView r6 = r0.f56471c
            r6.o(r1)
        L61:
            java.util.List r1 = r11.f56428b
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L8c
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            o82.u0 r1 = (o82.u0) r1
            if (r1 == 0) goto L7a
            l82.i0 r1 = r1.f93721a
            dx0.a r1 = (dx0.a) r1
            goto L7b
        L7a:
            r1 = r4
        L7b:
            if (r1 == 0) goto L7f
            wa2.m r4 = r1.f56417e
        L7f:
            if (r4 == 0) goto L8c
            wa2.m r1 = r0.f56479k
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r4, r1)
            if (r1 != 0) goto L8c
            r0.f56479k = r4
            r5 = r3
        L8c:
            mj0.g r1 = r0.f56478j
            mj0.g r3 = r11.f56435i
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r3, r1)
            if (r1 != 0) goto L99
            r0.f56478j = r3
            goto L9b
        L99:
            if (r5 == 0) goto La3
        L9b:
            int r1 = r11.f56436j
            dx0.y.L(r0, r1)
            r2.h()
        La3:
            r1 = -1
            int r11 = r11.f56437k
            if (r11 == r1) goto Lab
            r2.i(r11)
        Lab:
            r0.markImpressionEnd()
        Lae:
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
