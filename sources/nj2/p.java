package nj2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.p2;

/* loaded from: classes4.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f91048a = new a(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, Integer.MAX_VALUE);

    public final n9.b a() {
        n9.b bVar = new n9.b();
        a aVar = (a) this;
        int i13 = aVar.f90977b;
        p2.T("maxNumberOfAttributes must be greater than 0", i13 > 0);
        bVar.f89941a = i13;
        int i14 = aVar.f90978c;
        p2.T("maxNumberOfEvents must be greater than 0", i14 > 0);
        bVar.f89942b = i14;
        int i15 = aVar.f90979d;
        p2.T("maxNumberOfLinks must be greater than 0", i15 > 0);
        bVar.f89943c = i15;
        int i16 = aVar.f90980e;
        p2.T("maxNumberOfAttributesPerEvent must be greater than 0", i16 > 0);
        bVar.f89944d = i16;
        int i17 = aVar.f90981f;
        p2.T("maxNumberOfAttributesPerLink must be greater than 0", i17 > 0);
        bVar.f89945e = i17;
        int i18 = aVar.f90982g;
        p2.T("maxAttributeValueLength must be non-negative", i18 > -1);
        bVar.f89946f = i18;
        return bVar;
    }
}
