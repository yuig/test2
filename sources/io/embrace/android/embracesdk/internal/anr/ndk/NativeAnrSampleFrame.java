package io.embrace.android.embracesdk.internal.anr.ndk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe2.p;
import oe2.s;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/embrace/android/embracesdk/internal/anr/ndk/NativeAnrSampleFrame;", "", "", "programCounter", "soLoadAddr", "soName", "", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NativeAnrSampleFrame {

    /* renamed from: a, reason: collision with root package name */
    public final String f72915a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72916b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72917c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f72918d;

    public NativeAnrSampleFrame(@p(name = "program_counter") String str, @p(name = "so_load_addr") String str2, @p(name = "so_name") String str3, @p(name = "result") Integer num) {
        this.f72915a = str;
        this.f72916b = str2;
        this.f72917c = str3;
        this.f72918d = num;
    }

    public /* synthetic */ NativeAnrSampleFrame(String str, String str2, String str3, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : num);
    }
}
