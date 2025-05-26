package jx0;

import bs1.c;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.rx;
import com.pinterest.api.model.v7;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kx0.u;
import xq0.d;

/* loaded from: classes5.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final xq0.a f77676a;

    public a(xq0.a boardImageUrlExtractor) {
        Intrinsics.checkNotNullParameter(boardImageUrlExtractor, "boardImageUrlExtractor");
        this.f77676a = boardImageUrlExtractor;
    }

    @Override // xq0.d
    public final boolean a(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return model instanceof u;
    }

    @Override // xq0.d
    public final List b(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!a(model)) {
            return q0.f80391a;
        }
        ArrayList arrayList = new ArrayList();
        s sVar = ((u) model).f81090d;
        if (sVar instanceof f30) {
            Intrinsics.checkNotNullParameter("prefetch a NewsHubItemWrapper:Pin model", "message");
            String B0 = c.B0((f30) sVar);
            if (B0 != null && B0.length() > 0) {
                String message = "prefetch image ".concat(B0);
                Intrinsics.checkNotNullParameter(message, "message");
                arrayList.add(B0);
            }
        } else if (sVar instanceof v7) {
            Intrinsics.checkNotNullParameter("prefetch a NewsHubItemWrapper:Board model", "message");
            for (String str : this.f77676a.b(sVar)) {
                String message2 = "prefetch image " + str;
                Intrinsics.checkNotNullParameter(message2, "message");
                arrayList.add(str);
            }
        } else if (sVar instanceof rx) {
            Intrinsics.checkNotNullParameter("prefetch a NewsHubItemWrapper:NewsHubSearch model", "message");
            ArrayList arrayList2 = ((rx) sVar).f41711f;
            Intrinsics.checkNotNullExpressionValue(arrayList2, "getImages(...)");
            String str2 = (String) CollectionsKt.firstOrNull(arrayList2);
            if (str2 != null && str2.length() > 0) {
                String message3 = "prefetch image ".concat(str2);
                Intrinsics.checkNotNullParameter(message3, "message");
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
