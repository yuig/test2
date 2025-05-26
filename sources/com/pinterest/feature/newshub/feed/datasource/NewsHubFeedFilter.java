package com.pinterest.feature.newshub.feed.datasource;

import com.pinterest.api.model.qx;
import com.pinterest.api.model.tx;
import dl1.s;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import lk1.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/newshub/feed/datasource/NewsHubFeedFilter;", "Llk1/a;", "<init>", "()V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewsHubFeedFilter extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f46791a = h1.f(tx.BOARD_ACTIVITY, tx.BOARD_ACTIVITY_REACT, tx.BOARD_ACTIVITY_COMMENT_REACT, tx.BOARD_ACTIVITY_COMMENT_CREATE, tx.BOARD_ACTIVITY_MENTION);

    @Override // lk1.a
    public final boolean b(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof qx) {
            qx qxVar = (qx) model;
            if (qxVar.getId() == null || this.f46791a.contains(qxVar.u())) {
                return true;
            }
        }
        return false;
    }
}
