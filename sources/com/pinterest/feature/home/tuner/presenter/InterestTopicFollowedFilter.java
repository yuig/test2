package com.pinterest.feature.home.tuner.presenter;

import com.pinterest.api.model.zs;
import dl1.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lk1.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/home/tuner/presenter/InterestTopicFollowedFilter;", "Llk1/a;", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InterestTopicFollowedFilter extends a {
    @Override // lk1.a
    public final boolean b(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof zs) {
            Boolean C = ((zs) model).C();
            Intrinsics.checkNotNullExpressionValue(C, "getIsFollowed(...)");
            if (C.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
