package c4;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f25629a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final long f25630b;

    static {
        long j13 = 0;
        f25630b = (j13 & 4294967295L) | (j13 << 32);
    }

    public static final TextDirectionHeuristic a(int i13) {
        return i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
