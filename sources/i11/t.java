package i11;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends m {
    @Override // i11.m
    public final void T3() {
        if (isBound()) {
            l11.j jVar = (l11.j) ((f11.d) getView());
            jVar.getClass();
            jVar.P6("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_PROFILE_RESULT_CODE", new Bundle());
            jVar.D5();
        }
    }

    @Override // i11.m
    public final void U3(h11.d data) {
        String str;
        Intrinsics.checkNotNullParameter(data, "data");
        if (isBound() && (str = data.f66457a) != null) {
            ((l11.j) ((f11.d) getView())).Z8(str, data.f66458b, data.f66464h, data.f66459c);
        }
    }
}
