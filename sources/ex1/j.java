package ex1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yk1.u;

/* loaded from: classes2.dex */
public interface j extends u {
    void F1(kh2.d dVar);

    void L2(l lVar);

    default void Y5(String dateRange, String filterInfo) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        Intrinsics.checkNotNullParameter(filterInfo, "filterInfo");
    }

    void c0(String str);

    void h1(List list);

    void j0();
}
