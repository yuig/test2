package jn0;

import ao2.j0;
import com.pinterest.feature.boardpreview.view.ShareBoardThumbnailsView;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.h0;

/* loaded from: classes5.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public h0 f77090r;

    /* renamed from: s, reason: collision with root package name */
    public int f77091s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ShareBoardThumbnailsView f77092t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ShareBoardThumbnailsView shareBoardThumbnailsView, bl2.c cVar) {
        super(2, cVar);
        this.f77092t = shareBoardThumbnailsView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f77092t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:5:0x005b). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f77091s
            r2 = 1
            com.pinterest.feature.boardpreview.view.ShareBoardThumbnailsView r3 = r9.f77092t
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.jvm.internal.h0 r1 = r9.f77090r
            ue.c.H(r10)
            goto L5b
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            ue.c.H(r10)
            kotlin.jvm.internal.h0 r10 = new kotlin.jvm.internal.h0
            r10.<init>()
            r1 = r10
        L22:
            q5.w0 r10 = d7.b.O(r3)
            java.util.Iterator r10 = r10.iterator()
            r4 = 0
            r5 = r4
        L2c:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r10.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L49
            android.view.View r6 = (android.view.View) r6
            int r8 = r1.f80426a
            if (r5 != r8) goto L42
            r5 = r4
            goto L44
        L42:
            r5 = 8
        L44:
            r6.setVisibility(r5)
            r5 = r7
            goto L2c
        L49:
            kotlin.collections.f0.p()
            r10 = 0
            throw r10
        L4e:
            r9.f77090r = r1
            r9.f77091s = r2
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = lb.l0.S(r4, r9)
            if (r10 != r0) goto L5b
            return r0
        L5b:
            int r10 = r1.f80426a
            int r10 = r10 + r2
            int r4 = r3.getChildCount()
            int r10 = r10 % r4
            r1.f80426a = r10
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: jn0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
