package z02;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.s;
import uj2.b0;
import vd0.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lz02/a;", "", "", "adPreviewKey", "Luj2/b0;", "Lvd0/c;", "a", "(Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "b", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @f("ads/v4/advertisers/ad_previews/{ad_preview_key}/")
    @NotNull
    b0<c> a(@s("ad_preview_key") @NotNull String adPreviewKey);

    @f("ads/v4/advertisers/ad_previews/{ad_preview_key}/")
    Object b(@s("ad_preview_key") @NotNull String str, @NotNull bl2.c<? super NetworkResponse<? extends c>> cVar);
}
