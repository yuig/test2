package vb0;

import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.c2;
import lh0.k3;
import lh0.n0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125455a;

    public /* synthetic */ e(int i13) {
        this.f125455a = i13;
    }

    public static final ConnectivityManager a() {
        xk2.k kVar = f.f125456e;
        return (ConnectivityManager) f.f125457f.getValue();
    }

    public static f d() {
        return (f) f.f125456e.getValue();
    }

    public static zf0.f e() {
        return (zf0.f) zf0.f.f141903e.getValue();
    }

    public final lh0.d b() {
        if (lh0.d.f83321c == null) {
            f().invoke();
            g(lh0.c.f83306j);
        }
        lh0.d dVar = lh0.d.f83321c;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    public final c2 c() {
        if (c2.f83315c == null) {
            f().invoke();
            g(n0.f83432o);
        }
        c2 c2Var = c2.f83315c;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    public final Function0 f() {
        switch (this.f125455a) {
            case 6:
                return lh0.d.f83322d;
            case 7:
                return lh0.j.f83393d;
            case 16:
                return c2.f83316d;
            default:
                return k3.f83406d;
        }
    }

    public final void g(Function0 function0) {
        switch (this.f125455a) {
            case 6:
                Intrinsics.checkNotNullParameter(function0, "<set-?>");
                lh0.d.f83322d = function0;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(function0, "<set-?>");
                lh0.j.f83393d = function0;
                break;
            case 16:
                Intrinsics.checkNotNullParameter(function0, "<set-?>");
                c2.f83316d = function0;
                break;
            default:
                Intrinsics.checkNotNullParameter(function0, "<set-?>");
                k3.f83406d = function0;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13, int i14) {
        this(0);
        this.f125455a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
            default:
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
        }
    }
}
