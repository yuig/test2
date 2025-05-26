package gf2;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64884a;

    public /* synthetic */ w(int i13) {
        this.f64884a = i13;
    }

    public static Long b(Long l13, Long l14) {
        if (l13 == null || l14 == null) {
            return null;
        }
        return Long.valueOf(l14.longValue() - l13.longValue());
    }

    public static boolean c(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return !activity.getClass().isAnnotationPresent(mf2.d.class);
    }

    public final int a(mm.b builder, int[] data) {
        switch (this.f64884a) {
            case 2:
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(data, "data");
                builder.p(4, data.length, 4);
                for (int length = data.length - 1; -1 < length; length--) {
                    builder.c(data[length]);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(data, "data");
                builder.p(4, data.length, 4);
                for (int length2 = data.length - 1; -1 < length2; length2--) {
                    builder.c(data[length2]);
                }
                break;
        }
        return builder.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i13, int i14) {
        this(0);
        this.f64884a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
            default:
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
