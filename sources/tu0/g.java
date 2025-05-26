package tu0;

import android.os.Bundle;
import com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenModel;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends jr.a {
    public static ScreenModel I(IdeaPinCreationLocation ideaPinCreationLocation, String str, int i13, int i14, Integer num) {
        Bundle bundle = new Bundle();
        bundle.putString("education.video.link", str);
        bundle.putInt("education.title", i13);
        bundle.putInt("education.desc", i14);
        if (num != null) {
            bundle.putInt("education.button.text", num.intValue());
        }
        Unit unit = Unit.f80348a;
        ScreenModel o13 = jr.a.o(ideaPinCreationLocation, bundle);
        Intrinsics.checkNotNullExpressionValue(o13, "createScreenDescription(...)");
        return o13;
    }

    public final void H() {
        l();
        ScreenDescription[] screenDescriptionArr = new ScreenDescription[5];
        IdeaPinCreationLocation ideaPinCreationLocation = IdeaPinCreationLocation.IDEA_PIN_EDUCATION_SLIDE;
        screenDescriptionArr[0] = I(ideaPinCreationLocation, "https://v1.pinimg.com/videos/mc/720p/d2/60/e9/d260e998956dd0e3d7996645bef2c3bb.mp4", aq1.h.idea_pin_education_title_slide_1, aq1.h.idea_pin_education_description_slide_1, null);
        screenDescriptionArr[1] = I(ideaPinCreationLocation, "https://v1.pinimg.com/videos/mc/720p/13/bf/d3/13bfd328ea6cc197674733e8872120e7.mp4", aq1.h.idea_pin_education_title_slide_2, aq1.h.idea_pin_education_description_slide_2, null);
        screenDescriptionArr[2] = I(ideaPinCreationLocation, "https://v1.pinimg.com/videos/mc/720p/1e/4c/58/1e4c581fa5a939ca2e085f864aef716c.mp4", aq1.h.idea_pin_education_title_slide_3, aq1.h.idea_pin_education_description_slide_3, null);
        screenDescriptionArr[3] = I(ideaPinCreationLocation, Intrinsics.d(Locale.getDefault().getDisplayLanguage(), "English") ? "https://v1.pinimg.com/videos/mc/720p/8d/45/09/8d4509861249474ff2285dcce3863f70.mp4" : "https://v1.pinimg.com/videos/mc/720p/00/e2/a0/00e2a08094b9dbb8f5610d032716fc7a.mp4", aq1.h.idea_pin_education_title_slide_4, aq1.h.idea_pin_education_description_slide_4, null);
        screenDescriptionArr[4] = I(ideaPinCreationLocation, "https://v1.pinimg.com/videos/mc/720p/74/2e/5e/742e5e4f2216e82f825062edf9c84aee.mp4", aq1.h.idea_pin_education_title_slide_5, aq1.h.pin_education_description_slide_5, Integer.valueOf(aq1.h.idea_pin_education_button_text));
        k(f0.j(screenDescriptionArr));
    }
}
