package g20;

import bl2.c;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.cn;
import com.pinterest.api.model.i10;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.t;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lg20/a;", "", "", "pinId", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "", "Lcom/pinterest/api/model/i10;", "a", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "style", "imageSignature", "Lcom/pinterest/api/model/cn;", "b", "(Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "canvas_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("visualization/outpaint/styles/")
    Object a(@t("pin") @NotNull String str, @NotNull c<? super NetworkResponse<? extends List<? extends i10>>> cVar);

    @o("dream_generation/home_outpaint/")
    @e
    Object b(@sq2.c("style") @NotNull String str, @sq2.c("image_signature") @NotNull String str2, @NotNull c<? super NetworkResponse<? extends List<? extends cn>>> cVar);
}
