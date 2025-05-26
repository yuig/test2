package com.pinterest.feature.pin.closeup.datasource;

import com.pinterest.api.model.vh;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import dl1.s;
import i01.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/pin/closeup/datasource/RelatedModulesModelFilter;", "Llk1/a;", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RelatedModulesModelFilter extends lk1.a {

    /* renamed from: a, reason: collision with root package name */
    public final x f46925a;

    public RelatedModulesModelFilter(PinCloseupPresenter listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f46925a = listener;
    }

    @Override // lk1.a
    public final boolean b(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!(model instanceof vh)) {
            Intrinsics.checkNotNullParameter(model, "model");
            return false;
        }
        vh vhVar = (vh) model;
        String q13 = vhVar.q();
        if (q13 != null) {
            int hashCode = q13.hashCode();
            x xVar = this.f46925a;
            if (hashCode != -1809295830) {
                if (hashCode != -779586953) {
                    if (hashCode == 957308984 && q13.equals("related_pins_filter_tabs")) {
                        xVar.onRelatedPinsFiltersStoryLoaded(vhVar);
                        return true;
                    }
                } else if (q13.equals("one_bar_related_pins")) {
                    xVar.onPinCloseupOneBarStoryLoaded(vhVar);
                    return true;
                }
            } else if (q13.equals("SKIN_TONE_FILTER_QUERIES")) {
                xVar.onSkinToneFiltersLoaded();
                return false;
            }
        }
        Intrinsics.checkNotNullParameter(model, "model");
        return false;
    }
}
