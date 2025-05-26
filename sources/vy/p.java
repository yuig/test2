package vy;

import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import sq2.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lvy/p;", "", "Lokhttp3/MultipartBody$Part;", "payload", "Luj2/b;", "b", "(Lokhttp3/MultipartBody$Part;)Luj2/b;", "a", "impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface p {
    @sq2.l
    @sq2.o("v3/callback/ping/")
    @NotNull
    uj2.b a(@NotNull @q MultipartBody.Part payload);

    @sq2.l
    @sq2.o("v3/callback/event/")
    @NotNull
    uj2.b b(@NotNull @q MultipartBody.Part payload);
}
