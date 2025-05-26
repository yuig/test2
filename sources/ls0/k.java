package ls0;

import com.pinterest.api.model.oc;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
public final class k extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final k f84658i = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ResponseBody downloadResponse = (ResponseBody) obj;
        oc clusterMatch = (oc) obj2;
        Intrinsics.checkNotNullParameter(downloadResponse, "downloadResponse");
        Intrinsics.checkNotNullParameter(clusterMatch, "clusterMatch");
        return new Pair(downloadResponse, clusterMatch);
    }
}
