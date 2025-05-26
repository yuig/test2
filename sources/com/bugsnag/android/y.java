package com.bugsnag.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes3.dex */
public final class y extends id.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29693e;

    public /* synthetic */ y(Object obj, int i13) {
        this.f29692d = i13;
        this.f29693e = obj;
    }

    @Override // id.d
    public final Object c() {
        int i13 = this.f29692d;
        Object obj = this.f29693e;
        switch (i13) {
            case 0:
                z zVar = (z) obj;
                return Boolean.valueOf(new RootDetector((i0) zVar.f29714i, (u1) zVar.f29713h).c());
            case 1:
                return new q2((Context) obj);
            default:
                try {
                    byte[] u13 = lp2.b.u((ApplicationInfo) obj);
                    if (u13 == null) {
                        return null;
                    }
                    StringBuilder sb3 = new StringBuilder(u13.length * 2);
                    int length = u13.length;
                    int i14 = 0;
                    while (i14 < length) {
                        byte b13 = u13[i14];
                        i14++;
                        int i15 = b13 & 255;
                        if (i15 < 16) {
                            sb3.append('0');
                        }
                        String num = Integer.toString(i15, CharsKt.checkRadix(16));
                        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                        sb3.append(num);
                    }
                    String sb4 = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder(capacity).…builderAction).toString()");
                    return sb4;
                } catch (Throwable unused) {
                    return null;
                }
        }
    }
}
