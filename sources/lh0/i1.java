package lh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83387a;

    public /* synthetic */ i1(int i13) {
        this.f83387a = i13;
    }

    public final s1 a() {
        Function0 function0;
        if (s1.f83474c == null) {
            switch (this.f83387a) {
                case 1:
                    function0 = l1.f83415d;
                    break;
                case 4:
                    function0 = s1.f83475d;
                    break;
                default:
                    function0 = h2.f83381d;
                    break;
            }
            function0.invoke();
            c(n0.f83430m);
        }
        s1 s1Var = s1.f83474c;
        if (s1Var != null) {
            return s1Var;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    public final h2 b() {
        Function0 function0;
        if (h2.f83380c == null) {
            switch (this.f83387a) {
                case 1:
                    function0 = l1.f83415d;
                    break;
                case 4:
                    function0 = s1.f83475d;
                    break;
                default:
                    function0 = h2.f83381d;
                    break;
            }
            function0.invoke();
            c(n0.f83433p);
        }
        h2 h2Var = h2.f83380c;
        if (h2Var != null) {
            return h2Var;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    public final void c(n0 n0Var) {
        switch (this.f83387a) {
            case 1:
                Intrinsics.checkNotNullParameter(n0Var, "<set-?>");
                l1.f83415d = n0Var;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(n0Var, "<set-?>");
                s1.f83475d = n0Var;
                break;
            default:
                Intrinsics.checkNotNullParameter(n0Var, "<set-?>");
                h2.f83381d = n0Var;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i13, int i14) {
        this(0);
        this.f83387a = i13;
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
