package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83383a;

    public /* synthetic */ h3(int i13) {
        this.f83383a = i13;
    }

    public final w3 a() {
        Function0 function0;
        if (w3.f83499c == null) {
            int i13 = this.f83383a;
            switch (i13) {
                case 13:
                    function0 = w3.f83500d;
                    break;
                default:
                    function0 = o4.f83452d;
                    break;
            }
            function0.invoke();
            n2 n2Var = n2.f83441k;
            switch (i13) {
                case 13:
                    Intrinsics.checkNotNullParameter(n2Var, "<set-?>");
                    w3.f83500d = n2Var;
                    break;
                default:
                    Intrinsics.checkNotNullParameter(n2Var, "<set-?>");
                    o4.f83452d = n2Var;
                    break;
            }
        }
        w3 w3Var = w3.f83499c;
        if (w3Var != null) {
            return w3Var;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(int i13, int i14) {
        this(0);
        this.f83383a = i13;
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
