package tg0;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\r\u0010\fJA\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Ltg0/b;", "", "", "ids", "limit", "resultOverride", "Luj2/b0;", "Lvd0/c;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "extraContext", "d", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "e", "placementIds", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "requests", "c", "(Ljava/lang/String;)Luj2/b0;", "experiences_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface b {
    @f("/v3/experiences/")
    @NotNull
    b0<vd0.c> a(@t("placement_ids") @NotNull String placementIds, @t("limit") @NotNull String limit, @t("extra_context") String extraContext, @t("result_override") String resultOverride);

    @f("experiences/")
    @NotNull
    b0<vd0.c> b(@t("placement_ids") @NotNull String ids, @t("limit") @NotNull String limit, @t("result_override") @NotNull String resultOverride);

    @o("/v3/batch/")
    @NotNull
    @e
    b0<vd0.c> c(@sq2.c("requests") @NotNull String requests);

    @f("experiences/platform/ANDROID/")
    @NotNull
    b0<vd0.c> d(@t("extra_context") String extraContext, @t("result_override") String resultOverride);

    @f("experiences/platform/ANDROID_MULTI/")
    @NotNull
    b0<vd0.c> e(@t("extra_context") String extraContext, @t("result_override") String resultOverride);
}
