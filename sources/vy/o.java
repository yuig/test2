package vy;

import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import sq2.q;
import sq2.s;
import sq2.u;
import uj2.b0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016JÙ\u0001\u0010*\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\r2\b\b\u0001\u0010\u001d\u001a\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010 \u001a\u00020\r2\b\b\u0001\u0010!\u001a\u00020\r2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010#\u001a\u00020\r2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010'\u001a\u00020\r2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b*\u0010+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lvy/o;", "", "", "event", "", "params", "Luj2/b;", "f", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b;", "data", "c", "a", "(Ljava/util/Map;)Luj2/b;", "Lokhttp3/RequestBody;", "payload", "b", "(Lokhttp3/RequestBody;)Luj2/b;", "requestHeaders", "Lokhttp3/MultipartBody$Part;", "Luj2/b0;", "Lvd0/c;", "d", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)Luj2/b0;", "title", "description", "platform", "branch", "gitCommit", "buildUser", "buildNumber", "appId", "deviceModel", "osVersion", "activatedExperiments", "viewType", "username", "bugType", "appVersion", "project", "longRequest", "screenshot", "logs", "e", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)Luj2/b;", "impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface o {
    @sq2.o("v3/callback/post_install/")
    @NotNull
    @sq2.e
    uj2.b a(@sq2.d @NotNull Map<String, String> params);

    @sq2.o("v4/log/mobile_perf/")
    @NotNull
    uj2.b b(@NotNull @sq2.a RequestBody payload);

    @sq2.o("v3/callback/track_funnel/{event}/")
    @NotNull
    @sq2.e
    uj2.b c(@s("event") @NotNull String event, @sq2.d @NotNull Map<String, String> data);

    @sq2.l
    @sq2.o("log/")
    @NotNull
    b0<vd0.c> d(@sq2.j @NotNull Map<String, String> requestHeaders, @NotNull @q MultipartBody.Part payload);

    @sq2.l
    @sq2.o("v3/error/report/")
    @NotNull
    uj2.b e(@NotNull @q("title") RequestBody title, @NotNull @q("description") RequestBody description, @NotNull @q("platform") RequestBody platform, @NotNull @q("branch") RequestBody branch, @NotNull @q("git_commit") RequestBody gitCommit, @NotNull @q("build_user") RequestBody buildUser, @NotNull @q("build_number") RequestBody buildNumber, @NotNull @q("app_id") RequestBody appId, @NotNull @q("device_model") RequestBody deviceModel, @NotNull @q("os_version") RequestBody osVersion, @NotNull @q("activated_experiments") RequestBody activatedExperiments, @q("url") RequestBody viewType, @NotNull @q("username") RequestBody username, @q("user_impact") RequestBody bugType, @q("app_version") RequestBody appVersion, @q("project") RequestBody project, @NotNull @q("long_request_no_retry") RequestBody longRequest, @q MultipartBody.Part screenshot, @q MultipartBody.Part logs);

    @sq2.o("v3/register/track_action/{event}/")
    @NotNull
    uj2.b f(@s("event") @NotNull String event, @NotNull @u Map<String, String> params);
}
