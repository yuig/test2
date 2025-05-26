package a;

import ads_mobile_sdk.gk0;
import ads_mobile_sdk.nk0;
import ads_mobile_sdk.pk0;
import ads_mobile_sdk.yx0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hf {
    public static ad a(List nativeAdTypes, List customFormatIds, vi.a aVar, Integer num) {
        Intrinsics.checkNotNullParameter(nativeAdTypes, "nativeAdTypes");
        Intrinsics.checkNotNullParameter(customFormatIds, "customFormatIds");
        if (nativeAdTypes.isEmpty()) {
            return new nk0("Native ad types cannot be empty.", yx0.f14444b);
        }
        bj.c cVar = bj.c.CUSTOM_NATIVE;
        if (nativeAdTypes.contains(cVar) && customFormatIds.isEmpty()) {
            return new nk0("When requesting custom native ads, you must set at least one custom format ID.", yx0.f14444b);
        }
        bj.c cVar2 = bj.c.BANNER;
        if (nativeAdTypes.contains(cVar2) && nativeAdTypes.size() == 1) {
            return new nk0("A native ad request for banner ads only is not allowed. Suggested action: Use BannerAd to request banner ads.", yx0.f14444b);
        }
        if (nativeAdTypes.contains(cVar2) && aVar == null) {
            return new nk0("When requesting a banner ad, you must set at least one AdSize. Suggested action: Call NativeRequest.setAdSizes() with at least one ad size.", yx0.f14444b);
        }
        if (num != null && num.intValue() < 1) {
            return new nk0("Number of ads requested must be greater than 0.", yx0.f14444b);
        }
        if ((!customFormatIds.isEmpty()) && !nativeAdTypes.contains(cVar)) {
            gk0.d("Custom native ad format IDs were provided, but custom native ads were not requested.", null);
        }
        if (aVar != null && !nativeAdTypes.contains(cVar2)) {
            gk0.d("AdSize was provided, but banner ads were not requested. Suggested action: Update NativeRequest.nativeAdTypes to add NativeAdType.BANNER.", null);
        }
        return new pk0(Unit.f80348a);
    }
}
