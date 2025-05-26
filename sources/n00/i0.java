package n00;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final xk2.v f88779a = xk2.m.b(u.f88792k);

    public static final void a(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        apiFieldsMap.e("pin.videos()");
        b(apiFieldsMap);
    }

    public static final void b(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        apiFieldsMap.e("video.id");
        apiFieldsMap.e(((Boolean) f88779a.getValue()).booleanValue() ? "video.video_list[V_HLSV3_MOBILE, V_DASH_HEVC, V_HEVC_MP4_T1_V2, V_HEVC_MP4_T2_V2, V_HEVC_MP4_T3_V2, V_HEVC_MP4_T4_V2, V_HEVC_MP4_T5_V2]" : "video.video_list[V_HLSV3_MOBILE, V_DASH_HEVC]");
        apiFieldsMap.e("video.duration");
    }
}
