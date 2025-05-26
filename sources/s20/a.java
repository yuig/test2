package s20;

import b22.d;
import bl2.c;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.cb0;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.ia0;
import com.pinterest.api.model.kb0;
import com.pinterest.api.model.p20;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\tJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\tJ4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0013J<\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0013J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Ls20/a;", "", "", "insightId", "fields", "Luj2/b0;", "Ltt1/a;", "Lcom/pinterest/api/model/h20;", "e", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/model/p20;", "f", "quizId", "Lcom/pinterest/api/model/ia0;", "d", "answers", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lcom/pinterest/api/model/cb0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "outputKey", "g", "", "Lcom/pinterest/api/model/kb0;", "a", "Lb22/d;", "c", "pearLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("pear/quiz/{quiz_id}/output/sections/")
    Object a(@s("quiz_id") @NotNull String str, @t("output_key") String str2, @t("fields") @NotNull String str3, @NotNull c<? super NetworkResponse<? extends List<? extends kb0>>> cVar);

    @o("pear/quiz/{quiz_id}/output/")
    @e
    Object b(@s("quiz_id") @NotNull String str, @sq2.c("user_answers") @NotNull String str2, @t("fields") @NotNull String str3, @NotNull c<? super NetworkResponse<? extends cb0>> cVar);

    @f("pear/quiz/{quiz_id}/output/feed/")
    Object c(@s("quiz_id") @NotNull String str, @t("output_key") String str2, @t("fields") @NotNull String str3, @NotNull c<? super NetworkResponse<d>> cVar);

    @f("pear/quiz/{quiz_id}/")
    @NotNull
    b0<tt1.a<ia0>> d(@s("quiz_id") @NotNull String quizId, @t("fields") @NotNull String fields);

    @f("insights/{insight_id}/")
    @NotNull
    b0<tt1.a<h20>> e(@s("insight_id") @NotNull String insightId, @t("fields") @NotNull String fields);

    @f("pear/styles/{style_id}/")
    @NotNull
    b0<tt1.a<p20>> f(@s("style_id") @NotNull String insightId, @t("fields") @NotNull String fields);

    @f("pear/quiz/{quiz_id}/output/")
    Object g(@s("quiz_id") @NotNull String str, @t("output_key") String str2, @t("fields") @NotNull String str3, @NotNull c<? super NetworkResponse<? extends cb0>> cVar);
}
