package iy0;

import h32.d4;
import i32.y0;

/* loaded from: classes.dex */
public interface a {
    static /* synthetic */ void c(a aVar, String[] strArr, String[] strArr2, Integer num, int i13) {
        if ((i13 & 1) != 0) {
            strArr = null;
        }
        if ((i13 & 2) != 0) {
            strArr2 = null;
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        aVar.gotoNextStep(strArr, strArr2, num);
    }

    y0 getPlacement();

    d4 getViewType();

    void gotoNextStep(String[] strArr, String[] strArr2, Integer num);

    void updateIndicatorHeader(boolean z13);
}
