package cr1;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.by0;
import com.pinterest.api.model.fy0;
import com.pinterest.api.model.wy0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qr1.a0;
import qr1.c0;
import qr1.h0;
import qr1.q;
import qr1.v;
import qr1.w;
import qr1.x;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;
import sq2.u;
import uj2.b0;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H'¢\u0006\u0004\b\u0010\u0010\u0006J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020\bH§@¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\b2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\u001d\u0010\fJ+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\u001f\u0010\fJ\u0019\u0010\"\u001a\u00020!2\b\b\u0001\u0010 \u001a\u00020\bH'¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00022\b\b\u0001\u0010 \u001a\u00020\b2\b\b\u0001\u0010$\u001a\u00020\bH'¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020!2\b\b\u0001\u0010\u0011\u001a\u00020\bH'¢\u0006\u0004\b(\u0010#J\u000f\u0010)\u001a\u00020!H'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H'¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+H'¢\u0006\u0004\b/\u0010.J9\u00104\u001a\u00020!2\b\b\u0001\u00100\u001a\u00020\b2\b\b\u0001\u00101\u001a\u00020\b2\b\b\u0001\u00102\u001a\u00020\b2\n\b\u0001\u00103\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u0002060+H'¢\u0006\u0004\b7\u0010.J\u000f\u00108\u001a\u00020!H'¢\u0006\u0004\b8\u0010*J/\u0010:\u001a\u00020!2\b\b\u0001\u00100\u001a\u00020\b2\b\b\u0001\u00109\u001a\u00020\b2\n\b\u0001\u00103\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020!2\b\b\u0001\u0010\u0011\u001a\u00020\bH'¢\u0006\u0004\b<\u0010#J/\u0010>\u001a\u00020!2\b\b\u0001\u0010=\u001a\u00020\b2\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020!2\b\b\u0001\u0010=\u001a\u00020\bH'¢\u0006\u0004\b@\u0010#J;\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00030\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010A\u001a\u00020\bH'¢\u0006\u0004\bC\u0010DJ\u001b\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0+H'¢\u0006\u0004\bG\u0010.J\u0019\u0010I\u001a\u00020!2\b\b\u0001\u0010H\u001a\u00020\bH'¢\u0006\u0004\bI\u0010#J\u001b\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0E0\u0002H'¢\u0006\u0004\bK\u0010\u0006J\u0019\u0010M\u001a\u00020!2\b\b\u0001\u0010L\u001a\u00020\bH'¢\u0006\u0004\bM\u0010#JT\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0E0\u00122\b\b\u0001\u0010N\u001a\u00020\b2\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010P\u001a\u00020\b2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010Q\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\bS\u0010TJ \u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u00122\b\b\u0001\u0010V\u001a\u00020UH§@¢\u0006\u0004\bX\u0010YJ \u0010[\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010Z\u001a\u00020UH§@¢\u0006\u0004\b[\u0010Yø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\\À\u0006\u0001"}, d2 = {"Lcr1/a;", "", "Luj2/b0;", "Ltt1/a;", "Lcom/pinterest/api/model/by0;", "B", "()Luj2/b0;", "", "", "params", "Lcom/pinterest/api/model/fy0;", "y", "(Ljava/util/Map;)Luj2/b0;", "Lqr1/d;", "l", "Ly02/a;", "m", "password", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lvd0/c;", "q", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "currentPassword", "newPassword", "newPasswordConfirm", "passcode", "recaptchaV3Token", "s", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "u", "Lqr1/x;", "n", "userOrEmail", "Luj2/b;", "j", "(Ljava/lang/String;)Luj2/b;", "type", "Lqr1/h0;", "A", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "f", "a", "()Luj2/b;", "Luj2/q;", "Lqr1/v;", "d", "()Luj2/q;", "v", "verifiedPassword", "phoneNumber", "countryPhoneCode", "verifiedEmail", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "Lqr1/w;", "r", "h", "verificationCode", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "o", "handlerPath", "x", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b;", "C", "fields", "Lqr1/q;", "c", "(Ljava/util/Map;Ljava/lang/String;)Luj2/b0;", "", "Lqr1/a0;", "g", "userIdPath", "z", "Lqr1/o;", "p", "sessionId", "w", "query", "searchType", "pageSize", "referrerSource", "Lcom/pinterest/api/model/wy0;", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "Lqr1/b0;", "request", "Lqr1/c0;", "b", "(Lqr1/b0;Lbl2/c;)Ljava/lang/Object;", "qrToken", "k", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface a {
    @o("users/forgot_password/")
    @NotNull
    @sq2.e
    b0<h0> A(@sq2.c("username_or_email") @NotNull String userOrEmail, @sq2.c("type") @NotNull String type);

    @o("business/unlink/initiate/")
    @NotNull
    b0<tt1.a<by0>> B();

    @sq2.b("connect/{handler}")
    @NotNull
    uj2.b C(@s(encoded = true, value = "handler") @NotNull String handlerPath);

    @p("logout/")
    @NotNull
    uj2.b a();

    @p("qr_auth/")
    Object b(@NotNull @sq2.a qr1.b0 b0Var, @NotNull bl2.c<? super NetworkResponse<c0>> cVar);

    @o("connect/instagram/")
    @NotNull
    b0<tt1.a<q>> c(@NotNull @u Map<String, String> params, @t("fields") @NotNull String fields);

    @sq2.f("users/settings/mfa/backup/")
    @NotNull
    uj2.q<v> d();

    @o("users/settings/mfa/")
    @NotNull
    @sq2.e
    uj2.b e(@sq2.c("password") @NotNull String verifiedPassword, @sq2.c("number") @NotNull String phoneNumber, @sq2.c("country") @NotNull String countryPhoneCode, @sq2.c("email_input") String verifiedEmail);

    @o("users/password/verify/")
    @NotNull
    @sq2.e
    uj2.b f(@sq2.c("password") @NotNull String password);

    @sq2.f("/v3/users/privacy_data_settings/?platform=mobile")
    @NotNull
    uj2.q<List<a0>> g();

    @o("users/settings/mfa/resend/")
    @NotNull
    uj2.b h();

    @sq2.f("/v3/search/users/")
    Object i(@t("query") @NotNull String str, @t("search_type") String str2, @t("page_size") @NotNull String str3, @t("fields") String str4, @t("rs") String str5, @NotNull bl2.c<? super NetworkResponse<? extends List<? extends wy0>>> cVar);

    @o("users/forgot_password/")
    @NotNull
    @sq2.e
    uj2.b j(@sq2.c("username_or_email") @NotNull String userOrEmail);

    @p("qr_auth/approve/")
    Object k(@NotNull @sq2.a qr1.b0 b0Var, @NotNull bl2.c<? super NetworkResponse<? extends vd0.c>> cVar);

    @o("business/unlink/")
    @NotNull
    @sq2.e
    b0<qr1.d> l(@sq2.d @NotNull Map<String, String> params);

    @sq2.f("users/third_party_tracking_settings/")
    @NotNull
    b0<y02.a> m();

    @sq2.f("users/password_reset/")
    @NotNull
    b0<x> n(@NotNull @u Map<String, String> params);

    @o("users/settings/mfa/disable/")
    @NotNull
    @sq2.e
    uj2.b o(@sq2.c("password") @NotNull String password);

    @sq2.f("/v3/sessions/")
    @NotNull
    b0<List<qr1.o>> p();

    @o("users/password_strength/")
    @sq2.e
    Object q(@sq2.c("password") @NotNull String str, @NotNull bl2.c<? super NetworkResponse<? extends vd0.c>> cVar);

    @sq2.f("/v3/users/settings/mfa/eligibility/")
    @NotNull
    uj2.q<w> r();

    @o("users/password/")
    @NotNull
    @sq2.e
    b0<qr1.d> s(@sq2.c("old") String currentPassword, @sq2.c("new") @NotNull String newPassword, @sq2.c("new_confirm") @NotNull String newPasswordConfirm, @sq2.c("passcode") String passcode, @sq2.c("recaptcha_v3_token") String recaptchaV3Token);

    @o("users/settings/mfa/verify/")
    @NotNull
    @sq2.e
    uj2.b t(@sq2.c("password") @NotNull String verifiedPassword, @sq2.c("token") @NotNull String verificationCode, @sq2.c("email_input") String verifiedEmail);

    @o("users/password_reset/")
    @NotNull
    @sq2.e
    b0<qr1.d> u(@sq2.d @NotNull Map<String, String> params);

    @o("users/settings/mfa/backup/")
    @NotNull
    uj2.q<v> v();

    @sq2.b("/v3/sessions/{sessionId}/")
    @NotNull
    uj2.b w(@s("sessionId") @NotNull String sessionId);

    @p("connect/{handler}")
    @NotNull
    uj2.b x(@s(encoded = true, value = "handler") @NotNull String handlerPath, @NotNull @u Map<String, String> params);

    @o("business/unlink/verify/")
    @NotNull
    @sq2.e
    b0<tt1.a<fy0>> y(@sq2.d @NotNull Map<String, String> params);

    @o("/v3/users/{userId}/sars")
    @NotNull
    uj2.b z(@s(encoded = true, value = "userId") @NotNull String userIdPath);
}
