package q12;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import nm.u;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.s;
import sq2.t;
import uj2.b0;
import vd0.c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lq12/b;", "", "", "conversationIds", "threadId", "bookmark", "Luj2/b0;", "Ltt1/a;", "Lnm/u;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "conversationId", "fields", "Lcom/pinterest/api/model/ue;", "b", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "reason", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "", "d", "(Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "Luj2/b;", "e", "(Ljava/lang/String;)Luj2/b;", "", "timeInSeconds", "Lvd0/c;", "a", "(Ljava/lang/String;I)Luj2/b0;", "f", "(Ljava/lang/String;)Luj2/b0;", "", "Lcom/pinterest/api/model/v7;", "c", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface b {
    @o("conversations/{conversationId}/snooze/")
    @NotNull
    @e
    b0<c> a(@s("conversationId") @NotNull String conversationId, @sq2.c("time_in_seconds") int timeInSeconds);

    @f("conversations/{conversationId}/")
    @NotNull
    b0<ue> b(@s("conversationId") @NotNull String conversationId, @t("fields") @NotNull String fields);

    @f("conversations/{conversationId}/boards/")
    @NotNull
    b0<List<v7>> c(@s("conversationId") @NotNull String conversationId, @t("fields") @NotNull String fields);

    @o("conversations/{conversationId}/report/")
    @e
    Object d(@s("conversationId") @NotNull String str, @sq2.c("reason") @NotNull String str2, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @sq2.b("conversations/{conversationId}/")
    @NotNull
    uj2.b e(@s("conversationId") @NotNull String conversationId);

    @f("conversations/{conversationId}/snooze/")
    @NotNull
    b0<c> f(@s("conversationId") @NotNull String conversationId);

    @f("conversations/poll/")
    @NotNull
    b0<tt1.a<u>> g(@t("ids") @NotNull String conversationIds, @t("thread_id") String threadId, @t("bookmark") String bookmark);
}
