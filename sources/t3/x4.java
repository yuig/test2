package t3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public co2.e f116269r;

    /* renamed from: s, reason: collision with root package name */
    public int f116270s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f116271t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f116272u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Uri f116273v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y4 f116274w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ co2.q f116275x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f116276y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(ContentResolver contentResolver, Uri uri, y4 y4Var, co2.q qVar, Context context, bl2.c cVar) {
        super(2, cVar);
        this.f116272u = contentResolver;
        this.f116273v = uri;
        this.f116274w = y4Var;
        this.f116275x = qVar;
        this.f116276y = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x4 x4Var = new x4(this.f116272u, this.f116273v, this.f116274w, this.f116275x, this.f116276y, cVar);
        x4Var.f116271t = obj;
        return x4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x4) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:9:0x0042, B:14:0x0052, B:16:0x005a, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f116270s
            r2 = 2
            r3 = 1
            t3.y4 r4 = r10.f116274w
            android.content.ContentResolver r5 = r10.f116272u
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            co2.e r1 = r10.f116269r
            java.lang.Object r6 = r10.f116271t
            do2.j r6 = (do2.j) r6
            ue.c.H(r11)     // Catch: java.lang.Throwable -> L1b
        L19:
            r11 = r6
            goto L42
        L1b:
            r11 = move-exception
            goto L83
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            co2.e r1 = r10.f116269r
            java.lang.Object r6 = r10.f116271t
            do2.j r6 = (do2.j) r6
            ue.c.H(r11)     // Catch: java.lang.Throwable -> L1b
            goto L52
        L2f:
            ue.c.H(r11)
            java.lang.Object r11 = r10.f116271t
            do2.j r11 = (do2.j) r11
            android.net.Uri r1 = r10.f116273v
            r6 = 0
            r5.registerContentObserver(r1, r6, r4)
            co2.q r1 = r10.f116275x     // Catch: java.lang.Throwable -> L1b
            co2.e r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L42:
            r10.f116271t = r11     // Catch: java.lang.Throwable -> L1b
            r10.f116269r = r1     // Catch: java.lang.Throwable -> L1b
            r10.f116270s = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r6 = r1.d(r10)     // Catch: java.lang.Throwable -> L1b
            if (r6 != r0) goto L4f
            return r0
        L4f:
            r9 = r6
            r6 = r11
            r11 = r9
        L52:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1b
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1b
            if (r11 == 0) goto L7d
            r1.e()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r11 = r10.f116276y     // Catch: java.lang.Throwable -> L1b
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1b
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1b
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1b
            r10.f116271t = r6     // Catch: java.lang.Throwable -> L1b
            r10.f116269r = r1     // Catch: java.lang.Throwable -> L1b
            r10.f116270s = r2     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r11 = r6.emit(r7, r10)     // Catch: java.lang.Throwable -> L1b
            if (r11 != r0) goto L19
            return r0
        L7d:
            r5.unregisterContentObserver(r4)
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        L83:
            r5.unregisterContentObserver(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.x4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
