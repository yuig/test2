package b3;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f21347a = new q();

    @NotNull
    public final BlendModeColorFilter a(long j13, int i13) {
        a.h();
        return a.d(androidx.compose.ui.graphics.a.u(j13), androidx.compose.ui.graphics.a.t(i13));
    }

    @NotNull
    public final p b(@NotNull BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i13;
        color = blendModeColorFilter.getColor();
        long c13 = androidx.compose.ui.graphics.a.c(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = c.f21307a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i13 = 0;
                break;
            case 2:
                i13 = 1;
                break;
            case 3:
                i13 = 2;
                break;
            case 4:
            default:
                i13 = 3;
                break;
            case 5:
                i13 = 4;
                break;
            case 6:
                i13 = 5;
                break;
            case 7:
                i13 = 6;
                break;
            case 8:
                i13 = 7;
                break;
            case 9:
                i13 = 8;
                break;
            case 10:
                i13 = 9;
                break;
            case 11:
                i13 = 10;
                break;
            case 12:
                i13 = 11;
                break;
            case 13:
                i13 = 12;
                break;
            case 14:
                i13 = 13;
                break;
            case 15:
                i13 = 14;
                break;
            case 16:
                i13 = 15;
                break;
            case 17:
                i13 = 16;
                break;
            case 18:
                i13 = 17;
                break;
            case 19:
                i13 = 18;
                break;
            case 20:
                i13 = 19;
                break;
            case 21:
                i13 = 20;
                break;
            case 22:
                i13 = 21;
                break;
            case 23:
                i13 = 22;
                break;
            case 24:
                i13 = 23;
                break;
            case 25:
                i13 = 24;
                break;
            case 26:
                i13 = 25;
                break;
            case 27:
                i13 = 26;
                break;
            case 28:
                i13 = 27;
                break;
            case 29:
                i13 = 28;
                break;
        }
        return new p(c13, i13, blendModeColorFilter);
    }
}
