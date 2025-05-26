package s61;

import android.os.Bundle;
import android.util.LruCache;
import com.pinterest.api.model.eg0;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.pf0;
import com.pinterest.api.model.sf0;
import com.pinterest.feature.search.results.goldstandard.viewpager.steps.GoldStandardStepsLocation;
import com.pinterest.framework.screens.ScreenModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends jr.a {

    /* renamed from: n, reason: collision with root package name */
    public final gw f111226n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(il1.b screenFactory, gw modelHelper) {
        super(screenFactory);
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        this.f111226n = modelHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [jr.a, s61.b] */
    public final void H(sf0 content) {
        ?? r13;
        Intrinsics.checkNotNullParameter(content, "content");
        l();
        List<pf0> E = content.E();
        if (E != null) {
            r13 = new ArrayList();
            for (pf0 pf0Var : E) {
                Object value2 = pf0Var.f40970a;
                if (value2 != null) {
                    Intrinsics.checkNotNullParameter(value2, "value0");
                } else {
                    value2 = pf0Var.f40971b;
                    if (value2 != null) {
                        Intrinsics.checkNotNullParameter(value2, "value1");
                    } else {
                        value2 = pf0Var.f40972c;
                        if (value2 != null) {
                            Intrinsics.checkNotNullParameter(value2, "value2");
                        } else {
                            value2 = null;
                        }
                    }
                }
                if (value2 != null && (value2 instanceof eg0)) {
                    eg0 eg0Var = (eg0) value2;
                    this.f111226n.getClass();
                    LruCache lruCache = ew.f37372p;
                    synchronized (lruCache) {
                        lruCache.put(String.valueOf(eg0Var.hashCode()), eg0Var);
                    }
                    GoldStandardStepsLocation goldStandardStepsLocation = GoldStandardStepsLocation.GoldStandardSteps;
                    Bundle bundle = new Bundle();
                    bundle.putString("safety_treatment_text_hash_code", String.valueOf(eg0Var.hashCode()));
                    bundle.putString("font_color_dark_hex", content.C());
                    bundle.putString("font_color_hex", content.D());
                    Unit unit = Unit.f80348a;
                    ScreenModel o13 = jr.a.o(goldStandardStepsLocation, bundle);
                    Intrinsics.checkNotNullExpressionValue(o13, "createScreenDescription(...)");
                    r13.add(o13);
                }
            }
        } else {
            r13 = q0.f80391a;
        }
        k(r13);
    }
}
