package rd;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f107507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f107508b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f107509c;

    /* renamed from: d, reason: collision with root package name */
    public final int f107510d;

    public k(i iVar) {
        this.f107509c = iVar.f107501a;
        ActivityManager activityManager = iVar.f107502b;
        int i13 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f107510d = i13;
        int round = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) iVar.f107503c.f107506b;
        float f13 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f14 = iVar.f107504d;
        int round2 = Math.round(f13 * f14);
        int round3 = Math.round(f13 * 2.0f);
        int i14 = round - i13;
        int i15 = round3 + round2;
        if (i15 <= i14) {
            this.f107508b = round3;
            this.f107507a = round2;
        } else {
            float f15 = i14 / (f14 + 2.0f);
            this.f107508b = Math.round(2.0f * f15);
            this.f107507a = Math.round(f15 * f14);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb3 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb3.append(a(this.f107508b));
            sb3.append(", pool size: ");
            sb3.append(a(this.f107507a));
            sb3.append(", byte array size: ");
            sb3.append(a(i13));
            sb3.append(", memory class limited? ");
            sb3.append(i15 > round);
            sb3.append(", max size: ");
            sb3.append(a(round));
            sb3.append(", memoryClass: ");
            sb3.append(activityManager.getMemoryClass());
            sb3.append(", isLowMemoryDevice: ");
            sb3.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb3.toString());
        }
    }

    public final String a(int i13) {
        return Formatter.formatFileSize(this.f107509c, i13);
    }
}
