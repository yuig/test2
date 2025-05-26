package z20;

import com.pinterest.api.model.lx0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\fJ?\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lz20/c;", "", "", "aggregatedPinDataId", "fields", "pageSize", "Luj2/b0;", "Ltt1/a;", "", "Lcom/pinterest/api/model/lx0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "z20/b", "commentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface c {
    @f("aggregated_pin_data/{aggregatedPinDataId}/comments/unified/preview/")
    @NotNull
    b0<tt1.a<List<lx0>>> a(@s("aggregatedPinDataId") @NotNull String aggregatedPinDataId, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);
}
