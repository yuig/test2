package k71;

import java.util.HashMap;
import java.util.List;
import o71.c0;
import z32.n1;

/* loaded from: classes5.dex */
public interface m extends yk1.d {
    static /* synthetic */ void U3(m mVar, String str, String str2, n1 n1Var, int i13) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        if ((i13 & 4) != 0) {
            n1Var = null;
        }
        mVar.k4(str, str2, n1Var, false);
    }

    void J5(String str, boolean z13);

    void M5(String str, HashMap hashMap);

    void O4(int i13);

    void Q5(List list);

    void f3(String str, String str2, n1 n1Var);

    void f6();

    void i0(int i13);

    void j2(int i13);

    void k4(String str, String str2, n1 n1Var, boolean z13);

    void o1(String str);

    void setId(int i13);

    void u(String str);

    void v0(int i13);

    void w5();

    void z5(c0 c0Var);
}
