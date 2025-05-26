package n91;

import h32.a4;
import h32.d4;
import h32.i0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import va1.k1;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90075a;

    public /* synthetic */ z(int i13) {
        this.f90075a = i13;
    }

    public static ob1.b a(uk1.d presenterPinalytics, uj2.q networkStateStream, x10.a passcodeApiService) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(passcodeApiService, "passcodeApiService");
        return new ob1.b(presenterPinalytics, networkStateStream, passcodeApiService);
    }

    public static k1 b(int i13) {
        return new k1(Integer.valueOf(i13), null, 2);
    }

    public static k1 c(String textString) {
        Intrinsics.checkNotNullParameter(textString, "textString");
        return new k1(null, textString, 1);
    }

    public static k1 d() {
        return new k1(null, null, 3);
    }

    public final i0 e() {
        switch (this.f90075a) {
            case 7:
                return new i0(d4.INSTAGRAM_BACKFILL_MIGRATION, a4.CLAIMED_ACCOUNTS_SETTINGS, null, null, null, null);
            case 8:
            default:
                u0 u0Var = u0.INSTAGRAM_CONNECT;
                return new i0(d4.SETTINGS, a4.CLAIMED_ACCOUNTS_SETTINGS, null, null, null, u0Var);
            case 9:
                u0 u0Var2 = u0.INSTAGRAM_CONNECT;
                return new i0(d4.SETTINGS, a4.CLAIMED_ACCOUNTS_SETTINGS, null, null, null, u0Var2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i13, int i14) {
        this(0);
        this.f90075a = i13;
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
                this(10);
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
            default:
                break;
        }
    }
}
