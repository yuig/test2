package io.embrace.android.embracesdk.internal.config.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe2.p;
import oe2.s;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/AppExitInfoConfig;", "", "", "appExitInfoTracesLimit", "", "pctAeiCaptureEnabled", "aeiMaxNum", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AppExitInfoConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f72991a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f72992b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f72993c;

    public AppExitInfoConfig(@p(name = "app_exit_info_traces_limit") Integer num, @p(name = "pct_aei_enabled_v2") Float f13, @p(name = "aei_max_num") Integer num2) {
        this.f72991a = num;
        this.f72992b = f13;
        this.f72993c = num2;
    }

    public /* synthetic */ AppExitInfoConfig(Integer num, Float f13, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : f13, (i13 & 4) != 0 ? null : num2);
    }
}
