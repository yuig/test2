package ads_mobile_sdk;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ao2.j0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y60 implements a.og {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f14097a;

    /* renamed from: b, reason: collision with root package name */
    public final t60 f14098b;

    /* renamed from: c, reason: collision with root package name */
    public final oh0 f14099c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14100d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14101e;

    /* renamed from: f, reason: collision with root package name */
    public final nm.u f14102f;

    /* renamed from: g, reason: collision with root package name */
    public final ss2 f14103g;

    /* renamed from: h, reason: collision with root package name */
    public PointF f14104h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f14105i;

    /* renamed from: j, reason: collision with root package name */
    public v60 f14106j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14107k;

    /* renamed from: l, reason: collision with root package name */
    public ao2.o1 f14108l;

    public y60(Context context, j0 backgroundScope, t60 debugDialogManager, oh0 flags, String str, String str2, nm.u uVar, ss2 traceMetaSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(debugDialogManager, "debugDialogManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        this.f14097a = backgroundScope;
        this.f14098b = debugDialogManager;
        this.f14099c = flags;
        this.f14100d = str;
        this.f14101e = str2;
        this.f14102f = uVar;
        this.f14103g = traceMetaSet;
        this.f14104h = new PointF(-1.0f, -1.0f);
        this.f14105i = new PointF(-1.0f, -1.0f);
        this.f14106j = v60.f12370d;
        this.f14107k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.y60 r7, bl2.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof ads_mobile_sdk.x60
            if (r0 == 0) goto L17
            r0 = r8
            ads_mobile_sdk.x60 r0 = (ads_mobile_sdk.x60) r0
            int r1 = r0.f13509d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f13509d = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            ads_mobile_sdk.x60 r0 = new ads_mobile_sdk.x60
            r0.<init>(r7, r8)
            goto L15
        L1d:
            java.lang.Object r8 = r6.f13507b
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f13509d
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L37
            if (r1 != r3) goto L2f
            ue.c.H(r8)
            goto L7c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ads_mobile_sdk.y60 r7 = r6.f13506a
            ue.c.H(r8)
            goto L5e
        L3d:
            ue.c.H(r8)
            ads_mobile_sdk.oh0 r8 = r7.f14099c
            r8.getClass()
            zn2.a r1 = zn2.b.f142311b
            zn2.d r1 = zn2.d.SECONDS
            long r4 = dl2.b.P2(r3, r1)
            java.lang.String r1 = "gads:debug_hold_gesture:time_millis"
            long r4 = r8.a(r4, r1)
            r6.f13506a = r7
            r6.f13509d = r2
            java.lang.Object r8 = lb.l0.T(r4, r6)
            if (r8 != r0) goto L5e
            goto L7e
        L5e:
            ads_mobile_sdk.v60 r8 = ads_mobile_sdk.v60.f12369c
            r7.f14106j = r8
            ads_mobile_sdk.t60 r1 = r7.f14098b
            java.lang.String r2 = r7.f14100d
            java.lang.String r8 = r7.f14101e
            nm.u r4 = r7.f14102f
            ads_mobile_sdk.ss2 r5 = r7.f14103g
            r7 = 0
            r6.f13506a = r7
            r6.f13509d = r3
            r1.getClass()
            r3 = r8
            java.lang.Object r7 = ads_mobile_sdk.t60.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L7c
            goto L7e
        L7c:
            kotlin.Unit r0 = kotlin.Unit.f80348a
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y60.a(ads_mobile_sdk.y60, bl2.c):java.lang.Object");
    }

    public final boolean a(float f13, float f14, float f15, float f16) {
        return Math.abs(this.f14104h.x - f13) < ((float) this.f14107k) && Math.abs(this.f14104h.y - f14) < ((float) this.f14107k) && Math.abs(this.f14105i.x - f15) < ((float) this.f14107k) && Math.abs(this.f14105i.y - f16) < ((float) this.f14107k);
    }

    public final void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        int historySize = event.getHistorySize();
        int pointerCount = event.getPointerCount();
        if (actionMasked == 0) {
            this.f14106j = v60.f12367a;
            this.f14104h = new PointF(event.getX(), event.getY());
            return;
        }
        v60 v60Var = this.f14106j;
        if (v60Var == v60.f12370d) {
            return;
        }
        if (v60Var == v60.f12367a && actionMasked == 5) {
            this.f14106j = v60.f12368b;
            this.f14105i = new PointF(event.getX(1), event.getY(1));
            j0 j0Var = this.f14097a;
            w60 block = new w60(this, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            this.f14108l = kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
            return;
        }
        if (v60Var == v60.f12368b) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z13 = false;
                int i13 = 0;
                while (true) {
                    if (i13 >= historySize) {
                        break;
                    }
                    if (!a(event.getHistoricalX(0, i13), event.getHistoricalY(0, i13), event.getHistoricalX(1, i13), event.getHistoricalY(1, i13))) {
                        z13 = true;
                        break;
                    }
                    i13++;
                }
                if (a(event.getX(), event.getY(), event.getX(1), event.getY(1)) && !z13) {
                    return;
                }
            }
            ao2.o1 o1Var = this.f14108l;
            if (o1Var != null) {
                o1Var.cancel((CancellationException) null);
            }
            this.f14106j = v60.f12370d;
        }
    }
}
