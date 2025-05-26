package al1;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15494a;

    public /* synthetic */ n(int i13) {
        this.f15494a = i13;
    }

    public static o a(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        o oVar = new o();
        String key = (String) pair.f80346a;
        Boolean bool = (Boolean) pair.f80347b;
        bool.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        oVar.f15495a.put(key, bool);
        return oVar;
    }

    public static o b(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        o oVar = new o();
        String key = (String) pair.f80346a;
        String value = (String) pair.f80347b;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        oVar.f15497c.put(key, value);
        return oVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13, int i14) {
        this(0);
        this.f15494a = i13;
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
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
