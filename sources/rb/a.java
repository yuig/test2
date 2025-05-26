package rb;

import android.content.Context;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f107055g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, vb.b taskExecutor, int i13) {
        super(context, taskExecutor);
        this.f107055g = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
            super(context, taskExecutor);
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        } else {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
            super(context, taskExecutor);
        }
    }

    @Override // rb.f
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f107055g) {
        }
        return f();
    }

    @Override // rb.d
    public final IntentFilter e() {
        switch (this.f107055g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean f() {
        /*
            r9 = this;
            int r0 = r9.f107055g
            r1 = -1
            java.lang.String r2 = "status"
            java.lang.String r3 = "getInitialState - null intent received"
            java.lang.String r4 = "android.intent.action.BATTERY_CHANGED"
            r5 = 0
            r6 = 1
            r7 = 0
            android.content.Context r8 = r9.f107061b
            switch(r0) {
                case 0: goto L86;
                case 1: goto L4d;
                default: goto L11;
            }
        L11:
            android.content.IntentFilter r0 = r9.e()
            android.content.Intent r0 = r8.registerReceiver(r7, r0)
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.getAction()
            if (r1 != 0) goto L22
            goto L40
        L22:
            java.lang.String r0 = r0.getAction()
            if (r0 == 0) goto L48
            int r1 = r0.hashCode()
            r2 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r1 == r2) goto L42
            r2 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r1 == r2) goto L37
            goto L48
        L37:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L48
        L40:
            r5 = r6
            goto L48
        L42:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r1)
        L48:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L4d:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r4)
            android.content.Intent r0 = r8.registerReceiver(r7, r0)
            if (r0 != 0) goto L64
            kb.b0 r0 = kb.b0.e()
            java.lang.String r1 = rb.c.f107057a
            r0.c(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L85
        L64:
            int r2 = r0.getIntExtra(r2, r1)
            java.lang.String r3 = "level"
            int r3 = r0.getIntExtra(r3, r1)
            java.lang.String r4 = "scale"
            int r0 = r0.getIntExtra(r4, r1)
            float r1 = (float) r3
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r2 == r6) goto L80
            r0 = 1041865114(0x3e19999a, float:0.15)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L81
        L80:
            r5 = r6
        L81:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        L85:
            return r0
        L86:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r4)
            android.content.Intent r0 = r8.registerReceiver(r7, r0)
            if (r0 != 0) goto L9d
            kb.b0 r0 = kb.b0.e()
            java.lang.String r1 = rb.b.f107056a
            r0.c(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lac
        L9d:
            int r0 = r0.getIntExtra(r2, r1)
            r1 = 2
            if (r0 == r1) goto La7
            r1 = 5
            if (r0 != r1) goto La8
        La7:
            r5 = r6
        La8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.a.f():java.lang.Boolean");
    }
}
