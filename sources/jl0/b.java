package jl0;

import com.pinterest.api.model.cl;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import df.j1;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f76936a = new b();

    public static boolean b(String str, v7 v7Var) {
        return v7Var != null && j1.d1(str) && j1.d1(v7Var.getF39332b()) && str.equals(v7Var.getF39332b());
    }

    public static String c(String str) {
        if (str.length() <= 20) {
            return str;
        }
        return str.substring(0, 20) + "...";
    }

    public dl0.a a(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        lh0 a13 = kh2.d.a1(board);
        boolean z13 = w.i0(board) || kh2.d.e1(board);
        String f39332b = board.getF39332b();
        String j13 = board.j1();
        boolean z14 = !kh2.d.M0(board);
        Boolean g13 = board.g1();
        boolean i03 = w.i0(board);
        boolean h03 = w.h0(board);
        boolean M0 = kh2.d.M0(board);
        Boolean V0 = board.V0();
        boolean z15 = a13 != null;
        Boolean P0 = board.P0();
        boolean A0 = kh2.d.A0(board);
        boolean B0 = kh2.d.B0(board);
        Intrinsics.checkNotNullExpressionValue(board.q1(), "getSectionCount(...)");
        boolean K = kh2.d.K(board);
        Intrinsics.checkNotNullParameter(board, "<this>");
        Intrinsics.checkNotNullParameter(board, "<this>");
        cl T0 = board.T0();
        wy0 i13 = T0 != null ? T0.i() : null;
        Boolean f13 = board.f1();
        Integer J0 = z13 ? board.J0() : 0;
        Intrinsics.f(f39332b);
        Intrinsics.f(j13);
        Intrinsics.f(g13);
        boolean booleanValue = g13.booleanValue();
        Intrinsics.f(V0);
        boolean booleanValue2 = V0.booleanValue();
        Intrinsics.f(P0);
        boolean booleanValue3 = P0.booleanValue();
        Intrinsics.f(f13);
        return new dl0.a(f39332b, j13, B0, z14, booleanValue, i03, h03, M0, booleanValue2, z15, booleanValue3, A0, K, i13, f13.booleanValue(), J0.intValue());
    }
}
