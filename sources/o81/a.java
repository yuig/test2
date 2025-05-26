package o81;

import com.pinterest.api.model.cn;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import sq2.b;
import sq2.l;
import sq2.o;
import sq2.p;
import sq2.q;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJU\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lo81/a;", "", "", "historyIds", "Luj2/b;", "a", "(Ljava/lang/String;)Luj2/b;", "Lokhttp3/MultipartBody$Part;", "filePart", "b", "(Lokhttp3/MultipartBody$Part;)Luj2/b;", "image", "", "numResults", "task", "maxSize", "prompt", "Luj2/b0;", "Ltt1/a;", "", "Lcom/pinterest/api/model/cn;", "c", "(Lokhttp3/MultipartBody$Part;ILjava/lang/String;ILjava/lang/String;)Luj2/b0;", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface a {
    @b("visual_search/lens/history/")
    @NotNull
    uj2.b a(@t("lens_history_ids") @NotNull String historyIds);

    @l
    @p("visual_search/lens/history/")
    @NotNull
    uj2.b b(@NotNull @q MultipartBody.Part filePart);

    @l
    @o("dream_generation/room_repainting/")
    @NotNull
    b0<tt1.a<List<cn>>> c(@NotNull @q MultipartBody.Part image, @t("num_results") int numResults, @t("task") @NotNull String task, @t("max_size") int maxSize, @t("prompt") String prompt);
}
