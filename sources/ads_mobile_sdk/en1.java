package ads_mobile_sdk;

import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class en1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4902a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4903b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4904c;

    /* renamed from: d, reason: collision with root package name */
    public long f4905d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4906e;

    /* renamed from: f, reason: collision with root package name */
    public hy2 f4907f;

    public /* synthetic */ en1() {
        this(false, false, false, 0L, null, null);
    }

    public final nm.u a(Context context, String afmaVersion, String adId, hf appSettings) {
        float f13;
        String str;
        nm.u uVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        nm.q qVar = new nm.q();
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        hy2 hy2Var = this.f4907f;
        if (hy2Var == null) {
            uVar = new nm.u();
        } else {
            nm.u uVar2 = new nm.u();
            uVar2.u("afmaVersion", afmaVersion);
            uVar2.r("activeViewJSON", new nm.u());
            uVar2.s(Long.valueOf(this.f4905d), "timestamp");
            uVar2.t("isNative", Boolean.TRUE);
            uVar2.u("adFormat", "native");
            uVar2.t("isMraid", Boolean.FALSE);
            uVar2.u("hashCode", adId);
            uVar2.t("isStopped", Boolean.valueOf(this.f4904c));
            uVar2.t("isPaused", Boolean.valueOf(this.f4903b));
            uVar2.t("isScreenOn", Boolean.valueOf(powerManager.isInteractive()));
            uVar2.t("appMuted", Boolean.valueOf(appSettings.f5945d));
            uVar2.s(Float.valueOf(appSettings.f5944c), "appVolume");
            Intrinsics.checkNotNullParameter(context, "context");
            AudioManager audioManager = (AudioManager) context.getSystemService(AudioManager.class);
            if (audioManager != null) {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                if (streamMaxVolume != 0) {
                    f13 = streamVolume / streamMaxVolume;
                    uVar2.s(Float.valueOf(f13), "deviceVolume");
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    uVar2.s(Integer.valueOf(hy2Var.f6145c), "windowVisibility");
                    uVar2.t("isAttachedToWindow", Boolean.valueOf(hy2Var.f6147e));
                    nm.u uVar3 = new nm.u();
                    uVar3.s(Integer.valueOf(hy2Var.f6148f.top), "top");
                    uVar3.s(Integer.valueOf(hy2Var.f6148f.bottom), "bottom");
                    uVar3.s(Integer.valueOf(hy2Var.f6148f.left), "left");
                    uVar3.s(Integer.valueOf(hy2Var.f6148f.right), "right");
                    Unit unit = Unit.f80348a;
                    uVar2.r("viewBox", uVar3);
                    nm.u uVar4 = new nm.u();
                    uVar4.s(Integer.valueOf(hy2Var.f6146d.top), "top");
                    uVar4.s(Integer.valueOf(hy2Var.f6146d.bottom), "bottom");
                    uVar4.s(Integer.valueOf(hy2Var.f6146d.left), "left");
                    uVar4.s(Integer.valueOf(hy2Var.f6146d.right), "right");
                    uVar2.r("adBox", uVar4);
                    nm.u uVar5 = new nm.u();
                    uVar5.s(Integer.valueOf(hy2Var.f6149g.top), "top");
                    uVar5.s(Integer.valueOf(hy2Var.f6149g.bottom), "bottom");
                    uVar5.s(Integer.valueOf(hy2Var.f6149g.left), "left");
                    uVar5.s(Integer.valueOf(hy2Var.f6149g.right), "right");
                    uVar2.r("globalVisibleBox", uVar5);
                    uVar2.t("globalVisibleBoxVisible", Boolean.valueOf(hy2Var.f6150h));
                    nm.u uVar6 = new nm.u();
                    uVar6.s(Integer.valueOf(hy2Var.f6151i.top), "top");
                    uVar6.s(Integer.valueOf(hy2Var.f6151i.bottom), "bottom");
                    uVar6.s(Integer.valueOf(hy2Var.f6151i.left), "left");
                    uVar6.s(Integer.valueOf(hy2Var.f6151i.right), "right");
                    uVar2.r("localVisibleBox", uVar6);
                    uVar2.t("localVisibleBoxVisible", Boolean.valueOf(hy2Var.f6152j));
                    nm.u uVar7 = new nm.u();
                    uVar7.s(Integer.valueOf(hy2Var.f6153k.top), "top");
                    uVar7.s(Integer.valueOf(hy2Var.f6153k.bottom), "bottom");
                    uVar7.s(Integer.valueOf(hy2Var.f6153k.left), "left");
                    uVar7.s(Integer.valueOf(hy2Var.f6153k.right), "right");
                    uVar2.r("hitBox", uVar7);
                    uVar2.s(Float.valueOf(displayMetrics.density), "screenDensity");
                    uVar2.t("isVisible", Boolean.valueOf(this.f4902a));
                    str = this.f4906e;
                    if (str != null && str.length() != 0) {
                        uVar2.u("doneReasonCode", "u");
                    }
                    uVar = uVar2;
                }
            }
            f13 = 0.0f;
            uVar2.s(Float.valueOf(f13), "deviceVolume");
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            uVar2.s(Integer.valueOf(hy2Var.f6145c), "windowVisibility");
            uVar2.t("isAttachedToWindow", Boolean.valueOf(hy2Var.f6147e));
            nm.u uVar32 = new nm.u();
            uVar32.s(Integer.valueOf(hy2Var.f6148f.top), "top");
            uVar32.s(Integer.valueOf(hy2Var.f6148f.bottom), "bottom");
            uVar32.s(Integer.valueOf(hy2Var.f6148f.left), "left");
            uVar32.s(Integer.valueOf(hy2Var.f6148f.right), "right");
            Unit unit2 = Unit.f80348a;
            uVar2.r("viewBox", uVar32);
            nm.u uVar42 = new nm.u();
            uVar42.s(Integer.valueOf(hy2Var.f6146d.top), "top");
            uVar42.s(Integer.valueOf(hy2Var.f6146d.bottom), "bottom");
            uVar42.s(Integer.valueOf(hy2Var.f6146d.left), "left");
            uVar42.s(Integer.valueOf(hy2Var.f6146d.right), "right");
            uVar2.r("adBox", uVar42);
            nm.u uVar52 = new nm.u();
            uVar52.s(Integer.valueOf(hy2Var.f6149g.top), "top");
            uVar52.s(Integer.valueOf(hy2Var.f6149g.bottom), "bottom");
            uVar52.s(Integer.valueOf(hy2Var.f6149g.left), "left");
            uVar52.s(Integer.valueOf(hy2Var.f6149g.right), "right");
            uVar2.r("globalVisibleBox", uVar52);
            uVar2.t("globalVisibleBoxVisible", Boolean.valueOf(hy2Var.f6150h));
            nm.u uVar62 = new nm.u();
            uVar62.s(Integer.valueOf(hy2Var.f6151i.top), "top");
            uVar62.s(Integer.valueOf(hy2Var.f6151i.bottom), "bottom");
            uVar62.s(Integer.valueOf(hy2Var.f6151i.left), "left");
            uVar62.s(Integer.valueOf(hy2Var.f6151i.right), "right");
            uVar2.r("localVisibleBox", uVar62);
            uVar2.t("localVisibleBoxVisible", Boolean.valueOf(hy2Var.f6152j));
            nm.u uVar72 = new nm.u();
            uVar72.s(Integer.valueOf(hy2Var.f6153k.top), "top");
            uVar72.s(Integer.valueOf(hy2Var.f6153k.bottom), "bottom");
            uVar72.s(Integer.valueOf(hy2Var.f6153k.left), "left");
            uVar72.s(Integer.valueOf(hy2Var.f6153k.right), "right");
            uVar2.r("hitBox", uVar72);
            uVar2.s(Float.valueOf(displayMetrics2.density), "screenDensity");
            uVar2.t("isVisible", Boolean.valueOf(this.f4902a));
            str = this.f4906e;
            if (str != null) {
                uVar2.u("doneReasonCode", "u");
            }
            uVar = uVar2;
        }
        qVar.t(uVar);
        nm.u uVar8 = new nm.u();
        uVar8.r("units", qVar);
        return uVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en1)) {
            return false;
        }
        en1 en1Var = (en1) obj;
        return this.f4902a == en1Var.f4902a && this.f4903b == en1Var.f4903b && this.f4904c == en1Var.f4904c && this.f4905d == en1Var.f4905d && Intrinsics.d(this.f4906e, en1Var.f4906e) && Intrinsics.d(this.f4907f, en1Var.f4907f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public final int hashCode() {
        boolean z13 = this.f4902a;
        ?? r03 = z13;
        if (z13) {
            r03 = 1;
        }
        int i13 = r03 * 31;
        ?? r33 = this.f4903b;
        int i14 = r33;
        if (r33 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z14 = this.f4904c;
        int c13 = a.a.c(this.f4905d, (i15 + (z14 ? 1 : z14 ? 1 : 0)) * 31, 31);
        String str = this.f4906e;
        int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        hy2 hy2Var = this.f4907f;
        return hashCode + (hy2Var != null ? hy2Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeVideoViewabilityState(isVisible=" + this.f4902a + ", isPaused=" + this.f4903b + ", isStopped=" + this.f4904c + ", timestamp=" + this.f4905d + ", doneReason=" + this.f4906e + ", viewabilityEvent=" + this.f4907f + ")";
    }

    public en1(boolean z13, boolean z14, boolean z15, long j13, String str, hy2 hy2Var) {
        this.f4902a = z13;
        this.f4903b = z14;
        this.f4904c = z15;
        this.f4905d = j13;
        this.f4906e = str;
        this.f4907f = hy2Var;
    }
}
