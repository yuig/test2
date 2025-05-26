package cr1;

import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qr1.d0;
import qr1.e0;
import qr1.g0;
import sq2.o;
import sq2.s;
import sq2.t;
import sq2.y;
import uj2.b0;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0007J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0007J3\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u0007J)\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lcr1/b;", "", "", "id", "Luj2/b0;", "Lvd0/c;", "f", "(Ljava/lang/String;)Luj2/b0;", "handlerPath", "", "params", "Lqr1/d;", "c", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b0;", "e", "Luj2/b;", "g", "(Ljava/util/Map;)Luj2/b;", "email", "b", "Lqr1/d0;", "h", "endpoint", "code", AnimatedTarget.PROPERTY_STATE, "Lqr1/e0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "d", "facebookToken", "facebookId", "Lqr1/g0;", "i", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface b {
    @o
    @NotNull
    @sq2.e
    b0<e0> a(@NotNull @y String endpoint, @sq2.c("code") @NotNull String code, @sq2.c("state") @NotNull String state);

    @sq2.f("email/validation/")
    @NotNull
    b0<vd0.c> b(@t("email") @NotNull String email);

    @o("login/{handler}")
    @NotNull
    @sq2.e
    b0<qr1.d> c(@s(encoded = true, value = "handler") @NotNull String handlerPath, @sq2.d @NotNull Map<String, String> params);

    @o("business/login/")
    @NotNull
    b0<qr1.d> d(@t("business_id") @NotNull String id3);

    @o("register/{handler}")
    @NotNull
    @sq2.e
    b0<qr1.d> e(@s(encoded = true, value = "handler") @NotNull String handlerPath, @sq2.d @NotNull Map<String, String> params);

    @sq2.f("register/exists/")
    @NotNull
    b0<vd0.c> f(@t("email") @NotNull String id3);

    @o("login/mfa/resend/")
    @NotNull
    @sq2.e
    uj2.b g(@sq2.d @NotNull Map<String, String> params);

    @o("sso/info/")
    @NotNull
    @sq2.e
    b0<d0> h(@sq2.c("email") @NotNull String email);

    @sq2.f("facebook/login_data/")
    @NotNull
    b0<g0> i(@t("facebook_token") @NotNull String facebookToken, @t("facebook_id") @NotNull String facebookId);
}
