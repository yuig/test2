package x12;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import s92.i;
import sq2.f;
import sq2.j;
import sq2.l;
import sq2.o;
import sq2.q;
import sq2.r;
import sq2.u;
import sq2.x;
import sq2.y;
import uj2.b0;
import vd0.c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJY\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u00042\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lx12/a;", "", "", "url", "", "params", "Luj2/b0;", "Lvd0/c;", "b", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b0;", "Ls92/i;", "pwtAction", "headers", "c", "(Ljava/lang/String;Ljava/util/Map;Ls92/i;Ljava/util/Map;)Luj2/b0;", "Lokhttp3/RequestBody;", "", "Lokhttp3/MultipartBody$Part;", "files", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Luj2/b0;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @l
    @o
    @NotNull
    b0<c> a(@NotNull @y String url, @r @NotNull Map<String, RequestBody> params, @q List<MultipartBody.Part> files);

    @f
    @NotNull
    b0<c> b(@NotNull @y String url, @u Map<String, String> params);

    @f
    @NotNull
    b0<c> c(@NotNull @y String url, @u Map<String, String> params, @x i pwtAction, @j @NotNull Map<String, String> headers);
}
