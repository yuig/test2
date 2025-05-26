package qz;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.ta;
import com.pinterest.api.model.ua;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lqz/k;", "", "Luj2/b0;", "Lcom/pinterest/api/model/ua;", "a", "()Luj2/b0;", "", "boardId", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lcom/pinterest/api/model/ta;", "c", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "fields", "pageSize", "bookmark", "Lcom/pinterest/api/model/DynamicFeed;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface k {
    @sq2.f("montage/templates/board/video/feed/")
    @NotNull
    uj2.b0<ua> a();

    @sq2.f("montage/board/{boardId}/pins/")
    Object b(@sq2.s("boardId") @NotNull String str, @sq2.t("fields") @NotNull String str2, @sq2.t("page_size") @NotNull String str3, @sq2.t("bookmark") String str4, @NotNull bl2.c<? super NetworkResponse<DynamicFeed>> cVar);

    @sq2.f("montage/templates/board/{boardId}/video/")
    Object c(@sq2.s("boardId") @NotNull String str, @NotNull bl2.c<? super NetworkResponse<? extends ta>> cVar);
}
