package qz;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h0 implements EventListener.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final e f105407a = new e(0);

    /* renamed from: b, reason: collision with root package name */
    public final e f105408b = new e(3);

    @Override // okhttp3.EventListener.Factory
    public final EventListener a(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        HttpUrl url = call.getF95898b().f95700a;
        Intrinsics.checkNotNullParameter(url, "url");
        List list = url.f95636f;
        int size = list.size();
        String str = url.f95634d;
        if (size == 4 && Intrinsics.d("_", list.get(0)) && Intrinsics.d("_", list.get(1)) && Intrinsics.d("warm", list.get(2)) && Intrinsics.d("api.pinterest.com", str)) {
            return this.f105407a;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        List list2 = url.f95636f;
        return (list2.size() == 4 && Intrinsics.d("_", list2.get(0)) && Intrinsics.d("_", list2.get(1)) && Intrinsics.d("warm", list2.get(2)) && Intrinsics.d("i.pinimg.com", str)) ? this.f105408b : EventListener.f95611a;
    }
}
