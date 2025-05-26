package oe;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.u0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import le.g0;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f94208a = h1.c(200, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN));

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f94209b = h1.c(503, 504, 429);

    /* renamed from: c, reason: collision with root package name */
    public static o f94210c;

    /* renamed from: d, reason: collision with root package name */
    public static List f94211d;

    /* renamed from: e, reason: collision with root package name */
    public static int f94212e;

    public static final void a(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        wc.b bVar = u0.f54860d;
        wc.b.y(g0.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        o oVar = new o(datasetID, url, accessKey);
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        f94210c = oVar;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        f94211d = arrayList;
    }

    public static List b() {
        List list = f94211d;
        if (list != null) {
            return list;
        }
        Intrinsics.r("transformedEvents");
        throw null;
    }
}
