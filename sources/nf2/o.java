package nf2;

import a.cb;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f90508a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90509b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90510c;

    /* renamed from: d, reason: collision with root package name */
    public final String f90511d;

    /* renamed from: e, reason: collision with root package name */
    public final String f90512e;

    /* renamed from: f, reason: collision with root package name */
    public final String f90513f;

    /* renamed from: g, reason: collision with root package name */
    public final String f90514g;

    public o() {
        String osVersion;
        String androidOsApiLevel;
        String deviceManufacturer;
        String osBuild = Build.VERSION.BASE_OS;
        Intrinsics.checkNotNullExpressionValue(osBuild, "{\n        Build.VERSION.BASE_OS\n    }");
        String deviceModel = "";
        try {
            osVersion = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(osVersion, "{\n        Build.VERSION.RELEASE\n    }");
        } catch (Throwable unused) {
            osVersion = "";
        }
        try {
            androidOsApiLevel = String.valueOf(Build.VERSION.SDK_INT);
        } catch (Throwable unused2) {
            androidOsApiLevel = "";
        }
        try {
            deviceManufacturer = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(deviceManufacturer, "{\n        Build.MANUFACTURER\n    }");
        } catch (Throwable unused3) {
            deviceManufacturer = "";
        }
        try {
            String str = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str, "{\n        Build.MODEL\n    }");
            deviceModel = str;
        } catch (Throwable unused4) {
        }
        Intrinsics.checkNotNullParameter("android", "osName");
        Intrinsics.checkNotNullParameter("linux", "osType");
        Intrinsics.checkNotNullParameter(osBuild, "osBuild");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(androidOsApiLevel, "androidOsApiLevel");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.f90508a = "android";
        this.f90509b = "linux";
        this.f90510c = osBuild;
        this.f90511d = osVersion;
        this.f90512e = androidOsApiLevel;
        this.f90513f = deviceManufacturer;
        this.f90514g = deviceModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f90508a, oVar.f90508a) && Intrinsics.d(this.f90509b, oVar.f90509b) && Intrinsics.d(this.f90510c, oVar.f90510c) && Intrinsics.d(this.f90511d, oVar.f90511d) && Intrinsics.d(this.f90512e, oVar.f90512e) && Intrinsics.d(this.f90513f, oVar.f90513f) && Intrinsics.d(this.f90514g, oVar.f90514g);
    }

    public final int hashCode() {
        return this.f90514g.hashCode() + cb.d(this.f90513f, cb.d(this.f90512e, cb.d(this.f90511d, cb.d(this.f90510c, cb.d(this.f90509b, this.f90508a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SystemInfo(osName=");
        sb3.append(this.f90508a);
        sb3.append(", osType=");
        sb3.append(this.f90509b);
        sb3.append(", osBuild=");
        sb3.append(this.f90510c);
        sb3.append(", osVersion=");
        sb3.append(this.f90511d);
        sb3.append(", androidOsApiLevel=");
        sb3.append(this.f90512e);
        sb3.append(", deviceManufacturer=");
        sb3.append(this.f90513f);
        sb3.append(", deviceModel=");
        return ep.b.k(sb3, this.f90514g, ')');
    }
}
