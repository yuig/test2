package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1aSDKM19938$AFa1uSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private final long getMediationNetwork;
    private /* synthetic */ AFi1eSDK getRevenue;

    public AFi1aSDKM19938$AFa1uSDK(AFi1eSDK aFi1eSDK, long j13) {
        this.getRevenue = aFi1eSDK;
        this.getMediationNetwork = j13;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NotNull Task<IntegrityTokenResponse> task) {
        Object invoke;
        String str;
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            str = task.getResult().token();
            invoke = null;
        } else {
            try {
                Object[] objArr = {this.getRevenue, task.getException()};
                Map map = AFi1dSDK.registerClient;
                Object obj = map.get(841957362);
                if (obj == null) {
                    obj = ((Class) AFi1dSDK.AFAdRevenueData((char) TextUtils.getTrimmedLength(""), ViewConfiguration.getEdgeSlop() >> 16, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37)).getMethod("AFAdRevenueData", (Class) AFi1dSDK.AFAdRevenueData((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getTouchSlop() >> 8, ImageFormat.getBitsPerPixel(0) + 38), Exception.class);
                    map.put(841957362, obj);
                }
                invoke = ((Method) obj).invoke(null, objArr);
                str = null;
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause == null) {
                    throw th3;
                }
                throw cause;
            }
        }
        Object[] objArr2 = {this.getRevenue, Long.valueOf(this.getMediationNetwork), str, invoke};
        Map map2 = AFi1dSDK.registerClient;
        Object obj2 = map2.get(-207007489);
        if (obj2 == null) {
            obj2 = ((Class) AFi1dSDK.AFAdRevenueData((char) (ImageFormat.getBitsPerPixel(0) + 1), ViewConfiguration.getTapTimeout() >> 16, 36 - ((byte) KeyEvent.getModifierMetaStateMask()))).getMethod("getMonetizationNetwork", (Class) AFi1dSDK.AFAdRevenueData((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), '0' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 37), Long.TYPE, String.class, String.class);
            map2.put(-207007489, obj2);
        }
        ((Method) obj2).invoke(null, objArr2);
        Object[] objArr3 = {this.getRevenue};
        Object obj3 = map2.get(1735213218);
        if (obj3 == null) {
            obj3 = ((Class) AFi1dSDK.AFAdRevenueData((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1) - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 38)).getMethod("getMediationNetwork", (Class) AFi1dSDK.AFAdRevenueData((char) Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0') + 1, AndroidCharacter.getMirror('0') - 11));
            map2.put(1735213218, obj3);
        }
        ((CountDownLatch) ((Method) obj3).invoke(null, objArr3)).countDown();
    }
}
