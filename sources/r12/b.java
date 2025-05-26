package r12;

import com.pinterest.api.model.mv;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.c;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.s;
import sq2.t;
import uj2.b0;
import uj2.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lr12/b;", "", "", "convoId", "fields", "", "peek", "hideSysMsg", "Luj2/b0;", "Lcom/pinterest/api/model/mv;", "b", "(Ljava/lang/String;Ljava/lang/String;ZZ)Luj2/b0;", "messageId", "reactionText", "Luj2/l;", "a", "(Ljava/lang/String;Ljava/lang/String;)Luj2/l;", "Luj2/b;", "c", "(Ljava/lang/String;)Luj2/b;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface b {
    @o("/v3/conversations/messages/{message_id}/")
    @NotNull
    @e
    l<mv> a(@s("message_id") @NotNull String messageId, @c("reaction_text") String reactionText);

    @f("conversations/{conversation_id}/messages/")
    @NotNull
    b0<mv> b(@s("conversation_id") @NotNull String convoId, @t("fields") @NotNull String fields, @t("peek") boolean peek, @t("hide_sys_msg") boolean hideSysMsg);

    @sq2.b("/v3/conversations/messages/{message_id}/")
    @NotNull
    uj2.b c(@s("message_id") @NotNull String messageId);
}
