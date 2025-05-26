package kh2;

import android.content.pm.PackageInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f79707a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79708b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79709c;

    public t2(PackageInfo packageInfo) {
        String m13;
        String m14;
        Object m15;
        try {
            xk2.q qVar = xk2.s.f135225b;
            String valueOf = String.valueOf(packageInfo.versionName);
            int length = valueOf.length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length) {
                boolean z14 = Intrinsics.i(valueOf.charAt(!z13 ? i13 : length), 32) <= 0;
                if (z13) {
                    if (!z14) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z14) {
                    i13++;
                } else {
                    z13 = true;
                }
            }
            m13 = valueOf.subSequence(i13, length + 1).toString();
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        xk2.q qVar3 = xk2.s.f135225b;
        String versionName = (String) (m13 instanceof xk2.r ? "UNKNOWN" : m13);
        try {
            m14 = String.valueOf(packageInfo.versionCode);
        } catch (Throwable th4) {
            xk2.q qVar4 = xk2.s.f135225b;
            m14 = ue.c.m(th4);
        }
        String versionCode = (String) (m14 instanceof xk2.r ? "UNKNOWN" : m14);
        try {
            m15 = packageInfo.packageName;
        } catch (Throwable th5) {
            xk2.q qVar5 = xk2.s.f135225b;
            m15 = ue.c.m(th5);
        }
        String packageName = (String) (m15 instanceof xk2.r ? "UNKNOWN" : m15);
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f79707a = versionName;
        this.f79708b = versionCode;
        this.f79709c = packageName;
    }
}
