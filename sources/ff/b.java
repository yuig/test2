package ff;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum b {
    Unknown,
    Analysis,
    AnrReport,
    CrashReport,
    CrashShield,
    ThreadCheck;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] valuesCustom = values();
        return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getLogPrefix() {
        int i13 = a.f62090a[ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i13 = a.f62090a[ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
    }
}
