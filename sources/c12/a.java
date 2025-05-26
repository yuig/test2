package c12;

import com.pinterest.api.model.fr0;
import com.pinterest.api.model.i11;
import com.pinterest.api.model.k6;
import com.pinterest.api.model.w01;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.o;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lc12/a;", "", "", "survey_id", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/fr0;", "a", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/model/i11;", "visitParams", "Lcom/pinterest/api/model/w01;", "b", "(Ljava/lang/String;Lcom/pinterest/api/model/i11;)Luj2/b0;", "visit_id", "Lcom/pinterest/api/model/k6;", "answer", "Luj2/b;", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/api/model/k6;)Luj2/b;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface a {
    @f("/v3/surveys/anket/survey/{survey_id}/")
    @NotNull
    b0<fr0> a(@s("survey_id") String survey_id, @t("fields") String fields);

    @o("/v3/surveys/anket/survey/{survey_id}/visit/")
    @NotNull
    b0<w01> b(@s("survey_id") String survey_id, @NotNull @sq2.a i11 visitParams);

    @o("/v3/surveys/anket/survey/{survey_id}/visit/{visit_id}/answers/")
    @NotNull
    uj2.b c(@s("survey_id") String survey_id, @s("visit_id") String visit_id, @NotNull @sq2.a k6 answer);
}
