package io.embrace.android.embracesdk.internal.anr.ndk;

import io.embrace.android.embracesdk.internal.payload.NativeThreadAnrSample;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0096 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0096 ¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/embrace/android/embracesdk/internal/anr/ndk/NativeThreadSamplerNdkDelegate;", "", "is32Bit", "setupNativeThreadSampler", "(Z)Z", "monitorCurrentThread", "()Z", "", "unwinderOrdinal", "", "intervalMs", "", "startSampling", "(IJ)V", "", "Lio/embrace/android/embracesdk/internal/payload/NativeThreadAnrSample;", "finishSampling", "()Ljava/util/List;", "<init>", "()V", "embrace-android-features_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NativeThreadSamplerNdkDelegate {
    public native List<NativeThreadAnrSample> finishSampling();

    public native boolean monitorCurrentThread();

    public native boolean setupNativeThreadSampler(boolean is32Bit);

    public native void startSampling(int unwinderOrdinal, long intervalMs);
}
