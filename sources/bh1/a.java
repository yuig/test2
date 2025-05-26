package bh1;

import com.pinterest.api.model.DynamicFeed;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f22805i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicFeed feed = (DynamicFeed) obj;
        Intrinsics.checkNotNullParameter(feed, "feed");
        return feed.a();
    }
}
