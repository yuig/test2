package vv0;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.fo;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingTimeScale;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import sq0.c0;
import zv0.j;

/* loaded from: classes.dex */
public interface c extends c0 {
    static void U(c cVar, List mediaList, fo foVar, boolean z13, boolean z14, int i13) {
        if ((i13 & 2) != 0) {
            foVar = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        j jVar = (j) cVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        jVar.X0 = mediaList;
        IdeaPinEditablePageLite ideaPinEditablePageLite = jVar.G0;
        if (ideaPinEditablePageLite == null) {
            Intrinsics.r("pageView");
            throw null;
        }
        ideaPinEditablePageLite.B0(foVar, mediaList, z13, z14);
        if (z13) {
            GestaltText gestaltText = jVar.M0;
            if (gestaltText == null) {
                Intrinsics.r("imageToClipMessage");
                throw null;
            }
            a0.w1(gestaltText);
            FrameLayout frameLayout = jVar.Q0;
            if (frameLayout == null) {
                Intrinsics.r("trimmerView");
                throw null;
            }
            bs1.c.b1(frameLayout);
            IdeaPinVideoTrimmingTimeScale ideaPinVideoTrimmingTimeScale = jVar.R0;
            if (ideaPinVideoTrimmingTimeScale == null) {
                Intrinsics.r("timeScale");
                throw null;
            }
            bs1.c.b1(ideaPinVideoTrimmingTimeScale);
            ConstraintLayout constraintLayout = jVar.J0;
            if (constraintLayout != null) {
                bs1.c.b1(constraintLayout);
                return;
            } else {
                Intrinsics.r("durationWrapper");
                throw null;
            }
        }
        GestaltText gestaltText2 = jVar.M0;
        if (gestaltText2 == null) {
            Intrinsics.r("imageToClipMessage");
            throw null;
        }
        a0.k0(gestaltText2);
        FrameLayout frameLayout2 = jVar.Q0;
        if (frameLayout2 == null) {
            Intrinsics.r("trimmerView");
            throw null;
        }
        bs1.c.U1(frameLayout2);
        IdeaPinVideoTrimmingTimeScale ideaPinVideoTrimmingTimeScale2 = jVar.R0;
        if (ideaPinVideoTrimmingTimeScale2 == null) {
            Intrinsics.r("timeScale");
            throw null;
        }
        bs1.c.U1(ideaPinVideoTrimmingTimeScale2);
        ConstraintLayout constraintLayout2 = jVar.J0;
        if (constraintLayout2 != null) {
            bs1.c.U1(constraintLayout2);
        } else {
            Intrinsics.r("durationWrapper");
            throw null;
        }
    }
}
