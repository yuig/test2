package oi;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbg;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94689a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f94690b;

    /* renamed from: c, reason: collision with root package name */
    public Object f94691c;

    /* renamed from: d, reason: collision with root package name */
    public Object f94692d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f94693e;

    public /* synthetic */ b4(i7 i7Var, int i13) {
        this(i7Var);
    }

    public static b4 c(zzbg zzbgVar) {
        String str = zzbgVar.f32030f;
        return new b4(zzbgVar.f32033i, zzbgVar.f32031g.f(), str, zzbgVar.f32032h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00b0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:76:0x00b0 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.h3 a(com.google.android.gms.internal.measurement.h3 r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.b4.a(com.google.android.gms.internal.measurement.h3, java.lang.String):com.google.android.gms.internal.measurement.h3");
    }

    public final zzbg b() {
        return new zzbg((String) this.f94691c, new zzbb(new Bundle((Bundle) this.f94693e)), (String) this.f94692d, this.f94690b);
    }

    public final String toString() {
        switch (this.f94689a) {
            case 0:
                String str = (String) this.f94692d;
                String str2 = (String) this.f94691c;
                String valueOf = String.valueOf((Bundle) this.f94693e);
                StringBuilder w13 = a.a.w("origin=", str, ",name=", str2, ",params=");
                w13.append(valueOf);
                return w13.toString();
            default:
                return super.toString();
        }
    }

    public b4(long j13, Bundle bundle, String str, String str2) {
        this.f94691c = str;
        this.f94692d = str2;
        this.f94693e = bundle;
        this.f94690b = j13;
    }

    public b4(i7 i7Var) {
        this.f94693e = i7Var;
    }

    public b4(Function1 onUpdate) {
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        this.f94691c = onUpdate;
        this.f94690b = 16L;
        this.f94693e = xk2.m.b(fp0.a.f62755i);
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        this.f94692d = valueOf;
        ((Handler) ((xk2.k) this.f94693e).getValue()).postDelayed(new l7.b0(valueOf.longValue(), this, 5), this.f94690b);
    }
}
