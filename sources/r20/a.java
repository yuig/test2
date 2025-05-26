package r20;

import bl2.c;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.jz;
import com.pinterest.api.model.lz;
import com.pinterest.api.model.mz;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.s;
import uj2.b;
import uj2.b0;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00050\nH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\n2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00172\b\b\u0001\u0010\u001d\u001a\u00020\u00152\b\b\u0001\u0010\u001e\u001a\u00020\u0015H'¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lr20/a;", "", "", "setting", "Luj2/b0;", "Ltt1/a;", "", "Lcom/pinterest/api/model/jz;", "a", "(Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lcom/pinterest/api/model/lz;", "b", "(Lbl2/c;)Ljava/lang/Object;", "category", "subcategory", "Lcom/pinterest/api/model/mz;", "c", "(Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "section", "option", "", "value", "Luj2/b;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Luj2/b;", "updatedSettings", "d", "(Ljava/lang/String;)Luj2/b;", "enable_push", "enable_email", "e", "(ZZ)Luj2/b;", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("settings/{setting}/")
    @NotNull
    b0<tt1.a<List<jz>>> a(@s("setting") @NotNull String setting);

    @f("settings/notifications/")
    Object b(@NotNull c<? super NetworkResponse<? extends tt1.a<List<lz>>>> cVar);

    @f("settings/notifications/{category}/{subcategory}/")
    Object c(@s("category") @NotNull String str, @s("subcategory") @NotNull String str2, @NotNull c<? super NetworkResponse<? extends tt1.a<mz>>> cVar);

    @o("settings/notifications/")
    @NotNull
    @e
    b d(@sq2.c("updated_settings") @NotNull String updatedSettings);

    @o("settings/notifications/messages/")
    @NotNull
    @e
    b e(@sq2.c("enable_push") boolean enable_push, @sq2.c("enable_email") boolean enable_email);

    @o("settings/{setting}/")
    @NotNull
    @e
    b f(@s("setting") @NotNull String setting, @sq2.c("section") @NotNull String section, @sq2.c("option") @NotNull String option, @sq2.c("value") boolean value);
}
