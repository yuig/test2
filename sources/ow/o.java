package ow;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public String f97843r;

    /* renamed from: s, reason: collision with root package name */
    public ww.g f97844s;

    /* renamed from: t, reason: collision with root package name */
    public int f97845t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f30 f97846u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f97847v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f97848w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f97849x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f30 f30Var, p0 p0Var, float f13, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f97846u = f30Var;
        this.f97847v = p0Var;
        this.f97848w = f13;
        this.f97849x = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f97846u, this.f97847v, this.f97848w, this.f97849x, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f97845t
            float r2 = r10.f97848w
            r3 = 1
            ow.p0 r4 = r10.f97847v
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L16
            ww.g r0 = r10.f97844s
            java.lang.String r1 = r10.f97843r
            ue.c.H(r11)
            goto L9e
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            ue.c.H(r11)
            com.pinterest.api.model.f30 r11 = r10.f97846u
            java.lang.String r1 = r11.getId()
            java.lang.String r11 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r11)
            java.util.LinkedHashMap r11 = r4.f97871m
            java.lang.Object r11 = r11.get(r1)
            ww.g r11 = (ww.g) r11
            if (r11 == 0) goto L39
            fn.i r5 = r11.f131165c
            goto L3a
        L39:
            r5 = 0
        L3a:
            pw.a r6 = r4.f97861c
            java.lang.String r7 = "message"
            if (r5 == 0) goto Lad
            com.iab.omid.library.pinterest.adsession.media.b r5 = r11.f131167e
            if (r5 != 0) goto L45
            goto Lad
        L45:
            boolean r5 = r11.f131172j
            if (r5 == 0) goto L56
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r11 = "Playback lifecycle completed, skipping additional OMSDK event logging."
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        L56:
            boolean r5 = r10.f97849x
            if (r5 != 0) goto L69
            ww.i r5 = r11.f131170h
            ww.k r8 = r5.f131178a
            ww.k r9 = ww.k.STATE_READY
            if (r8 != r9) goto L67
            boolean r5 = r5.f131179b
            if (r5 == 0) goto L67
            goto L69
        L67:
            r5 = 0
            goto L6a
        L69:
            r5 = r3
        L6a:
            java.lang.Float r8 = r11.f131171i
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r2, r8)
            if (r8 == 0) goto L7f
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r11 = "Volume change matches last video playing volume, skipping volume change event."
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        L7f:
            if (r5 != 0) goto L8e
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r11 = "Volume changed but video is not in a ready state, skipping volume change event."
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        L8e:
            r10.f97843r = r1
            r10.f97844s = r11
            r10.f97845t = r3
            com.iab.omid.library.pinterest.adsession.media.b r3 = r11.f131167e
            java.lang.Object r3 = ow.p0.l(r4, r1, r2, r3, r10)
            if (r3 != r0) goto L9d
            return r0
        L9d:
            r0 = r11
        L9e:
            java.util.LinkedHashMap r11 = r4.f97871m
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r2)
            r0.f131171i = r3
            r11.put(r1, r0)
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        Lad:
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r11 = "Attempting to resolve audible state changed for ad session or media events that do not exist."
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
