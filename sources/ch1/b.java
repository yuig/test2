package ch1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import dh1.e;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface b extends yk1.d {
    default void A6(List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
    }

    void D3(e eVar);

    default void S5(wy0 creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
    }

    default void W5(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
    }

    default void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
    }

    default void c3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
    }

    void d();

    default void h2(f30 videoPin, d4 d4Var, a4 a4Var) {
        Intrinsics.checkNotNullParameter(videoPin, "videoPin");
    }

    void p(String str);

    default void p2(HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
    }

    default void v(List avatarList) {
        Intrinsics.checkNotNullParameter(avatarList, "avatarList");
    }
}
